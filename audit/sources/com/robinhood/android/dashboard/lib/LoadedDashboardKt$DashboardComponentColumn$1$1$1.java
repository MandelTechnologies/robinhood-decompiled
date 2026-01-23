package com.robinhood.android.dashboard.lib;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.search.contracts.SearchFragmentKey;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.home.component.DashboardComponent;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsComposableKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LoadedDashboard.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class LoadedDashboardKt$DashboardComponentColumn$1$1$1 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ DashboardComponent $component;

    LoadedDashboardKt$DashboardComponentColumn$1$1$1(DashboardComponent dashboardComponent) {
        this.$component = dashboardComponent;
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
            ComposerKt.traceEventStart(-1642400426, i, -1, "com.robinhood.android.dashboard.lib.DashboardComponentColumn.<anonymous>.<anonymous>.<anonymous> (LoadedDashboard.kt:92)");
        }
        final Navigator navigator = (Navigator) composer.consume(LocalNavigator.getLocalNavigator());
        final Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
        composer.startReplaceGroup(-1746271574);
        boolean zChangedInstance = composer.changedInstance(navigator) | composer.changedInstance(context) | composer.changedInstance(this.$component);
        final DashboardComponent dashboardComponent = this.$component;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.dashboard.lib.LoadedDashboardKt$DashboardComponentColumn$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LoadedDashboardKt$DashboardComponentColumn$1$1$1.invoke$lambda$1$lambda$0(navigator, context, dashboardComponent);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        MenuOfOptionsComposableKt.FirstTradeUpsellBanner(modifierM5146paddingqDBjuR0$default, null, (Function0) objRememberedValue, composer, 0, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Navigator navigator, Context context, DashboardComponent dashboardComponent) {
        Navigator.DefaultImpls.showFragment$default(navigator, context, new SearchFragmentKey(null, null, ((DashboardComponent.FirstTradeUpsellSection) dashboardComponent).getAccountNumber(), null, new Screen(Screen.Name.HOME, null, null, null, 14, null), null, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }
}
