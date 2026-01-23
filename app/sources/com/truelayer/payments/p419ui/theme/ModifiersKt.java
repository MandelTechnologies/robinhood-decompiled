package com.truelayer.payments.p419ui.theme;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.focus.FocusChangedModifier2;
import androidx.compose.p011ui.focus.FocusState;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Modifiers.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a6\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001a\u0010\t\u001a\u00020\u0001*\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0000\u001a8\u0010\r\u001a\u00020\u0001*\u00020\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0011H\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, m3636d2 = {"circle", "Landroidx/compose/ui/Modifier;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "borderWidth", "Landroidx/compose/ui/unit/Dp;", "overrideBorderColor", "circle-sqb8OZA", "(Landroidx/compose/ui/Modifier;JFLandroidx/compose/ui/graphics/Color;)Landroidx/compose/ui/Modifier;", "onFocused", "on", "Lkotlin/Function0;", "", "verticalScroll", "state", "Landroidx/compose/foundation/ScrollState;", "enabled", "", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "reverseScrolling", "payments-ui_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class ModifiersKt {
    public static final Modifier onFocused(Modifier modifier, final Function0<Unit> on) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(on, "on");
        return ComposedModifier2.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.truelayer.payments.ui.theme.ModifiersKt.onFocused.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier composed, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(-786296642);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-786296642, i, -1, "com.truelayer.payments.ui.theme.onFocused.<anonymous> (Modifiers.kt:18)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceableGroup(-1196875204);
                boolean zChanged = composer.changed(on);
                final Function0<Unit> function0 = on;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1<FocusState, Unit>() { // from class: com.truelayer.payments.ui.theme.ModifiersKt$onFocused$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
                            invoke2(focusState);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(FocusState focus) {
                            Intrinsics.checkNotNullParameter(focus, "focus");
                            if (focus.isFocused()) {
                                function0.invoke();
                            }
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                Modifier modifierThen = composed.then(FocusChangedModifier2.onFocusChanged(companion, (Function1) objRememberedValue));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierThen;
            }
        }, 1, null);
    }

    /* renamed from: circle-sqb8OZA$default, reason: not valid java name */
    public static /* synthetic */ Modifier m27165circlesqb8OZA$default(Modifier modifier, long j, float f, Color color, int i, Object obj) {
        if ((i & 1) != 0) {
            j = Color.INSTANCE.m6727getWhite0d7_KjU();
        }
        if ((i & 2) != 0) {
            f = C2002Dp.m7995constructorimpl(1);
        }
        if ((i & 4) != 0) {
            color = null;
        }
        return m27164circlesqb8OZA(modifier, j, f, color);
    }

    /* renamed from: circle-sqb8OZA, reason: not valid java name */
    public static final Modifier m27164circlesqb8OZA(Modifier circle, final long j, final float f, final Color color) {
        Intrinsics.checkNotNullParameter(circle, "$this$circle");
        return ComposedModifier2.composed$default(circle, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.truelayer.payments.ui.theme.ModifiersKt$circle$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                return invoke(modifier, composer, num.intValue());
            }

            public final Modifier invoke(Modifier composed, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(2137475522);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2137475522, i, -1, "com.truelayer.payments.ui.theme.circle.<anonymous> (Modifiers.kt:34)");
                }
                Modifier modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(Modifier.INSTANCE, j, RoundedCornerShape2.getCircleShape());
                float f2 = f;
                Color color2 = color;
                Modifier modifierThen = composed.then(Clip.clip(BorderKt.m4876borderxT4_qwU(modifierM4871backgroundbw27NRU, f2, color2 == null ? Color8.INSTANCE.getBorder(composer, 6) : color2.getValue(), RoundedCornerShape2.getCircleShape()), RoundedCornerShape2.getCircleShape()));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierThen;
            }
        }, 1, null);
    }

    public static /* synthetic */ Modifier verticalScroll$default(Modifier modifier, ScrollState scrollState, boolean z, FlingBehavior flingBehavior, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            scrollState = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            flingBehavior = null;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return verticalScroll(modifier, scrollState, z, flingBehavior, z2);
    }

    public static final Modifier verticalScroll(Modifier modifier, final ScrollState scrollState, final boolean z, final FlingBehavior flingBehavior, final boolean z2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return ComposedModifier2.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.truelayer.payments.ui.theme.ModifiersKt.verticalScroll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier composed, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(-479636725);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-479636725, i, -1, "com.truelayer.payments.ui.theme.verticalScroll.<anonymous> (Modifiers.kt:55)");
                }
                ScrollState scrollStateRememberScrollState = scrollState;
                if (scrollStateRememberScrollState == null) {
                    scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer, 0, 1);
                }
                Modifier modifierThen = composed.then(ScrollKt.verticalScroll(composed, scrollStateRememberScrollState, z, flingBehavior, z2));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierThen;
            }
        }, 1, null);
    }
}
