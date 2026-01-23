package com.robinhood.android.crypto.costbasis.hub;

import android.content.Context;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoInfoBanner2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.utils.extensions.StringsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoCostBasisHubComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class CryptoCostBasisHubComposableKt$section$2$1 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ String $markdown;

    CryptoCostBasisHubComposableKt$section$2$1(String str) {
        this.$markdown = str;
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
            ComposerKt.traceEventStart(171951373, i, -1, "com.robinhood.android.crypto.costbasis.hub.section.<anonymous>.<anonymous> (CryptoCostBasisHubComposable.kt:242)");
        }
        final Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        final Navigator navigator = (Navigator) composer.consume(LocalNavigator.getLocalNavigator());
        Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
        long jM21799getUrgentForeground0d7_KjU = ((Styles) composer.consume(Styles2.getLocalStyles())).getInfoBanner(composer, 0).getColors().m21799getUrgentForeground0d7_KjU();
        long jM21798getUrgentBackground0d7_KjU = ((Styles) composer.consume(Styles2.getLocalStyles())).getInfoBanner(composer, 0).getColors().m21798getUrgentBackground0d7_KjU();
        String str = this.$markdown;
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(navigator) | composer.changedInstance(context);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt$section$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoCostBasisHubComposableKt$section$2$1.invoke$lambda$1$lambda$0(navigator, context, (String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoInfoBanner2.m20652BentoInfoBannerRakH_j8(str, jM21799getUrgentForeground0d7_KjU, jM21798getUrgentBackground0d7_KjU, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, null, null, null, (Function1) objRememberedValue, composer, 0, 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Navigator navigator, Context context, String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (StringsKt.isHelpCenterUrl(uri)) {
            Navigators3.showHelpCenterWebViewFragment(navigator, context, uri);
        } else {
            WebUtils.viewUrl$default(context, uri, 0, 4, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
