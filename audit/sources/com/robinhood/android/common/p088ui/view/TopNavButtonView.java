package com.robinhood.android.common.p088ui.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.databinding.MergeTopNavButtonViewBinding;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsIconButton;
import com.robinhood.utils.extensions.TypedArrays3;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: TopNavButtonView.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0017\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u0013\u001a\u00020\u000fJ\u0010\u0010\u0014\u001a\u00020\u00122\b\b\u0001\u0010\u0015\u001a\u00020\u000fJ\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u0018J\b\u0010\u001a\u001a\u00020\u0012H\u0002J\u0012\u0010\u001b\u001a\u00020\u00122\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0002R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/common/ui/view/TopNavButtonView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/common/databinding/MergeTopNavButtonViewBinding;", "getBinding", "()Lcom/robinhood/android/common/databinding/MergeTopNavButtonViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "buttonSrcCompat", "", "Ljava/lang/Integer;", "setImageResource", "", "res", "updateImageTint", "resId", "maybeShowBadge", "shouldShowBadge", "", "isCritical", "clearBadge", "showBadge", "Companion", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public class TopNavButtonView extends ConstraintLayout {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private Integer buttonSrcCompat;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(TopNavButtonView.class, "binding", "getBinding()Lcom/robinhood/android/common/databinding/MergeTopNavButtonViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopNavButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, TopNavButtonView2.INSTANCE);
        ViewGroups.inflate(this, C11048R.layout.merge_top_nav_button_view, true);
        int[] TopNavButtonView = C11048R.styleable.TopNavButtonView;
        Intrinsics.checkNotNullExpressionValue(TopNavButtonView, "TopNavButtonView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, TopNavButtonView, 0, 0);
        Integer resourceIdOrNull = TypedArrays3.getResourceIdOrNull(typedArrayObtainStyledAttributes, C11048R.styleable.TopNavButtonView_buttonSrcCompat);
        this.buttonSrcCompat = resourceIdOrNull;
        if (resourceIdOrNull != null) {
            setImageResource(resourceIdOrNull.intValue());
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private final MergeTopNavButtonViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeTopNavButtonViewBinding) value;
    }

    public final void setImageResource(int res) {
        getBinding().topNavIconButton.setImageResource(res);
    }

    public final void updateImageTint(int resId) {
        RdsIconButton rdsIconButton = getBinding().topNavIconButton;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        rdsIconButton.setImageTintList(ColorStateList.valueOf(ThemeColors.getThemeColor(context, resId)));
    }

    public static /* synthetic */ void maybeShowBadge$default(TopNavButtonView topNavButtonView, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: maybeShowBadge");
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        topNavButtonView.maybeShowBadge(z, z2);
    }

    public final void maybeShowBadge(boolean shouldShowBadge, boolean isCritical) {
        if (shouldShowBadge) {
            showBadge(isCritical);
        } else {
            clearBadge();
        }
    }

    private final void clearBadge() {
        ImageView topNavBadgeView = getBinding().topNavBadgeView;
        Intrinsics.checkNotNullExpressionValue(topNavBadgeView, "topNavBadgeView");
        topNavBadgeView.setVisibility(8);
        ImageView topNavCriticalBadgeView = getBinding().topNavCriticalBadgeView;
        Intrinsics.checkNotNullExpressionValue(topNavCriticalBadgeView, "topNavCriticalBadgeView");
        topNavCriticalBadgeView.setVisibility(8);
    }

    static /* synthetic */ void showBadge$default(TopNavButtonView topNavButtonView, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showBadge");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        topNavButtonView.showBadge(z);
    }

    private final void showBadge(boolean isCritical) {
        if (isCritical) {
            ImageView topNavCriticalBadgeView = getBinding().topNavCriticalBadgeView;
            Intrinsics.checkNotNullExpressionValue(topNavCriticalBadgeView, "topNavCriticalBadgeView");
            topNavCriticalBadgeView.setVisibility(0);
            ImageView topNavBadgeView = getBinding().topNavBadgeView;
            Intrinsics.checkNotNullExpressionValue(topNavBadgeView, "topNavBadgeView");
            topNavBadgeView.setVisibility(8);
            return;
        }
        ImageView topNavBadgeView2 = getBinding().topNavBadgeView;
        Intrinsics.checkNotNullExpressionValue(topNavBadgeView2, "topNavBadgeView");
        topNavBadgeView2.setVisibility(0);
        ImageView topNavCriticalBadgeView2 = getBinding().topNavCriticalBadgeView;
        Intrinsics.checkNotNullExpressionValue(topNavCriticalBadgeView2, "topNavCriticalBadgeView");
        topNavCriticalBadgeView2.setVisibility(8);
    }

    /* compiled from: TopNavButtonView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/ui/view/TopNavButtonView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/common/ui/view/TopNavButtonView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<TopNavButtonView> {
        private final /* synthetic */ Inflater<TopNavButtonView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public TopNavButtonView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (TopNavButtonView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C11048R.layout.include_top_nav_button_view);
        }
    }
}
