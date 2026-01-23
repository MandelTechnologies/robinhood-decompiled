package com.robinhood.android.common.gold;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoAppBarWithTransition.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.gold.BentoAppBarWithTransitionKt$BentoAppBarWithTransition$2, reason: use source file name */
/* loaded from: classes2.dex */
final class BentoAppBarWithTransition3 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState4<Float> $alpha$delegate;
    final /* synthetic */ SnapshotState<C2002Dp> $appBarHeight$delegate;
    final /* synthetic */ Density $density;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function3<BentoAppBarScope, Composer, Integer, Unit> $navigationIcon;
    final /* synthetic */ Function1<C2002Dp, Unit> $onAppBarHeightUpdated;
    final /* synthetic */ long $titleColor;
    final /* synthetic */ String $titleText;

    /* JADX WARN: Multi-variable type inference failed */
    BentoAppBarWithTransition3(Modifier modifier, Function1<? super C2002Dp, Unit> function1, Function3<? super BentoAppBarScope, ? super Composer, ? super Integer, Unit> function3, Density density, SnapshotState<C2002Dp> snapshotState, String str, long j, SnapshotState4<Float> snapshotState4) {
        this.$modifier = modifier;
        this.$onAppBarHeightUpdated = function1;
        this.$navigationIcon = function3;
        this.$density = density;
        this.$appBarHeight$delegate = snapshotState;
        this.$titleText = str;
        this.$titleColor = j;
        this.$alpha$delegate = snapshotState4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2054153772, i, -1, "com.robinhood.android.common.gold.BentoAppBarWithTransition.<anonymous> (BentoAppBarWithTransition.kt:74)");
        }
        Modifier modifierOnGloballyPositioned = null;
        Modifier modifierStatusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.fillMaxWidth$default(this.$modifier, 0.0f, 1, null));
        final Function1<C2002Dp, Unit> function1 = this.$onAppBarHeightUpdated;
        composer.startReplaceGroup(1643200465);
        if (function1 != null) {
            final Density density = this.$density;
            final SnapshotState<C2002Dp> snapshotState = this.$appBarHeight$delegate;
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(-1746271574);
            boolean zChanged = composer.changed(density) | composer.changed(function1);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.common.gold.BentoAppBarWithTransitionKt$BentoAppBarWithTransition$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BentoAppBarWithTransition3.invoke$lambda$3$lambda$2$lambda$1(density, function1, snapshotState, (LayoutCoordinates) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(companion, (Function1) objRememberedValue);
        }
        composer.endReplaceGroup();
        if (modifierOnGloballyPositioned == null) {
            modifierOnGloballyPositioned = Modifier.INSTANCE;
        }
        Modifier modifierThen = modifierStatusBarsPadding.then(modifierOnGloballyPositioned);
        final String str = this.$titleText;
        final long j = this.$titleColor;
        final SnapshotState4<Float> snapshotState4 = this.$alpha$delegate;
        BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableLambda3.rememberComposableLambda(-1065514937, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.gold.BentoAppBarWithTransitionKt$BentoAppBarWithTransition$2.2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                if ((i2 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1065514937, i2, -1, "com.robinhood.android.common.gold.BentoAppBarWithTransition.<anonymous>.<anonymous> (BentoAppBarWithTransition.kt:76)");
                }
                String str2 = str;
                if (str2 != null) {
                    BentoText2.m20747BentoText38GnDrw(str2, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Color.m6701boximpl(Color.m6705copywmQWz5c$default(j, BentoAppBarWithTransition.BentoAppBarWithTransition_zVdqMik$lambda$4(snapshotState4), 0.0f, 0.0f, 0.0f, 14, null)), null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 48, 0, 16376);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), modifierThen, this.$navigationIcon, null, null, true, false, null, null, 0L, null, composer, 196614, 0, 2008);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2$lambda$1(Density density, Function1 function1, SnapshotState snapshotState, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        float fMo5013toDpu2uoSUM = density.mo5013toDpu2uoSUM((int) (coordinates.mo7241getSizeYbymL2g() & 4294967295L));
        if (!C2002Dp.m7997equalsimpl0(BentoAppBarWithTransition.BentoAppBarWithTransition_zVdqMik$lambda$7(snapshotState), fMo5013toDpu2uoSUM)) {
            BentoAppBarWithTransition.BentoAppBarWithTransition_zVdqMik$lambda$8(snapshotState, fMo5013toDpu2uoSUM);
            function1.invoke(C2002Dp.m7993boximpl(fMo5013toDpu2uoSUM));
        }
        return Unit.INSTANCE;
    }
}
