package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import android.content.Context;
import android.content.res.Resources;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.StaticTemplateSession;
import com.withpersona.sdk2.inquiry.internal.network.InquiryAttributes;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import kotlin.p481io.ReadWrite2;
import kotlin.text.Charsets;
import okhttp3.RequestBody;
import org.json.JSONArray;
import org.json.JSONObject;
import retrofit2.Response;

/* compiled from: ApiController.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001bB+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0096@¢\u0006\u0002\u0010\u0019J\"\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0096@¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/OfflineModeApiController;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/ApiController;", "moshi", "Lcom/squareup/moshi/Moshi;", "context", "Landroid/content/Context;", "staticTemplateSessionFactory", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/StaticTemplateSession$Factory;", "staticTemplateResourceId", "", "<init>", "(Lcom/squareup/moshi/Moshi;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/StaticTemplateSession$Factory;I)V", "createSession", "Lkotlin/Result;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/StaticTemplateSession;", "attributes", "Lcom/withpersona/sdk2/inquiry/internal/network/InquiryAttributes;", "createSession-gIAlu-s", "(Lcom/withpersona/sdk2/inquiry/internal/network/InquiryAttributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transitionWithRequestBody", "Lretrofit2/Response;", "sessionToken", "", CarResultComposable2.BODY, "Lokhttp3/RequestBody;", "(Ljava/lang/String;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transitionBack", "Factory", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class OfflineModeApiController implements ApiController {
    private final Context context;
    private final Moshi moshi;
    private final int staticTemplateResourceId;
    private final StaticTemplateSession.Factory staticTemplateSessionFactory;

    /* compiled from: ApiController.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/OfflineModeApiController$Factory;", "", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/OfflineModeApiController;", "staticTemplateResourceId", "", "inquiry-internal_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public interface Factory {
        OfflineModeApiController create(int staticTemplateResourceId);
    }

    public OfflineModeApiController(Moshi moshi, Context context, StaticTemplateSession.Factory staticTemplateSessionFactory, int i) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(staticTemplateSessionFactory, "staticTemplateSessionFactory");
        this.moshi = moshi;
        this.context = context;
        this.staticTemplateSessionFactory = staticTemplateSessionFactory;
        this.staticTemplateResourceId = i;
    }

    @Override // com.withpersona.sdk2.inquiry.internal.fallbackmode.ApiController
    /* renamed from: createSession-gIAlu-s */
    public Object mo27391createSessiongIAlus(InquiryAttributes inquiryAttributes, Continuation<? super Result<StaticTemplateSession>> continuation) throws Resources.NotFoundException {
        String string2;
        try {
            InputStream inputStreamOpenRawResource = this.context.getResources().openRawResource(this.staticTemplateResourceId);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpenRawResource, "openRawResource(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, Charsets.UTF_8), 8192);
            try {
                String text = ReadWrite2.readText(bufferedReader);
                ArrayList arrayList = null;
                Closeable.closeFinally(bufferedReader, null);
                JSONArray jSONArrayOptJSONArray = new JSONObject(text).optJSONArray("steps");
                if (jSONArrayOptJSONArray == null || (string2 = jSONArrayOptJSONArray.toString()) == null) {
                    Result.Companion companion = Result.INSTANCE;
                    return Result.m28550constructorimpl(ResultKt.createFailure(new FallbackException("Failed to open resource as static template")));
                }
                List list = (List) this.moshi.adapter(Types.newParameterizedType(List.class, NextStep.class)).fromJson(string2);
                if (list != null) {
                    List list2 = list;
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add((NextStep) it.next());
                    }
                }
                if (arrayList == null || arrayList.isEmpty()) {
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m28550constructorimpl(ResultKt.createFailure(new FallbackException("Expected steps to contain at least one step")));
                }
                Result.Companion companion3 = Result.INSTANCE;
                StaticTemplateSession.Factory factory = this.staticTemplateSessionFactory;
                String string3 = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                return Result.m28550constructorimpl(factory.create(arrayList, string3));
            } finally {
            }
        } catch (Exception unused) {
            Result.Companion companion4 = Result.INSTANCE;
            return Result.m28550constructorimpl(ResultKt.createFailure(new FallbackException("Failed to open resource as static template. Resource not found.")));
        }
    }

    @Override // com.withpersona.sdk2.inquiry.internal.fallbackmode.ApiController
    public Object transitionWithRequestBody(String str, RequestBody requestBody, Continuation<? super Response<?>> continuation) {
        Response responseSuccess = Response.success(null);
        Intrinsics.checkNotNullExpressionValue(responseSuccess, "success(...)");
        return responseSuccess;
    }

    @Override // com.withpersona.sdk2.inquiry.internal.fallbackmode.ApiController
    public Object transitionBack(String str, RequestBody requestBody, Continuation<? super Response<?>> continuation) {
        Response responseSuccess = Response.success(null);
        Intrinsics.checkNotNullExpressionValue(responseSuccess, "success(...)");
        return responseSuccess;
    }
}
