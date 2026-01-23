package sprig.graphics;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.work.BackoffPolicy;
import androidx.work.Data;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.plaid.internal.EnumC7081g;
import com.robinhood.utils.extensions.ResourceTypes;
import com.singular.sdk.internal.Constants;
import com.userleap.internal.sessionreplay.RecorderLifecycleObserver;
import com.userleap.internal.sessionreplay.RedactorsKt;
import com.userleap.internal.sessionreplay.ReplayEncoderWorker;
import com.userleap.internal.sessionreplay.UploadWorker;
import com.userleap.internal.sessionreplay.ViewRedactor;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.CoroutineScope3;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Job6;
import kotlinx.coroutines.JobKt;
import org.json.JSONException;
import org.json.JSONObject;
import sprig.graphics.C48999g;
import sprig.graphics.C49000h;
import sprig.p549g.C49029a;

@Metadata(m3635d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u008a\u00012\u00020\u0001:\u0004\r\u000438B9\u0012\n\b\u0002\u0010\u0087\u0001\u001a\u00030\u0086\u0001\u0012\b\b\u0002\u00100\u001a\u00020\u001a\u0012\b\b\u0002\u00101\u001a\u00020\u001a\u0012\u000e\b\u0002\u00105\u001a\b\u0012\u0004\u0012\u0002020\u0012¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0002H\u0002J\u001b\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000fJ\u0013\u0010\r\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0010J\u0012\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00110\u0012*\u00020\u0011H\u0002J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00180\u00122\u0006\u0010\u0017\u001a\u00020\u0011H\u0002J(\u0010\r\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0002J\u001c\u0010\r\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002J\u001c\u0010\r\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002J8\u0010\r\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u001e\u0010!\u001a\u001a\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0012\u0012\u0004\u0012\u00020\u00050 H\u0002J\u0006\u0010\"\u001a\u00020\u0005J^\u0010\r\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2>\u0010)\u001a:\u0012\u0013\u0012\u00110\f¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020'0\u0012¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b((\u0012\u0006\u0012\u0004\u0018\u00010\u00050 J\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010+\u001a\u00020*J\u000f\u0010,\u001a\u00020\u0005H\u0000¢\u0006\u0004\b,\u0010-J\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010(\u001a\u00020'J\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001eJ'\u0010\r\u001a\u00020\u00052\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0000¢\u0006\u0004\b\r\u0010.R\u0014\u00100\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010/R\u0014\u00101\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010/R\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001c\u0010:\u001a\b\u0012\u0004\u0012\u000207068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R(\u0010B\u001a\b\u0012\u0004\u0012\u00020?068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0006\u00109\u001a\u0004\b\r\u0010@\"\u0004\b\r\u0010AR\u001e\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u00109R\"\u0010H\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010D\u001a\u0004\bE\u0010F\"\u0004\b3\u0010GR\u0018\u0010K\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010JR\"\u0010R\u001a\u00020L8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\b\r\u0010QR\u0018\u0010T\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010JR\u0014\u0010X\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010Z\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010WR\u0014\u0010\\\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010WR\u0014\u0010^\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010WR\u0014\u0010b\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\"\u0010h\u001a\u00020c8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\b3\u0010f\"\u0004\b\r\u0010gR\u0016\u0010j\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010DR\u0016\u0010l\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010DR\u0016\u0010p\u001a\u00020m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010t\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010x\u001a\u00020u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u001a\u0010{\u001a\b\u0012\u0004\u0012\u00020'0y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u00104R(\u0010\u007f\u001a\u0004\u0018\u0001072\b\u0010|\u001a\u0004\u0018\u0001078@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b<\u0010}\"\u0004\b\r\u0010~R+\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00112\b\u0010|\u001a\u0004\u0018\u00010\u00118F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b8\u0010\u0080\u0001\"\u0005\b3\u0010\u0081\u0001R\u0016\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0083\u00018F¢\u0006\u0007\u001a\u0005\b\u0004\u0010\u0084\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u008b\u0001"}, m3636d2 = {"Lsprig/e/n;", "", "", "lookBackSeconds", "b", "", "f", "g", "", "path", "Lorg/json/JSONObject;", "generateUrlPayload", "Ljava/util/UUID;", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "olderThan", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/view/View;", "", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/graphics/Canvas;", "canvas", "view", "Landroid/graphics/Rect;", "maskingRects", "", ResourceTypes.COLOR, "Landroid/graphics/Point;", "touchPoint", "Lsprig/e/n$d;", "swipe", "Lkotlin/Function2;", "bitmapCallback", Constants.RequestParamsKeys.PACKAGE_NAME_KEY, "lookAheadSeconds", "Lkotlin/ParameterName;", "name", "workId", "Lsprig/e/n$b;", "eventDigest", "enqueuedWorkHandler", "Lsprig/e/b;", "reason", "h", "()V", "(Landroid/graphics/Point;Lsprig/e/n$d;)V", "I", "framesPerSecond", "jpegQuality", "Lcom/userleap/internal/sessionreplay/ViewRedactor;", "c", "Ljava/util/List;", "redactors", "Ljava/lang/ref/WeakReference;", "Lsprig/c/h;", "d", "Ljava/lang/ref/WeakReference;", "_webView", "Landroid/os/Handler;", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "Landroid/os/Handler;", "handler", "Landroidx/fragment/app/FragmentActivity;", "()Ljava/lang/ref/WeakReference;", "(Ljava/lang/ref/WeakReference;)V", "activity", "_rootView", "J", "getReplayWindowSize", "()J", "(J)V", "replayWindowSize", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/Job;", "currentRecording", "", "j", "Z", "getRecording$userleap_release", "()Z", "(Z)V", "recording", Constants.RequestParamsKeys.IDENTIFIER_KEYSPACE_KEY, "copyFileAndUploadJob", "Landroid/graphics/Paint;", "l", "Landroid/graphics/Paint;", "blurPaint", "m", "touchPaint", Constants.RequestParamsKeys.APP_NAME_KEY, "strokePaint", "o", "swipePaint", "Lkotlinx/coroutines/CoroutineScope;", Constants.RequestParamsKeys.PLATFORM_KEY, "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lsprig/e/f;", "q", "Lsprig/e/f;", "()Lsprig/e/f;", "(Lsprig/e/f;)V", "fileManager", Constants.REVENUE_AMOUNT_KEY, "backgroundTimestamp", Constants.RequestParamsKeys.SESSION_ID_KEY, "pauseTime", "Lcom/userleap/internal/sessionreplay/RecorderLifecycleObserver;", "t", "Lcom/userleap/internal/sessionreplay/RecorderLifecycleObserver;", "lifecycleObserver", "Lsprig/e/l;", Constants.RequestParamsKeys.IDENTIFIER_UNIQUE_ID_KEY, "Lsprig/e/l;", "metrics", "Lsprig/g/a;", "v", "Lsprig/g/a;", "logger", "", "w", "touchEvents", "value", "()Lsprig/c/h;", "(Lsprig/c/h;)V", "webView", "()Landroid/view/View;", "(Landroid/view/View;)V", "rootView", "Landroid/content/Context;", "()Landroid/content/Context;", "context", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;IILjava/util/List;)V", "x", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
@SourceDebugExtension
/* renamed from: sprig.e.n */
/* loaded from: classes28.dex */
public final class C49022n {

    /* renamed from: y */
    private static final List<C49025q> f8386y = CollectionsKt.listOf(RedactorsKt.m3206a());

    /* renamed from: a, reason: from kotlin metadata */
    private final int framesPerSecond;

    /* renamed from: b, reason: from kotlin metadata */
    private final int jpegQuality;

    /* renamed from: c, reason: from kotlin metadata */
    private final List<ViewRedactor> redactors;

    /* renamed from: d, reason: from kotlin metadata */
    private WeakReference<C49000h> _webView;

    /* renamed from: e, reason: from kotlin metadata */
    private final Handler handler;

    /* renamed from: f, reason: from kotlin metadata */
    public WeakReference<FragmentActivity> activity;

    /* renamed from: g, reason: from kotlin metadata */
    private WeakReference<View> _rootView;

    /* renamed from: h, reason: from kotlin metadata */
    private long replayWindowSize;

    /* renamed from: i, reason: from kotlin metadata */
    private Job currentRecording;

    /* renamed from: j, reason: from kotlin metadata */
    private boolean recording;

    /* renamed from: k, reason: from kotlin metadata */
    private Job copyFileAndUploadJob;

    /* renamed from: l, reason: from kotlin metadata */
    private final Paint blurPaint;

    /* renamed from: m, reason: from kotlin metadata */
    private final Paint touchPaint;

    /* renamed from: n, reason: from kotlin metadata */
    private final Paint strokePaint;

    /* renamed from: o, reason: from kotlin metadata */
    private final Paint swipePaint;

    /* renamed from: p, reason: from kotlin metadata */
    private final CoroutineScope coroutineScope;

    /* renamed from: q, reason: from kotlin metadata */
    public C49014f fileManager;

    /* renamed from: r, reason: from kotlin metadata */
    private long backgroundTimestamp;

    /* renamed from: s, reason: from kotlin metadata */
    private long pauseTime;

    /* renamed from: t, reason: from kotlin metadata */
    private RecorderLifecycleObserver lifecycleObserver;

    /* renamed from: u, reason: from kotlin metadata */
    private final C49020l metrics;

    /* renamed from: v, reason: from kotlin metadata */
    private C49029a logger;

    /* renamed from: w, reason: from kotlin metadata */
    private final List<EventDigest> touchEvents;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lsprig/e/n$c;", "", "<init>", "(Ljava/lang/String;I)V", "TOUCH", "SWIPE", "TRACK_EVENT", "SHOW_SURVEY", "SUBMIT_SURVEY", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
    /* renamed from: sprig.e.n$c */
    public static final class c {
        public static final c TOUCH = new d("TOUCH", 0);
        public static final c SWIPE = new C50837c("SWIPE", 1);
        public static final c TRACK_EVENT = new e("TRACK_EVENT", 2);
        public static final c SHOW_SURVEY = new a("SHOW_SURVEY", 3);
        public static final c SUBMIT_SURVEY = new b("SUBMIT_SURVEY", 4);

        /* renamed from: a */
        private static final /* synthetic */ c[] f8414a = m4257a();

        @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m3636d2 = {"Lsprig/e/n$c$a;", "Lsprig/e/n$c;", "", "toString", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
        /* renamed from: sprig.e.n$c$a */
        static final class a extends c {
            a(String str, int i) {
                super(str, i, null);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Sprig_ShowSurvey";
            }
        }

        @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m3636d2 = {"Lsprig/e/n$c$b;", "Lsprig/e/n$c;", "", "toString", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
        /* renamed from: sprig.e.n$c$b */
        static final class b extends c {
            b(String str, int i) {
                super(str, i, null);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Sprig_SubmitSurvey";
            }
        }

        @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m3636d2 = {"Lsprig/e/n$c$c;", "Lsprig/e/n$c;", "", "toString", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
        /* renamed from: sprig.e.n$c$c, reason: collision with other inner class name */
        static final class C50837c extends c {
            C50837c(String str, int i) {
                super(str, i, null);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Sprig_Swipe";
            }
        }

        @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m3636d2 = {"Lsprig/e/n$c$d;", "Lsprig/e/n$c;", "", "toString", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
        /* renamed from: sprig.e.n$c$d */
        static final class d extends c {
            d(String str, int i) {
                super(str, i, null);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Sprig_Touch";
            }
        }

        @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m3636d2 = {"Lsprig/e/n$c$e;", "Lsprig/e/n$c;", "", "toString", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
        /* renamed from: sprig.e.n$c$e */
        static final class e extends c {
            e(String str, int i) {
                super(str, i, null);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Sprig_TrackEvent";
            }
        }

        private c(String str, int i) {
        }

        public /* synthetic */ c(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        /* renamed from: a */
        private static final /* synthetic */ c[] m4257a() {
            return new c[]{TOUCH, SWIPE, TRACK_EVENT, SHOW_SURVEY, SUBMIT_SURVEY};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f8414a.clone();
        }
    }

    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\n\u0010\r¨\u0006\u0010"}, m3636d2 = {"Lsprig/e/n$d;", "", "", "toString", "", "hashCode", "other", "", "equals", "Landroid/graphics/Point;", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "Landroid/graphics/Point;", "b", "()Landroid/graphics/Point;", "start", "end", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
    /* renamed from: sprig.e.n$d, reason: from toString */
    public static final /* data */ class SwipeData {

        /* renamed from: a, reason: from kotlin metadata and from toString */
        private final Point start;

        /* renamed from: b, reason: from kotlin metadata and from toString */
        private final Point end;

        /* renamed from: a, reason: from getter */
        public final Point getEnd() {
            return this.end;
        }

        /* renamed from: b, reason: from getter */
        public final Point getStart() {
            return this.start;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SwipeData)) {
                return false;
            }
            SwipeData swipeData = (SwipeData) other;
            return Intrinsics.areEqual(this.start, swipeData.start) && Intrinsics.areEqual(this.end, swipeData.end);
        }

        public int hashCode() {
            return (this.start.hashCode() * 31) + this.end.hashCode();
        }

        public String toString() {
            return "SwipeData(start=" + this.start + ", end=" + this.end + ')';
        }
    }

    @Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m3636d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m3637k = 3, m3638mv = {1, 8, 0})
    @DebugMetadata(m3644c = "com.userleap.internal.sessionreplay.SessionRecorder$cancelRecording$1", m3645f = "SessionRecorder.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: sprig.e.n$e */
    static final class e extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        int f8417a;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C49022n.this.new e(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f8417a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ProcessLifecycleOwner.INSTANCE.get().getLifecycle().removeObserver(C49022n.this.lifecycleObserver);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m3636d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m3637k = 3, m3638mv = {1, 8, 0})
    @DebugMetadata(m3644c = "com.userleap.internal.sessionreplay.SessionRecorder$cancelRecording$2", m3645f = "SessionRecorder.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, 239}, m3647m = "invokeSuspend")
    /* renamed from: sprig.e.n$f */
    static final class f extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        int f8419a;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C49022n.this.new f(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
        
            if (r3.m4181a(r4, 0, r8) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            f fVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f8419a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C49022n.this.m4251h();
                Job job = C49022n.this.currentRecording;
                if (job != null) {
                    this.f8419a = 1;
                    if (JobKt.cancelAndJoin(job, this) == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    fVar = this;
                    C49022n.this.m4248c((View) null);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            C49014f c49014fM4246c = C49022n.this.m4246c();
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f8419a = 2;
            fVar = this;
        }
    }

    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m3636d2 = {"Landroid/graphics/Bitmap;", "<anonymous parameter 0>", "", "Landroid/graphics/Rect;", "maskingRects", "", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "(Landroid/graphics/Bitmap;Ljava/util/List;)V"}, m3637k = 3, m3638mv = {1, 8, 0})
    /* renamed from: sprig.e.n$g, reason: from Kotlin metadata */
    static final class Bitmap extends Lambda implements Function2<android.graphics.Bitmap, List<? extends Rect>, Unit> {

        /* renamed from: b */
        final /* synthetic */ android.graphics.Bitmap f8422b;

        /* renamed from: c */
        final /* synthetic */ Point f8423c;

        /* renamed from: d */
        final /* synthetic */ SwipeData f8424d;

        /* renamed from: e */
        final /* synthetic */ CountDownLatch f8425e;

        @Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m3636d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m3637k = 3, m3638mv = {1, 8, 0})
        @DebugMetadata(m3644c = "com.userleap.internal.sessionreplay.SessionRecorder$captureScreenshot$1$1$1$1$1$1", m3645f = "SessionRecorder.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: sprig.e.n$g$a */
        static final class a extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            int f8426a;

            /* renamed from: b */
            final /* synthetic */ android.graphics.Bitmap f8427b;

            /* renamed from: c */
            final /* synthetic */ C49022n f8428c;

            /* renamed from: d */
            final /* synthetic */ List<Rect> f8429d;

            /* renamed from: e */
            final /* synthetic */ Point f8430e;

            /* renamed from: f */
            final /* synthetic */ SwipeData f8431f;

            /* renamed from: g */
            final /* synthetic */ CountDownLatch f8432g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(android.graphics.Bitmap bitmap, C49022n c49022n, List<Rect> list, Point point, SwipeData swipeData, CountDownLatch countDownLatch, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f8427b = bitmap;
                this.f8428c = c49022n;
                this.f8429d = list;
                this.f8430e = point;
                this.f8431f = swipeData;
                this.f8432g = countDownLatch;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f8427b, this.f8428c, this.f8429d, this.f8430e, this.f8431f, this.f8432g, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) throws JSONException {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f8426a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Canvas canvas = new Canvas(this.f8427b);
                C49022n.m4215a(this.f8428c, canvas, this.f8429d, 0, 4, null);
                this.f8428c.m4207a(canvas, this.f8430e);
                this.f8428c.m4209a(canvas, this.f8431f);
                this.f8428c.m4206a(canvas);
                this.f8432g.countDown();
                C49022n c49022n = this.f8428c;
                android.graphics.Bitmap bitmap = this.f8427b;
                Intrinsics.checkNotNullExpressionValue(bitmap, "bitmap");
                c49022n.m4224b(bitmap);
                C49022n c49022n2 = this.f8428c;
                android.graphics.Bitmap bitmap2 = this.f8427b;
                Intrinsics.checkNotNullExpressionValue(bitmap2, "bitmap");
                c49022n2.m4205a(bitmap2);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Bitmap(android.graphics.Bitmap bitmap, Point point, SwipeData swipeData, CountDownLatch countDownLatch) {
            super(2);
            this.f8422b = bitmap;
            this.f8423c = point;
            this.f8424d = swipeData;
            this.f8425e = countDownLatch;
        }

        /* renamed from: a */
        public final void m4262a(android.graphics.Bitmap bitmap, List<Rect> maskingRects) {
            Intrinsics.checkNotNullParameter(bitmap, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(maskingRects, "maskingRects");
            BuildersKt__Builders_commonKt.launch$default(C49022n.this.coroutineScope, null, null, new a(this.f8422b, C49022n.this, maskingRects, this.f8423c, this.f8424d, this.f8425e, null), 3, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(android.graphics.Bitmap bitmap, List<? extends Rect> list) {
            m4262a(bitmap, list);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m3635d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m3636d2 = {"Lsprig/e/n$b;", "it", "", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "(Lsprig/e/n$b;)Ljava/lang/Boolean;"}, m3637k = 3, m3638mv = {1, 8, 0})
    /* renamed from: sprig.e.n$h */
    static final class h extends Lambda implements Function1<EventDigest, Boolean> {

        /* renamed from: a */
        final /* synthetic */ long f8433a;

        /* renamed from: b */
        final /* synthetic */ long f8434b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(long j, long j2) {
            super(1);
            this.f8433a = j;
            this.f8434b = j2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(EventDigest it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.getTimestamp() < this.f8433a - this.f8434b);
        }
    }

    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    /* renamed from: sprig.e.n$i */
    /* synthetic */ class i extends FunctionReferenceImpl implements Function0<Unit> {
        i(Object obj) {
            super(0, obj, C49022n.class, "onBackground", "onBackground()V", 0);
        }

        /* renamed from: a */
        public final void m4265a() {
            ((C49022n) this.receiver).m4230f();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m4265a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    /* renamed from: sprig.e.n$j */
    /* synthetic */ class j extends FunctionReferenceImpl implements Function0<Unit> {
        j(Object obj) {
            super(0, obj, C49022n.class, "onForeground", "onForeground()V", 0);
        }

        /* renamed from: a */
        public final void m4266a() {
            ((C49022n) this.receiver).m4232g();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m4266a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(m3635d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m3636d2 = {"", "thresholdMs", "", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "(I)V"}, m3637k = 3, m3638mv = {1, 8, 0})
    /* renamed from: sprig.e.n$k */
    static final class k extends Lambda implements Function1<Integer, Unit> {
        k() {
            super(1);
        }

        /* renamed from: a */
        public final void m4267a(int i) throws JSONException {
            C49029a.m4295a(C49022n.this.logger, "Recording taking too long, cancelling recording", null, "Metric threshold exceeded, threshold: " + i + "ms", null, null, null, 58, null);
            C49022n.this.m4240a(EnumC49010b.REPLAY_TIME_ELAPSED);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) throws JSONException {
            m4267a(num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m3636d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m3637k = 3, m3638mv = {1, 8, 0})
    @DebugMetadata(m3644c = "com.userleap.internal.sessionreplay.SessionRecorder$onBackground$1", m3645f = "SessionRecorder.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_SHIELD_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: sprig.e.n$l */
    static final class l extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        int f8436a;

        l(Continuation<? super l> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C49022n.this.new l(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f8436a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C49022n.this.backgroundTimestamp = System.currentTimeMillis();
                C49022n.this.m4244a(false);
                Job job = C49022n.this.currentRecording;
                if (job != null) {
                    this.f8436a = 1;
                    if (JobKt.cancelAndJoin(job, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            C49022n.this.currentRecording = null;
            return Unit.INSTANCE;
        }
    }

    @Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m3636d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m3637k = 3, m3638mv = {1, 8, 0})
    @DebugMetadata(m3644c = "com.userleap.internal.sessionreplay.SessionRecorder$onTouch$1", m3645f = "SessionRecorder.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: sprig.e.n$m */
    static final class m extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        int f8438a;

        /* renamed from: c */
        final /* synthetic */ Point f8440c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(Point point, Continuation<? super m> continuation) {
            super(2, continuation);
            this.f8440c = point;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C49022n.this.new m(this.f8440c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws JSONException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f8438a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            C49022n.m4217a(C49022n.this, this.f8440c, (SwipeData) null, 2, (Object) null);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m3636d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m3637k = 3, m3638mv = {1, 8, 0})
    @DebugMetadata(m3644c = "com.userleap.internal.sessionreplay.SessionRecorder$prepareRecording$1", m3645f = "SessionRecorder.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: sprig.e.n$n */
    static final class n extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        long f8441a;

        /* renamed from: b */
        long f8442b;

        /* renamed from: c */
        int f8443c;

        /* renamed from: d */
        private /* synthetic */ Object f8444d;

        /* renamed from: f */
        final /* synthetic */ long f8446f;

        /* renamed from: g */
        final /* synthetic */ long f8447g;

        /* renamed from: h */
        final /* synthetic */ JSONObject f8448h;

        /* renamed from: i */
        final /* synthetic */ Function2<UUID, List<EventDigest>, Unit> f8449i;

        @Metadata(m3635d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m3636d2 = {"", "result", "", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "(Ljava/lang/String;)V"}, m3637k = 3, m3638mv = {1, 8, 0})
        @SourceDebugExtension
        /* renamed from: sprig.e.n$n$a */
        static final class a extends Lambda implements Function1<String, Unit> {

            /* renamed from: a */
            final /* synthetic */ C49022n f8450a;

            /* renamed from: b */
            final /* synthetic */ CoroutineScope f8451b;

            /* renamed from: c */
            final /* synthetic */ long f8452c;

            /* renamed from: d */
            final /* synthetic */ long f8453d;

            /* renamed from: e */
            final /* synthetic */ JSONObject f8454e;

            /* renamed from: f */
            final /* synthetic */ Function2<UUID, List<EventDigest>, Unit> f8455f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(C49022n c49022n, CoroutineScope coroutineScope, long j, long j2, JSONObject jSONObject, Function2<? super UUID, ? super List<EventDigest>, Unit> function2) {
                super(1);
                this.f8450a = c49022n;
                this.f8451b = coroutineScope;
                this.f8452c = j;
                this.f8453d = j2;
                this.f8454e = jSONObject;
                this.f8455f = function2;
            }

            /* renamed from: a */
            public final void m4271a(String str) throws JSONException {
                Object objM28550constructorimpl;
                C48999g.f8243a.m4099a(EnumC49010b.RECORDING_COMPLETE);
                if (str != null) {
                    C49022n c49022n = this.f8450a;
                    long j = this.f8452c;
                    long j2 = this.f8453d;
                    JSONObject jSONObject = this.f8454e;
                    Function2<UUID, List<EventDigest>, Unit> function2 = this.f8455f;
                    List list = c49022n.touchEvents;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        long timestamp = ((EventDigest) obj).getTimestamp();
                        if (j <= timestamp && timestamp <= j2) {
                            arrayList.add(obj);
                        }
                    }
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        objM28550constructorimpl = Result.m28550constructorimpl(function2.invoke(c49022n.m4201a(str, jSONObject), arrayList));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                    }
                    Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                    if (thM28553exceptionOrNullimpl != null) {
                        C49029a.m4295a(c49022n.logger, "Error encoding files", null, "Error encoding files: " + thM28553exceptionOrNullimpl, ExceptionsKt.stackTraceToString(thM28553exceptionOrNullimpl), null, null, 50, null);
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) throws JSONException {
                m4271a(str);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        n(long j, long j2, JSONObject jSONObject, Function2<? super UUID, ? super List<EventDigest>, Unit> function2, Continuation<? super n> continuation) {
            super(2, continuation);
            this.f8446f = j;
            this.f8447g = j2;
            this.f8448h = jSONObject;
            this.f8449i = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            n nVar = C49022n.this.new n(this.f8446f, this.f8447g, this.f8448h, this.f8449i, continuation);
            nVar.f8444d = obj;
            return nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            long j;
            long j2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f8443c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.f8444d;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jM4221b = jCurrentTimeMillis - C49022n.this.m4221b(this.f8446f);
                long j3 = 1000;
                long jCoerceAtLeast = jCurrentTimeMillis + (RangesKt.coerceAtLeast(this.f8447g, 0L) * j3);
                long jCoerceAtLeast2 = RangesKt.coerceAtLeast(this.f8447g, 0L) * j3;
                this.f8444d = coroutineScope;
                this.f8441a = jM4221b;
                this.f8442b = jCoerceAtLeast;
                this.f8443c = 1;
                if (DelayKt.delay(jCoerceAtLeast2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                j = jCoerceAtLeast;
                j2 = jM4221b;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j4 = this.f8442b;
                long j5 = this.f8441a;
                coroutineScope = (CoroutineScope) this.f8444d;
                ResultKt.throwOnFailure(obj);
                j = j4;
                j2 = j5;
            }
            long j6 = j2;
            C49022n.this.m4246c().m4182a(j6, j, new a(C49022n.this, coroutineScope, j6, j, this.f8448h, this.f8449i));
            return Unit.INSTANCE;
        }
    }

    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.userleap.internal.sessionreplay.SessionRecorder", m3645f = "SessionRecorder.kt", m3646l = {344, 349, 350}, m3647m = "recordSession")
    /* renamed from: sprig.e.n$o */
    static final class o extends ContinuationImpl {

        /* renamed from: a */
        Object f8456a;

        /* renamed from: b */
        /* synthetic */ Object f8457b;

        /* renamed from: d */
        int f8459d;

        o(Continuation<? super o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.f8457b = obj;
            this.f8459d |= Integer.MIN_VALUE;
            return C49022n.this.m4198a(this);
        }
    }

    @Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m3636d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m3637k = 3, m3638mv = {1, 8, 0})
    @DebugMetadata(m3644c = "com.userleap.internal.sessionreplay.SessionRecorder$startRecording$1", m3645f = "SessionRecorder.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: sprig.e.n$p */
    static final class p extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        int f8460a;

        p(Continuation<? super p> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C49022n.this.new p(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f8460a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ProcessLifecycleOwner.INSTANCE.get().getLifecycle().addObserver(C49022n.this.lifecycleObserver);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m3636d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m3637k = 3, m3638mv = {1, 8, 0})
    @DebugMetadata(m3644c = "com.userleap.internal.sessionreplay.SessionRecorder$startRecording$2", m3645f = "SessionRecorder.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: sprig.e.n$q */
    static final class q extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        Object f8462a;

        /* renamed from: b */
        int f8463b;

        q(Continuation<? super q> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C49022n.this.new q(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0096, code lost:
        
            if (r1.m4198a(r14) != r0) goto L32;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws JSONException {
            C49022n c49022n;
            q qVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f8463b;
            int i2 = 2;
            CoroutineDispatcher coroutineDispatcher = null;
            Object[] objArr = 0;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (C49022n.this.m4245b() == null) {
                    C49029a.m4295a(C49022n.this.logger, "Cannot start recording session", null, "Context is null", null, null, null, 58, null);
                    C49022n.this.m4244a(false);
                }
                Context contextM4245b = C49022n.this.m4245b();
                if (contextM4245b == null) {
                    return Unit.INSTANCE;
                }
                C49022n c49022n2 = C49022n.this;
                if (c49022n2.fileManager == null) {
                    c49022n2.m4241a(new C49014f(contextM4245b, coroutineDispatcher, i2, objArr == true ? 1 : 0));
                }
                C49014f c49014fM4246c = C49022n.this.m4246c();
                C49014f c49014f = c49014fM4246c.m4180a() == null ? null : c49014fM4246c;
                if (c49014f != null) {
                    c49022n = C49022n.this;
                    c49022n.m4241a(c49014f);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    this.f8462a = c49022n;
                    this.f8463b = 1;
                    qVar = this;
                    if (C49014f.m4175a(c49014f, jCurrentTimeMillis, 0L, qVar, 2, null) != coroutine_suspended) {
                        qVar.f8462a = null;
                        qVar.f8463b = 2;
                    }
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            c49022n = (C49022n) this.f8462a;
            ResultKt.throwOnFailure(obj);
            qVar = this;
            qVar.f8462a = null;
            qVar.f8463b = 2;
        }
    }

    public C49022n() {
        this(null, 0, 0, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C49022n(CoroutineDispatcher dispatcher, int i2, int i3, List<? extends ViewRedactor> redactors) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(redactors, "redactors");
        this.framesPerSecond = i2;
        this.jpegQuality = i3;
        this.redactors = redactors;
        this._webView = new WeakReference<>(null);
        this.handler = new Handler(Looper.getMainLooper());
        this.replayWindowSize = 60L;
        Paint paint = new Paint();
        paint.setColor(-16777216);
        this.blurPaint = paint;
        Paint paint2 = new Paint();
        paint2.setColor(Color.rgb(250, EnumC7081g.SDK_ASSET_ICON_INCOMPLETE_VALUE, 51));
        this.touchPaint = paint2;
        Paint paint3 = new Paint();
        paint3.setColor(Color.rgb(EnumC7081g.f2779x59907a3d, EnumC7081g.SDK_ASSET_ICON_ARROW_UP_VALUE, 0));
        paint3.setStrokeWidth(2.0f);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        this.strokePaint = paint3;
        Paint paint4 = new Paint();
        paint4.setColor(Color.rgb(250, EnumC7081g.SDK_ASSET_ICON_INCOMPLETE_VALUE, 51));
        paint4.setStrokeWidth(8.0f);
        paint4.setStyle(style);
        this.swipePaint = paint4;
        this.coroutineScope = CoroutineScope2.CoroutineScope(dispatcher);
        this.lifecycleObserver = new RecorderLifecycleObserver(new i(this), new j(this));
        this.metrics = new C49020l(500, new k());
        this.logger = new C49029a();
        this.touchEvents = new ArrayList();
    }

    /* renamed from: h */
    public final void m4251h() {
        this.recording = false;
        this.pauseTime = 0L;
        this.backgroundTimestamp = 0L;
    }

    /* renamed from: i */
    public final void m4252i() {
        if (this.recording) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope3.INSTANCE, Dispatchers.getMain(), null, new p(null), 2, null);
        Job job = this.currentRecording;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        m4251h();
        this.recording = true;
        this.currentRecording = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new q(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public final void m4230f() {
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new l(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public final void m4232g() {
        if (this.backgroundTimestamp == 0) {
            return;
        }
        this.pauseTime += System.currentTimeMillis() - this.backgroundTimestamp;
        this.backgroundTimestamp = 0L;
        m4252i();
    }

    /* renamed from: c */
    public final void m4248c(View view) {
        WeakReference<View> weakReference;
        if (view != null) {
            weakReference = new WeakReference<>(view);
        } else {
            WeakReference<View> weakReference2 = this._rootView;
            if (weakReference2 != null) {
                weakReference2.clear();
            }
            weakReference = null;
        }
        this._rootView = weakReference;
    }

    /* renamed from: d */
    public final View m4249d() {
        WeakReference<View> weakReference = this._rootView;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: e */
    public final C49000h m4250e() {
        return this._webView.get();
    }

    /* renamed from: b */
    public final Context m4245b() {
        View viewM4249d = m4249d();
        if (viewM4249d != null) {
            return viewM4249d.getContext();
        }
        return null;
    }

    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\n\u0010\u0016R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0010\u0010\u0019¨\u0006\u001d"}, m3636d2 = {"Lsprig/e/n$b;", "", "", "toString", "", "hashCode", "other", "", "equals", "", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "J", "c", "()J", "timestamp", "Lsprig/e/n$c;", "b", "Lsprig/e/n$c;", "d", "()Lsprig/e/n$c;", "type", "Ljava/lang/String;", "()Ljava/lang/String;", "name", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "surveyId", "<init>", "(JLsprig/e/n$c;Ljava/lang/String;Ljava/lang/Integer;)V", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
    /* renamed from: sprig.e.n$b, reason: from toString */
    public static final /* data */ class EventDigest {

        /* renamed from: a, reason: from kotlin metadata and from toString */
        private final long timestamp;

        /* renamed from: b, reason: from kotlin metadata and from toString */
        private final c type;

        /* renamed from: c, reason: from kotlin metadata and from toString */
        private final String name;

        /* renamed from: d, reason: from kotlin metadata and from toString */
        private final Integer surveyId;

        public EventDigest(long j, c type2, String str, Integer num) {
            Intrinsics.checkNotNullParameter(type2, "type");
            this.timestamp = j;
            this.type = type2;
            this.name = str;
            this.surveyId = num;
        }

        /* renamed from: a, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: b, reason: from getter */
        public final Integer getSurveyId() {
            return this.surveyId;
        }

        /* renamed from: c, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: d, reason: from getter */
        public final c getType() {
            return this.type;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EventDigest)) {
                return false;
            }
            EventDigest eventDigest = (EventDigest) other;
            return this.timestamp == eventDigest.timestamp && this.type == eventDigest.type && Intrinsics.areEqual(this.name, eventDigest.name) && Intrinsics.areEqual(this.surveyId, eventDigest.surveyId);
        }

        public int hashCode() {
            int iHashCode = ((Long.hashCode(this.timestamp) * 31) + this.type.hashCode()) * 31;
            String str = this.name;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.surveyId;
            return iHashCode2 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            return "EventDigest(timestamp=" + this.timestamp + ", type=" + this.type + ", name=" + this.name + ", surveyId=" + this.surveyId + ')';
        }

        public /* synthetic */ EventDigest(long j, c cVar, String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, cVar, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : num);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final long m4221b(long lookBackSeconds) {
        return (RangesKt.coerceAtLeast(lookBackSeconds, 0L) * 1000) + this.pauseTime;
    }

    /* renamed from: c */
    public final void m4247c(long j2) {
        this.replayWindowSize = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final void m4224b(android.graphics.Bitmap bitmap) {
        if (bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            throw new IllegalStateException("Bitmap width or height is 0");
        }
    }

    /* renamed from: c */
    public final C49014f m4246c() {
        C49014f c49014f = this.fileManager;
        if (c49014f != null) {
            return c49014f;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fileManager");
        return null;
    }

    /* renamed from: b */
    private final List<Rect> m4222b(View view) {
        List<View> listM4200a = m4200a(view);
        ArrayList<View> arrayList = new ArrayList();
        for (Object obj : listM4200a) {
            View view2 = (View) obj;
            List<ViewRedactor> list = this.redactors;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((ViewRedactor) it.next()).shouldRedact(view2)) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (View view3 : arrayList) {
            int[] iArr = new int[2];
            view3.getLocationOnScreen(iArr);
            int i2 = iArr[0];
            arrayList2.add(new Rect(i2, iArr[1], view3.getWidth() + i2, iArr[1] + view3.getHeight()));
        }
        return arrayList2;
    }

    /* renamed from: a */
    public final void m4239a(C49000h c49000h) {
        this._webView = new WeakReference<>(c49000h);
    }

    /* renamed from: a */
    public final WeakReference<FragmentActivity> m4234a() {
        WeakReference<FragmentActivity> weakReference = this.activity;
        if (weakReference != null) {
            return weakReference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("activity");
        return null;
    }

    /* renamed from: a */
    public final void m4238a(WeakReference<FragmentActivity> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.activity = weakReference;
    }

    /* renamed from: a */
    public final void m4244a(boolean z) {
        this.recording = z;
    }

    /* renamed from: a */
    public final void m4241a(C49014f c49014f) {
        Intrinsics.checkNotNullParameter(c49014f, "<set-?>");
        this.fileManager = c49014f;
    }

    /* renamed from: a */
    public final void m4235a(long lookBackSeconds, long lookAheadSeconds, JSONObject generateUrlPayload, Function2<? super UUID, ? super List<EventDigest>, Unit> enqueuedWorkHandler) {
        Intrinsics.checkNotNullParameter(generateUrlPayload, "generateUrlPayload");
        Intrinsics.checkNotNullParameter(enqueuedWorkHandler, "enqueuedWorkHandler");
        this.copyFileAndUploadJob = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new n(lookBackSeconds, lookAheadSeconds, generateUrlPayload, enqueuedWorkHandler, null), 3, null);
    }

    /* renamed from: a */
    public final void m4240a(EnumC49010b reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope3.INSTANCE, Dispatchers.getMain(), null, new e(null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new f(null), 3, null);
        if (reason == EnumC49010b.LOW_MEMORY) {
            Job job = this.copyFileAndUploadJob;
            if (job != null) {
                Job6.cancel$default(job, reason.toString(), null, 2, null);
            }
            this.copyFileAndUploadJob = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final UUID m4201a(String path, JSONObject generateUrlPayload) throws Throwable {
        Context contextM4245b = m4245b();
        if (contextM4245b != null) {
            OneTimeWorkRequest.Builder builderAddTag = new OneTimeWorkRequest.Builder(ReplayEncoderWorker.class).addTag("ReplayEncoderWorker");
            Tuples2[] tuples2Arr = {Tuples4.m3642to("directory", path), Tuples4.m3642to("frame rate", Integer.valueOf(this.framesPerSecond))};
            Data.Builder builder = new Data.Builder();
            for (int i2 = 0; i2 < 2; i2++) {
                Tuples2 tuples2 = tuples2Arr[i2];
                builder.put((String) tuples2.getFirst(), tuples2.getSecond());
            }
            Data dataBuild = builder.build();
            Intrinsics.checkNotNullExpressionValue(dataBuild, "dataBuilder.build()");
            OneTimeWorkRequest oneTimeWorkRequestBuild = builderAddTag.setInputData(dataBuild).build();
            OneTimeWorkRequest.Builder builder2 = new OneTimeWorkRequest.Builder(UploadWorker.class);
            Tuples2[] tuples2Arr2 = {Tuples4.m3642to("upload URL", generateUrlPayload.toString()), Tuples4.m3642to("file name", path + File.separator + "recording.mp4"), Tuples4.m3642to("directory", path)};
            Data.Builder builder3 = new Data.Builder();
            for (int i3 = 0; i3 < 3; i3++) {
                Tuples2 tuples22 = tuples2Arr2[i3];
                builder3.put((String) tuples22.getFirst(), tuples22.getSecond());
            }
            Data dataBuild2 = builder3.build();
            Intrinsics.checkNotNullExpressionValue(dataBuild2, "dataBuilder.build()");
            OneTimeWorkRequest oneTimeWorkRequestBuild2 = builder2.setInputData(dataBuild2).setBackoffCriteria(BackoffPolicy.EXPONENTIAL, 1L, TimeUnit.MINUTES).build();
            WorkManager.getInstance(contextM4245b).beginWith(oneTimeWorkRequestBuild).then(oneTimeWorkRequestBuild2).enqueue();
            return oneTimeWorkRequestBuild2.getId();
        }
        throw new IllegalStateException("Context is null");
    }

    public /* synthetic */ C49022n(CoroutineDispatcher coroutineDispatcher, int i2, int i3, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? Dispatchers.getIO() : coroutineDispatcher, (i4 & 2) != 0 ? 2 : i2, (i4 & 4) != 0 ? 50 : i3, (i4 & 8) != 0 ? f8386y : list);
    }

    /* renamed from: a */
    public final void m4242a(EventDigest eventDigest) {
        Intrinsics.checkNotNullParameter(eventDigest, "eventDigest");
        this.touchEvents.add(eventDigest);
    }

    /* renamed from: a */
    public final void m4236a(Point touchPoint) {
        Intrinsics.checkNotNullParameter(touchPoint, "touchPoint");
        this.touchEvents.add(new EventDigest(System.currentTimeMillis(), c.TOUCH, null, null, 12, null));
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new m(touchPoint, null), 3, null);
    }

    /* renamed from: a */
    public final void m4243a(SwipeData swipe) {
        Intrinsics.checkNotNullParameter(swipe, "swipe");
        this.touchEvents.add(new EventDigest(System.currentTimeMillis(), c.SWIPE, null, null, 12, null));
    }

    /* renamed from: a */
    private final void m4204a(long olderThan) {
        CollectionsKt.removeAll((List) this.touchEvents, (Function1) new h(System.currentTimeMillis(), olderThan));
    }

    /* renamed from: a */
    private final Object m4197a(long j2, Continuation<? super Unit> continuation) {
        Object objM4181a = m4246c().m4181a(System.currentTimeMillis(), j2, continuation);
        return objM4181a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM4181a : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
    
        if (r2.m4198a(r0) != r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4198a(Continuation<? super Unit> continuation) throws JSONException {
        o oVar;
        C49022n c49022n;
        if (continuation instanceof o) {
            oVar = (o) continuation;
            int i2 = oVar.f8459d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oVar.f8459d = i2 - Integer.MIN_VALUE;
            } else {
                oVar = new o(continuation);
            }
        }
        Object obj = oVar.f8457b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oVar.f8459d;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.recording) {
                return Unit.INSTANCE;
            }
            long j2 = this.replayWindowSize;
            oVar.f8456a = this;
            oVar.f8459d = 1;
            if (m4197a(j2, oVar) != coroutine_suspended) {
                c49022n = this;
            }
            return coroutine_suspended;
        }
        if (i3 == 1) {
            c49022n = (C49022n) oVar.f8456a;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            c49022n = (C49022n) oVar.f8456a;
            ResultKt.throwOnFailure(obj);
            oVar.f8456a = null;
            oVar.f8459d = 3;
        }
        c49022n.m4204a(c49022n.replayWindowSize);
        m4217a(c49022n, (Point) null, (SwipeData) null, 3, (Object) null);
        long j3 = 1000 / c49022n.framesPerSecond;
        oVar.f8456a = c49022n;
        oVar.f8459d = 2;
        if (DelayKt.delay(j3, oVar) != coroutine_suspended) {
            oVar.f8456a = null;
            oVar.f8459d = 3;
        }
        return coroutine_suspended;
    }

    /* renamed from: a */
    private final List<View> m4200a(View view) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(view);
        while (!arrayList2.isEmpty()) {
            View view2 = (View) arrayList2.remove(0);
            arrayList.add(view2);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    Intrinsics.checkNotNullExpressionValue(childAt, "child.getChildAt(i)");
                    arrayList2.add(childAt);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static /* synthetic */ void m4217a(C49022n c49022n, Point point, SwipeData swipeData, int i2, Object obj) throws JSONException {
        if ((i2 & 1) != 0) {
            point = null;
        }
        if ((i2 & 2) != 0) {
            swipeData = null;
        }
        c49022n.m4237a(point, swipeData);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4237a(final Point touchPoint, final SwipeData swipe) throws JSONException {
        final C49022n c49022n;
        Object objM28550constructorimpl;
        Throwable thM28553exceptionOrNullimpl;
        final View viewM4249d;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (this.recording && (viewM4249d = m4249d()) != null) {
                final android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(viewM4249d.getWidth(), viewM4249d.getHeight(), Bitmap.Config.ARGB_8888);
                c49022n = this;
                try {
                    viewM4249d.post(new Runnable() { // from class: sprig.e.n$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() throws JSONException {
                            C49022n.m4218a(this.f$0, viewM4249d, bitmapCreateBitmap, touchPoint, swipe);
                        }
                    });
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    Result.Companion companion2 = Result.INSTANCE;
                    objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th2));
                    thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                    if (thM28553exceptionOrNullimpl == null) {
                    }
                }
            } else {
                c49022n = this;
            }
            objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
        } catch (Throwable th3) {
            th = th3;
            c49022n = this;
        }
        thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl == null) {
            C49029a c49029a = c49022n.logger;
            String message = thM28553exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            C49029a.m4295a(c49029a, "Error capturing screenshot", null, message, ExceptionsKt.stackTraceToString(thM28553exceptionOrNullimpl), null, null, 50, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m4218a(C49022n this_runCatching, View view, android.graphics.Bitmap bitmap, Point point, SwipeData swipeData) throws JSONException {
        Intrinsics.checkNotNullParameter(this_runCatching, "$this_runCatching");
        Intrinsics.checkNotNullParameter(view, "$view");
        C49020l c49020l = this_runCatching.metrics;
        EnumC49017i enumC49017i = EnumC49017i.FRAME;
        this_runCatching.m4245b();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (view.getWidth() == 0 || view.getHeight() == 0) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(bitmap, "bitmap");
        this_runCatching.m4210a(view, bitmap, this_runCatching.new Bitmap(bitmap, point, swipeData, countDownLatch));
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor.execute(new RunnableC49019k(countDownLatch, jCurrentTimeMillis, c49020l, enumC49017i));
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m4206a(Canvas canvas) throws JSONException {
        Object objM28550constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            C49000h c49000hM4250e = m4250e();
            int width = c49000hM4250e != null ? c49000hM4250e.getWidth() : 0;
            C49000h c49000hM4250e2 = m4250e();
            int height = c49000hM4250e2 != null ? c49000hM4250e2.getHeight() : 0;
            if (width != 0 && height != 0) {
                android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                C49000h c49000hM4250e3 = m4250e();
                if (c49000hM4250e3 != null) {
                    c49000hM4250e3.draw(canvas2);
                }
                canvas.drawBitmap(bitmapCreateBitmap, (canvas.getWidth() - width) / 2, canvas.getHeight() - height, (Paint) null);
            }
            objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            C49029a c49029a = this.logger;
            String message = thM28553exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            C49029a.m4295a(c49029a, "Error drawing webview", message, ExceptionsKt.stackTraceToString(thM28553exceptionOrNullimpl), null, null, null, 56, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m4205a(android.graphics.Bitmap bitmap) {
        m4246c().m4183a(String.valueOf(System.currentTimeMillis()), bitmap, this.jpegQuality, this.metrics);
    }

    /* renamed from: a */
    static /* synthetic */ void m4215a(C49022n c49022n, Canvas canvas, List list, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = -16777216;
        }
        c49022n.m4208a(canvas, (List<Rect>) list, i2);
    }

    /* renamed from: a */
    private final void m4208a(Canvas canvas, List<Rect> maskingRects, int color) {
        C49020l c49020l = this.metrics;
        EnumC49017i enumC49017i = EnumC49017i.FILTER;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (Rect rect : maskingRects) {
            float f2 = rect.left;
            float f3 = rect.top;
            float f4 = rect.right;
            float f5 = rect.bottom;
            Paint paint = new Paint();
            paint.setColor(color);
            Unit unit = Unit.INSTANCE;
            canvas.drawRect(f2, f3, f4, f5, paint);
        }
        countDownLatch.countDown();
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor.execute(new RunnableC49019k(countDownLatch, jCurrentTimeMillis, c49020l, enumC49017i));
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m4207a(Canvas canvas, Point touchPoint) {
        if (touchPoint == null) {
            return;
        }
        canvas.drawCircle(touchPoint.x + 16.0f, touchPoint.y + 16.0f, 32.0f, this.touchPaint);
        canvas.drawCircle(touchPoint.x + 16.0f, touchPoint.y + 16.0f, 32.0f, this.strokePaint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m4209a(Canvas canvas, SwipeData swipe) {
        if (swipe == null) {
            return;
        }
        canvas.drawLine(swipe.getStart().x, swipe.getStart().y, swipe.getEnd().x, swipe.getEnd().y, this.swipePaint);
    }

    /* renamed from: a */
    private final void m4210a(View view, final android.graphics.Bitmap bitmap, final Function2<? super android.graphics.Bitmap, ? super List<Rect>, Unit> bitmapCallback) throws JSONException {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            FragmentActivity fragmentActivity = m4234a().get();
            Window window = fragmentActivity != null ? fragmentActivity.getWindow() : null;
            if (window == null) {
                C49029a.m4295a(this.logger, "Error drawing view for Build.VERSION.SDK_INT: " + i2, null, "Window is null", "", null, null, 50, null);
                return;
            }
            final List<Rect> listM4222b = m4222b(view);
            try {
                PixelCopy.request(window, bitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: sprig.e.n$$ExternalSyntheticLambda1
                    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                    public final void onPixelCopyFinished(int i3) {
                        C49022n.m4219a(this.f$0, bitmapCallback, bitmap, listM4222b, i3);
                    }
                }, this.handler);
                return;
            } catch (Exception e2) {
                C49029a c49029a = this.logger;
                String str = "Error drawing view for Build.VERSION.SDK_INT: " + Build.VERSION.SDK_INT;
                String message = e2.getMessage();
                if (message == null) {
                    message = "";
                }
                C49029a.m4295a(c49029a, str, null, message, ExceptionsKt.stackTraceToString(e2), null, null, 50, null);
                return;
            }
        }
        Canvas canvas = new Canvas(bitmap);
        view.draw(canvas);
        canvas.setBitmap(null);
        bitmapCallback.invoke(bitmap, m4222b(view));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m4219a(C49022n this$0, final Function2 bitmapCallback, final android.graphics.Bitmap bitmap, final List rects, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bitmapCallback, "$bitmapCallback");
        Intrinsics.checkNotNullParameter(bitmap, "$bitmap");
        Intrinsics.checkNotNullParameter(rects, "$rects");
        if (i2 == 0) {
            this$0.handler.postAtFrontOfQueue(new Runnable() { // from class: sprig.e.n$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    C49022n.m4211a(bitmapCallback, bitmap, rects);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m4211a(Function2 bitmapCallback, android.graphics.Bitmap bitmap, List rects) {
        Intrinsics.checkNotNullParameter(bitmapCallback, "$bitmapCallback");
        Intrinsics.checkNotNullParameter(bitmap, "$bitmap");
        Intrinsics.checkNotNullParameter(rects, "$rects");
        bitmapCallback.invoke(bitmap, rects);
    }
}
