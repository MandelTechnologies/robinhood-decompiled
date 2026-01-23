package com.robinhood.android.odyssey.lib.view;

import android.content.Context;
import android.util.AttributeSet;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.hammer.android.view.ViewComponentManager;
import com.robinhood.hammer.android.view.ViewComponentManagerHolder;
import com.robinhood.hammer.core.internal.HammerGeneratedSuperclass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Hammer_SdInformationalRow.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b1\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0014\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/Hammer_SdInformationalRow;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/hammer/android/view/ViewComponentManagerHolder;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "injected", "", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@HammerGeneratedSuperclass
/* loaded from: classes10.dex */
public abstract class Hammer_SdInformationalRow extends RdsRowView implements ViewComponentManagerHolder {
    public static final int $stable = 8;
    private boolean injected;

    public /* synthetic */ Hammer_SdInformationalRow(Context context, AttributeSet attributeSet, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet);
    }

    private Hammer_SdInformationalRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (this.injected) {
            return;
        }
        Hammer_SdInformationalRow2 hammer_SdInformationalRow2 = (Hammer_SdInformationalRow2) ((ViewComponentManager) getComponentManager()).get();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.robinhood.android.odyssey.lib.view.SdInformationalRow");
        hammer_SdInformationalRow2.inject((SdInformationalRow) this);
        this.injected = true;
    }
}
