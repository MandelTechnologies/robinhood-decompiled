package com.robinhood.android.equitydetail.p123ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.robinhood.android.common.p088ui.view.ListWithMoreView;
import com.robinhood.hammer.android.view.ViewComponentManager;
import com.robinhood.hammer.android.view.ViewComponentManagerHolder;
import com.robinhood.hammer.core.internal.ComponentManager;
import com.robinhood.hammer.core.internal.HammerGeneratedSuperclass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Hammer_InstrumentHistoryView.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b1\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00042\u00020\u0005B\u0011\b\u0014\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0014\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/Hammer_InstrumentHistoryView;", "DataT", "ViewT", "Landroid/view/View;", "Lcom/robinhood/android/common/ui/view/ListWithMoreView;", "Lcom/robinhood/hammer/android/view/ViewComponentManagerHolder;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "injected", "", "componentManager", "Lcom/robinhood/hammer/android/view/ViewComponentManager;", "getComponentManager", "()Lcom/robinhood/hammer/android/view/ViewComponentManager;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@HammerGeneratedSuperclass
/* loaded from: classes3.dex */
public abstract class Hammer_InstrumentHistoryView<DataT, ViewT extends View> extends ListWithMoreView<DataT, ViewT> implements ViewComponentManagerHolder {
    public static final int $stable = 8;
    private final ViewComponentManager componentManager;
    private boolean injected;

    public /* synthetic */ Hammer_InstrumentHistoryView(Context context, AttributeSet attributeSet, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet);
    }

    public /* synthetic */ Hammer_InstrumentHistoryView(Context context, DefaultConstructorMarker defaultConstructorMarker) {
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

    private Hammer_InstrumentHistoryView(Context context) {
        super(context);
        ViewComponentManager viewComponentManager = new ViewComponentManager(this);
        this.componentManager = viewComponentManager;
        if (this.injected) {
            return;
        }
        Hammer_InstrumentHistoryView2 hammer_InstrumentHistoryView2 = (Hammer_InstrumentHistoryView2) viewComponentManager.get();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.robinhood.android.equitydetail.ui.InstrumentHistoryView");
        hammer_InstrumentHistoryView2.inject((InstrumentHistoryView) this);
        this.injected = true;
    }

    private Hammer_InstrumentHistoryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ViewComponentManager viewComponentManager = new ViewComponentManager(this);
        this.componentManager = viewComponentManager;
        if (this.injected) {
            return;
        }
        Hammer_InstrumentHistoryView2 hammer_InstrumentHistoryView2 = (Hammer_InstrumentHistoryView2) viewComponentManager.get();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.robinhood.android.equitydetail.ui.InstrumentHistoryView");
        hammer_InstrumentHistoryView2.inject((InstrumentHistoryView) this);
        this.injected = true;
    }
}
