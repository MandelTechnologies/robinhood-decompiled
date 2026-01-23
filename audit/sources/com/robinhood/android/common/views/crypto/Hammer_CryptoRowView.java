package com.robinhood.android.common.views.crypto;

import android.content.Context;
import android.util.AttributeSet;
import com.robinhood.android.common.views.BaseInstrumentRowView;
import com.robinhood.hammer.android.view.ViewComponentManager;
import com.robinhood.hammer.android.view.ViewComponentManagerHolder;
import com.robinhood.hammer.core.internal.ComponentManager;
import com.robinhood.hammer.core.internal.HammerGeneratedSuperclass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Hammer_CryptoRowView.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b1\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0014\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/common/views/crypto/Hammer_CryptoRowView;", "Lcom/robinhood/android/common/views/BaseInstrumentRowView;", "Lcom/robinhood/hammer/android/view/ViewComponentManagerHolder;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "injected", "", "componentManager", "Lcom/robinhood/hammer/android/view/ViewComponentManager;", "getComponentManager", "()Lcom/robinhood/hammer/android/view/ViewComponentManager;", "feature-lib-instrument-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@HammerGeneratedSuperclass
/* loaded from: classes2.dex */
public abstract class Hammer_CryptoRowView extends BaseInstrumentRowView implements ViewComponentManagerHolder {
    public static final int $stable = 8;
    private final ViewComponentManager componentManager;
    private boolean injected;

    public /* synthetic */ Hammer_CryptoRowView(Context context, AttributeSet attributeSet, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet);
    }

    @Override // com.robinhood.hammer.core.internal.ComponentManagerHolder
    public /* bridge */ /* synthetic */ ComponentManager getComponentManager() {
        return this.componentManager;
    }

    @Override // com.robinhood.hammer.core.internal.ComponentManagerHolder
    public final ViewComponentManager getComponentManager() {
        return this.componentManager;
    }

    private Hammer_CryptoRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ViewComponentManager viewComponentManager = new ViewComponentManager(this);
        this.componentManager = viewComponentManager;
        if (this.injected) {
            return;
        }
        Hammer_CryptoRowView2 hammer_CryptoRowView2 = (Hammer_CryptoRowView2) viewComponentManager.get();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.robinhood.android.common.views.crypto.CryptoRowView");
        hammer_CryptoRowView2.inject((CryptoRowView) this);
        this.injected = true;
    }
}
