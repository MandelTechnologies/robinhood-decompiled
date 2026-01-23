package com.robinhood.compose.bento.component;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.InteractiveComponentSizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.ToggleableInteractionSource;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.theme.style.ButtonStyle;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoButton.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a7\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a;\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\t\u0010\f\u001a\u009b\u0001\u0010\t\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u009f\u0001\u0010\t\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00122\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u008e\u0001\u0010\t\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u00122\u001d\u0010$\u001a\u0019\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00050 ¢\u0006\u0002\b#H\u0007¢\u0006\u0004\b%\u0010&\u001a\u0092\u0001\u0010\t\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u00122\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u001d\u0010$\u001a\u0019\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00050 ¢\u0006\u0002\b#H\u0007¢\u0006\u0004\b'\u0010(\u001aa\u0010)\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0012H\u0007¢\u0006\u0004\b)\u0010*\u001ae\u0010)\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b)\u0010+\u001a\u000f\u0010,\u001a\u00020\u0005H\u0003¢\u0006\u0004\b,\u0010-\u001a\u000f\u0010.\u001a\u00020\u0005H\u0003¢\u0006\u0004\b.\u0010-\u001a\u000f\u0010/\u001a\u00020\u0005H\u0003¢\u0006\u0004\b/\u0010-\u001a\u000f\u00100\u001a\u00020\u0005H\u0003¢\u0006\u0004\b0\u0010-¨\u00062²\u0006\f\u00101\u001a\u00020\u00158\nX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoButtonState;", "state", "", "testTag", "Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "BentoButton", "(Lcom/robinhood/compose/bento/component/BentoButtonState;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "nullableTestTag", "(Lcom/robinhood/compose/bento/component/BentoButtonState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "text", "Lcom/robinhood/compose/bento/component/BentoButtons$Icon$Size16;", "icon", "Lcom/robinhood/compose/bento/component/BentoButtons$Type;", "type", "", "enabled", "loading", "Landroidx/compose/ui/graphics/Color;", "backgroundColorOverride", "textColorOverride", "borderColorOverride", "Landroidx/compose/ui/text/TextStyle;", "textStyleOverride", "showRippleEffectOnClick", "BentoButton-IRs1040", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/robinhood/compose/bento/component/BentoButtons$Icon$Size16;Lcom/robinhood/compose/bento/component/BentoButtons$Type;ZZLandroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/text/TextStyle;ZLandroidx/compose/runtime/Composer;III)V", "BentoButton-EikTQX8", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/robinhood/compose/bento/component/BentoButtons$Icon$Size16;Lcom/robinhood/compose/bento/component/BentoButtons$Type;ZZLandroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;Landroidx/compose/ui/text/TextStyle;ZLjava/lang/String;Landroidx/compose/runtime/Composer;III)V", "Lkotlin/Function2;", "Landroidx/compose/foundation/layout/RowScope;", "Lcom/robinhood/compose/theme/style/ButtonStyle$Style;", "Lkotlin/ExtensionFunctionType;", "content", "BentoButton-2nCz7is", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/robinhood/compose/bento/component/BentoButtons$Type;ZZLandroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;ZLkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "BentoButton-6BkTXZw", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/compose/bento/component/BentoButtons$Type;ZZLandroidx/compose/ui/graphics/Color;Landroidx/compose/ui/graphics/Color;ZLjava/lang/String;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "BentoGoldButton", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/robinhood/compose/bento/component/BentoButtons$Icon$Size16;Lcom/robinhood/compose/bento/component/BentoButtons$Type;ZZLandroidx/compose/runtime/Composer;II)V", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/robinhood/compose/bento/component/BentoButtons$Icon$Size16;Lcom/robinhood/compose/bento/component/BentoButtons$Type;ZZLjava/lang/String;Landroidx/compose/runtime/Composer;II)V", "Primary", "(Landroidx/compose/runtime/Composer;I)V", "Secondary", "PrimaryWithPlaceholders", "SecondaryWithPlaceholders", "currentForegroundColor", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class BentoButtonKt {

    /* compiled from: BentoButton.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BentoButtons.Type.values().length];
            try {
                iArr[BentoButtons.Type.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BentoButtons.Type.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoButton$lambda$0(BentoButtonState bentoButtonState, String str, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BentoButton(bentoButtonState, str, (Function0<Unit>) function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoButton$lambda$1(BentoButtonState bentoButtonState, Function0 function0, Modifier modifier, String str, int i, int i2, Composer composer, int i3) {
        BentoButton(bentoButtonState, (Function0<Unit>) function0, modifier, str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoButton_2nCz7is$lambda$4(Function0 function0, String str, Modifier modifier, BentoButtons.Type type2, boolean z, boolean z2, Color color, Color color2, boolean z3, Function4 function4, int i, int i2, Composer composer, int i3) {
        m20584BentoButton2nCz7is(function0, str, modifier, type2, z, z2, color, color2, z3, function4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoButton_6BkTXZw$lambda$7(Function0 function0, Modifier modifier, BentoButtons.Type type2, boolean z, boolean z2, Color color, Color color2, boolean z3, String str, Function4 function4, int i, int i2, Composer composer, int i3) {
        m20585BentoButton6BkTXZw(function0, modifier, type2, z, z2, color, color2, z3, str, function4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoButton_EikTQX8$lambda$3(Function0 function0, String str, Modifier modifier, BentoButtons.Icon.Size16 size16, BentoButtons.Type type2, boolean z, boolean z2, Color color, Color color2, Color color3, TextStyle textStyle, boolean z3, String str2, int i, int i2, int i3, Composer composer, int i4) {
        m20586BentoButtonEikTQX8(function0, str, modifier, size16, type2, z, z2, color, color2, color3, textStyle, z3, str2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoButton_IRs1040$lambda$2(Function0 function0, String str, String str2, Modifier modifier, BentoButtons.Icon.Size16 size16, BentoButtons.Type type2, boolean z, boolean z2, Color color, Color color2, Color color3, TextStyle textStyle, boolean z3, int i, int i2, int i3, Composer composer, int i4) {
        m20587BentoButtonIRs1040(function0, str, str2, modifier, size16, type2, z, z2, color, color2, color3, textStyle, z3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoGoldButton$lambda$8(Function0 function0, String str, String str2, Modifier modifier, BentoButtons.Icon.Size16 size16, BentoButtons.Type type2, boolean z, boolean z2, int i, int i2, Composer composer, int i3) {
        BentoGoldButton((Function0<Unit>) function0, str, str2, modifier, size16, type2, z, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoGoldButton$lambda$9(Function0 function0, String str, Modifier modifier, BentoButtons.Icon.Size16 size16, BentoButtons.Type type2, boolean z, boolean z2, String str2, int i, int i2, Composer composer, int i3) {
        BentoGoldButton((Function0<Unit>) function0, str, modifier, size16, type2, z, z2, str2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Primary$lambda$10(int i, Composer composer, int i2) {
        Primary(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrimaryWithPlaceholders$lambda$12(int i, Composer composer, int i2) {
        PrimaryWithPlaceholders(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Secondary$lambda$11(int i, Composer composer, int i2) {
        Secondary(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SecondaryWithPlaceholders$lambda$13(int i, Composer composer, int i2) {
        SecondaryWithPlaceholders(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void BentoButton(BentoButtonState state, String testTag, Function0<Unit> onClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final BentoButtonState bentoButtonState;
        final Function0<Unit> function0;
        final String str;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(testTag, "testTag");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-911260431);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(testTag) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-911260431, i3, -1, "com.robinhood.compose.bento.component.BentoButton (BentoButton.kt:59)");
            }
            int i5 = i3 >> 3;
            BentoButton(state, onClick, modifier3, testTag, composerStartRestartGroup, (i3 & 14) | (i5 & 112) | (i5 & 896) | ((i3 << 6) & 7168), 0);
            bentoButtonState = state;
            function0 = onClick;
            str = testTag;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            function0 = onClick;
            str = testTag;
            bentoButtonState = state;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoButtonKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoButtonKt.BentoButton$lambda$0(bentoButtonState, str, function0, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoButton(final BentoButtonState state, final Function0<Unit> onClick, Modifier modifier, String str, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        String str2;
        final Modifier modifier3;
        final String str3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1585562533);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    str2 = str;
                    i3 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
                }
                if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    String str4 = i4 == 0 ? null : str2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1585562533, i3, -1, "com.robinhood.compose.bento.component.BentoButton (BentoButton.kt:75)");
                    }
                    int i6 = i3;
                    modifier3 = modifier4;
                    int i7 = i6 >> 3;
                    m20585BentoButton6BkTXZw(onClick, modifier3, state.getType(), state.getEnabled(), state.getLoading(), state.m20594getBackgroundColorOverrideQN2ZGVo(), state.m20595getBorderColorOverrideQN2ZGVo(), state.getShowRippleEffectOnClick(), str4, ComposableLambda3.rememberComposableLambda(1366525644, true, new Function4<Row5, ButtonStyle.Style, Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoButtonKt.BentoButton.2
                        private static final long invoke$lambda$0(SnapshotState4<Color> snapshotState4) {
                            return snapshotState4.getValue().getValue();
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, ButtonStyle.Style style, Composer composer2, Integer num) {
                            invoke(row5, style, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Row5 BentoButton, ButtonStyle.Style style, Composer composer2, int i8) {
                            int i9;
                            Intrinsics.checkNotNullParameter(BentoButton, "$this$BentoButton");
                            Intrinsics.checkNotNullParameter(style, "style");
                            if ((i8 & 48) == 0) {
                                i9 = i8 | ((i8 & 64) == 0 ? composer2.changed(style) : composer2.changedInstance(style) ? 32 : 16);
                            } else {
                                i9 = i8;
                            }
                            if ((i9 & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) == 144 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1366525644, i9, -1, "com.robinhood.compose.bento.component.BentoButton.<anonymous> (BentoButton.kt:88)");
                            }
                            SnapshotState4<Color> snapshotState4 = style.getColors().getForegroundColor().get(state.getEnabled(), composer2, ButtonStyle.StateColor.$stable << 3);
                            if (state.getLoading()) {
                                composer2.startReplaceGroup(-1829397917);
                                BentoProgressIndicator3 bentoProgressIndicator3 = BentoProgressIndicator3.f5151S;
                                Color colorM20597getTextColorOverrideQN2ZGVo = state.m20597getTextColorOverrideQN2ZGVo();
                                BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(null, bentoProgressIndicator3, colorM20597getTextColorOverrideQN2ZGVo != null ? colorM20597getTextColorOverrideQN2ZGVo.getValue() : invoke$lambda$0(snapshotState4), composer2, 48, 1);
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(-1829146600);
                                composer2.startReplaceGroup(-1028835603);
                                if (state.getIcon() != null && state.getIcon().getPosition() == BentoButtons.Icon.Position.Leading) {
                                    BentoIcon4.Size16 size16 = new BentoIcon4.Size16(state.getIcon().getAsset());
                                    Color colorM20596getIconColorOverrideQN2ZGVo = state.m20596getIconColorOverrideQN2ZGVo();
                                    BentoIcon2.m20644BentoIconFU0evQE(size16, null, (colorM20596getIconColorOverrideQN2ZGVo == null && (colorM20596getIconColorOverrideQN2ZGVo = state.m20597getTextColorOverrideQN2ZGVo()) == null) ? invoke$lambda$0(snapshotState4) : colorM20596getIconColorOverrideQN2ZGVo.getValue(), null, null, false, composer2, 48, 56);
                                    Spacer2.Spacer(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, BentoButtonDefaults.INSTANCE.m20579getIconSpacingD9Ej5fM$lib_compose_bento_externalRelease()), composer2, 6);
                                }
                                composer2.endReplaceGroup();
                                AnnotatedString text = state.getText();
                                Color colorM20597getTextColorOverrideQN2ZGVo2 = state.m20597getTextColorOverrideQN2ZGVo();
                                Color colorM6701boximpl = Color.m6701boximpl(colorM20597getTextColorOverrideQN2ZGVo2 != null ? colorM20597getTextColorOverrideQN2ZGVo2.getValue() : invoke$lambda$0(snapshotState4));
                                int iM7959getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8();
                                TextStyle textStyleOverride = state.getTextStyleOverride();
                                if (textStyleOverride == null) {
                                    textStyleOverride = style.getTextStyle();
                                }
                                BentoText2.m20748BentoTextQnj7Zds(text, null, colorM6701boximpl, null, null, null, null, iM7959getEllipsisgIe3tQ8, false, 1, 0, null, null, textStyleOverride, composer2, 817889280, 0, 7546);
                                if (state.getIcon() != null && state.getIcon().getPosition() == BentoButtons.Icon.Position.Trailing) {
                                    Spacer2.Spacer(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, BentoButtonDefaults.INSTANCE.m20579getIconSpacingD9Ej5fM$lib_compose_bento_externalRelease()), composer2, 6);
                                    BentoIcon4.Size16 size162 = new BentoIcon4.Size16(state.getIcon().getAsset());
                                    Color colorM20596getIconColorOverrideQN2ZGVo2 = state.m20596getIconColorOverrideQN2ZGVo();
                                    BentoIcon2.m20644BentoIconFU0evQE(size162, null, (colorM20596getIconColorOverrideQN2ZGVo2 == null && (colorM20596getIconColorOverrideQN2ZGVo2 = state.m20597getTextColorOverrideQN2ZGVo()) == null) ? invoke$lambda$0(snapshotState4) : colorM20596getIconColorOverrideQN2ZGVo2.getValue(), null, null, false, composer2, 48, 56);
                                }
                                composer2.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, (i7 & 112) | (i7 & 14) | 805306368 | ((i6 << 15) & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str3 = str4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    str3 = str2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoButtonKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return BentoButtonKt.BentoButton$lambda$1(state, onClick, modifier3, str3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            str2 = str;
            if ((i3 & 1171) != 1170) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                int i62 = i3;
                modifier3 = modifier4;
                int i72 = i62 >> 3;
                m20585BentoButton6BkTXZw(onClick, modifier3, state.getType(), state.getEnabled(), state.getLoading(), state.m20594getBackgroundColorOverrideQN2ZGVo(), state.m20595getBorderColorOverrideQN2ZGVo(), state.getShowRippleEffectOnClick(), str4, ComposableLambda3.rememberComposableLambda(1366525644, true, new Function4<Row5, ButtonStyle.Style, Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoButtonKt.BentoButton.2
                    private static final long invoke$lambda$0(SnapshotState4<Color> snapshotState4) {
                        return snapshotState4.getValue().getValue();
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, ButtonStyle.Style style, Composer composer2, Integer num) {
                        invoke(row5, style, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Row5 BentoButton, ButtonStyle.Style style, Composer composer2, int i8) {
                        int i9;
                        Intrinsics.checkNotNullParameter(BentoButton, "$this$BentoButton");
                        Intrinsics.checkNotNullParameter(style, "style");
                        if ((i8 & 48) == 0) {
                            i9 = i8 | ((i8 & 64) == 0 ? composer2.changed(style) : composer2.changedInstance(style) ? 32 : 16);
                        } else {
                            i9 = i8;
                        }
                        if ((i9 & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) == 144 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1366525644, i9, -1, "com.robinhood.compose.bento.component.BentoButton.<anonymous> (BentoButton.kt:88)");
                        }
                        SnapshotState4<Color> snapshotState4 = style.getColors().getForegroundColor().get(state.getEnabled(), composer2, ButtonStyle.StateColor.$stable << 3);
                        if (state.getLoading()) {
                            composer2.startReplaceGroup(-1829397917);
                            BentoProgressIndicator3 bentoProgressIndicator3 = BentoProgressIndicator3.f5151S;
                            Color colorM20597getTextColorOverrideQN2ZGVo = state.m20597getTextColorOverrideQN2ZGVo();
                            BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(null, bentoProgressIndicator3, colorM20597getTextColorOverrideQN2ZGVo != null ? colorM20597getTextColorOverrideQN2ZGVo.getValue() : invoke$lambda$0(snapshotState4), composer2, 48, 1);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-1829146600);
                            composer2.startReplaceGroup(-1028835603);
                            if (state.getIcon() != null && state.getIcon().getPosition() == BentoButtons.Icon.Position.Leading) {
                                BentoIcon4.Size16 size16 = new BentoIcon4.Size16(state.getIcon().getAsset());
                                Color colorM20596getIconColorOverrideQN2ZGVo = state.m20596getIconColorOverrideQN2ZGVo();
                                BentoIcon2.m20644BentoIconFU0evQE(size16, null, (colorM20596getIconColorOverrideQN2ZGVo == null && (colorM20596getIconColorOverrideQN2ZGVo = state.m20597getTextColorOverrideQN2ZGVo()) == null) ? invoke$lambda$0(snapshotState4) : colorM20596getIconColorOverrideQN2ZGVo.getValue(), null, null, false, composer2, 48, 56);
                                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, BentoButtonDefaults.INSTANCE.m20579getIconSpacingD9Ej5fM$lib_compose_bento_externalRelease()), composer2, 6);
                            }
                            composer2.endReplaceGroup();
                            AnnotatedString text = state.getText();
                            Color colorM20597getTextColorOverrideQN2ZGVo2 = state.m20597getTextColorOverrideQN2ZGVo();
                            Color colorM6701boximpl = Color.m6701boximpl(colorM20597getTextColorOverrideQN2ZGVo2 != null ? colorM20597getTextColorOverrideQN2ZGVo2.getValue() : invoke$lambda$0(snapshotState4));
                            int iM7959getEllipsisgIe3tQ8 = TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8();
                            TextStyle textStyleOverride = state.getTextStyleOverride();
                            if (textStyleOverride == null) {
                                textStyleOverride = style.getTextStyle();
                            }
                            BentoText2.m20748BentoTextQnj7Zds(text, null, colorM6701boximpl, null, null, null, null, iM7959getEllipsisgIe3tQ8, false, 1, 0, null, null, textStyleOverride, composer2, 817889280, 0, 7546);
                            if (state.getIcon() != null && state.getIcon().getPosition() == BentoButtons.Icon.Position.Trailing) {
                                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, BentoButtonDefaults.INSTANCE.m20579getIconSpacingD9Ej5fM$lib_compose_bento_externalRelease()), composer2, 6);
                                BentoIcon4.Size16 size162 = new BentoIcon4.Size16(state.getIcon().getAsset());
                                Color colorM20596getIconColorOverrideQN2ZGVo2 = state.m20596getIconColorOverrideQN2ZGVo();
                                BentoIcon2.m20644BentoIconFU0evQE(size162, null, (colorM20596getIconColorOverrideQN2ZGVo2 == null && (colorM20596getIconColorOverrideQN2ZGVo2 = state.m20597getTextColorOverrideQN2ZGVo()) == null) ? invoke$lambda$0(snapshotState4) : colorM20596getIconColorOverrideQN2ZGVo2.getValue(), null, null, false, composer2, 48, 56);
                            }
                            composer2.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i72 & 112) | (i72 & 14) | 805306368 | ((i62 << 15) & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                str3 = str4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        str2 = str;
        if ((i3 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010d  */
    /* renamed from: BentoButton-IRs1040, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20587BentoButtonIRs1040(final Function0<Unit> onClick, final String text, final String testTag, Modifier modifier, BentoButtons.Icon.Size16 size16, BentoButtons.Type type2, boolean z, boolean z2, Color color, Color color2, Color color3, TextStyle textStyle, boolean z3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        BentoButtons.Icon.Size16 size162;
        int i6;
        int i7;
        boolean z4;
        int i8;
        boolean z5;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Modifier modifier3;
        final TextStyle textStyle2;
        Composer composer2;
        final Color color4;
        final boolean z6;
        final boolean z7;
        final Color color5;
        final BentoButtons.Type type3;
        final Color color6;
        final Modifier modifier4;
        final boolean z8;
        final BentoButtons.Icon.Size16 size163;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(testTag, "testTag");
        Composer composerStartRestartGroup = composer.startRestartGroup(2126761076);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(text) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(testTag) ? 256 : 128;
        }
        int i19 = i3 & 8;
        if (i19 != 0) {
            i4 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    size162 = size16;
                    i4 |= composerStartRestartGroup.changed(size162) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                } else if ((i & 196608) == 0) {
                    i4 |= composerStartRestartGroup.changed(type2 == null ? -1 : type2.ordinal()) ? 131072 : 65536;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                    z4 = z;
                } else {
                    z4 = z;
                    if ((i & 1572864) == 0) {
                        i4 |= composerStartRestartGroup.changed(z4) ? 1048576 : 524288;
                    }
                }
                i8 = i3 & 128;
                if (i8 != 0) {
                    i4 |= 12582912;
                    z5 = z2;
                } else {
                    z5 = z2;
                    if ((i & 12582912) == 0) {
                        i4 |= composerStartRestartGroup.changed(z5) ? 8388608 : 4194304;
                    }
                }
                i9 = i3 & 256;
                if (i9 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i4 |= composerStartRestartGroup.changed(color) ? 67108864 : 33554432;
                }
                i10 = i3 & 512;
                if (i10 == 0) {
                    if ((i & 805306368) == 0) {
                        i11 = i10;
                        i4 |= composerStartRestartGroup.changed(color2) ? 536870912 : 268435456;
                    }
                    i12 = i3 & 1024;
                    if (i12 == 0) {
                        i14 = i2 | 6;
                        i13 = i12;
                    } else if ((i2 & 6) == 0) {
                        i13 = i12;
                        i14 = i2 | (composerStartRestartGroup.changed(color3) ? 4 : 2);
                    } else {
                        i13 = i12;
                        i14 = i2;
                    }
                    i15 = i3 & 2048;
                    if (i15 == 0) {
                        i14 |= 48;
                        i16 = i15;
                    } else if ((i2 & 48) == 0) {
                        i16 = i15;
                        i14 |= composerStartRestartGroup.changed(textStyle) ? 32 : 16;
                    } else {
                        i16 = i15;
                    }
                    int i20 = i14;
                    i17 = i3 & 4096;
                    if (i17 == 0) {
                        i18 = i20 | 384;
                    } else {
                        int i21 = i20;
                        if ((i2 & 384) == 0) {
                            i21 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
                        }
                        i18 = i21;
                    }
                    if ((i4 & 306783379) == 306783378 || (i18 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier5 = i19 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i5 != 0) {
                            size162 = null;
                        }
                        BentoButtons.Type type4 = i6 == 0 ? BentoButtons.Type.Primary : type2;
                        if (i7 != 0) {
                            z4 = true;
                        }
                        if (i8 != 0) {
                            z5 = false;
                        }
                        Color color7 = i9 == 0 ? null : color;
                        Color color8 = i11 == 0 ? null : color2;
                        Color color9 = i13 == 0 ? null : color3;
                        TextStyle textStyle3 = i16 == 0 ? textStyle : null;
                        boolean z9 = i17 == 0 ? z3 : true;
                        TextStyle textStyle4 = textStyle3;
                        if (ComposerKt.isTraceInProgress()) {
                            modifier3 = modifier5;
                        } else {
                            modifier3 = modifier5;
                            ComposerKt.traceEventStart(2126761076, i4, i18, "com.robinhood.compose.bento.component.BentoButton (BentoButton.kt:147)");
                        }
                        int i22 = i4 >> 3;
                        int i23 = i18;
                        int i24 = (i22 & 896) | (i4 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | (i22 & 7168) | (57344 & i22) | (458752 & i22) | (3670016 & i22) | (29360128 & i22) | (234881024 & i22) | ((i23 << 27) & 1879048192);
                        int i25 = ((i23 >> 3) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | (i4 & 896);
                        Modifier modifier6 = modifier3;
                        Color color10 = color7;
                        BentoButtons.Type type5 = type4;
                        Color color11 = color8;
                        boolean z10 = z4;
                        boolean z11 = z5;
                        BentoButtons.Icon.Size16 size164 = size162;
                        boolean z12 = z9;
                        Color color12 = color9;
                        m20586BentoButtonEikTQX8(onClick, text, modifier6, size164, type5, z10, z11, color10, color11, color12, textStyle4, z12, testTag, composerStartRestartGroup, i24, i25, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        textStyle2 = textStyle4;
                        composer2 = composerStartRestartGroup;
                        color4 = color11;
                        z6 = z12;
                        z7 = z11;
                        color5 = color12;
                        type3 = type5;
                        color6 = color10;
                        modifier4 = modifier6;
                        z8 = z10;
                        size163 = size164;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        type3 = type2;
                        color4 = color2;
                        color5 = color3;
                        modifier4 = modifier2;
                        size163 = size162;
                        z8 = z4;
                        composer2 = composerStartRestartGroup;
                        z7 = z5;
                        color6 = color;
                        textStyle2 = textStyle;
                        z6 = z3;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoButtonKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return BentoButtonKt.BentoButton_IRs1040$lambda$2(onClick, text, testTag, modifier4, size163, type3, z8, z7, color6, color4, color5, textStyle2, z6, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= 805306368;
                i11 = i10;
                i12 = i3 & 1024;
                if (i12 == 0) {
                }
                i15 = i3 & 2048;
                if (i15 == 0) {
                }
                int i202 = i14;
                i17 = i3 & 4096;
                if (i17 == 0) {
                }
                if ((i4 & 306783379) == 306783378) {
                    if (i19 == 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i16 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    TextStyle textStyle42 = textStyle3;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i222 = i4 >> 3;
                    int i232 = i18;
                    int i242 = (i222 & 896) | (i4 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | (i222 & 7168) | (57344 & i222) | (458752 & i222) | (3670016 & i222) | (29360128 & i222) | (234881024 & i222) | ((i232 << 27) & 1879048192);
                    int i252 = ((i232 >> 3) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | (i4 & 896);
                    Modifier modifier62 = modifier3;
                    Color color102 = color7;
                    BentoButtons.Type type52 = type4;
                    Color color112 = color8;
                    boolean z102 = z4;
                    boolean z112 = z5;
                    BentoButtons.Icon.Size16 size1642 = size162;
                    boolean z122 = z9;
                    Color color122 = color9;
                    m20586BentoButtonEikTQX8(onClick, text, modifier62, size1642, type52, z102, z112, color102, color112, color122, textStyle42, z122, testTag, composerStartRestartGroup, i242, i252, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    textStyle2 = textStyle42;
                    composer2 = composerStartRestartGroup;
                    color4 = color112;
                    z6 = z122;
                    z7 = z112;
                    color5 = color122;
                    type3 = type52;
                    color6 = color102;
                    modifier4 = modifier62;
                    z8 = z102;
                    size163 = size1642;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            size162 = size16;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            i8 = i3 & 128;
            if (i8 != 0) {
            }
            i9 = i3 & 256;
            if (i9 != 0) {
            }
            i10 = i3 & 512;
            if (i10 == 0) {
            }
            i11 = i10;
            i12 = i3 & 1024;
            if (i12 == 0) {
            }
            i15 = i3 & 2048;
            if (i15 == 0) {
            }
            int i2022 = i14;
            i17 = i3 & 4096;
            if (i17 == 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        size162 = size16;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        i8 = i3 & 128;
        if (i8 != 0) {
        }
        i9 = i3 & 256;
        if (i9 != 0) {
        }
        i10 = i3 & 512;
        if (i10 == 0) {
        }
        i11 = i10;
        i12 = i3 & 1024;
        if (i12 == 0) {
        }
        i15 = i3 & 2048;
        if (i15 == 0) {
        }
        int i20222 = i14;
        i17 = i3 & 4096;
        if (i17 == 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0107  */
    @Deprecated
    /* renamed from: BentoButton-EikTQX8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20586BentoButtonEikTQX8(final Function0<Unit> onClick, final String text, Modifier modifier, BentoButtons.Icon.Size16 size16, BentoButtons.Type type2, boolean z, boolean z2, Color color, Color color2, Color color3, TextStyle textStyle, boolean z3, String str, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        BentoButtons.Icon.Size16 size162;
        int i6;
        int i7;
        boolean z4;
        int i8;
        int i9;
        Color color4;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        String str2;
        final BentoButtons.Icon.Size16 size163;
        final Color color5;
        final boolean z5;
        final Color color6;
        final BentoButtons.Type type3;
        final Color color7;
        Composer composer2;
        final boolean z6;
        final TextStyle textStyle2;
        final boolean z7;
        final String str3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1185402966);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(text) ? 32 : 16;
        }
        int i20 = i3 & 4;
        if (i20 != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    size162 = size16;
                    i4 |= composerStartRestartGroup.changed(size162) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else if ((i & 24576) == 0) {
                    i4 |= composerStartRestartGroup.changed(type2 == null ? -1 : type2.ordinal()) ? 16384 : 8192;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= 196608;
                    z4 = z;
                } else {
                    z4 = z;
                    if ((i & 196608) == 0) {
                        i4 |= composerStartRestartGroup.changed(z4) ? 131072 : 65536;
                    }
                }
                i8 = i3 & 64;
                if (i8 != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i4 |= composerStartRestartGroup.changed(z2) ? 1048576 : 524288;
                }
                i9 = i3 & 128;
                if (i9 != 0) {
                    i4 |= 12582912;
                    color4 = color;
                } else {
                    color4 = color;
                    if ((i & 12582912) == 0) {
                        i4 |= composerStartRestartGroup.changed(color4) ? 8388608 : 4194304;
                    }
                }
                i10 = i3 & 256;
                if (i10 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i4 |= composerStartRestartGroup.changed(color2) ? 67108864 : 33554432;
                }
                i11 = i3 & 512;
                if (i11 == 0) {
                    if ((i & 805306368) == 0) {
                        i12 = i11;
                        i4 |= composerStartRestartGroup.changed(color3) ? 536870912 : 268435456;
                    }
                    i13 = i3 & 1024;
                    if (i13 == 0) {
                        i15 = i2 | 6;
                        i14 = i13;
                    } else if ((i2 & 6) == 0) {
                        i14 = i13;
                        i15 = i2 | (composerStartRestartGroup.changed(textStyle) ? 4 : 2);
                    } else {
                        i14 = i13;
                        i15 = i2;
                    }
                    i16 = i3 & 2048;
                    if (i16 == 0) {
                        i15 |= 48;
                        i17 = i16;
                    } else if ((i2 & 48) == 0) {
                        i17 = i16;
                        i15 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
                    } else {
                        i17 = i16;
                    }
                    int i21 = i15;
                    i18 = i3 & 4096;
                    if (i18 == 0) {
                        i19 = i21 | 384;
                    } else {
                        int i22 = i21;
                        if ((i2 & 384) == 0) {
                            i22 |= composerStartRestartGroup.changed(str) ? 256 : 128;
                        }
                        i19 = i22;
                    }
                    if ((i4 & 306783379) == 306783378 || (i19 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier3 = i20 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i5 != 0) {
                            size162 = null;
                        }
                        BentoButtons.Type type4 = i6 == 0 ? BentoButtons.Type.Primary : type2;
                        if (i7 != 0) {
                            z4 = true;
                        }
                        boolean z8 = i8 == 0 ? false : z2;
                        if (i9 != 0) {
                            color4 = null;
                        }
                        Color color8 = i10 == 0 ? null : color2;
                        Color color9 = i12 == 0 ? null : color3;
                        TextStyle textStyle3 = i14 == 0 ? null : textStyle;
                        boolean z9 = i17 == 0 ? z3 : true;
                        String str4 = i18 == 0 ? str : null;
                        Modifier modifier4 = modifier3;
                        if (ComposerKt.isTraceInProgress()) {
                            str2 = str4;
                        } else {
                            str2 = str4;
                            ComposerKt.traceEventStart(-1185402966, i4, i19, "com.robinhood.compose.bento.component.BentoButton (BentoButton.kt:187)");
                        }
                        size163 = size162;
                        color5 = color4;
                        int i23 = i4;
                        z5 = z8;
                        color6 = color8;
                        type3 = type4;
                        color7 = color9;
                        boolean z10 = z9;
                        composer2 = composerStartRestartGroup;
                        z6 = z4;
                        textStyle2 = textStyle3;
                        BentoButton(new BentoButtonState(text, size163, type3, z6, z5, color5, color6, color7, textStyle2, (Color) null, z10, 512, (DefaultConstructorMarker) null), onClick, modifier4, str2, composer2, (i23 & 896) | ((i23 << 3) & 112) | ((i19 << 3) & 7168), 0);
                        modifier2 = modifier4;
                        String str5 = str2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z7 = z10;
                        str3 = str5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        type3 = type2;
                        z5 = z2;
                        color6 = color2;
                        color7 = color3;
                        z7 = z3;
                        str3 = str;
                        composer2 = composerStartRestartGroup;
                        size163 = size162;
                        z6 = z4;
                        color5 = color4;
                        textStyle2 = textStyle;
                    }
                    final Modifier modifier5 = modifier2;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoButtonKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return BentoButtonKt.BentoButton_EikTQX8$lambda$3(onClick, text, modifier5, size163, type3, z6, z5, color5, color6, color7, textStyle2, z7, str3, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= 805306368;
                i12 = i11;
                i13 = i3 & 1024;
                if (i13 == 0) {
                }
                i16 = i3 & 2048;
                if (i16 == 0) {
                }
                int i212 = i15;
                i18 = i3 & 4096;
                if (i18 == 0) {
                }
                if ((i4 & 306783379) == 306783378) {
                    if (i20 == 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    if (i14 == 0) {
                    }
                    if (i17 == 0) {
                    }
                    if (i18 == 0) {
                    }
                    Modifier modifier42 = modifier3;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    size163 = size162;
                    color5 = color4;
                    int i232 = i4;
                    z5 = z8;
                    color6 = color8;
                    type3 = type4;
                    color7 = color9;
                    boolean z102 = z9;
                    composer2 = composerStartRestartGroup;
                    z6 = z4;
                    textStyle2 = textStyle3;
                    BentoButton(new BentoButtonState(text, size163, type3, z6, z5, color5, color6, color7, textStyle2, (Color) null, z102, 512, (DefaultConstructorMarker) null), onClick, modifier42, str2, composer2, (i232 & 896) | ((i232 << 3) & 112) | ((i19 << 3) & 7168), 0);
                    modifier2 = modifier42;
                    String str52 = str2;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z7 = z102;
                    str3 = str52;
                }
                final Modifier modifier52 = modifier2;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            size162 = size16;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            i7 = i3 & 32;
            if (i7 != 0) {
            }
            i8 = i3 & 64;
            if (i8 != 0) {
            }
            i9 = i3 & 128;
            if (i9 != 0) {
            }
            i10 = i3 & 256;
            if (i10 != 0) {
            }
            i11 = i3 & 512;
            if (i11 == 0) {
            }
            i12 = i11;
            i13 = i3 & 1024;
            if (i13 == 0) {
            }
            i16 = i3 & 2048;
            if (i16 == 0) {
            }
            int i2122 = i15;
            i18 = i3 & 4096;
            if (i18 == 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            final Modifier modifier522 = modifier2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        size162 = size16;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        i7 = i3 & 32;
        if (i7 != 0) {
        }
        i8 = i3 & 64;
        if (i8 != 0) {
        }
        i9 = i3 & 128;
        if (i9 != 0) {
        }
        i10 = i3 & 256;
        if (i10 != 0) {
        }
        i11 = i3 & 512;
        if (i11 == 0) {
        }
        i12 = i11;
        i13 = i3 & 1024;
        if (i13 == 0) {
        }
        i16 = i3 & 2048;
        if (i16 == 0) {
        }
        int i21222 = i15;
        i18 = i3 & 4096;
        if (i18 == 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        final Modifier modifier5222 = modifier2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010a  */
    /* renamed from: BentoButton-2nCz7is, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20584BentoButton2nCz7is(final Function0<Unit> onClick, final String testTag, Modifier modifier, BentoButtons.Type type2, boolean z, boolean z2, Color color, Color color2, boolean z3, final Function4<? super Row5, ? super ButtonStyle.Style, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        int i7;
        int i8;
        int i9;
        int i10;
        final Color color3;
        final boolean z6;
        final boolean z7;
        final Color color4;
        final BentoButtons.Type type3;
        final boolean z8;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(testTag, "testTag");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1778498023);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(testTag) ? 32 : 16;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(type2 == null ? -1 : type2.ordinal()) ? 2048 : 1024;
            }
            i5 = i2 & 16;
            if (i5 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    z4 = z;
                    i3 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    i3 |= 196608;
                } else {
                    if ((196608 & i) == 0) {
                        z5 = z2;
                        i3 |= composerStartRestartGroup.changed(z5) ? 131072 : 65536;
                    }
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changed(color) ? 1048576 : 524288;
                    }
                    i8 = i2 & 128;
                    if (i8 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changed(color2) ? 8388608 : 4194304;
                    }
                    i9 = i2 & 256;
                    if (i9 != 0) {
                        if ((i & 100663296) == 0) {
                            i10 = i9;
                            i3 |= composerStartRestartGroup.changed(z3) ? 67108864 : 33554432;
                        }
                        if ((i2 & 512) != 0) {
                            i3 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(content) ? 536870912 : 268435456;
                        }
                        if ((306783379 & i3) != 306783378 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier4 = i11 == 0 ? Modifier.INSTANCE : modifier2;
                            BentoButtons.Type type4 = i4 == 0 ? BentoButtons.Type.Primary : type2;
                            if (i5 != 0) {
                                z4 = true;
                            }
                            boolean z9 = i6 == 0 ? false : z5;
                            Color color5 = i7 == 0 ? null : color;
                            Color color6 = i8 == 0 ? null : color2;
                            boolean z10 = i10 == 0 ? z3 : true;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1778498023, i3, -1, "com.robinhood.compose.bento.component.BentoButton (BentoButton.kt:220)");
                            }
                            int i12 = i3 >> 3;
                            int i13 = (i3 & 1879048192) | (i3 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (3670016 & i12) | (i12 & 29360128) | ((i3 << 21) & 234881024);
                            Color color7 = color5;
                            boolean z11 = z10;
                            boolean z12 = z4;
                            BentoButtons.Type type5 = type4;
                            m20585BentoButton6BkTXZw(onClick, modifier4, type5, z12, z9, color7, color6, z11, testTag, content, composerStartRestartGroup, i13, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            color3 = color6;
                            z6 = z11;
                            z7 = z9;
                            color4 = color7;
                            type3 = type5;
                            z8 = z12;
                            modifier3 = modifier4;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            color4 = color;
                            color3 = color2;
                            z6 = z3;
                            modifier3 = modifier2;
                            z8 = z4;
                            z7 = z5;
                            type3 = type2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoButtonKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return BentoButtonKt.BentoButton_2nCz7is$lambda$4(onClick, testTag, modifier3, type3, z8, z7, color4, color3, z6, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 100663296;
                    i10 = i9;
                    if ((i2 & 512) != 0) {
                    }
                    if ((306783379 & i3) != 306783378) {
                        if (i11 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i122 = i3 >> 3;
                        int i132 = (i3 & 1879048192) | (i3 & 14) | (i122 & 112) | (i122 & 896) | (i122 & 7168) | (57344 & i122) | (458752 & i122) | (3670016 & i122) | (i122 & 29360128) | ((i3 << 21) & 234881024);
                        Color color72 = color5;
                        boolean z112 = z10;
                        boolean z122 = z4;
                        BentoButtons.Type type52 = type4;
                        m20585BentoButton6BkTXZw(onClick, modifier4, type52, z122, z9, color72, color6, z112, testTag, content, composerStartRestartGroup, i132, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        color3 = color6;
                        z6 = z112;
                        z7 = z9;
                        color4 = color72;
                        type3 = type52;
                        z8 = z122;
                        modifier3 = modifier4;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z5 = z2;
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                i8 = i2 & 128;
                if (i8 == 0) {
                }
                i9 = i2 & 256;
                if (i9 != 0) {
                }
                i10 = i9;
                if ((i2 & 512) != 0) {
                }
                if ((306783379 & i3) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z4 = z;
            i6 = i2 & 32;
            if (i6 != 0) {
            }
            z5 = z2;
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            i8 = i2 & 128;
            if (i8 == 0) {
            }
            i9 = i2 & 256;
            if (i9 != 0) {
            }
            i10 = i9;
            if ((i2 & 512) != 0) {
            }
            if ((306783379 & i3) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        z4 = z;
        i6 = i2 & 32;
        if (i6 != 0) {
        }
        z5 = z2;
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        i8 = i2 & 128;
        if (i8 == 0) {
        }
        i9 = i2 & 256;
        if (i9 != 0) {
        }
        i10 = i9;
        if ((i2 & 512) != 0) {
        }
        if ((306783379 & i3) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010a  */
    @Deprecated
    /* renamed from: BentoButton-6BkTXZw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20585BentoButton6BkTXZw(final Function0<Unit> onClick, Modifier modifier, BentoButtons.Type type2, boolean z, boolean z2, Color color, Color color2, boolean z3, String str, final Function4<? super Row5, ? super ButtonStyle.Style, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Color color3;
        boolean z6;
        int i12;
        ButtonStyle.Style primary;
        Object objRememberedValue;
        Composer.Companion companion;
        ToggleableInteractionSource toggleableInteractionSource;
        boolean z7;
        Object objRememberedValue2;
        Color value;
        final Color color4;
        final boolean z8;
        final String str2;
        final boolean z9;
        final Color color5;
        final boolean z10;
        final Modifier modifier3;
        final BentoButtons.Type type3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i13;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1597963075);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i14 = i2 & 2;
        if (i14 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(type2 == null ? -1 : type2.ordinal()) ? 256 : 128;
            }
            i5 = i2 & 8;
            if (i5 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z4 = z;
                    i3 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        z5 = z2;
                        i3 |= composerStartRestartGroup.changed(z5) ? 16384 : 8192;
                    }
                    i7 = i2 & 32;
                    if (i7 == 0) {
                        i3 |= 196608;
                    } else if ((i & 196608) == 0) {
                        i3 |= composerStartRestartGroup.changed(color) ? 131072 : 65536;
                    }
                    i8 = i2 & 64;
                    if (i8 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changed(color2) ? 1048576 : 524288;
                    }
                    i9 = i2 & 128;
                    if (i9 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changed(z3) ? 8388608 : 4194304;
                    }
                    i10 = i2 & 256;
                    if (i10 == 0) {
                        i3 |= 100663296;
                    } else {
                        if ((i & 100663296) == 0) {
                            i11 = i10;
                            i3 |= composerStartRestartGroup.changed(str) ? 67108864 : 33554432;
                        }
                        if ((i2 & 512) == 0) {
                            i13 = (805306368 & i) == 0 ? composerStartRestartGroup.changedInstance(content) ? 536870912 : 268435456 : 805306368;
                            if ((306783379 & i3) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                                if (i14 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                BentoButtons.Type type4 = i4 == 0 ? BentoButtons.Type.Primary : type2;
                                boolean z11 = i5 == 0 ? true : z4;
                                if (i6 != 0) {
                                    z5 = false;
                                }
                                Color color6 = i7 == 0 ? null : color;
                                color3 = i8 == 0 ? null : color2;
                                z6 = i9 == 0 ? true : z3;
                                String str3 = i11 == 0 ? null : str;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1597963075, i3, -1, "com.robinhood.compose.bento.component.BentoButton (BentoButton.kt:254)");
                                }
                                i12 = WhenMappings.$EnumSwitchMapping$0[type4.ordinal()];
                                if (i12 != 1) {
                                    composerStartRestartGroup.startReplaceGroup(-1955752022);
                                    primary = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getButton(composerStartRestartGroup, 0).getPrimary();
                                    composerStartRestartGroup.endReplaceGroup();
                                } else if (i12 == 2) {
                                    composerStartRestartGroup.startReplaceGroup(-1955749652);
                                    primary = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getButton(composerStartRestartGroup, 0).getSecondary();
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceGroup(-1955747958);
                                    primary = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getButton(composerStartRestartGroup, 0).getPrimary();
                                    composerStartRestartGroup.endReplaceGroup();
                                }
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                companion = Composer.INSTANCE;
                                if (objRememberedValue == companion.getEmpty()) {
                                    objRememberedValue = new ToggleableInteractionSource(z5, z6);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                toggleableInteractionSource = (ToggleableInteractionSource) objRememberedValue;
                                composerStartRestartGroup.endReplaceGroup();
                                Boolean boolValueOf = Boolean.valueOf(z5);
                                ButtonStyle.Style style = primary;
                                Boolean boolValueOf2 = Boolean.valueOf(z6);
                                int i15 = i3;
                                composerStartRestartGroup.startReplaceGroup(-1746271574);
                                Modifier modifier4 = modifier2;
                                z7 = ((i15 & 29360128) != 8388608) | ((i15 & 57344) != 16384);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (!z7 || objRememberedValue2 == companion.getEmpty()) {
                                    objRememberedValue2 = new BentoButtonKt$BentoButton$7$1(toggleableInteractionSource, z6, z5, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(boolValueOf, boolValueOf2, (Function2) objRememberedValue2, composerStartRestartGroup, ((i15 >> 12) & 14) | ((i15 >> 18) & 112));
                                composerStartRestartGroup.startReplaceGroup(-1955735535);
                                if (color3 != null) {
                                    ButtonStyle.StateColor borderColor = style.getColors().getBorderColor();
                                    SnapshotState4<Color> snapshotState4 = borderColor == null ? null : borderColor.get(z11, composerStartRestartGroup, ((i15 >> 9) & 14) | (ButtonStyle.StateColor.$stable << 3));
                                    value = snapshotState4 != null ? snapshotState4.getValue() : null;
                                } else {
                                    value = color3;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                boolean z12 = z5;
                                boolean z13 = z6;
                                String str4 = str3;
                                CompositionLocal3.CompositionLocalProvider(InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize().provides(C2002Dp.m7993boximpl(C2002Dp.INSTANCE.m8004getUnspecifiedD9Ej5fM())), ComposableLambda3.rememberComposableLambda(711684099, true, new C324448(modifier4, style, str4, value == null ? Color.m6701boximpl(Color.m6705copywmQWz5c$default(value.getValue(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null)) : null, color6, z12, onClick, z11, toggleableInteractionSource, content), composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                color4 = color6;
                                z8 = z12;
                                str2 = str4;
                                z9 = z11;
                                color5 = color3;
                                z10 = z13;
                                modifier3 = modifier4;
                                type3 = type4;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                type3 = type2;
                                color4 = color;
                                color5 = color2;
                                z10 = z3;
                                modifier3 = modifier2;
                                z9 = z4;
                                z8 = z5;
                                str2 = str;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoButtonKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return BentoButtonKt.BentoButton_6BkTXZw$lambda$7(onClick, modifier3, type3, z9, z8, color4, color5, z10, str2, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= i13;
                        if ((306783379 & i3) == 306783378) {
                            if (i14 != 0) {
                            }
                            if (i4 == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i11 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            i12 = WhenMappings.$EnumSwitchMapping$0[type4.ordinal()];
                            if (i12 != 1) {
                            }
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                            }
                            toggleableInteractionSource = (ToggleableInteractionSource) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            Boolean boolValueOf3 = Boolean.valueOf(z5);
                            ButtonStyle.Style style2 = primary;
                            Boolean boolValueOf22 = Boolean.valueOf(z6);
                            int i152 = i3;
                            composerStartRestartGroup.startReplaceGroup(-1746271574);
                            Modifier modifier42 = modifier2;
                            z7 = ((i152 & 29360128) != 8388608) | ((i152 & 57344) != 16384);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!z7) {
                                objRememberedValue2 = new BentoButtonKt$BentoButton$7$1(toggleableInteractionSource, z6, z5, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(boolValueOf3, boolValueOf22, (Function2) objRememberedValue2, composerStartRestartGroup, ((i152 >> 12) & 14) | ((i152 >> 18) & 112));
                                composerStartRestartGroup.startReplaceGroup(-1955735535);
                                if (color3 != null) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                boolean z122 = z5;
                                boolean z132 = z6;
                                String str42 = str3;
                                CompositionLocal3.CompositionLocalProvider(InteractiveComponentSizeKt.getLocalMinimumInteractiveComponentSize().provides(C2002Dp.m7993boximpl(C2002Dp.INSTANCE.m8004getUnspecifiedD9Ej5fM())), ComposableLambda3.rememberComposableLambda(711684099, true, new C324448(modifier42, style2, str42, value == null ? Color.m6701boximpl(Color.m6705copywmQWz5c$default(value.getValue(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null)) : null, color6, z122, onClick, z11, toggleableInteractionSource, content), composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                color4 = color6;
                                z8 = z122;
                                str2 = str42;
                                z9 = z11;
                                color5 = color3;
                                z10 = z132;
                                modifier3 = modifier42;
                                type3 = type4;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i11 = i10;
                    if ((i2 & 512) == 0) {
                    }
                    i3 |= i13;
                    if ((306783379 & i3) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                z5 = z2;
                i7 = i2 & 32;
                if (i7 == 0) {
                }
                i8 = i2 & 64;
                if (i8 == 0) {
                }
                i9 = i2 & 128;
                if (i9 == 0) {
                }
                i10 = i2 & 256;
                if (i10 == 0) {
                }
                i11 = i10;
                if ((i2 & 512) == 0) {
                }
                i3 |= i13;
                if ((306783379 & i3) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z4 = z;
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            z5 = z2;
            i7 = i2 & 32;
            if (i7 == 0) {
            }
            i8 = i2 & 64;
            if (i8 == 0) {
            }
            i9 = i2 & 128;
            if (i9 == 0) {
            }
            i10 = i2 & 256;
            if (i10 == 0) {
            }
            i11 = i10;
            if ((i2 & 512) == 0) {
            }
            i3 |= i13;
            if ((306783379 & i3) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        z4 = z;
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        z5 = z2;
        i7 = i2 & 32;
        if (i7 == 0) {
        }
        i8 = i2 & 64;
        if (i8 == 0) {
        }
        i9 = i2 & 128;
        if (i9 == 0) {
        }
        i10 = i2 & 256;
        if (i10 == 0) {
        }
        i11 = i10;
        if ((i2 & 512) == 0) {
        }
        i3 |= i13;
        if ((306783379 & i3) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: BentoButton.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.compose.bento.component.BentoButtonKt$BentoButton$8 */
    /* loaded from: classes15.dex */
    static final class C324448 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Color $backgroundColorOverride;
        final /* synthetic */ Function4<Row5, ButtonStyle.Style, Composer, Integer, Unit> $content;
        final /* synthetic */ Color $currentBorderColor;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ ToggleableInteractionSource $interactionSource;
        final /* synthetic */ boolean $loading;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ String $nullableTestTag;
        final /* synthetic */ Function0<Unit> $onClick;
        final /* synthetic */ ButtonStyle.Style $style;

        /* JADX WARN: Multi-variable type inference failed */
        C324448(Modifier modifier, ButtonStyle.Style style, String str, Color color, Color color2, boolean z, Function0<Unit> function0, boolean z2, ToggleableInteractionSource toggleableInteractionSource, Function4<? super Row5, ? super ButtonStyle.Style, ? super Composer, ? super Integer, Unit> function4) {
            this.$modifier = modifier;
            this.$style = style;
            this.$nullableTestTag = str;
            this.$currentBorderColor = color;
            this.$backgroundColorOverride = color2;
            this.$loading = z;
            this.$onClick = function0;
            this.$enabled = z2;
            this.$interactionSource = toggleableInteractionSource;
            this.$content = function4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            Modifier modifierTestTag;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(711684099, i, -1, "com.robinhood.compose.bento.component.BentoButton.<anonymous> (BentoButton.kt:273)");
            }
            Modifier modifierWithBentoPillPlaceholder$default = LocalShowPlaceholder.withBentoPillPlaceholder$default(SizeKt.m5155defaultMinSizeVpY3zN4$default(this.$modifier, 0.0f, this.$style.m21717getMinHeightD9Ej5fM(), 1, null), false, 1, null);
            String str = this.$nullableTestTag;
            Modifier modifier = (str == null || (modifierTestTag = TestTag3.testTag(modifierWithBentoPillPlaceholder$default, str)) == null) ? modifierWithBentoPillPlaceholder$default : modifierTestTag;
            BentoButtonDefaults bentoButtonDefaults = BentoButtonDefaults.INSTANCE;
            RoundedCornerShape shape$lib_compose_bento_externalRelease = bentoButtonDefaults.getShape$lib_compose_bento_externalRelease();
            Color color = this.$currentBorderColor;
            BorderStroke borderStrokeM4886BorderStrokecXLIe8U = color != null ? BorderStroke2.m4886BorderStrokecXLIe8U(bentoButtonDefaults.m20580getOutlinedBorderSizeD9Ej5fM$lib_compose_bento_externalRelease(), color.getValue()) : null;
            ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
            Color color2 = this.$backgroundColorOverride;
            ButtonColors buttonColorsM5719buttonColorsro_MJ88 = buttonDefaults.m5719buttonColorsro_MJ88(color2 != null ? color2.getValue() : this.$style.getColors().getBackgroundColor().m21713getEnabledColor0d7_KjU(), this.$style.getColors().getForegroundColor().m21713getEnabledColor0d7_KjU(), this.$style.getColors().getBackgroundColor().m21712getDisabledColor0d7_KjU(), this.$style.getColors().getForegroundColor().m21712getDisabledColor0d7_KjU(), composer, ButtonDefaults.$stable << 12, 0);
            PaddingValues contentPadding = this.$style.getContentPadding();
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$loading) | composer.changed(this.$onClick);
            final boolean z = this.$loading;
            final Function0<Unit> function0 = this.$onClick;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.compose.bento.component.BentoButtonKt$BentoButton$8$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BentoButtonKt.C324448.invoke$lambda$3$lambda$2(z, function0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function02 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            boolean z2 = this.$enabled;
            ToggleableInteractionSource toggleableInteractionSource = this.$interactionSource;
            final Function4<Row5, ButtonStyle.Style, Composer, Integer, Unit> function4 = this.$content;
            final ButtonStyle.Style style = this.$style;
            ButtonKt.Button(function02, modifier, z2, shape$lib_compose_bento_externalRelease, buttonColorsM5719buttonColorsro_MJ88, null, borderStrokeM4886BorderStrokecXLIe8U, contentPadding, toggleableInteractionSource, ComposableLambda3.rememberComposableLambda(800312307, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoButtonKt.BentoButton.8.4
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer2, Integer num) {
                    invoke(row5, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Row5 Button, Composer composer2, int i2) {
                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                    if ((i2 & 6) == 0) {
                        i2 |= composer2.changed(Button) ? 4 : 2;
                    }
                    if ((i2 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(800312307, i2, -1, "com.robinhood.compose.bento.component.BentoButton.<anonymous>.<anonymous> (BentoButton.kt:300)");
                    }
                    function4.invoke(Button, style, composer2, Integer.valueOf((i2 & 14) | (ButtonStyle.Style.$stable << 3)));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 906169344, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(boolean z, Function0 function0) {
            if (!z) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3 A[PHI: r14
      0x00a3: PHI (r14v9 int) = (r14v0 int), (r14v5 int), (r14v6 int) binds: [B:56:0x00a1, B:66:0x00b9, B:65:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoGoldButton(final Function0<Unit> onClick, final String text, final String testTag, Modifier modifier, BentoButtons.Icon.Size16 size16, BentoButtons.Type type2, boolean z, boolean z2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        BentoButtons.Icon.Size16 size162;
        int i5;
        int i6;
        boolean z3;
        int i7;
        boolean z4;
        final boolean z5;
        Composer composer2;
        final BentoButtons.Icon.Size16 size163;
        final boolean z6;
        final BentoButtons.Type type3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(testTag, "testTag");
        Composer composerStartRestartGroup = composer.startRestartGroup(1037443565);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(text) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(testTag) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    size162 = size16;
                    i3 |= composerStartRestartGroup.changed(size162) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                int i9 = 196608;
                if (i5 != 0) {
                    i3 |= i9;
                } else if ((196608 & i) == 0) {
                    i9 = composerStartRestartGroup.changed(type2 == null ? -1 : type2.ordinal()) ? 131072 : 65536;
                    i3 |= i9;
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                    if ((1572864 & i) == 0) {
                        z3 = z;
                        i3 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
                    }
                    i7 = i2 & 128;
                    if (i7 == 0) {
                        i3 |= 12582912;
                        z4 = z2;
                    } else {
                        z4 = z2;
                        if ((i & 12582912) == 0) {
                            i3 |= composerStartRestartGroup.changed(z4) ? 8388608 : 4194304;
                        }
                    }
                    if ((i3 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            size162 = null;
                        }
                        BentoButtons.Type type4 = i5 == 0 ? BentoButtons.Type.Primary : type2;
                        if (i6 != 0) {
                            z3 = true;
                        }
                        boolean z7 = i7 == 0 ? false : z4;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1037443565, i3, -1, "com.robinhood.compose.bento.component.BentoGoldButton (BentoButton.kt:318)");
                        }
                        int i10 = i3 >> 3;
                        int i11 = (i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (i10 & 3670016) | ((i3 << 15) & 29360128);
                        Modifier modifier4 = modifier2;
                        BentoButtons.Icon.Size16 size164 = size162;
                        boolean z8 = z3;
                        BentoGoldButton(onClick, text, modifier4, size164, type4, z8, z7, testTag, composerStartRestartGroup, i11, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z5 = z8;
                        composer2 = composerStartRestartGroup;
                        size163 = size164;
                        z6 = z7;
                        type3 = type4;
                        modifier3 = modifier4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        type3 = type2;
                        modifier3 = modifier2;
                        composer2 = composerStartRestartGroup;
                        size163 = size162;
                        z6 = z4;
                        z5 = z3;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoButtonKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return BentoButtonKt.BentoGoldButton$lambda$8(onClick, text, testTag, modifier3, size163, type3, z5, z6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 1572864;
                z3 = z;
                i7 = i2 & 128;
                if (i7 == 0) {
                }
                if ((i3 & 4793491) == 4793490) {
                    if (i8 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i102 = i3 >> 3;
                    int i112 = (i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | (i102 & 896) | (i102 & 7168) | (57344 & i102) | (458752 & i102) | (i102 & 3670016) | ((i3 << 15) & 29360128);
                    Modifier modifier42 = modifier2;
                    BentoButtons.Icon.Size16 size1642 = size162;
                    boolean z82 = z3;
                    BentoGoldButton(onClick, text, modifier42, size1642, type4, z82, z7, testTag, composerStartRestartGroup, i112, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z5 = z82;
                    composer2 = composerStartRestartGroup;
                    size163 = size1642;
                    z6 = z7;
                    type3 = type4;
                    modifier3 = modifier42;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            size162 = size16;
            i5 = i2 & 32;
            int i92 = 196608;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            z3 = z;
            i7 = i2 & 128;
            if (i7 == 0) {
            }
            if ((i3 & 4793491) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        size162 = size16;
        i5 = i2 & 32;
        int i922 = 196608;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        z3 = z;
        i7 = i2 & 128;
        if (i7 == 0) {
        }
        if ((i3 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011b  */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoGoldButton(final Function0<Unit> onClick, final String text, Modifier modifier, BentoButtons.Icon.Size16 size16, BentoButtons.Type type2, boolean z, boolean z2, String str, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        BentoButtons.Icon.Size16 size162;
        int i5;
        int i6;
        boolean z3;
        int i7;
        int i8;
        final String str2;
        Composer composer2;
        final BentoButtons.Type type3;
        final Modifier modifier3;
        final boolean z4;
        final boolean z5;
        final BentoButtons.Icon.Size16 size163;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1047342959);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(text) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    size162 = size16;
                    i3 |= composerStartRestartGroup.changed(size162) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changed(type2 == null ? -1 : type2.ordinal()) ? 16384 : 8192;
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                    if ((196608 & i) == 0) {
                        z3 = z;
                        i3 |= composerStartRestartGroup.changed(z3) ? 131072 : 65536;
                    }
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changed(z2) ? 1048576 : 524288;
                    }
                    i8 = i2 & 128;
                    if (i8 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changed(str) ? 8388608 : 4194304;
                    }
                    if ((i3 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i4 != 0) {
                            size162 = null;
                        }
                        final BentoButtons.Type type4 = i5 == 0 ? BentoButtons.Type.Primary : type2;
                        if (i6 != 0) {
                            z3 = true;
                        }
                        final boolean z6 = i7 == 0 ? false : z2;
                        str2 = i8 == 0 ? null : str;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1047342959, i3, -1, "com.robinhood.compose.bento.component.BentoGoldButton (BentoButton.kt:347)");
                        }
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        long jM21245getDaySolLight0d7_KjU = !bentoTheme.getColors(composerStartRestartGroup, 6).getIsDay() ? BentoColor.INSTANCE.m21245getDaySolLight0d7_KjU() : BentoColor.INSTANCE.m21319getNightJet0d7_KjU();
                        long jM21220getDayJet0d7_KjU = !bentoTheme.getColors(composerStartRestartGroup, 6).getIsDay() ? BentoColor.INSTANCE.m21220getDayJet0d7_KjU() : BentoColor.INSTANCE.m21344getNightSolLight0d7_KjU();
                        final BentoButtons.Icon.Size16 size164 = size162;
                        final Modifier modifier5 = modifier4;
                        final boolean z7 = z3;
                        composer2 = composerStartRestartGroup;
                        BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(jM21220getDayJet0d7_KjU, 0L, 0L, 0L, jM21245getDaySolLight0d7_KjU, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-504738945, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoButtonKt.BentoGoldButton.2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i10) {
                                if ((i10 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-504738945, i10, -1, "com.robinhood.compose.bento.component.BentoGoldButton.<anonymous> (BentoButton.kt:352)");
                                }
                                BentoButtonKt.BentoButton(new BentoButtonState(text, size164, type4, z7, z6, (Color) null, (Color) null, (Color) null, (TextStyle) null, (Color) null, false, 2016, (DefaultConstructorMarker) null), onClick, modifier5, str2, composer3, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composer2, 805306368, 494);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        boolean z8 = z6;
                        type3 = type4;
                        modifier3 = modifier5;
                        z4 = z8;
                        z5 = z7;
                        size163 = size164;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        type3 = type2;
                        str2 = str;
                        modifier3 = modifier2;
                        size163 = size162;
                        composer2 = composerStartRestartGroup;
                        z5 = z3;
                        z4 = z2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoButtonKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return BentoButtonKt.BentoGoldButton$lambda$9(onClick, text, modifier3, size163, type3, z5, z4, str2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                z3 = z;
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                i8 = i2 & 128;
                if (i8 == 0) {
                }
                if ((i3 & 4793491) == 4793490) {
                    if (i9 == 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    long jM21245getDaySolLight0d7_KjU2 = !bentoTheme2.getColors(composerStartRestartGroup, 6).getIsDay() ? BentoColor.INSTANCE.m21245getDaySolLight0d7_KjU() : BentoColor.INSTANCE.m21319getNightJet0d7_KjU();
                    long jM21220getDayJet0d7_KjU2 = !bentoTheme2.getColors(composerStartRestartGroup, 6).getIsDay() ? BentoColor.INSTANCE.m21220getDayJet0d7_KjU() : BentoColor.INSTANCE.m21344getNightSolLight0d7_KjU();
                    final BentoButtons.Icon.Size16 size1642 = size162;
                    final Modifier modifier52 = modifier4;
                    final boolean z72 = z3;
                    composer2 = composerStartRestartGroup;
                    BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(jM21220getDayJet0d7_KjU2, 0L, 0L, 0L, jM21245getDaySolLight0d7_KjU2, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-504738945, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoButtonKt.BentoGoldButton.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i10) {
                            if ((i10 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-504738945, i10, -1, "com.robinhood.compose.bento.component.BentoGoldButton.<anonymous> (BentoButton.kt:352)");
                            }
                            BentoButtonKt.BentoButton(new BentoButtonState(text, size1642, type4, z72, z6, (Color) null, (Color) null, (Color) null, (TextStyle) null, (Color) null, false, 2016, (DefaultConstructorMarker) null), onClick, modifier52, str2, composer3, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composer2, 805306368, 494);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    boolean z82 = z6;
                    type3 = type4;
                    modifier3 = modifier52;
                    z4 = z82;
                    z5 = z72;
                    size163 = size1642;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            size162 = size16;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            z3 = z;
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            i8 = i2 & 128;
            if (i8 == 0) {
            }
            if ((i3 & 4793491) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        size162 = size16;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        z3 = z;
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        i8 = i2 & 128;
        if (i8 == 0) {
        }
        if ((i3 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Primary(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1850693646);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1850693646, i, -1, "com.robinhood.compose.bento.component.Primary (BentoButton.kt:537)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$BentoButtonKt.INSTANCE.getLambda$1895745990$lib_compose_bento_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoButtonKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoButtonKt.Primary$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Secondary(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1270004224);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1270004224, i, -1, "com.robinhood.compose.bento.component.Secondary (BentoButton.kt:630)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$BentoButtonKt.INSTANCE.m20772getLambda$924374600$lib_compose_bento_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoButtonKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoButtonKt.Secondary$lambda$11(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PrimaryWithPlaceholders(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-998582668);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-998582668, i, -1, "com.robinhood.compose.bento.component.PrimaryWithPlaceholders (BentoButton.kt:729)");
            }
            LocalShowPlaceholder.Loadable(true, null, null, ComposableSingletons$BentoButtonKt.INSTANCE.getLambda$475514884$lib_compose_bento_externalRelease(), composerStartRestartGroup, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoButtonKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoButtonKt.PrimaryWithPlaceholders$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void SecondaryWithPlaceholders(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-208494490);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-208494490, i, -1, "com.robinhood.compose.bento.component.SecondaryWithPlaceholders (BentoButton.kt:736)");
            }
            LocalShowPlaceholder.Loadable(true, null, null, ComposableSingletons$BentoButtonKt.INSTANCE.m20773getLambda$939954698$lib_compose_bento_externalRelease(), composerStartRestartGroup, 3078, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoButtonKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoButtonKt.SecondaryWithPlaceholders$lambda$13(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
