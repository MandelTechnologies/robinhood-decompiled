package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.os.Parcelable;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.C20692R;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoIconButton2;
import com.robinhood.compose.bento.component.BentoIconButton4;
import com.robinhood.models.serverdriven.experimental.api.ButtonType;
import com.robinhood.models.serverdriven.experimental.api.BuyingPowerHubAction;
import com.robinhood.models.serverdriven.experimental.api.IconButton;
import com.robinhood.models.serverdriven.experimental.api.IconButtonSize;
import com.robinhood.models.serverdriven.experimental.api.MarginAlertAction;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SduiIconButton.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\u001c\u0010\t\u001a\u00020\n\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0002\u001a\u001c\u0010\u000b\u001a\u00020\f\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0002\u001a\u0011\u0010\r\u001a\u00020\u000e*\u00020\u000fH\u0002¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"SduiIconButton", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/IconButton;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/serverdriven/experimental/api/IconButton;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "toBentoIconButtonType", "Lcom/robinhood/compose/bento/component/BentoIconButtons$Type;", "toBentoIconButtonIcon", "Lcom/robinhood/compose/bento/component/BentoIconButtons$Icon;", "toDp", "Landroidx/compose/ui/unit/Dp;", "Lcom/robinhood/models/serverdriven/experimental/api/IconButtonSize;", "(Lcom/robinhood/models/serverdriven/experimental/api/IconButtonSize;)F", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiIconButtonKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiIconButton2 {

    /* compiled from: SduiIconButton.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiIconButtonKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ButtonType.values().length];
            try {
                iArr[ButtonType.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonType.PRIMARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonType.SECONDARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[IconButtonSize.values().length];
            try {
                iArr2[IconButtonSize.TINY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[IconButtonSize.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[IconButtonSize.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[IconButtonSize.LARGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiIconButton$lambda$2(IconButton iconButton, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiIconButton(iconButton, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiIconButton(final IconButton<? extends ActionT> component, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        BentoIconButton4.Type bentoIconButtonType;
        String logging_identifier;
        Modifier modifierAutoLogEvents$default;
        Parcelable action;
        String icon_alt_text;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(-986135613);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-986135613, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiIconButton (SduiIconButton.kt:26)");
                }
                Function0<Unit> function0Handling = SduiActionHandler3.handling(SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0), component.getAction());
                bentoIconButtonType = toBentoIconButtonType(component);
                composerStartRestartGroup.startReplaceGroup(1511459082);
                logging_identifier = component.getLogging_identifier();
                if (logging_identifier == null && logging_identifier.length() > 0) {
                    Modifier.Companion companion = Modifier.INSTANCE;
                    UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    Component.ComponentType componentType = Component.ComponentType.BUTTON;
                    String logging_identifier2 = component.getLogging_identifier();
                    Intrinsics.checkNotNull(logging_identifier2);
                    modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(componentType, logging_identifier2, null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null);
                } else {
                    modifierAutoLogEvents$default = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierThen = modifier4.then(modifierAutoLogEvents$default);
                Modifier modifier5 = modifier4;
                BentoIconButton4.Icon bentoIconButtonIcon = toBentoIconButtonIcon(component);
                action = component.getAction();
                if (!(action instanceof MarginAlertAction.PresentMarginAlertDescription)) {
                    composerStartRestartGroup.startReplaceGroup(1511485057);
                    icon_alt_text = StringResources_androidKt.stringResource(C20692R.string.margin_alert_icon_content_description, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (action instanceof BuyingPowerHubAction.Deeplink) {
                    composerStartRestartGroup.startReplaceGroup(1511489030);
                    icon_alt_text = StringResources_androidKt.stringResource(C20692R.string.buying_power_info_icon_content_description, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-388394206);
                    composerStartRestartGroup.endReplaceGroup();
                    icon_alt_text = component.getIcon_alt_text();
                    if (icon_alt_text == null) {
                        icon_alt_text = "";
                    }
                }
                boolean zIs_enabled = component.is_enabled();
                ThemedColor foreground_color = component.getForeground_color();
                composerStartRestartGroup.startReplaceGroup(1511498163);
                Color composeColor = foreground_color != null ? null : SduiColors2.toComposeColor(foreground_color, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                ThemedColor background_color = component.getBackground_color();
                if (bentoIconButtonType != BentoIconButton4.Type.Primary) {
                    background_color = null;
                }
                composerStartRestartGroup.startReplaceGroup(1511502707);
                Color composeColor2 = background_color != null ? null : SduiColors2.toComposeColor(background_color, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                ThemedColor background_color2 = component.getBackground_color();
                if (bentoIconButtonType != BentoIconButton4.Type.Secondary) {
                    background_color2 = null;
                }
                composerStartRestartGroup.startReplaceGroup(1511507187);
                Color composeColor3 = background_color2 != null ? null : SduiColors2.toComposeColor(background_color2, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                modifier3 = modifier5;
                BentoIconButton2.m20641BentoIconButtoncqYvz4g(function0Handling, bentoIconButtonIcon, icon_alt_text, modifierThen, bentoIconButtonType, zIs_enabled, composeColor, composeColor2, composeColor3, C2002Dp.m7993boximpl(toDp(component.getSize())), true, composerStartRestartGroup, BentoIconButton4.Icon.$stable << 3, 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiIconButtonKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiIconButton2.SduiIconButton$lambda$2(component, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Function0<Unit> function0Handling2 = SduiActionHandler3.handling(SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0), component.getAction());
            bentoIconButtonType = toBentoIconButtonType(component);
            composerStartRestartGroup.startReplaceGroup(1511459082);
            logging_identifier = component.getLogging_identifier();
            if (logging_identifier == null) {
                modifierAutoLogEvents$default = Modifier.INSTANCE;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierThen2 = modifier4.then(modifierAutoLogEvents$default);
                Modifier modifier52 = modifier4;
                BentoIconButton4.Icon bentoIconButtonIcon2 = toBentoIconButtonIcon(component);
                action = component.getAction();
                if (!(action instanceof MarginAlertAction.PresentMarginAlertDescription)) {
                }
                boolean zIs_enabled2 = component.is_enabled();
                ThemedColor foreground_color2 = component.getForeground_color();
                composerStartRestartGroup.startReplaceGroup(1511498163);
                if (foreground_color2 != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                ThemedColor background_color3 = component.getBackground_color();
                if (bentoIconButtonType != BentoIconButton4.Type.Primary) {
                }
                composerStartRestartGroup.startReplaceGroup(1511502707);
                if (background_color3 != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                ThemedColor background_color22 = component.getBackground_color();
                if (bentoIconButtonType != BentoIconButton4.Type.Secondary) {
                }
                composerStartRestartGroup.startReplaceGroup(1511507187);
                if (background_color22 != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                modifier3 = modifier52;
                BentoIconButton2.m20641BentoIconButtoncqYvz4g(function0Handling2, bentoIconButtonIcon2, icon_alt_text, modifierThen2, bentoIconButtonType, zIs_enabled2, composeColor, composeColor2, composeColor3, C2002Dp.m7993boximpl(toDp(component.getSize())), true, composerStartRestartGroup, BentoIconButton4.Icon.$stable << 3, 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final <ActionT extends Parcelable> BentoIconButton4.Type toBentoIconButtonType(IconButton<? extends ActionT> iconButton) {
        int i = WhenMappings.$EnumSwitchMapping$0[iconButton.getType().ordinal()];
        if (i == 1 || i == 2) {
            return BentoIconButton4.Type.Primary;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return BentoIconButton4.Type.Secondary;
    }

    private static final <ActionT extends Parcelable> BentoIconButton4.Icon toBentoIconButtonIcon(IconButton<? extends ActionT> iconButton) {
        ServerToBentoAssetMapper2 iconAsset = UtilKt.getIconAsset(iconButton.getIcon());
        if (iconAsset == null) {
            iconAsset = ServerToBentoAssetMapper2.INFO_12;
        }
        int i = WhenMappings.$EnumSwitchMapping$1[iconButton.getSize().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return new BentoIconButton4.Icon.StandardSize16(iconAsset);
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return new BentoIconButton4.Icon.HeroSize24(iconAsset);
    }

    private static final float toDp(IconButtonSize iconButtonSize) {
        int i = WhenMappings.$EnumSwitchMapping$1[iconButtonSize.ordinal()];
        if (i == 1) {
            return C2002Dp.m7995constructorimpl(24);
        }
        if (i == 2) {
            return C2002Dp.m7995constructorimpl(32);
        }
        if (i == 3) {
            return C2002Dp.m7995constructorimpl(44);
        }
        if (i == 4) {
            return C2002Dp.m7995constructorimpl(56);
        }
        throw new NoWhenBranchMatchedException();
    }
}
