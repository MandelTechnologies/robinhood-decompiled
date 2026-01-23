package com.robinhood.android.lists.p173ui.ipo;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.hammer.android.view.ViewComponentManager;
import com.robinhood.hammer.android.view.ViewComponentManagerHolder;
import com.robinhood.hammer.core.internal.ComponentManager;
import com.robinhood.hammer.core.internal.HammerGeneratedSuperclass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Hammer_CuratedListIpoAccessHeaderView.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b1\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0014\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0014\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\tB#\b\u0014\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0005\u0010\fB+\b\u0014\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0005\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/ipo/Hammer_CuratedListIpoAccessHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/robinhood/hammer/android/view/ViewComponentManagerHolder;", "p0", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "p1", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "p2", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "p3", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "injected", "", "componentManager", "Lcom/robinhood/hammer/android/view/ViewComponentManager;", "getComponentManager", "()Lcom/robinhood/hammer/android/view/ViewComponentManager;", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@HammerGeneratedSuperclass
/* loaded from: classes8.dex */
public abstract class Hammer_CuratedListIpoAccessHeaderView extends ConstraintLayout implements ViewComponentManagerHolder {
    public static final int $stable = 8;
    private final ViewComponentManager componentManager;
    private boolean injected;

    public /* synthetic */ Hammer_CuratedListIpoAccessHeaderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, i, i2);
    }

    public /* synthetic */ Hammer_CuratedListIpoAccessHeaderView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, i);
    }

    public /* synthetic */ Hammer_CuratedListIpoAccessHeaderView(Context context, AttributeSet attributeSet, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet);
    }

    public /* synthetic */ Hammer_CuratedListIpoAccessHeaderView(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    @Override // com.robinhood.hammer.core.internal.ComponentManagerHolder
    public /* bridge */ /* synthetic */ ComponentManager getComponentManager() {
        return this.componentManager;
    }

    @Override // com.robinhood.hammer.core.internal.ComponentManagerHolder
    public final ViewComponentManager getComponentManager() {
        return this.componentManager;
    }

    private Hammer_CuratedListIpoAccessHeaderView(Context context) {
        super(context);
        ViewComponentManager viewComponentManager = new ViewComponentManager(this);
        this.componentManager = viewComponentManager;
        if (this.injected) {
            return;
        }
        Hammer_CuratedListIpoAccessHeaderView2 hammer_CuratedListIpoAccessHeaderView2 = (Hammer_CuratedListIpoAccessHeaderView2) viewComponentManager.get();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.robinhood.android.lists.ui.ipo.CuratedListIpoAccessHeaderView");
        hammer_CuratedListIpoAccessHeaderView2.inject((CuratedListIpoAccessHeaderView) this);
        this.injected = true;
    }

    private Hammer_CuratedListIpoAccessHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ViewComponentManager viewComponentManager = new ViewComponentManager(this);
        this.componentManager = viewComponentManager;
        if (this.injected) {
            return;
        }
        Hammer_CuratedListIpoAccessHeaderView2 hammer_CuratedListIpoAccessHeaderView2 = (Hammer_CuratedListIpoAccessHeaderView2) viewComponentManager.get();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.robinhood.android.lists.ui.ipo.CuratedListIpoAccessHeaderView");
        hammer_CuratedListIpoAccessHeaderView2.inject((CuratedListIpoAccessHeaderView) this);
        this.injected = true;
    }

    private Hammer_CuratedListIpoAccessHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewComponentManager viewComponentManager = new ViewComponentManager(this);
        this.componentManager = viewComponentManager;
        if (this.injected) {
            return;
        }
        Hammer_CuratedListIpoAccessHeaderView2 hammer_CuratedListIpoAccessHeaderView2 = (Hammer_CuratedListIpoAccessHeaderView2) viewComponentManager.get();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.robinhood.android.lists.ui.ipo.CuratedListIpoAccessHeaderView");
        hammer_CuratedListIpoAccessHeaderView2.inject((CuratedListIpoAccessHeaderView) this);
        this.injected = true;
    }

    private Hammer_CuratedListIpoAccessHeaderView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        ViewComponentManager viewComponentManager = new ViewComponentManager(this);
        this.componentManager = viewComponentManager;
        if (this.injected) {
            return;
        }
        Hammer_CuratedListIpoAccessHeaderView2 hammer_CuratedListIpoAccessHeaderView2 = (Hammer_CuratedListIpoAccessHeaderView2) viewComponentManager.get();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.robinhood.android.lists.ui.ipo.CuratedListIpoAccessHeaderView");
        hammer_CuratedListIpoAccessHeaderView2.inject((CuratedListIpoAccessHeaderView) this);
        this.injected = true;
    }
}
