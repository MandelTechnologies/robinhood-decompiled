package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.dagger.SduiDaggerComponentIdl;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.DecoratorDto;
import rh_server_driven_ui.p531v1.IconButtonDto;
import rh_server_driven_ui.p531v1.NumberPogDto;
import rh_server_driven_ui.p531v1.PogWithPictogramDto;
import rh_server_driven_ui.p531v1.TextPogDto;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: SduiComponentIdl.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aG\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0016\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001aG\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00102\u0016\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\u0011\"\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"SduiComponent", "", "ActionT", "component", "Lrh_server_driven_ui/v1/UIComponentDto;", "parseAction", "Lkotlin/Function1;", "Lrh_server_driven_ui/v1/ActionDto;", "modifier", "Landroidx/compose/ui/Modifier;", "horizontalPadding", "Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;", "(Lrh_server_driven_ui/v1/UIComponentDto;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;Landroidx/compose/runtime/Composer;II)V", "LocalIsTopLevelSduiComponent", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "(Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;Landroidx/compose/runtime/Composer;II)V", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponentIdlKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiComponentIdl {
    private static final CompositionLocal6<Boolean> LocalIsTopLevelSduiComponent = CompositionLocal3.staticCompositionLocalOf(new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponentIdlKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(SduiComponentIdl.LocalIsTopLevelSduiComponent$lambda$2());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LocalIsTopLevelSduiComponent$lambda$2() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiComponent$lambda$0(UIComponentDto uIComponentDto, Function1 function1, Modifier modifier, HorizontalPadding horizontalPadding, int i, int i2, Composer composer, int i3) {
        SduiComponent(uIComponentDto, function1, modifier, horizontalPadding, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiComponent$lambda$1(UIComponentDto uIComponentDto, Function1 function1, Modifier modifier, HorizontalPadding horizontalPadding, int i, int i2, Composer composer, int i3) {
        SduiComponent(uIComponentDto, function1, modifier, horizontalPadding, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiComponent$lambda$3(UIComponentDto.ConcreteDto concreteDto, Function1 function1, Modifier modifier, HorizontalPadding horizontalPadding, int i, int i2, Composer composer, int i3) {
        SduiComponent(concreteDto, function1, modifier, horizontalPadding, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final <ActionT> void SduiComponent(final UIComponentDto component, final Function1<? super ActionDto, ? extends ActionT> parseAction, Modifier modifier, HorizontalPadding horizontalPadding, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final HorizontalPadding horizontalPadding2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(parseAction, "parseAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(188920751);
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
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(horizontalPadding == null ? -1 : horizontalPadding.ordinal()) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            horizontalPadding2 = horizontalPadding;
            composer2 = composerStartRestartGroup;
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            modifier2 = modifier;
            if (i5 != 0) {
                horizontalPadding = HorizontalPadding.None;
            }
            horizontalPadding2 = horizontalPadding;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(188920751, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponent (SduiComponentIdl.kt:19)");
            }
            composer2 = composerStartRestartGroup;
            UIComponentDto.ConcreteDto concrete = component.getConcrete();
            if (concrete == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponentIdlKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SduiComponentIdl.SduiComponent$lambda$0(component, parseAction, modifier2, horizontalPadding2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            SduiComponent(concrete, parseAction, modifier2, horizontalPadding2, composer2, i3 & 8176, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponentIdlKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiComponentIdl.SduiComponent$lambda$1(component, parseAction, modifier2, horizontalPadding2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final <ActionT> void SduiComponent(final UIComponentDto.ConcreteDto component, final Function1<? super ActionDto, ? extends ActionT> parseAction, Modifier modifier, HorizontalPadding horizontalPadding, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final HorizontalPadding horizontalPadding2;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(parseAction, "parseAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2017082553);
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
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(horizontalPadding == null ? -1 : horizontalPadding.ordinal()) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            final Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier;
            final HorizontalPadding horizontalPadding3 = i5 != 0 ? HorizontalPadding.None : horizontalPadding;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2017082553, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponent (SduiComponentIdl.kt:39)");
            }
            CompositionLocal6<Boolean> compositionLocal6 = LocalIsTopLevelSduiComponent;
            final boolean zBooleanValue = ((Boolean) composerStartRestartGroup.consume(compositionLocal6)).booleanValue();
            composerStartRestartGroup.startReplaceGroup(-1386068360);
            final Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = (horizontalPadding3 != HorizontalPadding.Default || (component instanceof UIComponentDto.ConcreteDto.Decorator)) ? modifier3 : PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier3, 0.0f, composerStartRestartGroup, (i3 >> 6) & 14, 1);
            composerStartRestartGroup.endReplaceGroup();
            CompositionLocal3.CompositionLocalProvider(compositionLocal6.provides(Boolean.FALSE), ComposableLambda3.rememberComposableLambda(-1630030201, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponentIdlKt.SduiComponent.3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    if ((i6 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1630030201, i6, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponent.<anonymous> (SduiComponentIdl.kt:53)");
                    }
                    UIComponentDto.ConcreteDto concreteDto = component;
                    if (concreteDto instanceof UIComponentDto.ConcreteDto.Button) {
                        composer2.startReplaceGroup(1204042638);
                        SduiButton2.SduiButton(((UIComponentDto.ConcreteDto.Button) component).getValue(), parseAction, modifierM21623defaultHorizontalPaddingrAjV9yQ, composer2, 0, 0);
                        composer2.endReplaceGroup();
                    } else if (concreteDto instanceof UIComponentDto.ConcreteDto.Decorator) {
                        composer2.startReplaceGroup(-1329149338);
                        DecoratorDto value = ((UIComponentDto.ConcreteDto.Decorator) component).getValue();
                        Function1<ActionDto, ActionT> function1 = parseAction;
                        Modifier modifier4 = modifier3;
                        final UIComponentDto.ConcreteDto concreteDto2 = component;
                        final HorizontalPadding horizontalPadding4 = horizontalPadding3;
                        SduiDecoratorIdl.SduiDecorator(value, function1, modifier4, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponentIdlKt.SduiComponent.3.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier5, Composer composer3, Integer num) {
                                return invoke(modifier5, composer3, num.intValue());
                            }

                            public final Modifier invoke(Modifier SduiDecorator, Composer composer3, int i7) {
                                DecoratorDto.ModifiersDto.GutterBehaviorDto gutter_behavior;
                                Intrinsics.checkNotNullParameter(SduiDecorator, "$this$SduiDecorator");
                                composer3.startReplaceGroup(1231642807);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1231642807, i7, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponent.<anonymous>.<anonymous> (SduiComponentIdl.kt:64)");
                                }
                                DecoratorDto.ModifiersDto modifiers = ((UIComponentDto.ConcreteDto.Decorator) concreteDto2).getValue().getModifiers();
                                if ((modifiers == null || (gutter_behavior = modifiers.getGutter_behavior()) == null || !gutter_behavior.getNo_gutter_horizontal()) && horizontalPadding4 != HorizontalPadding.None) {
                                    SduiDecorator = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SduiDecorator, 0.0f, composer3, i7 & 14, 1);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                composer3.endReplaceGroup();
                                return SduiDecorator;
                            }
                        }, composer2, 0, 8);
                        composer2.endReplaceGroup();
                    } else if (concreteDto instanceof UIComponentDto.ConcreteDto.Image) {
                        composer2.startReplaceGroup(1204069474);
                        SduiImage.SduiImage(((UIComponentDto.ConcreteDto.Image) component).getValue(), modifier3, false, composer2, 0, 4);
                        composer2.endReplaceGroup();
                    } else if (concreteDto instanceof UIComponentDto.ConcreteDto.InfoBanner) {
                        composer2.startReplaceGroup(1204073330);
                        SduiInfoBanner2.SduiInfoBanner(((UIComponentDto.ConcreteDto.InfoBanner) component).getValue(), parseAction, modifierM21623defaultHorizontalPaddingrAjV9yQ, composer2, 0, 0);
                        composer2.endReplaceGroup();
                    } else if (concreteDto instanceof UIComponentDto.ConcreteDto.InfoTag) {
                        composer2.startReplaceGroup(1204080559);
                        SduiInfoTag2.SduiInfoTag(((UIComponentDto.ConcreteDto.InfoTag) component).getValue(), parseAction, modifierM21623defaultHorizontalPaddingrAjV9yQ, composer2, 0, 0);
                        composer2.endReplaceGroup();
                    } else if (concreteDto instanceof UIComponentDto.ConcreteDto.NavigationRow) {
                        composer2.startReplaceGroup(1204087931);
                        SduiNavigationRow2.SduiNavigationRow(((UIComponentDto.ConcreteDto.NavigationRow) component).getValue(), parseAction, modifier3, horizontalPadding3, composer2, 0, 0);
                        composer2.endReplaceGroup();
                    } else if (concreteDto instanceof UIComponentDto.ConcreteDto.NumberPog) {
                        composer2.startReplaceGroup(1204096610);
                        NumberPogDto value2 = ((UIComponentDto.ConcreteDto.NumberPog) component).getValue();
                        composer2.startReplaceGroup(1204099292);
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = horizontalPadding3 == HorizontalPadding.Default ? PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer2, 6, 1) : Modifier.INSTANCE;
                        composer2.endReplaceGroup();
                        SduiPog.SduiNumberPog(value2, modifierM21623defaultHorizontalPaddingrAjV9yQ2, composer2, 0, 0);
                        composer2.endReplaceGroup();
                    } else if (concreteDto instanceof UIComponentDto.ConcreteDto.PogWithPictogram) {
                        composer2.startReplaceGroup(1204107717);
                        PogWithPictogramDto value3 = ((UIComponentDto.ConcreteDto.PogWithPictogram) component).getValue();
                        composer2.startReplaceGroup(1204110492);
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ3 = horizontalPadding3 == HorizontalPadding.Default ? PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer2, 6, 1) : Modifier.INSTANCE;
                        composer2.endReplaceGroup();
                        SduiPog.SduiPictogramPog(value3, modifierM21623defaultHorizontalPaddingrAjV9yQ3, composer2, 0, 0);
                        composer2.endReplaceGroup();
                    } else if (concreteDto instanceof UIComponentDto.ConcreteDto.Text) {
                        composer2.startReplaceGroup(1204118369);
                        SduiText2.SduiText(((UIComponentDto.ConcreteDto.Text) component).getValue(), modifierM21623defaultHorizontalPaddingrAjV9yQ, composer2, 0, 0);
                        composer2.endReplaceGroup();
                    } else if (concreteDto instanceof UIComponentDto.ConcreteDto.TextPog) {
                        composer2.startReplaceGroup(1204124192);
                        TextPogDto value4 = ((UIComponentDto.ConcreteDto.TextPog) component).getValue();
                        composer2.startReplaceGroup(1204126812);
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ4 = horizontalPadding3 == HorizontalPadding.Default ? PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer2, 6, 1) : Modifier.INSTANCE;
                        composer2.endReplaceGroup();
                        SduiPog.SduiTextPog(value4, modifierM21623defaultHorizontalPaddingrAjV9yQ4, composer2, 0, 0);
                        composer2.endReplaceGroup();
                    } else if (concreteDto instanceof UIComponentDto.ConcreteDto.VStack) {
                        composer2.startReplaceGroup(1204134874);
                        SduiContainersIdl.SduiWeightedVerticalContainer(((UIComponentDto.ConcreteDto.VStack) component).getValue(), !zBooleanValue, parseAction, modifierM21623defaultHorizontalPaddingrAjV9yQ, composer2, 0, 0);
                        composer2.endReplaceGroup();
                    } else if (concreteDto instanceof UIComponentDto.ConcreteDto.HStack) {
                        composer2.startReplaceGroup(1204144323);
                        SduiContainersIdl.SduiWeightedHorizontalContainer(((UIComponentDto.ConcreteDto.HStack) component).getValue(), parseAction, modifierM21623defaultHorizontalPaddingrAjV9yQ, composer2, 0, 0);
                        composer2.endReplaceGroup();
                    } else if (concreteDto instanceof UIComponentDto.ConcreteDto.ZStack) {
                        composer2.startReplaceGroup(1204152046);
                        SduiZStackIdl.SduiZStack(((UIComponentDto.ConcreteDto.ZStack) component).getValue(), parseAction, modifierM21623defaultHorizontalPaddingrAjV9yQ, composer2, 0, 0);
                        composer2.endReplaceGroup();
                    } else if (concreteDto instanceof UIComponentDto.ConcreteDto.ValuePropWithIcon) {
                        composer2.startReplaceGroup(1204159519);
                        SduiValuePropRowIdl.SduiValueProp(((UIComponentDto.ConcreteDto.ValuePropWithIcon) component).getValue(), parseAction, modifier3, horizontalPadding3, composer2, 0, 0);
                        composer2.endReplaceGroup();
                    } else if (concreteDto instanceof UIComponentDto.ConcreteDto.ValuePropWithNumber) {
                        composer2.startReplaceGroup(1204168577);
                        SduiValuePropRowIdl.SduiValueProp(((UIComponentDto.ConcreteDto.ValuePropWithNumber) component).getValue(), parseAction, modifier3, horizontalPadding3, composer2, 0, 0);
                        composer2.endReplaceGroup();
                    } else if (concreteDto instanceof UIComponentDto.ConcreteDto.ValuePropWithPictogram) {
                        composer2.startReplaceGroup(1204177796);
                        SduiValuePropRowIdl.SduiValueProp(((UIComponentDto.ConcreteDto.ValuePropWithPictogram) component).getValue(), parseAction, modifier3, horizontalPadding3, composer2, 0, 0);
                        composer2.endReplaceGroup();
                    } else if (concreteDto instanceof UIComponentDto.ConcreteDto.Timeline) {
                        composer2.startReplaceGroup(1204186646);
                        SduiTimelineIdl.SduiTimeline(((UIComponentDto.ConcreteDto.Timeline) component).getValue(), parseAction, modifier3, horizontalPadding3, 0, false, composer2, 0, 48);
                        composer2.endReplaceGroup();
                    } else if (concreteDto instanceof UIComponentDto.ConcreteDto.Lottie) {
                        composer2.startReplaceGroup(1204194921);
                        SduiRemoteLottie2.SduiRemoteLottie(((UIComponentDto.ConcreteDto.Lottie) component).getValue(), modifierM21623defaultHorizontalPaddingrAjV9yQ, composer2, 0);
                        composer2.endReplaceGroup();
                    } else if (concreteDto instanceof UIComponentDto.ConcreteDto.IconButton) {
                        composer2.startReplaceGroup(1204201134);
                        IconButtonDto value5 = ((UIComponentDto.ConcreteDto.IconButton) component).getValue();
                        Function1<ActionDto, ActionT> function12 = parseAction;
                        composer2.startReplaceGroup(1204205180);
                        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ5 = horizontalPadding3 == HorizontalPadding.Default ? PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer2, 6, 1) : Modifier.INSTANCE;
                        composer2.endReplaceGroup();
                        SduiIconButtonIdl.SduiIconButton(value5, function12, modifierM21623defaultHorizontalPaddingrAjV9yQ5, composer2, 0, 0);
                        composer2.endReplaceGroup();
                    } else if (concreteDto instanceof UIComponentDto.ConcreteDto.TextButton) {
                        composer2.startReplaceGroup(1204213298);
                        SduiTextButton2.SduiTextButton(((UIComponentDto.ConcreteDto.TextButton) component).getValue(), parseAction, modifierM21623defaultHorizontalPaddingrAjV9yQ, composer2, 0, 0);
                        composer2.endReplaceGroup();
                    } else if (concreteDto instanceof UIComponentDto.ConcreteDto.Spacer) {
                        composer2.startReplaceGroup(1204220402);
                        Spacer2.Spacer(modifierM21623defaultHorizontalPaddingrAjV9yQ, composer2, 0);
                        composer2.endReplaceGroup();
                    } else if (concreteDto instanceof UIComponentDto.ConcreteDto.DataRowStacked) {
                        composer2.startReplaceGroup(1204224924);
                        SduiDataRowIdl.SduiStackedDataRow(((UIComponentDto.ConcreteDto.DataRowStacked) component).getValue(), parseAction, modifier3, horizontalPadding3, composer2, 0, 0);
                        composer2.endReplaceGroup();
                    } else if (concreteDto instanceof UIComponentDto.ConcreteDto.DataRowCondensed) {
                        composer2.startReplaceGroup(1204233790);
                        SduiDataRowIdl.SduiCondensedDataRow(((UIComponentDto.ConcreteDto.DataRowCondensed) component).getValue(), parseAction, modifier3, horizontalPadding3, composer2, 0, 0);
                        composer2.endReplaceGroup();
                    } else if (concreteDto instanceof UIComponentDto.ConcreteDto.Card) {
                        composer2.startReplaceGroup(1204242292);
                        SduiElevatedCardIdl.SduiElevatedCard(((UIComponentDto.ConcreteDto.Card) component).getValue(), parseAction, modifierM21623defaultHorizontalPaddingrAjV9yQ, composer2, 0, 0);
                        composer2.endReplaceGroup();
                    } else if (concreteDto instanceof UIComponentDto.ConcreteDto.Checkbox) {
                        composer2.startReplaceGroup(1204249573);
                        SduiCheckboxIdl.SduiCheckbox(((UIComponentDto.ConcreteDto.Checkbox) component).getValue(), modifierM21623defaultHorizontalPaddingrAjV9yQ, composer2, 0, 0);
                        composer2.endReplaceGroup();
                    } else if (concreteDto instanceof UIComponentDto.ConcreteDto.TextInput) {
                        composer2.startReplaceGroup(1204255430);
                        SduiTextInputIdl.SduiTextInput(((UIComponentDto.ConcreteDto.TextInput) component).getValue(), modifierM21623defaultHorizontalPaddingrAjV9yQ, composer2, 0, 0);
                        composer2.endReplaceGroup();
                    } else if (concreteDto instanceof UIComponentDto.ConcreteDto.ThemedComponent) {
                        composer2.startReplaceGroup(1204261505);
                        SduiThemedComponentIdl.SduiThemedComponent(((UIComponentDto.ConcreteDto.ThemedComponent) component).getValue(), parseAction, composer2, 0);
                        composer2.endReplaceGroup();
                    } else if (concreteDto instanceof UIComponentDto.ConcreteDto.ShimmerLoader) {
                        composer2.startReplaceGroup(1204267413);
                        SduiShimmerLoaderIdl.SduiShimmerLoader(((UIComponentDto.ConcreteDto.ShimmerLoader) component).getValue(), parseAction, modifierM21623defaultHorizontalPaddingrAjV9yQ, composer2, 0, 0);
                        composer2.endReplaceGroup();
                    } else if (concreteDto instanceof UIComponentDto.ConcreteDto.MarginTieredInterestRates) {
                        composer2.startReplaceGroup(1204275316);
                        SduiDaggerComponentIdl.SduiDaggerComponentIdl(component, parseAction, modifierM21623defaultHorizontalPaddingrAjV9yQ, null, composer2, 0, 8);
                        composer2.endReplaceGroup();
                    } else if (concreteDto instanceof UIComponentDto.ConcreteDto.TableColumnHeader) {
                        composer2.startReplaceGroup(1204282883);
                        SduiTableColumnHeaderIdl.SduiTableColumnHeader(((UIComponentDto.ConcreteDto.TableColumnHeader) component).getValue(), parseAction, null, composer2, 0, 4);
                        composer2.endReplaceGroup();
                    } else if (concreteDto instanceof UIComponentDto.ConcreteDto.ChartGroup) {
                        composer2.startReplaceGroup(1204288701);
                        SduiDaggerComponentIdl.SduiDaggerComponentIdl(component, parseAction, null, null, composer2, 0, 12);
                        composer2.endReplaceGroup();
                    } else if (concreteDto instanceof UIComponentDto.ConcreteDto.TableInstrumentName) {
                        composer2.startReplaceGroup(1204294589);
                        SduiTableInstrumentNameIdl.SduiTableInstrumentNameIdl(((UIComponentDto.ConcreteDto.TableInstrumentName) component).getValue(), null, composer2, 0, 2);
                        composer2.endReplaceGroup();
                    } else if (concreteDto instanceof UIComponentDto.ConcreteDto.TickerText) {
                        composer2.startReplaceGroup(1204299239);
                        SduiTickerText.SduiTickerText(((UIComponentDto.ConcreteDto.TickerText) component).getValue(), modifierM21623defaultHorizontalPaddingrAjV9yQ, composer2, 0, 0);
                        composer2.endReplaceGroup();
                    } else if (concreteDto instanceof UIComponentDto.ConcreteDto.FlagIcon) {
                        composer2.startReplaceGroup(1204305125);
                        SduiFlagIcon.SduiFlagIcon(((UIComponentDto.ConcreteDto.FlagIcon) component).getValue(), modifierM21623defaultHorizontalPaddingrAjV9yQ, composer2, 0, 0);
                        composer2.endReplaceGroup();
                    } else if (concreteDto instanceof UIComponentDto.ConcreteDto.AnimatedRevealText) {
                        composer2.startReplaceGroup(1204311279);
                        SduiAnimatedRevealText.SduiAnimatedRevealText(((UIComponentDto.ConcreteDto.AnimatedRevealText) component).getValue(), modifierM21623defaultHorizontalPaddingrAjV9yQ, composer2, 0, 0);
                        composer2.endReplaceGroup();
                    } else if (concreteDto instanceof UIComponentDto.ConcreteDto.AnimatedAppearance) {
                        composer2.startReplaceGroup(1204317786);
                        SduiAnimatedAppearance.SduiAnimatedAppearance(((UIComponentDto.ConcreteDto.AnimatedAppearance) component).getValue(), parseAction, modifierM21623defaultHorizontalPaddingrAjV9yQ, composer2, 0, 0);
                        composer2.endReplaceGroup();
                    } else if (concreteDto instanceof UIComponentDto.ConcreteDto.VideoPlayer) {
                        composer2.startReplaceGroup(1204325352);
                        SduiVideoPlayer.SduiVideoPlayer(((UIComponentDto.ConcreteDto.VideoPlayer) component).getValue(), modifierM21623defaultHorizontalPaddingrAjV9yQ, composer2, 0, 0);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(1204330095);
                        UtilKt.ComponentNotFound(component, (Modifier) null, composer2, 0, 2);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            horizontalPadding2 = horizontalPadding3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            horizontalPadding2 = horizontalPadding;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponentIdlKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiComponentIdl.SduiComponent$lambda$3(component, parseAction, modifier2, horizontalPadding2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
