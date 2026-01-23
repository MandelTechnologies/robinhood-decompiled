package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.os.Parcelable;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoPogKt;
import com.robinhood.compose.bento.component.BentoPogSize;
import com.robinhood.models.serverdriven.experimental.api.NumberPog;
import com.robinhood.models.serverdriven.experimental.api.PictogramSize;
import com.robinhood.models.serverdriven.experimental.api.PogWithPictogram;
import com.robinhood.models.serverdriven.experimental.api.TextPog;
import com.robinhood.models.serverdriven.experimental.api.TextPogSize;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rh_server_driven_ui.p531v1.NumberPogDto;
import rh_server_driven_ui.p531v1.PictogramSizeDto;
import rh_server_driven_ui.p531v1.PogWithPictogramDto;
import rh_server_driven_ui.p531v1.TextPogDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: SduiPog.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\t2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\n\u001a\f\u0010\u000b\u001a\u00020\f*\u00020\rH\u0000\u001a/\u0010\u000e\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000f2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u0010\u001a\u001f\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00112\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u0012\u001a\f\u0010\u000b\u001a\u00020\f*\u00020\u0013H\u0000\u001a/\u0010\u0014\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00152\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\u0016\u001a\u001f\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00172\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"SduiPictogramPog", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/PogWithPictogram;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/serverdriven/experimental/api/PogWithPictogram;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lrh_server_driven_ui/v1/PogWithPictogramDto;", "(Lrh_server_driven_ui/v1/PogWithPictogramDto;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "toBentoPogSize", "Lcom/robinhood/compose/bento/component/BentoPogSize;", "Lrh_server_driven_ui/v1/PictogramSizeDto;", "SduiTextPog", "Lcom/robinhood/models/serverdriven/experimental/api/TextPog;", "(Lcom/robinhood/models/serverdriven/experimental/api/TextPog;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lrh_server_driven_ui/v1/TextPogDto;", "(Lrh_server_driven_ui/v1/TextPogDto;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lrh_server_driven_ui/v1/TextPogDto$SizeDto;", "SduiNumberPog", "Lcom/robinhood/models/serverdriven/experimental/api/NumberPog;", "(Lcom/robinhood/models/serverdriven/experimental/api/NumberPog;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lrh_server_driven_ui/v1/NumberPogDto;", "(Lrh_server_driven_ui/v1/NumberPogDto;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiPogKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiPog {

    /* compiled from: SduiPog.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiPogKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[PictogramSize.values().length];
            try {
                iArr[PictogramSize.SMALL_48.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PictogramSize.LARGE_80.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PictogramSizeDto.values().length];
            try {
                iArr2[PictogramSizeDto.PICTOGRAM_SIZE_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PictogramSizeDto.PICTOGRAM_SIZE_SMALL_48.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PictogramSizeDto.PICTOGRAM_SIZE_LARGE_80.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[TextPogSize.values().length];
            try {
                iArr3[TextPogSize.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[TextPogSize.LARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[TextPogSize.EXTRA_LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[TextPogSize.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[TextPogDto.SizeDto.values().length];
            try {
                iArr4[TextPogDto.SizeDto.SIZE_EXTRA_SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[TextPogDto.SizeDto.SIZE_UNSPECIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[TextPogDto.SizeDto.SIZE_SMALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[TextPogDto.SizeDto.SIZE_LARGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[TextPogDto.SizeDto.SIZE_EXTRA_LARGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiNumberPog$lambda$4(NumberPog numberPog, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiNumberPog(numberPog, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiNumberPog$lambda$5(NumberPogDto numberPogDto, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiNumberPog(numberPogDto, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiPictogramPog$lambda$0(PogWithPictogram pogWithPictogram, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiPictogramPog(pogWithPictogram, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiPictogramPog$lambda$1(PogWithPictogramDto pogWithPictogramDto, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiPictogramPog(pogWithPictogramDto, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiTextPog$lambda$2(TextPog textPog, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiTextPog(textPog, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiTextPog$lambda$3(TextPogDto textPogDto, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiTextPog(textPogDto, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final <ActionT extends Parcelable> void SduiPictogramPog(final PogWithPictogram<? extends ActionT> component, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        BentoPogSize bentoPogSize;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(1969921146);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1969921146, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiPictogramPog (SduiPog.kt:25)");
            }
            ServerToBentoAssetMapper3 serverToBentoAssetMapper3FromServerValue = ServerToBentoAssetMapper3.INSTANCE.fromServerValue(component.getPictogram().getServerValue());
            if (serverToBentoAssetMapper3FromServerValue == null) {
                serverToBentoAssetMapper3FromServerValue = ServerToBentoAssetMapper3.UNKNOWN;
            }
            int resourceId = serverToBentoAssetMapper3FromServerValue.getResourceId();
            int i5 = WhenMappings.$EnumSwitchMapping$0[component.getSize().ordinal()];
            if (i5 == 1) {
                bentoPogSize = BentoPogSize.Standard;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                bentoPogSize = BentoPogSize.Hero;
            }
            BentoPogSize bentoPogSize2 = bentoPogSize;
            boolean zIs_enabled = component.is_enabled();
            ThemedColor foreground_color_override = component.getForeground_color_override();
            composerStartRestartGroup.startReplaceGroup(-986335574);
            Color composeColor = foreground_color_override == null ? null : SduiColors2.toComposeColor(foreground_color_override, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceGroup();
            ThemedColor background_color_override = component.getBackground_color_override();
            composerStartRestartGroup.startReplaceGroup(-986332726);
            Color composeColor2 = background_color_override != null ? SduiColors2.toComposeColor(background_color_override, composerStartRestartGroup, 0) : null;
            composerStartRestartGroup.endReplaceGroup();
            BentoPogKt.m20684BentoPictogramPogRhg8lNc(resourceId, modifier2, zIs_enabled, bentoPogSize2, null, composeColor, composeColor2, composerStartRestartGroup, i3 & 112, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiPogKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiPog.SduiPictogramPog$lambda$0(component, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void SduiPictogramPog(final PogWithPictogramDto component, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(1095556267);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1095556267, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiPictogramPog (SduiPog.kt:48)");
            }
            int resourceId = SduiPictogram2.toPictogramAsset(component.getPictogram()).getResourceId();
            boolean z = !component.is_disabled();
            BentoPogSize bentoPogSize = toBentoPogSize(component.getSize());
            ThemedColorDto foreground_color_override = component.getForeground_color_override();
            composerStartRestartGroup.startReplaceGroup(562597915);
            Color composeColor = foreground_color_override == null ? null : SduiColors2.toComposeColor(foreground_color_override, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceGroup();
            ThemedColorDto background_color_override = component.getBackground_color_override();
            composerStartRestartGroup.startReplaceGroup(562600763);
            Color composeColor2 = background_color_override != null ? SduiColors2.toComposeColor(background_color_override, composerStartRestartGroup, 0) : null;
            composerStartRestartGroup.endReplaceGroup();
            BentoPogKt.m20684BentoPictogramPogRhg8lNc(resourceId, modifier2, z, bentoPogSize, null, composeColor, composeColor2, composerStartRestartGroup, i3 & 112, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiPogKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiPog.SduiPictogramPog$lambda$1(component, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final BentoPogSize toBentoPogSize(PictogramSizeDto pictogramSizeDto) {
        Intrinsics.checkNotNullParameter(pictogramSizeDto, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[pictogramSizeDto.ordinal()];
        if (i == 1 || i == 2) {
            return BentoPogSize.Standard;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return BentoPogSize.Hero;
    }

    public static final <ActionT extends Parcelable> void SduiTextPog(final TextPog<? extends ActionT> component, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        BentoPogSize bentoPogSize;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(594391902);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(594391902, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextPog (SduiPog.kt:68)");
            }
            int i5 = WhenMappings.$EnumSwitchMapping$2[component.getSize().ordinal()];
            if (i5 == 1) {
                bentoPogSize = BentoPogSize.Standard;
            } else if (i5 == 2) {
                bentoPogSize = BentoPogSize.Hero;
            } else if (i5 == 3) {
                bentoPogSize = BentoPogSize.ExtraLarge;
            } else {
                if (i5 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                bentoPogSize = BentoPogSize.Standard;
            }
            BentoPogSize bentoPogSize2 = bentoPogSize;
            int i6 = i3;
            String text = component.getText();
            boolean zIs_enabled = component.is_enabled();
            ThemedColor background_color_override = component.getBackground_color_override();
            composerStartRestartGroup.startReplaceGroup(-20013394);
            Color composeColor = background_color_override == null ? null : SduiColors2.toComposeColor(background_color_override, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceGroup();
            ThemedColor foreground_color_override = component.getForeground_color_override();
            composerStartRestartGroup.startReplaceGroup(-20010546);
            Color composeColor2 = foreground_color_override != null ? SduiColors2.toComposeColor(foreground_color_override, composerStartRestartGroup, 0) : null;
            composerStartRestartGroup.endReplaceGroup();
            Color color = composeColor;
            modifier2 = modifier3;
            BentoPogKt.m20686BentoTextPogTYpPzmw(text, modifier2, zIs_enabled, component.getHas_border(), null, bentoPogSize2, color, composeColor2, composerStartRestartGroup, i6 & 112, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiPogKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiPog.SduiTextPog$lambda$2(component, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void SduiTextPog(final TextPogDto component, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(986819399);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(986819399, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextPog (SduiPog.kt:90)");
            }
            int i5 = i3;
            String text = component.getText();
            boolean z = !component.is_disabled();
            BentoPogSize bentoPogSize = toBentoPogSize(component.getSize());
            ThemedColorDto background_color_override = component.getBackground_color_override();
            composerStartRestartGroup.startReplaceGroup(-854318985);
            Color composeColor = background_color_override == null ? null : SduiColors2.toComposeColor(background_color_override, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceGroup();
            ThemedColorDto foreground_color_override = component.getForeground_color_override();
            composerStartRestartGroup.startReplaceGroup(-854316137);
            Color composeColor2 = foreground_color_override != null ? SduiColors2.toComposeColor(foreground_color_override, composerStartRestartGroup, 0) : null;
            composerStartRestartGroup.endReplaceGroup();
            BentoPogKt.m20686BentoTextPogTYpPzmw(text, modifier2, z, component.getHas_border(), null, bentoPogSize, composeColor, composeColor2, composerStartRestartGroup, i5 & 112, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiPogKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiPog.SduiTextPog$lambda$3(component, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final BentoPogSize toBentoPogSize(TextPogDto.SizeDto sizeDto) {
        Intrinsics.checkNotNullParameter(sizeDto, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$3[sizeDto.ordinal()];
        if (i == 1) {
            return BentoPogSize.ExtraSmall;
        }
        if (i == 2 || i == 3) {
            return BentoPogSize.Standard;
        }
        if (i == 4) {
            return BentoPogSize.Hero;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return BentoPogSize.ExtraLarge;
    }

    public static final <ActionT extends Parcelable> void SduiNumberPog(final NumberPog<? extends ActionT> component, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(1404039654);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1404039654, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiNumberPog (SduiPog.kt:113)");
            }
            int number = component.getNumber();
            boolean zIs_enabled = component.is_enabled();
            ThemedColor background_color_override = component.getBackground_color_override();
            composerStartRestartGroup.startReplaceGroup(662386902);
            Color composeColor = background_color_override == null ? null : SduiColors2.toComposeColor(background_color_override, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceGroup();
            BentoPogKt.m20683BentoNumberPogxqIIw2o(number, modifier2, zIs_enabled, composeColor, composerStartRestartGroup, i3 & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiPogKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiPog.SduiNumberPog$lambda$4(component, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void SduiNumberPog(final NumberPogDto component, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(666664895);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(666664895, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiNumberPog (SduiPog.kt:126)");
            }
            int number = component.getNumber();
            boolean z = !component.is_disabled();
            ThemedColorDto background_color_override = component.getBackground_color_override();
            composerStartRestartGroup.startReplaceGroup(714846479);
            Color composeColor = background_color_override == null ? null : SduiColors2.toComposeColor(background_color_override, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceGroup();
            BentoPogKt.m20683BentoNumberPogxqIIw2o(number, modifier2, z, composeColor, composerStartRestartGroup, i3 & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiPogKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiPog.SduiNumberPog$lambda$5(component, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
