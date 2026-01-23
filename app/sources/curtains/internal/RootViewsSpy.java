package curtains.internal;

import android.view.View;
import curtains.Listeners2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RootViewsSpy.kt */
@Metadata(m3635d1 = {"\u0000\u001f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0005*\u0001\n\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m3636d2 = {"Lcurtains/internal/RootViewsSpy;", "", "<init>", "()V", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcurtains/OnRootViewsChangedListener;", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getListeners", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "curtains/internal/RootViewsSpy$delegatingViewList$1", "delegatingViewList", "Lcurtains/internal/RootViewsSpy$delegatingViewList$1;", "Companion", "curtains_release"}, m3637k = 1, m3638mv = {1, 4, 1})
/* loaded from: classes18.dex */
public final class RootViewsSpy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final RootViewsSpy3 delegatingViewList;
    private final CopyOnWriteArrayList<Listeners2> listeners;

    /* JADX WARN: Type inference failed for: r0v1, types: [curtains.internal.RootViewsSpy$delegatingViewList$1] */
    private RootViewsSpy() {
        this.listeners = new CopyOnWriteArrayList<>();
        this.delegatingViewList = new ArrayList<View>() { // from class: curtains.internal.RootViewsSpy$delegatingViewList$1
            public /* bridge */ boolean contains(View view) {
                return super.contains((Object) view);
            }

            @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
            public final /* bridge */ boolean contains(Object obj) {
                if (obj instanceof View) {
                    return contains((View) obj);
                }
                return false;
            }

            public /* bridge */ int getSize() {
                return super.size();
            }

            public /* bridge */ int indexOf(View view) {
                return super.indexOf((Object) view);
            }

            @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
            public final /* bridge */ int indexOf(Object obj) {
                if (obj instanceof View) {
                    return indexOf((View) obj);
                }
                return -1;
            }

            public /* bridge */ int lastIndexOf(View view) {
                return super.lastIndexOf((Object) view);
            }

            @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
            public final /* bridge */ int lastIndexOf(Object obj) {
                if (obj instanceof View) {
                    return lastIndexOf((View) obj);
                }
                return -1;
            }

            public /* bridge */ boolean remove(View view) {
                return super.remove((Object) view);
            }

            @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
            public final /* bridge */ boolean remove(Object obj) {
                if (obj instanceof View) {
                    return remove((View) obj);
                }
                return false;
            }

            @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
            public final /* bridge */ int size() {
                return getSize();
            }

            @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
            public boolean add(View element) {
                Intrinsics.checkNotNullParameter(element, "element");
                Iterator<T> it = this.this$0.getListeners().iterator();
                while (it.hasNext()) {
                    ((Listeners2) it.next()).onRootViewsChanged(element, true);
                }
                return super.add((RootViewsSpy3) element);
            }

            @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
            /* renamed from: removeAt, reason: merged with bridge method [inline-methods] */
            public View remove(int index) {
                Object objRemove = super.remove(index);
                Intrinsics.checkNotNullExpressionValue(objRemove, "super.removeAt(index)");
                View view = (View) objRemove;
                Iterator<T> it = this.this$0.getListeners().iterator();
                while (it.hasNext()) {
                    ((Listeners2) it.next()).onRootViewsChanged(view, false);
                }
                return view;
            }
        };
    }

    public /* synthetic */ RootViewsSpy(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final CopyOnWriteArrayList<Listeners2> getListeners() {
        return this.listeners;
    }

    /* compiled from: RootViewsSpy.kt */
    @Metadata(m3634bv = {1, 0, 3}, m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"Lcurtains/internal/RootViewsSpy$Companion;", "", "()V", "install", "Lcurtains/internal/RootViewsSpy;", "curtains_release"}, m3637k = 1, m3638mv = {1, 4, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RootViewsSpy install() {
            final RootViewsSpy rootViewsSpy = new RootViewsSpy(null);
            WindowManagerSpy.INSTANCE.swapWindowManagerGlobalMViews(new Function1<ArrayList<View>, ArrayList<View>>() { // from class: curtains.internal.RootViewsSpy$Companion$install$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final ArrayList<View> invoke(ArrayList<View> mViews) {
                    Intrinsics.checkNotNullParameter(mViews, "mViews");
                    RootViewsSpy3 rootViewsSpy3 = rootViewsSpy.delegatingViewList;
                    rootViewsSpy3.addAll(mViews);
                    return rootViewsSpy3;
                }
            });
            return rootViewsSpy;
        }
    }
}
