package com.robinhood.android.lib.transfers.util;

import android.webkit.URLUtil;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.utils.extensions.Throwables;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONObject;
import retrofit2.HttpException;
import retrofit2.Response;

/* compiled from: GetThreeDSRedirectUrl.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"getThreeDSRedirectUrl", "", "", "lib-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.transfers.util.GetThreeDSRedirectUrlKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class GetThreeDSRedirectUrl {
    public static final String getThreeDSRedirectUrl(Throwable th) {
        String string2;
        Response<?> response;
        String strExtractErrorBodyString;
        Intrinsics.checkNotNullParameter(th, "<this>");
        try {
            HttpException httpException = (HttpException) Throwables.findCause(th, HttpException.class);
            string2 = (httpException == null || (response = httpException.response()) == null || (strExtractErrorBodyString = NetworkThrowables.extractErrorBodyString(response)) == null) ? null : new JSONObject(strExtractErrorBodyString).getString("three_d_s_redirect_url");
        } catch (Throwable unused) {
        }
        if (URLUtil.isValidUrl(string2)) {
            return string2;
        }
        return null;
    }
}
