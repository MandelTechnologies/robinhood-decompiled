package com.robinhood.api.utils;

import com.robinhood.Logger;
import com.robinhood.api.utils.RhCallAdapterFactory;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.remoteconfig.RemoteConfigHelper;
import com.squareup.moshi.JsonDataException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.ResponseBody;
import retrofit2.HttpException;
import retrofit2.Response;

/* compiled from: ThrowableTransformers.kt */
@kotlin.Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/api/utils/RemoteConfigThrowableTransformer;", "Lcom/robinhood/api/utils/RhCallAdapterFactory$ThrowableTransformer;", "remoteConfigHelper", "Lcom/robinhood/utils/remoteconfig/RemoteConfigHelper;", "<init>", "(Lcom/robinhood/utils/remoteconfig/RemoteConfigHelper;)V", "transform", "", "request", "Lokhttp3/Request;", "throwable", "Companion", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.api.utils.RemoteConfigThrowableTransformer, reason: use source file name */
/* loaded from: classes20.dex */
public final class ThrowableTransformers3 implements RhCallAdapterFactory.ThrowableTransformer {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final RemoteConfigHelper remoteConfigHelper;

    public ThrowableTransformers3(RemoteConfigHelper remoteConfigHelper) {
        Intrinsics.checkNotNullParameter(remoteConfigHelper, "remoteConfigHelper");
        this.remoteConfigHelper = remoteConfigHelper;
    }

    @Override // com.robinhood.api.utils.RhCallAdapterFactory.ThrowableTransformer
    public Throwable transform(Request request, Throwable throwable) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (!(throwable instanceof JsonDataException)) {
            return throwable;
        }
        List<Regex> noJsonCrashUrlRegexList = this.remoteConfigHelper.getNoJsonCrashUrlRegexList();
        String url = request.getUrl().getUrl();
        List<Regex> list = noJsonCrashUrlRegexList;
        if ((list instanceof Collection) && list.isEmpty()) {
            return throwable;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((Regex) it.next()).matches(url)) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, throwable, false, null, 4, null);
                Logger.INSTANCE.mo1681e("Transformed JsonDataException to 500 with url matching.", new Object[0]);
                return INSTANCE.create500();
            }
        }
        return throwable;
    }

    /* compiled from: ThrowableTransformers.kt */
    @kotlin.Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/api/utils/RemoteConfigThrowableTransformer$Companion;", "", "<init>", "()V", "create500", "", "lib-api_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.api.utils.RemoteConfigThrowableTransformer$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Throwable create500() {
            return new HttpException(Response.error(500, ResponseBody.INSTANCE.create("JsonDataException coerced to 500 by RhCallAdapterFactory", (MediaType) null)));
        }
    }
}
