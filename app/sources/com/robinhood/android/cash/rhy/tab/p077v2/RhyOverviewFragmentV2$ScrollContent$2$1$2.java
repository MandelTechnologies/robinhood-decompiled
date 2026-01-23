package com.robinhood.android.cash.rhy.tab.p077v2;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.cash.rhy.tab.p077v2.p078ui.RhyOverviewCarouselOrNuxComposable;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.targetbackend.TargetBackend;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RhyOverviewFragmentV2.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
final class RhyOverviewFragmentV2$ScrollContent$2$1$2 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ RhyOverviewFragmentV2 this$0;

    RhyOverviewFragmentV2$ScrollContent$2$1$2(RhyOverviewFragmentV2 rhyOverviewFragmentV2) {
        this.this$0 = rhyOverviewFragmentV2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(489008705, i, -1, "com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2.ScrollContent.<anonymous>.<anonymous>.<anonymous> (RhyOverviewFragmentV2.kt:376)");
        }
        Navigator navigator = this.this$0.getNavigator();
        Markwon markwon = this.this$0.getMarkwon();
        ImageLoader imageLoader = this.this$0.getImageLoader();
        TargetBackend targetBackend = this.this$0.getTargetBackend();
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(this.this$0);
        final RhyOverviewFragmentV2 rhyOverviewFragmentV2 = this.this$0;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.RhyOverviewFragmentV2$ScrollContent$2$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RhyOverviewFragmentV2$ScrollContent$2$1$2.invoke$lambda$1$lambda$0(rhyOverviewFragmentV2);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        RhyOverviewCarouselOrNuxComposable.CarouselOrNuxComposable(navigator, markwon, imageLoader, (Function0) objRememberedValue, targetBackend, null, null, composer, 0, 96);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(RhyOverviewFragmentV2 rhyOverviewFragmentV2) {
        if (rhyOverviewFragmentV2.getTargetBackend().isApollo()) {
            rhyOverviewFragmentV2.showDebugAddCardToGooglePay();
        } else {
            rhyOverviewFragmentV2.getDuxo().getPushTokenizeEvent();
        }
        return Unit.INSTANCE;
    }
}
