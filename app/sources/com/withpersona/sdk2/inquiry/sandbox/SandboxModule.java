package com.withpersona.sdk2.inquiry.sandbox;

import com.adjust.sdk.Constants;
import com.robinhood.android.navigation.compose.NavTransition2;
import com.squareup.workflow1.p415ui.ViewFactory;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Buffer;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SandboxModule.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\t"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/sandbox/SandboxModule;", "", "<init>", "()V", "interceptor", "Lokhttp3/Interceptor;", "flags", "Lcom/withpersona/sdk2/inquiry/sandbox/SandboxFlags;", "Companion", "sandbox_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class SandboxModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    public static final Set<ViewFactory<?>> provideViewBindings() {
        return INSTANCE.provideViewBindings();
    }

    public final Interceptor interceptor(final SandboxFlags flags) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        return new Interceptor() { // from class: com.withpersona.sdk2.inquiry.sandbox.SandboxModule$$ExternalSyntheticLambda0
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                return SandboxModule.interceptor$lambda$4(flags, chain);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Response interceptor$lambda$4(SandboxFlags sandboxFlags, Interceptor.Chain chain) throws JSONException, IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        RequestBody body = request.getBody();
        if ((Intrinsics.areEqual(CollectionsKt.last((List) request.getUrl().pathSegments()), NavTransition2.KEY_TRANSITION) || Intrinsics.areEqual(CollectionsKt.last((List) request.getUrl().pathSegments()), "government-id-classification")) && body != null && sandboxFlags.getIsSandboxModeEnabled()) {
            String key = SandboxFlags.INSTANCE.toKey(sandboxFlags.getDebugForcedStatus());
            MediaType contentType = body.getContentType();
            String str = null;
            Object[] objArr = 0;
            String subtype = contentType != null ? contentType.getSubtype() : null;
            if (Intrinsics.areEqual(subtype, "form-data")) {
                MultipartBody multipartBody = (MultipartBody) body;
                MultipartBody.Builder type2 = new MultipartBody.Builder(str, 1, objArr == true ? 1 : 0).setType(multipartBody.getContentType());
                Iterator<T> it = multipartBody.parts().iterator();
                while (it.hasNext()) {
                    type2.addPart((MultipartBody.Part) it.next());
                }
                return chain.proceed(request.newBuilder().method(request.getMethod(), type2.addFormDataPart("meta[workflowInitialVariables][debugForcedStatus]", key).build()).build());
            }
            if (Intrinsics.areEqual(subtype, "json")) {
                Buffer buffer = new Buffer();
                body.writeTo(buffer);
                JSONObject jSONObject = new JSONObject(buffer.readUtf8());
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(Constants.REFERRER_API_META);
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                jSONObjectOptJSONObject.put("workflowInitialVariables", new JSONObject().put("debugForcedStatus", key));
                jSONObject.put(Constants.REFERRER_API_META, jSONObjectOptJSONObject);
                RequestBody.Companion companion = RequestBody.INSTANCE;
                String string2 = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                return chain.proceed(request.newBuilder().method(request.getMethod(), companion.create(string2, body.getContentType())).build());
            }
            return chain.proceed(request);
        }
        return chain.proceed(request);
    }

    /* compiled from: SandboxModule.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005H\u0007¨\u0006\u0007"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/sandbox/SandboxModule$Companion;", "", "<init>", "()V", "provideViewBindings", "", "Lcom/squareup/workflow1/ui/ViewFactory;", "sandbox_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Set<ViewFactory<?>> provideViewBindings() {
            return SetsKt.setOf(SandboxScreenRunner.INSTANCE);
        }
    }
}
