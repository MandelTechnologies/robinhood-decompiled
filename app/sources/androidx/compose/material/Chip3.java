package androidx.compose.material;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Intrinsic3;
import androidx.compose.foundation.layout.Intrinsic4;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.CornerSize2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Chip.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a´\u0001\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0017\u0010\u0016\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\u0013¢\u0006\u0002\b\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001b\"\u0014\u0010\u001d\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001b\"\u0014\u0010\u001f\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001b¨\u0006#²\u0006\f\u0010!\u001a\u00020 8\nX\u008a\u0084\u0002²\u0006\f\u0010\"\u001a\u00020 8\nX\u008a\u0084\u0002"}, m3636d2 = {"", "selected", "Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/foundation/BorderStroke;", "border", "Landroidx/compose/material/SelectableChipColors;", "colors", "leadingIcon", "selectedIcon", "trailingIcon", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "content", "FilterChip", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/SelectableChipColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/unit/Dp;", "HorizontalPadding", "F", "LeadingIconStartSpacing", "LeadingIconEndSpacing", "TrailingIconSpacing", "SelectedIconContainerSize", "Landroidx/compose/ui/graphics/Color;", "contentColor", "leadingIconContentColor", "material_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.material.ChipKt, reason: use source file name */
/* loaded from: classes4.dex */
public final class Chip3 {
    private static final float LeadingIconEndSpacing;
    private static final float TrailingIconSpacing;
    private static final float HorizontalPadding = C2002Dp.m7995constructorimpl(12);
    private static final float LeadingIconStartSpacing = C2002Dp.m7995constructorimpl(4);
    private static final float SelectedIconContainerSize = C2002Dp.m7995constructorimpl(24);

    /* JADX WARN: Removed duplicated region for block: B:101:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fb  */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v6, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FilterChip(final boolean z, final Function0<Unit> function0, Modifier modifier, boolean z2, InteractionSource3 interactionSource3, Shape shape, BorderStroke borderStroke, Chip5 chip5, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        int i6;
        boolean z3;
        int i7;
        Shape shapeCopy;
        int i8;
        BorderStroke borderStroke2;
        int i9;
        Function2<? super Composer, ? super Integer, Unit> function24;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Composer composer2;
        final InteractionSource3 interactionSource32;
        final Chip5 chip52;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final Shape shape2;
        final BorderStroke borderStroke3;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final boolean z4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i16;
        Modifier modifier4;
        boolean z5;
        int i17;
        int i18;
        int i19;
        Chip5 chip5M5550filterChipColorsJ08w3E;
        Function2<? super Composer, ? super Integer, Unit> function28;
        Function2<? super Composer, ? super Integer, Unit> function29;
        InteractionSource3 interactionSource33;
        int i20;
        Function2<? super Composer, ? super Integer, Unit> function210;
        Modifier modifier5;
        ?? r3;
        int i21;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1259208246);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else {
                if ((i & 384) == 0) {
                    modifier2 = modifier;
                    i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        z3 = z2;
                        i4 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
                    }
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= 24576;
                    } else {
                        if ((i & 24576) == 0) {
                            i4 |= composerStartRestartGroup.changed(interactionSource3) ? 16384 : 8192;
                        }
                        if ((i & 196608) == 0) {
                            shapeCopy = shape;
                            i4 |= ((i3 & 32) == 0 && composerStartRestartGroup.changed(shapeCopy)) ? 131072 : 65536;
                        } else {
                            shapeCopy = shape;
                        }
                        i8 = i3 & 64;
                        if (i8 != 0) {
                            i4 |= 1572864;
                            borderStroke2 = borderStroke;
                        } else {
                            borderStroke2 = borderStroke;
                            if ((i & 1572864) == 0) {
                                i4 |= composerStartRestartGroup.changed(borderStroke2) ? 1048576 : 524288;
                            }
                        }
                        if ((i & 12582912) == 0) {
                            if ((i3 & 128) != 0) {
                                i21 = 4194304;
                                i4 |= i21;
                            } else {
                                if ((16777216 & i) == 0 ? composerStartRestartGroup.changed(chip5) : composerStartRestartGroup.changedInstance(chip5)) {
                                    i21 = 8388608;
                                }
                                i4 |= i21;
                            }
                        }
                        i9 = i3 & 256;
                        if (i9 != 0) {
                            i4 |= 100663296;
                            function24 = function2;
                        } else {
                            function24 = function2;
                            if ((i & 100663296) == 0) {
                                i4 |= composerStartRestartGroup.changedInstance(function24) ? 67108864 : 33554432;
                            }
                        }
                        i10 = i3 & 512;
                        if (i10 != 0) {
                            i4 |= 805306368;
                        } else {
                            if ((i & 805306368) == 0) {
                                i11 = i10;
                                i4 |= composerStartRestartGroup.changedInstance(function22) ? 536870912 : 268435456;
                            }
                            i12 = i3 & 1024;
                            if (i12 == 0) {
                                i14 = i2 | 6;
                                i13 = i12;
                            } else if ((i2 & 6) == 0) {
                                i13 = i12;
                                i14 = i2 | (composerStartRestartGroup.changedInstance(function23) ? 4 : 2);
                            } else {
                                i13 = i12;
                                i14 = i2;
                            }
                            if ((i3 & 2048) != 0) {
                                if ((i2 & 48) == 0) {
                                    i14 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
                                }
                                i15 = i14;
                                if (composerStartRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i15 & 19) == 18) ? false : true, i4 & 1)) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        Modifier modifier6 = i5 != 0 ? Modifier.INSTANCE : modifier2;
                                        boolean z6 = i6 != 0 ? true : z3;
                                        InteractionSource3 interactionSource34 = i7 != 0 ? null : interactionSource3;
                                        if ((i3 & 32) != 0) {
                                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSize2.CornerSize(50));
                                            i4 &= -458753;
                                        }
                                        int i22 = i4;
                                        Shape shape3 = shapeCopy;
                                        BorderStroke borderStroke4 = i8 != 0 ? null : borderStroke2;
                                        if ((i3 & 128) != 0) {
                                            i18 = i11;
                                            i19 = i13;
                                            i17 = i9;
                                            i16 = i15;
                                            modifier4 = modifier6;
                                            z5 = true;
                                            chip5M5550filterChipColorsJ08w3E = Chip2.INSTANCE.m5550filterChipColorsJ08w3E(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 805306368, 511);
                                            composerStartRestartGroup = composerStartRestartGroup;
                                            i22 &= -29360129;
                                        } else {
                                            i16 = i15;
                                            modifier4 = modifier6;
                                            z5 = true;
                                            i17 = i9;
                                            i18 = i11;
                                            i19 = i13;
                                            chip5M5550filterChipColorsJ08w3E = chip5;
                                        }
                                        if (i17 != 0) {
                                            function24 = null;
                                        }
                                        Function2<? super Composer, ? super Integer, Unit> function211 = i18 != 0 ? null : function22;
                                        if (i19 != 0) {
                                            function29 = function211;
                                            z3 = z6;
                                            interactionSource33 = interactionSource34;
                                            shapeCopy = shape3;
                                            i20 = i22;
                                            borderStroke2 = borderStroke4;
                                            function28 = null;
                                        } else {
                                            function28 = function23;
                                            function29 = function211;
                                            z3 = z6;
                                            interactionSource33 = interactionSource34;
                                            shapeCopy = shape3;
                                            i20 = i22;
                                            borderStroke2 = borderStroke4;
                                        }
                                        function210 = function24;
                                        modifier5 = modifier4;
                                        r3 = z5;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        if ((i3 & 32) != 0) {
                                            i4 &= -458753;
                                        }
                                        if ((i3 & 128) != 0) {
                                            i4 &= -29360129;
                                        }
                                        interactionSource33 = interactionSource3;
                                        function29 = function22;
                                        function28 = function23;
                                        i16 = i15;
                                        r3 = 1;
                                        function210 = function24;
                                        modifier5 = modifier2;
                                        i20 = i4;
                                        chip5M5550filterChipColorsJ08w3E = chip5;
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1259208246, i20, i16, "androidx.compose.material.FilterChip (Chip.kt:196)");
                                    }
                                    int i23 = i20 << 3;
                                    int i24 = ((i20 >> 9) & 14) | (i23 & 112) | ((i20 >> 15) & 896);
                                    final SnapshotState4<Color> snapshotState4ContentColor = chip5M5550filterChipColorsJ08w3E.contentColor(z3, z, composerStartRestartGroup, i24);
                                    final Function2<? super Composer, ? super Integer, Unit> function212 = function210;
                                    Shape shape4 = shapeCopy;
                                    final Chip5 chip53 = chip5M5550filterChipColorsJ08w3E;
                                    final Function2<? super Composer, ? super Integer, Unit> function213 = function29;
                                    final Function2<? super Composer, ? super Integer, Unit> function214 = function28;
                                    final boolean z7 = z3;
                                    Modifier modifier7 = modifier5;
                                    SurfaceKt.m5645SurfaceNy5ogXk(z, function0, SemanticsModifier6.semantics$default(modifier5, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.ChipKt.FilterChip.1
                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            invoke2(semanticsPropertyReceiver);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            SemanticsPropertiesKt.m7496setRolekuIjeqM(semanticsPropertyReceiver, Role.INSTANCE.m7481getCheckboxo7Vup1c());
                                        }
                                    }, r3, null), z7, shape4, chip5M5550filterChipColorsJ08w3E.backgroundColor(z3, z, composerStartRestartGroup, i24).getValue().getValue(), Color.m6705copywmQWz5c$default(snapshotState4ContentColor.getValue().getValue(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke2, 0.0f, interactionSource33, ComposableLambda3.rememberComposableLambda(722126431, r3, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.FilterChip.2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i25) {
                                            if (!composer3.shouldExecute((i25 & 3) != 2, i25 & 1)) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(722126431, i25, -1, "androidx.compose.material.FilterChip.<anonymous> (Chip.kt:210)");
                                            }
                                            ProvidedValue<Float> providedValueProvides = ContentAlpha2.getLocalContentAlpha().provides(Float.valueOf(Color.m6708getAlphaimpl(snapshotState4ContentColor.getValue().getValue())));
                                            final Function2<Composer, Integer, Unit> function215 = function212;
                                            final boolean z8 = z;
                                            final Function2<Composer, Integer, Unit> function216 = function213;
                                            final Function2<Composer, Integer, Unit> function217 = function214;
                                            final Function3<Row5, Composer, Integer, Unit> function32 = function3;
                                            final Chip5 chip54 = chip53;
                                            final boolean z9 = z7;
                                            final SnapshotState4<Color> snapshotState4 = snapshotState4ContentColor;
                                            CompositionLocal3.CompositionLocalProvider(providedValueProvides, ComposableLambda3.rememberComposableLambda(1582291359, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.FilterChip.2.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                    invoke(composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer4, int i26) {
                                                    if (!composer4.shouldExecute((i26 & 3) != 2, i26 & 1)) {
                                                        composer4.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1582291359, i26, -1, "androidx.compose.material.FilterChip.<anonymous>.<anonymous> (Chip.kt:211)");
                                                    }
                                                    TextStyle body2 = MaterialTheme.INSTANCE.getTypography(composer4, 6).getBody2();
                                                    final Function2<Composer, Integer, Unit> function218 = function215;
                                                    final boolean z10 = z8;
                                                    final Function2<Composer, Integer, Unit> function219 = function216;
                                                    final Function2<Composer, Integer, Unit> function220 = function217;
                                                    final Function3<Row5, Composer, Integer, Unit> function33 = function32;
                                                    final Chip5 chip55 = chip54;
                                                    final boolean z11 = z9;
                                                    final SnapshotState4<Color> snapshotState42 = snapshotState4;
                                                    TextKt.ProvideTextStyle(body2, ComposableLambda3.rememberComposableLambda(-1543702066, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.FilterChip.2.1.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                                            invoke(composer5, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* JADX WARN: Type inference failed for: r7v13 */
                                                        /* JADX WARN: Type inference failed for: r7v6 */
                                                        /* JADX WARN: Type inference failed for: r7v7, types: [boolean, int] */
                                                        public final void invoke(Composer composer5, int i27) {
                                                            Row6 row6;
                                                            ?? r7;
                                                            Modifier modifierClip;
                                                            if (!composer5.shouldExecute((i27 & 3) != 2, i27 & 1)) {
                                                                composer5.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-1543702066, i27, -1, "androidx.compose.material.FilterChip.<anonymous>.<anonymous>.<anonymous> (Chip.kt:212)");
                                                            }
                                                            Modifier.Companion companion = Modifier.INSTANCE;
                                                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.m5155defaultMinSizeVpY3zN4$default(Intrinsic3.width(companion, Intrinsic4.Max), 0.0f, Chip2.INSTANCE.m5551getMinHeightD9Ej5fM(), 1, null), (function218 != null || (z10 && function219 != null)) ? C2002Dp.m7995constructorimpl(0) : Chip3.HorizontalPadding, 0.0f, function220 == null ? Chip3.HorizontalPadding : C2002Dp.m7995constructorimpl(0), 0.0f, 10, null);
                                                            Arrangement arrangement = Arrangement.INSTANCE;
                                                            Arrangement.Horizontal start = arrangement.getStart();
                                                            Alignment.Companion companion2 = Alignment.INSTANCE;
                                                            Alignment.Vertical centerVertically = companion2.getCenterVertically();
                                                            Function2<Composer, Integer, Unit> function221 = function218;
                                                            boolean z12 = z10;
                                                            Function2<Composer, Integer, Unit> function222 = function219;
                                                            Function3<Row5, Composer, Integer, Unit> function34 = function33;
                                                            Function2<Composer, Integer, Unit> function223 = function220;
                                                            Chip5 chip56 = chip55;
                                                            boolean z13 = z11;
                                                            SnapshotState4<Color> snapshotState43 = snapshotState42;
                                                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, centerVertically, composer5, 54);
                                                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                                            CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer5, modifierM5146paddingqDBjuR0$default);
                                                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                                            if (composer5.getApplier() == null) {
                                                                Composables.invalidApplier();
                                                            }
                                                            composer5.startReusableNode();
                                                            if (composer5.getInserting()) {
                                                                composer5.createNode(constructor);
                                                            } else {
                                                                composer5.useNode();
                                                            }
                                                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer5);
                                                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                            }
                                                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                                            Row6 row62 = Row6.INSTANCE;
                                                            if (function221 != null || (z12 && function222 != null)) {
                                                                composer5.startReplaceGroup(692233385);
                                                                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, Chip3.LeadingIconStartSpacing), composer5, 6);
                                                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                                                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                                                CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                                                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer5, companion);
                                                                row6 = row62;
                                                                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                                                if (composer5.getApplier() == null) {
                                                                    Composables.invalidApplier();
                                                                }
                                                                composer5.startReusableNode();
                                                                if (composer5.getInserting()) {
                                                                    composer5.createNode(constructor2);
                                                                } else {
                                                                    composer5.useNode();
                                                                }
                                                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer5);
                                                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                                }
                                                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                                                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                                                if (function221 != null) {
                                                                    composer5.startReplaceGroup(1866339666);
                                                                    SnapshotState4<Color> snapshotState4LeadingIconColor = chip56.leadingIconColor(z13, z12, composer5, 0);
                                                                    CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColor.getLocalContentColor().provides(snapshotState4LeadingIconColor.getValue()), ContentAlpha2.getLocalContentAlpha().provides(Float.valueOf(Color.m6708getAlphaimpl(snapshotState4LeadingIconColor.getValue().getValue())))}, function221, composer5, ProvidedValue.$stable);
                                                                    composer5.endReplaceGroup();
                                                                } else {
                                                                    composer5.startReplaceGroup(1866780765);
                                                                    composer5.endReplaceGroup();
                                                                }
                                                                if (!z12 || function222 == null) {
                                                                    composer5.startReplaceGroup(1868134845);
                                                                    composer5.endReplaceGroup();
                                                                } else {
                                                                    composer5.startReplaceGroup(1866887467);
                                                                    long value = snapshotState43.getValue().getValue();
                                                                    if (function221 != null) {
                                                                        composer5.startReplaceGroup(1867062772);
                                                                        modifierClip = Clip.clip(Background3.m4871backgroundbw27NRU(SizeKt.m5162requiredSize3ABfNKs(companion, Chip3.SelectedIconContainerSize), snapshotState43.getValue().getValue(), RoundedCornerShape2.getCircleShape()), RoundedCornerShape2.getCircleShape());
                                                                        r7 = 0;
                                                                        value = chip56.backgroundColor(z13, z12, composer5, 0).getValue().getValue();
                                                                        composer5.endReplaceGroup();
                                                                    } else {
                                                                        r7 = 0;
                                                                        composer5.startReplaceGroup(1867624957);
                                                                        composer5.endReplaceGroup();
                                                                        modifierClip = companion;
                                                                    }
                                                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), r7);
                                                                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer5, r7);
                                                                    CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                                                                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer5, modifierClip);
                                                                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                                                                    if (composer5.getApplier() == null) {
                                                                        Composables.invalidApplier();
                                                                    }
                                                                    composer5.startReusableNode();
                                                                    if (composer5.getInserting()) {
                                                                        composer5.createNode(constructor3);
                                                                    } else {
                                                                        composer5.useNode();
                                                                    }
                                                                    Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer5);
                                                                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                                                                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                                                                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                                    }
                                                                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                                                                    CompositionLocal3.CompositionLocalProvider(ContentColor.getLocalContentColor().provides(Color.m6701boximpl(value)), function222, composer5, ProvidedValue.$stable);
                                                                    composer5.endNode();
                                                                    composer5.endReplaceGroup();
                                                                }
                                                                composer5.endNode();
                                                                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, Chip3.LeadingIconEndSpacing), composer5, 6);
                                                                composer5.endReplaceGroup();
                                                            } else {
                                                                composer5.startReplaceGroup(694250524);
                                                                composer5.endReplaceGroup();
                                                                row6 = row62;
                                                            }
                                                            Row6 row63 = row6;
                                                            Modifier modifierWeight$default = Row5.weight$default(row63, companion, 1.0f, false, 2, null);
                                                            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer5, 54);
                                                            int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                                            CompositionLocalMap currentCompositionLocalMap4 = composer5.getCurrentCompositionLocalMap();
                                                            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer5, modifierWeight$default);
                                                            Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                                                            if (composer5.getApplier() == null) {
                                                                Composables.invalidApplier();
                                                            }
                                                            composer5.startReusableNode();
                                                            if (composer5.getInserting()) {
                                                                composer5.createNode(constructor4);
                                                            } else {
                                                                composer5.useNode();
                                                            }
                                                            Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer5);
                                                            Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                                                            Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                                                            if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                                                composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                                composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                                            }
                                                            Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
                                                            function34.invoke(row63, composer5, 6);
                                                            composer5.endNode();
                                                            if (function223 != null) {
                                                                composer5.startReplaceGroup(694586006);
                                                                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, Chip3.TrailingIconSpacing), composer5, 6);
                                                                function223.invoke(composer5, 0);
                                                                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, Chip3.TrailingIconSpacing), composer5, 6);
                                                                composer5.endReplaceGroup();
                                                            } else {
                                                                composer5.startReplaceGroup(694776284);
                                                                composer5.endReplaceGroup();
                                                            }
                                                            composer5.endNode();
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }
                                                    }, composer4, 54), composer4, 48);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composer3, 54), composer3, ProvidedValue.$stable | 48);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composerStartRestartGroup, 54), composerStartRestartGroup, (i20 & 7294) | ((i20 >> 3) & 57344) | (i23 & 29360128) | ((i20 << 15) & 1879048192), 6, 256);
                                    composer2 = composerStartRestartGroup;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    shape2 = shape4;
                                    borderStroke3 = borderStroke2;
                                    interactionSource32 = interactionSource33;
                                    chip52 = chip53;
                                    function27 = function212;
                                    function25 = function213;
                                    function26 = function214;
                                    z4 = z7;
                                    modifier3 = modifier7;
                                } else {
                                    composer2 = composerStartRestartGroup;
                                    composer2.skipToGroupEnd();
                                    interactionSource32 = interactionSource3;
                                    chip52 = chip5;
                                    function25 = function22;
                                    function26 = function23;
                                    shape2 = shapeCopy;
                                    borderStroke3 = borderStroke2;
                                    modifier3 = modifier2;
                                    function27 = function24;
                                    z4 = z3;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ChipKt.FilterChip.3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i25) {
                                            Chip3.FilterChip(z, function0, modifier3, z4, interactionSource32, shape2, borderStroke3, chip52, function27, function25, function26, function3, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i14 |= 48;
                            i15 = i14;
                            if (composerStartRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i15 & 19) == 18) ? false : true, i4 & 1)) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i11 = i10;
                        i12 = i3 & 1024;
                        if (i12 == 0) {
                        }
                        if ((i3 & 2048) != 0) {
                        }
                        i15 = i14;
                        if (composerStartRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i15 & 19) == 18) ? false : true, i4 & 1)) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    if ((i & 196608) == 0) {
                    }
                    i8 = i3 & 64;
                    if (i8 != 0) {
                    }
                    if ((i & 12582912) == 0) {
                    }
                    i9 = i3 & 256;
                    if (i9 != 0) {
                    }
                    i10 = i3 & 512;
                    if (i10 != 0) {
                    }
                    i11 = i10;
                    i12 = i3 & 1024;
                    if (i12 == 0) {
                    }
                    if ((i3 & 2048) != 0) {
                    }
                    i15 = i14;
                    if (composerStartRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i15 & 19) == 18) ? false : true, i4 & 1)) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z3 = z2;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                if ((i & 196608) == 0) {
                }
                i8 = i3 & 64;
                if (i8 != 0) {
                }
                if ((i & 12582912) == 0) {
                }
                i9 = i3 & 256;
                if (i9 != 0) {
                }
                i10 = i3 & 512;
                if (i10 != 0) {
                }
                i11 = i10;
                i12 = i3 & 1024;
                if (i12 == 0) {
                }
                if ((i3 & 2048) != 0) {
                }
                i15 = i14;
                if (composerStartRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i15 & 19) == 18) ? false : true, i4 & 1)) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            z3 = z2;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            if ((i & 196608) == 0) {
            }
            i8 = i3 & 64;
            if (i8 != 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i9 = i3 & 256;
            if (i9 != 0) {
            }
            i10 = i3 & 512;
            if (i10 != 0) {
            }
            i11 = i10;
            i12 = i3 & 1024;
            if (i12 == 0) {
            }
            if ((i3 & 2048) != 0) {
            }
            i15 = i14;
            if (composerStartRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i15 & 19) == 18) ? false : true, i4 & 1)) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        modifier2 = modifier;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        z3 = z2;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        if ((i & 196608) == 0) {
        }
        i8 = i3 & 64;
        if (i8 != 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i9 = i3 & 256;
        if (i9 != 0) {
        }
        i10 = i3 & 512;
        if (i10 != 0) {
        }
        i11 = i10;
        i12 = i3 & 1024;
        if (i12 == 0) {
        }
        if ((i3 & 2048) != 0) {
        }
        i15 = i14;
        if (composerStartRestartGroup.shouldExecute(((i4 & 306783379) == 306783378 && (i15 & 19) == 18) ? false : true, i4 & 1)) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    static {
        float f = 8;
        LeadingIconEndSpacing = C2002Dp.m7995constructorimpl(f);
        TrailingIconSpacing = C2002Dp.m7995constructorimpl(f);
    }
}
