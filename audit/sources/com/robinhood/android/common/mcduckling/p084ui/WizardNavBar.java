package com.robinhood.android.common.mcduckling.p084ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.robinhood.android.common.mcduckling.C11257R;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.KProperties2;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.reflect.KProperty3;

/* compiled from: WizardNavBar.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u0001/B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0011\u001a\u0004\u0018\u00010\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR/\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010&\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00128F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010\u0014\"\u0004\b'\u0010\u0016R(\u0010(\u001a\u0004\u0018\u00010\u00172\b\u0010\u0011\u001a\u0004\u0018\u00010\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010\u001a\"\u0004\b*\u0010\u001cR/\u0010+\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b.\u0010%\u001a\u0004\b,\u0010!\"\u0004\b-\u0010#¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/ui/WizardNavBar;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "backBtn", "Landroid/widget/TextView;", "continueBtn", "callbacks", "Lcom/robinhood/android/common/mcduckling/ui/WizardNavBar$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/mcduckling/ui/WizardNavBar$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/common/mcduckling/ui/WizardNavBar$Callbacks;)V", "value", "", "isBackEnabled", "()Z", "setBackEnabled", "(Z)V", "Landroid/graphics/drawable/Drawable;", "backIcon", "getBackIcon", "()Landroid/graphics/drawable/Drawable;", "setBackIcon", "(Landroid/graphics/drawable/Drawable;)V", "<set-?>", "", "backText", "getBackText", "()Ljava/lang/CharSequence;", "setBackText", "(Ljava/lang/CharSequence;)V", "backText$delegate", "Lkotlin/reflect/KMutableProperty0;", "isContinueEnabled", "setContinueEnabled", "continueIcon", "getContinueIcon", "setContinueIcon", "continueText", "getContinueText", "setContinueText", "continueText$delegate", "Callbacks", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class WizardNavBar extends FrameLayout {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(WizardNavBar.class, "backText", "getBackText()Ljava/lang/CharSequence;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(WizardNavBar.class, "continueText", "getContinueText()Ljava/lang/CharSequence;", 0))};
    private final TextView backBtn;

    /* renamed from: backText$delegate, reason: from kotlin metadata */
    private final KProperty3 backText;
    private Callbacks callbacks;
    private final TextView continueBtn;

    /* renamed from: continueText$delegate, reason: from kotlin metadata */
    private final KProperty3 continueText;

    /* compiled from: WizardNavBar.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/ui/WizardNavBar$Callbacks;", "", "onBackButtonClick", "", "onContinueButtonClick", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onBackButtonClick();

        void onContinueButtonClick();
    }

    public /* synthetic */ WizardNavBar(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WizardNavBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, C11257R.style.Widget_Robinhood_WizardNavBar);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C11257R.layout.merge_wizard_nav_bar, true);
        View viewFindViewById = findViewById(C11257R.id.nav_bar_back_btn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        final TextView textView = (TextView) viewFindViewById;
        this.backBtn = textView;
        View viewFindViewById2 = findViewById(C11257R.id.nav_bar_continue_btn);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        final TextView textView2 = (TextView) viewFindViewById2;
        this.continueBtn = textView2;
        this.backText = new MutablePropertyReference0Impl(textView) { // from class: com.robinhood.android.common.mcduckling.ui.WizardNavBar$backText$2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return TextViewsKt.getVisibilityText((TextView) this.receiver);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                TextViewsKt.setVisibilityText((TextView) this.receiver, (CharSequence) obj);
            }
        };
        this.continueText = new MutablePropertyReference0Impl(textView2) { // from class: com.robinhood.android.common.mcduckling.ui.WizardNavBar$continueText$2
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty6
            public Object get() {
                return TextViewsKt.getVisibilityText((TextView) this.receiver);
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty3
            public void set(Object obj) {
                TextViewsKt.setVisibilityText((TextView) this.receiver, (CharSequence) obj);
            }
        };
        Integer themeAttribute = ContextsUiExtensions.getThemeAttribute(context, C20690R.attr.colorPrimary);
        if (themeAttribute != null) {
            int color = ViewsKt.getColor(this, themeAttribute.intValue());
            TextViewsKt.tintDrawables(textView, color);
            TextViewsKt.tintDrawables(textView2, color);
        }
        OnClickListeners.onClick(textView, new Function0() { // from class: com.robinhood.android.common.mcduckling.ui.WizardNavBar$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WizardNavBar._init_$lambda$1(this.f$0);
            }
        });
        OnClickListeners.onClick(textView2, new Function0() { // from class: com.robinhood.android.common.mcduckling.ui.WizardNavBar$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WizardNavBar._init_$lambda$2(this.f$0);
            }
        });
        int[] WizardNavBar = C11257R.styleable.WizardNavBar;
        Intrinsics.checkNotNullExpressionValue(WizardNavBar, "WizardNavBar");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, WizardNavBar, 0, C11257R.style.Widget_Robinhood_WizardNavBar);
        setBackEnabled(typedArrayObtainStyledAttributes.getBoolean(C11257R.styleable.WizardNavBar_backEnabled, true));
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C11257R.styleable.WizardNavBar_backIcon);
        if (drawable != null) {
            setBackIcon(drawable);
        }
        String string2 = typedArrayObtainStyledAttributes.getString(C11257R.styleable.WizardNavBar_backText);
        if (string2 != null) {
            setBackText(string2);
        }
        setContinueEnabled(typedArrayObtainStyledAttributes.getBoolean(C11257R.styleable.WizardNavBar_continueEnabled, true));
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(C11257R.styleable.WizardNavBar_continueIcon);
        if (drawable2 != null) {
            setContinueIcon(drawable2);
        }
        String string3 = typedArrayObtainStyledAttributes.getString(C11257R.styleable.WizardNavBar_continueText);
        if (string3 != null) {
            setContinueText(string3);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    public final boolean isBackEnabled() {
        return this.backBtn.isEnabled();
    }

    public final void setBackEnabled(boolean z) {
        this.backBtn.setEnabled(z);
    }

    public final Drawable getBackIcon() {
        return TextViewsKt.getDrawableStart(this.backBtn);
    }

    public final void setBackIcon(Drawable drawable) {
        TextViewsKt.setDrawables$default(this.backBtn, drawable, (Drawable) null, (Drawable) null, (Drawable) null, true, 14, (Object) null);
    }

    public final CharSequence getBackText() {
        return (CharSequence) KProperties2.getValue(this.backText, this, (KProperty<?>) $$delegatedProperties[0]);
    }

    public final void setBackText(CharSequence charSequence) {
        KProperties2.setValue((KProperty3<CharSequence>) this.backText, this, (KProperty<?>) $$delegatedProperties[0], charSequence);
    }

    public final boolean isContinueEnabled() {
        return this.continueBtn.isEnabled();
    }

    public final void setContinueEnabled(boolean z) {
        this.continueBtn.setEnabled(z);
    }

    public final Drawable getContinueIcon() {
        return TextViewsKt.getDrawableEnd(this.continueBtn);
    }

    public final void setContinueIcon(Drawable drawable) {
        TextViewsKt.setDrawables$default(this.continueBtn, (Drawable) null, (Drawable) null, drawable, (Drawable) null, true, 11, (Object) null);
    }

    public final CharSequence getContinueText() {
        return (CharSequence) KProperties2.getValue(this.continueText, this, (KProperty<?>) $$delegatedProperties[1]);
    }

    public final void setContinueText(CharSequence charSequence) {
        KProperties2.setValue((KProperty3<CharSequence>) this.continueText, this, (KProperty<?>) $$delegatedProperties[1], charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(WizardNavBar wizardNavBar) {
        Callbacks callbacks = wizardNavBar.callbacks;
        if (callbacks != null) {
            callbacks.onBackButtonClick();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$2(WizardNavBar wizardNavBar) {
        Callbacks callbacks = wizardNavBar.callbacks;
        if (callbacks != null) {
            callbacks.onContinueButtonClick();
        }
        return Unit.INSTANCE;
    }
}
