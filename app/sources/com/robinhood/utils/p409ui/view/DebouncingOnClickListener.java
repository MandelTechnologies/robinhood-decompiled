package com.robinhood.utils.p409ui.view;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DebouncingOnClickListener.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/utils/ui/view/DebouncingOnClickListener;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "onClick", "", "v", "Landroid/view/View;", "doClick", "Companion", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public abstract class DebouncingOnClickListener implements View.OnClickListener {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static boolean enabled = true;
    private static final Function0<Unit> ENABLE_AGAIN = new Function0() { // from class: com.robinhood.utils.ui.view.DebouncingOnClickListener$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DebouncingOnClickListener.ENABLE_AGAIN$lambda$0();
        }
    };
    private static final Lazy<Handler> handler$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.robinhood.utils.ui.view.DebouncingOnClickListener$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DebouncingOnClickListener.handler_delegate$lambda$1();
        }
    });

    public abstract void doClick(View v);

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        if (enabled) {
            enabled = false;
            try {
                doClick(v);
            } finally {
                Handler handler = INSTANCE.getHandler();
                final Function0<Unit> function0 = ENABLE_AGAIN;
                handler.post(new Runnable(function0) { // from class: com.robinhood.utils.ui.view.DebouncingOnClickListener$sam$java_lang_Runnable$0
                    private final /* synthetic */ Function0 function;

                    {
                        Intrinsics.checkNotNullParameter(function0, "function");
                        this.function = function0;
                    }

                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.function.invoke();
                    }
                });
            }
        }
    }

    /* compiled from: DebouncingOnClickListener.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/utils/ui/view/DebouncingOnClickListener$Companion;", "", "<init>", "()V", "enabled", "", "ENABLE_AGAIN", "Lkotlin/Function0;", "", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "handler$delegate", "Lkotlin/Lazy;", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Handler getHandler() {
            return (Handler) DebouncingOnClickListener.handler$delegate.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ENABLE_AGAIN$lambda$0() {
        enabled = true;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler handler_delegate$lambda$1() {
        return new Handler(Looper.getMainLooper());
    }
}
