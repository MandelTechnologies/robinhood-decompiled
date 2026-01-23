package dispatch.core;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dispatch.core.DispatcherProvider;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineDispatcher;

/* compiled from: DefaultDispatcherProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m3636d2 = {"Ldispatch/core/DefaultDispatcherProvider;", "", "<init>", "()V", "Ldispatch/core/DispatcherProvider;", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "()Ldispatch/core/DispatcherProvider;", "get", "dispatch-core"}, m3637k = 1, m3638mv = {1, 5, 1}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class DefaultDispatcherProvider {
    public static final DefaultDispatcherProvider INSTANCE;
    private static final /* synthetic */ HolderRefVolatile defaultDispatcherProvider$HolderRefVolatile;
    private static final /* synthetic */ AtomicReferenceFieldUpdater holder$FU;

    /* synthetic */ class HolderRefVolatile {
        volatile Object holder;

        public HolderRefVolatile(Object obj) {
            this.holder = obj;
        }
    }

    private DefaultDispatcherProvider() {
    }

    static {
        DefaultDispatcherProvider defaultDispatcherProvider = new DefaultDispatcherProvider();
        INSTANCE = defaultDispatcherProvider;
        defaultDispatcherProvider$HolderRefVolatile = new HolderRefVolatile(defaultDispatcherProvider.m27967default());
        holder$FU = AtomicReferenceFieldUpdater.newUpdater(HolderRefVolatile.class, Object.class, "holder");
    }

    public final DispatcherProvider get() {
        return (DispatcherProvider) defaultDispatcherProvider$HolderRefVolatile.holder;
    }

    /* renamed from: default, reason: not valid java name */
    private final DispatcherProvider m27967default() {
        return new DispatcherProvider() { // from class: dispatch.core.DefaultDispatcherProvider.default.1
            @Override // dispatch.core.DispatcherProvider, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
            public <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
                return (R) DispatcherProvider.DefaultImpls.fold(this, r, function2);
            }

            @Override // dispatch.core.DispatcherProvider, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
            public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
                return (E) DispatcherProvider.DefaultImpls.get(this, key);
            }

            @Override // dispatch.core.DispatcherProvider
            public CoroutineDispatcher getDefault() {
                return DispatcherProvider.DefaultImpls.getDefault(this);
            }

            @Override // dispatch.core.DispatcherProvider
            public CoroutineDispatcher getIo() {
                return DispatcherProvider.DefaultImpls.getIo(this);
            }

            @Override // dispatch.core.DispatcherProvider, kotlin.coroutines.CoroutineContext.Element
            public CoroutineContext.Key<?> getKey() {
                return DispatcherProvider.DefaultImpls.getKey(this);
            }

            @Override // dispatch.core.DispatcherProvider
            public CoroutineDispatcher getMain() {
                return DispatcherProvider.DefaultImpls.getMain(this);
            }

            @Override // dispatch.core.DispatcherProvider
            public CoroutineDispatcher getMainImmediate() {
                return DispatcherProvider.DefaultImpls.getMainImmediate(this);
            }

            @Override // dispatch.core.DispatcherProvider
            public CoroutineDispatcher getUnconfined() {
                return DispatcherProvider.DefaultImpls.getUnconfined(this);
            }

            @Override // dispatch.core.DispatcherProvider, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
            public CoroutineContext minusKey(CoroutineContext.Key<?> key) {
                return DispatcherProvider.DefaultImpls.minusKey(this, key);
            }

            @Override // dispatch.core.DispatcherProvider, kotlin.coroutines.CoroutineContext
            public CoroutineContext plus(CoroutineContext coroutineContext) {
                return DispatcherProvider.DefaultImpls.plus(this, coroutineContext);
            }
        };
    }
}
