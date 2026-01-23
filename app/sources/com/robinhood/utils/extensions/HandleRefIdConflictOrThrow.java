package com.robinhood.utils.extensions;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;

/* compiled from: HandleRefIdConflictOrThrow.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aO\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u000321\u0010\u0004\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"handleRefIdConflictOrThrow", "T", "", "", "fetchConflictingResource", "Lkotlin/Function2;", "Ljava/util/UUID;", "Lkotlin/ParameterName;", "name", "conflictingResourceId", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.utils.extensions.HandleRefIdConflictOrThrowKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class HandleRefIdConflictOrThrow {
    public static final <T> Object handleRefIdConflictOrThrow(Throwable th, Function2<? super UUID, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) throws Throwable {
        String strLastNonEmptyPathSegment;
        HttpUrl httpConflictUrl = Throwables.getHttpConflictUrl(th);
        UUID uuid = null;
        if (httpConflictUrl != null && (strLastNonEmptyPathSegment = HttpUrls.lastNonEmptyPathSegment(httpConflictUrl)) != null) {
            try {
                uuid = StringsKt.toUuid(strLastNonEmptyPathSegment);
            } catch (IllegalArgumentException unused) {
            }
        }
        if (uuid != null) {
            return function2.invoke(uuid, continuation);
        }
        throw th;
    }
}
