package com.robinhood.android.supportchat.extensions;

import com.robinhood.android.bitmap.ImageProcessingFailedException;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.models.api.p306v2.ApiUpdateSupportChatError;
import com.robinhood.models.p355ui.p356v2.UpdateSupportChatError;
import com.robinhood.models.p355ui.p356v2.UpdateSupportChatError2;
import com.robinhood.store.supportchat.ChatExceptions;
import com.robinhood.utils.extensions.Throwables;
import com.squareup.moshi.JsonAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import retrofit2.HttpException;
import retrofit2.Response;

/* compiled from: Throwables.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u000b"}, m3636d2 = {"isHandleableException", "", "", "(Ljava/lang/Throwable;)Z", "shouldReport", "getShouldReport", "extractChatUpdateAlert", "Lcom/robinhood/models/ui/v2/UpdateSupportChatError;", "adapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/models/api/v2/ApiUpdateSupportChatError;", "feature-support-chat_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.supportchat.extensions.ThrowablesKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class Throwables2 {
    public static final boolean isHandleableException(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        return Throwables.isNetworkRelated(th) || ChatExceptions.isChatException(th) || (th instanceof ImageProcessingFailedException);
    }

    public static final boolean getShouldReport(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "<this>");
        return ChatExceptions.isChatException(th) || (th instanceof ImageProcessingFailedException);
    }

    public static final UpdateSupportChatError extractChatUpdateAlert(Throwable th, JsonAdapter<ApiUpdateSupportChatError> adapter) {
        Response<?> response;
        String strExtractErrorBodyString;
        ApiUpdateSupportChatError apiUpdateSupportChatErrorFromJson;
        Intrinsics.checkNotNullParameter(th, "<this>");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        try {
            HttpException httpException = (HttpException) Throwables.findCause(th, HttpException.class);
            if (httpException != null && httpException.code() == 400 && (response = httpException.response()) != null && (strExtractErrorBodyString = NetworkThrowables.extractErrorBodyString(response)) != null && (apiUpdateSupportChatErrorFromJson = adapter.fromJson(strExtractErrorBodyString)) != null) {
                return UpdateSupportChatError2.toUiModel(apiUpdateSupportChatErrorFromJson);
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
