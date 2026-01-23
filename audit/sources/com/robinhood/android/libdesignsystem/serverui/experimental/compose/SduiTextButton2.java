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
import com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler2;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.BentoTextButton3;
import com.robinhood.models.serverdriven.experimental.api.ButtonIcon;
import com.robinhood.models.serverdriven.experimental.api.TextButton;
import com.robinhood.models.serverdriven.experimental.api.TextButtonSize;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.IconDto;
import rh_server_driven_ui.p531v1.TextButtonDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: SduiTextButton.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a=\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\t2\u0016\u0010\n\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\r\u001a\u0011\u0010\u000e\u001a\u00020\u000f*\u00020\u0010H\u0003¢\u0006\u0002\u0010\u0011\u001a\u0011\u0010\u000e\u001a\u00020\u000f*\u00020\u0012H\u0003¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"SduiTextButton", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/TextButton;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/serverdriven/experimental/api/TextButton;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lrh_server_driven_ui/v1/TextButtonDto;", "parseAction", "Lkotlin/Function1;", "Lrh_server_driven_ui/v1/ActionDto;", "(Lrh_server_driven_ui/v1/TextButtonDto;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "toBentoTextButtonSize", "Lcom/robinhood/compose/bento/component/BentoTextButtons$Size;", "Lcom/robinhood/models/serverdriven/experimental/api/TextButtonSize;", "(Lcom/robinhood/models/serverdriven/experimental/api/TextButtonSize;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/bento/component/BentoTextButtons$Size;", "Lrh_server_driven_ui/v1/TextButtonDto$SizeDto;", "(Lrh_server_driven_ui/v1/TextButtonDto$SizeDto;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/bento/component/BentoTextButtons$Size;", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextButtonKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiTextButton2 {

    /* compiled from: SduiTextButton.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextButtonKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TextButtonSize.values().length];
            try {
                iArr[TextButtonSize.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextButtonSize.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextButtonSize.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TextButtonDto.SizeDto.values().length];
            try {
                iArr2[TextButtonDto.SizeDto.SIZE_SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TextButtonDto.SizeDto.SIZE_MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TextButtonDto.SizeDto.SIZE_UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiTextButton$lambda$1(TextButton textButton, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiTextButton(textButton, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiTextButton$lambda$2(TextButtonDto textButtonDto, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiTextButton(textButtonDto, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiTextButton(final TextButton<? extends ActionT> component, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Integer logging_action_identifier;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1463366129);
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
                    ComposerKt.traceEventStart(-1463366129, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextButton (SduiTextButton.kt:26)");
                }
                String label = component.getLabel();
                Function0<Unit> function0Handling = SduiActionHandler3.handling(SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0), component.getAction());
                logging_action_identifier = component.getLogging_action_identifier();
                if (logging_action_identifier == null) {
                    UserInteractionEventData.Action actionFromValue = UserInteractionEventData.Action.INSTANCE.fromValue(logging_action_identifier.intValue());
                    if (actionFromValue == null) {
                        actionFromValue = UserInteractionEventData.Action.ACTION_UNSPECIFIED;
                    }
                    UserInteractionEventData.Action action = actionFromValue;
                    UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    Component.ComponentType componentType = Component.ComponentType.BUTTON;
                    String logging_identifier = component.getLogging_identifier();
                    if (logging_identifier == null) {
                        logging_identifier = "";
                    }
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier4, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, action, null, new Component(componentType, logging_identifier, null, 4, null), null, 43, null), true, false, false, component.is_enabled(), false, null, 108, null);
                    modifier3 = modifier4;
                    ButtonIcon icon = component.getIcon();
                    composerStartRestartGroup.startReplaceGroup(-1840514228);
                    BentoTextButton3.Icon.Size12 bentoTextButtonIconSize12 = icon == null ? null : ButtonIcons.toBentoTextButtonIconSize12(icon, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    BentoTextButton3.Size bentoTextButtonSize = toBentoTextButtonSize(component.getSize(), composerStartRestartGroup, 0);
                    Color composeColor = null;
                    boolean zIs_enabled = component.is_enabled();
                    ThemedColor color = component.getColor();
                    composerStartRestartGroup.startReplaceGroup(-1840508897);
                    if (color != null) {
                        composeColor = SduiColors2.toComposeColor(color, composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoTextButton2.m20715BentoTextButtonPIknLig(function0Handling, label, modifierAutoLogEvents$default, bentoTextButtonIconSize12, bentoTextButtonSize, zIs_enabled, composeColor, composerStartRestartGroup, BentoTextButton3.Icon.Size12.$stable << 9, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextButtonKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiTextButton2.SduiTextButton$lambda$1(component, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            String label2 = component.getLabel();
            Function0<Unit> function0Handling2 = SduiActionHandler3.handling(SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0), component.getAction());
            logging_action_identifier = component.getLogging_action_identifier();
            if (logging_action_identifier == null) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT> void SduiTextButton(final TextButtonDto component, final Function1<? super ActionDto, ? extends ActionT> parseAction, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        String logging_identifier;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(parseAction, "parseAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1762899891);
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
                    ComposerKt.traceEventStart(-1762899891, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextButton (SduiTextButton.kt:62)");
                }
                String label = component.getLabel();
                Function0<Unit> function0Handling = SduiActionHandler3.handling(parseAction.invoke(component.getAction()), SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0), DtoActionHandler2.currentDtoActionHandler(composerStartRestartGroup, 0));
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                Component.ComponentType componentType = Component.ComponentType.BUTTON;
                logging_identifier = component.getLogging_identifier();
                if (logging_identifier == null) {
                    logging_identifier = "";
                }
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier4, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(componentType, logging_identifier, null, 4, null), null, 47, null), true, false, false, !component.is_disabled(), false, null, 108, null);
                Modifier modifier5 = modifier4;
                IconDto icon = component.getIcon();
                composerStartRestartGroup.startReplaceGroup(-1929653750);
                BentoTextButton3.Icon.Size12 bentoTextButtonIconSize12 = icon != null ? null : ButtonIcons.toBentoTextButtonIconSize12(icon, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                BentoTextButton3.Size bentoTextButtonSize = toBentoTextButtonSize(component.getSize(), composerStartRestartGroup, 0);
                boolean z = !component.is_disabled();
                ThemedColorDto color = component.getColor();
                composerStartRestartGroup.startReplaceGroup(-1929648355);
                Color composeColor = color != null ? SduiColors2.toComposeColor(color, composerStartRestartGroup, 0) : null;
                composerStartRestartGroup.endReplaceGroup();
                BentoTextButton2.m20715BentoTextButtonPIknLig(function0Handling, label, modifierAutoLogEvents$default, bentoTextButtonIconSize12, bentoTextButtonSize, z, composeColor, composerStartRestartGroup, BentoTextButton3.Icon.Size12.$stable << 9, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextButtonKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiTextButton2.SduiTextButton$lambda$2(component, parseAction, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            String label2 = component.getLabel();
            Function0<Unit> function0Handling2 = SduiActionHandler3.handling(parseAction.invoke(component.getAction()), SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0), DtoActionHandler2.currentDtoActionHandler(composerStartRestartGroup, 0));
            UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Component.ComponentType componentType2 = Component.ComponentType.BUTTON;
            logging_identifier = component.getLogging_identifier();
            if (logging_identifier == null) {
            }
            Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(modifier4, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, null, null, null, new Component(componentType2, logging_identifier, null, 4, null), null, 47, null), true, false, false, !component.is_disabled(), false, null, 108, null);
            Modifier modifier52 = modifier4;
            IconDto icon2 = component.getIcon();
            composerStartRestartGroup.startReplaceGroup(-1929653750);
            if (icon2 != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoTextButton3.Size bentoTextButtonSize2 = toBentoTextButtonSize(component.getSize(), composerStartRestartGroup, 0);
            boolean z2 = !component.is_disabled();
            ThemedColorDto color2 = component.getColor();
            composerStartRestartGroup.startReplaceGroup(-1929648355);
            if (color2 != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoTextButton2.m20715BentoTextButtonPIknLig(function0Handling2, label2, modifierAutoLogEvents$default2, bentoTextButtonIconSize12, bentoTextButtonSize2, z2, composeColor, composerStartRestartGroup, BentoTextButton3.Icon.Size12.$stable << 9, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final BentoTextButton3.Size toBentoTextButtonSize(TextButtonSize textButtonSize, Composer composer, int i) {
        BentoTextButton3.Size size;
        composer.startReplaceGroup(284640033);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(284640033, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.toBentoTextButtonSize (SduiTextButton.kt:88)");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[textButtonSize.ordinal()];
        if (i2 == 1) {
            size = BentoTextButton3.Size.f5148S;
        } else {
            if (i2 != 2 && i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            size = BentoTextButton3.Size.f5147M;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return size;
    }

    private static final BentoTextButton3.Size toBentoTextButtonSize(TextButtonDto.SizeDto sizeDto, Composer composer, int i) {
        BentoTextButton3.Size size;
        composer.startReplaceGroup(524883903);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(524883903, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.toBentoTextButtonSize (SduiTextButton.kt:97)");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$1[sizeDto.ordinal()];
        if (i2 == 1) {
            size = BentoTextButton3.Size.f5148S;
        } else {
            if (i2 != 2 && i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            size = BentoTextButton3.Size.f5147M;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return size;
    }
}
