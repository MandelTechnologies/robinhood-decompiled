package com.withpersona.sdk2.inquiry.steps.p423ui.components;

import android.content.Context;
import android.view.LayoutInflater;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiComponentHelper.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0011\u001a\u00020\u000f2\u0010\u0010\u0012\u001a\f\u0012\u0004\u0012\u00020\u000f0\u000ej\u0002`\u0010J\u0006\u0010\u0013\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u000f0\u000ej\u0002`\u00100\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponentHelper;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "layoutInflater", "Landroid/view/LayoutInflater;", "getLayoutInflater", "()Landroid/view/LayoutInflater;", "onLayoutListeners", "Ljava/util/LinkedList;", "Lkotlin/Function0;", "", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/OnLayoutListener;", "registerOnLayoutListener", "cb", "onLayout", "ui-step-renderer_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class UiComponentHelper {
    private final Context context;
    private final LayoutInflater layoutInflater;
    private final LinkedList<Function0<Unit>> onLayoutListeners;

    public UiComponentHelper(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Intrinsics.checkNotNullExpressionValue(layoutInflaterFrom, "from(...)");
        this.layoutInflater = layoutInflaterFrom;
        this.onLayoutListeners = new LinkedList<>();
    }

    public final Context getContext() {
        return this.context;
    }

    public final LayoutInflater getLayoutInflater() {
        return this.layoutInflater;
    }

    public final void registerOnLayoutListener(Function0<Unit> cb) {
        Intrinsics.checkNotNullParameter(cb, "cb");
        this.onLayoutListeners.add(cb);
    }

    public final void onLayout() {
        Iterator<Function0<Unit>> it = this.onLayoutListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Function0<Unit> next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            next.invoke();
        }
    }
}
