package com.robinhood.android.productmarketing;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.common.util.extensions.Views;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.utils.extensions.KProperties2;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty3;

/* compiled from: SplashRowView.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001,B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010&\u001a\u00020'H\u0014J\u0010\u0010(\u001a\u00020'2\b\b\u0001\u0010)\u001a\u00020*J\b\u0010+\u001a\u00020'H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R(\u0010\u0016\u001a\u0004\u0018\u00010\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R/\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR/\u0010\"\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010!\u001a\u0004\b#\u0010\u001d\"\u0004\b$\u0010\u001f¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/productmarketing/SplashRowView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "iconImg", "Landroid/widget/ImageView;", "titleTxt", "Landroid/widget/TextView;", "descriptionTxt", "nightMode", "", "value", "Landroid/graphics/drawable/Drawable;", "iconDrawable", "getIconDrawable", "()Landroid/graphics/drawable/Drawable;", "setIconDrawable", "(Landroid/graphics/drawable/Drawable;)V", "iconDrawableNight", "getIconDrawableNight", "setIconDrawableNight", "<set-?>", "", "titleText", "getTitleText", "()Ljava/lang/CharSequence;", "setTitleText", "(Ljava/lang/CharSequence;)V", "titleText$delegate", "Lkotlin/reflect/KMutableProperty0;", "descriptionText", "getDescriptionText", "setDescriptionText", "descriptionText$delegate", "onAttachedToWindow", "", "setDescriptionLinkColor", ResourceTypes.COLOR, "", "updateIcon", "Companion", "lib-product-marketing_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class SplashRowView extends ConstraintLayout {

    /* renamed from: descriptionText$delegate, reason: from kotlin metadata */
    private final KProperty3 descriptionText;
    private final TextView descriptionTxt;
    private Drawable iconDrawable;
    private Drawable iconDrawableNight;
    private final ImageView iconImg;
    private boolean nightMode;

    /* renamed from: titleText$delegate, reason: from kotlin metadata */
    private final KProperty3 titleText;
    private final TextView titleTxt;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(SplashRowView.class, "titleText", "getTitleText()Ljava/lang/CharSequence;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(SplashRowView.class, "descriptionText", "getDescriptionText()Ljava/lang/CharSequence;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SplashRowView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DayNightOverlay.values().length];
            try {
                iArr[DayNightOverlay.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DayNightOverlay.NIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        int dimensionPixelSize = ViewsKt.getDimensionPixelSize(this, C13997R.dimen.rds_spacing_default);
        int dimensionPixelSize2 = ViewsKt.getDimensionPixelSize(this, C13997R.dimen.rds_spacing_medium);
        setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        ViewGroups.inflate(this, C25896R.layout.merge_splash_row, true);
        View viewFindViewById = findViewById(C25896R.id.splash_row_icon_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.iconImg = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(C25896R.id.splash_row_title_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        final TextView textView = (TextView) viewFindViewById2;
        this.titleTxt = textView;
        View viewFindViewById3 = findViewById(C25896R.id.splash_row_description_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        final TextView textView2 = (TextView) viewFindViewById3;
        this.descriptionTxt = textView2;
        this.titleText = new MutablePropertyReference0Impl(textView) { // from class: com.robinhood.android.productmarketing.SplashRowView$titleText$2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return TextViewsKt.getVisibilityText((TextView) this.receiver);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                TextViewsKt.setVisibilityText((TextView) this.receiver, (CharSequence) obj);
            }
        };
        this.descriptionText = new MutablePropertyReference0Impl(textView2) { // from class: com.robinhood.android.productmarketing.SplashRowView$descriptionText$2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return TextViewsKt.getVisibilityText((TextView) this.receiver);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                TextViewsKt.setVisibilityText((TextView) this.receiver, (CharSequence) obj);
            }
        };
        int[] SplashRowView = C25896R.styleable.SplashRowView;
        Intrinsics.checkNotNullExpressionValue(SplashRowView, "SplashRowView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, SplashRowView, 0, 0);
        setIconDrawable(typedArrayObtainStyledAttributes.getDrawable(C25896R.styleable.SplashRowView_iconImage));
        setIconDrawableNight(typedArrayObtainStyledAttributes.getDrawable(C25896R.styleable.SplashRowView_iconImageNight));
        String string2 = typedArrayObtainStyledAttributes.getString(C25896R.styleable.SplashRowView_titleText);
        setTitleText(string2 == null ? "" : string2);
        CharSequence text = typedArrayObtainStyledAttributes.getText(C25896R.styleable.SplashRowView_descriptionText);
        setDescriptionText(text != null ? text : "");
        typedArrayObtainStyledAttributes.recycle();
        updateIcon();
    }

    public /* synthetic */ SplashRowView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public final Drawable getIconDrawable() {
        return this.iconDrawable;
    }

    public final void setIconDrawable(Drawable drawable) {
        this.iconDrawable = drawable;
        updateIcon();
    }

    public final Drawable getIconDrawableNight() {
        return this.iconDrawableNight;
    }

    public final void setIconDrawableNight(Drawable drawable) {
        this.iconDrawableNight = drawable;
        updateIcon();
    }

    public final CharSequence getTitleText() {
        return (CharSequence) KProperties2.getValue(this.titleText, this, (KProperty<?>) $$delegatedProperties[0]);
    }

    public final void setTitleText(CharSequence charSequence) {
        KProperties2.setValue((KProperty3<CharSequence>) this.titleText, this, (KProperty<?>) $$delegatedProperties[0], charSequence);
    }

    public final CharSequence getDescriptionText() {
        return (CharSequence) KProperties2.getValue(this.descriptionText, this, (KProperty<?>) $$delegatedProperties[1]);
    }

    public final void setDescriptionText(CharSequence charSequence) {
        KProperties2.setValue((KProperty3<CharSequence>) this.descriptionText, this, (KProperty<?>) $$delegatedProperties[1], charSequence);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(Views.baseActivity(this).getDayNightStyleChanges()), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.productmarketing.SplashRowView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SplashRowView.onAttachedToWindow$lambda$1(this.f$0, (DayNightOverlay) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$1(SplashRowView splashRowView, DayNightOverlay style) {
        Intrinsics.checkNotNullParameter(style, "style");
        int i = WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
        boolean z = true;
        if (i == 1) {
            z = false;
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        splashRowView.nightMode = z;
        splashRowView.updateIcon();
        return Unit.INSTANCE;
    }

    public final void setDescriptionLinkColor(int color) {
        this.descriptionTxt.setLinkTextColor(color);
    }

    private final void updateIcon() {
        Drawable drawable;
        if (!this.nightMode || (drawable = this.iconDrawableNight) == null) {
            drawable = this.iconDrawable;
        }
        this.iconImg.setImageDrawable(drawable);
    }

    /* compiled from: SplashRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/productmarketing/SplashRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/productmarketing/SplashRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "lib-product-marketing_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<SplashRowView> {
        private final /* synthetic */ Inflater<SplashRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public SplashRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (SplashRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C25896R.layout.include_row_feature_splash);
        }
    }
}
