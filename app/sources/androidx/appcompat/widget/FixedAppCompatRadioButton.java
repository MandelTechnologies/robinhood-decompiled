package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.R$attr;
import com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt;
import com.robinhood.models.p320db.Instrument;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FixedAppCompatRadioButton.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u000b\n\u0002\u0010\u0015\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0014J0\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0014J\u0018\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J(\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007H\u0014J\u0010\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u0007H\u0016J(\u0010%\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007H\u0016J\u0018\u0010)\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020+2\u0006\u0010\u001a\u001a\u00020\u0007H\u0016J\b\u0010,\u001a\u00020\u0007H\u0017J\b\u0010-\u001a\u00020\u0007H\u0016J\b\u0010.\u001a\u00020\u0007H\u0016J\b\u0010/\u001a\u00020\u0007H\u0016J\b\u00100\u001a\u00020+H\u0016R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\r¨\u00061"}, m3636d2 = {"Landroidx/appcompat/widget/FixedAppCompatRadioButton;", "Landroidx/appcompat/widget/AppCompatRadioButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "textHelper", "Landroidx/appcompat/widget/AppCompatTextHelper;", "getTextHelper$annotations", "()V", "setTextAppearance", "", "resId", "drawableStateChanged", "onLayout", UpdatePortfolioResultsScreenKt.ChangeLoggingIdentifier, "", "left", "top", "right", "bottom", "setTextSize", Instrument.TYPE_UNIT, "size", "", "onTextChanged", "text", "", "start", "lengthBefore", "lengthAfter", "setAutoSizeTextTypeWithDefaults", "autoSizeTextType", "setAutoSizeTextTypeUniformWithConfiguration", "autoSizeMinTextSize", "autoSizeMaxTextSize", "autoSizeStepGranularity", "setAutoSizeTextTypeUniformWithPresetSizes", "presetSizes", "", "getAutoSizeTextType", "getAutoSizeStepGranularity", "getAutoSizeMinTextSize", "getAutoSizeMaxTextSize", "getAutoSizeTextAvailableSizes", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"RestrictedApi"})
/* loaded from: classes4.dex */
public class FixedAppCompatRadioButton extends AppCompatRadioButton {
    public static final int $stable = 8;
    private final AppCompatTextHelper textHelper;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FixedAppCompatRadioButton(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FixedAppCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private static /* synthetic */ void getTextHelper$annotations() {
    }

    public /* synthetic */ FixedAppCompatRadioButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R$attr.radioButtonStyle : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FixedAppCompatRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        appCompatTextHelper.loadFromAttributes(attributeSet, i);
        appCompatTextHelper.applyCompoundDrawablesTints();
        this.textHelper = appCompatTextHelper;
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int resId) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.setTextAppearance(context, resId);
        AppCompatTextHelper appCompatTextHelper = this.textHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.onSetTextAppearance(context, resId);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatRadioButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatTextHelper appCompatTextHelper = this.textHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.applyCompoundDrawablesTints();
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        AppCompatTextHelper appCompatTextHelper = this.textHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.onLayout(changed, left, top, right, bottom);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int unit, float size) {
        if (Build.VERSION.SDK_INT >= 26) {
            super.setTextSize(unit, size);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.textHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.setTextSize(unit, size);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter) {
        Intrinsics.checkNotNullParameter(text, "text");
        super.onTextChanged(text, start, lengthBefore, lengthAfter);
        AppCompatTextHelper appCompatTextHelper = this.textHelper;
        if (appCompatTextHelper != null && Build.VERSION.SDK_INT < 26 && appCompatTextHelper.isAutoSizeEnabled()) {
            appCompatTextHelper.autoSizeText();
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int autoSizeTextType) {
        if (Build.VERSION.SDK_INT >= 26) {
            super.setAutoSizeTextTypeWithDefaults(autoSizeTextType);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.textHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.setAutoSizeTextTypeWithDefaults(autoSizeTextType);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int autoSizeMinTextSize, int autoSizeMaxTextSize, int autoSizeStepGranularity, int unit) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 26) {
            super.setAutoSizeTextTypeUniformWithConfiguration(autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.textHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.setAutoSizeTextTypeUniformWithConfiguration(autoSizeMinTextSize, autoSizeMaxTextSize, autoSizeStepGranularity, unit);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] presetSizes, int unit) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(presetSizes, "presetSizes");
        if (Build.VERSION.SDK_INT >= 26) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(presetSizes, unit);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.textHelper;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.setAutoSizeTextTypeUniformWithPresetSizes(presetSizes, unit);
        }
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (Build.VERSION.SDK_INT >= 26) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        AppCompatTextHelper appCompatTextHelper = this.textHelper;
        if (appCompatTextHelper != null) {
            return appCompatTextHelper.getAutoSizeTextType();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (Build.VERSION.SDK_INT >= 26) {
            return super.getAutoSizeStepGranularity();
        }
        AppCompatTextHelper appCompatTextHelper = this.textHelper;
        if (appCompatTextHelper != null) {
            return appCompatTextHelper.getAutoSizeStepGranularity();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (Build.VERSION.SDK_INT >= 26) {
            return super.getAutoSizeMinTextSize();
        }
        AppCompatTextHelper appCompatTextHelper = this.textHelper;
        if (appCompatTextHelper != null) {
            return appCompatTextHelper.getAutoSizeMinTextSize();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (Build.VERSION.SDK_INT >= 26) {
            return super.getAutoSizeMaxTextSize();
        }
        AppCompatTextHelper appCompatTextHelper = this.textHelper;
        if (appCompatTextHelper != null) {
            return appCompatTextHelper.getAutoSizeMaxTextSize();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        int[] autoSizeTextAvailableSizes;
        if (Build.VERSION.SDK_INT >= 26) {
            int[] autoSizeTextAvailableSizes2 = super.getAutoSizeTextAvailableSizes();
            Intrinsics.checkNotNull(autoSizeTextAvailableSizes2);
            return autoSizeTextAvailableSizes2;
        }
        AppCompatTextHelper appCompatTextHelper = this.textHelper;
        return (appCompatTextHelper == null || (autoSizeTextAvailableSizes = appCompatTextHelper.getAutoSizeTextAvailableSizes()) == null) ? new int[0] : autoSizeTextAvailableSizes;
    }
}
