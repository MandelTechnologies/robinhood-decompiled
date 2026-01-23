package com.robinhood.android.accountcenter.views.circlechart;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.accountcenter.C8293R;
import com.robinhood.android.designsystem.sparkle.SparkleDrawable;
import com.robinhood.android.designsystem.sparkle.Sparkleable;
import com.robinhood.android.graphics.Gradient;
import com.robinhood.utils.extensions.KProperties2;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty3;

/* compiled from: CircleView.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001&B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!J\u0012\u0010#\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R/\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u000b\u001a\u0004\u0018\u00010\u00148V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/circlechart/CircleView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/robinhood/android/designsystem/sparkle/Sparkleable;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "sparkleDrawable", "Lcom/robinhood/android/designsystem/sparkle/SparkleDrawable;", "<set-?>", "Lcom/robinhood/android/graphics/Gradient;", "sparkleGradient", "getSparkleGradient", "()Lcom/robinhood/android/graphics/Gradient;", "setSparkleGradient", "(Lcom/robinhood/android/graphics/Gradient;)V", "sparkleGradient$delegate", "Lkotlin/reflect/KMutableProperty0;", "Landroid/content/res/ColorStateList;", "sparkleOverride", "getSparkleOverride", "()Landroid/content/res/ColorStateList;", "setSparkleOverride", "(Landroid/content/res/ColorStateList;)V", "sparkleOverride$delegate", "titleTxt", "Landroid/widget/TextView;", "subtitleTxt", "bind", "", "title", "", "subtitle", "setBackground", "background", "Landroid/graphics/drawable/Drawable;", "Companion", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class CircleView extends ConstraintLayout implements Sparkleable {
    private final SparkleDrawable sparkleDrawable;

    /* renamed from: sparkleGradient$delegate, reason: from kotlin metadata */
    private final KProperty3 sparkleGradient;

    /* renamed from: sparkleOverride$delegate, reason: from kotlin metadata */
    private final KProperty3 sparkleOverride;
    private final TextView subtitleTxt;
    private final TextView titleTxt;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(CircleView.class, "sparkleGradient", "getSparkleGradient()Lcom/robinhood/android/graphics/Gradient;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(CircleView.class, "sparkleOverride", "getSparkleOverride()Landroid/content/res/ColorStateList;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // android.view.View
    public void setBackground(Drawable background) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        final SparkleDrawable sparkleDrawable = new SparkleDrawable(this, new OvalShape(), attributeSet, 0, 8, null);
        this.sparkleDrawable = sparkleDrawable;
        this.sparkleGradient = new MutablePropertyReference0Impl(sparkleDrawable) { // from class: com.robinhood.android.accountcenter.views.circlechart.CircleView$sparkleGradient$2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return ((SparkleDrawable) this.receiver).getSparkleGradient();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                ((SparkleDrawable) this.receiver).setSparkleGradient((Gradient) obj);
            }
        };
        this.sparkleOverride = new MutablePropertyReference0Impl(sparkleDrawable) { // from class: com.robinhood.android.accountcenter.views.circlechart.CircleView$sparkleOverride$2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return ((SparkleDrawable) this.receiver).getSparkleOverride();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                ((SparkleDrawable) this.receiver).setSparkleOverride((ColorStateList) obj);
            }
        };
        ViewGroups.inflate(this, C8293R.layout.merge_profile_circle_view, true);
        super.setBackground(sparkleDrawable);
        setTransitionGroup(true);
        View viewFindViewById = findViewById(C8293R.id.profile_circle_title_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.titleTxt = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(C8293R.id.profile_circle_subtitle_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.subtitleTxt = (TextView) viewFindViewById2;
    }

    @Override // com.robinhood.android.designsystem.sparkle.Sparkleable
    public Gradient getSparkleGradient() {
        return (Gradient) KProperties2.getValue(this.sparkleGradient, this, (KProperty<?>) $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.designsystem.sparkle.Sparkleable
    public void setSparkleGradient(Gradient gradient) {
        KProperties2.setValue((KProperty3<Gradient>) this.sparkleGradient, this, (KProperty<?>) $$delegatedProperties[0], gradient);
    }

    @Override // com.robinhood.android.designsystem.sparkle.Sparkleable
    public ColorStateList getSparkleOverride() {
        return (ColorStateList) KProperties2.getValue(this.sparkleOverride, this, (KProperty<?>) $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.designsystem.sparkle.Sparkleable
    public void setSparkleOverride(ColorStateList colorStateList) {
        KProperties2.setValue((KProperty3<ColorStateList>) this.sparkleOverride, this, (KProperty<?>) $$delegatedProperties[1], colorStateList);
    }

    public final void bind(CharSequence title, CharSequence subtitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.titleTxt.setText(title);
        this.subtitleTxt.setText(subtitle);
    }

    /* compiled from: CircleView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/circlechart/CircleView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/accountcenter/views/circlechart/CircleView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<CircleView> {
        private final /* synthetic */ Inflater<CircleView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public CircleView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (CircleView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C8293R.layout.include_circle_view);
        }
    }
}
