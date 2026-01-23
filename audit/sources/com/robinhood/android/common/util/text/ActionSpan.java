package com.robinhood.android.common.util.text;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.robinhood.utils.p409ui.lifecycle.ContextLifecycles;
import com.robinhood.utils.p409ui.view.DebouncingOnClickListener;
import io.reactivex.functions.Action;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ActionSpan.kt */
@Metadata(m3635d1 = {"\u00007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u000b\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0006\u0010\nJ\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/common/util/text/ActionSpan;", "Landroid/text/style/ClickableSpan;", "underlineText", "", "listener", "Lio/reactivex/functions/Action;", "<init>", "(ZLio/reactivex/functions/Action;)V", "Lkotlin/Function0;", "", "(ZLkotlin/jvm/functions/Function0;)V", "com/robinhood/android/common/util/text/ActionSpan$listener$1", "Lcom/robinhood/android/common/util/text/ActionSpan$listener$1;", "onClick", "view", "Landroid/view/View;", "updateDrawState", "paint", "Landroid/text/TextPaint;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class ActionSpan extends ClickableSpan {
    public static final int $stable = 8;
    private final ActionSpan2 listener;
    private final boolean underlineText;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ActionSpan(Action listener) {
        this(false, listener, 1, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    public /* synthetic */ ActionSpan(boolean z, Action action, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, action);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.robinhood.android.common.util.text.ActionSpan$listener$1] */
    @JvmOverloads
    public ActionSpan(boolean z, final Action listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.underlineText = z;
        this.listener = new DebouncingOnClickListener() { // from class: com.robinhood.android.common.util.text.ActionSpan$listener$1
            @Override // com.robinhood.utils.p409ui.view.DebouncingOnClickListener
            public void doClick(View v) throws Exception {
                Intrinsics.checkNotNullParameter(v, "v");
                listener.run();
            }
        };
    }

    public /* synthetic */ ActionSpan(boolean z, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (Function0<Unit>) function0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActionSpan(boolean z, final Function0<Unit> listener) {
        this(z, new Action(listener) { // from class: com.robinhood.android.common.util.text.ActionSpan$sam$io_reactivex_functions_Action$0
            private final /* synthetic */ Function0 function;

            {
                Intrinsics.checkNotNullParameter(listener, "function");
                this.function = listener;
            }

            @Override // io.reactivex.functions.Action
            public final /* synthetic */ void run() {
                this.function.invoke();
            }
        });
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (Intrinsics.areEqual(ContextLifecycles.isResumed(context), Boolean.FALSE) || !view.isAttachedToWindow()) {
            return;
        }
        onClick(view);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        super.updateDrawState(paint);
        paint.setUnderlineText(this.underlineText);
    }
}
