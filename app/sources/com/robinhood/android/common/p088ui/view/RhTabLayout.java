package com.robinhood.android.common.p088ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.ViewGroup2;
import com.google.android.material.tabs.TabLayout;
import com.robinhood.android.common.C11048R;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhTabLayout.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0017\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/common/ui/view/RhTabLayout;", "Lcom/google/android/material/tabs/TabLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "invalidateOnIndicatorColorUpdate", "", "setSelectedTabIndicatorColor", "", ResourceTypes.COLOR, "", "invalidateIndicator", "Companion", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public class RhTabLayout extends TabLayout {
    private final boolean invalidateOnIndicatorColorUpdate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C11048R.styleable.RhTabLayout);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.invalidateOnIndicatorColorUpdate = typedArrayObtainStyledAttributes.getBoolean(C11048R.styleable.RhTabLayout_invalidateOnIndicatorColorUpdate, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // com.google.android.material.tabs.TabLayout
    public void setSelectedTabIndicatorColor(int color) {
        super.setSelectedTabIndicatorColor(color);
        if (this.invalidateOnIndicatorColorUpdate) {
            invalidateIndicator();
        }
    }

    private final void invalidateIndicator() {
        setTabIndicatorFullWidth(isTabIndicatorFullWidth());
    }

    /* compiled from: RhTabLayout.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\tJ\f\u0010\u000b\u001a\u00020\u0005*\u00020\u0007H\u0002¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/ui/view/RhTabLayout$Companion;", "", "<init>", "()V", "updateTabTextView", "", "tab", "Lcom/google/android/material/tabs/TabLayout$Tab;", "action", "Lkotlin/Function1;", "Landroid/widget/TextView;", "updateView", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void updateTabTextView(TabLayout.Tab tab, Function1<? super TextView, Unit> action) {
            Intrinsics.checkNotNullParameter(tab, "tab");
            Intrinsics.checkNotNullParameter(action, "action");
            TabLayout.TabView view = tab.view;
            Intrinsics.checkNotNullExpressionValue(view, "view");
            Iterator<View> it = ViewGroup2.getChildren(view).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                View next = it.next();
                if (next instanceof TextView) {
                    action.invoke(next);
                    break;
                }
            }
            updateView(tab);
        }

        private final void updateView(TabLayout.Tab tab) {
            tab.setContentDescription(tab.getContentDescription());
        }
    }
}
