package com.robinhood.android.swipetodismiss;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.Saver2;
import androidx.compose.runtime.saveable.Saver5;
import com.robinhood.android.swipetodismiss.SwipeToDismiss2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SwipeToDismiss.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/swipetodismiss/DismissState;", "Lcom/robinhood/android/swipetodismiss/SwipeableState;", "Lcom/robinhood/android/swipetodismiss/DismissValue;", "initialValue", "confirmStateChange", "Lkotlin/Function1;", "", "<init>", "(Lcom/robinhood/android/swipetodismiss/DismissValue;Lkotlin/jvm/functions/Function1;)V", "dismissDirection", "Lcom/robinhood/android/swipetodismiss/DismissDirection;", "getDismissDirection", "()Lcom/robinhood/android/swipetodismiss/DismissDirection;", "isDismissed", "direction", "reset", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dismiss", "(Lcom/robinhood/android/swipetodismiss/DismissDirection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "lib-swipe-to-dismiss_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.swipetodismiss.DismissState, reason: use source file name */
/* loaded from: classes9.dex */
public final class SwipeToDismiss2 extends SwipeableState<SwipeToDismiss3> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(SwipeToDismiss3 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    public /* synthetic */ SwipeToDismiss2(SwipeToDismiss3 swipeToDismiss3, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(swipeToDismiss3, (i & 2) != 0 ? new Function1() { // from class: com.robinhood.android.swipetodismiss.DismissState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(SwipeToDismiss2._init_$lambda$0((SwipeToDismiss3) obj));
            }
        } : function1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeToDismiss2(SwipeToDismiss3 initialValue, Function1<? super SwipeToDismiss3, Boolean> confirmStateChange) {
        super(initialValue, null, confirmStateChange, 2, null);
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
    }

    public final SwipeToDismiss getDismissDirection() {
        if (getOffset().getValue().floatValue() == 0.0f) {
            return null;
        }
        return getOffset().getValue().floatValue() > 0.0f ? SwipeToDismiss.StartToEnd : SwipeToDismiss.EndToStart;
    }

    public final boolean isDismissed(SwipeToDismiss direction) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        return getCurrentValue() == (direction == SwipeToDismiss.StartToEnd ? SwipeToDismiss3.DismissedToEnd : SwipeToDismiss3.DismissedToStart);
    }

    public final Object reset(Continuation<? super Unit> continuation) {
        Object objAnimateTo$default = SwipeableState.animateTo$default(this, SwipeToDismiss3.Default, null, continuation, 2, null);
        return objAnimateTo$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo$default : Unit.INSTANCE;
    }

    public final Object dismiss(SwipeToDismiss swipeToDismiss, Continuation<? super Unit> continuation) {
        Object objAnimateTo$default = SwipeableState.animateTo$default(this, swipeToDismiss == SwipeToDismiss.StartToEnd ? SwipeToDismiss3.DismissedToEnd : SwipeToDismiss3.DismissedToStart, null, continuation, 2, null);
        return objAnimateTo$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAnimateTo$default : Unit.INSTANCE;
    }

    /* compiled from: SwipeToDismiss.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/swipetodismiss/DismissState$Companion;", "", "<init>", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Lcom/robinhood/android/swipetodismiss/DismissState;", "Lcom/robinhood/android/swipetodismiss/DismissValue;", "confirmStateChange", "Lkotlin/Function1;", "", "lib-swipe-to-dismiss_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.swipetodismiss.DismissState$Companion, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver<SwipeToDismiss2, SwipeToDismiss3> Saver(final Function1<? super SwipeToDismiss3, Boolean> confirmStateChange) {
            Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
            return Saver2.Saver(new Function2() { // from class: com.robinhood.android.swipetodismiss.DismissState$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SwipeToDismiss2.Companion.Saver$lambda$0((Saver5) obj, (SwipeToDismiss2) obj2);
                }
            }, new Function1() { // from class: com.robinhood.android.swipetodismiss.DismissState$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SwipeToDismiss2.Companion.Saver$lambda$1(confirmStateChange, (SwipeToDismiss3) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SwipeToDismiss3 Saver$lambda$0(Saver5 Saver, SwipeToDismiss2 it) {
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getCurrentValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SwipeToDismiss2 Saver$lambda$1(Function1 function1, SwipeToDismiss3 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new SwipeToDismiss2(it, function1);
        }
    }
}
