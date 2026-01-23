package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.ThemedComponentDto;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: SduiThemedComponentIdl.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0016\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0006H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"SduiThemedComponent", "", "ActionT", "component", "Lrh_server_driven_ui/v1/ThemedComponentDto;", "parseAction", "Lkotlin/Function1;", "Lrh_server_driven_ui/v1/ActionDto;", "(Lrh_server_driven_ui/v1/ThemedComponentDto;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiThemedComponentIdlKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiThemedComponentIdl {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiThemedComponent$lambda$0(ThemedComponentDto themedComponentDto, Function1 function1, int i, Composer composer, int i2) {
        SduiThemedComponent(themedComponentDto, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiThemedComponent$lambda$1(ThemedComponentDto themedComponentDto, Function1 function1, int i, Composer composer, int i2) {
        SduiThemedComponent(themedComponentDto, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiThemedComponent$lambda$2(ThemedComponentDto themedComponentDto, Function1 function1, int i, Composer composer, int i2) {
        SduiThemedComponent(themedComponentDto, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final <ActionT> void SduiThemedComponent(final ThemedComponentDto component, final Function1<? super ActionDto, ? extends ActionT> parseAction, Composer composer, final int i) {
        int i2;
        final Function1<? super ActionDto, ? extends ActionT> function1;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(parseAction, "parseAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(349206356);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(parseAction) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(349206356, i2, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiThemedComponent (SduiThemedComponentIdl.kt:11)");
            }
            if (BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay()) {
                composerStartRestartGroup.startReplaceGroup(795925420);
                UIComponentDto light = component.getLight();
                if (light == null) {
                    composerStartRestartGroup.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiThemedComponentIdlKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return SduiThemedComponentIdl.SduiThemedComponent$lambda$0(component, parseAction, i, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                function1 = parseAction;
                SduiComponentIdl.SduiComponent(light, function1, (Modifier) null, (HorizontalPadding) null, composerStartRestartGroup, i2 & 112, 12);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                function1 = parseAction;
                composerStartRestartGroup.startReplaceGroup(796060301);
                UIComponentDto dark = component.getDark();
                if (dark == null) {
                    composerStartRestartGroup.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup2 != null) {
                        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiThemedComponentIdlKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return SduiThemedComponentIdl.SduiThemedComponent$lambda$1(component, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                SduiComponentIdl.SduiComponent(dark, function1, (Modifier) null, (HorizontalPadding) null, composerStartRestartGroup, i2 & 112, 12);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function1 = parseAction;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup3 != null) {
            scopeUpdateScopeEndRestartGroup3.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiThemedComponentIdlKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiThemedComponentIdl.SduiThemedComponent$lambda$2(component, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
