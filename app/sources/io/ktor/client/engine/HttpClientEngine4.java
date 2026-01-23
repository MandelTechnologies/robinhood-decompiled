package io.ktor.client.engine;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import io.ktor.client.engine.HttpClientEngineConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: HttpClientEngine.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003J#\u0010\u0004\u001a\u00020\u00052\u0019\b\u0002\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tH&¨\u0006\n"}, m3636d2 = {"Lio/ktor/client/engine/HttpClientEngineFactory;", "T", "Lio/ktor/client/engine/HttpClientEngineConfig;", "", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lio/ktor/client/engine/HttpClientEngine;", "block", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "ktor-client-core"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.client.engine.HttpClientEngineFactory, reason: use source file name */
/* loaded from: classes14.dex */
public interface HttpClientEngine4<T extends HttpClientEngineConfig> {
    HttpClientEngine create(Function1<? super T, Unit> block);
}
