package com.robinhood.android.blackwidow.p068ui.upsell;

import android.content.Context;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import coil.compose.SingletonAsyncImagePainter;
import coil.request.ImageRequest;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.blackwidow.p068ui.upsell.ExploreLegendUpsellViewState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import timber.log.Timber;

/* compiled from: ExploreLegendUpsellComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
final class ExploreLegendUpsellComposableKt$MainLazilyLoadedContent$1$1$2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ ExploreLegendUpsellViewState.Ready $state;
    final /* synthetic */ SnapshotState<Boolean> $useHeaderImage$delegate;

    ExploreLegendUpsellComposableKt$MainLazilyLoadedContent$1$1$2(ExploreLegendUpsellViewState.Ready ready, SnapshotState<Boolean> snapshotState) {
        this.$state = ready;
        this.$useHeaderImage$delegate = snapshotState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult invoke$lambda$3$lambda$2(final SnapshotState snapshotState, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new DisposableEffectResult() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$MainLazilyLoadedContent$1$1$2$invoke$lambda$3$lambda$2$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                Timber.INSTANCE.mo3350d("Hero video disposed", new Object[0]);
                ExploreLegendUpsellComposableKt.MainLazilyLoadedContent$lambda$11(snapshotState, true);
            }
        };
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
            ComposerKt.traceEventStart(161394805, i, -1, "com.robinhood.android.blackwidow.ui.upsell.MainLazilyLoadedContent.<anonymous>.<anonymous>.<anonymous> (ExploreLegendUpsellComposable.kt:259)");
        }
        if (ExploreLegendUpsellComposableKt.MainLazilyLoadedContent$lambda$10(this.$useHeaderImage$delegate)) {
            composer.startReplaceGroup(2044281939);
            ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageRequest.Builder((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(this.$state.getHeroImageUrl()).build(), null, null, null, 0, null, composer, 0, 62), "hero image", SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ICON_STEP_COMPLETE_VALUE)), (Alignment) null, ContentScale.INSTANCE.getFillWidth(), 0.0f, (ColorFilter) null, composer, 25008, 104);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(2044820874);
            VideoInfo videoInfo = this.$state.getVideoInfo().get("01_hero_intro");
            composer.startReplaceGroup(481606660);
            if (videoInfo != null) {
                ExploreLegendUpsellComposableKt.VideoContent(videoInfo, null, false, composer, 384, 2);
                Unit unit = Unit.INSTANCE;
            }
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(this.$useHeaderImage$delegate);
            final SnapshotState<Boolean> snapshotState = this.$useHeaderImage$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.blackwidow.ui.upsell.ExploreLegendUpsellComposableKt$MainLazilyLoadedContent$1$1$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ExploreLegendUpsellComposableKt$MainLazilyLoadedContent$1$1$2.invoke$lambda$3$lambda$2(snapshotState, (DisposableEffectScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            EffectsKt.DisposableEffect("hero-video", (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer, 6);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
