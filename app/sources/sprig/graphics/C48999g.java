package sprig.graphics;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Observer;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.singular.sdk.internal.Constants;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import com.userleap.EventListener;
import com.userleap.EventName;
import com.userleap.EventPayload;
import com.userleap.Sprig;
import com.userleap.SprigEvent;
import com.userleap.SurveyState;
import com.userleap.UserLeapInterface;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.UUID;
import kotlin.ExceptionsKt;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope3;
import kotlinx.coroutines.Dispatchers;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sprig.graphics.C48999g;
import sprig.graphics.C49000h;
import sprig.graphics.C49009a;
import sprig.graphics.C49011c;
import sprig.graphics.C49012d;
import sprig.graphics.C49021m;
import sprig.graphics.C49022n;
import sprig.graphics.EnumC49010b;
import sprig.graphics.InterfaceComponentCallbacks2C49016h;
import sprig.graphics.WindowCallbackC49023o;
import sprig.p546d.C49007e;
import sprig.p548f.C49028a;
import sprig.p549g.C49029a;

@Metadata(m3635d1 = {"\u0000\u008e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u000b\"B\u000b\b\u0002¢\u0006\u0006\b¶\u0001\u0010·\u0001J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0002J\u001c\u0010\u000b\u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u0007H\u0002J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J \u0010\u000b\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0011H\u0002J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0005H\u0002J\b\u0010\u0015\u001a\u00020\nH\u0002J\b\u0010\u0016\u001a\u00020\nH\u0002J*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00192\b\b\u0002\u0010\u001b\u001a\u00020\fH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\u0016\u0010\u000b\u001a\u00020\n2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u0011H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0002J\u000e\u0010\"\u001a\u0004\u0018\u00010!*\u00020!H\u0002J\u000e\u0010#\u001a\u00020\u0005*\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010\"\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\u0010\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u0005H\u0016J \u0010\u000b\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u00052\u0006\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020\u0005H\u0016J\u0018\u0010\"\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u0005H\u0016J\u0010\u0010\"\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u0005H\u0016J\u0010\u0010*\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u0005H\u0016J\u0018\u0010,\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\u0005H\u0016J8\u0010,\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\u00052\u0014\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020.\u0018\u00010-2\b\u00100\u001a\u0004\u0018\u00010!H\u0016J\u0010\u00102\u001a\u00020\n2\u0006\u00101\u001a\u00020\u0005H\u0016J\u0010\u00104\u001a\u00020\n2\u0006\u00103\u001a\u00020!H\u0016J\u0010\u00106\u001a\u00020\n2\u0006\u00105\u001a\u00020\u0005H\u0016J&\u00106\u001a\u00020\n2\u0006\u00105\u001a\u00020\u00052\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007H\u0016J0\u00106\u001a\u00020\n2\u0006\u00105\u001a\u00020\u00052\b\u00107\u001a\u0004\u0018\u00010\u00052\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007H\u0016J$\u00106\u001a\u00020\n2\u0006\u00105\u001a\u00020\u00052\b\u00107\u001a\u0004\u0018\u00010\u00052\b\u00108\u001a\u0004\u0018\u00010\u0005H\u0016J:\u00106\u001a\u00020\n2\u0006\u00105\u001a\u00020\u00052\b\u00107\u001a\u0004\u0018\u00010\u00052\b\u00108\u001a\u0004\u0018\u00010\u00052\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007H\u0016J$\u00106\u001a\u00020\n2\u0006\u00105\u001a\u00020\u00052\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020.0-H\u0016J:\u00106\u001a\u00020\n2\u0006\u00105\u001a\u00020\u00052\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020.0-2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007H\u0016JF\u00106\u001a\u00020\n2\u0006\u00105\u001a\u00020\u00052\b\u00107\u001a\u0004\u0018\u00010\u00052\u0014\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020.\u0018\u00010-2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007H\u0016J:\u00106\u001a\u00020\n2\u0006\u00105\u001a\u00020\u00052\b\u00107\u001a\u0004\u0018\u00010\u00052\b\u00108\u001a\u0004\u0018\u00010\u00052\u0014\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020.\u0018\u00010-H\u0016JP\u00106\u001a\u00020\n2\u0006\u00105\u001a\u00020\u00052\b\u00107\u001a\u0004\u0018\u00010\u00052\b\u00108\u001a\u0004\u0018\u00010\u00052\u0014\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020.\u0018\u00010-2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007H\u0016J\u0010\u00106\u001a\u00020\n2\u0006\u0010;\u001a\u00020:H\u0016J\u0018\u0010=\u001a\u00020\n2\u0006\u00105\u001a\u00020\u00052\u0006\u0010<\u001a\u00020!H\u0016J\"\u0010=\u001a\u00020\n2\u0006\u00105\u001a\u00020\u00052\b\u00107\u001a\u0004\u0018\u00010\u00052\u0006\u0010<\u001a\u00020!H\u0016J,\u0010=\u001a\u00020\n2\u0006\u00105\u001a\u00020\u00052\b\u00107\u001a\u0004\u0018\u00010\u00052\b\u00108\u001a\u0004\u0018\u00010\u00052\u0006\u0010<\u001a\u00020!H\u0016J\u0018\u0010=\u001a\u00020\n2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020!H\u0016J\u0010\u0010?\u001a\u00020\n2\u0006\u0010>\u001a\u00020\u0005H\u0016J\u0018\u0010B\u001a\u00020\n2\u0006\u0010@\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u0005H\u0016J\u0018\u0010B\u001a\u00020\n2\u0006\u0010@\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\fH\u0016J\u0018\u0010B\u001a\u00020\n2\u0006\u0010@\u001a\u00020\u00052\u0006\u0010A\u001a\u00020CH\u0016J\u001c\u0010E\u001a\u00020\n2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050-H\u0016J0\u0010E\u001a\u00020\n2\u0012\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050-2\b\u00107\u001a\u0004\u0018\u00010\u00052\b\u00108\u001a\u0004\u0018\u00010\u0005H\u0016J\u0016\u0010F\u001a\u00020\n2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00050\u0019H\u0016J\u0010\u0010H\u001a\u00020\n2\u0006\u0010G\u001a\u00020\u0005H\u0016J\u0010\u0010I\u001a\u00020\n2\u0006\u0010G\u001a\u00020\u0005H\u0016J\u0010\u0010K\u001a\u00020\n2\u0006\u0010J\u001a\u00020\u0005H\u0016J&\u0010K\u001a\u00020\n2\u0006\u0010J\u001a\u00020\u00052\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007H\u0016J\b\u0010L\u001a\u00020\nH\u0016J0\u0010N\u001a\u00020\n2\u0006\u0010M\u001a\u00020.2\b\u00107\u001a\u0004\u0018\u00010\u00052\u0014\u0010D\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010-H\u0016J\u0010\u0010P\u001a\u00020\n2\u0006\u0010O\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010Q\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u0005H\u0016J\u0018\u0010U\u001a\u00020\n2\u0006\u0010S\u001a\u00020R2\u0006\u0010\r\u001a\u00020TH\u0016J\u0018\u0010V\u001a\u00020\n2\u0006\u0010S\u001a\u00020R2\u0006\u0010\r\u001a\u00020TH\u0016J\b\u0010W\u001a\u00020\nH\u0016J\u0006\u0010X\u001a\u00020\nJ\b\u0010Y\u001a\u00020\nH\u0016J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010[\u001a\u00020ZH\u0000¢\u0006\u0004\b\u000b\u0010\\J\u001c\u0010\u000b\u001a\u00020\n2\u0006\u0010^\u001a\u00020]2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\n0\u0011J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010^\u001a\u00020]J\u0010\u0010b\u001a\u00020\n2\u0006\u0010a\u001a\u00020`H\u0016J\u0010\u0010c\u001a\u00020\n2\u0006\u0010a\u001a\u00020`H\u0016J\u0010\u0010d\u001a\u00020\n2\u0006\u0010a\u001a\u00020`H\u0016J\u0018\u0010g\u001a\u00020\n2\u0006\u0010a\u001a\u00020`2\u0006\u0010f\u001a\u00020eH\u0016J\u0010\u0010h\u001a\u00020\n2\u0006\u0010a\u001a\u00020`H\u0016J\u001a\u0010j\u001a\u00020\n2\u0006\u0010a\u001a\u00020`2\b\u0010i\u001a\u0004\u0018\u00010eH\u0016J\u0010\u0010k\u001a\u00020\n2\u0006\u0010a\u001a\u00020`H\u0016J\u0010\u0010n\u001a\u00020\n2\u0006\u0010m\u001a\u00020lH\u0016J\u0010\u0010o\u001a\u00020\n2\u0006\u0010m\u001a\u00020lH\u0016R\u0016\u0010q\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010pR\u0016\u0010r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010pR\u001c\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00050s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010tR\u0016\u0010v\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010pR\u0016\u0010w\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010pR\u0016\u0010z\u001a\u00020x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010yR\u0018\u0010}\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R'\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bX\u0010|\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R'\u0010\u0086\u0001\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0083\u0001\u0010|\u001a\u0005\b\u0084\u0001\u0010\u007f\"\u0006\b\u0085\u0001\u0010\u0081\u0001R1\u0010\u008d\u0001\u001a\u000b\u0012\u0004\u0012\u00020!\u0018\u00010\u0087\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0005\b\"\u0010\u008c\u0001R\u001a\u0010\u0090\u0001\u001a\u00030\u008e\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008f\u0001R\u0018\u0010\u0091\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010pR!\u0010\u0096\u0001\u001a\u00030\u0092\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0093\u0001\u0010\u0094\u0001\u001a\u0006\b\u0093\u0001\u0010\u0095\u0001R#\u0010\u0099\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020:0\u0097\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0015\u0010\u0098\u0001R\u0018\u0010\u009d\u0001\u001a\u00030\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0017\u0010\u009e\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010pR\u001d\u0010¡\u0001\u001a\b\u0012\u0004\u0012\u00020R0\u00198\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u001c\u0010¥\u0001\u001a\u0005\u0018\u00010¢\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u0018\u0010§\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¦\u0001\u0010pR\u0016\u0010\u001d\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010¨\u0001R-\u0010ª\u0001\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\n0\u0007*\t\u0012\u0004\u0012\u00020!0\u0087\u00018BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u000b\u0010©\u0001R\u001a\u0010\u00ad\u0001\u001a\u0005\u0018\u00010«\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010¬\u0001R\u001f\u0010°\u0001\u001a\u0005\u0018\u00010®\u0001*\u0004\u0018\u00010!8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u000b\u0010¯\u0001R\u0019\u0010³\u0001\u001a\u0004\u0018\u00010C8VX\u0096\u0004¢\u0006\b\u001a\u0006\b±\u0001\u0010²\u0001R\u0018\u0010µ\u0001\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b´\u0001\u0010\u007f¨\u0006¸\u0001"}, m3636d2 = {"Lsprig/c/g;", "Lcom/userleap/UserLeapInterface;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Lsprig/c/h$a;", "Landroid/net/ConnectivityManager$NetworkCallback;", "", "javascript", "Lkotlin/Function1;", "Ljava/lang/Void;", "callback", "", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "", "listener", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "Ljava/util/UUID;", "workId", "Lkotlin/Function0;", "completionHandler", "jsonData", "f", "o", "q", "", "replayWindowInMilliseconds", "", "viewsClassNamesToRedact", "maskSecureText", "Landroid/content/Context;", "context", "function", "", "exception", "Landroidx/fragment/app/FragmentActivity;", "b", "g", WebsocketGatewayConstants.DATA_KEY, "d", "callbackId", "Lcom/userleap/SurveyState;", "state", "id", "c", "environment", "configure", "", "", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "reactFragmentActivity", "locale", "setLocale", "fragmentActivity", "presentSurvey", "event", "track", "userId", "partnerAnonymousId", "properties", "Lcom/userleap/EventPayload;", "payload", "fromActivity", "trackAndPresent", "emailAddress", "setEmailAddress", "key", "value", "setVisitorAttribute", "", "attributes", "setVisitorAttributes", "removeVisitorAttributes", "identifier", "setPartnerAnonymousId", "setUserIdentifier", "surveyId", "presentSurveyWithId", "logout", "optimizelySdk", "integrateOptimizely", "previewKey", "setPreviewKey", "name", "Lcom/userleap/EventName;", "eventName", "Lcom/userleap/EventListener;", "addEventListener", "removeEventListener", "dismissActiveSurvey", Constants.RequestParamsKeys.PACKAGE_NAME_KEY, "stopRecording", "Lsprig/e/b;", "reason", "(Lsprig/e/b;)V", "Landroid/view/ViewGroup;", "view", "dismissView", "Landroid/app/Activity;", "activity", "onActivityResumed", "onActivityPaused", "onActivityStopped", "Landroid/os/Bundle;", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "savedInstanceState", "onActivityCreated", "onActivityStarted", "Landroid/net/Network;", "network", "onAvailable", "onLost", "Z", "isSdkReady", "isSdkReadyEventFired", "Ljava/util/Queue;", "Ljava/util/Queue;", "sdkReadyQueue", "shouldDismissOnResume", "shouldResetOnResume", "Lsprig/g/a;", "Lsprig/g/a;", "logger", "h", "Ljava/lang/String;", "onSDKReadyData", "getVisitorId", "()Ljava/lang/String;", "setVisitorId", "(Ljava/lang/String;)V", "visitorId", "j", "m", "setEnvironmentId", "environmentId", "Ljava/lang/ref/WeakReference;", Constants.RequestParamsKeys.IDENTIFIER_KEYSPACE_KEY, "Ljava/lang/ref/WeakReference;", "l", "()Ljava/lang/ref/WeakReference;", "(Ljava/lang/ref/WeakReference;)V", "currentFragmentActivity", "Lsprig/c/h;", "Lsprig/c/h;", "webView", "hasConfigured", "Landroid/os/Handler;", Constants.RequestParamsKeys.APP_NAME_KEY, "Lkotlin/Lazy;", "()Landroid/os/Handler;", "handler", "", "Ljava/util/Map;", "eventPayloads", "Ljava/lang/Runnable;", Constants.RequestParamsKeys.PLATFORM_KEY, "Ljava/lang/Runnable;", "resetWebView", "shouldDismissOnPageChange", Constants.REVENUE_AMOUNT_KEY, "Ljava/util/List;", "sdkHandledEvents", "Lsprig/e/n;", Constants.RequestParamsKeys.SESSION_ID_KEY, "Lsprig/e/n;", "recorder", "t", "isNetworkAvailable", "()Landroid/content/Context;", "(Ljava/lang/ref/WeakReference;)Lkotlin/jvm/functions/Function1;", "present", "Lsprig/f/a;", "()Lsprig/f/a;", "activeSurvey", "Landroid/view/View;", "(Landroidx/fragment/app/FragmentActivity;)Landroid/view/View;", "rootView", "getVisitorIdentifier", "()Ljava/lang/Integer;", "visitorIdentifier", "getVisitorIdentifierString", "visitorIdentifierString", "<init>", "()V", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
@SourceDebugExtension
/* renamed from: sprig.c.g */
/* loaded from: classes23.dex */
public final class C48999g extends ConnectivityManager.NetworkCallback implements UserLeapInterface, Application.ActivityLifecycleCallbacks, C49000h.a {

    /* renamed from: b, reason: from kotlin metadata */
    private static boolean isSdkReady;

    /* renamed from: c, reason: from kotlin metadata */
    private static boolean isSdkReadyEventFired;

    /* renamed from: e, reason: from kotlin metadata */
    private static boolean shouldDismissOnResume;

    /* renamed from: f, reason: from kotlin metadata */
    private static boolean shouldResetOnResume;

    /* renamed from: h, reason: from kotlin metadata */
    private static String onSDKReadyData;

    /* renamed from: i, reason: from kotlin metadata */
    private static String visitorId;

    /* renamed from: k, reason: from kotlin metadata */
    private static WeakReference<FragmentActivity> currentFragmentActivity;

    /* renamed from: l, reason: from kotlin metadata */
    private static C49000h webView;

    /* renamed from: m, reason: from kotlin metadata */
    private static boolean hasConfigured;

    /* renamed from: s, reason: from kotlin metadata */
    private static C49022n recorder;

    /* renamed from: a */
    public static final C48999g f8243a = new C48999g();

    /* renamed from: d, reason: from kotlin metadata */
    private static Queue<String> sdkReadyQueue = new LinkedList();

    /* renamed from: g, reason: from kotlin metadata */
    private static C49029a logger = new C49029a();

    /* renamed from: j, reason: from kotlin metadata */
    private static String environmentId = "";

    /* renamed from: n, reason: from kotlin metadata */
    private static final Lazy handler = LazyKt.lazy(Handler.f8275a);

    /* renamed from: o, reason: from kotlin metadata */
    private static final Map<String, EventPayload> eventPayloads = new LinkedHashMap();

    /* renamed from: p, reason: from kotlin metadata */
    private static final Runnable resetWebView = new Runnable() { // from class: sprig.c.g$$ExternalSyntheticLambda0
        @Override // java.lang.Runnable
        public final void run() {
            C48999g.m4092p();
        }
    };

    /* renamed from: q, reason: from kotlin metadata */
    private static boolean shouldDismissOnPageChange = true;

    /* renamed from: r, reason: from kotlin metadata */
    private static final List<EventName> sdkHandledEvents = CollectionsKt.listOf((Object[]) new EventName[]{EventName.QUESTION_ANSWERED, EventName.SDK_READY, EventName.VISITOR_ID_UPDATED, EventName.SURVEY_WILL_CLOSE, EventName.SURVEY_APPEARED});

    /* renamed from: t, reason: from kotlin metadata */
    private static boolean isNetworkAvailable = true;

    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\t\u0010\u0010¨\u0006\u0014"}, m3636d2 = {"Lsprig/c/g$a;", "", "", "toString", "", "hashCode", "other", "", "equals", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "Ljava/lang/String;", "b", "()Ljava/lang/String;", "replayDurationType", "", "J", "()J", "replayDurationSeconds", "<init>", "(Ljava/lang/String;J)V", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
    /* renamed from: sprig.c.g$a, reason: from toString */
    /* loaded from: classes28.dex */
    public static final /* data */ class ReplayConfig {

        /* renamed from: a, reason: from kotlin metadata and from toString */
        private final String replayDurationType;

        /* renamed from: b, reason: from kotlin metadata and from toString */
        private final long replayDurationSeconds;

        public ReplayConfig(String replayDurationType, long j) {
            Intrinsics.checkNotNullParameter(replayDurationType, "replayDurationType");
            this.replayDurationType = replayDurationType;
            this.replayDurationSeconds = j;
        }

        /* renamed from: a, reason: from getter */
        public final long getReplayDurationSeconds() {
            return this.replayDurationSeconds;
        }

        /* renamed from: b, reason: from getter */
        public final String getReplayDurationType() {
            return this.replayDurationType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReplayConfig)) {
                return false;
            }
            ReplayConfig replayConfig = (ReplayConfig) other;
            return Intrinsics.areEqual(this.replayDurationType, replayConfig.replayDurationType) && this.replayDurationSeconds == replayConfig.replayDurationSeconds;
        }

        public int hashCode() {
            return (this.replayDurationType.hashCode() * 31) + Long.hashCode(this.replayDurationSeconds);
        }

        public String toString() {
            return "ReplayConfig(replayDurationType=" + this.replayDurationType + ", replayDurationSeconds=" + this.replayDurationSeconds + ')';
        }
    }

    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0013\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\t\u0010\u0012¨\u0006\u0016"}, m3636d2 = {"Lsprig/c/g$b;", "", "", "toString", "", "hashCode", "other", "", "equals", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "Ljava/lang/String;", "c", "()Ljava/lang/String;", "surveyId", "b", "responseGroupUid", "Lsprig/c/g$a;", "Lsprig/c/g$a;", "()Lsprig/c/g$a;", "replayConfig", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lsprig/c/g$a;)V", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
    /* renamed from: sprig.c.g$b, reason: from toString */
    /* loaded from: classes28.dex */
    public static final /* data */ class ReplayData {

        /* renamed from: a, reason: from kotlin metadata and from toString */
        private final String surveyId;

        /* renamed from: b, reason: from kotlin metadata and from toString */
        private final String responseGroupUid;

        /* renamed from: c, reason: from kotlin metadata and from toString */
        private final ReplayConfig replayConfig;

        public ReplayData(String surveyId, String responseGroupUid, ReplayConfig replayConfig) {
            Intrinsics.checkNotNullParameter(surveyId, "surveyId");
            Intrinsics.checkNotNullParameter(responseGroupUid, "responseGroupUid");
            Intrinsics.checkNotNullParameter(replayConfig, "replayConfig");
            this.surveyId = surveyId;
            this.responseGroupUid = responseGroupUid;
            this.replayConfig = replayConfig;
        }

        /* renamed from: a, reason: from getter */
        public final ReplayConfig getReplayConfig() {
            return this.replayConfig;
        }

        /* renamed from: b, reason: from getter */
        public final String getResponseGroupUid() {
            return this.responseGroupUid;
        }

        /* renamed from: c, reason: from getter */
        public final String getSurveyId() {
            return this.surveyId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReplayData)) {
                return false;
            }
            ReplayData replayData = (ReplayData) other;
            return Intrinsics.areEqual(this.surveyId, replayData.surveyId) && Intrinsics.areEqual(this.responseGroupUid, replayData.responseGroupUid) && Intrinsics.areEqual(this.replayConfig, replayData.replayConfig);
        }

        public int hashCode() {
            return (((this.surveyId.hashCode() * 31) + this.responseGroupUid.hashCode()) * 31) + this.replayConfig.hashCode();
        }

        public String toString() {
            return "ReplayData(surveyId=" + this.surveyId + ", responseGroupUid=" + this.responseGroupUid + ", replayConfig=" + this.replayConfig + ')';
        }
    }

    @Metadata(m3635d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m3636d2 = {"", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "()V"}, m3637k = 3, m3638mv = {1, 8, 0})
    /* renamed from: sprig.c.g$c */
    /* loaded from: classes28.dex */
    static final class c extends Lambda implements Function0<Unit> {

        /* renamed from: a */
        final /* synthetic */ FragmentActivity f8268a;

        /* renamed from: b */
        final /* synthetic */ String f8269b;

        /* renamed from: c */
        final /* synthetic */ Map<String, Object> f8270c;

        /* renamed from: d */
        final /* synthetic */ C48999g f8271d;

        /* renamed from: e */
        final /* synthetic */ Context f8272e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(FragmentActivity fragmentActivity, String str, Map<String, ? extends Object> map, C48999g c48999g, Context context) {
            super(0);
            this.f8268a = fragmentActivity;
            this.f8269b = str;
            this.f8270c = map;
            this.f8271d = c48999g;
            this.f8272e = context;
        }

        /* renamed from: a */
        public final void m4114a() {
            Unit unit;
            FragmentActivity fragmentActivity;
            C48999g c48999g = C48999g.f8243a;
            WeakReference<FragmentActivity> weakReferenceM4106l = c48999g.m4106l();
            if (weakReferenceM4106l == null || (fragmentActivity = weakReferenceM4106l.get()) == null) {
                FragmentActivity fragmentActivity2 = this.f8268a;
                if (fragmentActivity2 != null) {
                    String str = this.f8269b;
                    Map<String, Object> map = this.f8270c;
                    C48999g c48999g2 = this.f8271d;
                    c48999g.m4102b(new WeakReference<>(fragmentActivity2));
                    C48999g.webView = new C49000h(fragmentActivity2, str, map, c48999g2, null, 0, 48, null);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
            } else {
                C48999g.webView = new C49000h(fragmentActivity, this.f8269b, this.f8270c, this.f8271d, null, 0, 48, null);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                Context context = this.f8272e;
                String str2 = this.f8269b;
                Map<String, Object> map2 = this.f8270c;
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
                C48999g.webView = new C49000h(applicationContext, str2, map2, c48999g, null, 0, 48, null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m4114a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(m3635d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m3636d2 = {"", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "()V"}, m3637k = 3, m3638mv = {1, 8, 0})
    /* renamed from: sprig.c.g$d */
    /* loaded from: classes28.dex */
    static final class d extends Lambda implements Function0<Unit> {

        /* renamed from: a */
        final /* synthetic */ String f8273a;

        /* renamed from: b */
        final /* synthetic */ Function1<String, Void> f8274b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(String str, Function1<? super String, Void> function1) {
            super(0);
            this.f8273a = str;
            this.f8274b = function1;
        }

        /* renamed from: a */
        public final void m4115a() {
            C49000h c49000h = C48999g.webView;
            if (c49000h == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webView");
                c49000h = null;
            }
            c49000h.m4137a(this.f8273a, this.f8274b);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m4115a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(m3635d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m3636d2 = {"Landroid/os/Handler;", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "()Landroid/os/Handler;"}, m3637k = 3, m3638mv = {1, 8, 0})
    /* renamed from: sprig.c.g$e, reason: from Kotlin metadata */
    static final class Handler extends Lambda implements Function0<android.os.Handler> {

        /* renamed from: a */
        public static final Handler f8275a = new Handler();

        Handler() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final android.os.Handler invoke() {
            return new android.os.Handler(Looper.getMainLooper());
        }
    }

    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    /* renamed from: sprig.c.g$f */
    /* loaded from: classes28.dex */
    /* synthetic */ class f extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        f(Object obj) {
            super(1, obj, C48999g.class, "logError", "logError(Ljava/lang/Throwable;)V", 0);
        }

        /* renamed from: a */
        public final void m4117a(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((C48999g) this.receiver).m4056a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            m4117a(th);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m3635d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m3636d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, m3637k = 3, m3638mv = {1, 8, 0})
    @DebugMetadata(m3644c = "com.userleap.internal.SprigWebController$listenForWorkComplete$1", m3645f = "SprigWebController.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: sprig.c.g$g */
    /* loaded from: classes28.dex */
    static final class g extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        int f8276a;

        /* renamed from: b */
        private /* synthetic */ Object f8277b;

        /* renamed from: c */
        final /* synthetic */ UUID f8278c;

        /* renamed from: d */
        final /* synthetic */ Function0<Unit> f8279d;

        @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m3636d2 = {"Landroidx/work/WorkInfo;", "kotlin.jvm.PlatformType", "it", "", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "(Landroidx/work/WorkInfo;)V"}, m3637k = 3, m3638mv = {1, 8, 0})
        /* renamed from: sprig.c.g$g$a */
        static final class a extends Lambda implements Function1<WorkInfo, Unit> {

            /* renamed from: a */
            final /* synthetic */ Function0<Unit> f8280a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Function0<Unit> function0) {
                super(1);
                this.f8280a = function0;
            }

            /* renamed from: a */
            public final void m4119a(WorkInfo workInfo) {
                if (workInfo == null || workInfo.getState() != WorkInfo.State.SUCCEEDED) {
                    return;
                }
                this.f8280a.invoke();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WorkInfo workInfo) {
                m4119a(workInfo);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(UUID uuid, Function0<Unit> function0, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f8278c = uuid;
            this.f8279d = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            g gVar = new g(this.f8278c, this.f8279d, continuation);
            gVar.f8277b = obj;
            return gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws JSONException {
            Object objM28550constructorimpl;
            Unit unit;
            FragmentActivity fragmentActivity;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f8276a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            UUID uuid = this.f8278c;
            Function0<Unit> function0 = this.f8279d;
            try {
                Result.Companion companion = Result.INSTANCE;
                C48999g c48999g = C48999g.f8243a;
                WeakReference<FragmentActivity> weakReferenceM4106l = c48999g.m4106l();
                if (weakReferenceM4106l == null || (fragmentActivity = weakReferenceM4106l.get()) == null) {
                    unit = null;
                } else {
                    WorkManager.getInstance(c48999g.m4089k()).getWorkInfoByIdLiveData(uuid).observe(fragmentActivity, new o(new a(function0)));
                    unit = Unit.INSTANCE;
                }
                objM28550constructorimpl = Result.m28550constructorimpl(unit);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl != null) {
                C49029a c49029a = C48999g.logger;
                String message = thM28553exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "";
                }
                C49029a.m4295a(c49029a, "Error listening for work completion", null, message, ExceptionsKt.stackTraceToString(thM28553exceptionOrNullimpl), null, null, 50, null);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m3635d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m3636d2 = {"", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "()V"}, m3637k = 3, m3638mv = {1, 8, 0})
    /* renamed from: sprig.c.g$h */
    /* loaded from: classes28.dex */
    static final class h extends Lambda implements Function0<Unit> {

        /* renamed from: a */
        public static final h f8281a = new h();

        h() {
            super(0);
        }

        /* renamed from: a */
        public final void m4120a() {
            if (C48999g.shouldDismissOnResume) {
                C49028a c49028aM4088j = C48999g.f8243a.m4088j();
                if (c49028aM4088j != null) {
                    c49028aM4088j.dismiss();
                }
                C48999g.shouldDismissOnResume = false;
            }
            if (C48999g.shouldResetOnResume) {
                C48999g.resetWebView.run();
                C48999g.shouldResetOnResume = false;
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m4120a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(m3635d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m3636d2 = {"", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "()V"}, m3637k = 3, m3638mv = {1, 8, 0})
    /* renamed from: sprig.c.g$i */
    /* loaded from: classes28.dex */
    static final class i extends Lambda implements Function0<Unit> {

        /* renamed from: a */
        public static final i f8282a = new i();

        i() {
            super(0);
        }

        /* renamed from: a */
        public final void m4121a() {
            C48999g.isNetworkAvailable = true;
            C48999g.resetWebView.run();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m4121a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(m3635d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m3636d2 = {"", "dismiss", "", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "(Z)V"}, m3637k = 3, m3638mv = {1, 8, 0})
    @SourceDebugExtension
    /* renamed from: sprig.c.g$k */
    /* loaded from: classes28.dex */
    static final class k extends Lambda implements Function1<Boolean, Unit> {

        /* renamed from: a */
        final /* synthetic */ String f8287a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str) {
            super(1);
            this.f8287a = str;
        }

        /* renamed from: a */
        public final void m4126a(boolean z) {
            C48999g.shouldDismissOnPageChange = z;
            if (!z) {
                C48995c.f8235a.m4038a();
            }
            while (!C48999g.sdkReadyQueue.isEmpty()) {
                String str = (String) C48999g.sdkReadyQueue.poll();
                if (str != null) {
                    C48999g.m4062a(C48999g.f8243a, str, null, 2, null);
                }
            }
            C48999g.isSdkReady = true;
            if (C48999g.isSdkReadyEventFired) {
                return;
            }
            C48999g.isSdkReadyEventFired = true;
            C48999g.f8243a.mo4098a("SDK_READY", this.f8287a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            m4126a(bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(m3635d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m3636d2 = {"Lcom/userleap/SurveyState;", "surveyState", "", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "(Lcom/userleap/SurveyState;)V"}, m3637k = 3, m3638mv = {1, 8, 0})
    /* renamed from: sprig.c.g$l */
    /* loaded from: classes28.dex */
    static final class l extends Lambda implements Function1<SurveyState, Unit> {

        /* renamed from: a */
        final /* synthetic */ WeakReference<FragmentActivity> f8288a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(WeakReference<FragmentActivity> weakReference) {
            super(1);
            this.f8288a = weakReference;
        }

        /* renamed from: a */
        public final void m4127a(SurveyState surveyState) {
            FragmentActivity fragmentActivityM4069b;
            Intrinsics.checkNotNullParameter(surveyState, "surveyState");
            FragmentActivity fragmentActivity = this.f8288a.get();
            if (fragmentActivity == null || (fragmentActivityM4069b = C48999g.f8243a.m4069b(fragmentActivity)) == null || surveyState != SurveyState.READY) {
                return;
            }
            Sprig.INSTANCE.presentSurvey(fragmentActivityM4069b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SurveyState surveyState) {
            m4127a(surveyState);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m3635d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m3636d2 = {"", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "()V"}, m3637k = 3, m3638mv = {1, 8, 0})
    /* renamed from: sprig.c.g$m */
    /* loaded from: classes28.dex */
    static final class m extends Lambda implements Function0<Unit> {

        /* renamed from: a */
        final /* synthetic */ FragmentActivity f8289a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(FragmentActivity fragmentActivity) {
            super(0);
            this.f8289a = fragmentActivity;
        }

        /* renamed from: a */
        public final void m4128a() {
            Lifecycle.State state = this.f8289a.getLifecycle().getState();
            Lifecycle.State state2 = Lifecycle.State.RESUMED;
            if (!state.isAtLeast(state2)) {
                C48999g.f8243a.dismissActiveSurvey();
                return;
            }
            C48999g c48999g = C48999g.f8243a;
            c48999g.m4102b(new WeakReference<>(this.f8289a));
            if (c48999g.m4088j() == null && this.f8289a.getLifecycle().getState().isAtLeast(state2)) {
                C49028a.INSTANCE.m4291a().showNow(this.f8289a.getSupportFragmentManager(), "UserLeapSurveyDialog");
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            m4128a();
            return Unit.INSTANCE;
        }
    }

    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m3636d2 = {"", "Lsprig/e/a$a;", "it", "", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "([Lsprig/e/a$a;)V"}, m3637k = 3, m3638mv = {1, 8, 0})
    @SourceDebugExtension
    /* renamed from: sprig.c.g$n */
    /* loaded from: classes28.dex */
    static final class n extends Lambda implements Function1<C49009a.CacheRecord[], Unit> {

        /* renamed from: a */
        final /* synthetic */ C49009a f8290a;

        @Metadata(m3635d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m3636d2 = {"", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "()V"}, m3637k = 3, m3638mv = {1, 8, 0})
        /* renamed from: sprig.c.g$n$a */
        static final class a extends Lambda implements Function0<Unit> {

            /* renamed from: a */
            final /* synthetic */ C49009a f8291a;

            /* renamed from: b */
            final /* synthetic */ C49009a.CacheRecord f8292b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C49009a c49009a, C49009a.CacheRecord aVar) {
                super(0);
                this.f8291a = c49009a;
                this.f8292b = aVar;
            }

            /* renamed from: a */
            public final void m4130a() {
                this.f8291a.m4161a(this.f8292b.getWorkId());
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                m4130a();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(C49009a c49009a) {
            super(1);
            this.f8290a = c49009a;
        }

        /* renamed from: a */
        public final void m4129a(C49009a.CacheRecord[] it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C49009a c49009a = this.f8290a;
            for (C49009a.CacheRecord aVar : it) {
                C48999g.f8243a.m4057a(aVar.getWorkId(), new a(c49009a, aVar));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C49009a.CacheRecord[] aVarArr) {
            m4129a(aVarArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    /* renamed from: sprig.c.g$o */
    /* loaded from: classes28.dex */
    static final class o implements Observer, FunctionAdapter {

        /* renamed from: a */
        private final /* synthetic */ Function1 f8293a;

        o(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f8293a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.f8293a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f8293a.invoke(obj);
        }
    }

    @Metadata(m3635d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m3636d2 = {"Landroid/graphics/Point;", "touch", "", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "(Landroid/graphics/Point;)V"}, m3637k = 3, m3638mv = {1, 8, 0})
    /* renamed from: sprig.c.g$p, reason: from Kotlin metadata */
    /* loaded from: classes28.dex */
    static final class Point extends Lambda implements Function1<android.graphics.Point, Unit> {

        /* renamed from: a */
        final /* synthetic */ C49022n f8294a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Point(C49022n c49022n) {
            super(1);
            this.f8294a = c49022n;
        }

        /* renamed from: a */
        public final void m4131a(android.graphics.Point touch) {
            Intrinsics.checkNotNullParameter(touch, "touch");
            this.f8294a.m4236a(touch);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(android.graphics.Point point) {
            m4131a(point);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m3635d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m3636d2 = {"Lsprig/e/n$d;", "swipe", "", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "(Lsprig/e/n$d;)V"}, m3637k = 3, m3638mv = {1, 8, 0})
    /* renamed from: sprig.c.g$q */
    /* loaded from: classes28.dex */
    static final class q extends Lambda implements Function1<C49022n.SwipeData, Unit> {

        /* renamed from: a */
        final /* synthetic */ C49022n f8295a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(C49022n c49022n) {
            super(1);
            this.f8295a = c49022n;
        }

        /* renamed from: a */
        public final void m4132a(C49022n.SwipeData swipe) {
            Intrinsics.checkNotNullParameter(swipe, "swipe");
            this.f8295a.m4243a(swipe);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C49022n.SwipeData dVar) {
            m4132a(dVar);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m3636d2 = {"<anonymous>", "", "level", "", "onTrimMemory"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    /* renamed from: sprig.c.g$r */
    /* loaded from: classes28.dex */
    static final class r implements InterfaceComponentCallbacks2C49016h {

        /* renamed from: a */
        public static final r f8296a = new r();

        r() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            InterfaceComponentCallbacks2C49016h.a.m4189a(this, configuration);
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            InterfaceComponentCallbacks2C49016h.a.m4188a(this);
        }

        @Override // android.content.ComponentCallbacks2
        public final void onTrimMemory(int i) throws JSONException {
            if (i == 5) {
                C49029a.m4295a(C48999g.logger, "Memory pressure", null, "Stopping recording due to memory pressure", null, null, null, 58, null);
                C48999g.f8243a.m4099a(EnumC49010b.LOW_MEMORY);
            }
        }
    }

    @Metadata(m3635d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m3636d2 = {"Lcom/userleap/SurveyState;", "surveyState", "", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "(Lcom/userleap/SurveyState;)V"}, m3637k = 3, m3638mv = {1, 8, 0})
    /* renamed from: sprig.c.g$s */
    /* loaded from: classes28.dex */
    static final class s extends Lambda implements Function1<SurveyState, Unit> {

        /* renamed from: a */
        final /* synthetic */ EventPayload f8297a;

        /* renamed from: b */
        final /* synthetic */ WeakReference<FragmentActivity> f8298b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(EventPayload eventPayload, WeakReference<FragmentActivity> weakReference) {
            super(1);
            this.f8297a = eventPayload;
            this.f8298b = weakReference;
        }

        /* renamed from: a */
        public final void m4133a(SurveyState surveyState) {
            FragmentManager supportFragmentManager;
            Intrinsics.checkNotNullParameter(surveyState, "surveyState");
            boolean z = !C48999g.shouldDismissOnPageChange || C48995c.f8235a.m4040a(this.f8297a.getEvent());
            if ((this.f8297a.getShouldShowSurveyCallback() == null || this.f8297a.getShouldShowSurveyCallback().invoke().booleanValue()) && z) {
                C48999g.f8243a.m4050a(this.f8298b).invoke(surveyState);
            } else {
                C48999g.f8243a.m4079e("Sprig('dismissActiveSurvey')");
            }
            FragmentActivity fragmentActivity = this.f8298b.get();
            if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null) {
                return;
            }
            supportFragmentManager.unregisterFragmentLifecycleCallbacks(C48995c.f8235a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SurveyState surveyState) {
            m4133a(surveyState);
            return Unit.INSTANCE;
        }
    }

    private C48999g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final C49028a m4088j() {
        FragmentActivity fragmentActivity;
        FragmentManager supportFragmentManager;
        WeakReference<FragmentActivity> weakReference = currentFragmentActivity;
        Fragment fragmentFindFragmentByTag = (weakReference == null || (fragmentActivity = weakReference.get()) == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null) ? null : supportFragmentManager.findFragmentByTag("UserLeapSurveyDialog");
        if (fragmentFindFragmentByTag instanceof C49028a) {
            return (C49028a) fragmentFindFragmentByTag;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public final Context m4089k() {
        C49000h c49000h = webView;
        if (c49000h == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            c49000h = null;
        }
        Context applicationContext = c49000h.getContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "webView.context.applicationContext");
        return applicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public final android.os.Handler m4090n() {
        return (android.os.Handler) handler.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    private final void m4091o() {
        C49009a c49009a = new C49009a(m4089k(), null, 2, 0 == true ? 1 : 0);
        c49009a.m4162a(new n(c49009a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static final void m4092p() {
        boolean z;
        WeakReference<FragmentActivity> weakReference = currentFragmentActivity;
        if (weakReference != null) {
            if (!isSdkReady) {
                FragmentActivity it = weakReference.get();
                if (it != null) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    webView = new C49000h(it, environmentId, null, f8243a, null, 0, 48, null);
                }
                f8243a.m4093q();
            }
            z = false;
        } else {
            z = true;
        }
        shouldResetOnResume = z;
    }

    /* renamed from: q */
    private final void m4093q() {
        Set<EventName> setM4033a = C48994b.f8232a.m4033a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setM4033a) {
            if (!sdkHandledEvents.contains((EventName) obj)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f8243a.m4079e("Sprig.addEventListener(" + ((EventName) it.next()).getValue() + ')');
        }
    }

    @Override // com.userleap.UserLeapInterface
    public void addEventListener(EventName eventName, EventListener listener) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (C48994b.f8232a.m4032a(eventName, listener) != 1 || sdkHandledEvents.contains(eventName)) {
            return;
        }
        m4079e("Sprig.addEventListener(" + eventName.getValue() + ')');
    }

    @Override // com.userleap.UserLeapInterface
    public void configure(Context context, String environment) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(environment, "environment");
        configure(context, environment, null, null);
    }

    @Override // com.userleap.UserLeapInterface
    public void dismissActiveSurvey() {
        m4079e("Sprig.dismissActiveSurvey()");
    }

    @Override // com.userleap.UserLeapInterface
    public Integer getVisitorIdentifier() {
        try {
            String str = visitorId;
            if (str != null) {
                return Integer.valueOf(Integer.parseInt(str));
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.userleap.UserLeapInterface
    public String getVisitorIdentifierString() {
        return visitorId;
    }

    /* renamed from: i */
    public final void m4105i() {
        m4079e("Sprig.dismissActiveSurvey('close.click')");
    }

    @Override // com.userleap.UserLeapInterface
    public void integrateOptimizely(Object optimizelySdk, String userId, Map<String, String> attributes) {
        Intrinsics.checkNotNullParameter(optimizelySdk, "optimizelySdk");
        if (attributes == null) {
            attributes = MapsKt.emptyMap();
        }
        C49007e c49007e = new C49007e(optimizelySdk, new f(this));
        if (userId == null) {
            userId = "";
        }
        m4079e("Sprig('integrateOptimizely', " + c49007e.m4152a(userId, attributes).m4141a() + ')');
    }

    /* renamed from: l */
    public final WeakReference<FragmentActivity> m4106l() {
        return currentFragmentActivity;
    }

    @Override // com.userleap.UserLeapInterface
    public void logout() {
        m4062a(this, "Sprig('logoutUser')", null, 2, null);
    }

    /* renamed from: m */
    public final String m4107m() {
        return environmentId;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        WeakReference<FragmentActivity> weakReference = currentFragmentActivity;
        if (weakReference != null) {
            weakReference.clear();
        }
        currentFragmentActivity = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
        if (fragmentActivity == null) {
            return;
        }
        WeakReference<FragmentActivity> weakReference = new WeakReference<>(fragmentActivity);
        currentFragmentActivity = weakReference;
        C49022n c49022n = recorder;
        if (c49022n != null) {
            FragmentActivity fragmentActivity2 = weakReference.get();
            c49022n.m4248c(fragmentActivity2 != null ? f8243a.m4048a(fragmentActivity2) : null);
        }
        C49022n c49022n2 = recorder;
        if (c49022n2 != null) {
            WeakReference<FragmentActivity> weakReference2 = currentFragmentActivity;
            Intrinsics.checkNotNull(weakReference2, "null cannot be cast to non-null type java.lang.ref.WeakReference<androidx.fragment.app.FragmentActivity>");
            c49022n2.m4238a(weakReference2);
        }
        m4058a(h.f8281a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        super.onAvailable(network);
        boolean z = isNetworkAvailable;
        Boolean boolValueOf = Boolean.valueOf(z);
        if (z) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            m4058a(i.f8282a);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        Intrinsics.checkNotNullParameter(network, "network");
        super.onLost(network);
        isNetworkAvailable = false;
    }

    @Override // com.userleap.UserLeapInterface
    public void presentSurvey(FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        if (isSdkReady) {
            m4058a(new m(fragmentActivity));
        }
    }

    @Override // com.userleap.UserLeapInterface
    public void presentSurveyWithId(String surveyId) {
        Intrinsics.checkNotNullParameter(surveyId, "surveyId");
        presentSurveyWithId(surveyId, null);
    }

    @Override // com.userleap.UserLeapInterface
    public void removeEventListener(EventName eventName, EventListener listener) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (C48994b.f8232a.m4035b(eventName, listener) != 0 || sdkHandledEvents.contains(eventName)) {
            return;
        }
        m4079e("Sprig.removeEventListener(" + eventName.getValue() + ')');
    }

    @Override // com.userleap.UserLeapInterface
    public void removeVisitorAttributes(List<String> attributes) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        m4079e("Sprig('removeAttributes', " + new JSONArray((Collection<?>) attributes) + ')');
    }

    @Override // com.userleap.UserLeapInterface
    public void setEmailAddress(String emailAddress) {
        Intrinsics.checkNotNullParameter(emailAddress, "emailAddress");
        m4079e("Sprig('setEmail', '" + emailAddress + "')");
    }

    @Override // com.userleap.UserLeapInterface
    public void setLocale(String locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        m4079e("Sprig.locale = '" + locale + '\'');
    }

    @Override // com.userleap.UserLeapInterface
    public void setPartnerAnonymousId(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        m4079e("Sprig('setPartnerAnonymousId', '" + identifier + "')");
    }

    @Override // com.userleap.UserLeapInterface
    public void setPreviewKey(String previewKey) {
        Intrinsics.checkNotNullParameter(previewKey, "previewKey");
        m4079e("Sprig('setPreviewKey', '" + previewKey + "')");
    }

    @Override // com.userleap.UserLeapInterface
    public void setUserIdentifier(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        m4079e("Sprig('setUserId', '" + identifier + "')");
    }

    @Override // com.userleap.UserLeapInterface
    public void setVisitorAttribute(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        m4079e("Sprig('setAttribute', '" + key + "', '" + value + "')");
    }

    @Override // com.userleap.UserLeapInterface
    public void setVisitorAttributes(Map<String, String> attributes) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        m4079e("Sprig('setAttributes', " + new JSONObject((Map<?, ?>) attributes) + ')');
    }

    @Override // com.userleap.UserLeapInterface
    public void stopRecording() {
        m4099a(EnumC49010b.USER_INITIATED);
    }

    @Override // com.userleap.UserLeapInterface
    public void track(String event) {
        Intrinsics.checkNotNullParameter(event, "event");
        track(event, (Function1<? super SurveyState, Unit>) null);
    }

    @Override // com.userleap.UserLeapInterface
    public void trackAndPresent(String event, FragmentActivity fromActivity) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(fromActivity, "fromActivity");
        trackAndPresent(event, null, null, fromActivity);
    }

    /* renamed from: g */
    private final String m4085g(String str) {
        if (str == null || str.length() == 0) {
            return "undefined";
        }
        return '\'' + str + '\'';
    }

    @Override // com.userleap.UserLeapInterface
    public void configure(Context context, String environment, Map<String, ? extends Object> configuration, FragmentActivity reactFragmentActivity) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(environment, "environment");
        if (C48997e.f8239a.m4047a(new C49002j(context))) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
        if (hasConfigured) {
            return;
        }
        hasConfigured = true;
        isSdkReady = false;
        onSDKReadyData = null;
        isSdkReadyEventFired = false;
        sdkReadyQueue.clear();
        environmentId = environment;
        m4058a(new c(reactFragmentActivity, environment, configuration, this, context));
        m4071b(context);
    }

    @Override // com.userleap.UserLeapInterface
    public void presentSurveyWithId(String surveyId, Function1<? super SurveyState, Unit> callback) {
        Intrinsics.checkNotNullParameter(surveyId, "surveyId");
        String string2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "randomUUID().toString()");
        eventPayloads.put(string2, new EventPayload(surveyId, null, null, null, callback, null, 46, null));
        m4079e("Sprig.mobileDisplaySurvey('" + surveyId + "', '" + string2 + "')");
    }

    @Override // com.userleap.UserLeapInterface
    public void track(String event, Function1<? super SurveyState, Unit> callback) {
        Intrinsics.checkNotNullParameter(event, "event");
        track(event, null, null, null, callback);
    }

    @Override // com.userleap.UserLeapInterface
    public void trackAndPresent(String event, String userId, FragmentActivity fromActivity) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(fromActivity, "fromActivity");
        trackAndPresent(event, userId, null, fromActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public final void m4079e(String javascript) {
        if (isSdkReady) {
            m4062a(this, javascript, null, 2, null);
        } else if (isNetworkAvailable) {
            sdkReadyQueue.add(javascript);
        }
    }

    /* renamed from: f */
    private final void m4082f(String jsonData) throws JSONException {
        Object objM28550constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            JSONObject jSONObject = new JSONObject(jsonData);
            JSONObject jSONObject2 = jSONObject.getJSONObject("mobileReplaySettings");
            int i2 = jSONObject.getInt("maxMobileReplayDurationSeconds");
            boolean z = jSONObject2.getBoolean("maskSecureText");
            JSONArray jSONArray = jSONObject2.getJSONArray("maskClasses");
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i3 = 0; i3 < length; i3++) {
                arrayList.add(jSONArray.getString(i3));
            }
            long j2 = i2 * 1000;
            if (jSONObject.getInt("maxMobileReplayDurationSeconds") > 0) {
                m4054a(j2, arrayList, z);
            }
            objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            C49029a.m4295a(logger, "Error parsing sdkReadyPayload", null, "Error parsing sdkReadyPayload: " + jsonData + ". Error was: " + thM28553exceptionOrNullimpl, ExceptionsKt.stackTraceToString(thM28553exceptionOrNullimpl), null, null, 50, null);
        }
    }

    @Override // sprig.graphics.C49000h.a
    /* renamed from: d */
    public void mo4104d(String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        onSDKReadyData = data;
        m4059a(new k(data));
        m4091o();
    }

    @Override // com.userleap.UserLeapInterface
    public void setVisitorAttribute(String key, boolean value) {
        Intrinsics.checkNotNullParameter(key, "key");
        m4079e("Sprig('setAttribute', '" + key + "', '" + value + "')");
    }

    @Override // com.userleap.UserLeapInterface
    public void setVisitorAttributes(Map<String, String> attributes, String userId, String partnerAnonymousId) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        m4079e("Sprig.mobileIdentifyAndSetAttributes(" + m4085g(userId) + ", " + m4085g(partnerAnonymousId) + ", " + new JSONObject((Map<?, ?>) attributes) + ')');
    }

    @Override // com.userleap.UserLeapInterface
    public void track(String event, String userId, Function1<? super SurveyState, Unit> callback) {
        Intrinsics.checkNotNullParameter(event, "event");
        track(event, userId, null, null, callback);
    }

    @Override // com.userleap.UserLeapInterface
    public void trackAndPresent(String event, String userId, String partnerAnonymousId, FragmentActivity fromActivity) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(fromActivity, "fromActivity");
        trackAndPresent(new EventPayload(event, userId, partnerAnonymousId, null, null, null, 56, null), fromActivity);
    }

    /* renamed from: b */
    public final void m4102b(WeakReference<FragmentActivity> weakReference) {
        currentFragmentActivity = weakReference;
    }

    @Override // sprig.graphics.C49000h.a
    /* renamed from: c */
    public void mo4103c(String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        C49022n.EventDigest bVar = new C49022n.EventDigest(System.currentTimeMillis(), C49022n.c.SHOW_SURVEY, null, Integer.valueOf(new JSONObject(data).getInt("survey.id")), 4, null);
        C49022n c49022n = recorder;
        if (c49022n != null) {
            c49022n.m4242a(bVar);
        }
    }

    @Override // com.userleap.UserLeapInterface
    public void track(String event, String userId, String partnerAnonymousId) {
        Intrinsics.checkNotNullParameter(event, "event");
        track(event, userId, partnerAnonymousId, null, null);
    }

    @Override // com.userleap.UserLeapInterface
    public void trackAndPresent(EventPayload payload, FragmentActivity fromActivity) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(fromActivity, "fromActivity");
        if (shouldDismissOnPageChange) {
            C48995c.f8235a.m4039a(payload.getEvent(), fromActivity);
        }
        fromActivity.getSupportFragmentManager().registerFragmentLifecycleCallbacks(C48995c.f8235a, false);
        payload.setCallback(new s(payload, new WeakReference(fromActivity)));
        f8243a.track(payload);
    }

    @Override // sprig.graphics.C49000h.a
    /* renamed from: b */
    public void mo4101b(String id, String data) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(data, "data");
        visitorId = id;
        mo4098a("VISITOR_ID_UPDATED", data);
    }

    @Override // com.userleap.UserLeapInterface
    public void setVisitorAttribute(String key, int value) {
        Intrinsics.checkNotNullParameter(key, "key");
        m4079e("Sprig('setAttribute', '" + key + "', '" + value + "')");
    }

    @Override // com.userleap.UserLeapInterface
    public void track(String event, String userId, String partnerAnonymousId, Function1<? super SurveyState, Unit> callback) {
        Intrinsics.checkNotNullParameter(event, "event");
        track(event, userId, partnerAnonymousId, null, callback);
    }

    @Override // com.userleap.UserLeapInterface
    public void track(String event, Map<String, ? extends Object> properties) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(properties, "properties");
        track(event, null, null, properties, null);
    }

    @Override // sprig.graphics.C49000h.a
    /* renamed from: b */
    public void mo4100b(String data) {
        FragmentActivity fragmentActivity;
        Intrinsics.checkNotNullParameter(data, "data");
        WeakReference<FragmentActivity> weakReference = currentFragmentActivity;
        if (weakReference != null && (fragmentActivity = weakReference.get()) != null) {
            if (fragmentActivity.getLifecycle().getState().isAtLeast(Lifecycle.State.RESUMED)) {
                C49028a c49028aM4088j = f8243a.m4088j();
                if (c49028aM4088j != null) {
                    c49028aM4088j.dismiss();
                }
            } else {
                shouldDismissOnResume = true;
            }
        }
        C49022n.EventDigest bVar = new C49022n.EventDigest(System.currentTimeMillis(), C49022n.c.SUBMIT_SURVEY, null, null, 12, null);
        C49022n c49022n = recorder;
        if (c49022n != null) {
            c49022n.m4242a(bVar);
        }
        mo4098a("SURVEY_WILL_CLOSE", data);
    }

    @Override // com.userleap.UserLeapInterface
    public void track(String event, Map<String, ? extends Object> properties, Function1<? super SurveyState, Unit> callback) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(properties, "properties");
        track(event, null, null, properties, callback);
    }

    @Override // com.userleap.UserLeapInterface
    public void track(String event, String userId, Map<String, ? extends Object> properties, Function1<? super SurveyState, Unit> callback) {
        Intrinsics.checkNotNullParameter(event, "event");
        track(event, userId, null, properties, callback);
    }

    @Override // com.userleap.UserLeapInterface
    public void track(String event, String userId, String partnerAnonymousId, Map<String, ? extends Object> properties) {
        Intrinsics.checkNotNullParameter(event, "event");
        track(event, userId, partnerAnonymousId, properties, null);
    }

    @Override // sprig.graphics.C49000h.a
    /* renamed from: a */
    public void mo4097a(String callbackId, SurveyState state, String data) {
        Intrinsics.checkNotNullParameter(callbackId, "callbackId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(data, "data");
        Map<String, EventPayload> map = eventPayloads;
        EventPayload eventPayload = map.get(callbackId);
        if (eventPayload != null) {
            if (eventPayload.getShouldShowSurveyCallback() == null || eventPayload.getShouldShowSurveyCallback().invoke().booleanValue()) {
                Function1<SurveyState, Unit> callback = eventPayload.getCallback();
                if (callback != null) {
                    callback.invoke(state);
                }
            } else {
                f8243a.dismissActiveSurvey();
            }
        }
        map.remove(callbackId);
        mo4098a("SURVEY_APPEARED", data);
    }

    @Override // com.userleap.UserLeapInterface
    public void track(String event, String userId, String partnerAnonymousId, Map<String, ? extends Object> properties, Function1<? super SurveyState, Unit> callback) {
        Intrinsics.checkNotNullParameter(event, "event");
        track(new EventPayload(event, userId, partnerAnonymousId, properties, callback, null, 32, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005e  */
    @Override // com.userleap.UserLeapInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void track(EventPayload payload) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(payload, "payload");
        String string2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "randomUUID().toString()");
        eventPayloads.put(string2, payload);
        C49022n.EventDigest bVar = new C49022n.EventDigest(System.currentTimeMillis(), C49022n.c.TRACK_EVENT, payload.getEvent(), null, 8, null);
        C49022n c49022n = recorder;
        if (c49022n != null) {
            c49022n.m4242a(bVar);
        }
        String strReplace$default = StringsKt.replace$default(payload.getEvent(), "'", "\\'", false, 4, (Object) null);
        String userId = payload.getUserId();
        if (userId != null) {
            str = '\'' + userId + '\'';
            if (str == null) {
                str = "undefined";
            }
        }
        String partnerAnonymousId = payload.getPartnerAnonymousId();
        if (partnerAnonymousId != null) {
            str2 = '\'' + partnerAnonymousId + '\'';
            if (str2 == null) {
                str2 = "undefined";
            }
        }
        Map<String, Object> properties = payload.getProperties();
        f8243a.m4079e("Sprig.mobileTrackEvent('" + strReplace$default + "', " + str + ", " + str2 + ", " + (properties != null ? new JSONObject((Map<?, ?>) properties) : "undefined") + ", '" + string2 + "')");
    }

    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m3636d2 = {"Ljava/util/UUID;", "workId", "", "Lsprig/e/n$b;", "eventDigest", "", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "(Ljava/util/UUID;Ljava/util/List;)V"}, m3637k = 3, m3638mv = {1, 8, 0})
    /* renamed from: sprig.c.g$j */
    /* loaded from: classes28.dex */
    static final class j extends Lambda implements Function2<UUID, List<? extends C49022n.EventDigest>, Unit> {

        /* renamed from: a */
        final /* synthetic */ Ref.ObjectRef<ReplayData> f8283a;

        @Metadata(m3635d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m3636d2 = {"", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "()V"}, m3637k = 3, m3638mv = {1, 8, 0})
        /* renamed from: sprig.c.g$j$a */
        static final class a extends Lambda implements Function0<Unit> {

            /* renamed from: a */
            final /* synthetic */ C49009a f8284a;

            /* renamed from: b */
            final /* synthetic */ C49009a.CacheRecord f8285b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C49009a c49009a, C49009a.CacheRecord aVar) {
                super(0);
                this.f8284a = c49009a;
                this.f8285b = aVar;
            }

            /* renamed from: a */
            public final void m4124a() {
                this.f8284a.m4161a(this.f8285b.getWorkId());
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                m4124a();
                return Unit.INSTANCE;
            }
        }

        @Metadata(m3635d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m3636d2 = {"Lsprig/e/n$b;", "it", "", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "(Lsprig/e/n$b;)Ljava/lang/CharSequence;"}, m3637k = 3, m3638mv = {1, 8, 0})
        /* renamed from: sprig.c.g$j$b */
        static final class b extends Lambda implements Function1<C49022n.EventDigest, CharSequence> {

            /* renamed from: a */
            public static final b f8286a = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(C49022n.EventDigest it) {
                Intrinsics.checkNotNullParameter(it, "it");
                StringBuilder sb = new StringBuilder();
                sb.append("{ type: \"");
                sb.append(it.getType());
                sb.append("\", timestampUnixMs: ");
                sb.append(it.getTimestamp());
                sb.append(", name: \"");
                String strM4253a = it.getName();
                if (strM4253a == null) {
                    strM4253a = "";
                }
                sb.append(strM4253a);
                sb.append("\", surveyId: ");
                Object objM4254b = it.getSurveyId();
                if (objM4254b == null) {
                    objM4254b = "null";
                }
                sb.append(objM4254b);
                sb.append(" } ");
                return sb.toString();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Ref.ObjectRef<ReplayData> objectRef) {
            super(2);
            this.f8283a = objectRef;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final void m4123a(UUID workId, List<C49022n.EventDigest> eventDigest) {
            Intrinsics.checkNotNullParameter(workId, "workId");
            Intrinsics.checkNotNullParameter(eventDigest, "eventDigest");
            final String str = '[' + CollectionsKt.joinToString$default(eventDigest, ",", null, null, 0, null, b.f8286a, 30, null) + ']';
            C48999g c48999g = C48999g.f8243a;
            android.os.Handler handlerM4090n = c48999g.m4090n();
            final Ref.ObjectRef<ReplayData> objectRef = this.f8283a;
            handlerM4090n.post(new Runnable() { // from class: sprig.c.g$j$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C48999g.j.m4122a(objectRef, str);
                }
            });
            C49009a c49009a = new C49009a(c48999g.m4089k(), null, 2, 0 == true ? 1 : 0);
            C49009a.CacheRecord aVar = new C49009a.CacheRecord(workId, this.f8283a.element.getSurveyId(), this.f8283a.element.getResponseGroupUid(), str);
            c49009a.m4163a(aVar);
            c48999g.m4057a(workId, new a(c49009a, aVar));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(UUID uuid, List<? extends C49022n.EventDigest> list) {
            m4123a(uuid, (List<C49022n.EventDigest>) list);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public static final void m4122a(Ref.ObjectRef replayData, String eventDigestJSArray) {
            Intrinsics.checkNotNullParameter(replayData, "$replayData");
            Intrinsics.checkNotNullParameter(eventDigestJSArray, "$eventDigestJSArray");
            String str = "Sprig._completeSessionReplay({ surveyId: " + ((ReplayData) replayData.element).getSurveyId() + ", responseGroupUuid: \"" + ((ReplayData) replayData.element).getResponseGroupUid() + "\", eventDigest: " + eventDigestJSArray + " });";
            C49000h c49000h = C48999g.webView;
            if (c49000h == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webView");
                c49000h = null;
            }
            C49000h.m4135a(c49000h, str, null, 2, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    static /* synthetic */ void m4062a(C48999g c48999g, String str, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        c48999g.m4055a(str, (Function1<? super String, Void>) function1);
    }

    /* renamed from: a */
    private final void m4055a(String javascript, Function1<? super String, Void> callback) {
        m4058a(new d(javascript, callback));
    }

    /* renamed from: a */
    private final void m4059a(final Function1<? super Boolean, Unit> listener) {
        C49000h c49000h = webView;
        if (c49000h == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            c49000h = null;
        }
        c49000h.setDismissOnPageChangeListener(new C49000h.c() { // from class: sprig.c.g$$ExternalSyntheticLambda1
            @Override // sprig.graphics.C49000h.c
            /* renamed from: a */
            public final void mo4108a(boolean z) {
                C48999g.m4060a(listener, z);
            }
        });
        m4062a(this, "android_hook.getDismissOnPageChange(Sprig._config.dismissOnPageChange)", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m4072b(Function0 function) {
        Object objM28550constructorimpl;
        Intrinsics.checkNotNullParameter(function, "$function");
        try {
            Result.Companion companion = Result.INSTANCE;
            function.invoke();
            objM28550constructorimpl = Result.m28550constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        C48999g c48999g = f8243a;
        Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
        if (thM28553exceptionOrNullimpl != null) {
            c48999g.m4056a(thM28553exceptionOrNullimpl);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m4060a(Function1 listener, boolean z) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        listener.invoke(Boolean.valueOf(z));
        C49000h c49000h = webView;
        if (c49000h == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            c49000h = null;
        }
        c49000h.setDismissOnPageChangeListener(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final FragmentActivity m4069b(FragmentActivity fragmentActivity) {
        if (fragmentActivity.isFinishing() || fragmentActivity.isDestroyed()) {
            return null;
        }
        return fragmentActivity;
    }

    /* renamed from: b */
    private final void m4071b(Context context) {
        NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).addTransportType(1).addTransportType(0).build();
        Intrinsics.checkNotNullExpressionValue(networkRequestBuild, "Builder()\n            .a…LAR)\n            .build()");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ((ConnectivityManager) systemService).registerNetworkCallback(networkRequestBuild, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final Function1<SurveyState, Unit> m4050a(WeakReference<FragmentActivity> weakReference) {
        return new l(weakReference);
    }

    @Override // sprig.graphics.C49000h.a
    /* renamed from: a */
    public void mo4098a(String name, String event) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(event, "event");
        SprigEvent sprigEventM3205a = SprigEvent.INSTANCE.m3205a(name, event);
        if (sprigEventM3205a != null) {
            C48994b.f8232a.m4034a(sprigEventM3205a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m4057a(UUID workId, Function0<Unit> completionHandler) {
        if (workId == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope3.INSTANCE, Dispatchers.getMain(), null, new g(workId, completionHandler, null), 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0103  */
    /* JADX WARN: Type inference failed for: r2v11, types: [T, sprig.c.g$b] */
    @Override // sprig.graphics.C49000h.a
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo4096a(String data) throws JSONException {
        JSONObject jSONObject;
        long replayDurationSeconds;
        long replayDurationSeconds2;
        Intrinsics.checkNotNullParameter(data, "data");
        if (!C49012d.m4170a()) {
            C49029a.m4295a(logger, "Not allowed to record", null, null, null, null, null, 62, null);
            return;
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Unit unit = null;
        try {
            JSONObject jSONObject2 = new JSONObject(data);
            String string2 = jSONObject2.getString("surveyId");
            Intrinsics.checkNotNullExpressionValue(string2, "it.getString(\"surveyId\")");
            String string3 = jSONObject2.getString("responseGroupUid");
            Intrinsics.checkNotNullExpressionValue(string3, "it.getString(\"responseGroupUid\")");
            String string4 = jSONObject2.getString("replayType");
            Intrinsics.checkNotNullExpressionValue(string4, "it.getString(\"replayType\")");
            objectRef.element = new ReplayData(string2, string3, new ReplayConfig(string4, jSONObject2.getLong("seconds")));
            jSONObject = new JSONObject(data).getJSONObject("generateVideoUploadUrlPayload");
        } catch (Exception e) {
            C49029a.m4295a(logger, "Error parsing replayData", null, "Error parsing replayData: " + data + ". Error was: " + e, ExceptionsKt.stackTraceToString(e), null, null, 50, null);
            jSONObject = null;
        }
        T t = objectRef.element;
        if (t != 0 && jSONObject != null) {
            String replayDurationType = ((ReplayData) t).getReplayConfig().getReplayDurationType();
            int iHashCode = replayDurationType.hashCode();
            if (iHashCode != -1392885889) {
                if (iHashCode != 92734940) {
                    if (iHashCode == 1103159012 && replayDurationType.equals("beforeAndAfter")) {
                        long replayDurationSeconds3 = ((ReplayData) objectRef.element).getReplayConfig().getReplayDurationSeconds();
                        replayDurationSeconds2 = ((ReplayData) objectRef.element).getReplayConfig().getReplayDurationSeconds();
                        replayDurationSeconds = replayDurationSeconds3;
                    } else {
                        C49029a.m4295a(logger, "Invalid replayDurationType", null, data, null, null, null, 58, null);
                        replayDurationSeconds = 0;
                        replayDurationSeconds2 = 0;
                    }
                } else if (replayDurationType.equals("after")) {
                    replayDurationSeconds2 = ((ReplayData) objectRef.element).getReplayConfig().getReplayDurationSeconds();
                    replayDurationSeconds = 0;
                }
            } else if (replayDurationType.equals("before")) {
                replayDurationSeconds = ((ReplayData) objectRef.element).getReplayConfig().getReplayDurationSeconds();
                replayDurationSeconds2 = 0;
            }
            if (replayDurationSeconds == 0 && replayDurationSeconds2 == 0) {
                C49029a.m4295a(logger, "Invalid replayDurationSeconds", null, data, null, null, null, 58, null);
                return;
            }
            String str = onSDKReadyData;
            if (str != null) {
                f8243a.m4082f(str);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                C49029a.m4295a(logger, "SDK data is missing. make sure that SDK is ready. Recording not started.", null, null, null, null, null, 62, null);
                return;
            }
            j jVar = new j(objectRef);
            if (recorder == null) {
                C49029a.m4295a(logger, "Recorder is null", null, "Recorder is null", null, null, null, 58, null);
            }
            C49022n c49022n = recorder;
            if (c49022n != null) {
                c49022n.m4235a(replayDurationSeconds, replayDurationSeconds2, jSONObject, jVar);
                return;
            }
            return;
        }
        C49029a.m4295a(logger, "replayData is null or generateUrlPayload is null", null, "Error parsing replayData: " + data, null, null, null, 58, null);
    }

    /* renamed from: a */
    private final void m4054a(long replayWindowInMilliseconds, List<String> viewsClassNamesToRedact, boolean maskSecureText) throws JSONException {
        WeakReference<FragmentActivity> weakReference;
        C49022n c49022n;
        if (!C49012d.m4170a()) {
            C49029a.m4295a(logger, "Not allowed to record", null, null, null, null, null, 62, null);
            return;
        }
        if (recorder == null && (weakReference = currentFragmentActivity) != null) {
            FragmentActivity fragmentActivity = weakReference.get();
            if (fragmentActivity == null) {
                C49029a.m4295a(logger, "Can't start recording", null, "Activity is null", null, null, null, 58, null);
                return;
            }
            C48999g c48999g = f8243a;
            if (!c48999g.m4067a((Context) fragmentActivity)) {
                C49029a.m4295a(logger, "Not enough free disk space", null, "Not enough free disk space", null, null, null, 58, null);
                return;
            }
            View viewM4048a = c48999g.m4048a(fragmentActivity);
            if (viewM4048a != null) {
                List listMutableListOf = CollectionsKt.mutableListOf(new C49011c(viewsClassNamesToRedact));
                if (maskSecureText) {
                    listMutableListOf.add(new C49021m());
                }
                c49022n = new C49022n(null, 0, 0, listMutableListOf, 7, null);
                c49022n.m4248c(viewM4048a);
                c49022n.m4238a(new WeakReference<>(fragmentActivity));
                c49022n.m4247c(replayWindowInMilliseconds + WebsocketGatewayConstants.CLIENT_IDLE_TIMEOUT_MS);
                c49022n.m4252i();
                Window window = fragmentActivity.getWindow();
                if (window != null) {
                    Intrinsics.checkNotNullExpressionValue(window, "window");
                    Window.Callback callback = window.getCallback();
                    if (callback != null) {
                        Intrinsics.checkNotNullExpressionValue(callback, "callback");
                        window.setCallback(new WindowCallbackC49023o(callback, new Point(c49022n), new q(c49022n)));
                    }
                }
                fragmentActivity.getApplicationContext().registerComponentCallbacks(r.f8296a);
            } else {
                c49022n = null;
            }
            recorder = c49022n;
        }
    }

    /* renamed from: a */
    private final boolean m4067a(Context context) {
        return context.registerReceiver(null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) == null;
    }

    /* renamed from: a */
    public final void m4099a(EnumC49010b reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        C49022n c49022n = recorder;
        if (c49022n != null) {
            c49022n.m4240a(reason);
        }
        recorder = null;
    }

    /* renamed from: a */
    public final void m4095a(ViewGroup view, Function0<Unit> dismissView) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(dismissView, "dismissView");
        C49000h c49000h = null;
        if (webView != null) {
            m4090n().removeCallbacks(resetWebView);
            isSdkReady = true;
            C49000h c49000h2 = webView;
            if (c49000h2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webView");
                c49000h2 = null;
            }
            if (c49000h2.getParent() != null) {
                dismissView.invoke();
                m4056a(new IllegalStateException("[Sprig] Prevented displaying survey because provided view already has parent"));
                return;
            }
            C49000h c49000h3 = webView;
            if (c49000h3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webView");
                c49000h3 = null;
            }
            c49000h3.setFilterTouchesWhenObscured(true);
            view.setFilterTouchesWhenObscured(true);
            C49022n c49022n = recorder;
            if (c49022n != null) {
                C49000h c49000h4 = webView;
                if (c49000h4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("webView");
                    c49000h4 = null;
                }
                c49022n.m4239a(c49000h4);
            }
            C49000h c49000h5 = webView;
            if (c49000h5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webView");
            } else {
                c49000h = c49000h5;
            }
            view.addView(c49000h);
            return;
        }
        C49022n c49022n2 = recorder;
        if (c49022n2 != null) {
            c49022n2.m4239a((C49000h) null);
        }
        dismissView.invoke();
    }

    /* renamed from: a */
    public final void m4094a(ViewGroup view) {
        Intrinsics.checkNotNullParameter(view, "view");
        C49000h c49000h = webView;
        if (c49000h == null) {
            return;
        }
        view.removeView(c49000h);
        C49022n c49022n = recorder;
        if (c49022n != null) {
            c49022n.m4239a((C49000h) null);
        }
        m4090n().postDelayed(resetWebView, 1000L);
        isSdkReady = false;
        onSDKReadyData = null;
    }

    /* renamed from: a */
    private final void m4058a(final Function0<Unit> function) {
        m4090n().post(new Runnable() { // from class: sprig.c.g$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C48999g.m4072b(function);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final void m4056a(Throwable exception) {
        m4062a(this, "Sprig('postError', { message: '" + exception.getMessage() + "', stack: " + exception.getStackTrace() + " });", null, 2, null);
    }

    /* renamed from: a */
    private final View m4048a(FragmentActivity fragmentActivity) {
        View viewFindViewById;
        if (fragmentActivity == null || (viewFindViewById = fragmentActivity.findViewById(R.id.content)) == null) {
            return null;
        }
        return viewFindViewById.getRootView();
    }
}
