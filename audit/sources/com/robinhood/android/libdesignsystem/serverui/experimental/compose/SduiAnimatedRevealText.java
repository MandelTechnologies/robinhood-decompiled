package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAnimatedRevealText;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import rh_server_driven_ui.p531v1.AnimatedRevealTextDto;

/* compiled from: SduiAnimatedRevealText.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002"}, m3636d2 = {"SduiAnimatedRevealText", "", "component", "Lrh_server_driven_ui/v1/AnimatedRevealTextDto;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lrh_server_driven_ui/v1/AnimatedRevealTextDto;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-sdui_externalRelease", "currentWordIndex", "", "alpha", "", "offsetY", "Landroidx/compose/ui/unit/Dp;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAnimatedRevealTextKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiAnimatedRevealText {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiAnimatedRevealText$lambda$5(AnimatedRevealTextDto animatedRevealTextDto, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiAnimatedRevealText(animatedRevealTextDto, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SduiAnimatedRevealText(final AnimatedRevealTextDto component, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        long initial_delay;
        long interval;
        List listSplit$default;
        Object objRememberedValue;
        Composer.Companion companion;
        SnapshotIntState2 snapshotIntState2;
        boolean zChanged;
        Object objRememberedValue2;
        List list;
        SnapshotIntState2 snapshotIntState22;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(647981788);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changedInstance(component) ? 4 : 2);
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
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(647981788, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAnimatedRevealText (SduiAnimatedRevealText.kt:30)");
                }
                composerStartRestartGroup.startMovableGroup(-59752774, component);
                initial_delay = (long) (component.getInitial_delay() * 1000.0f);
                interval = (long) (component.getInterval() * 1000.0f);
                int duration = (int) (component.getDuration() * 1000.0f);
                String text = component.getText();
                long jM18897toComposeColorDefaultediJQMabo = SduiColors2.m18897toComposeColorDefaultediJQMabo(component.getColor(), 0L, composerStartRestartGroup, 0, 1);
                listSplit$default = StringsKt.split$default((CharSequence) text, new String[]{PlaceholderUtils.XXShortPlaceholderText}, false, 0, 6, (Object) null);
                Object[] objArr = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAnimatedRevealTextKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SduiAnimatedRevealText.SduiAnimatedRevealText$lambda$1$lambda$0();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup = composerStartRestartGroup;
                snapshotIntState2 = (SnapshotIntState2) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChanged = composerStartRestartGroup.changed(initial_delay) | composerStartRestartGroup.changedInstance(listSplit$default) | composerStartRestartGroup.changed(snapshotIntState2) | composerStartRestartGroup.changed(interval);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                    SduiAnimatedRevealText2 sduiAnimatedRevealText2 = new SduiAnimatedRevealText2(initial_delay, listSplit$default, interval, snapshotIntState2, null);
                    list = listSplit$default;
                    snapshotIntState22 = snapshotIntState2;
                    composerStartRestartGroup.updateRememberedValue(sduiAnimatedRevealText2);
                    objRememberedValue2 = sduiAnimatedRevealText2;
                } else {
                    snapshotIntState22 = snapshotIntState2;
                    list = listSplit$default;
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
                FlowLayoutKt.FlowRow(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), Arrangement.INSTANCE.getCenter(), null, null, 0, 0, ComposableLambda3.rememberComposableLambda(1979507658, true, new C207202(list, duration, jM18897toComposeColorDefaultediJQMabo, snapshotIntState22), composerStartRestartGroup, 54), composerStartRestartGroup, 1572912, 60);
                composerStartRestartGroup.endMovableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAnimatedRevealTextKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiAnimatedRevealText.SduiAnimatedRevealText$lambda$5(component, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            composerStartRestartGroup.startMovableGroup(-59752774, component);
            initial_delay = (long) (component.getInitial_delay() * 1000.0f);
            interval = (long) (component.getInterval() * 1000.0f);
            int duration2 = (int) (component.getDuration() * 1000.0f);
            String text2 = component.getText();
            long jM18897toComposeColorDefaultediJQMabo2 = SduiColors2.m18897toComposeColorDefaultediJQMabo(component.getColor(), 0L, composerStartRestartGroup, 0, 1);
            listSplit$default = StringsKt.split$default((CharSequence) text2, new String[]{PlaceholderUtils.XXShortPlaceholderText}, false, 0, 6, (Object) null);
            Object[] objArr2 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup = composerStartRestartGroup;
            snapshotIntState2 = (SnapshotIntState2) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
            Unit unit2 = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            zChanged = composerStartRestartGroup.changed(initial_delay) | composerStartRestartGroup.changedInstance(listSplit$default) | composerStartRestartGroup.changed(snapshotIntState2) | composerStartRestartGroup.changed(interval);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                SduiAnimatedRevealText2 sduiAnimatedRevealText22 = new SduiAnimatedRevealText2(initial_delay, listSplit$default, interval, snapshotIntState2, null);
                list = listSplit$default;
                snapshotIntState22 = snapshotIntState2;
                composerStartRestartGroup.updateRememberedValue(sduiAnimatedRevealText22);
                objRememberedValue2 = sduiAnimatedRevealText22;
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
                FlowLayoutKt.FlowRow(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), Arrangement.INSTANCE.getCenter(), null, null, 0, 0, ComposableLambda3.rememberComposableLambda(1979507658, true, new C207202(list, duration2, jM18897toComposeColorDefaultediJQMabo2, snapshotIntState22), composerStartRestartGroup, 54), composerStartRestartGroup, 1572912, 60);
                composerStartRestartGroup.endMovableGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotIntState2 SduiAnimatedRevealText$lambda$1$lambda$0() {
        return SnapshotIntState3.mutableIntStateOf(-1);
    }

    /* compiled from: SduiAnimatedRevealText.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAnimatedRevealTextKt$SduiAnimatedRevealText$2 */
    static final class C207202 implements Function3<FlowRowScope, Composer, Integer, Unit> {
        final /* synthetic */ int $animationDuration;
        final /* synthetic */ SnapshotIntState2 $currentWordIndex$delegate;
        final /* synthetic */ long $textColor;
        final /* synthetic */ List<String> $words;

        C207202(List<String> list, int i, long j, SnapshotIntState2 snapshotIntState2) {
            this.$words = list;
            this.$animationDuration = i;
            this.$textColor = j;
            this.$currentWordIndex$delegate = snapshotIntState2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(FlowRowScope flowRowScope, Composer composer, Integer num) {
            invoke(flowRowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$2(SnapshotState4 snapshotState4, SnapshotState4 snapshotState42, GraphicsLayerScope graphicsLayer) {
            Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
            graphicsLayer.setTranslationY(graphicsLayer.mo5016toPx0680j_4(invoke$lambda$4$lambda$1(snapshotState4)));
            graphicsLayer.setAlpha(invoke$lambda$4$lambda$0(snapshotState42));
            return Unit.INSTANCE;
        }

        private static final float invoke$lambda$4$lambda$0(SnapshotState4<Float> snapshotState4) {
            return snapshotState4.getValue().floatValue();
        }

        private static final float invoke$lambda$4$lambda$1(SnapshotState4<C2002Dp> snapshotState4) {
            return snapshotState4.getValue().getValue();
        }

        public final void invoke(FlowRowScope FlowRow, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1979507658, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAnimatedRevealText.<anonymous>.<anonymous> (SduiAnimatedRevealText.kt:53)");
            }
            List<String> list = this.$words;
            int i2 = this.$animationDuration;
            long j = this.$textColor;
            SnapshotIntState2 snapshotIntState2 = this.$currentWordIndex$delegate;
            int i3 = 0;
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String str = (String) obj;
                int i6 = i4 <= SduiAnimatedRevealText.SduiAnimatedRevealText$lambda$2(snapshotIntState2) ? 1 : i3;
                final SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(i6 != 0 ? 1.0f : 0.0f, AnimationSpecKt.tween$default(i2, i3, null, 6, null), 0.0f, null, null, composer, 0, 28);
                final SnapshotState4<C2002Dp> snapshotState4M4812animateDpAsStateAjpBEmI = AnimateAsState.m4812animateDpAsStateAjpBEmI(C2002Dp.m7995constructorimpl(i6 != 0 ? i3 : 30), AnimationSpecKt.tween$default(i2, i3, null, 6, null), null, null, composer, 0, 12);
                String str2 = i4 < CollectionsKt.getLastIndex(list) ? str + PlaceholderUtils.XXShortPlaceholderText : str;
                TextStyle displayCapsuleLarge = BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getDisplayCapsuleLarge();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = composer.changed(snapshotState4M4812animateDpAsStateAjpBEmI) | composer.changed(snapshotState4AnimateFloatAsState);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAnimatedRevealTextKt$SduiAnimatedRevealText$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return SduiAnimatedRevealText.C207202.invoke$lambda$4$lambda$3$lambda$2(snapshotState4M4812animateDpAsStateAjpBEmI, snapshotState4AnimateFloatAsState, (GraphicsLayerScope) obj2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                BentoText2.m20747BentoText38GnDrw(str2, GraphicsLayerModifier6.graphicsLayer(companion, (Function1) objRememberedValue), Color.m6701boximpl(j), null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleLarge, composer, 0, 0, 8184);
                i4 = i5;
                i2 = i2;
                j = j;
                snapshotIntState2 = snapshotIntState2;
                list = list;
                i3 = i3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int SduiAnimatedRevealText$lambda$2(SnapshotIntState2 snapshotIntState2) {
        return snapshotIntState2.getIntValue();
    }
}
