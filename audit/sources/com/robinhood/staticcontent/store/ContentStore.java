package com.robinhood.staticcontent.store;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: ContentStore.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002J0\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00052\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0007H¦@¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/staticcontent/store/ContentStore;", "T", "", AnalyticsStrings.NOTIF_STACK_EVENT_LOAD, "contentfulId", "", "formatArguments", "", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface ContentStore<T> {
    Object load(String str, Map<String, ? extends Object> map, Continuation<? super T> continuation);

    /* compiled from: ContentStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object load$default(ContentStore contentStore, String str, Map map, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: load");
            }
            if ((i & 2) != 0) {
                map = null;
            }
            return contentStore.load(str, map, continuation);
        }
    }
}
