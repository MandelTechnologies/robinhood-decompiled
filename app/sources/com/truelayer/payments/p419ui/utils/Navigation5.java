package com.truelayer.payments.p419ui.utils;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.truelayer.payments.p419ui.utils.Navigation4;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Navigation.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B2\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012#\b\u0002\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0006¢\u0006\u0002\u0010\u000bJ+\u0010\u001c\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u001d\u001a\u00028\u00002\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0002\u0010\u001fJ\r\u0010 \u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u000fJ\u0013\u0010!\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0002\u0010\"R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0017R)\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006#"}, m3636d2 = {"Lcom/truelayer/payments/ui/utils/NavigationStack;", "T", "Lcom/truelayer/payments/ui/utils/NavigationRoute;", "", PlaceTypes.ROUTE, "listener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "current", "", "(Lcom/truelayer/payments/ui/utils/NavigationRoute;Lkotlin/jvm/functions/Function1;)V", "_stack", "Lkotlin/collections/ArrayDeque;", "getCurrent", "()Lcom/truelayer/payments/ui/utils/NavigationRoute;", "<set-?>", "Lcom/truelayer/payments/ui/utils/Direction;", "direction", "getDirection", "()Lcom/truelayer/payments/ui/utils/Direction;", "isStart", "", "()Z", "size", "", "getSize", "()I", "goTo", "destination", AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT, "(Lcom/truelayer/payments/ui/utils/NavigationRoute;Lcom/truelayer/payments/ui/utils/NavigationRoute;Lcom/truelayer/payments/ui/utils/Direction;)Lcom/truelayer/payments/ui/utils/NavigationRoute;", "previous", "replaceLast", "(Lcom/truelayer/payments/ui/utils/NavigationRoute;)V", "payments-ui_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.truelayer.payments.ui.utils.NavigationStack, reason: use source file name */
/* loaded from: classes12.dex */
public final class Navigation5<T extends Navigation4> {
    public static final int $stable = 8;
    private final ArrayDeque<T> _stack;
    private Navigation2 direction;
    private final Function1<T, Unit> listener;

    /* JADX WARN: Multi-variable type inference failed */
    public Navigation5(T route, Function1<? super T, Unit> listener) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
        this._stack = new ArrayDeque<>(CollectionsKt.listOf(route));
        this.direction = Navigation2.None;
    }

    public /* synthetic */ Navigation5(Navigation4 navigation4, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(navigation4, (i & 2) != 0 ? new Function1<T, Unit>() { // from class: com.truelayer.payments.ui.utils.NavigationStack.1
            public final void invoke(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke((C433141) obj);
                return Unit.INSTANCE;
            }
        } : function1);
    }

    public final Navigation2 getDirection() {
        return this.direction;
    }

    public final T getCurrent() {
        return this._stack.last();
    }

    public final boolean isStart() {
        return this._stack.size() == 1;
    }

    public final int getSize() {
        return this._stack.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Navigation4 goTo$default(Navigation5 navigation5, Navigation4 navigation4, Navigation4 navigation42, Navigation2 navigation2, int i, Object obj) {
        if ((i & 2) != 0) {
            navigation42 = null;
        }
        if ((i & 4) != 0) {
            navigation2 = Navigation2.Forward;
        }
        return navigation5.goTo(navigation4, navigation42, navigation2);
    }

    public final T goTo(T destination, T t, Navigation2 direction) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(direction, "direction");
        if (!destination.hasPermission()) {
            destination = t;
        }
        this.direction = direction;
        if (destination == null) {
            return null;
        }
        this._stack.addLast(destination);
        this.listener.invoke(destination);
        return destination;
    }

    public final T previous() {
        T tLast;
        T tRemoveLastOrNull = !isStart() ? this._stack.removeLastOrNull() : null;
        this.direction = Navigation2.Back;
        if (tRemoveLastOrNull == null || (tLast = this._stack.last()) == null) {
            return null;
        }
        this.listener.invoke(tLast);
        return tLast;
    }

    public final void replaceLast(T route) {
        Intrinsics.checkNotNullParameter(route, "route");
        ArrayDeque<T> arrayDeque = this._stack;
        arrayDeque.removeLastOrNull();
        arrayDeque.addLast(route);
    }
}
