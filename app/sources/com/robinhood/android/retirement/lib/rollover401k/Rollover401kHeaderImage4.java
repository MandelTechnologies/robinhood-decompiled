package com.robinhood.android.retirement.lib.rollover401k;

import android.content.Context;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.compose.AsyncImagePainter;
import coil.compose.SingletonAsyncImagePainter;
import coil.request.ImageRequest;
import coil.size.Size;
import com.google.accompanist.systemuicontroller.SystemUiController3;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Rollover401kHeaderImage.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.retirement.lib.rollover401k.Rollover401kHeaderImageKt$RolloverHeaderImage$1, reason: use source file name */
/* loaded from: classes5.dex */
final class Rollover401kHeaderImage4 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState<C2002Dp> $defaultMinHeight$delegate;
    final /* synthetic */ String $imageUrl;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0<Unit> $onBackPressed;

    Rollover401kHeaderImage4(Modifier modifier, SnapshotState<C2002Dp> snapshotState, String str, Function0<Unit> function0) {
        this.$modifier = modifier;
        this.$defaultMinHeight$delegate = snapshotState;
        this.$imageUrl = str;
        this.$onBackPressed = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2$lambda$1(SnapshotState snapshotState, AsyncImagePainter.State it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it instanceof AsyncImagePainter.State.Success) {
            snapshotState.setValue(null);
        }
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-96365491, i, -1, "com.robinhood.android.retirement.lib.rollover401k.RolloverHeaderImage.<anonymous> (Rollover401kHeaderImage.kt:40)");
        }
        SystemUiController3.rememberSystemUiController(null, composer, 0, 1).setStatusBarDarkContentEnabled(true);
        Alignment.Companion companion = Alignment.INSTANCE;
        Alignment topCenter = companion.getTopCenter();
        Modifier modifierM5155defaultMinSizeVpY3zN4$default = this.$modifier;
        boolean z = Rollover401kHeaderImage3.RolloverHeaderImage_IColEu4$lambda$1(this.$defaultMinHeight$delegate) != null;
        SnapshotState<C2002Dp> snapshotState = this.$defaultMinHeight$delegate;
        if (z) {
            C2002Dp c2002DpRolloverHeaderImage_IColEu4$lambda$1 = Rollover401kHeaderImage3.RolloverHeaderImage_IColEu4$lambda$1(snapshotState);
            modifierM5155defaultMinSizeVpY3zN4$default = SizeKt.m5155defaultMinSizeVpY3zN4$default(modifierM5155defaultMinSizeVpY3zN4$default, 0.0f, c2002DpRolloverHeaderImage_IColEu4$lambda$1 != null ? c2002DpRolloverHeaderImage_IColEu4$lambda$1.getValue() : C2002Dp.m7995constructorimpl(0), 1, null);
        }
        Modifier modifierTestTag = TestTag3.testTag(Background3.background$default(modifierM5155defaultMinSizeVpY3zN4$default, Brush.Companion.m6679linearGradientmHitzGk$default(Brush.INSTANCE, new Tuples2[]{Tuples4.m3642to(Float.valueOf(0.0f), Color.m6701boximpl(Color2.Color(4291032380L))), Tuples4.m3642to(Float.valueOf(0.53f), Color.m6701boximpl(Color2.Color(4288933427L))), Tuples4.m3642to(Float.valueOf(0.77f), Color.m6701boximpl(Color2.Color(4286047014L))), Tuples4.m3642to(Float.valueOf(1.0f), Color.m6701boximpl(Color2.Color(4278241285L)))}, 0L, 0L, 0, 14, (Object) null), null, 0.0f, 6, null), "headerImage");
        String str = this.$imageUrl;
        final SnapshotState<C2002Dp> snapshotState2 = this.$defaultMinHeight$delegate;
        Function0<Unit> function0 = this.$onBackPressed;
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(topCenter, false);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierTestTag);
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        if (composer.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        ImageRequest imageRequestBuild = new ImageRequest.Builder((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(str).size(Size.ORIGINAL).build();
        composer.startReplaceGroup(5004770);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.retirement.lib.rollover401k.Rollover401kHeaderImageKt$RolloverHeaderImage$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Rollover401kHeaderImage4.invoke$lambda$3$lambda$2$lambda$1(snapshotState2, (AsyncImagePainter.State) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        AsyncImagePainter asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg = SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(imageRequestBuild, null, (Function1) objRememberedValue, null, 0, null, composer, 384, 58);
        ContentScale fillWidth = ContentScale.INSTANCE.getFillWidth();
        Alignment topCenter2 = companion.getTopCenter();
        Modifier.Companion companion3 = Modifier.INSTANCE;
        ImageKt.Image(asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg, (String) null, boxScopeInstance.align(WindowInsetsPadding_androidKt.systemBarsPadding(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null)), companion.getBottomCenter()), topCenter2, fillWidth, 0.0f, (ColorFilter) null, composer, 27696, 96);
        BentoAppBarKt.m20573BentoAppBarSGdaT3c(Rollover401kHeaderImage.INSTANCE.m18134getLambda$555861888$lib_retirement_externalDebug(), WindowInsetsPadding_androidKt.systemBarsPadding(companion3), ComposableLambda3.rememberComposableLambda(-2119265580, true, new Rollover401kHeaderImage5(function0), composer, 54), null, null, true, false, null, null, 0L, null, composer, 196998, 0, 2008);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
