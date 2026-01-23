package curtains;

import curtains.internal.RootViewsSpy;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: Curtains.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u0003\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, m3636d2 = {"Lcurtains/Curtains;", "", "<init>", "()V", "Lcurtains/internal/RootViewsSpy;", "rootViewsSpy$delegate", "Lkotlin/Lazy;", "getRootViewsSpy", "()Lcurtains/internal/RootViewsSpy;", "rootViewsSpy", "", "Lcurtains/OnRootViewsChangedListener;", "getOnRootViewsChangedListeners", "()Ljava/util/List;", "getOnRootViewsChangedListeners$annotations", "onRootViewsChangedListeners", "curtains_release"}, m3637k = 1, m3638mv = {1, 4, 1})
/* loaded from: classes18.dex */
public final class Curtains {
    public static final Curtains INSTANCE = new Curtains();

    /* renamed from: rootViewsSpy$delegate, reason: from kotlin metadata */
    private static final Lazy rootViewsSpy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<RootViewsSpy>() { // from class: curtains.Curtains$rootViewsSpy$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final RootViewsSpy invoke() {
            return RootViewsSpy.INSTANCE.install();
        }
    });

    private final RootViewsSpy getRootViewsSpy() {
        return (RootViewsSpy) rootViewsSpy.getValue();
    }

    private Curtains() {
    }

    public static final List<Listeners2> getOnRootViewsChangedListeners() {
        return INSTANCE.getRootViewsSpy().getListeners();
    }
}
