package com.truelayer.payments.p419ui.utils;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.truelayer.payments.p419ui.utils.Navigation4;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Navigation.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B8\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012#\b\u0002\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\u0002\u0010\fJ\u001f\u0010\u001a\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u001cJ\r\u0010\u001d\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0010J\u0015\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u001fJ\r\u0010 \u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0010J\u0015\u0010!\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u001fR#\u0010\r\u001a\u0017\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\""}, m3636d2 = {"Lcom/truelayer/payments/ui/utils/FlowNavigator;", "T", "Lcom/truelayer/payments/ui/utils/NavigationRoute;", "", "routes", "", "listener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "current", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "_stack", "Lcom/truelayer/payments/ui/utils/NavigationStack;", "getCurrent", "()Lcom/truelayer/payments/ui/utils/NavigationRoute;", "direction", "Lcom/truelayer/payments/ui/utils/Direction;", "getDirection", "()Lcom/truelayer/payments/ui/utils/Direction;", "isStart", "", "()Z", "getRoutes", "()Ljava/util/List;", "moveForwardUpTo", PlaceTypes.ROUTE, "(Lcom/truelayer/payments/ui/utils/NavigationRoute;Lcom/truelayer/payments/ui/utils/Direction;)V", "next", "pretendMovingBackUpTo", "(Lcom/truelayer/payments/ui/utils/NavigationRoute;)V", "previous", "updateCurrentRoute", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.utils.FlowNavigator, reason: use source file name */
/* loaded from: classes12.dex */
public final class Navigation3<T extends Navigation4> {
    public static final int $stable = 8;
    private final Navigation5<T> _stack;
    private final List<T> routes;

    /* JADX WARN: Multi-variable type inference failed */
    public Navigation3(List<? extends T> routes, Function1<? super T, Unit> listener) {
        Intrinsics.checkNotNullParameter(routes, "routes");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.routes = routes;
        this._stack = new Navigation5<>((Navigation4) CollectionsKt.first((List) routes), listener);
        listener.invoke(getCurrent());
    }

    public final List<T> getRoutes() {
        return this.routes;
    }

    public /* synthetic */ Navigation3(List list, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? new Function1<T, Unit>() { // from class: com.truelayer.payments.ui.utils.FlowNavigator.1
            public final void invoke(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke((C433131) obj);
                return Unit.INSTANCE;
            }
        } : function1);
    }

    public final T getCurrent() {
        return (T) this._stack.getCurrent();
    }

    public final boolean isStart() {
        return this._stack.isStart();
    }

    public final Navigation2 getDirection() {
        return this._stack.getDirection();
    }

    public final void updateCurrentRoute(T route) {
        if (route != null) {
            this._stack.replaceLast(route);
        }
    }

    public final void pretendMovingBackUpTo(T route) {
        if (CollectionsKt.lastIndexOf(this.routes, route) == CollectionsKt.getLastIndex(this.routes)) {
            moveForwardUpTo(route, Navigation2.None);
        } else {
            moveForwardUpTo(route, Navigation2.Back);
        }
    }

    public static /* synthetic */ void moveForwardUpTo$default(Navigation3 navigation3, Navigation4 navigation4, Navigation2 navigation2, int i, Object obj) {
        if ((i & 2) != 0) {
            navigation2 = Navigation2.Forward;
        }
        navigation3.moveForwardUpTo(navigation4, navigation2);
    }

    public final void moveForwardUpTo(T route, Navigation2 direction) {
        Navigation4 navigation4;
        Intrinsics.checkNotNullParameter(direction, "direction");
        if (Intrinsics.areEqual(getCurrent(), route)) {
            return;
        }
        Navigation4 current = getCurrent();
        while (!Intrinsics.areEqual(current, route) && (navigation4 = (Navigation4) CollectionsKt.getOrNull(this.routes, this._stack.getSize())) != null) {
            Navigation5.goTo$default(this._stack, navigation4, null, direction, 2, null);
            current = navigation4;
        }
    }

    public final T next() {
        Navigation4 navigation4 = (Navigation4) CollectionsKt.getOrNull(this.routes, this._stack.getSize());
        if (navigation4 == null) {
            return null;
        }
        return (T) Navigation5.goTo$default(this._stack, navigation4, null, null, 6, null);
    }

    public final T previous() {
        return (T) this._stack.previous();
    }
}
