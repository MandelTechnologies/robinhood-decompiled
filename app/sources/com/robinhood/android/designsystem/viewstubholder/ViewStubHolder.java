package com.robinhood.android.designsystem.viewstubholder;

import android.view.View;
import android.view.ViewStub;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ViewStubHolder.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00110\u0013J\u000b\u0010\u0014\u001a\u00028\u0000¢\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR$\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/designsystem/viewstubholder/ViewStubHolder;", "ViewType", "Landroid/view/View;", "", "viewStub", "Landroid/view/ViewStub;", "<init>", "(Landroid/view/ViewStub;)V", "view", "Landroid/view/View;", "value", "", "isVisible", "()Z", "setVisible", "(Z)V", "setOnInflateCallback", "", "callback", "Lkotlin/Function1;", "get", "()Landroid/view/View;", "setVisibility", "visibility", "", "isInflated", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class ViewStubHolder<ViewType extends View> {
    private ViewType view;
    private final ViewStub viewStub;

    public ViewStubHolder(ViewStub viewStub) {
        Intrinsics.checkNotNullParameter(viewStub, "viewStub");
        this.viewStub = viewStub;
    }

    public final void setVisible(boolean z) {
        setVisibility(z ? 0 : 8);
    }

    public final boolean isVisible() {
        ViewType viewtype = this.view;
        return viewtype != null ? viewtype.getVisibility() == 0 : this.viewStub.getVisibility() == 0;
    }

    public final void setOnInflateCallback(final Function1<? super ViewType, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.viewStub.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: com.robinhood.android.designsystem.viewstubholder.ViewStubHolder.setOnInflateCallback.1
            @Override // android.view.ViewStub.OnInflateListener
            public final void onInflate(ViewStub viewStub, View view) {
                Function1<ViewType, Unit> function1 = callback;
                Intrinsics.checkNotNull(view, "null cannot be cast to non-null type ViewType of com.robinhood.android.designsystem.viewstubholder.ViewStubHolder");
                function1.invoke(view);
            }
        });
    }

    public final ViewType get() {
        ViewType viewtype = this.view;
        if (viewtype != null) {
            return viewtype;
        }
        ViewType viewtype2 = (ViewType) this.viewStub.inflate();
        Intrinsics.checkNotNull(viewtype2, "null cannot be cast to non-null type ViewType of com.robinhood.android.designsystem.viewstubholder.ViewStubHolder");
        this.view = viewtype2;
        return viewtype2;
    }

    public final void setVisibility(int visibility) {
        if (isInflated()) {
            ViewType viewtype = this.view;
            Intrinsics.checkNotNull(viewtype);
            viewtype.setVisibility(visibility);
        } else if (visibility != 8) {
            get().setVisibility(visibility);
        }
    }

    public final boolean isInflated() {
        return this.view != null;
    }
}
