package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.os.Parcelable;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderStroke;
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
import androidx.compose.runtime.CompositionLocal6;
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
import com.robinhood.android.gold.sparkle.compose.GoldSparkleBrush;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.AppearanceUtil;
import com.robinhood.models.serverdriven.experimental.api.AccessibilityModifier;
import com.robinhood.models.serverdriven.experimental.api.AnalyticsEventDescriptor;
import com.robinhood.models.serverdriven.experimental.api.BookCoverText;
import com.robinhood.models.serverdriven.experimental.api.Border;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.Decorator;
import com.robinhood.models.serverdriven.experimental.api.EducationTourElement;
import com.robinhood.models.serverdriven.experimental.api.GradientDirection;
import com.robinhood.models.serverdriven.experimental.api.GradientStop;
import com.robinhood.models.serverdriven.experimental.api.GradientWithStops;
import com.robinhood.models.serverdriven.experimental.api.Sizing;
import com.robinhood.models.serverdriven.experimental.api.SizingPreference;
import com.robinhood.models.serverdriven.experimental.api.Text;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.compose.extensions.ModifiersKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.extensions2;

/* compiled from: SduiDecorator.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aI\u0010\b\u001a\u00020\u00062*\u0010\u0004\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\u0011\u001a\u00020\u0006\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a5\u0010\u0014\u001a\u00020\u0003*\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0017\u001a'\u0010\u0019\u001a\u00020\u0003*\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001b\u001a\u00020\u0003*\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u00182\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u001a\u001a\u000f\u0010\u001c\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u000f\u0010\u001e\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u001e\u0010\u001d\u001a\u000f\u0010\u001f\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u001f\u0010\u001d\u001a\u000f\u0010 \u001a\u00020\u0006H\u0001¢\u0006\u0004\b \u0010\u001d\"&\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$\"\u001f\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0!8\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010(¨\u0006+²\u0006\u000e\u0010*\u001a\u00020)8\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"", "Lkotlin/Pair;", "", "Landroidx/compose/ui/Modifier;", "modifierPairs", "Lkotlin/Function0;", "", "content", "ProvideSduiTagBasedModifiers", "([Lkotlin/Pair;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroid/os/Parcelable;", "ActionT", "Lcom/robinhood/models/serverdriven/experimental/api/Decorator;", "component", "modifier", "Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;", "horizontalPadding", "SduiDecorator", "(Lcom/robinhood/models/serverdriven/experimental/api/Decorator;Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/models/serverdriven/experimental/api/Sizing;", "sizing", "width", "height", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/api/Sizing;Ljava/lang/Integer;Ljava/lang/Integer;)Landroidx/compose/ui/Modifier;", "Lcom/robinhood/models/serverdriven/experimental/api/SizingPreference;", "horizontalSizing", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/api/SizingPreference;Ljava/lang/Integer;)Landroidx/compose/ui/Modifier;", "verticalSizing", "PreviewMinWidthDecoratorWithModifier", "(Landroidx/compose/runtime/Composer;I)V", "PreviewMaxWidthDecoratorWithModifier", "PreviewWidthDecoratorWithModifier", "PreviewDecoratorWithGradient", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lkotlinx/collections/immutable/ImmutableMap;", "LocalSduiTagBasedModifiers", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/LocalDecoratorOverride;", "LocalSduiDecoratorModifiers", "getLocalSduiDecoratorModifiers", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/geometry/Offset;", "positionInWindow", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class SduiDecoratorKt {
    private static final CompositionLocal6<ImmutableMap<Integer, Modifier>> LocalSduiTagBasedModifiers = CompositionLocal3.compositionLocalOf$default(null, new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecoratorKt$$ExternalSyntheticLambda8
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return extensions2.persistentMapOf();
        }
    }, 1, null);
    private static final CompositionLocal6<LocalDecoratorOverride> LocalSduiDecoratorModifiers = CompositionLocal3.compositionLocalOf$default(null, new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecoratorKt$$ExternalSyntheticLambda9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SduiDecoratorKt.LocalSduiDecoratorModifiers$lambda$1();
        }
    }, 1, null);

    /* compiled from: SduiDecorator.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes8.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[GradientDirection.values().length];
            try {
                iArr[GradientDirection.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GradientDirection.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SizingPreference.values().length];
            try {
                iArr2[SizingPreference.MIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[SizingPreference.MAX.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[SizingPreference.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocalDecoratorOverride LocalSduiDecoratorModifiers$lambda$1() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewDecoratorWithGradient$lambda$22(int i, Composer composer, int i2) {
        PreviewDecoratorWithGradient(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewMaxWidthDecoratorWithModifier$lambda$20(int i, Composer composer, int i2) {
        PreviewMaxWidthDecoratorWithModifier(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewMinWidthDecoratorWithModifier$lambda$19(int i, Composer composer, int i2) {
        PreviewMinWidthDecoratorWithModifier(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewWidthDecoratorWithModifier$lambda$21(int i, Composer composer, int i2) {
        PreviewWidthDecoratorWithModifier(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProvideSduiTagBasedModifiers$lambda$2(Tuples2[] tuples2Arr, Function2 function2, int i, Composer composer, int i2) {
        ProvideSduiTagBasedModifiers(tuples2Arr, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiDecorator$lambda$18(Decorator decorator, Modifier modifier, HorizontalPadding horizontalPadding, int i, int i2, Composer composer, int i3) {
        SduiDecorator(decorator, modifier, horizontalPadding, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final CompositionLocal6<LocalDecoratorOverride> getLocalSduiDecoratorModifiers() {
        return LocalSduiDecoratorModifiers;
    }

    private static final long SduiDecorator$lambda$8(SnapshotState<Offset> snapshotState) {
        return snapshotState.getValue().getPackedValue();
    }

    public static final void ProvideSduiTagBasedModifiers(final Tuples2<Integer, ? extends Modifier>[] modifierPairs, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(modifierPairs, "modifierPairs");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(987254232);
        int i2 = (i & 48) == 0 ? (composerStartRestartGroup.changedInstance(content) ? 32 : 16) | i : i;
        composerStartRestartGroup.startMovableGroup(-436453823, Integer.valueOf(modifierPairs.length));
        int i3 = i2 | (composerStartRestartGroup.changed(modifierPairs.length) ? 4 : 0);
        for (Tuples2<Integer, ? extends Modifier> tuples2 : modifierPairs) {
            i3 |= composerStartRestartGroup.changed(tuples2) ? 4 : 0;
        }
        composerStartRestartGroup.endMovableGroup();
        if ((i3 & 14) == 0) {
            i3 |= 2;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(987254232, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.ProvideSduiTagBasedModifiers (SduiDecorator.kt:86)");
            }
            CompositionLocal6<ImmutableMap<Integer, Modifier>> compositionLocal6 = LocalSduiTagBasedModifiers;
            CompositionLocal3.CompositionLocalProvider(compositionLocal6.provides(extensions2.toImmutableMap(MapsKt.plus((ImmutableMap) composerStartRestartGroup.consume(compositionLocal6), modifierPairs))), ComposableLambda3.rememberComposableLambda(863888024, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecoratorKt.ProvideSduiTagBasedModifiers.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    if ((i4 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(863888024, i4, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.ProvideSduiTagBasedModifiers.<anonymous> (SduiDecorator.kt:90)");
                    }
                    content.invoke(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecoratorKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiDecoratorKt.ProvideSduiTagBasedModifiers$lambda$2(modifierPairs, content, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiDecorator(final Decorator<? extends ActionT> component, Modifier modifier, HorizontalPadding horizontalPadding, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        AnalyticsEventDescriptor analytics_event_descriptor;
        UserInteractionEventData.Action actionFromValue;
        Component.ComponentType componentTypeFromValue;
        UserInteractionEventDescriptor userInteractionEventDescriptorCopy$default;
        GradientWithStops background_gradient;
        RoundedCornerShape roundedCornerShape;
        Parcelable parcelable;
        String str;
        SduiActionHandler sduiActionHandler;
        EventLogger eventLogger;
        Parcelable parcelable2;
        boolean z;
        Brush brushM6683verticalGradient8A3gB4$default;
        Composer composer2;
        Modifier modifierBackground$default;
        boolean z2;
        Object objRememberedValue;
        Composer.Companion companion;
        Composer composer3;
        final LocalDecoratorOverride localDecoratorOverride;
        RoundedCornerShape roundedCornerShape2;
        final SduiActionHandler sduiActionHandler2;
        final Parcelable parcelable3;
        Modifier modifierOnAppear;
        String str2;
        BorderStroke borderStroke;
        Modifier contentDescription$default;
        Color composeColor;
        final HorizontalPadding horizontalPadding2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(-405253974);
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
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(horizontalPadding == null ? -1 : horizontalPadding.ordinal()) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                final Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                final HorizontalPadding horizontalPadding3 = i4 == 0 ? HorizontalPadding.None : horizontalPadding;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-405253974, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecorator (SduiDecorator.kt:99)");
                }
                ThemedColor background_color = component.getBackground_color();
                composerStartRestartGroup.startReplaceGroup(1392962874);
                Color composeColor2 = background_color != null ? null : SduiColors2.toComposeColor(background_color, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                long value = composeColor2 == null ? composeColor2.getValue() : Color.INSTANCE.m6725getTransparent0d7_KjU();
                RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(component.getCorner_radius()));
                Parcelable on_tap_action = component.getOn_tap_action();
                Parcelable on_will_appear = component.getOn_will_appear();
                AccessibilityModifier accessibility = component.getAccessibility();
                String label = accessibility == null ? accessibility.getLabel() : null;
                SduiActionHandler sduiActionHandlerCurrentActionHandler = SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0);
                EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                analytics_event_descriptor = component.getAnalytics_event_descriptor();
                composerStartRestartGroup.startReplaceGroup(1392978019);
                if (analytics_event_descriptor != null) {
                    userInteractionEventDescriptorCopy$default = null;
                } else {
                    String component_identifier = analytics_event_descriptor.getComponent_identifier();
                    composerStartRestartGroup.startReplaceGroup(1392979904);
                    if (component_identifier == null) {
                        userInteractionEventDescriptorCopy$default = null;
                    } else {
                        UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                        Integer action = analytics_event_descriptor.getAction();
                        if (action == null || (actionFromValue = UserInteractionEventData.Action.INSTANCE.fromValue(action.intValue())) == null) {
                            actionFromValue = UserInteractionEventData.Action.ACTION_UNSPECIFIED;
                        }
                        UserInteractionEventData.Action action2 = actionFromValue;
                        Integer component_type = analytics_event_descriptor.getComponent_type();
                        if (component_type == null || (componentTypeFromValue = Component.ComponentType.INSTANCE.fromValue(component_type.intValue())) == null) {
                            componentTypeFromValue = Component.ComponentType.COMPONENT_TYPE_UNSPECIFIED;
                        }
                        userInteractionEventDescriptorCopy$default = UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, action2, null, new Component(componentTypeFromValue, component_identifier, null, 4, null), null, 43, null);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
                background_gradient = component.getBackground_gradient();
                composerStartRestartGroup.startReplaceGroup(1392999888);
                if (background_gradient != null) {
                    roundedCornerShape = roundedCornerShapeM5327RoundedCornerShape0680j_4;
                    modifierBackground$default = Modifier.INSTANCE;
                    parcelable = on_will_appear;
                    str = label;
                    sduiActionHandler = sduiActionHandlerCurrentActionHandler;
                    eventLogger = current;
                    composer2 = composerStartRestartGroup;
                    z = true;
                    parcelable2 = on_tap_action;
                } else {
                    List<GradientStop> stops = background_gradient.getStops();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(stops, 10));
                    for (GradientStop gradientStop : stops) {
                        SduiActionHandler sduiActionHandler3 = sduiActionHandlerCurrentActionHandler;
                        Composer composer4 = composerStartRestartGroup;
                        arrayList.add(Tuples4.m3642to(Float.valueOf(gradientStop.getPosition()), Color.m6701boximpl(Color.m6705copywmQWz5c$default(SduiColors2.m18896toComposeColorDefaultediJQMabo(gradientStop.getColor(), 0L, composer4, 0, 1), gradientStop.getOpacity(), 0.0f, 0.0f, 0.0f, 14, null))));
                        on_tap_action = on_tap_action;
                        roundedCornerShapeM5327RoundedCornerShape0680j_4 = roundedCornerShapeM5327RoundedCornerShape0680j_4;
                        on_will_appear = on_will_appear;
                        label = label;
                        current = current;
                        composerStartRestartGroup = composer4;
                        sduiActionHandlerCurrentActionHandler = sduiActionHandler3;
                    }
                    roundedCornerShape = roundedCornerShapeM5327RoundedCornerShape0680j_4;
                    parcelable = on_will_appear;
                    str = label;
                    sduiActionHandler = sduiActionHandlerCurrentActionHandler;
                    eventLogger = current;
                    Composer composer5 = composerStartRestartGroup;
                    parcelable2 = on_tap_action;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    int i6 = WhenMappings.$EnumSwitchMapping$0[background_gradient.getDirection().ordinal()];
                    z = true;
                    if (i6 == 1) {
                        Brush.Companion companion3 = Brush.INSTANCE;
                        Tuples2[] tuples2Arr = (Tuples2[]) arrayList.toArray(new Tuples2[0]);
                        brushM6683verticalGradient8A3gB4$default = Brush.Companion.m6683verticalGradient8A3gB4$default(companion3, (Tuples2[]) Arrays.copyOf(tuples2Arr, tuples2Arr.length), 0.0f, 0.0f, 0, 14, (Object) null);
                    } else {
                        if (i6 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Brush.Companion companion4 = Brush.INSTANCE;
                        Tuples2[] tuples2Arr2 = (Tuples2[]) arrayList.toArray(new Tuples2[0]);
                        brushM6683verticalGradient8A3gB4$default = Brush.Companion.m6677horizontalGradient8A3gB4$default(companion4, (Tuples2[]) Arrays.copyOf(tuples2Arr2, tuples2Arr2.length), 0.0f, 0.0f, 0, 14, (Object) null);
                    }
                    Brush brush = brushM6683verticalGradient8A3gB4$default;
                    composer2 = composer5;
                    modifierBackground$default = Background3.background$default(companion2, brush, roundedCornerShape, 0.0f, 4, null);
                }
                composer2.endReplaceGroup();
                boolean z3 = (!(component.getContent() instanceof BookCoverText) || (component.getContent() instanceof Text) || (component.getContent() instanceof Button)) ? z : false;
                z2 = (component.getGold_shimmer() != null || z3) ? false : z;
                LocalDecoratorOverride localDecoratorOverride2 = new LocalDecoratorOverride((component.getGold_shimmer() == null && z3) ? z : false);
                composer2.startReplaceGroup(1849434622);
                objRememberedValue = composer2.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L))), null, 2, null);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(1393036967);
                if (z2) {
                    composer3 = composer2;
                    localDecoratorOverride = localDecoratorOverride2;
                    roundedCornerShape2 = roundedCornerShape;
                } else {
                    composer2.startReplaceGroup(5004770);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecoratorKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SduiDecoratorKt.SduiDecorator$lambda$12$lambda$11$lambda$10(snapshotState, (LayoutCoordinates) obj);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    OnGloballyPositionedModifier3.onGloballyPositioned(modifierBackground$default, (Function1) objRememberedValue2);
                    Composer composer6 = composer2;
                    localDecoratorOverride = localDecoratorOverride2;
                    composer3 = composer6;
                    roundedCornerShape2 = roundedCornerShape;
                    modifierBackground$default = Background3.background$default(modifierBackground$default, GoldSparkleBrush.m15094sparkleEPk0efs(Brush.INSTANCE, SduiDecorator$lambda$8(snapshotState), null, composer6, 6, 2), roundedCornerShape2, 0.0f, 4, null);
                }
                composer3.endReplaceGroup();
                composer3.startReplaceGroup(1393059189);
                if (parcelable2 == null) {
                    Unit unit = Unit.INSTANCE;
                    composer3.startReplaceGroup(-1224400529);
                    sduiActionHandler2 = sduiActionHandler;
                    EventLogger eventLogger2 = eventLogger;
                    boolean zChangedInstance = composer3.changedInstance(sduiActionHandler2) | composer3.changedInstance(parcelable2) | composer3.changedInstance(userInteractionEventDescriptorCopy$default) | composer3.changedInstance(eventLogger2);
                    Object objRememberedValue3 = composer3.rememberedValue();
                    if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new SduiDecoratorKt$SduiDecorator$1$1(sduiActionHandler2, parcelable2, userInteractionEventDescriptorCopy$default, eventLogger2);
                        composer3.updateRememberedValue(objRememberedValue3);
                    }
                    composer3.endReplaceGroup();
                    modifierBackground$default = SuspendingPointerInputFilterKt.pointerInput(modifierBackground$default, unit, (PointerInputEventHandler) objRememberedValue3);
                } else {
                    sduiActionHandler2 = sduiActionHandler;
                }
                composer3.endReplaceGroup();
                composer3.startReplaceGroup(1393084002);
                parcelable3 = parcelable;
                if (parcelable3 == null) {
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    composer3.startReplaceGroup(-1633490746);
                    boolean zChangedInstance2 = composer3.changedInstance(sduiActionHandler2) | composer3.changedInstance(parcelable3);
                    Object objRememberedValue4 = composer3.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecoratorKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SduiDecoratorKt.SduiDecorator$lambda$15$lambda$14(sduiActionHandler2, parcelable3);
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
                Modifier modifierThen = modifierBackground$default.then(modifierOnAppear);
                str2 = str;
                if (str2 == null) {
                    borderStroke = null;
                    contentDescription$default = ModifiersKt.setContentDescription$default(Modifier.INSTANCE, str2, false, 2, null);
                } else {
                    borderStroke = null;
                    contentDescription$default = Modifier.INSTANCE;
                }
                Modifier modifierAutoLogEvents$default = com.robinhood.android.compose.autoeventlogging.ModifiersKt.autoLogEvents$default(modifierThen.then(contentDescription$default), userInteractionEventDescriptorCopy$default, true, false, false, false, false, null, 108, null);
                Border border = component.getBorder();
                composer3.startReplaceGroup(1393110119);
                BorderStroke borderStrokeM4886BorderStrokecXLIe8U = (border == null || (composeColor = SduiColors2.toComposeColor(border.getColor(), composer3, 0)) == null) ? borderStroke : BorderStroke2.m4886BorderStrokecXLIe8U(C2002Dp.m7995constructorimpl(border.getWidth().getMobile()), composeColor.getValue());
                composer3.endReplaceGroup();
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-212221499, z, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecoratorKt.SduiDecorator.4
                    public final void invoke(Composer composer7, int i7) {
                        if ((i7 & 3) == 2 && composer7.getSkipping()) {
                            composer7.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-212221499, i7, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecorator.<anonymous> (SduiDecorator.kt:210)");
                        }
                        EducationTourElement education_tour_element = component.getEducation_tour_element();
                        String identifier = education_tour_element != null ? education_tour_element.getIdentifier() : null;
                        Modifier modifierTrackPosition = com.robinhood.android.libdesignsystem.serverui.experimental.position.ModifiersKt.trackPosition(SduiDecoratorKt.sizing$default(PaddingKt.m5145paddingqDBjuR0(TestTag3.testTag(identifier != null ? com.robinhood.android.educationtour.compose.ModifiersKt.educationTourId$default(Modifier.INSTANCE, identifier, null, null, false, false, 30, null) : Modifier.INSTANCE, TestTags.sduiDecoratorBoxContainer), C2002Dp.m7995constructorimpl(component.getInsets().getLeft().getMobile()), C2002Dp.m7995constructorimpl(component.getInsets().getTop().getMobile()), C2002Dp.m7995constructorimpl(component.getInsets().getRight().getMobile()), C2002Dp.m7995constructorimpl(component.getInsets().getBottom().getMobile())), component.getSizing(), null, null, 6, null), component.getIdentifier());
                        final Decorator<ActionT> decorator = component;
                        final LocalDecoratorOverride localDecoratorOverride3 = localDecoratorOverride;
                        final Modifier modifier5 = modifier4;
                        final HorizontalPadding horizontalPadding4 = horizontalPadding3;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer7, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer7.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer7, modifierTrackPosition);
                        ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion6.getConstructor();
                        if (composer7.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer7.startReusableNode();
                        if (composer7.getInserting()) {
                            composer7.createNode(constructor);
                        } else {
                            composer7.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer7);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion6.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion6.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion6.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion6.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Modifier modifier6 = (Modifier) ((ImmutableMap) composer7.consume(SduiDecoratorKt.LocalSduiTagBasedModifiers)).get(decorator.getTag());
                        if (modifier6 == null) {
                            modifier6 = Modifier.INSTANCE;
                        }
                        final Modifier modifier7 = modifier6;
                        UtilKt.NoHorizontalPadding(ComposableLambda3.rememberComposableLambda(971215678, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecoratorKt$SduiDecorator$4$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer8, Integer num) {
                                invoke(composer8, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer8, int i8) {
                                if ((i8 & 3) == 2 && composer8.getSkipping()) {
                                    composer8.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(971215678, i8, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecorator.<anonymous>.<anonymous>.<anonymous> (SduiDecorator.kt:233)");
                                }
                                ProvidedValue<LocalDecoratorOverride> providedValueProvides = SduiDecoratorKt.getLocalSduiDecoratorModifiers().provides(localDecoratorOverride3);
                                final Decorator<ActionT> decorator2 = decorator;
                                final Modifier modifier8 = modifier5;
                                final Modifier modifier9 = modifier7;
                                final HorizontalPadding horizontalPadding5 = horizontalPadding4;
                                CompositionLocal3.CompositionLocalProvider(providedValueProvides, ComposableLambda3.rememberComposableLambda(788293630, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecoratorKt$SduiDecorator$4$1$1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer9, Integer num) {
                                        invoke(composer9, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer9, int i9) {
                                        if ((i9 & 3) == 2 && composer9.getSkipping()) {
                                            composer9.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(788293630, i9, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecorator.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SduiDecorator.kt:234)");
                                        }
                                        UIComponent content = decorator2.getContent();
                                        Modifier modifier10 = modifier8;
                                        String test_tag = decorator2.getTest_tag();
                                        if (test_tag == null) {
                                            test_tag = TestTags.sduiComponent;
                                        }
                                        Modifier modifierTestTag = TestTag3.testTag(modifier10, test_tag);
                                        Float alpha = decorator2.getAlpha();
                                        SduiComponent3.SduiComponent(content, SduiDecoratorKt.sizing(Alpha.alpha(modifierTestTag, alpha != null ? alpha.floatValue() : 1.0f), decorator2.getSizing(), decorator2.getWidth(), decorator2.getHeight()).then(modifier9), horizontalPadding5, composer9, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer8, 54), composer8, ProvidedValue.$stable | 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer7, 54), composer7, 6);
                        composer7.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                        invoke(composer7, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composer3, 54);
                composerStartRestartGroup = composer3;
                Modifier modifier5 = modifier4;
                HorizontalPadding horizontalPadding4 = horizontalPadding3;
                SurfaceKt.m5967SurfaceT9BRK9s(modifierAutoLogEvents$default, roundedCornerShape2, value, value, 0.0f, 0.0f, borderStrokeM4886BorderStrokecXLIe8U, composableLambdaRememberComposableLambda, composerStartRestartGroup, 12582912, 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                horizontalPadding2 = horizontalPadding4;
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                horizontalPadding2 = horizontalPadding;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecoratorKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiDecoratorKt.SduiDecorator$lambda$18(component, modifier3, horizontalPadding2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        if ((i3 & 147) == 146) {
            if (i5 == 0) {
            }
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ThemedColor background_color2 = component.getBackground_color();
            composerStartRestartGroup.startReplaceGroup(1392962874);
            if (background_color2 != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            long value2 = composeColor2 == null ? composeColor2.getValue() : Color.INSTANCE.m6725getTransparent0d7_KjU();
            RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_42 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(component.getCorner_radius()));
            Parcelable on_tap_action2 = component.getOn_tap_action();
            Parcelable on_will_appear2 = component.getOn_will_appear();
            AccessibilityModifier accessibility2 = component.getAccessibility();
            if (accessibility2 == null) {
            }
            SduiActionHandler sduiActionHandlerCurrentActionHandler2 = SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0);
            EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            analytics_event_descriptor = component.getAnalytics_event_descriptor();
            composerStartRestartGroup.startReplaceGroup(1392978019);
            if (analytics_event_descriptor != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            background_gradient = component.getBackground_gradient();
            composerStartRestartGroup.startReplaceGroup(1392999888);
            if (background_gradient != null) {
            }
            composer2.endReplaceGroup();
            if (component.getContent() instanceof BookCoverText) {
                if (component.getGold_shimmer() != null) {
                    if (component.getGold_shimmer() == null) {
                        LocalDecoratorOverride localDecoratorOverride22 = new LocalDecoratorOverride((component.getGold_shimmer() == null && z3) ? z : false);
                        composer2.startReplaceGroup(1849434622);
                        objRememberedValue = composer2.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(1393036967);
                        if (z2) {
                        }
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(1393059189);
                        if (parcelable2 == null) {
                        }
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(1393084002);
                        parcelable3 = parcelable;
                        if (parcelable3 == null) {
                        }
                        composer3.endReplaceGroup();
                        Modifier modifierThen2 = modifierBackground$default.then(modifierOnAppear);
                        str2 = str;
                        if (str2 == null) {
                        }
                        Modifier modifierAutoLogEvents$default2 = com.robinhood.android.compose.autoeventlogging.ModifiersKt.autoLogEvents$default(modifierThen2.then(contentDescription$default), userInteractionEventDescriptorCopy$default, true, false, false, false, false, null, 108, null);
                        Border border2 = component.getBorder();
                        composer3.startReplaceGroup(1393110119);
                        if (border2 == null) {
                            composer3.endReplaceGroup();
                            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-212221499, z, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecoratorKt.SduiDecorator.4
                                public final void invoke(Composer composer7, int i7) {
                                    if ((i7 & 3) == 2 && composer7.getSkipping()) {
                                        composer7.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-212221499, i7, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecorator.<anonymous> (SduiDecorator.kt:210)");
                                    }
                                    EducationTourElement education_tour_element = component.getEducation_tour_element();
                                    String identifier = education_tour_element != null ? education_tour_element.getIdentifier() : null;
                                    Modifier modifierTrackPosition = com.robinhood.android.libdesignsystem.serverui.experimental.position.ModifiersKt.trackPosition(SduiDecoratorKt.sizing$default(PaddingKt.m5145paddingqDBjuR0(TestTag3.testTag(identifier != null ? com.robinhood.android.educationtour.compose.ModifiersKt.educationTourId$default(Modifier.INSTANCE, identifier, null, null, false, false, 30, null) : Modifier.INSTANCE, TestTags.sduiDecoratorBoxContainer), C2002Dp.m7995constructorimpl(component.getInsets().getLeft().getMobile()), C2002Dp.m7995constructorimpl(component.getInsets().getTop().getMobile()), C2002Dp.m7995constructorimpl(component.getInsets().getRight().getMobile()), C2002Dp.m7995constructorimpl(component.getInsets().getBottom().getMobile())), component.getSizing(), null, null, 6, null), component.getIdentifier());
                                    final Decorator<? extends ActionT> decorator = component;
                                    final LocalDecoratorOverride localDecoratorOverride3 = localDecoratorOverride;
                                    final Modifier modifier52 = modifier4;
                                    final HorizontalPadding horizontalPadding42 = horizontalPadding3;
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer7, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer7.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer7, modifierTrackPosition);
                                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion6.getConstructor();
                                    if (composer7.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer7.startReusableNode();
                                    if (composer7.getInserting()) {
                                        composer7.createNode(constructor);
                                    } else {
                                        composer7.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer7);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion6.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion6.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion6.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion6.getSetModifier());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    Modifier modifier6 = (Modifier) ((ImmutableMap) composer7.consume(SduiDecoratorKt.LocalSduiTagBasedModifiers)).get(decorator.getTag());
                                    if (modifier6 == null) {
                                        modifier6 = Modifier.INSTANCE;
                                    }
                                    final Modifier modifier7 = modifier6;
                                    UtilKt.NoHorizontalPadding(ComposableLambda3.rememberComposableLambda(971215678, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecoratorKt$SduiDecorator$4$1$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer8, Integer num) {
                                            invoke(composer8, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer8, int i8) {
                                            if ((i8 & 3) == 2 && composer8.getSkipping()) {
                                                composer8.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(971215678, i8, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecorator.<anonymous>.<anonymous>.<anonymous> (SduiDecorator.kt:233)");
                                            }
                                            ProvidedValue<LocalDecoratorOverride> providedValueProvides = SduiDecoratorKt.getLocalSduiDecoratorModifiers().provides(localDecoratorOverride3);
                                            final Decorator<? extends ActionT> decorator2 = decorator;
                                            final Modifier modifier8 = modifier52;
                                            final Modifier modifier9 = modifier7;
                                            final HorizontalPadding horizontalPadding5 = horizontalPadding42;
                                            CompositionLocal3.CompositionLocalProvider(providedValueProvides, ComposableLambda3.rememberComposableLambda(788293630, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecoratorKt$SduiDecorator$4$1$1.1
                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer9, Integer num) {
                                                    invoke(composer9, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer9, int i9) {
                                                    if ((i9 & 3) == 2 && composer9.getSkipping()) {
                                                        composer9.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(788293630, i9, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecorator.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SduiDecorator.kt:234)");
                                                    }
                                                    UIComponent content = decorator2.getContent();
                                                    Modifier modifier10 = modifier8;
                                                    String test_tag = decorator2.getTest_tag();
                                                    if (test_tag == null) {
                                                        test_tag = TestTags.sduiComponent;
                                                    }
                                                    Modifier modifierTestTag = TestTag3.testTag(modifier10, test_tag);
                                                    Float alpha = decorator2.getAlpha();
                                                    SduiComponent3.SduiComponent(content, SduiDecoratorKt.sizing(Alpha.alpha(modifierTestTag, alpha != null ? alpha.floatValue() : 1.0f), decorator2.getSizing(), decorator2.getWidth(), decorator2.getHeight()).then(modifier9), horizontalPadding5, composer9, 0, 0);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composer8, 54), composer8, ProvidedValue.$stable | 48);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer7, 54), composer7, 6);
                                    composer7.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                    invoke(composer7, num.intValue());
                                    return Unit.INSTANCE;
                                }
                            }, composer3, 54);
                            composerStartRestartGroup = composer3;
                            Modifier modifier52 = modifier4;
                            HorizontalPadding horizontalPadding42 = horizontalPadding3;
                            SurfaceKt.m5967SurfaceT9BRK9s(modifierAutoLogEvents$default2, roundedCornerShape2, value2, value2, 0.0f, 0.0f, borderStrokeM4886BorderStrokecXLIe8U, composableLambdaRememberComposableLambda2, composerStartRestartGroup, 12582912, 48);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            horizontalPadding2 = horizontalPadding42;
                            modifier3 = modifier52;
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void SduiDecorator$lambda$9(SnapshotState<Offset> snapshotState, long j) {
        snapshotState.setValue(Offset.m6534boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiDecorator$lambda$12$lambda$11$lambda$10(SnapshotState snapshotState, LayoutCoordinates layoutCoords) {
        Intrinsics.checkNotNullParameter(layoutCoords, "layoutCoords");
        SduiDecorator$lambda$9(snapshotState, LayoutCoordinates2.positionInWindow(layoutCoords));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiDecorator$lambda$15$lambda$14(SduiActionHandler sduiActionHandler, Parcelable parcelable) {
        SduiActionHandler3.handling(sduiActionHandler, parcelable).invoke();
        return Unit.INSTANCE;
    }

    static /* synthetic */ Modifier sizing$default(Modifier modifier, Sizing sizing, Integer num, Integer num2, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        return sizing(modifier, sizing, num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier sizing(Modifier modifier, Sizing sizing, Integer num, Integer num2) {
        return verticalSizing(horizontalSizing(modifier, sizing != null ? sizing.getHorizontal() : null, num), sizing != null ? sizing.getVertical() : null, num2);
    }

    private static final Modifier horizontalSizing(Modifier modifier, SizingPreference sizingPreference, Integer num) {
        if (num == null) {
            int i = sizingPreference == null ? -1 : WhenMappings.$EnumSwitchMapping$1[sizingPreference.ordinal()];
            if (i == -1) {
                return modifier;
            }
            if (i == 1) {
                return SizeKt.wrapContentWidth$default(modifier, null, false, 3, null);
            }
            if (i == 2) {
                return SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            }
            if (i == 3) {
                return modifier;
            }
            throw new NoWhenBranchMatchedException();
        }
        return SizeKt.fillMaxWidth$default(SizeKt.m5174width3ABfNKs(modifier, C2002Dp.m7995constructorimpl(num.intValue())), 0.0f, 1, null);
    }

    private static final Modifier verticalSizing(Modifier modifier, SizingPreference sizingPreference, Integer num) {
        if (num == null) {
            int i = sizingPreference == null ? -1 : WhenMappings.$EnumSwitchMapping$1[sizingPreference.ordinal()];
            if (i == -1) {
                return modifier;
            }
            if (i == 1) {
                return SizeKt.wrapContentHeight$default(modifier, null, false, 3, null);
            }
            if (i == 2) {
                return SizeKt.fillMaxHeight$default(modifier, 0.0f, 1, null);
            }
            if (i == 3) {
                return modifier;
            }
            throw new NoWhenBranchMatchedException();
        }
        return SizeKt.fillMaxHeight$default(SizeKt.m5156height3ABfNKs(modifier, C2002Dp.m7995constructorimpl(num.intValue())), 0.0f, 1, null);
    }

    public static final void PreviewMinWidthDecoratorWithModifier(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-832015563);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-832015563, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.PreviewMinWidthDecoratorWithModifier (SduiDecorator.kt:295)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$SduiDecoratorKt.INSTANCE.getLambda$1983831165$lib_sdui_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecoratorKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiDecoratorKt.PreviewMinWidthDecoratorWithModifier$lambda$19(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewMaxWidthDecoratorWithModifier(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-665456953);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-665456953, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.PreviewMaxWidthDecoratorWithModifier (SduiDecorator.kt:311)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$SduiDecoratorKt.INSTANCE.m15954getLambda$2144577521$lib_sdui_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecoratorKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiDecoratorKt.PreviewMaxWidthDecoratorWithModifier$lambda$20(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewWidthDecoratorWithModifier(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1580786057);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1580786057, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.PreviewWidthDecoratorWithModifier (SduiDecorator.kt:327)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$SduiDecoratorKt.INSTANCE.getLambda$1573026351$lib_sdui_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecoratorKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiDecoratorKt.PreviewWidthDecoratorWithModifier$lambda$21(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewDecoratorWithGradient(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1326552766);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1326552766, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.PreviewDecoratorWithGradient (SduiDecorator.kt:353)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$SduiDecoratorKt.INSTANCE.getLambda$1682348682$lib_sdui_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiDecoratorKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiDecoratorKt.PreviewDecoratorWithGradient$lambda$22(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
