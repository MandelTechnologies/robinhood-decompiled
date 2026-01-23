package com.robinhood.android.settings.p254ui;

import android.content.Context;
import android.util.AttributeSet;
import com.robinhood.android.designsystem.accordion.RdsAccordionRowView;
import com.robinhood.hammer.android.view.ViewComponentManager;
import com.robinhood.hammer.android.view.ViewComponentManagerHolder;
import com.robinhood.hammer.core.internal.HammerGeneratedSuperclass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Hammer_AccordionView.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b1\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0014\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/Hammer_AccordionView;", "Lcom/robinhood/android/designsystem/accordion/RdsAccordionRowView;", "Lcom/robinhood/hammer/android/view/ViewComponentManagerHolder;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "injected", "", "feature-lib-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@HammerGeneratedSuperclass
/* loaded from: classes5.dex */
public abstract class Hammer_AccordionView extends RdsAccordionRowView implements ViewComponentManagerHolder {
    public static final int $stable = 8;
    private boolean injected;

    public /* synthetic */ Hammer_AccordionView(Context context, AttributeSet attributeSet, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet);
    }

    private Hammer_AccordionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (this.injected) {
            return;
        }
        Hammer_AccordionView2 hammer_AccordionView2 = (Hammer_AccordionView2) ((ViewComponentManager) getComponentManager()).get();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.robinhood.android.settings.ui.AccordionView");
        hammer_AccordionView2.inject((AccordionView) this);
        this.injected = true;
    }
}
