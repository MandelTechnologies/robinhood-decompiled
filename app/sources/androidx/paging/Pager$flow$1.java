package androidx.paging;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: Add missing generic type declarations: [Value, Key] */
/* compiled from: Pager.kt */
@Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class Pager$flow$1<Key, Value> extends FunctionReferenceImpl implements Function1<Continuation<? super PagingSource<Key, Value>>, Object>, ContinuationImpl6 {
    Pager$flow$1(Object obj) {
        super(1, obj, SuspendingPagingSourceFactory.class, AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "create(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super PagingSource<Key, Value>> continuation) {
        return ((SuspendingPagingSourceFactory) this.receiver).create(continuation);
    }
}
