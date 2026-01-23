package com.robinhood.android.accountcenter.views;

import android.content.Context;
import android.util.AttributeSet;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.hammer.android.view.ViewComponentManager;
import com.robinhood.hammer.android.view.ViewComponentManagerHolder;
import com.robinhood.hammer.core.internal.ComponentManager;
import com.robinhood.hammer.core.internal.HammerGeneratedSuperclass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Hammer_AccountCenterMarkdownView.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b1\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0014\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0014\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\tB\u0019\b\u0014\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0005\u0010\fB#\b\u0014\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0005\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/Hammer_AccountCenterMarkdownView;", "Lcom/robinhood/android/designsystem/text/RhTextView;", "Lcom/robinhood/hammer/android/view/ViewComponentManagerHolder;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "injected", "", "componentManager", "Lcom/robinhood/hammer/android/view/ViewComponentManager;", "getComponentManager", "()Lcom/robinhood/hammer/android/view/ViewComponentManager;", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@HammerGeneratedSuperclass
/* loaded from: classes24.dex */
public abstract class Hammer_AccountCenterMarkdownView extends RhTextView implements ViewComponentManagerHolder {
    public static final int $stable = 8;
    private final ViewComponentManager componentManager;
    private boolean injected;

    public /* synthetic */ Hammer_AccountCenterMarkdownView(Context context, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, i);
    }

    public /* synthetic */ Hammer_AccountCenterMarkdownView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, i);
    }

    public /* synthetic */ Hammer_AccountCenterMarkdownView(Context context, AttributeSet attributeSet, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet);
    }

    public /* synthetic */ Hammer_AccountCenterMarkdownView(Context context, DefaultConstructorMarker defaultConstructorMarker) {
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

    private Hammer_AccountCenterMarkdownView(Context context) {
        super(context);
        ViewComponentManager viewComponentManager = new ViewComponentManager(this);
        this.componentManager = viewComponentManager;
        if (this.injected) {
            return;
        }
        Hammer_AccountCenterMarkdownView2 hammer_AccountCenterMarkdownView2 = (Hammer_AccountCenterMarkdownView2) viewComponentManager.get();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.robinhood.android.accountcenter.views.AccountCenterMarkdownView");
        hammer_AccountCenterMarkdownView2.inject((AccountCenterMarkdownView) this);
        this.injected = true;
    }

    private Hammer_AccountCenterMarkdownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ViewComponentManager viewComponentManager = new ViewComponentManager(this);
        this.componentManager = viewComponentManager;
        if (this.injected) {
            return;
        }
        Hammer_AccountCenterMarkdownView2 hammer_AccountCenterMarkdownView2 = (Hammer_AccountCenterMarkdownView2) viewComponentManager.get();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.robinhood.android.accountcenter.views.AccountCenterMarkdownView");
        hammer_AccountCenterMarkdownView2.inject((AccountCenterMarkdownView) this);
        this.injected = true;
    }

    private Hammer_AccountCenterMarkdownView(Context context, int i) {
        super(context, i);
        ViewComponentManager viewComponentManager = new ViewComponentManager(this);
        this.componentManager = viewComponentManager;
        if (this.injected) {
            return;
        }
        Hammer_AccountCenterMarkdownView2 hammer_AccountCenterMarkdownView2 = (Hammer_AccountCenterMarkdownView2) viewComponentManager.get();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.robinhood.android.accountcenter.views.AccountCenterMarkdownView");
        hammer_AccountCenterMarkdownView2.inject((AccountCenterMarkdownView) this);
        this.injected = true;
    }

    private Hammer_AccountCenterMarkdownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewComponentManager viewComponentManager = new ViewComponentManager(this);
        this.componentManager = viewComponentManager;
        if (this.injected) {
            return;
        }
        Hammer_AccountCenterMarkdownView2 hammer_AccountCenterMarkdownView2 = (Hammer_AccountCenterMarkdownView2) viewComponentManager.get();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.robinhood.android.accountcenter.views.AccountCenterMarkdownView");
        hammer_AccountCenterMarkdownView2.inject((AccountCenterMarkdownView) this);
        this.injected = true;
    }
}
