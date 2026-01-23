package com.robinhood.utils.p408rx.error;

import com.robinhood.Logger;
import com.singular.sdk.internal.Constants;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.functions.Consumer;
import io.reactivex.plugins.RxJavaPlugins;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RxErrorCheckpoint.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0014B\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u0011\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0002H\u0096\u0002J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0002H\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/utils/rx/error/RxErrorCheckpoint;", "Lio/reactivex/functions/Consumer;", "", "Lkotlin/Function1;", "", "handler", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "checkpointThrowable", "stack", "", "Ljava/lang/StackTraceElement;", "getStack", "()[Ljava/lang/StackTraceElement;", "stack$delegate", "Lkotlin/Lazy;", "accept", Constants.RequestBody.EXTRA_ATTRIBUTES_KEY, "invoke", "onError", "Companion", "lib-utils"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class RxErrorCheckpoint implements Consumer<Throwable>, Function1<Throwable, Unit> {

    @JvmField
    public static final Function1<Throwable, Unit> HANDLER_UNHANDLED = new Function1() { // from class: com.robinhood.utils.rx.error.RxErrorCheckpoint$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return RxErrorCheckpoint.HANDLER_UNHANDLED$lambda$1((Throwable) obj);
        }
    };
    private final Throwable checkpointThrowable;
    private final Function1<Throwable, Unit> handler;

    /* renamed from: stack$delegate, reason: from kotlin metadata */
    private final Lazy stack;

    /* JADX WARN: Multi-variable type inference failed */
    public RxErrorCheckpoint() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RxErrorCheckpoint(Function1<? super Throwable, Unit> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.handler = handler;
        this.checkpointThrowable = new Throwable();
        this.stack = LazyKt.lazy(new Function0() { // from class: com.robinhood.utils.rx.error.RxErrorCheckpoint$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RxErrorCheckpoint.stack_delegate$lambda$0(this.f$0);
            }
        });
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    public /* synthetic */ RxErrorCheckpoint(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? HANDLER_UNHANDLED : function1);
    }

    private final StackTraceElement[] getStack() {
        Object value = this.stack.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (StackTraceElement[]) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StackTraceElement[] stack_delegate$lambda$0(RxErrorCheckpoint rxErrorCheckpoint) {
        return rxErrorCheckpoint.checkpointThrowable.getStackTrace();
    }

    @Override // io.reactivex.functions.Consumer
    public void accept(Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
        onError(e);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2(Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
        onError(e);
    }

    private final void onError(Throwable e) {
        String str;
        try {
            this.handler.invoke(e);
            Logger.INSTANCE.mo1680d(e, "Error was handled by the handler", new Object[0]);
        } catch (Throwable th) {
            if (e == th) {
                str = "Exception was received here and rethrown by the handler";
            } else {
                CompositeException compositeException = new CompositeException(e, th);
                str = "Exception was received here and failed handling by the handler";
                e = compositeException;
            }
            RxJavaPlugins.onError(new OnErrorNotImplementedException(str, new RxCheckpointException(getStack(), e)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HANDLER_UNHANDLED$lambda$1(Throwable it) throws Throwable {
        Intrinsics.checkNotNullParameter(it, "it");
        throw it;
    }
}
