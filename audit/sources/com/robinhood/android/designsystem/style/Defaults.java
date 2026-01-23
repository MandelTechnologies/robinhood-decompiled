package com.robinhood.android.designsystem.style;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.appcompat.R$attr;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.card.RdsCardView;
import com.robinhood.android.designsystem.card.RdsCelebrationCardView;
import com.robinhood.android.designsystem.chart.RdsPieChart;
import com.robinhood.android.designsystem.container.RdsRippleContainerView;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.row.component.RdsRowTextContainerView;
import com.robinhood.android.designsystem.selectioncontrol.RdsSwitch;
import com.robinhood.android.designsystem.selectioncontrol.RdsToggleView;
import com.robinhood.android.designsystem.sparkle.Sparkleable;
import com.robinhood.android.designsystem.textinput.RdsFormattedEditText;
import com.robinhood.android.designsystem.textinput.RdsTextInputContainerView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.android.graphics.Gradient;
import com.robinhood.scarlet.property.StyleProperty;
import com.robinhood.scarlet.property.StyleableProperty;
import com.robinhood.scarlet.transition.attribute.ColorAttributeTransition;
import com.robinhood.scarlet.transition.attribute.ColorStateListAttributeTransition;
import com.robinhood.scarlet.transition.attribute.DrawableAttributeTransition;
import com.robinhood.scarlet.transition.attribute.FloatAttributeTransition;
import com.robinhood.scarlet.transition.attribute.SimpleAttributeTransition;
import com.robinhood.scarlet.util.resource.ResourceType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AttributeTransitions.kt */
@Metadata(m3635d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\nR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\nR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 ¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020!0\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\nR\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\nR\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020!0 ¢\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020!0\u0007¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\nR\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u0007¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\nR\u0017\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u0007¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\nR\u0017\u00102\u001a\b\u0012\u0004\u0012\u0002000\u0007¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\nR\u0017\u00104\u001a\b\u0012\u0004\u0012\u0002000\u0007¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\nR\u0017\u00106\u001a\b\u0012\u0004\u0012\u0002070\u0007¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\nR\u001c\u00109\u001a\b\u0012\u0004\u0012\u0002070\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\nR\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020<0\u0007¢\u0006\b\n\u0000\u001a\u0004\b=\u0010\nR\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u0007¢\u0006\b\n\u0000\u001a\u0004\b@\u0010\nR\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020C0B¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0017\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\u0007¢\u0006\b\n\u0000\u001a\u0004\bH\u0010\nR\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020G0\u0007¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010\nR\u0017\u0010K\u001a\b\u0012\u0004\u0012\u00020G0\u0007¢\u0006\b\n\u0000\u001a\u0004\bL\u0010\nR\u0017\u0010M\u001a\b\u0012\u0004\u0012\u00020G0\u0007¢\u0006\b\n\u0000\u001a\u0004\bN\u0010\nR\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020P0B¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010ER\u0017\u0010R\u001a\b\u0012\u0004\u0012\u00020P0B¢\u0006\b\n\u0000\u001a\u0004\bS\u0010ER\u0017\u0010T\u001a\b\u0012\u0004\u0012\u00020P0B¢\u0006\b\n\u0000\u001a\u0004\bU\u0010ER\u0017\u0010V\u001a\b\u0012\u0004\u0012\u00020W0\u0007¢\u0006\b\n\u0000\u001a\u0004\bX\u0010\nR\u0017\u0010Y\u001a\b\u0012\u0004\u0012\u00020Z0B¢\u0006\b\n\u0000\u001a\u0004\b[\u0010ER\u0017\u0010\\\u001a\b\u0012\u0004\u0012\u00020Z0B¢\u0006\b\n\u0000\u001a\u0004\b]\u0010ER\u001d\u0010^\u001a\u000e\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020a0_¢\u0006\b\n\u0000\u001a\u0004\bb\u0010cR\u001d\u0010d\u001a\u000e\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020e0_¢\u0006\b\n\u0000\u001a\u0004\bf\u0010c¨\u0006g"}, m3636d2 = {"Lcom/robinhood/android/designsystem/style/Defaults;", "", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "buttonIconTint", "Lcom/robinhood/scarlet/transition/attribute/ColorStateListAttributeTransition;", "Lcom/robinhood/android/designsystem/button/RdsButton;", "getButtonIconTint", "()Lcom/robinhood/scarlet/transition/attribute/ColorStateListAttributeTransition;", "buttonProgressBarTint", "getButtonProgressBarTint", "buttonRippleColor", "getButtonRippleColor", "buttonStrokeColor", "getButtonStrokeColor", "buttonStrokeWidth", "Lcom/robinhood/scarlet/transition/attribute/FloatAttributeTransition;", "getButtonStrokeWidth", "()Lcom/robinhood/scarlet/transition/attribute/FloatAttributeTransition;", "buttonContentIconTint", "getButtonContentIconTint", "buttonCornerRadius", "getButtonCornerRadius", "primaryTextIconTint", "Lcom/robinhood/android/designsystem/row/component/RdsRowTextContainerView;", "getPrimaryTextIconTint", "toggleRowPrimaryTextIconTint", "Lcom/robinhood/android/designsystem/selectioncontrol/RdsToggleView;", "getToggleRowPrimaryTextIconTint", "leadingIcon", "Lcom/robinhood/scarlet/transition/attribute/DrawableAttributeTransition;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "getLeadingIcon", "()Lcom/robinhood/scarlet/transition/attribute/DrawableAttributeTransition;", "leadingIconTint", "getLeadingIconTint", "toggleRowLeadingIconTint", "getToggleRowLeadingIconTint", "trailingIcon", "getTrailingIcon", "trailingIconTint", "getTrailingIconTint", "rippleColor", "Lcom/robinhood/android/designsystem/container/RdsRippleContainerView;", "getRippleColor", "switchTrackTint", "Lcom/robinhood/android/designsystem/selectioncontrol/RdsSwitch;", "getSwitchTrackTint", "switchThumbTint", "getSwitchThumbTint", "switchLockIconTint", "getSwitchLockIconTint", "cardRippleColor", "Lcom/robinhood/android/designsystem/card/RdsCardView;", "getCardRippleColor", "cardBackgroundColor", "getCardBackgroundColor", "celebrationCardForegroundColor", "Lcom/robinhood/android/designsystem/card/RdsCelebrationCardView;", "getCelebrationCardForegroundColor", "dataRowLabelIconTint", "Lcom/robinhood/android/designsystem/row/RdsDataRowView;", "getDataRowLabelIconTint", "rdsTextInputEditTextSecondaryHintColor", "Lcom/robinhood/scarlet/transition/attribute/ColorAttributeTransition;", "Lcom/robinhood/android/designsystem/textinput/RdsTextInputEditText;", "getRdsTextInputEditTextSecondaryHintColor", "()Lcom/robinhood/scarlet/transition/attribute/ColorAttributeTransition;", "inputContainerDrawableStartColor", "Lcom/robinhood/android/designsystem/textinput/RdsTextInputContainerView;", "getInputContainerDrawableStartColor", "inputContainerDrawableEndColor", "getInputContainerDrawableEndColor", "inputContainerCounterValidColor", "getInputContainerCounterValidColor", "inputContainerCounterInvalidColor", "getInputContainerCounterInvalidColor", "inputPlaceholderCharacterTextColor", "Lcom/robinhood/android/designsystem/textinput/RdsFormattedEditText;", "getInputPlaceholderCharacterTextColor", "inputFocusedPlaceholderCharacterTextColor", "getInputFocusedPlaceholderCharacterTextColor", "inputPreFormattedCharacterTextColor", "getInputPreFormattedCharacterTextColor", "pictogramTint", "Lcom/robinhood/android/designsystem/pog/RdsPogView;", "getPictogramTint", "pieChartViewDefaultRegionColor", "Lcom/robinhood/android/designsystem/chart/RdsPieChart;", "getPieChartViewDefaultRegionColor", "pieChartViewTrackColor", "getPieChartViewTrackColor", "sparkleableSparkleGradient", "Lcom/robinhood/scarlet/transition/attribute/SimpleAttributeTransition;", "Lcom/robinhood/android/designsystem/sparkle/Sparkleable;", "Lcom/robinhood/android/graphics/Gradient;", "getSparkleableSparkleGradient", "()Lcom/robinhood/scarlet/transition/attribute/SimpleAttributeTransition;", "sparkleableSparkleOverride", "Landroid/content/res/ColorStateList;", "getSparkleableSparkleOverride", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
final class Defaults {
    private final ColorStateListAttributeTransition<RdsButton> buttonContentIconTint;
    private final FloatAttributeTransition<RdsButton> buttonCornerRadius;
    private final ColorStateListAttributeTransition<RdsButton> buttonIconTint;
    private final ColorStateListAttributeTransition<RdsButton> buttonProgressBarTint;
    private final ColorStateListAttributeTransition<RdsButton> buttonRippleColor;
    private final ColorStateListAttributeTransition<RdsButton> buttonStrokeColor;
    private final FloatAttributeTransition<RdsButton> buttonStrokeWidth;

    @SuppressLint({"PrivateResource"})
    private final ColorStateListAttributeTransition<RdsCardView> cardBackgroundColor;
    private final ColorStateListAttributeTransition<RdsCardView> cardRippleColor;
    private final ColorStateListAttributeTransition<RdsCelebrationCardView> celebrationCardForegroundColor;
    private final ColorStateListAttributeTransition<RdsDataRowView> dataRowLabelIconTint;
    private final ColorStateListAttributeTransition<RdsTextInputContainerView> inputContainerCounterInvalidColor;
    private final ColorStateListAttributeTransition<RdsTextInputContainerView> inputContainerCounterValidColor;
    private final ColorStateListAttributeTransition<RdsTextInputContainerView> inputContainerDrawableEndColor;
    private final ColorStateListAttributeTransition<RdsTextInputContainerView> inputContainerDrawableStartColor;
    private final ColorAttributeTransition<RdsFormattedEditText> inputFocusedPlaceholderCharacterTextColor;
    private final ColorAttributeTransition<RdsFormattedEditText> inputPlaceholderCharacterTextColor;
    private final ColorAttributeTransition<RdsFormattedEditText> inputPreFormattedCharacterTextColor;
    private final DrawableAttributeTransition<RdsRowView> leadingIcon;
    private final ColorStateListAttributeTransition<RdsRowView> leadingIconTint;
    private final ColorStateListAttributeTransition<RdsPogView> pictogramTint;
    private final ColorAttributeTransition<RdsPieChart> pieChartViewDefaultRegionColor;
    private final ColorAttributeTransition<RdsPieChart> pieChartViewTrackColor;
    private final ColorStateListAttributeTransition<RdsRowTextContainerView> primaryTextIconTint;
    private final ColorAttributeTransition<RdsTextInputEditText> rdsTextInputEditTextSecondaryHintColor;
    private final ColorStateListAttributeTransition<RdsRippleContainerView> rippleColor;
    private final SimpleAttributeTransition<Sparkleable, Gradient> sparkleableSparkleGradient;
    private final SimpleAttributeTransition<Sparkleable, ColorStateList> sparkleableSparkleOverride;
    private final ColorStateListAttributeTransition<RdsSwitch> switchLockIconTint;
    private final ColorStateListAttributeTransition<RdsSwitch> switchThumbTint;
    private final ColorStateListAttributeTransition<RdsSwitch> switchTrackTint;
    private final ColorStateListAttributeTransition<RdsToggleView> toggleRowLeadingIconTint;
    private final ColorStateListAttributeTransition<RdsToggleView> toggleRowPrimaryTextIconTint;
    private final DrawableAttributeTransition<RdsRowView> trailingIcon;
    private final ColorStateListAttributeTransition<RdsRowView> trailingIconTint;

    public Defaults(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        StyleableProperty.Companion companion = StyleableProperty.INSTANCE;
        Defaults$buttonIconTint$1 defaults$buttonIconTint$1 = Defaults$buttonIconTint$1.INSTANCE;
        Function2 function2 = new Function2() { // from class: com.robinhood.android.designsystem.style.Defaults$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Defaults.buttonIconTint$lambda$0((RdsButton) obj, (ColorStateList) obj2);
            }
        };
        StyleProperty.Companion companion2 = StyleProperty.INSTANCE;
        int i = R$attr.iconTint;
        ResourceType.COLOR_STATE_LIST color_state_list = ResourceType.COLOR_STATE_LIST.INSTANCE;
        this.buttonIconTint = new ColorStateListAttributeTransition<>(companion.from(RdsButton.class, defaults$buttonIconTint$1, function2, companion2.from(resources, i, color_state_list)), false, 2, null);
        this.buttonProgressBarTint = new ColorStateListAttributeTransition<>(companion.from(RdsButton.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.designsystem.style.Defaults$buttonProgressBarTint$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((RdsButton) obj).getProgressBarTint();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((RdsButton) obj).setProgressBarTint((ColorStateList) obj2);
            }
        }, new Function2() { // from class: com.robinhood.android.designsystem.style.Defaults$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Defaults.buttonProgressBarTint$lambda$1((RdsButton) obj, (ColorStateList) obj2);
            }
        }, companion2.from(resources, C13997R.attr.progressBarTint, color_state_list)), false, 2, null);
        this.buttonRippleColor = new ColorStateListAttributeTransition<>(companion.from(RdsButton.class, Defaults$buttonRippleColor$1.INSTANCE, Defaults$buttonRippleColor$2.INSTANCE, companion2.from(resources, C13997R.attr.rippleColor, color_state_list)), false, 2, null);
        this.buttonStrokeColor = new ColorStateListAttributeTransition<>(companion.from(RdsButton.class, Defaults$buttonStrokeColor$1.INSTANCE, Defaults$buttonStrokeColor$2.INSTANCE, companion2.from(resources, com.google.android.material.R$attr.strokeColor, color_state_list)), false, 2, null);
        Function1 function1 = new Function1() { // from class: com.robinhood.android.designsystem.style.Defaults$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Defaults.buttonStrokeWidth$lambda$2((RdsButton) obj);
            }
        };
        Function2 function22 = new Function2() { // from class: com.robinhood.android.designsystem.style.Defaults$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Defaults.buttonStrokeWidth$lambda$3((RdsButton) obj, (Float) obj2);
            }
        };
        int i2 = com.google.android.material.R$attr.strokeWidth;
        ResourceType.DIMENSION dimension = ResourceType.DIMENSION.INSTANCE;
        this.buttonStrokeWidth = new FloatAttributeTransition<>(companion.from(RdsButton.class, function1, function22, companion2.from(resources, i2, dimension)), false, 2, null);
        this.buttonContentIconTint = new ColorStateListAttributeTransition<>(companion.from(RdsButton.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.designsystem.style.Defaults$buttonContentIconTint$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((RdsButton) obj).getContentIconTint();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((RdsButton) obj).setContentIconTint((ColorStateList) obj2);
            }
        }, new Function2() { // from class: com.robinhood.android.designsystem.style.Defaults$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Defaults.buttonContentIconTint$lambda$4((RdsButton) obj, (ColorStateList) obj2);
            }
        }, companion2.from(resources, C13997R.attr.contentIconTint, color_state_list)), false, 2, null);
        this.buttonCornerRadius = new FloatAttributeTransition<>(companion.from(RdsButton.class, new Function1() { // from class: com.robinhood.android.designsystem.style.Defaults$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Defaults.buttonCornerRadius$lambda$5((RdsButton) obj);
            }
        }, new Function2() { // from class: com.robinhood.android.designsystem.style.Defaults$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Defaults.buttonCornerRadius$lambda$6((RdsButton) obj, (Float) obj2);
            }
        }, companion2.from(resources, com.google.android.material.R$attr.cornerRadius, dimension)), false, 2, null);
        this.primaryTextIconTint = new ColorStateListAttributeTransition<>(companion.from(RdsRowTextContainerView.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.designsystem.style.Defaults$primaryTextIconTint$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((RdsRowTextContainerView) obj).getPrimaryTextIconTint();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((RdsRowTextContainerView) obj).setPrimaryTextIconTint((ColorStateList) obj2);
            }
        }, new Function2() { // from class: com.robinhood.android.designsystem.style.Defaults$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Defaults.primaryTextIconTint$lambda$7((RdsRowTextContainerView) obj, (ColorStateList) obj2);
            }
        }, companion2.from(resources, C13997R.attr.primaryTextIconTint, color_state_list)), false, 2, null);
        this.toggleRowPrimaryTextIconTint = new ColorStateListAttributeTransition<>(companion.from(RdsToggleView.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.designsystem.style.Defaults$toggleRowPrimaryTextIconTint$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((RdsToggleView) obj).getPrimaryTextIconTint();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((RdsToggleView) obj).setPrimaryTextIconTint((ColorStateList) obj2);
            }
        }, new Function2() { // from class: com.robinhood.android.designsystem.style.Defaults$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Defaults.toggleRowPrimaryTextIconTint$lambda$8((RdsToggleView) obj, (ColorStateList) obj2);
            }
        }, companion2.from(resources, C13997R.attr.primaryTextIconTint, color_state_list)), false, 2, null);
        Defaults$leadingIcon$1 defaults$leadingIcon$1 = new MutablePropertyReference1Impl() { // from class: com.robinhood.android.designsystem.style.Defaults$leadingIcon$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((RdsRowView) obj).getLeadingIconDrawable();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((RdsRowView) obj).setLeadingIconDrawable((Drawable) obj2);
            }
        };
        Function2 function23 = new Function2() { // from class: com.robinhood.android.designsystem.style.Defaults$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Defaults.leadingIcon$lambda$9((RdsRowView) obj, (Drawable) obj2);
            }
        };
        int i3 = C13997R.attr.leadingIcon;
        ResourceType.DRAWABLE drawable = ResourceType.DRAWABLE.INSTANCE;
        this.leadingIcon = new DrawableAttributeTransition<>(companion.from(RdsRowView.class, defaults$leadingIcon$1, function23, companion2.from(resources, i3, drawable)), false, 2, null);
        this.leadingIconTint = new ColorStateListAttributeTransition<>(companion.from(RdsRowView.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.designsystem.style.Defaults$leadingIconTint$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((RdsRowView) obj).getLeadingIconTint();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((RdsRowView) obj).setLeadingIconTint((ColorStateList) obj2);
            }
        }, new Function2() { // from class: com.robinhood.android.designsystem.style.Defaults$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Defaults.leadingIconTint$lambda$10((RdsRowView) obj, (ColorStateList) obj2);
            }
        }, companion2.from(resources, C13997R.attr.leadingIconTint, color_state_list)), false, 2, null);
        this.toggleRowLeadingIconTint = new ColorStateListAttributeTransition<>(companion.from(RdsToggleView.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.designsystem.style.Defaults$toggleRowLeadingIconTint$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((RdsToggleView) obj).getLeadingIconTint();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((RdsToggleView) obj).setLeadingIconTint((ColorStateList) obj2);
            }
        }, new Function2() { // from class: com.robinhood.android.designsystem.style.Defaults$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Defaults.toggleRowLeadingIconTint$lambda$11((RdsToggleView) obj, (ColorStateList) obj2);
            }
        }, companion2.from(resources, C13997R.attr.leadingIconTint, color_state_list)), false, 2, null);
        this.trailingIcon = new DrawableAttributeTransition<>(companion.from(RdsRowView.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.designsystem.style.Defaults$trailingIcon$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((RdsRowView) obj).getTrailingIconDrawable();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((RdsRowView) obj).setTrailingIconDrawable((Drawable) obj2);
            }
        }, new Function2() { // from class: com.robinhood.android.designsystem.style.Defaults$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Defaults.trailingIcon$lambda$12((RdsRowView) obj, (Drawable) obj2);
            }
        }, companion2.from(resources, C13997R.attr.trailingIcon, drawable)), false, 2, null);
        this.trailingIconTint = new ColorStateListAttributeTransition<>(companion.from(RdsRowView.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.designsystem.style.Defaults$trailingIconTint$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((RdsRowView) obj).getTrailingIconTint();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((RdsRowView) obj).setTrailingIconTint((ColorStateList) obj2);
            }
        }, new Function2() { // from class: com.robinhood.android.designsystem.style.Defaults$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Defaults.trailingIconTint$lambda$13((RdsRowView) obj, (ColorStateList) obj2);
            }
        }, companion2.from(resources, C13997R.attr.trailingIconTint, color_state_list)), false, 2, null);
        this.rippleColor = new ColorStateListAttributeTransition<>(companion.from(RdsRippleContainerView.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.designsystem.style.Defaults$rippleColor$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((RdsRippleContainerView) obj).getRippleColor();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((RdsRippleContainerView) obj).setRippleColor((ColorStateList) obj2);
            }
        }, new Function2() { // from class: com.robinhood.android.designsystem.style.Defaults$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Defaults.rippleColor$lambda$14((RdsRippleContainerView) obj, (ColorStateList) obj2);
            }
        }, companion2.from(resources, C13997R.attr.rippleColor, color_state_list)), false, 2, null);
        this.switchTrackTint = new ColorStateListAttributeTransition<>(companion.from(RdsSwitch.class, Defaults$switchTrackTint$1.INSTANCE, new Function2() { // from class: com.robinhood.android.designsystem.style.Defaults$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Defaults.switchTrackTint$lambda$15((RdsSwitch) obj, (ColorStateList) obj2);
            }
        }, companion2.from(resources, R$attr.trackTint, color_state_list)), false, 2, null);
        this.switchThumbTint = new ColorStateListAttributeTransition<>(companion.from(RdsSwitch.class, Defaults$switchThumbTint$1.INSTANCE, new Function2() { // from class: com.robinhood.android.designsystem.style.Defaults$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Defaults.switchThumbTint$lambda$16((RdsSwitch) obj, (ColorStateList) obj2);
            }
        }, companion2.from(resources, R$attr.thumbTint, color_state_list)), false, 2, null);
        this.switchLockIconTint = new ColorStateListAttributeTransition<>(companion.from(RdsSwitch.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.designsystem.style.Defaults$switchLockIconTint$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((RdsSwitch) obj).getLockIconTint();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((RdsSwitch) obj).setLockIconTint((ColorStateList) obj2);
            }
        }, new Function2() { // from class: com.robinhood.android.designsystem.style.Defaults$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Defaults.switchLockIconTint$lambda$17((RdsSwitch) obj, (ColorStateList) obj2);
            }
        }, companion2.from(resources, C13997R.attr.lockIconTint, color_state_list)), false, 2, null);
        this.cardRippleColor = new ColorStateListAttributeTransition<>(companion.from(RdsCardView.class, Defaults$cardRippleColor$1.INSTANCE, Defaults$cardRippleColor$2.INSTANCE, companion2.from(resources, C13997R.attr.rippleColor, color_state_list)), false, 2, null);
        this.cardBackgroundColor = new ColorStateListAttributeTransition<>(companion.from(RdsCardView.class, Defaults$cardBackgroundColor$1.INSTANCE, Defaults$cardBackgroundColor$2.INSTANCE, companion2.from(resources, androidx.cardview.R$attr.cardBackgroundColor, color_state_list)), false, 2, null);
        this.celebrationCardForegroundColor = new ColorStateListAttributeTransition<>(companion.from(RdsCelebrationCardView.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.designsystem.style.Defaults$celebrationCardForegroundColor$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((RdsCelebrationCardView) obj).getForegroundColor();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((RdsCelebrationCardView) obj).setForegroundColor((ColorStateList) obj2);
            }
        }, companion2.from(resources, com.google.android.material.R$attr.cardForegroundColor, color_state_list)), false, 2, null);
        this.dataRowLabelIconTint = new ColorStateListAttributeTransition<>(companion.from(RdsDataRowView.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.designsystem.style.Defaults$dataRowLabelIconTint$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((RdsDataRowView) obj).getLabelIconTint();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((RdsDataRowView) obj).setLabelIconTint((ColorStateList) obj2);
            }
        }, new Function2() { // from class: com.robinhood.android.designsystem.style.Defaults$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Defaults.dataRowLabelIconTint$lambda$18((RdsDataRowView) obj, (ColorStateList) obj2);
            }
        }, companion2.from(resources, C13997R.attr.labelIconTint, color_state_list)), false, 2, null);
        Defaults$rdsTextInputEditTextSecondaryHintColor$1 defaults$rdsTextInputEditTextSecondaryHintColor$1 = new MutablePropertyReference1Impl() { // from class: com.robinhood.android.designsystem.style.Defaults$rdsTextInputEditTextSecondaryHintColor$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((RdsTextInputEditText) obj).getSecondaryHintColor();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((RdsTextInputEditText) obj).setSecondaryHintColor((Integer) obj2);
            }
        };
        Function2 function24 = new Function2() { // from class: com.robinhood.android.designsystem.style.Defaults$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Defaults.rdsTextInputEditTextSecondaryHintColor$lambda$19((RdsTextInputEditText) obj, (Integer) obj2);
            }
        };
        int i4 = C13997R.attr.secondaryHintColor;
        ResourceType.COLOR color = ResourceType.COLOR.INSTANCE;
        this.rdsTextInputEditTextSecondaryHintColor = new ColorAttributeTransition<>(companion.from(RdsTextInputEditText.class, defaults$rdsTextInputEditTextSecondaryHintColor$1, function24, companion2.from(resources, i4, color)));
        this.inputContainerDrawableStartColor = new ColorStateListAttributeTransition<>(companion.from(RdsTextInputContainerView.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.designsystem.style.Defaults$inputContainerDrawableStartColor$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((RdsTextInputContainerView) obj).getDrawableStartTint();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((RdsTextInputContainerView) obj).setDrawableStartTint((ColorStateList) obj2);
            }
        }, new Function2() { // from class: com.robinhood.android.designsystem.style.Defaults$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Defaults.inputContainerDrawableStartColor$lambda$20((RdsTextInputContainerView) obj, (ColorStateList) obj2);
            }
        }, companion2.from(resources, C13997R.attr.drawableStartTint, color_state_list)), false, 2, null);
        this.inputContainerDrawableEndColor = new ColorStateListAttributeTransition<>(companion.from(RdsTextInputContainerView.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.designsystem.style.Defaults$inputContainerDrawableEndColor$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((RdsTextInputContainerView) obj).getDrawableEndTint();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((RdsTextInputContainerView) obj).setDrawableEndTint((ColorStateList) obj2);
            }
        }, new Function2() { // from class: com.robinhood.android.designsystem.style.Defaults$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Defaults.inputContainerDrawableEndColor$lambda$21((RdsTextInputContainerView) obj, (ColorStateList) obj2);
            }
        }, companion2.from(resources, C13997R.attr.drawableEndTint, color_state_list)), false, 2, null);
        this.inputContainerCounterValidColor = new ColorStateListAttributeTransition<>(companion.from(RdsTextInputContainerView.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.designsystem.style.Defaults$inputContainerCounterValidColor$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((RdsTextInputContainerView) obj).getCounterValidColor();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((RdsTextInputContainerView) obj).setCounterValidColor((ColorStateList) obj2);
            }
        }, new Defaults$inputContainerCounterValidColor$2(new MutablePropertyReference1Impl() { // from class: com.robinhood.android.designsystem.style.Defaults$inputContainerCounterValidColor$3
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((RdsTextInputContainerView) obj).getCounterValidColor();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((RdsTextInputContainerView) obj).setCounterValidColor((ColorStateList) obj2);
            }
        }), companion2.from(resources, C13997R.attr.counterValidColor, color_state_list)), false, 2, null);
        this.inputContainerCounterInvalidColor = new ColorStateListAttributeTransition<>(companion.from(RdsTextInputContainerView.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.designsystem.style.Defaults$inputContainerCounterInvalidColor$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((RdsTextInputContainerView) obj).getCounterInvalidColor();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((RdsTextInputContainerView) obj).setCounterInvalidColor((ColorStateList) obj2);
            }
        }, new Defaults$inputContainerCounterInvalidColor$2(new MutablePropertyReference1Impl() { // from class: com.robinhood.android.designsystem.style.Defaults$inputContainerCounterInvalidColor$3
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((RdsTextInputContainerView) obj).getCounterInvalidColor();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((RdsTextInputContainerView) obj).setCounterInvalidColor((ColorStateList) obj2);
            }
        }), companion2.from(resources, C13997R.attr.counterInvalidColor, color_state_list)), false, 2, null);
        this.inputPlaceholderCharacterTextColor = new ColorAttributeTransition<>(companion.from(RdsFormattedEditText.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.designsystem.style.Defaults$inputPlaceholderCharacterTextColor$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((RdsFormattedEditText) obj).getPlaceholderCharacterTextColor();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((RdsFormattedEditText) obj).setPlaceholderCharacterTextColor((Integer) obj2);
            }
        }, new Function2() { // from class: com.robinhood.android.designsystem.style.Defaults$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Defaults.inputPlaceholderCharacterTextColor$lambda$22((RdsFormattedEditText) obj, (Integer) obj2);
            }
        }, companion2.from(resources, C13997R.attr.placeholderCharacterTextColor, color)));
        this.inputFocusedPlaceholderCharacterTextColor = new ColorAttributeTransition<>(companion.from(RdsFormattedEditText.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.designsystem.style.Defaults$inputFocusedPlaceholderCharacterTextColor$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((RdsFormattedEditText) obj).getFocusedPlaceholderCharacterTextColor();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((RdsFormattedEditText) obj).setFocusedPlaceholderCharacterTextColor((Integer) obj2);
            }
        }, new Function2() { // from class: com.robinhood.android.designsystem.style.Defaults$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Defaults.inputFocusedPlaceholderCharacterTextColor$lambda$23((RdsFormattedEditText) obj, (Integer) obj2);
            }
        }, companion2.from(resources, C13997R.attr.focusedPlaceholderCharacterTextColor, color)));
        this.inputPreFormattedCharacterTextColor = new ColorAttributeTransition<>(companion.from(RdsFormattedEditText.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.designsystem.style.Defaults$inputPreFormattedCharacterTextColor$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((RdsFormattedEditText) obj).getPreFormattedCharacterTextColor();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((RdsFormattedEditText) obj).setPreFormattedCharacterTextColor((Integer) obj2);
            }
        }, new Function2() { // from class: com.robinhood.android.designsystem.style.Defaults$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Defaults.inputPreFormattedCharacterTextColor$lambda$24((RdsFormattedEditText) obj, (Integer) obj2);
            }
        }, companion2.from(resources, C13997R.attr.preFormattedCharacterTextColor, color)));
        this.pictogramTint = new ColorStateListAttributeTransition<>(companion.from(RdsPogView.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.designsystem.style.Defaults$pictogramTint$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((RdsPogView) obj).getPictogramTint();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((RdsPogView) obj).setPictogramTint((ColorStateList) obj2);
            }
        }, new Function2() { // from class: com.robinhood.android.designsystem.style.Defaults$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Defaults.pictogramTint$lambda$25((RdsPogView) obj, (ColorStateList) obj2);
            }
        }, companion2.from(resources, C13997R.attr.pictogramTint, color_state_list)), true);
        this.pieChartViewDefaultRegionColor = new ColorAttributeTransition<>(companion.from(RdsPieChart.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.designsystem.style.Defaults$pieChartViewDefaultRegionColor$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return Integer.valueOf(((RdsPieChart) obj).getDefaultSliceColor());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((RdsPieChart) obj).setDefaultSliceColor(((Number) obj2).intValue());
            }
        }, new Function2() { // from class: com.robinhood.android.designsystem.style.Defaults$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Defaults.pieChartViewDefaultRegionColor$lambda$26((RdsPieChart) obj, (Integer) obj2);
            }
        }, companion2.from(resources, C13997R.attr.pieDefaultSliceColor, color)));
        this.pieChartViewTrackColor = new ColorAttributeTransition<>(companion.from(RdsPieChart.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.designsystem.style.Defaults$pieChartViewTrackColor$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return Integer.valueOf(((RdsPieChart) obj).getTrackColor());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((RdsPieChart) obj).setTrackColor(((Number) obj2).intValue());
            }
        }, new Function2() { // from class: com.robinhood.android.designsystem.style.Defaults$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Defaults.pieChartViewTrackColor$lambda$27((RdsPieChart) obj, (Integer) obj2);
            }
        }, companion2.from(resources, C13997R.attr.pieTrackColor, color)));
        this.sparkleableSparkleGradient = new SimpleAttributeTransition<>(companion.from(Sparkleable.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.designsystem.style.Defaults$sparkleableSparkleGradient$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((Sparkleable) obj).getSparkleGradient();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((Sparkleable) obj).setSparkleGradient((Gradient) obj2);
            }
        }, companion2.from(resources, C13997R.attr.sparkleGradient, ResourceType.GRADIENT.INSTANCE)), true);
        this.sparkleableSparkleOverride = new SimpleAttributeTransition<>(companion.from(Sparkleable.class, new MutablePropertyReference1Impl() { // from class: com.robinhood.android.designsystem.style.Defaults$sparkleableSparkleOverride$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((Sparkleable) obj).getSparkleOverride();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((Sparkleable) obj).setSparkleOverride((ColorStateList) obj2);
            }
        }, companion2.from(resources, C13997R.attr.sparkleOverride, color_state_list)), true);
    }

    public final ColorStateListAttributeTransition<RdsButton> getButtonIconTint() {
        return this.buttonIconTint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buttonIconTint$lambda$0(RdsButton from, ColorStateList colorStateList) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setIconTint(colorStateList);
        return Unit.INSTANCE;
    }

    public final ColorStateListAttributeTransition<RdsButton> getButtonProgressBarTint() {
        return this.buttonProgressBarTint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buttonProgressBarTint$lambda$1(RdsButton from, ColorStateList colorStateList) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setProgressBarTint(colorStateList);
        return Unit.INSTANCE;
    }

    public final ColorStateListAttributeTransition<RdsButton> getButtonRippleColor() {
        return this.buttonRippleColor;
    }

    public final ColorStateListAttributeTransition<RdsButton> getButtonStrokeColor() {
        return this.buttonStrokeColor;
    }

    public final FloatAttributeTransition<RdsButton> getButtonStrokeWidth() {
        return this.buttonStrokeWidth;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float buttonStrokeWidth$lambda$2(RdsButton from) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        return Float.valueOf(from.getStrokeWidth());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buttonStrokeWidth$lambda$3(RdsButton from, Float f) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        if (f != null) {
            from.setStrokeWidth((int) f.floatValue());
        }
        return Unit.INSTANCE;
    }

    public final ColorStateListAttributeTransition<RdsButton> getButtonContentIconTint() {
        return this.buttonContentIconTint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buttonContentIconTint$lambda$4(RdsButton from, ColorStateList colorStateList) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setContentIconTint(colorStateList);
        return Unit.INSTANCE;
    }

    public final FloatAttributeTransition<RdsButton> getButtonCornerRadius() {
        return this.buttonCornerRadius;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float buttonCornerRadius$lambda$5(RdsButton from) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        return Float.valueOf(from.get_cornerRadius());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buttonCornerRadius$lambda$6(RdsButton from, Float f) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        if (f != null) {
            from.setCornerRadius((int) f.floatValue());
        }
        return Unit.INSTANCE;
    }

    public final ColorStateListAttributeTransition<RdsRowTextContainerView> getPrimaryTextIconTint() {
        return this.primaryTextIconTint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit primaryTextIconTint$lambda$7(RdsRowTextContainerView from, ColorStateList colorStateList) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setPrimaryTextIconTint(colorStateList);
        return Unit.INSTANCE;
    }

    public final ColorStateListAttributeTransition<RdsToggleView> getToggleRowPrimaryTextIconTint() {
        return this.toggleRowPrimaryTextIconTint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toggleRowPrimaryTextIconTint$lambda$8(RdsToggleView from, ColorStateList colorStateList) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setPrimaryTextIconTint(colorStateList);
        return Unit.INSTANCE;
    }

    public final DrawableAttributeTransition<RdsRowView> getLeadingIcon() {
        return this.leadingIcon;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit leadingIcon$lambda$9(RdsRowView from, Drawable drawable) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setLeadingIconDrawable(drawable);
        return Unit.INSTANCE;
    }

    public final ColorStateListAttributeTransition<RdsRowView> getLeadingIconTint() {
        return this.leadingIconTint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit leadingIconTint$lambda$10(RdsRowView from, ColorStateList colorStateList) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setLeadingIconTint(colorStateList);
        return Unit.INSTANCE;
    }

    public final ColorStateListAttributeTransition<RdsToggleView> getToggleRowLeadingIconTint() {
        return this.toggleRowLeadingIconTint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit toggleRowLeadingIconTint$lambda$11(RdsToggleView from, ColorStateList colorStateList) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setLeadingIconTint(colorStateList);
        return Unit.INSTANCE;
    }

    public final DrawableAttributeTransition<RdsRowView> getTrailingIcon() {
        return this.trailingIcon;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit trailingIcon$lambda$12(RdsRowView from, Drawable drawable) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setTrailingIconDrawable(drawable);
        return Unit.INSTANCE;
    }

    public final ColorStateListAttributeTransition<RdsRowView> getTrailingIconTint() {
        return this.trailingIconTint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit trailingIconTint$lambda$13(RdsRowView from, ColorStateList colorStateList) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setTrailingIconTint(colorStateList);
        return Unit.INSTANCE;
    }

    public final ColorStateListAttributeTransition<RdsRippleContainerView> getRippleColor() {
        return this.rippleColor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rippleColor$lambda$14(RdsRippleContainerView from, ColorStateList colorStateList) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
            Intrinsics.checkNotNullExpressionValue(colorStateList, "valueOf(...)");
        }
        from.setRippleColor(colorStateList);
        return Unit.INSTANCE;
    }

    public final ColorStateListAttributeTransition<RdsSwitch> getSwitchTrackTint() {
        return this.switchTrackTint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit switchTrackTint$lambda$15(RdsSwitch from, ColorStateList colorStateList) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setTrackTintList(colorStateList);
        return Unit.INSTANCE;
    }

    public final ColorStateListAttributeTransition<RdsSwitch> getSwitchThumbTint() {
        return this.switchThumbTint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit switchThumbTint$lambda$16(RdsSwitch from, ColorStateList colorStateList) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setThumbTintList(colorStateList);
        return Unit.INSTANCE;
    }

    public final ColorStateListAttributeTransition<RdsSwitch> getSwitchLockIconTint() {
        return this.switchLockIconTint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit switchLockIconTint$lambda$17(RdsSwitch from, ColorStateList colorStateList) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setLockIconTint(colorStateList);
        return Unit.INSTANCE;
    }

    public final ColorStateListAttributeTransition<RdsCardView> getCardRippleColor() {
        return this.cardRippleColor;
    }

    public final ColorStateListAttributeTransition<RdsCardView> getCardBackgroundColor() {
        return this.cardBackgroundColor;
    }

    public final ColorStateListAttributeTransition<RdsCelebrationCardView> getCelebrationCardForegroundColor() {
        return this.celebrationCardForegroundColor;
    }

    public final ColorStateListAttributeTransition<RdsDataRowView> getDataRowLabelIconTint() {
        return this.dataRowLabelIconTint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dataRowLabelIconTint$lambda$18(RdsDataRowView from, ColorStateList colorStateList) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setLabelIconTint(colorStateList);
        return Unit.INSTANCE;
    }

    public final ColorAttributeTransition<RdsTextInputEditText> getRdsTextInputEditTextSecondaryHintColor() {
        return this.rdsTextInputEditTextSecondaryHintColor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rdsTextInputEditTextSecondaryHintColor$lambda$19(RdsTextInputEditText from, Integer num) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setSecondaryHintColor(num);
        return Unit.INSTANCE;
    }

    public final ColorStateListAttributeTransition<RdsTextInputContainerView> getInputContainerDrawableStartColor() {
        return this.inputContainerDrawableStartColor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit inputContainerDrawableStartColor$lambda$20(RdsTextInputContainerView from, ColorStateList colorStateList) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setDrawableStartTint(colorStateList);
        return Unit.INSTANCE;
    }

    public final ColorStateListAttributeTransition<RdsTextInputContainerView> getInputContainerDrawableEndColor() {
        return this.inputContainerDrawableEndColor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit inputContainerDrawableEndColor$lambda$21(RdsTextInputContainerView from, ColorStateList colorStateList) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setDrawableEndTint(colorStateList);
        return Unit.INSTANCE;
    }

    public final ColorStateListAttributeTransition<RdsTextInputContainerView> getInputContainerCounterValidColor() {
        return this.inputContainerCounterValidColor;
    }

    public final ColorStateListAttributeTransition<RdsTextInputContainerView> getInputContainerCounterInvalidColor() {
        return this.inputContainerCounterInvalidColor;
    }

    public final ColorAttributeTransition<RdsFormattedEditText> getInputPlaceholderCharacterTextColor() {
        return this.inputPlaceholderCharacterTextColor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit inputPlaceholderCharacterTextColor$lambda$22(RdsFormattedEditText from, Integer num) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setPlaceholderCharacterTextColor(num);
        return Unit.INSTANCE;
    }

    public final ColorAttributeTransition<RdsFormattedEditText> getInputFocusedPlaceholderCharacterTextColor() {
        return this.inputFocusedPlaceholderCharacterTextColor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit inputFocusedPlaceholderCharacterTextColor$lambda$23(RdsFormattedEditText from, Integer num) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setFocusedPlaceholderCharacterTextColor(num);
        return Unit.INSTANCE;
    }

    public final ColorAttributeTransition<RdsFormattedEditText> getInputPreFormattedCharacterTextColor() {
        return this.inputPreFormattedCharacterTextColor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit inputPreFormattedCharacterTextColor$lambda$24(RdsFormattedEditText from, Integer num) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setPreFormattedCharacterTextColor(num);
        return Unit.INSTANCE;
    }

    public final ColorStateListAttributeTransition<RdsPogView> getPictogramTint() {
        return this.pictogramTint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pictogramTint$lambda$25(RdsPogView from, ColorStateList colorStateList) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setPictogramTint(colorStateList);
        return Unit.INSTANCE;
    }

    public final ColorAttributeTransition<RdsPieChart> getPieChartViewDefaultRegionColor() {
        return this.pieChartViewDefaultRegionColor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pieChartViewDefaultRegionColor$lambda$26(RdsPieChart from, Integer num) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setDefaultSliceColor(num != null ? num.intValue() : 0);
        return Unit.INSTANCE;
    }

    public final ColorAttributeTransition<RdsPieChart> getPieChartViewTrackColor() {
        return this.pieChartViewTrackColor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pieChartViewTrackColor$lambda$27(RdsPieChart from, Integer num) {
        Intrinsics.checkNotNullParameter(from, "$this$from");
        from.setTrackColor(num != null ? num.intValue() : 0);
        return Unit.INSTANCE;
    }

    public final SimpleAttributeTransition<Sparkleable, Gradient> getSparkleableSparkleGradient() {
        return this.sparkleableSparkleGradient;
    }

    public final SimpleAttributeTransition<Sparkleable, ColorStateList> getSparkleableSparkleOverride() {
        return this.sparkleableSparkleOverride;
    }
}
