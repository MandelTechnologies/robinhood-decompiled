package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.annotation.SuppressLint;
import android.os.Parcelable;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.gold.sparkle.bento.BentoSparkleButton2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler2;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.models.serverdriven.experimental.api.BoundState;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.ButtonIcon;
import com.robinhood.models.serverdriven.experimental.api.ButtonIconPosition;
import com.robinhood.models.serverdriven.experimental.api.ButtonState;
import com.robinhood.models.serverdriven.experimental.api.ButtonType;
import com.robinhood.models.serverdriven.experimental.api.ReactiveButton;
import com.robinhood.models.serverdriven.experimental.api.StateBinding;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.ButtonDto;
import rh_server_driven_ui.p531v1.ButtonStateDto;
import rh_server_driven_ui.p531v1.ButtonTypeDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: SduiButton.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a;\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\t2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\r\u001a/\u0010\u000e\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000f2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u0010\u001a\f\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u0013\u001a\f\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u0014\u001a\u001b\u0010\u0015\u001a\u00020\u0007*\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0003¢\u0006\u0002\u0010\u0018¨\u0006\u0019²\u0006\n\u0010\u001a\u001a\u00020\u001bX\u008a\u008e\u0002²\u0006\f\u0010\u001c\u001a\u0004\u0018\u00010\u001bX\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\u001bX\u008a\u008e\u0002"}, m3636d2 = {"SduiButton", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/Button;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/serverdriven/experimental/api/Button;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lrh_server_driven_ui/v1/ButtonDto;", "parseAction", "Lkotlin/Function1;", "Lrh_server_driven_ui/v1/ActionDto;", "(Lrh_server_driven_ui/v1/ButtonDto;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SduiReactiveButton", "Lcom/robinhood/models/serverdriven/experimental/api/ReactiveButton;", "(Lcom/robinhood/models/serverdriven/experimental/api/ReactiveButton;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "toBentoIcon", "Lcom/robinhood/compose/bento/component/BentoButtons$Icon$Size16;", "Lcom/robinhood/models/serverdriven/experimental/api/ButtonIcon;", "Lrh_server_driven_ui/v1/ButtonDto$ButtonIconDto;", "autoLogEvents", "identifier", "", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "lib-sdui_externalRelease", "hidden", "", "disabled", "loading"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiButtonKt, reason: use source file name */
/* loaded from: classes17.dex */
public final class SduiButton2 {

    /* compiled from: SduiButton.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiButtonKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[ButtonType.values().length];
            try {
                iArr[ButtonType.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonType.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ButtonTypeDto.values().length];
            try {
                iArr2[ButtonTypeDto.BUTTON_TYPE_PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ButtonTypeDto.BUTTON_TYPE_UNSPECIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ButtonTypeDto.BUTTON_TYPE_SECONDARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[BoundState.values().length];
            try {
                iArr3[BoundState.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[BoundState.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[BoundState.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[ButtonIconPosition.values().length];
            try {
                iArr4[ButtonIconPosition.LEADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[ButtonIconPosition.TRAILING.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[ButtonDto.ButtonIconDto.PositionDto.values().length];
            try {
                iArr5[ButtonDto.ButtonIconDto.PositionDto.POSITION_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr5[ButtonDto.ButtonIconDto.PositionDto.POSITION_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr5[ButtonDto.ButtonIconDto.PositionDto.POSITION_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiButton$lambda$0(Button button, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiButton(button, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiButton$lambda$2(ButtonDto buttonDto, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiButton(buttonDto, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiReactiveButton$lambda$13(ReactiveButton reactiveButton, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiReactiveButton(reactiveButton, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiReactiveButton$lambda$16(ReactiveButton reactiveButton, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiReactiveButton(reactiveButton, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0407  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiButton(final Button<? extends ActionT> component, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        boolean z;
        LocalDecoratorOverride localDecoratorOverride;
        int i4;
        Composer composer2;
        boolean z2;
        BentoButtons.Icon.Size16 bentoIcon;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(-63269348);
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
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-63269348, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiButton (SduiButton.kt:38)");
                }
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                Component component2 = new Component(Component.ComponentType.BUTTON, component.getLogging_identifier(), null, 4, null);
                Context context = ((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getContext();
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier4, UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, null, context == null ? Context.copy$default(context, 0, 0, 0, component.getLabel(), null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, -1, -1, -1, -1, -1, 16383, null) : null, component2, null, 39, null)), true, false, false, true, false, null, 108, null);
                modifier3 = modifier4;
                z = component.getState() != ButtonState.LOADING;
                Function0<Unit> function0Handling = SduiActionHandler3.handling(SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0), component.getAction());
                localDecoratorOverride = (LocalDecoratorOverride) composerStartRestartGroup.consume(SduiDecoratorKt.getLocalSduiDecoratorModifiers());
                if (localDecoratorOverride == null && localDecoratorOverride.getLocalComponentGoldSparkle()) {
                    composerStartRestartGroup.startReplaceGroup(634538898);
                    String label = component.getLabel();
                    boolean zIs_enabled = component.is_enabled();
                    ButtonIcon icon = component.getIcon();
                    if (icon != null) {
                        z2 = z;
                        bentoIcon = toBentoIcon(icon);
                    } else {
                        z2 = z;
                        bentoIcon = null;
                    }
                    BentoSparkleButton2.BentoSparkleButton(function0Handling, label, modifierAutoLogEvents$default, bentoIcon, zIs_enabled, z2, false, composerStartRestartGroup, BentoButtons.Icon.Size16.$stable << 9, 64);
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                } else {
                    boolean z3 = z;
                    composerStartRestartGroup.startReplaceGroup(634846666);
                    i4 = WhenMappings.$EnumSwitchMapping$0[component.getType().ordinal()];
                    if (i4 != 1) {
                        composerStartRestartGroup.startReplaceGroup(634892701);
                        String label2 = component.getLabel();
                        boolean zIs_enabled2 = component.is_enabled();
                        ButtonIcon icon2 = component.getIcon();
                        BentoButtons.Icon.Size16 bentoIcon2 = icon2 != null ? toBentoIcon(icon2) : null;
                        BentoButtons.Type type2 = BentoButtons.Type.Primary;
                        ThemedColor text_color = component.getText_color();
                        composerStartRestartGroup.startReplaceGroup(-672244692);
                        Color composeColor = text_color == null ? null : SduiColors2.toComposeColor(text_color, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        ThemedColor tint_color = component.getTint_color();
                        composerStartRestartGroup.startReplaceGroup(-672242068);
                        Color composeColor2 = tint_color == null ? null : SduiColors2.toComposeColor(tint_color, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        composer2 = composerStartRestartGroup;
                        BentoButtonKt.m20586BentoButtonEikTQX8(function0Handling, label2, modifierAutoLogEvents$default, bentoIcon2, type2, zIs_enabled2, z3, composeColor2, composeColor, null, null, false, null, composer2, (BentoButtons.Icon.Size16.$stable << 9) | 24576, 0, 7680);
                        composer2.endReplaceGroup();
                        Unit unit = Unit.INSTANCE;
                    } else if (i4 == 2) {
                        composerStartRestartGroup.startReplaceGroup(635416725);
                        String label3 = component.getLabel();
                        boolean zIs_enabled3 = component.is_enabled();
                        ButtonIcon icon3 = component.getIcon();
                        BentoButtons.Icon.Size16 bentoIcon3 = icon3 != null ? toBentoIcon(icon3) : null;
                        BentoButtons.Type type3 = BentoButtons.Type.Secondary;
                        ThemedColor text_color2 = component.getText_color();
                        composerStartRestartGroup.startReplaceGroup(-672227764);
                        Color composeColor3 = text_color2 == null ? null : SduiColors2.toComposeColor(text_color2, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-672228404);
                        if (composeColor3 == null) {
                            ThemedColor tint_color2 = component.getTint_color();
                            composeColor3 = tint_color2 == null ? null : SduiColors2.toComposeColor(tint_color2, composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        ThemedColor tint_color3 = component.getTint_color();
                        composerStartRestartGroup.startReplaceGroup(-672223924);
                        Color composeColor4 = tint_color3 == null ? null : SduiColors2.toComposeColor(tint_color3, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        composer2 = composerStartRestartGroup;
                        BentoButtonKt.m20586BentoButtonEikTQX8(function0Handling, label3, modifierAutoLogEvents$default, bentoIcon3, type3, zIs_enabled3, z3, null, composeColor3, composeColor4, null, false, null, composer2, (BentoButtons.Icon.Size16.$stable << 9) | 24576, 0, 7296);
                        composer2.endReplaceGroup();
                        Unit unit2 = Unit.INSTANCE;
                    } else {
                        if (i4 != 3) {
                            composerStartRestartGroup.startReplaceGroup(-672257432);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(-672221792);
                        composerStartRestartGroup.endReplaceGroup();
                        Unit unit3 = Unit.INSTANCE;
                        composer2 = composerStartRestartGroup;
                    }
                    composer2.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiButtonKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiButton2.SduiButton$lambda$0(component, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Component component22 = new Component(Component.ComponentType.BUTTON, component.getLogging_identifier(), null, 4, null);
            Context context2 = ((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getContext();
            Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(modifier4, UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor2, new UserInteractionEventDescriptor(null, null, null, context2 == null ? Context.copy$default(context2, 0, 0, 0, component.getLabel(), null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -9, -1, -1, -1, -1, -1, 16383, null) : null, component22, null, 39, null)), true, false, false, true, false, null, 108, null);
            modifier3 = modifier4;
            if (component.getState() != ButtonState.LOADING) {
            }
            Function0<Unit> function0Handling2 = SduiActionHandler3.handling(SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0), component.getAction());
            localDecoratorOverride = (LocalDecoratorOverride) composerStartRestartGroup.consume(SduiDecoratorKt.getLocalSduiDecoratorModifiers());
            if (localDecoratorOverride == null) {
                boolean z32 = z;
                composerStartRestartGroup.startReplaceGroup(634846666);
                i4 = WhenMappings.$EnumSwitchMapping$0[component.getType().ordinal()];
                if (i4 != 1) {
                }
                composer2.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final boolean SduiReactiveButton$lambda$10(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean SduiReactiveButton$lambda$4(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final Boolean SduiReactiveButton$lambda$7(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT> void SduiButton(final ButtonDto component, final Function1<? super ActionDto, ? extends ActionT> parseAction, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean z;
        boolean z2;
        LocalDecoratorOverride localDecoratorOverride;
        int i4;
        Modifier modifier3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(parseAction, "parseAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2026444902);
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
                Modifier modifier5 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2026444902, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiButton (SduiButton.kt:104)");
                }
                Modifier modifierAutoLogEvents = autoLogEvents(modifier5, component.getLogging_identifier(), composerStartRestartGroup, (i3 >> 6) & 14);
                z = component.getState() != ButtonStateDto.BUTTON_STATE_LOADING;
                z2 = component.getState() == ButtonStateDto.BUTTON_STATE_DISABLED;
                ActionDto action = component.getAction();
                Function0<Unit> function0Handling = SduiActionHandler3.handling(action == null ? parseAction.invoke(action) : null, SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0), DtoActionHandler2.currentDtoActionHandler(composerStartRestartGroup, 0));
                localDecoratorOverride = (LocalDecoratorOverride) composerStartRestartGroup.consume(SduiDecoratorKt.getLocalSduiDecoratorModifiers());
                if (localDecoratorOverride == null && localDecoratorOverride.getLocalComponentGoldSparkle()) {
                    composerStartRestartGroup.startReplaceGroup(240887135);
                    String label = component.getLabel();
                    ButtonDto.ButtonIconDto icon = component.getIcon();
                    BentoSparkleButton2.BentoSparkleButton(function0Handling, label, modifierAutoLogEvents, icon != null ? toBentoIcon(icon) : null, z2, z, false, composerStartRestartGroup, BentoButtons.Icon.Size16.$stable << 9, 64);
                    composerStartRestartGroup.endReplaceGroup();
                    modifier3 = modifier5;
                } else {
                    boolean z3 = z2;
                    boolean z4 = z;
                    composerStartRestartGroup.startReplaceGroup(241184549);
                    i4 = WhenMappings.$EnumSwitchMapping$1[component.getType().ordinal()];
                    if (i4 != 1) {
                        modifier3 = modifier5;
                        composerStartRestartGroup.startReplaceGroup(241244906);
                        String label2 = component.getLabel();
                        ButtonDto.ButtonIconDto icon2 = component.getIcon();
                        BentoButtons.Icon.Size16 bentoIcon = icon2 != null ? toBentoIcon(icon2) : null;
                        BentoButtons.Type type2 = BentoButtons.Type.Primary;
                        ThemedColorDto text_color = component.getText_color();
                        composerStartRestartGroup.startReplaceGroup(-1793322006);
                        Color composeColor = text_color == null ? null : SduiColors2.toComposeColor(text_color, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        ThemedColorDto tint_color = component.getTint_color();
                        composerStartRestartGroup.startReplaceGroup(-1793319382);
                        Color composeColor2 = tint_color == null ? null : SduiColors2.toComposeColor(tint_color, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8(function0Handling, label2, modifierAutoLogEvents, bentoIcon, type2, z3, z4, composeColor2, composeColor, null, null, false, null, composerStartRestartGroup, (BentoButtons.Icon.Size16.$stable << 9) | 24576, 0, 7680);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        if (i4 != 2 && i4 != 3) {
                            composerStartRestartGroup.startReplaceGroup(-1793334867);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(241811586);
                        String label3 = component.getLabel();
                        ButtonDto.ButtonIconDto icon3 = component.getIcon();
                        BentoButtons.Icon.Size16 bentoIcon2 = icon3 != null ? toBentoIcon(icon3) : null;
                        BentoButtons.Type type3 = BentoButtons.Type.Secondary;
                        ThemedColorDto text_color2 = component.getText_color();
                        composerStartRestartGroup.startReplaceGroup(-1793303702);
                        Color composeColor3 = text_color2 == null ? null : SduiColors2.toComposeColor(text_color2, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-1793304342);
                        if (composeColor3 == null) {
                            ThemedColorDto tint_color2 = component.getTint_color();
                            composeColor3 = tint_color2 == null ? null : SduiColors2.toComposeColor(tint_color2, composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        ThemedColorDto tint_color3 = component.getTint_color();
                        composerStartRestartGroup.startReplaceGroup(-1793299862);
                        Color composeColor4 = tint_color3 == null ? null : SduiColors2.toComposeColor(tint_color3, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        modifier3 = modifier5;
                        BentoButtonKt.m20586BentoButtonEikTQX8(function0Handling, label3, modifierAutoLogEvents, bentoIcon2, type3, z3, z4, null, composeColor3, composeColor4, null, false, null, composerStartRestartGroup, (BentoButtons.Icon.Size16.$stable << 9) | 24576, 0, 7296);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiButtonKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiButton2.SduiButton$lambda$2(component, parseAction, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            Modifier modifierAutoLogEvents2 = autoLogEvents(modifier5, component.getLogging_identifier(), composerStartRestartGroup, (i3 >> 6) & 14);
            if (component.getState() != ButtonStateDto.BUTTON_STATE_LOADING) {
            }
            if (component.getState() == ButtonStateDto.BUTTON_STATE_DISABLED) {
            }
            ActionDto action2 = component.getAction();
            Function0<Unit> function0Handling2 = SduiActionHandler3.handling(action2 == null ? parseAction.invoke(action2) : null, SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0), DtoActionHandler2.currentDtoActionHandler(composerStartRestartGroup, 0));
            localDecoratorOverride = (LocalDecoratorOverride) composerStartRestartGroup.consume(SduiDecoratorKt.getLocalSduiDecoratorModifiers());
            if (localDecoratorOverride == null) {
                boolean z32 = z2;
                boolean z42 = z;
                composerStartRestartGroup.startReplaceGroup(241184549);
                i4 = WhenMappings.$EnumSwitchMapping$1[component.getType().ordinal()];
                if (i4 != 1) {
                }
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiReactiveButton(final ReactiveButton<? extends ActionT> component, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        SnapshotState snapshotState;
        Object objRememberedValue2;
        Object objRememberedValue3;
        Modifier modifier3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(1796529980);
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
                final Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1796529980, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiReactiveButton (SduiButton.kt:155)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                SnapshotState snapshotState3 = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                SduiStateHandler3 sduiStateHandler3 = (SduiStateHandler3) composerStartRestartGroup.consume(SduiStateHandler2.getLocalStateHandler());
                for (StateBinding stateBinding : component.getStates()) {
                    boolean zValidateStateReferences = sduiStateHandler3.validateStateReferences(stateBinding.getBinding().getRefs());
                    int i5 = WhenMappings.$EnumSwitchMapping$2[stateBinding.getState().ordinal()];
                    if (i5 == 1) {
                        SduiReactiveButton$lambda$5(snapshotState, !zValidateStateReferences);
                    } else if (i5 == 2) {
                        snapshotState2.setValue(Boolean.valueOf(!zValidateStateReferences));
                    } else {
                        if (i5 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        SduiReactiveButton$lambda$11(snapshotState3, !zValidateStateReferences);
                    }
                }
                if (!SduiReactiveButton$lambda$4(snapshotState)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup2 != null) {
                        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiButtonKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return SduiButton2.SduiReactiveButton$lambda$13(component, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                Modifier modifierAutoLogEvents = autoLogEvents(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), component.getLogging_identifier(), composerStartRestartGroup, 0);
                Function0<Unit> function0Handling = SduiActionHandler3.handling(SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0), component.getAction());
                int i6 = WhenMappings.$EnumSwitchMapping$0[component.getType().ordinal()];
                if (i6 == 1) {
                    modifier3 = modifier4;
                    composerStartRestartGroup.startReplaceGroup(-111510610);
                    String label = component.getLabel();
                    ButtonIcon icon = component.getIcon();
                    BentoButtons.Icon.Size16 bentoIcon = icon != null ? toBentoIcon(icon) : null;
                    BentoButtons.Type type2 = BentoButtons.Type.Primary;
                    boolean zIs_enabled = SduiReactiveButton$lambda$7(snapshotState2) != null ? !r9.booleanValue() : component.is_enabled();
                    boolean zSduiReactiveButton$lambda$10 = SduiReactiveButton$lambda$10(snapshotState3);
                    ThemedColor tint_color = component.getTint_color();
                    composerStartRestartGroup.startReplaceGroup(-111498996);
                    Color composeColor = tint_color == null ? null : SduiColors2.toComposeColor(tint_color, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    BentoButtonKt.m20586BentoButtonEikTQX8(function0Handling, label, modifierAutoLogEvents, bentoIcon, type2, zIs_enabled, zSduiReactiveButton$lambda$10, composeColor, null, null, null, false, null, composer2, (BentoButtons.Icon.Size16.$stable << 9) | 24576, 0, 7936);
                    composer2.endReplaceGroup();
                } else if (i6 == 2) {
                    composerStartRestartGroup.startReplaceGroup(-111496656);
                    String label2 = component.getLabel();
                    ButtonIcon icon2 = component.getIcon();
                    BentoButtons.Icon.Size16 bentoIcon2 = icon2 != null ? toBentoIcon(icon2) : null;
                    BentoButtons.Type type3 = BentoButtons.Type.Secondary;
                    boolean zIs_enabled2 = SduiReactiveButton$lambda$7(snapshotState2) != null ? !r9.booleanValue() : component.is_enabled();
                    boolean zSduiReactiveButton$lambda$102 = SduiReactiveButton$lambda$10(snapshotState3);
                    ThemedColor tint_color2 = component.getTint_color();
                    composerStartRestartGroup.startReplaceGroup(-111484980);
                    Color composeColor2 = tint_color2 == null ? null : SduiColors2.toComposeColor(tint_color2, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier4;
                    BentoButtonKt.m20586BentoButtonEikTQX8(function0Handling, label2, modifierAutoLogEvents, bentoIcon2, type3, zIs_enabled2, zSduiReactiveButton$lambda$102, composeColor2, null, null, null, false, null, composer2, (BentoButtons.Icon.Size16.$stable << 9) | 24576, 0, 7936);
                    composer2.endReplaceGroup();
                } else {
                    if (i6 != 3) {
                        composerStartRestartGroup.startReplaceGroup(-111511804);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(-111483104);
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiButtonKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiButton2.SduiReactiveButton$lambda$16(component, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            SnapshotState snapshotState22 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
            }
            SnapshotState snapshotState32 = (SnapshotState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            SduiStateHandler3 sduiStateHandler32 = (SduiStateHandler3) composerStartRestartGroup.consume(SduiStateHandler2.getLocalStateHandler());
            while (r11.hasNext()) {
            }
            if (!SduiReactiveButton$lambda$4(snapshotState)) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void SduiReactiveButton$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final void SduiReactiveButton$lambda$11(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    public static final BentoButtons.Icon.Size16 toBentoIcon(ButtonIcon buttonIcon) {
        BentoButtons.Icon.Position position;
        Intrinsics.checkNotNullParameter(buttonIcon, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$3[buttonIcon.getPosition().ordinal()];
        if (i == 1) {
            position = BentoButtons.Icon.Position.Leading;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            position = BentoButtons.Icon.Position.Trailing;
        }
        ServerToBentoAssetMapper2 bentoAsset = SduiIcon2.toBentoAsset(buttonIcon.getIcon());
        if (bentoAsset != null) {
            return new BentoButtons.Icon.Size16(bentoAsset, position);
        }
        return null;
    }

    public static final BentoButtons.Icon.Size16 toBentoIcon(ButtonDto.ButtonIconDto buttonIconDto) {
        BentoButtons.Icon.Position position;
        Intrinsics.checkNotNullParameter(buttonIconDto, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$4[buttonIconDto.getPosition().ordinal()];
        if (i == 1 || i == 2) {
            position = BentoButtons.Icon.Position.Leading;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            position = BentoButtons.Icon.Position.Trailing;
        }
        ServerToBentoAssetMapper2 bentoAsset = SduiIcon2.toBentoAsset(buttonIconDto.getIcon());
        if (bentoAsset != null) {
            return new BentoButtons.Icon.Size16(bentoAsset, position);
        }
        return null;
    }

    @SuppressLint({"ComposableModifierFactory"})
    private static final Modifier autoLogEvents(Modifier modifier, String str, Composer composer, int i) {
        composer.startReplaceGroup(-1560314385);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1560314385, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.autoLogEvents (SduiButton.kt:225)");
        }
        Modifier modifierAutoLogEvents = UtilKt.autoLogEvents(modifier, Component.ComponentType.BUTTON, str, false, composer, (i & 14) | 48 | ((i << 3) & 896), 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierAutoLogEvents;
    }
}
