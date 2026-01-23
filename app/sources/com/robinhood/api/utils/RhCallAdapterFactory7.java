package com.robinhood.api.utils;

import okhttp3.MediaType;
import okhttp3.ResponseBody;
import retrofit2.HttpException;
import retrofit2.Response;

/* compiled from: RhCallAdapterFactory.kt */
@kotlin.Metadata(m3635d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0003\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0002¨\u0006\u0002"}, m3636d2 = {"create401", "", "lib-api_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.api.utils.RhCallAdapterFactoryKt, reason: use source file name */
/* loaded from: classes16.dex */
public final class RhCallAdapterFactory7 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable create401() {
        return new HttpException(Response.error(401, ResponseBody.INSTANCE.create("", (MediaType) null)));
    }
}
