package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.os.Parcelable;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.gold.sparkle.bento.BentoSparkleInfoTag;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler2;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.InfoTagsKt;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.models.serverdriven.experimental.api.InfoTag;
import com.robinhood.models.serverdriven.experimental.api.InfoTagType;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.IconDto;
import rh_server_driven_ui.p531v1.InfoTagDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: SduiInfoTag.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a=\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\t2\u0016\u0010\n\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m3636d2 = {"SduiInfoTag", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/InfoTag;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/serverdriven/experimental/api/InfoTag;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lrh_server_driven_ui/v1/InfoTagDto;", "parseAction", "Lkotlin/Function1;", "Lrh_server_driven_ui/v1/ActionDto;", "(Lrh_server_driven_ui/v1/InfoTagDto;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiInfoTagKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiInfoTag2 {

    /* compiled from: SduiInfoTag.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiInfoTagKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[InfoTagType.values().length];
            try {
                iArr[InfoTagType.ALERT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InfoTagType.INFORM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InfoTagType.INLINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InfoTagType.GOLD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InfoTagType.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[InfoTagDto.TypeDto.values().length];
            try {
                iArr2[InfoTagDto.TypeDto.TYPE_ALERT.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[InfoTagDto.TypeDto.TYPE_UNSPECIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[InfoTagDto.TypeDto.TYPE_INFORM.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[InfoTagDto.TypeDto.TYPE_INLINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[InfoTagDto.TypeDto.TYPE_GOLD.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiInfoTag$lambda$3(InfoTag infoTag, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiInfoTag(infoTag, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiInfoTag$lambda$5(InfoTagDto infoTagDto, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiInfoTag(infoTagDto, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiInfoTag(final InfoTag<? extends ActionT> component, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        int i4;
        String serverValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(277396604);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifierAutoLogEvents$default = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(277396604, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiInfoTag (SduiInfoTag.kt:27)");
                }
                String label = component.getLabel();
                Icon icon = component.getIcon();
                ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue = (icon != null || (serverValue = icon.getServerValue()) == null) ? null : ServerToBentoAssetMapper2.INSTANCE.fromServerValue(serverValue);
                Parcelable action = component.getAction();
                composerStartRestartGroup.startReplaceGroup(290175952);
                Function0<Unit> function0Handling = action != null ? null : SduiActionHandler3.handling(SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0), action);
                composerStartRestartGroup.endReplaceGroup();
                ThemedColor text_color_override = component.getText_color_override();
                composerStartRestartGroup.startReplaceGroup(290179500);
                Color composeColor = text_color_override != null ? null : SduiColors2.toComposeColor(text_color_override, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                ThemedColor background_color_override = component.getBackground_color_override();
                composerStartRestartGroup.startReplaceGroup(290182316);
                Color composeColor2 = background_color_override != null ? null : SduiColors2.toComposeColor(background_color_override, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(290184502);
                if (StringsKt.isBlank(component.getLogging_identifier())) {
                    modifier3 = modifierAutoLogEvents$default;
                    modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierAutoLogEvents$default, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.INFO_TAG, component.getLogging_identifier(), null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
                } else {
                    modifier3 = modifierAutoLogEvents$default;
                }
                composerStartRestartGroup.endReplaceGroup();
                i4 = WhenMappings.$EnumSwitchMapping$0[component.getType().ordinal()];
                if (i4 != 1) {
                    composerStartRestartGroup.startReplaceGroup(290203275);
                    InfoTagsKt.m20823BentoAlertInfoTagyZUFuyM(label, modifierAutoLogEvents$default, false, true, null, composeColor, function0Handling, composerStartRestartGroup, 3072, 20);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (i4 == 2) {
                    Modifier modifier4 = modifierAutoLogEvents$default;
                    composerStartRestartGroup.startReplaceGroup(290211051);
                    InfoTagsKt.m20825BentoInformInfoTagIAMbWEA(label, modifier4, serverToBentoAssetMapper2FromServerValue != null ? Integer.valueOf(serverToBentoAssetMapper2FromServerValue.getResourceId()) : null, composeColor2, null, false, composeColor, function0Handling, composerStartRestartGroup, 24576, 32);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                } else if (i4 == 3) {
                    Function0<Unit> function0 = function0Handling;
                    Modifier modifier5 = modifierAutoLogEvents$default;
                    composerStartRestartGroup.startReplaceGroup(290222732);
                    InfoTagsKt.m20826BentoInlineInfoTagyZUFuyM(label, modifier5, serverToBentoAssetMapper2FromServerValue != null ? Integer.valueOf(serverToBentoAssetMapper2FromServerValue.getResourceId()) : null, null, false, composeColor, function0, composerStartRestartGroup, 3072, 16);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (i4 == 4) {
                    composerStartRestartGroup.startReplaceGroup(407268136);
                    BentoSparkleInfoTag.BentoSparkleInfoTag(label, serverToBentoAssetMapper2FromServerValue != null ? Integer.valueOf(serverToBentoAssetMapper2FromServerValue.getResourceId()) : null, null, modifierAutoLogEvents$default, false, function0Handling, composerStartRestartGroup, 384, 16);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (i4 != 5) {
                        composerStartRestartGroup.startReplaceGroup(290202598);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(290240288);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiInfoTagKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiInfoTag2.SduiInfoTag$lambda$3(component, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            String label2 = component.getLabel();
            Icon icon2 = component.getIcon();
            if (icon2 != null) {
                Parcelable action2 = component.getAction();
                composerStartRestartGroup.startReplaceGroup(290175952);
                if (action2 != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                ThemedColor text_color_override2 = component.getText_color_override();
                composerStartRestartGroup.startReplaceGroup(290179500);
                if (text_color_override2 != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                ThemedColor background_color_override2 = component.getBackground_color_override();
                composerStartRestartGroup.startReplaceGroup(290182316);
                if (background_color_override2 != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(290184502);
                if (StringsKt.isBlank(component.getLogging_identifier())) {
                }
                composerStartRestartGroup.endReplaceGroup();
                i4 = WhenMappings.$EnumSwitchMapping$0[component.getType().ordinal()];
                if (i4 != 1) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0216  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT> void SduiInfoTag(final InfoTagDto component, final Function1<? super ActionDto, ? extends ActionT> parseAction, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        String logging_identifier;
        Modifier modifier4;
        Modifier modifier5;
        int i4;
        Composer composer2;
        final Modifier modifier6;
        String str;
        Integer numValueOf;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(parseAction, "parseAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(513691822);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(parseAction) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(513691822, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiInfoTag (SduiInfoTag.kt:95)");
                }
                String label = component.getLabel();
                IconDto icon = component.getIcon();
                ServerToBentoAssetMapper2 bentoAsset = icon == null ? SduiIcon2.toBentoAsset(icon) : null;
                ActionT actiontInvoke = parseAction.invoke(component.getAction());
                composerStartRestartGroup.startReplaceGroup(-263386187);
                Function0<Unit> function0Handling = actiontInvoke != null ? null : SduiActionHandler3.handling(actiontInvoke, SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0), DtoActionHandler2.currentDtoActionHandler(composerStartRestartGroup, 0));
                composerStartRestartGroup.endReplaceGroup();
                ThemedColorDto text_color_override = component.getText_color_override();
                composerStartRestartGroup.startReplaceGroup(-263382050);
                Color composeColor = text_color_override != null ? null : SduiColors2.toComposeColor(text_color_override, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                ThemedColorDto background_color_override = component.getBackground_color_override();
                composerStartRestartGroup.startReplaceGroup(-263379234);
                Color composeColor2 = background_color_override != null ? null : SduiColors2.toComposeColor(background_color_override, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                logging_identifier = component.getLogging_identifier();
                composerStartRestartGroup.startReplaceGroup(-263375493);
                if (logging_identifier != null || StringsKt.isBlank(logging_identifier)) {
                    modifier4 = modifier3;
                    modifier5 = modifier4;
                } else {
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier3, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.INFO_TAG, logging_identifier, null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
                    modifier4 = modifier3;
                    modifier5 = modifierAutoLogEvents$default;
                }
                composerStartRestartGroup.endReplaceGroup();
                i4 = WhenMappings.$EnumSwitchMapping$1[component.getType().ordinal()];
                if (i4 == 1) {
                    Integer numValueOf2 = null;
                    if (i4 == 2 || i4 == 3) {
                        Color color = composeColor;
                        Function0<Unit> function0 = function0Handling;
                        Modifier modifier7 = modifier5;
                        composerStartRestartGroup.startReplaceGroup(426196101);
                        if (bentoAsset != null) {
                            numValueOf2 = Integer.valueOf(bentoAsset.getResourceId());
                        }
                        InfoTagsKt.m20825BentoInformInfoTagIAMbWEA(label, modifier7, numValueOf2, composeColor2, null, false, color, function0, composerStartRestartGroup, 24576, 32);
                        composer2 = composerStartRestartGroup;
                        composer2.endReplaceGroup();
                    } else if (i4 == 4) {
                        Function0<Unit> function02 = function0Handling;
                        Modifier modifier8 = modifier5;
                        composerStartRestartGroup.startReplaceGroup(426570116);
                        if (bentoAsset != null) {
                            str = null;
                            numValueOf = Integer.valueOf(bentoAsset.getResourceId());
                        } else {
                            str = null;
                            numValueOf = null;
                        }
                        InfoTagsKt.m20826BentoInlineInfoTagyZUFuyM(label, modifier8, numValueOf, str, false, composeColor, function02, composerStartRestartGroup, 3072, 16);
                        composer2 = composerStartRestartGroup;
                        composer2.endReplaceGroup();
                    } else {
                        if (i4 != 5) {
                            composerStartRestartGroup.startReplaceGroup(-263356760);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(426880054);
                        Function0<Unit> function03 = function0Handling;
                        composer2 = composerStartRestartGroup;
                        BentoSparkleInfoTag.BentoSparkleInfoTag(label, bentoAsset != null ? Integer.valueOf(bentoAsset.getResourceId()) : null, null, modifier5, false, function03, composer2, 384, 16);
                        composer2.endReplaceGroup();
                    }
                } else {
                    composerStartRestartGroup.startReplaceGroup(-263355747);
                    InfoTagsKt.m20823BentoAlertInfoTagyZUFuyM(label, modifier5, false, true, null, composeColor, function0Handling, composerStartRestartGroup, 3072, 20);
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier6 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier6 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiInfoTagKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiInfoTag2.SduiInfoTag$lambda$5(component, parseAction, modifier6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            String label2 = component.getLabel();
            IconDto icon2 = component.getIcon();
            if (icon2 == null) {
            }
            ActionT actiontInvoke2 = parseAction.invoke(component.getAction());
            composerStartRestartGroup.startReplaceGroup(-263386187);
            if (actiontInvoke2 != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            ThemedColorDto text_color_override2 = component.getText_color_override();
            composerStartRestartGroup.startReplaceGroup(-263382050);
            if (text_color_override2 != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            ThemedColorDto background_color_override2 = component.getBackground_color_override();
            composerStartRestartGroup.startReplaceGroup(-263379234);
            if (background_color_override2 != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            logging_identifier = component.getLogging_identifier();
            composerStartRestartGroup.startReplaceGroup(-263375493);
            if (logging_identifier != null) {
                modifier4 = modifier3;
                modifier5 = modifier4;
                composerStartRestartGroup.endReplaceGroup();
                i4 = WhenMappings.$EnumSwitchMapping$1[component.getType().ordinal()];
                if (i4 == 1) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier6 = modifier4;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
