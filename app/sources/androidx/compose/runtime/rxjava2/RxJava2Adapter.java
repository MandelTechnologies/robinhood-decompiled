package androidx.compose.runtime.rxjava2;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RxJava2Adapter.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"R", "T", "Lio/reactivex/Observable;", "initial", "Landroidx/compose/runtime/State;", "subscribeAsState", "(Lio/reactivex/Observable;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "runtime-rxjava2_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.runtime.rxjava2.RxJava2AdapterKt, reason: use source file name */
/* loaded from: classes.dex */
public final class RxJava2Adapter {
    public static final <R, T extends R> SnapshotState4<R> subscribeAsState(final Observable<T> observable, R r, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1018254449, i, -1, "androidx.compose.runtime.rxjava2.subscribeAsState (RxJava2Adapter.kt:48)");
        }
        int i2 = (i & 112) | (i & 14) | (((i >> 3) & 8) << 3);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotState3.mutableStateOf$default(r, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
        EffectsKt.DisposableEffect(observable, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.runtime.rxjava2.RxJava2AdapterKt$subscribeAsState$$inlined$asState$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                Object obj = observable;
                final SnapshotState snapshotState2 = snapshotState;
                final Function1<R, Unit> function1 = new Function1<R, Unit>() { // from class: androidx.compose.runtime.rxjava2.RxJava2AdapterKt$subscribeAsState$$inlined$asState$1.1
                    {
                        super(1);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Object obj2) {
                        invoke2((C17751<R>) obj2);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(R r2) {
                        snapshotState2.setValue(r2);
                    }
                };
                final Disposable disposableSubscribe = ((Observable) obj).subscribe(new Consumer() { // from class: androidx.compose.runtime.rxjava2.RxJava2AdapterKt$sam$io_reactivex_functions_Consumer$0
                    @Override // io.reactivex.functions.Consumer
                    public final /* synthetic */ void accept(Object obj2) {
                        function1.invoke(obj2);
                    }
                });
                return new DisposableEffectResult() { // from class: androidx.compose.runtime.rxjava2.RxJava2AdapterKt$subscribeAsState$$inlined$asState$1.2
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        disposableSubscribe.dispose();
                    }
                };
            }
        }, composer, i2 & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return snapshotState;
    }
}
