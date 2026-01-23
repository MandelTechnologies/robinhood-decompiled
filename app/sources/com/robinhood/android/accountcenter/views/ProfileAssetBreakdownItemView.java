package com.robinhood.android.accountcenter.views;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.accountcenter.C8293R;
import com.robinhood.android.designsystem.container.RdsRippleContainerView;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.animation.AndroidProperties;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ProfileAssetBreakdownItemView.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 %2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001%B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003H\u0016J\u0010\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0014J\u0006\u0010 \u001a\u00020\u001bR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/ProfileAssetBreakdownItemView;", "Lcom/robinhood/android/designsystem/container/RdsRippleContainerView;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/accountcenter/views/AssetBreakdownItem;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "nameTxt", "Landroid/widget/TextView;", "percentageTxt", "barView", "Landroid/view/View;", "value", "", "barFraction", "getBarFraction", "()F", "setBarFraction", "(F)V", "barAnimator", "Landroid/animation/ObjectAnimator;", "globalVisibleRect", "Landroid/graphics/Rect;", "bind", "", "state", "onDraw", "canvas", "Landroid/graphics/Canvas;", "animateBar", "canAnimateBar", "", "getCanAnimateBar", "()Z", "Companion", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class ProfileAssetBreakdownItemView extends RdsRippleContainerView implements Bindable<AssetBreakdownItem> {
    private static final long BAR_ANIMATION_DURATION_MILLIS = 800;
    private static final float BAR_ANIMATION_INTERPOLATOR_FACTOR = 1.5f;
    private static final Property<ProfileAssetBreakdownItemView, Float> BAR_FRACTION;
    private ObjectAnimator barAnimator;
    private final View barView;
    private final Rect globalVisibleRect;
    private final TextView nameTxt;
    private final TextView percentageTxt;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileAssetBreakdownItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C8293R.layout.merge_profile_asset_breakdown_item_view, true);
        View viewFindViewById = findViewById(C8293R.id.asset_breakdown_name_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.nameTxt = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(C8293R.id.asset_breakdown_percentage_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.percentageTxt = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C8293R.id.asset_breakdown_fraction_bar_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.barView = viewFindViewById3;
        this.globalVisibleRect = new Rect();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getBarFraction() {
        ViewGroup.LayoutParams layoutParams = this.barView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        return ((ConstraintLayout.LayoutParams) layoutParams).matchConstraintPercentWidth;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setBarFraction(float f) {
        View view = this.barView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.matchConstraintPercentWidth = f;
        view.setLayoutParams(layoutParams2);
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(AssetBreakdownItem state) {
        ThemedResourceReference<Integer> color_primary;
        Intrinsics.checkNotNullParameter(state, "state");
        this.nameTxt.setText(state.getName());
        this.percentageTxt.setText(state.getDisplayPercentage());
        if (state.getIsOther()) {
            TextViewsKt.setDrawables$default(this.nameTxt, 0, 0, C20690R.drawable.ic_rds_info_16dp, 0, true, 11, (Object) null);
        } else {
            TextViewsKt.setDrawables$default(this.nameTxt, (Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null, false, 27, (Object) null);
        }
        boolean z = state.getPercentage() > 0.0f;
        if (z) {
            color_primary = ThemeAttributes.INSTANCE.getCOLOR_SECONDARY();
        } else {
            color_primary = ThemeAttributes.INSTANCE.getCOLOR_PRIMARY();
        }
        ScarletManager2.overrideAttribute(this.percentageTxt, R.attr.textColor, color_primary);
        this.barView.setVisibility(z ? 0 : 8);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, BAR_FRACTION, 0.0f, state.getPercentage());
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(1.5f));
        objectAnimatorOfFloat.setAutoCancel(true);
        if (getCanAnimateBar()) {
            this.barAnimator = null;
            objectAnimatorOfFloat.start();
        } else {
            this.barAnimator = objectAnimatorOfFloat;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        animateBar();
    }

    public final void animateBar() {
        if (getCanAnimateBar()) {
            ObjectAnimator objectAnimator = this.barAnimator;
            if (objectAnimator != null) {
                objectAnimator.start();
            }
            this.barAnimator = null;
        }
    }

    private final boolean getCanAnimateBar() {
        return getGlobalVisibleRect(this.globalVisibleRect);
    }

    /* compiled from: ProfileAssetBreakdownItemView.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0096\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/ProfileAssetBreakdownItemView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/accountcenter/views/ProfileAssetBreakdownItemView;", "<init>", "()V", "BAR_ANIMATION_DURATION_MILLIS", "", "BAR_ANIMATION_INTERPOLATOR_FACTOR", "", "BAR_FRACTION", "Landroid/util/Property;", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<ProfileAssetBreakdownItemView> {
        private final /* synthetic */ Inflater<ProfileAssetBreakdownItemView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public ProfileAssetBreakdownItemView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (ProfileAssetBreakdownItemView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C8293R.layout.include_profile_asset_breakdown_item_view);
        }
    }

    static {
        final ProfileAssetBreakdownItemView2 profileAssetBreakdownItemView2 = new MutablePropertyReference1Impl() { // from class: com.robinhood.android.accountcenter.views.ProfileAssetBreakdownItemView$Companion$BAR_FRACTION$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return Float.valueOf(((ProfileAssetBreakdownItemView) obj).getBarFraction());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((ProfileAssetBreakdownItemView) obj).setBarFraction(((Number) obj2).floatValue());
            }
        };
        AndroidProperties androidProperties = AndroidProperties.INSTANCE;
        final String name = profileAssetBreakdownItemView2.getName();
        final Class<Float> cls = Float.class;
        BAR_FRACTION = new Property<ProfileAssetBreakdownItemView, Float>(name, cls) { // from class: com.robinhood.android.accountcenter.views.ProfileAssetBreakdownItemView$special$$inlined$asAndroidProperty$1
            @Override // android.util.Property
            public boolean isReadOnly() {
                return false;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Float, java.lang.Object] */
            @Override // android.util.Property
            public Float get(ProfileAssetBreakdownItemView view) {
                Intrinsics.checkNotNullParameter(view, "view");
                return profileAssetBreakdownItemView2.get(view);
            }

            @Override // android.util.Property
            public void set(ProfileAssetBreakdownItemView view, Float value) {
                Intrinsics.checkNotNullParameter(view, "view");
                profileAssetBreakdownItemView2.set(view, value);
            }
        };
    }
}
