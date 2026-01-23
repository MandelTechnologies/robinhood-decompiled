package dispatch.core;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* compiled from: DispatcherProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0018\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0014\u0010\u000e\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0014\u0010\u0010\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005¨\u0006\u0013"}, m3636d2 = {"Ldispatch/core/DispatcherProvider;", "Lkotlin/coroutines/CoroutineContext$Element;", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "Lkotlinx/coroutines/CoroutineDispatcher;", "getDefault", "()Lkotlinx/coroutines/CoroutineDispatcher;", "io", "getIo", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "main", "getMain", "mainImmediate", "getMainImmediate", "unconfined", "getUnconfined", "Key", "dispatch-core"}, m3637k = 1, m3638mv = {1, 5, 1}, m3640xi = 48)
/* loaded from: classes21.dex */
public interface DispatcherProvider extends CoroutineContext.Element {

    /* renamed from: Key, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    /* synthetic */ Object fold(Object obj, Function2 function2);

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext.Element get(CoroutineContext.Key key);

    CoroutineDispatcher getDefault();

    CoroutineDispatcher getIo();

    @Override // kotlin.coroutines.CoroutineContext.Element
    CoroutineContext.Key<?> getKey();

    CoroutineDispatcher getMain();

    CoroutineDispatcher getMainImmediate();

    CoroutineDispatcher getUnconfined();

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext minusKey(CoroutineContext.Key key);

    @Override // kotlin.coroutines.CoroutineContext
    /* synthetic */ CoroutineContext plus(CoroutineContext coroutineContext);

    /* compiled from: DispatcherProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 5, 1}, m3640xi = 48)
    public static final class DefaultImpls {
        public static <R> R fold(DispatcherProvider dispatcherProvider, R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation2) {
            Intrinsics.checkNotNullParameter(dispatcherProvider, "this");
            Intrinsics.checkNotNullParameter(operation2, "operation");
            return (R) CoroutineContext.Element.DefaultImpls.fold(dispatcherProvider, r, operation2);
        }

        public static <E extends CoroutineContext.Element> E get(DispatcherProvider dispatcherProvider, CoroutineContext.Key<E> key) {
            Intrinsics.checkNotNullParameter(dispatcherProvider, "this");
            Intrinsics.checkNotNullParameter(key, "key");
            return (E) CoroutineContext.Element.DefaultImpls.get(dispatcherProvider, key);
        }

        public static CoroutineContext minusKey(DispatcherProvider dispatcherProvider, CoroutineContext.Key<?> key) {
            Intrinsics.checkNotNullParameter(dispatcherProvider, "this");
            Intrinsics.checkNotNullParameter(key, "key");
            return CoroutineContext.Element.DefaultImpls.minusKey(dispatcherProvider, key);
        }

        public static CoroutineContext plus(DispatcherProvider dispatcherProvider, CoroutineContext context) {
            Intrinsics.checkNotNullParameter(dispatcherProvider, "this");
            Intrinsics.checkNotNullParameter(context, "context");
            return CoroutineContext.Element.DefaultImpls.plus(dispatcherProvider, context);
        }

        public static CoroutineContext.Key<?> getKey(DispatcherProvider dispatcherProvider) {
            Intrinsics.checkNotNullParameter(dispatcherProvider, "this");
            return DispatcherProvider.INSTANCE;
        }

        public static CoroutineDispatcher getDefault(DispatcherProvider dispatcherProvider) {
            Intrinsics.checkNotNullParameter(dispatcherProvider, "this");
            return Dispatchers.getDefault();
        }

        public static CoroutineDispatcher getIo(DispatcherProvider dispatcherProvider) {
            Intrinsics.checkNotNullParameter(dispatcherProvider, "this");
            return Dispatchers.getIO();
        }

        public static CoroutineDispatcher getMain(DispatcherProvider dispatcherProvider) {
            Intrinsics.checkNotNullParameter(dispatcherProvider, "this");
            return Dispatchers.getMain();
        }

        public static CoroutineDispatcher getMainImmediate(DispatcherProvider dispatcherProvider) {
            Intrinsics.checkNotNullParameter(dispatcherProvider, "this");
            return Dispatchers.getMain().getImmediate();
        }

        public static CoroutineDispatcher getUnconfined(DispatcherProvider dispatcherProvider) {
            Intrinsics.checkNotNullParameter(dispatcherProvider, "this");
            return Dispatchers.getUnconfined();
        }
    }

    /* compiled from: DispatcherProvider.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Ldispatch/core/DispatcherProvider$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Ldispatch/core/DispatcherProvider;", "()V", "dispatch-core"}, m3637k = 1, m3638mv = {1, 5, 1}, m3640xi = 48)
    /* renamed from: dispatch.core.DispatcherProvider$Key, reason: from kotlin metadata */
    public static final class Companion implements CoroutineContext.Key<DispatcherProvider> {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }
}
