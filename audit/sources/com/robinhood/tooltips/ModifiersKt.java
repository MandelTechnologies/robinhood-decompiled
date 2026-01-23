package com.robinhood.tooltips;

import android.view.View;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.LayoutCoordinates2;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.robinhood.tooltips.ModifiersKt;
import com.robinhood.tooltips.TooltipData;
import com.robinhood.tooltips.TooltipManager;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Modifiers.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a>\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b\u001a\u0012\u0010\f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\r\u001a\u00020\t\u001a0\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0012H\u0002¨\u0006\u0016²\u0006\n\u0010\u0017\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0014X\u008a\u008e\u0002"}, m3636d2 = {"tooltip", "Landroidx/compose/ui/Modifier;", "text", "", "layout", "Lcom/robinhood/tooltips/TooltipData$Layout;", "behavior", "Lcom/robinhood/tooltips/TooltipData$Behavior;", "id", "", "removeOnDispose", "", "updateTooltipCanvas", "tag", "onGlobalPositionUpdated", "tooltipData", "Lcom/robinhood/tooltips/TooltipData;", "onGlobalPosition", "Lkotlin/Function2;", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/unit/IntSize;", "", "lib-design-system-tooltips_externalDebug", "offsetInRoot", "size"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ModifiersKt {
    public static /* synthetic */ Modifier tooltip$default(Modifier modifier, CharSequence charSequence, TooltipData.Layout layout, TooltipData.Behavior behavior, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            layout = new TooltipData.Layout(null, 0.0f, null, null, 15, null);
        }
        if ((i & 4) != 0) {
            behavior = new TooltipData.Behavior(null, null, null, null, 15, null);
        }
        if ((i & 8) != 0) {
            str = null;
        }
        if ((i & 16) != 0) {
            z = false;
        }
        return tooltip(modifier, charSequence, layout, behavior, str, z);
    }

    /* compiled from: Modifiers.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.tooltips.ModifiersKt$tooltip$1 */
    static final class C416621 implements Function3<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ TooltipData.Behavior $behavior;
        final /* synthetic */ String $id;
        final /* synthetic */ TooltipData.Layout $layout;
        final /* synthetic */ boolean $removeOnDispose;
        final /* synthetic */ CharSequence $text;

        C416621(String str, boolean z, CharSequence charSequence, TooltipData.Layout layout, TooltipData.Behavior behavior) {
            this.$id = str;
            this.$removeOnDispose = z;
            this.$text = charSequence;
            this.$layout = layout;
            this.$behavior = behavior;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        public final Modifier invoke(Modifier composed, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            composer.startReplaceGroup(1299793190);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1299793190, i, -1, "com.robinhood.tooltips.tooltip.<anonymous> (Modifiers.kt:49)");
            }
            String str = this.$id;
            composer.startReplaceGroup(-734227009);
            if (str == null) {
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = UUID.randomUUID().toString();
                    Intrinsics.checkNotNullExpressionValue(objRememberedValue, "toString(...)");
                    composer.updateRememberedValue(objRememberedValue);
                }
                str = (String) objRememberedValue;
                composer.endReplaceGroup();
            }
            final String str2 = str;
            composer.endReplaceGroup();
            final TooltipManager current = LocalTooltipManager.getLocalTooltipManager().getCurrent(composer, 6);
            View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(view) | composer.changedInstance(current) | composer.changed(str2);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new ModifiersKt$tooltip$1$1$1(view, current, str2, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(str2, view, (Function2) objRememberedValue2, composer, 0);
            Unit unit = Unit.INSTANCE;
            composer.startReplaceGroup(-1746271574);
            boolean zChanged = composer.changed(this.$removeOnDispose) | composer.changedInstance(current) | composer.changed(str2);
            final boolean z = this.$removeOnDispose;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.tooltips.ModifiersKt$tooltip$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ModifiersKt.C416621.invoke$lambda$4$lambda$3(z, current, str2, (DisposableEffectScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composer, 6);
            CharSequence charSequence = this.$text;
            TooltipData tooltipData = charSequence != null ? new TooltipData(str2, charSequence, null, this.$layout, this.$behavior, 4, null) : null;
            CharSequence charSequence2 = this.$text;
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance2 = composer.changedInstance(tooltipData) | composer.changedInstance(current) | composer.changed(str2);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new ModifiersKt$tooltip$1$3$1(tooltipData, current, str2, null);
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(charSequence2, str2, (Function2) objRememberedValue4, composer, 0);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance3 = composer.changedInstance(current) | composer.changed(str2);
            Object objRememberedValue5 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new Function2() { // from class: com.robinhood.tooltips.ModifiersKt$tooltip$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ModifiersKt.C416621.invoke$lambda$9$lambda$8(current, str2, (Offset) obj, (IntSize) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceGroup();
            Modifier modifierOnGlobalPositionUpdated = ModifiersKt.onGlobalPositionUpdated(composed, tooltipData, (Function2) objRememberedValue5);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return modifierOnGlobalPositionUpdated;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DisposableEffectResult invoke$lambda$4$lambda$3(final boolean z, final TooltipManager tooltipManager, final String str, DisposableEffectScope DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new DisposableEffectResult() { // from class: com.robinhood.tooltips.ModifiersKt$tooltip$1$invoke$lambda$4$lambda$3$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    if (z) {
                        tooltipManager.removeTooltip(str);
                    }
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$9$lambda$8(TooltipManager tooltipManager, String str, final Offset offset, final IntSize intSize) {
            TooltipManager.DefaultImpls.updateTooltip$default(tooltipManager, str, false, new Function1() { // from class: com.robinhood.tooltips.ModifiersKt$tooltip$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ModifiersKt.C416621.invoke$lambda$9$lambda$8$lambda$7(offset, intSize, (TooltipData) obj);
                }
            }, 2, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final TooltipData invoke$lambda$9$lambda$8$lambda$7(Offset offset, IntSize intSize, TooltipData updateTooltip) {
            Intrinsics.checkNotNullParameter(updateTooltip, "$this$updateTooltip");
            return TooltipData.copy$default(updateTooltip, null, null, new TooltipData.Target(new TooltipData.Coordinates(Float.intBitsToFloat((int) (offset.getPackedValue() >> 32)), Float.intBitsToFloat((int) (offset.getPackedValue() & 4294967295L))), new TooltipData.Dimensions((int) (intSize.getPackedValue() & 4294967295L), (int) (intSize.getPackedValue() >> 32))), null, null, 27, null);
        }
    }

    public static final Modifier tooltip(Modifier modifier, CharSequence charSequence, TooltipData.Layout layout, TooltipData.Behavior behavior, String str, boolean z) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        return ComposedModifier2.composed$default(modifier, null, new C416621(str, z, charSequence, layout, behavior), 1, null);
    }

    /* compiled from: Modifiers.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.tooltips.ModifiersKt$updateTooltipCanvas$1 */
    static final class C416631 implements Function3<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ String $tag;

        C416631(String str) {
            this.$tag = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DisposableEffectResult invoke$lambda$2$lambda$1(final TooltipManager tooltipManager, final String str, DisposableEffectScope DisposableEffect) {
            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
            return new DisposableEffectResult() { // from class: com.robinhood.tooltips.ModifiersKt$updateTooltipCanvas$1$invoke$lambda$2$lambda$1$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    tooltipManager.removeComposeViewCanvas(str);
                }
            };
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        public final Modifier invoke(Modifier composed, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            composer.startReplaceGroup(721159610);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(721159610, i, -1, "com.robinhood.tooltips.updateTooltipCanvas.<anonymous> (Modifiers.kt:112)");
            }
            final TooltipManager current = LocalTooltipManager.getLocalTooltipManager().getCurrent(composer, 6);
            Unit unit = Unit.INSTANCE;
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(current) | composer.changed(this.$tag);
            final String str = this.$tag;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.tooltips.ModifiersKt$updateTooltipCanvas$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ModifiersKt.C416631.invoke$lambda$2$lambda$1(current, str, (DisposableEffectScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer, 6);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance2 = composer.changedInstance(current) | composer.changed(this.$tag);
            final String str2 = this.$tag;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.tooltips.ModifiersKt$updateTooltipCanvas$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ModifiersKt.C416631.invoke$lambda$4$lambda$3(current, str2, (LayoutCoordinates) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(composed, (Function1) objRememberedValue2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return modifierOnGloballyPositioned;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3(TooltipManager tooltipManager, String str, LayoutCoordinates layoutCoordinates) {
            Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
            Rect rectBoundsInRoot = LayoutCoordinates2.boundsInRoot(layoutCoordinates);
            tooltipManager.setComposeViewCanvas(str, new android.graphics.Rect((int) rectBoundsInRoot.getLeft(), (int) rectBoundsInRoot.getTop(), (int) rectBoundsInRoot.getRight(), (int) rectBoundsInRoot.getBottom()));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: Modifiers.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.tooltips.ModifiersKt$onGlobalPositionUpdated$1 */
    static final class C416611 implements Function3<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ Function2<Offset, IntSize, Unit> $onGlobalPosition;
        final /* synthetic */ TooltipData $tooltipData;

        /* JADX WARN: Multi-variable type inference failed */
        C416611(TooltipData tooltipData, Function2<? super Offset, ? super IntSize, Unit> function2) {
            this.$tooltipData = tooltipData;
            this.$onGlobalPosition = function2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long invoke$lambda$1(SnapshotState<Offset> snapshotState) {
            return snapshotState.getValue().getPackedValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long invoke$lambda$4(SnapshotState<IntSize> snapshotState) {
            return snapshotState.getValue().getPackedValue();
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        private static final void invoke$lambda$2(SnapshotState<Offset> snapshotState, long j) {
            snapshotState.setValue(Offset.m6534boximpl(j));
        }

        private static final void invoke$lambda$5(SnapshotState<IntSize> snapshotState, long j) {
            snapshotState.setValue(IntSize.m8055boximpl(j));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$7(SnapshotState snapshotState, SnapshotState snapshotState2, LayoutCoordinates coordinates) {
            Intrinsics.checkNotNullParameter(coordinates, "coordinates");
            invoke$lambda$2(snapshotState, LayoutCoordinates2.positionInWindow(coordinates));
            invoke$lambda$5(snapshotState2, coordinates.mo7241getSizeYbymL2g());
            return Unit.INSTANCE;
        }

        public final Modifier invoke(Modifier composed, Composer composer, int i) {
            long j;
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            composer.startReplaceGroup(-852889388);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-852889388, i, -1, "com.robinhood.tooltips.onGlobalPositionUpdated.<anonymous> (Modifiers.kt:136)");
            }
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                j = 4294967295L;
                objRememberedValue = SnapshotState3.mutableStateOf$default(Offset.m6534boximpl(Offset.m6535constructorimpl((Float.floatToRawIntBits(-1.0f) & 4294967295L) | (Float.floatToRawIntBits(-1.0f) << 32))), null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            } else {
                j = 4294967295L;
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                long j2 = -1;
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(IntSize.m8055boximpl(IntSize.m8056constructorimpl((j2 & j) | (j2 << 32))), null, 2, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
            composer.endReplaceGroup();
            Offset offsetM6534boximpl = Offset.m6534boximpl(invoke$lambda$1(snapshotState));
            IntSize intSizeM8055boximpl = IntSize.m8055boximpl(invoke$lambda$4(snapshotState2));
            TooltipData tooltipData = this.$tooltipData;
            composer.startReplaceGroup(-1746271574);
            boolean zChanged = composer.changed(this.$onGlobalPosition);
            Function2<Offset, IntSize, Unit> function2 = this.$onGlobalPosition;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new ModifiersKt$onGlobalPositionUpdated$1$1$1(function2, snapshotState, snapshotState2, null);
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(offsetM6534boximpl, intSizeM8055boximpl, tooltipData, (Function2) objRememberedValue3, composer, 0);
            composer.startReplaceGroup(-1633490746);
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.tooltips.ModifiersKt$onGlobalPositionUpdated$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ModifiersKt.C416611.invoke$lambda$8$lambda$7(snapshotState, snapshotState2, (LayoutCoordinates) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(composed, (Function1) objRememberedValue4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return modifierOnGloballyPositioned;
        }
    }

    public static final Modifier updateTooltipCanvas(Modifier modifier, String tag) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        return ComposedModifier2.composed$default(modifier, null, new C416631(tag), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier onGlobalPositionUpdated(Modifier modifier, TooltipData tooltipData, Function2<? super Offset, ? super IntSize, Unit> function2) {
        return ComposedModifier2.composed$default(modifier, null, new C416611(tooltipData, function2), 1, null);
    }
}
