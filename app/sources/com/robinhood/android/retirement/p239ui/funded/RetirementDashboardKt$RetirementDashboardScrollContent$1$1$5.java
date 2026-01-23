package com.robinhood.android.retirement.p239ui.funded;

import android.content.Context;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.dashboard.lib.C13691R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RetirementDashboard.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
final class RetirementDashboardKt$RetirementDashboardScrollContent$1$1$5 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Navigator $navigator;
    final /* synthetic */ RetirementDashboardViewState $viewState;

    RetirementDashboardKt$RetirementDashboardScrollContent$1$1$5(Navigator navigator, Context context, RetirementDashboardViewState retirementDashboardViewState) {
        this.$navigator = navigator;
        this.$context = context;
        this.$viewState = retirementDashboardViewState;
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
            ComposerKt.traceEventStart(196553601, i, -1, "com.robinhood.android.retirement.ui.funded.RetirementDashboardScrollContent.<anonymous>.<anonymous>.<anonymous> (RetirementDashboard.kt:271)");
        }
        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21591getLargeD9Ej5fM()), composer, 0);
        composer.startReplaceGroup(-90546676);
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
        builder.append(StringResources_androidKt.stringResource(C13691R.string.ira_settings, composer, 0));
        builder.pop();
        AnnotatedString annotatedString = builder.toAnnotatedString();
        composer.endReplaceGroup();
        BentoBaseRowState.Start.Icon icon = new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.SETTINGS_24, null, null, 6, null);
        composer.startReplaceGroup(-1746271574);
        boolean zChangedInstance = composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context) | composer.changedInstance(this.$viewState);
        final Navigator navigator = this.$navigator;
        final Context context = this.$context;
        final RetirementDashboardViewState retirementDashboardViewState = this.$viewState;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.retirement.ui.funded.RetirementDashboardKt$RetirementDashboardScrollContent$1$1$5$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RetirementDashboardKt$RetirementDashboardScrollContent$1$1$5.invoke$lambda$2$lambda$1(navigator, context, retirementDashboardViewState);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(null, icon, annotatedString, null, null, null, null, true, false, false, false, false, 0L, (Function0) objRememberedValue, composer, (BentoBaseRowState.Start.Icon.$stable << 3) | 12582912, 0, 8057);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(Navigator navigator, Context context, RetirementDashboardViewState retirementDashboardViewState) {
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, retirementDashboardViewState.getSettingsRowKey(), false, false, false, false, null, false, null, null, 1020, null);
        return Unit.INSTANCE;
    }
}
