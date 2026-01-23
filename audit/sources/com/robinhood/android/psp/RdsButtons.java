package com.robinhood.android.psp;

import android.content.res.ColorStateList;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.R$attr;
import com.google.android.material.color.MaterialColors;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.models.serverdriven.GenericButtonType;
import com.robinhood.models.serverdriven.p347db.GenericButton;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ResourceValue;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.Preconditions;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RdsButtons.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"ALPHA_ONE_TENTH", "", "ALPHA_FULL", "styleCustomPspColor", "", "Lcom/robinhood/android/designsystem/button/RdsButton;", "button", "Lcom/robinhood/models/serverdriven/db/GenericButton;", "primaryColor", "feature-partner-stock-program_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.psp.RdsButtonsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class RdsButtons {
    public static final int ALPHA_FULL = 255;
    public static final int ALPHA_ONE_TENTH = 26;

    /* compiled from: RdsButtons.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.psp.RdsButtonsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GenericButtonType.values().length];
            try {
                iArr[GenericButtonType.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GenericButtonType.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GenericButtonType.TERTIARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GenericButtonType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void styleCustomPspColor(RdsButton rdsButton, GenericButton button, int i) {
        Intrinsics.checkNotNullParameter(rdsButton, "<this>");
        Intrinsics.checkNotNullParameter(button, "button");
        ResourceType.COLOR color = ResourceType.COLOR.INSTANCE;
        ThemedResourceReference themedResourceReference = new ThemedResourceReference(color, C13997R.attr.paletteColorNova);
        ResourceValue resourceValue = new ResourceValue(color, Integer.valueOf(ColorUtils.setAlphaComponent(i, 26)));
        ResourceValue resourceValue2 = new ResourceValue(ResourceType.COLOR_STATE_LIST.INSTANCE, new ColorStateList(new int[][]{new int[]{C13997R.attr.state_loading}, new int[]{-16842910}, new int[0]}, new int[]{MaterialColors.compositeARGBWithAlpha(i, 0), MaterialColors.compositeARGBWithAlpha(i, 255), MaterialColors.compositeARGBWithAlpha(i, 255)}));
        GenericButtonType genericButtonType = button.getGenericButtonType();
        int i2 = WhenMappings.$EnumSwitchMapping$0[genericButtonType.ordinal()];
        if (i2 == 1) {
            ScarletManager2.overrideAttribute(rdsButton, android.R.attr.backgroundTint, themedResourceReference);
            ScarletManager2.overrideAttribute(rdsButton, android.R.attr.textColor, resourceValue2);
        } else if (i2 == 2) {
            ScarletManager2.overrideAttribute(rdsButton, android.R.attr.textColor, themedResourceReference);
            ScarletManager2.overrideAttribute(rdsButton, R$attr.strokeColor, themedResourceReference);
            ScarletManager2.overrideAttribute(rdsButton, C13997R.attr.rippleColor, resourceValue);
        } else {
            if (i2 != 3 && i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            Preconditions.INSTANCE.failUnexpectedItemKotlin(genericButtonType);
            throw new ExceptionsH();
        }
    }
}
