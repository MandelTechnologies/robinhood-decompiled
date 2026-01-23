package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.gold.sparkle.compose.GoldSparkleBrush;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler2;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.util.AppearanceUtil;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.BorderDto;
import rh_server_driven_ui.p531v1.DecoratorDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: SduiDecoratorIdl.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ab\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0016\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\b\nH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u0010\u001a\u00020\u0006*\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0013\u001a\u00020\u0006*\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0015\u001a\u00020\u0006*\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0014¨\u0006\u0018²\u0006\u000e\u0010\u0017\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"ActionT", "Lrh_server_driven_ui/v1/DecoratorDto;", "component", "Lkotlin/Function1;", "Lrh_server_driven_ui/v1/ActionDto;", "parseAction", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;", "horizontalPadding", "Lkotlin/ExtensionFunctionType;", "composeOuterModifier", "", "SduiDecorator", "(Lrh_server_driven_ui/v1/DecoratorDto;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto;", "sizing", "(Landroidx/compose/ui/Modifier;Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto;)Landroidx/compose/ui/Modifier;", "Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto;", "horizontalSizing", "(Landroidx/compose/ui/Modifier;Lrh_server_driven_ui/v1/DecoratorDto$ModifiersDto$SizingDto$SizingPreferenceDto;)Landroidx/compose/ui/Modifier;", "verticalSizing", "Landroidx/compose/ui/geometry/Offset;", "positionInWindow", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecoratorIdlKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiDecoratorIdl {

    /* compiled from: SduiDecoratorIdl.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecoratorIdlKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DecoratorDto.ModifiersDto.BackgroundGradientDto.GradientDirectionDto.values().length];
            try {
                iArr[DecoratorDto.ModifiersDto.BackgroundGradientDto.GradientDirectionDto.DIRECTION_VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DecoratorDto.ModifiersDto.BackgroundGradientDto.GradientDirectionDto.DIRECTION_HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DecoratorDto.ModifiersDto.BackgroundGradientDto.GradientDirectionDto.DIRECTION_UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiDecorator$lambda$0(DecoratorDto decoratorDto, Function1 function1, Modifier modifier, HorizontalPadding horizontalPadding, Function3 function3, int i, int i2, Composer composer, int i3) {
        SduiDecorator(decoratorDto, function1, modifier, horizontalPadding, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiDecorator$lambda$15(DecoratorDto decoratorDto, Function1 function1, Modifier modifier, HorizontalPadding horizontalPadding, Function3 function3, int i, int i2, Composer composer, int i3) {
        SduiDecorator(decoratorDto, function1, modifier, horizontalPadding, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:256:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:257:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT> void SduiDecorator(final DecoratorDto component, final Function1<? super ActionDto, ? extends ActionT> parseAction, Modifier modifier, HorizontalPadding horizontalPadding, final Function3<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> composeOuterModifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        Modifier modifier3;
        HorizontalPadding horizontalPadding2;
        UIComponentDto component2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final UIComponentDto.ConcreteDto concrete;
        UserInteractionEventData.Action actionFromValue;
        Component.ComponentType componentTypeFromValue;
        UserInteractionEventDescriptor userInteractionEventDescriptorCopy$default;
        UserInteractionEventDescriptor userInteractionEventDescriptor;
        ActionDto actionDto;
        ActionDto actionDto2;
        SduiActionHandler sduiActionHandler;
        DtoActionHandler dtoActionHandler;
        EventLogger eventLogger;
        Composer composer2;
        int i6;
        int i7;
        Brush brushM6683verticalGradient8A3gB4$default;
        BorderDto borderDto;
        int i8;
        Composer composer3;
        LocalDecoratorOverride localDecoratorOverride;
        BorderDto borderDto2;
        UserInteractionEventDescriptor userInteractionEventDescriptor2;
        boolean z;
        boolean z2;
        int i9;
        int i10;
        final SduiActionHandler sduiActionHandler2;
        final DtoActionHandler dtoActionHandler2;
        final Function1<? super ActionDto, ? extends ActionT> function1;
        Modifier modifierOnAppear;
        Object objM4886BorderStrokecXLIe8U;
        final Modifier modifier4;
        final HorizontalPadding horizontalPadding3;
        Composer composer4;
        Float alpha;
        Object sduiDecoratorIdl2;
        Unit unit;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(parseAction, "parseAction");
        Intrinsics.checkNotNullParameter(composeOuterModifier, "composeOuterModifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(54275965);
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
        int i11 = i2 & 4;
        if (i11 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(horizontalPadding == null ? -1 : horizontalPadding.ordinal()) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(composeOuterModifier) ? 16384 : 8192;
            }
            i5 = i3;
            if ((i5 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i11 == 0 ? Modifier.INSTANCE : modifier2;
                horizontalPadding2 = i4 == 0 ? HorizontalPadding.None : horizontalPadding;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(54275965, i5, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecorator (SduiDecoratorIdl.kt:57)");
                }
                component2 = component.getComponent();
                if (component2 != null || (concrete = component2.getConcrete()) == null) {
                    final Modifier modifier5 = modifier3;
                    final HorizontalPadding horizontalPadding4 = horizontalPadding2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecoratorIdlKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return SduiDecoratorIdl.SduiDecorator$lambda$0(component, parseAction, modifier5, horizontalPadding4, composeOuterModifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                DecoratorDto.ModifiersDto modifiers = component.getModifiers();
                ThemedColorDto background_color = modifiers != null ? modifiers.getBackground_color() : null;
                composerStartRestartGroup.startReplaceGroup(619607789);
                Color composeColor = background_color == null ? null : SduiColors2.toComposeColor(background_color, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                long value = composeColor != null ? composeColor.getValue() : Color.INSTANCE.m6725getTransparent0d7_KjU();
                DecoratorDto.ModifiersDto modifiers2 = component.getModifiers();
                ActionDto on_tap_action = modifiers2 != null ? modifiers2.getOn_tap_action() : null;
                DecoratorDto.ModifiersDto modifiers3 = component.getModifiers();
                ActionDto on_will_appear = modifiers3 != null ? modifiers3.getOn_will_appear() : null;
                SduiActionHandler sduiActionHandlerCurrentActionHandler = SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0);
                DtoActionHandler dtoActionHandlerCurrentDtoActionHandler = DtoActionHandler2.currentDtoActionHandler(composerStartRestartGroup, 0);
                EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                DecoratorDto.ModifiersDto modifiers4 = component.getModifiers();
                DecoratorDto.ModifiersDto.AnalyticsEventDescriptorDto analytics_event_descriptor = modifiers4 != null ? modifiers4.getAnalytics_event_descriptor() : null;
                composerStartRestartGroup.startReplaceGroup(619620962);
                if (analytics_event_descriptor == null) {
                    userInteractionEventDescriptor = null;
                } else {
                    String component_identifier = analytics_event_descriptor.getComponent_identifier();
                    composerStartRestartGroup.startReplaceGroup(619622847);
                    if (component_identifier == null) {
                        userInteractionEventDescriptorCopy$default = null;
                    } else {
                        UserInteractionEventDescriptor userInteractionEventDescriptor3 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                        Integer action = analytics_event_descriptor.getAction();
                        if (action == null || (actionFromValue = UserInteractionEventData.Action.INSTANCE.fromValue(action.intValue())) == null) {
                            actionFromValue = UserInteractionEventData.Action.ACTION_UNSPECIFIED;
                        }
                        UserInteractionEventData.Action action2 = actionFromValue;
                        Integer component_type = analytics_event_descriptor.getComponent_type();
                        if (component_type == null || (componentTypeFromValue = Component.ComponentType.INSTANCE.fromValue(component_type.intValue())) == null) {
                            componentTypeFromValue = Component.ComponentType.COMPONENT_TYPE_UNSPECIFIED;
                        }
                        userInteractionEventDescriptorCopy$default = UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor3, null, null, action2, null, new Component(componentTypeFromValue, component_identifier, null, 4, null), null, 43, null);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    userInteractionEventDescriptor = userInteractionEventDescriptorCopy$default;
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierInvoke = composeOuterModifier.invoke(Modifier.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i5 >> 9) & 112) | 6));
                DecoratorDto.ModifiersDto modifiers5 = component.getModifiers();
                DecoratorDto.ModifiersDto.BackgroundGradientDto background_gradient = modifiers5 != null ? modifiers5.getBackground_gradient() : null;
                composerStartRestartGroup.startReplaceGroup(619644748);
                if (background_gradient == null) {
                    actionDto = on_tap_action;
                    actionDto2 = on_will_appear;
                    sduiActionHandler = sduiActionHandlerCurrentActionHandler;
                    dtoActionHandler = dtoActionHandlerCurrentDtoActionHandler;
                    eventLogger = current;
                    composer2 = composerStartRestartGroup;
                    i7 = 0;
                    i6 = 1;
                } else {
                    List<DecoratorDto.ModifiersDto.BackgroundGradientDto.GradientStopDto> stops = background_gradient.getStops();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(stops, 10));
                    for (DecoratorDto.ModifiersDto.BackgroundGradientDto.GradientStopDto gradientStopDto : stops) {
                        SduiActionHandler sduiActionHandler3 = sduiActionHandlerCurrentActionHandler;
                        Composer composer5 = composerStartRestartGroup;
                        arrayList.add(Tuples4.m3642to(Float.valueOf(gradientStopDto.getPosition()), Color.m6701boximpl(Color.m6705copywmQWz5c$default(SduiColors2.m18897toComposeColorDefaultediJQMabo(gradientStopDto.getColor(), 0L, composer5, 0, 1), gradientStopDto.getOpacity(), 0.0f, 0.0f, 0.0f, 14, null))));
                        composerStartRestartGroup = composer5;
                        on_tap_action = on_tap_action;
                        on_will_appear = on_will_appear;
                        sduiActionHandlerCurrentActionHandler = sduiActionHandler3;
                        dtoActionHandlerCurrentDtoActionHandler = dtoActionHandlerCurrentDtoActionHandler;
                        current = current;
                    }
                    actionDto = on_tap_action;
                    actionDto2 = on_will_appear;
                    sduiActionHandler = sduiActionHandlerCurrentActionHandler;
                    dtoActionHandler = dtoActionHandlerCurrentDtoActionHandler;
                    eventLogger = current;
                    composer2 = composerStartRestartGroup;
                    int i12 = WhenMappings.$EnumSwitchMapping$0[background_gradient.getDirection().ordinal()];
                    i6 = 1;
                    if (i12 == 1) {
                        Brush.Companion companion = Brush.INSTANCE;
                        i7 = 0;
                        Tuples2[] tuples2Arr = (Tuples2[]) arrayList.toArray(new Tuples2[0]);
                        brushM6683verticalGradient8A3gB4$default = Brush.Companion.m6683verticalGradient8A3gB4$default(companion, (Tuples2[]) Arrays.copyOf(tuples2Arr, tuples2Arr.length), 0.0f, 0.0f, 0, 14, (Object) null);
                    } else {
                        if (i12 != 2 && i12 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Brush.Companion companion2 = Brush.INSTANCE;
                        Tuples2[] tuples2Arr2 = (Tuples2[]) arrayList.toArray(new Tuples2[0]);
                        brushM6683verticalGradient8A3gB4$default = Brush.Companion.m6677horizontalGradient8A3gB4$default(companion2, (Tuples2[]) Arrays.copyOf(tuples2Arr2, tuples2Arr2.length), 0.0f, 0.0f, 0, 14, (Object) null);
                        i7 = 0;
                    }
                    modifierInvoke = Background3.background$default(modifierInvoke, brushM6683verticalGradient8A3gB4$default, null, 0.0f, 6, null);
                }
                Modifier modifierBackground$default = modifierInvoke;
                composer2.endReplaceGroup();
                int i13 = ((concrete instanceof UIComponentDto.ConcreteDto.Text) || (concrete instanceof UIComponentDto.ConcreteDto.Button)) ? i6 : i7;
                DecoratorDto.ModifiersDto modifiers6 = component.getModifiers();
                int i14 = ((modifiers6 != null ? modifiers6.getGold_shimmer() : null) == null || i13 != 0) ? i7 : i6;
                DecoratorDto.ModifiersDto modifiers7 = component.getModifiers();
                LocalDecoratorOverride localDecoratorOverride2 = new LocalDecoratorOverride(((modifiers7 != null ? modifiers7.getGold_shimmer() : null) == null || i13 == 0) ? i7 : i6);
                RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(component.getModifiers() != null ? r7.getCorner_radius() : i7));
                composer2.startReplaceGroup(1849434622);
                Object objRememberedValue = composer2.rememberedValue();
                Composer.Companion companion3 = Composer.INSTANCE;
                if (objRememberedValue == companion3.getEmpty()) {
                    borderDto = null;
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32))), null, 2, null);
                    composer2.updateRememberedValue(objRememberedValue);
                } else {
                    borderDto = null;
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(619692249);
                if (i14 != 0) {
                    composer2.startReplaceGroup(5004770);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (objRememberedValue2 == companion3.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecoratorIdlKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SduiDecoratorIdl.SduiDecorator$lambda$9$lambda$8(snapshotState, (LayoutCoordinates) obj);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(modifierBackground$default, (Function1) objRememberedValue2);
                    Brush.Companion companion4 = Brush.INSTANCE;
                    long jSduiDecorator$lambda$6 = SduiDecorator$lambda$6(snapshotState);
                    localDecoratorOverride = localDecoratorOverride2;
                    composer3 = composer2;
                    z2 = true;
                    borderDto2 = borderDto;
                    userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                    i8 = 32;
                    i9 = i5;
                    z = false;
                    modifierBackground$default = Background3.background$default(modifierOnGloballyPositioned, GoldSparkleBrush.m15094sparkleEPk0efs(companion4, jSduiDecorator$lambda$6, null, composer3, 6, 2), roundedCornerShapeM5327RoundedCornerShape0680j_4, 0.0f, 4, null);
                } else {
                    i8 = 32;
                    composer3 = composer2;
                    localDecoratorOverride = localDecoratorOverride2;
                    borderDto2 = borderDto;
                    userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                    z = false;
                    z2 = true;
                    i9 = i5;
                }
                Modifier modifierPointerInput = modifierBackground$default;
                composer3.endReplaceGroup();
                composer3.startReplaceGroup(619709837);
                ActionDto actionDto3 = actionDto;
                if (actionDto3 != null) {
                    Unit unit2 = Unit.INSTANCE;
                    composer3.startReplaceGroup(-1224400529);
                    boolean z3 = (i9 & 112) == i8 ? z2 : z;
                    SduiActionHandler sduiActionHandler4 = sduiActionHandler;
                    dtoActionHandler2 = dtoActionHandler;
                    EventLogger eventLogger2 = eventLogger;
                    boolean zChangedInstance = z3 | composer3.changedInstance(actionDto3) | composer3.changedInstance(sduiActionHandler4) | composer3.changedInstance(dtoActionHandler2) | composer3.changedInstance(userInteractionEventDescriptor2) | composer3.changedInstance(eventLogger2);
                    Object objRememberedValue3 = composer3.rememberedValue();
                    if (zChangedInstance || objRememberedValue3 == companion3.getEmpty()) {
                        unit = unit2;
                        sduiActionHandler2 = sduiActionHandler4;
                        i10 = 32;
                        function1 = parseAction;
                        sduiDecoratorIdl2 = new SduiDecoratorIdl2(function1, actionDto3, sduiActionHandler2, dtoActionHandler2, userInteractionEventDescriptor2, eventLogger2);
                        dtoActionHandler2 = dtoActionHandler2;
                        composer3.updateRememberedValue(sduiDecoratorIdl2);
                    } else {
                        function1 = parseAction;
                        sduiDecoratorIdl2 = objRememberedValue3;
                        unit = unit2;
                        sduiActionHandler2 = sduiActionHandler4;
                        i10 = 32;
                    }
                    composer3.endReplaceGroup();
                    modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifierPointerInput, unit, (PointerInputEventHandler) sduiDecoratorIdl2);
                } else {
                    i10 = i8;
                    sduiActionHandler2 = sduiActionHandler;
                    dtoActionHandler2 = dtoActionHandler;
                    function1 = parseAction;
                }
                composer3.endReplaceGroup();
                composer3.startReplaceGroup(619739637);
                final ActionDto actionDto4 = actionDto2;
                if (actionDto4 != null) {
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    composer3.startReplaceGroup(-1224400529);
                    boolean zChangedInstance2 = ((i9 & 112) == i10) | composer3.changedInstance(actionDto4) | composer3.changedInstance(sduiActionHandler2) | composer3.changedInstance(dtoActionHandler2);
                    Object objRememberedValue4 = composer3.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue4 == companion3.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecoratorIdlKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SduiDecoratorIdl.SduiDecorator$lambda$12$lambda$11(function1, actionDto4, sduiActionHandler2, dtoActionHandler2);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue4);
                    }
                    composer3.endReplaceGroup();
                    modifierOnAppear = AppearanceUtil.onAppear(companion5, (Function0) objRememberedValue4);
                } else {
                    modifierOnAppear = Modifier.INSTANCE;
                }
                composer3.endReplaceGroup();
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierPointerInput.then(modifierOnAppear), userInteractionEventDescriptor2, true, false, false, false, false, null, 108, null);
                DecoratorDto.ModifiersDto modifiers8 = component.getModifiers();
                Modifier modifierAlpha = Alpha.alpha(modifierAutoLogEvents$default, (modifiers8 == null || (alpha = modifiers8.getAlpha()) == null) ? 1.0f : alpha.floatValue());
                DecoratorDto.ModifiersDto modifiers9 = component.getModifiers();
                BorderDto border = modifiers9 != null ? modifiers9.getBorder() : borderDto2;
                composer3.startReplaceGroup(619762269);
                if (border == null) {
                    objM4886BorderStrokecXLIe8U = borderDto2;
                    composer3.endReplaceGroup();
                    final Modifier modifier6 = modifier3;
                    final HorizontalPadding horizontalPadding5 = horizontalPadding2;
                    final LocalDecoratorOverride localDecoratorOverride3 = localDecoratorOverride;
                    modifier4 = modifier6;
                    horizontalPadding3 = horizontalPadding5;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1229745944, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecoratorIdlKt.SduiDecorator.4
                        public final void invoke(Composer composer6, int i15) {
                            DecoratorDto.ModifiersDto.InsetsDto insets;
                            DecoratorDto.ModifiersDto.InsetsDto insets2;
                            DecoratorDto.ModifiersDto.InsetsDto insets3;
                            DecoratorDto.ModifiersDto.InsetsDto insets4;
                            if ((i15 & 3) == 2 && composer6.getSkipping()) {
                                composer6.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1229745944, i15, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecorator.<anonymous> (SduiDecoratorIdl.kt:172)");
                            }
                            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, TestTags.sduiDecoratorBoxContainer);
                            DecoratorDto.ModifiersDto modifiers10 = component.getModifiers();
                            float fM7995constructorimpl = C2002Dp.m7995constructorimpl((modifiers10 == null || (insets4 = modifiers10.getInsets()) == null) ? 0 : insets4.getLeft());
                            DecoratorDto.ModifiersDto modifiers11 = component.getModifiers();
                            float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl((modifiers11 == null || (insets3 = modifiers11.getInsets()) == null) ? 0 : insets3.getRight());
                            DecoratorDto.ModifiersDto modifiers12 = component.getModifiers();
                            float fM7995constructorimpl3 = C2002Dp.m7995constructorimpl((modifiers12 == null || (insets2 = modifiers12.getInsets()) == null) ? 0 : insets2.getTop());
                            DecoratorDto.ModifiersDto modifiers13 = component.getModifiers();
                            Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(modifierTestTag, fM7995constructorimpl, fM7995constructorimpl3, fM7995constructorimpl2, C2002Dp.m7995constructorimpl((modifiers13 == null || (insets = modifiers13.getInsets()) == null) ? 0 : insets.getBottom()));
                            DecoratorDto.ModifiersDto modifiers14 = component.getModifiers();
                            Modifier modifierSizing = SduiDecoratorIdl.sizing(modifierM5145paddingqDBjuR0, modifiers14 != null ? modifiers14.getSizing() : null);
                            DecoratorDto.ModifiersDto modifiers15 = component.getModifiers();
                            Modifier modifierTrackPosition = com.robinhood.android.libdesignsystem.serverui.experimental.position.ModifiersKt.trackPosition(modifierSizing, modifiers15 != null ? modifiers15.getIdentifier() : null);
                            final LocalDecoratorOverride localDecoratorOverride4 = localDecoratorOverride3;
                            final UIComponentDto.ConcreteDto concreteDto = concrete;
                            final Function1<ActionDto, ActionT> function12 = parseAction;
                            final Modifier modifier7 = modifier6;
                            final DecoratorDto decoratorDto = component;
                            final HorizontalPadding horizontalPadding6 = horizontalPadding5;
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer6, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer6.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer6, modifierTrackPosition);
                            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion6.getConstructor();
                            if (composer6.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer6.startReusableNode();
                            if (composer6.getInserting()) {
                                composer6.createNode(constructor);
                            } else {
                                composer6.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer6);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion6.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion6.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion6.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion6.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            UtilKt.NoHorizontalPadding(ComposableLambda3.rememberComposableLambda(223655953, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecoratorIdlKt$SduiDecorator$4$1$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                    invoke(composer7, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer7, int i16) {
                                    if ((i16 & 3) == 2 && composer7.getSkipping()) {
                                        composer7.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(223655953, i16, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecorator.<anonymous>.<anonymous>.<anonymous> (SduiDecoratorIdl.kt:185)");
                                    }
                                    ProvidedValue<LocalDecoratorOverride> providedValueProvides = SduiDecoratorKt.getLocalSduiDecoratorModifiers().provides(localDecoratorOverride4);
                                    final UIComponentDto.ConcreteDto concreteDto2 = concreteDto;
                                    final Function1<ActionDto, ActionT> function13 = function12;
                                    final Modifier modifier8 = modifier7;
                                    final DecoratorDto decoratorDto2 = decoratorDto;
                                    final HorizontalPadding horizontalPadding7 = horizontalPadding6;
                                    CompositionLocal3.CompositionLocalProvider(providedValueProvides, ComposableLambda3.rememberComposableLambda(259140817, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecoratorIdlKt$SduiDecorator$4$1$1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer8, Integer num) {
                                            invoke(composer8, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer8, int i17) {
                                            if ((i17 & 3) == 2 && composer8.getSkipping()) {
                                                composer8.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(259140817, i17, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecorator.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SduiDecoratorIdl.kt:186)");
                                            }
                                            UIComponentDto.ConcreteDto concreteDto3 = concreteDto2;
                                            Function1<ActionDto, ActionT> function14 = function13;
                                            Modifier modifierTestTag2 = TestTag3.testTag(modifier8, TestTags.sduiComponent);
                                            DecoratorDto.ModifiersDto modifiers16 = decoratorDto2.getModifiers();
                                            SduiComponentIdl.SduiComponent(concreteDto3, function14, SduiDecoratorIdl.sizing(modifierTestTag2, modifiers16 != null ? modifiers16.getSizing() : null), horizontalPadding7, composer8, 0, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer7, 54), composer7, ProvidedValue.$stable | 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer6, 54), composer6, 6);
                            composer6.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                            invoke(composer6, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composer3, 54);
                    composer4 = composer3;
                    SurfaceKt.m5967SurfaceT9BRK9s(modifierAlpha, roundedCornerShapeM5327RoundedCornerShape0680j_4, value, value, 0.0f, 0.0f, objM4886BorderStrokecXLIe8U, composableLambdaRememberComposableLambda, composer4, 12582912, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    ThemedColorDto color = border.getColor();
                    composer3.startReplaceGroup(619763437);
                    Color composeColor2 = color == null ? borderDto2 : SduiColors2.toComposeColor(color, composer3, 0);
                    composer3.endReplaceGroup();
                    if (composeColor2 != 0) {
                        long value2 = composeColor2.getValue();
                        Double width = border.getWidth();
                        objM4886BorderStrokecXLIe8U = BorderStroke2.m4886BorderStrokecXLIe8U(C2002Dp.m7995constructorimpl((float) (width != null ? width.doubleValue() : 1.0d)), value2);
                    }
                    composer3.endReplaceGroup();
                    final Modifier modifier62 = modifier3;
                    final HorizontalPadding horizontalPadding52 = horizontalPadding2;
                    final LocalDecoratorOverride localDecoratorOverride32 = localDecoratorOverride;
                    modifier4 = modifier62;
                    horizontalPadding3 = horizontalPadding52;
                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(1229745944, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecoratorIdlKt.SduiDecorator.4
                        public final void invoke(Composer composer6, int i15) {
                            DecoratorDto.ModifiersDto.InsetsDto insets;
                            DecoratorDto.ModifiersDto.InsetsDto insets2;
                            DecoratorDto.ModifiersDto.InsetsDto insets3;
                            DecoratorDto.ModifiersDto.InsetsDto insets4;
                            if ((i15 & 3) == 2 && composer6.getSkipping()) {
                                composer6.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1229745944, i15, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecorator.<anonymous> (SduiDecoratorIdl.kt:172)");
                            }
                            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, TestTags.sduiDecoratorBoxContainer);
                            DecoratorDto.ModifiersDto modifiers10 = component.getModifiers();
                            float fM7995constructorimpl = C2002Dp.m7995constructorimpl((modifiers10 == null || (insets4 = modifiers10.getInsets()) == null) ? 0 : insets4.getLeft());
                            DecoratorDto.ModifiersDto modifiers11 = component.getModifiers();
                            float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl((modifiers11 == null || (insets3 = modifiers11.getInsets()) == null) ? 0 : insets3.getRight());
                            DecoratorDto.ModifiersDto modifiers12 = component.getModifiers();
                            float fM7995constructorimpl3 = C2002Dp.m7995constructorimpl((modifiers12 == null || (insets2 = modifiers12.getInsets()) == null) ? 0 : insets2.getTop());
                            DecoratorDto.ModifiersDto modifiers13 = component.getModifiers();
                            Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(modifierTestTag, fM7995constructorimpl, fM7995constructorimpl3, fM7995constructorimpl2, C2002Dp.m7995constructorimpl((modifiers13 == null || (insets = modifiers13.getInsets()) == null) ? 0 : insets.getBottom()));
                            DecoratorDto.ModifiersDto modifiers14 = component.getModifiers();
                            Modifier modifierSizing = SduiDecoratorIdl.sizing(modifierM5145paddingqDBjuR0, modifiers14 != null ? modifiers14.getSizing() : null);
                            DecoratorDto.ModifiersDto modifiers15 = component.getModifiers();
                            Modifier modifierTrackPosition = com.robinhood.android.libdesignsystem.serverui.experimental.position.ModifiersKt.trackPosition(modifierSizing, modifiers15 != null ? modifiers15.getIdentifier() : null);
                            final LocalDecoratorOverride localDecoratorOverride4 = localDecoratorOverride32;
                            final UIComponentDto.ConcreteDto concreteDto = concrete;
                            final Function1<? super ActionDto, ? extends ActionT> function12 = parseAction;
                            final Modifier modifier7 = modifier62;
                            final DecoratorDto decoratorDto = component;
                            final HorizontalPadding horizontalPadding6 = horizontalPadding52;
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer6, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer6.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer6, modifierTrackPosition);
                            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion6.getConstructor();
                            if (composer6.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer6.startReusableNode();
                            if (composer6.getInserting()) {
                                composer6.createNode(constructor);
                            } else {
                                composer6.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer6);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion6.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion6.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion6.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion6.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            UtilKt.NoHorizontalPadding(ComposableLambda3.rememberComposableLambda(223655953, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecoratorIdlKt$SduiDecorator$4$1$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                    invoke(composer7, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer7, int i16) {
                                    if ((i16 & 3) == 2 && composer7.getSkipping()) {
                                        composer7.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(223655953, i16, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecorator.<anonymous>.<anonymous>.<anonymous> (SduiDecoratorIdl.kt:185)");
                                    }
                                    ProvidedValue<LocalDecoratorOverride> providedValueProvides = SduiDecoratorKt.getLocalSduiDecoratorModifiers().provides(localDecoratorOverride4);
                                    final UIComponentDto.ConcreteDto concreteDto2 = concreteDto;
                                    final Function1<? super ActionDto, ? extends ActionT> function13 = function12;
                                    final Modifier modifier8 = modifier7;
                                    final DecoratorDto decoratorDto2 = decoratorDto;
                                    final HorizontalPadding horizontalPadding7 = horizontalPadding6;
                                    CompositionLocal3.CompositionLocalProvider(providedValueProvides, ComposableLambda3.rememberComposableLambda(259140817, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecoratorIdlKt$SduiDecorator$4$1$1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer8, Integer num) {
                                            invoke(composer8, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer8, int i17) {
                                            if ((i17 & 3) == 2 && composer8.getSkipping()) {
                                                composer8.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(259140817, i17, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecorator.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SduiDecoratorIdl.kt:186)");
                                            }
                                            UIComponentDto.ConcreteDto concreteDto3 = concreteDto2;
                                            Function1<ActionDto, ActionT> function14 = function13;
                                            Modifier modifierTestTag2 = TestTag3.testTag(modifier8, TestTags.sduiComponent);
                                            DecoratorDto.ModifiersDto modifiers16 = decoratorDto2.getModifiers();
                                            SduiComponentIdl.SduiComponent(concreteDto3, function14, SduiDecoratorIdl.sizing(modifierTestTag2, modifiers16 != null ? modifiers16.getSizing() : null), horizontalPadding7, composer8, 0, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer7, 54), composer7, ProvidedValue.$stable | 48);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer6, 54), composer6, 6);
                            composer6.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                            invoke(composer6, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composer3, 54);
                    composer4 = composer3;
                    SurfaceKt.m5967SurfaceT9BRK9s(modifierAlpha, roundedCornerShapeM5327RoundedCornerShape0680j_4, value, value, 0.0f, 0.0f, objM4886BorderStrokecXLIe8U, composableLambdaRememberComposableLambda2, composer4, 12582912, 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                horizontalPadding3 = horizontalPadding;
                modifier4 = modifier2;
                composer4 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup2 = composer4.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup2 == null) {
                scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecoratorIdlKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiDecoratorIdl.SduiDecorator$lambda$15(component, parseAction, modifier4, horizontalPadding3, composeOuterModifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        i5 = i3;
        if ((i5 & 9363) == 9362) {
            if (i11 == 0) {
            }
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            component2 = component.getComponent();
            if (component2 != null) {
            }
            final Modifier modifier52 = modifier3;
            final HorizontalPadding horizontalPadding42 = horizontalPadding2;
            if (ComposerKt.isTraceInProgress()) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        scopeUpdateScopeEndRestartGroup2 = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
        }
    }

    private static final long SduiDecorator$lambda$6(SnapshotState<Offset> snapshotState) {
        return snapshotState.getValue().getPackedValue();
    }

    private static final void SduiDecorator$lambda$7(SnapshotState<Offset> snapshotState, long j) {
        snapshotState.setValue(Offset.m6534boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiDecorator$lambda$9$lambda$8(SnapshotState snapshotState, LayoutCoordinates layoutCoords) {
        Intrinsics.checkNotNullParameter(layoutCoords, "layoutCoords");
        SduiDecorator$lambda$7(snapshotState, LayoutCoordinates2.positionInWindow(layoutCoords));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiDecorator$lambda$12$lambda$11(Function1 function1, ActionDto actionDto, SduiActionHandler sduiActionHandler, DtoActionHandler dtoActionHandler) {
        Object objInvoke = function1.invoke(actionDto);
        if (objInvoke != null) {
            SduiActionHandler3.handling(objInvoke, sduiActionHandler, dtoActionHandler).invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier sizing(Modifier modifier, DecoratorDto.ModifiersDto.SizingDto sizingDto) {
        return verticalSizing(horizontalSizing(modifier, sizingDto != null ? sizingDto.getHorizontal() : null), sizingDto != null ? sizingDto.getVertical() : null);
    }

    private static final Modifier horizontalSizing(Modifier modifier, DecoratorDto.ModifiersDto.SizingDto.SizingPreferenceDto sizingPreferenceDto) {
        DecoratorDto.ModifiersDto.SizingDto.SizingPreferenceDto.ConcreteDto concrete = sizingPreferenceDto != null ? sizingPreferenceDto.getConcrete() : null;
        if (concrete instanceof DecoratorDto.ModifiersDto.SizingDto.SizingPreferenceDto.ConcreteDto.Fixed) {
            return SizeKt.m5174width3ABfNKs(modifier, C2002Dp.m7995constructorimpl((float) ((DecoratorDto.ModifiersDto.SizingDto.SizingPreferenceDto.ConcreteDto.Fixed) concrete).getValue()));
        }
        if (concrete instanceof DecoratorDto.ModifiersDto.SizingDto.SizingPreferenceDto.ConcreteDto.Max) {
            return SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
        }
        if (concrete instanceof DecoratorDto.ModifiersDto.SizingDto.SizingPreferenceDto.ConcreteDto.Min) {
            return SizeKt.wrapContentWidth$default(modifier, null, false, 3, null);
        }
        if (concrete == null) {
            return modifier;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final Modifier verticalSizing(Modifier modifier, DecoratorDto.ModifiersDto.SizingDto.SizingPreferenceDto sizingPreferenceDto) {
        DecoratorDto.ModifiersDto.SizingDto.SizingPreferenceDto.ConcreteDto concrete = sizingPreferenceDto != null ? sizingPreferenceDto.getConcrete() : null;
        if (concrete instanceof DecoratorDto.ModifiersDto.SizingDto.SizingPreferenceDto.ConcreteDto.Fixed) {
            return SizeKt.m5156height3ABfNKs(modifier, C2002Dp.m7995constructorimpl((float) ((DecoratorDto.ModifiersDto.SizingDto.SizingPreferenceDto.ConcreteDto.Fixed) concrete).getValue()));
        }
        if (concrete instanceof DecoratorDto.ModifiersDto.SizingDto.SizingPreferenceDto.ConcreteDto.Max) {
            return SizeKt.fillMaxHeight$default(modifier, 0.0f, 1, null);
        }
        if (concrete instanceof DecoratorDto.ModifiersDto.SizingDto.SizingPreferenceDto.ConcreteDto.Min) {
            return SizeKt.wrapContentHeight$default(modifier, null, false, 3, null);
        }
        if (concrete == null) {
            return modifier;
        }
        throw new NoWhenBranchMatchedException();
    }
}
