package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler2;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoIconButton2;
import com.robinhood.compose.bento.component.BentoIconButton4;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.ButtonStateDto;
import rh_server_driven_ui.p531v1.ButtonTypeDto;
import rh_server_driven_ui.p531v1.IconButtonDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: SduiIconButtonIdl.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a=\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0016\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001a\f\u0010\u000b\u001a\u00020\f*\u00020\u0004H\u0002\u001a\f\u0010\r\u001a\u00020\u000e*\u00020\u0004H\u0002\u001a\u0011\u0010\u000f\u001a\u00020\u0010*\u00020\u0011H\u0002¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"SduiIconButton", "", "ActionT", "component", "Lrh_server_driven_ui/v1/IconButtonDto;", "parseAction", "Lkotlin/Function1;", "Lrh_server_driven_ui/v1/ActionDto;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lrh_server_driven_ui/v1/IconButtonDto;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "toBentoIconButtonType", "Lcom/robinhood/compose/bento/component/BentoIconButtons$Type;", "toBentoIconButtonIcon", "Lcom/robinhood/compose/bento/component/BentoIconButtons$Icon;", "toDp", "Landroidx/compose/ui/unit/Dp;", "Lrh_server_driven_ui/v1/IconButtonDto$SizeDto;", "(Lrh_server_driven_ui/v1/IconButtonDto$SizeDto;)F", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiIconButtonIdlKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiIconButtonIdl {

    /* compiled from: SduiIconButtonIdl.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiIconButtonIdlKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ButtonTypeDto.values().length];
            try {
                iArr[ButtonTypeDto.BUTTON_TYPE_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonTypeDto.BUTTON_TYPE_PRIMARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonTypeDto.BUTTON_TYPE_SECONDARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[IconButtonDto.SizeDto.values().length];
            try {
                iArr2[IconButtonDto.SizeDto.SIZE_TINY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[IconButtonDto.SizeDto.SIZE_SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[IconButtonDto.SizeDto.SIZE_MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[IconButtonDto.SizeDto.SIZE_UNSPECIFIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[IconButtonDto.SizeDto.SIZE_LARGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiIconButton$lambda$2(IconButtonDto iconButtonDto, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiIconButton(iconButtonDto, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT> void SduiIconButton(final IconButtonDto component, final Function1<? super ActionDto, ? extends ActionT> parseAction, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        BentoIconButton4.Type bentoIconButtonType;
        String logging_identifier;
        Modifier modifierAutoLogEvents$default;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(parseAction, "parseAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(1839194300);
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
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1839194300, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiIconButton (SduiIconButtonIdl.kt:24)");
                }
                Function0<Unit> function0Handling = SduiActionHandler3.handling(parseAction.invoke(component.getAction()), SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0), DtoActionHandler2.currentDtoActionHandler(composerStartRestartGroup, 0));
                bentoIconButtonType = toBentoIconButtonType(component);
                logging_identifier = component.getLogging_identifier();
                composerStartRestartGroup.startReplaceGroup(-2060788533);
                if (logging_identifier == null && logging_identifier.length() > 0) {
                    modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, logging_identifier, null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null);
                } else {
                    modifierAutoLogEvents$default = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierThen = modifier4.then(modifierAutoLogEvents$default);
                Modifier modifier5 = modifier4;
                BentoIconButton4.Icon bentoIconButtonIcon = toBentoIconButtonIcon(component);
                boolean z = component.getState() == ButtonStateDto.BUTTON_STATE_DISABLED;
                ThemedColorDto foreground_color = component.getForeground_color();
                composerStartRestartGroup.startReplaceGroup(-2060760404);
                Color composeColor = foreground_color != null ? null : SduiColors2.toComposeColor(foreground_color, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                ThemedColorDto background_color = component.getBackground_color();
                if (bentoIconButtonType != BentoIconButton4.Type.Primary) {
                    background_color = null;
                }
                composerStartRestartGroup.startReplaceGroup(-2060755860);
                Color composeColor2 = background_color != null ? null : SduiColors2.toComposeColor(background_color, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                ThemedColorDto background_color2 = component.getBackground_color();
                if (bentoIconButtonType != BentoIconButton4.Type.Secondary) {
                    background_color2 = null;
                }
                composerStartRestartGroup.startReplaceGroup(-2060751380);
                Color composeColor3 = background_color2 != null ? SduiColors2.toComposeColor(background_color2, composerStartRestartGroup, 0) : null;
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                BentoIconButton2.m20641BentoIconButtoncqYvz4g(function0Handling, bentoIconButtonIcon, "", modifierThen, bentoIconButtonType, z, composeColor, composeColor2, composeColor3, C2002Dp.m7993boximpl(toDp(component.getSize())), true, composer2, (BentoIconButton4.Icon.$stable << 3) | 384, 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiIconButtonIdlKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiIconButtonIdl.SduiIconButton$lambda$2(component, parseAction, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Function0<Unit> function0Handling2 = SduiActionHandler3.handling(parseAction.invoke(component.getAction()), SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0), DtoActionHandler2.currentDtoActionHandler(composerStartRestartGroup, 0));
            bentoIconButtonType = toBentoIconButtonType(component);
            logging_identifier = component.getLogging_identifier();
            composerStartRestartGroup.startReplaceGroup(-2060788533);
            if (logging_identifier == null) {
                modifierAutoLogEvents$default = Modifier.INSTANCE;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierThen2 = modifier4.then(modifierAutoLogEvents$default);
                Modifier modifier52 = modifier4;
                BentoIconButton4.Icon bentoIconButtonIcon2 = toBentoIconButtonIcon(component);
                if (component.getState() == ButtonStateDto.BUTTON_STATE_DISABLED) {
                }
                ThemedColorDto foreground_color2 = component.getForeground_color();
                composerStartRestartGroup.startReplaceGroup(-2060760404);
                if (foreground_color2 != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                ThemedColorDto background_color3 = component.getBackground_color();
                if (bentoIconButtonType != BentoIconButton4.Type.Primary) {
                }
                composerStartRestartGroup.startReplaceGroup(-2060755860);
                if (background_color3 != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                ThemedColorDto background_color22 = component.getBackground_color();
                if (bentoIconButtonType != BentoIconButton4.Type.Secondary) {
                }
                composerStartRestartGroup.startReplaceGroup(-2060751380);
                if (background_color22 != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                BentoIconButton2.m20641BentoIconButtoncqYvz4g(function0Handling2, bentoIconButtonIcon2, "", modifierThen2, bentoIconButtonType, z, composeColor, composeColor2, composeColor3, C2002Dp.m7993boximpl(toDp(component.getSize())), true, composer2, (BentoIconButton4.Icon.$stable << 3) | 384, 6, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final BentoIconButton4.Type toBentoIconButtonType(IconButtonDto iconButtonDto) {
        int i = WhenMappings.$EnumSwitchMapping$0[iconButtonDto.getType().ordinal()];
        if (i == 1 || i == 2) {
            return BentoIconButton4.Type.Primary;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return BentoIconButton4.Type.Secondary;
    }

    private static final BentoIconButton4.Icon toBentoIconButtonIcon(IconButtonDto iconButtonDto) {
        ServerToBentoAssetMapper2 bentoAsset = SduiIcon2.toBentoAsset(iconButtonDto.getIcon());
        if (bentoAsset == null) {
            bentoAsset = ServerToBentoAssetMapper2.INFO_12;
        }
        int i = WhenMappings.$EnumSwitchMapping$1[iconButtonDto.getSize().ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return new BentoIconButton4.Icon.StandardSize16(bentoAsset);
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return new BentoIconButton4.Icon.HeroSize24(bentoAsset);
    }

    private static final float toDp(IconButtonDto.SizeDto sizeDto) {
        int i = WhenMappings.$EnumSwitchMapping$1[sizeDto.ordinal()];
        if (i == 1) {
            return C2002Dp.m7995constructorimpl(24);
        }
        if (i == 2) {
            return C2002Dp.m7995constructorimpl(32);
        }
        if (i == 3 || i == 4) {
            return C2002Dp.m7995constructorimpl(44);
        }
        if (i == 5) {
            return C2002Dp.m7995constructorimpl(56);
        }
        throw new NoWhenBranchMatchedException();
    }
}
