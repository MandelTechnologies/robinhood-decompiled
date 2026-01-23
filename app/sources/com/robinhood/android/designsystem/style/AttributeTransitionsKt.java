package com.robinhood.android.designsystem.style;

import android.content.res.Resources;
import com.robinhood.scarlet.registry.AttributeTransitionsRegistry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AttributeTransitions.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m3636d2 = {"withDesignSystemDefaults", "Lcom/robinhood/scarlet/registry/AttributeTransitionsRegistry$Builder;", "resources", "Landroid/content/res/Resources;", "lib-design-system_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class AttributeTransitionsKt {
    public static final AttributeTransitionsRegistry.Builder withDesignSystemDefaults(AttributeTransitionsRegistry.Builder builder, Resources resources) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Defaults defaults = new Defaults(resources);
        builder.add(defaults.getButtonCornerRadius());
        builder.add(defaults.getButtonIconTint());
        builder.add(defaults.getButtonProgressBarTint());
        builder.add(defaults.getButtonRippleColor());
        builder.add(defaults.getButtonStrokeColor());
        builder.add(defaults.getButtonStrokeWidth());
        builder.add(defaults.getButtonContentIconTint());
        builder.add(defaults.getPrimaryTextIconTint());
        builder.add(defaults.getToggleRowPrimaryTextIconTint());
        builder.add(defaults.getLeadingIcon());
        builder.add(defaults.getLeadingIconTint());
        builder.add(defaults.getToggleRowLeadingIconTint());
        builder.add(defaults.getTrailingIcon());
        builder.add(defaults.getTrailingIconTint());
        builder.add(defaults.getRippleColor());
        builder.add(defaults.getSwitchTrackTint());
        builder.add(defaults.getSwitchThumbTint());
        builder.add(defaults.getSwitchLockIconTint());
        builder.add(defaults.getCardRippleColor());
        builder.add(defaults.getCardBackgroundColor());
        builder.add(defaults.getCelebrationCardForegroundColor());
        builder.add(defaults.getDataRowLabelIconTint());
        builder.add(defaults.getRdsTextInputEditTextSecondaryHintColor());
        builder.add(defaults.getInputContainerDrawableStartColor());
        builder.add(defaults.getInputContainerDrawableEndColor());
        builder.add(defaults.getInputContainerCounterValidColor());
        builder.add(defaults.getInputContainerCounterInvalidColor());
        builder.add(defaults.getInputPlaceholderCharacterTextColor());
        builder.add(defaults.getInputFocusedPlaceholderCharacterTextColor());
        builder.add(defaults.getInputPreFormattedCharacterTextColor());
        builder.add(defaults.getPictogramTint());
        builder.add(defaults.getPieChartViewDefaultRegionColor());
        builder.add(defaults.getPieChartViewTrackColor());
        builder.add(defaults.getSparkleableSparkleGradient());
        builder.add(defaults.getSparkleableSparkleOverride());
        return builder;
    }
}
