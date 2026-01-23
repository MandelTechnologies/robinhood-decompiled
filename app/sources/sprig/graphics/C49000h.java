package sprig.graphics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.core.os.LocaleListCompat;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.singular.sdk.internal.Constants;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import com.userleap.R$color;
import com.userleap.SurveyState;
import java.io.IOException;
import java.io.StringReader;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import sprig.p544b.C48992b;
import sprig.p549g.C49029a;

@Metadata(m3635d1 = {"\u0000[\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005*\u0001*\b\u0007\u0018\u0000 52\u00020\u0001:\u0004\u0003\r\u0013\u0019BK\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u0006\u0010\b\u001a\u000200\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u000f\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J&\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004R%\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R*\u0010!\u001a\u0004\u0018\u00010\u00188\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010)\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u00066"}, m3636d2 = {"Lsprig/c/h;", "Landroid/webkit/WebView;", "", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "()Ljava/lang/String;", "javascript", "Lkotlin/Function1;", "Ljava/lang/Void;", "callback", "", "Lsprig/g/a;", "Lsprig/g/a;", "logger", "b", "Ljava/lang/String;", "getEnvironment", "environment", "", "", "c", "Ljava/util/Map;", "getConfiguration", "()Ljava/util/Map;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lsprig/c/h$d;", "d", "Lsprig/c/h$d;", "getLastJSMessage$userleap_release", "()Lsprig/c/h$d;", "setLastJSMessage$userleap_release", "(Lsprig/c/h$d;)V", "getLastJSMessage$userleap_release$annotations", "()V", "lastJSMessage", "Lsprig/c/h$c;", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "Lsprig/c/h$c;", "getDismissOnPageChangeListener", "()Lsprig/c/h$c;", "setDismissOnPageChangeListener", "(Lsprig/c/h$c;)V", "dismissOnPageChangeListener", "sprig/c/h$e", "f", "Lsprig/c/h$e;", "javascriptInterface", "Landroid/content/Context;", "context", "Lsprig/c/h$a;", "", "backgroundColor", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;Lsprig/c/h$a;Lsprig/g/a;I)V", "g", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
@SuppressLint({"SetJavaScriptEnabled", "ViewConstructor"})
/* renamed from: sprig.c.h */
/* loaded from: classes28.dex */
public final class C49000h extends WebView {

    /* renamed from: a, reason: from kotlin metadata */
    private final C49029a logger;

    /* renamed from: b, reason: from kotlin metadata */
    private final String environment;

    /* renamed from: c, reason: from kotlin metadata */
    private final Map<String, Object> configuration;

    /* renamed from: d, reason: from kotlin metadata */
    private JSConsoleMessage lastJSMessage;

    /* renamed from: e, reason: from kotlin metadata */
    private c dismissOnPageChangeListener;

    /* renamed from: f, reason: from kotlin metadata */
    private final e javascriptInterface;

    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u000f"}, m3636d2 = {"Lsprig/c/h$a;", "", "", WebsocketGatewayConstants.DATA_KEY, "", "d", "id", "b", "callbackId", "Lcom/userleap/SurveyState;", "state", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "c", "name", "event", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
    /* renamed from: sprig.c.h$a */
    /* loaded from: classes23.dex */
    public interface a {
        /* renamed from: a */
        void mo4096a(String data);

        /* renamed from: a */
        void mo4097a(String callbackId, SurveyState state, String data);

        /* renamed from: a */
        void mo4098a(String name, String event);

        /* renamed from: b */
        void mo4100b(String data);

        /* renamed from: b */
        void mo4101b(String id, String data);

        /* renamed from: c */
        void mo4103c(String data);

        /* renamed from: d */
        void mo4104d(String data);
    }

    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m3636d2 = {"Lsprig/c/h$c;", "", "", "dismiss", "", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
    /* renamed from: sprig.c.h$c */
    public interface c {
        /* renamed from: a */
        void mo4108a(boolean dismiss);
    }

    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u000e\u0010\f¨\u0006\u0014"}, m3636d2 = {"Lsprig/c/h$d;", "", "", "toString", "", "hashCode", "other", "", "equals", Constants.RequestParamsKeys.DEVELOPER_API_KEY, "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "type", "b", "level", "c", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
    /* renamed from: sprig.c.h$d, reason: from toString */
    public static final /* data */ class JSConsoleMessage {

        /* renamed from: a, reason: from kotlin metadata and from toString */
        private final String type;

        /* renamed from: b, reason: from kotlin metadata and from toString */
        private final String level;

        /* renamed from: c, reason: from kotlin metadata and from toString */
        private final String message;

        public JSConsoleMessage(String type2, String level, String message) {
            Intrinsics.checkNotNullParameter(type2, "type");
            Intrinsics.checkNotNullParameter(level, "level");
            Intrinsics.checkNotNullParameter(message, "message");
            this.type = type2;
            this.level = level;
            this.message = message;
        }

        /* renamed from: a, reason: from getter */
        public final String getLevel() {
            return this.level;
        }

        /* renamed from: b, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof JSConsoleMessage)) {
                return false;
            }
            JSConsoleMessage jSConsoleMessage = (JSConsoleMessage) other;
            return Intrinsics.areEqual(this.type, jSConsoleMessage.type) && Intrinsics.areEqual(this.level, jSConsoleMessage.level) && Intrinsics.areEqual(this.message, jSConsoleMessage.message);
        }

        public int hashCode() {
            return (((this.type.hashCode() * 31) + this.level.hashCode()) * 31) + this.message.hashCode();
        }

        public String toString() {
            return "JSConsoleMessage(type=" + this.type + ", level=" + this.level + ", message=" + this.message + ')';
        }
    }

    @Metadata(m3635d1 = {"\u0000\u001f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J \u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\r\u001a\u00020\u0002H\u0007J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0007J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0016"}, m3636d2 = {"sprig/c/h$e", "", "", WebsocketGatewayConstants.DATA_KEY, "", "sdkReady", "vid", "visitorIdUpdated", "callbackId", "callbackValue", "surveyCallback", "surveyWillDismiss", "surveyWillAppear", "environment", "", "dismiss", "getDismissOnPageChange", "name", "event", "onSdkEvent", "scheduleOrCaptureReplay", "postJSConsoleMessage", "userleap_release"}, m3637k = 1, m3638mv = {1, 8, 0})
    /* renamed from: sprig.c.h$e */
    public static final class e {

        /* renamed from: a */
        final /* synthetic */ a f8309a;

        /* renamed from: b */
        final /* synthetic */ String f8310b;

        /* renamed from: c */
        final /* synthetic */ C49000h f8311c;

        e(a aVar, String str, C49000h c49000h) {
            this.f8309a = aVar;
            this.f8310b = str;
            this.f8311c = c49000h;
        }

        @JavascriptInterface
        /* renamed from: environment, reason: from getter */
        public final String getF8310b() {
            return this.f8310b;
        }

        @JavascriptInterface
        public final void getDismissOnPageChange(boolean dismiss) {
            c dismissOnPageChangeListener = this.f8311c.getDismissOnPageChangeListener();
            if (dismissOnPageChangeListener != null) {
                dismissOnPageChangeListener.mo4108a(dismiss);
            }
        }

        @JavascriptInterface
        public final void onSdkEvent(String name, String event) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(event, "event");
            this.f8309a.mo4098a(name, event);
        }

        @JavascriptInterface
        public final void postJSConsoleMessage(String data) {
            Intrinsics.checkNotNullParameter(data, "data");
            JSONObject jSONObject = new JSONObject(data);
            C49000h c49000h = this.f8311c;
            try {
                Result.Companion companion = Result.INSTANCE;
                String string2 = jSONObject.getString("type");
                Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.getString(\"type\")");
                String string3 = jSONObject.getString("level");
                Intrinsics.checkNotNullExpressionValue(string3, "jsonObject.getString(\"level\")");
                String string4 = jSONObject.getString("message");
                Intrinsics.checkNotNullExpressionValue(string4, "jsonObject.getString(\"message\")");
                c49000h.setLastJSMessage$userleap_release(new JSConsoleMessage(string2, string3, string4));
                Result.m28550constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
        }

        @JavascriptInterface
        public final void scheduleOrCaptureReplay(String data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f8309a.mo4096a(data);
        }

        @JavascriptInterface
        public final void sdkReady(String data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f8309a.mo4104d(data);
        }

        @JavascriptInterface
        public final void surveyCallback(String callbackId, String callbackValue, String data) {
            Intrinsics.checkNotNullParameter(callbackId, "callbackId");
            Intrinsics.checkNotNullParameter(callbackValue, "callbackValue");
            Intrinsics.checkNotNullParameter(data, "data");
            this.f8309a.mo4097a(callbackId, C48992b.m4024a(callbackValue), data);
        }

        @JavascriptInterface
        public final void surveyWillAppear(String data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f8309a.mo4103c(data);
        }

        @JavascriptInterface
        public final void surveyWillDismiss(String data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f8309a.mo4100b(data);
        }

        @JavascriptInterface
        public final void visitorIdUpdated(String vid, String data) {
            Intrinsics.checkNotNullParameter(vid, "vid");
            Intrinsics.checkNotNullParameter(data, "data");
            this.f8309a.mo4101b(vid, data);
        }
    }

    public /* synthetic */ C49000h(Context context, String str, Map map, a aVar, C49029a c49029a, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i2 & 4) != 0 ? null : map, aVar, (i2 & 16) != 0 ? new C49029a() : c49029a, (i2 & 32) != 0 ? ContextCompat.getColor(context.getApplicationContext(), R$color.userleap_transparent) : i);
    }

    public static /* synthetic */ void getLastJSMessage$userleap_release$annotations() {
    }

    /* renamed from: a */
    public final String m4136a() {
        Object obj;
        Object obj2;
        String str = getContext().getPackageManager().getPackageInfo(getContext().getPackageName(), 0).versionName;
        if (str == null) {
            str = "Unknown";
        }
        String str2 = Build.VERSION.RELEASE;
        String str3 = str2 != null ? str2 : "Unknown";
        String strValueOf = String.valueOf(Build.VERSION.SDK_INT);
        Map mapMutableMapOf = MapsKt.mutableMapOf(Tuples4.m3642to("userleap-platform", "android"), Tuples4.m3642to("x-ul-mobile-user-agent", "UserLeap/android;Version=2.17.6;OSVersion=" + str3 + ";OSAPILevel=" + strValueOf + "AppVersion=" + str + ';'), Tuples4.m3642to("x-ul-mobile-sdk-version", "2.17.6"), Tuples4.m3642to("x-ul-app-version", str), Tuples4.m3642to("x-ul-os-version", str3), Tuples4.m3642to("x-ul-os-api-level", strValueOf), Tuples4.m3642to("x-ul-environment", this.environment), Tuples4.m3642to("accept-language", LocaleListCompat.getDefault().toLanguageTags()));
        Map<String, Object> map = this.configuration;
        if (map != null && (obj2 = map.get("x-ul-installation-method")) != null) {
        }
        Map<String, Object> map2 = this.configuration;
        if (map2 != null && (obj = map2.get("x-ul-package-version")) != null) {
        }
        Intrinsics.checkNotNull(mapMutableMapOf, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        String string2 = new JSONObject((Map<?, ?>) mapMutableMapOf).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "JSONObject(headers as Map<*, *>).toString()");
        return string2;
    }

    public final Map<String, Object> getConfiguration() {
        return this.configuration;
    }

    public final c getDismissOnPageChangeListener() {
        return this.dismissOnPageChangeListener;
    }

    public final String getEnvironment() {
        return this.environment;
    }

    /* renamed from: getLastJSMessage$userleap_release, reason: from getter */
    public final JSConsoleMessage getLastJSMessage() {
        return this.lastJSMessage;
    }

    public final void setDismissOnPageChangeListener(c cVar) {
        this.dismissOnPageChangeListener = cVar;
    }

    public final void setLastJSMessage$userleap_release(JSConsoleMessage jSConsoleMessage) {
        this.lastJSMessage = jSConsoleMessage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49000h(Context context, String environment, Map<String, ? extends Object> map, a callback, C49029a logger, int i) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.logger = logger;
        this.configuration = map;
        e eVar = new e(callback, environment, this);
        this.javascriptInterface = eVar;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.environment = environment;
        clearCache(true);
        WebView.setWebContentsDebuggingEnabled(false);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(true);
        measure(100, 100);
        getSettings().setUseWideViewPort(true);
        getSettings().setLoadWithOverviewMode(true);
        addJavascriptInterface(eVar, "android_hook");
        setWebViewClient(C48998f.f8242a);
        loadUrl("file:///android_asset/snippet.html");
        setBackgroundColor(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ void m4135a(C49000h c49000h, String str, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        c49000h.m4137a(str, function1);
    }

    /* renamed from: a */
    public final void m4137a(final String javascript, final Function1<? super String, Void> callback) {
        Intrinsics.checkNotNullParameter(javascript, "javascript");
        evaluateJavascript(javascript, new ValueCallback() { // from class: sprig.c.h$$ExternalSyntheticLambda0
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) throws IOException {
                C49000h.m4134a(callback, this, javascript, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static final void m4134a(Function1 function1, C49000h this$0, String javascript, String str) throws IOException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(javascript, "$javascript");
        JsonReader jsonReader = new JsonReader(new StringReader(str));
        jsonReader.setLenient(true);
        try {
            try {
                try {
                    JsonToken jsonTokenPeek = jsonReader.peek();
                    if (jsonTokenPeek != JsonToken.NULL && jsonTokenPeek == JsonToken.STRING) {
                        String strNextString = jsonReader.nextString();
                        Intrinsics.checkNotNullExpressionValue(strNextString, "reader.nextString()");
                        if (function1 != null) {
                        }
                    }
                    jsonReader.close();
                } catch (IOException e2) {
                    C49029a c49029a = this$0.logger;
                    StringBuilder sb = new StringBuilder();
                    sb.append("\n                        Javascript was: ");
                    sb.append(javascript);
                    sb.append(".\n                        Error message: ");
                    sb.append(e2.getMessage());
                    sb.append(".\n                        Last console message: ");
                    JSConsoleMessage jSConsoleMessage = this$0.lastJSMessage;
                    sb.append(jSConsoleMessage != null ? jSConsoleMessage.getMessage() : null);
                    sb.append(".\n                        Last console message level: ");
                    JSConsoleMessage jSConsoleMessage2 = this$0.lastJSMessage;
                    sb.append(jSConsoleMessage2 != null ? jSConsoleMessage2.getLevel() : null);
                    sb.append(".\n                    ");
                    C49029a.m4295a(c49029a, "Error evaluating javascript", null, StringsKt.trimIndent(sb.toString()), null, null, null, 58, null);
                    Log.e("Android Web View", "IOException", e2);
                    jsonReader.close();
                }
            } finally {
            }
        } catch (IOException unused) {
        }
    }
}
