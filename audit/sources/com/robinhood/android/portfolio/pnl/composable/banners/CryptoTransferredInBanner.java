package com.robinhood.android.portfolio.pnl.composable.banners;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.portfolio.pnl.C25673R;
import com.robinhood.android.portfolio.pnl.composable.banners.CryptoTransferredInBanner;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossOrderDetails;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossTradeItem;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.shared.common.contracts.OtherMarkdownFragmentKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoTransferredInBanner.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"CryptoTransferredInBanner", "", ErrorResponse.DETAIL, "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "pnlUpdatesEnabled", "", "cryptoCostBasisEnabled", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;ZLjava/lang/Boolean;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-profit-and-loss_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.portfolio.pnl.composable.banners.CryptoTransferredInBannerKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class CryptoTransferredInBanner {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTransferredInBanner$lambda$1(ProfitAndLossTradeItem profitAndLossTradeItem, boolean z, Boolean bool, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoTransferredInBanner(profitAndLossTradeItem, z, bool, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoTransferredInBanner(final ProfitAndLossTradeItem detail, final boolean z, final Boolean bool, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean zChanged;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(detail, "detail");
        Composer composerStartRestartGroup = composer.startRestartGroup(254573808);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(detail) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(bool) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(254573808, i3, -1, "com.robinhood.android.portfolio.pnl.composable.banners.CryptoTransferredInBanner (CryptoTransferredInBanner.kt:32)");
                }
                Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(detail);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    if (detail.getOpenAveragePrice() != null) {
                        ProfitAndLossOrderDetails orderDetails = detail.getOrderDetails();
                        Intrinsics.checkNotNull(orderDetails, "null cannot be cast to non-null type com.robinhood.android.portfolio.pnl.db.ProfitAndLossOrderDetails.CryptoOrderDetails");
                        boolean z2 = ((ProfitAndLossOrderDetails.CryptoOrderDetails) orderDetails).getAcquired() == null;
                        objRememberedValue = Boolean.valueOf(z2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                }
                boolean zBooleanValue = ((Boolean) objRememberedValue).booleanValue();
                composerStartRestartGroup.endReplaceGroup();
                boolean z3 = bool == null;
                Modifier modifier5 = modifier4;
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-851456384, true, new C256891(modifier5, zBooleanValue, detail, bool, navigator, context, z), composerStartRestartGroup, 54);
                composer2 = composerStartRestartGroup;
                LocalShowPlaceholder.Loadable(z3, null, null, composableLambdaRememberComposableLambda, composer2, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.pnl.composable.banners.CryptoTransferredInBannerKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoTransferredInBanner.CryptoTransferredInBanner$lambda$1(detail, z, bool, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChanged = composerStartRestartGroup.changed(detail);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                if (detail.getOpenAveragePrice() != null) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: CryptoTransferredInBanner.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.portfolio.pnl.composable.banners.CryptoTransferredInBannerKt$CryptoTransferredInBanner$1 */
    static final class C256891 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Boolean $cryptoCostBasisEnabled;
        final /* synthetic */ ProfitAndLossTradeItem $detail;
        final /* synthetic */ boolean $isAllTransferredIn;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Navigator $navigator;
        final /* synthetic */ boolean $pnlUpdatesEnabled;

        C256891(Modifier modifier, boolean z, ProfitAndLossTradeItem profitAndLossTradeItem, Boolean bool, Navigator navigator, Context context, boolean z2) {
            this.$modifier = modifier;
            this.$isAllTransferredIn = z;
            this.$detail = profitAndLossTradeItem;
            this.$cryptoCostBasisEnabled = bool;
            this.$navigator = navigator;
            this.$context = context;
            this.$pnlUpdatesEnabled = z2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(Boolean bool, Navigator navigator, Context context, boolean z) {
            String str;
            String string2;
            if (bool == null) {
                return Unit.INSTANCE;
            }
            if (bool.booleanValue()) {
                str = "5LlscVKSC31SAsD2O6tfCs";
            } else {
                str = "7ngqOxQ3OeHiuONcRlA4Ko";
            }
            String str2 = str;
            if (z) {
                string2 = context.getString(C25673R.string.closed_pnl_hub_faq_title);
            } else {
                string2 = context.getString(C25673R.string.pnl_hub_faq_title);
            }
            Navigator.DefaultImpls.showFragment$default(navigator, context, new OtherMarkdownFragmentKey(str2, string2, null, 4, null), false, false, false, null, false, null, false, false, null, null, 4084, null);
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
            int i2;
            String strStringResource;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-851456384, i, -1, "com.robinhood.android.portfolio.pnl.composable.banners.CryptoTransferredInBanner.<anonymous> (CryptoTransferredInBanner.kt:41)");
            }
            Modifier modifier = this.$modifier;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(modifier, bentoTheme.getColors(composer, i3).m21372getBg20d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM()));
            Alignment center = Alignment.INSTANCE.getCenter();
            boolean z = this.$isAllTransferredIn;
            ProfitAndLossTradeItem profitAndLossTradeItem = this.$detail;
            final Boolean bool = this.$cryptoCostBasisEnabled;
            final Navigator navigator = this.$navigator;
            final Context context = this.$context;
            final boolean z2 = this.$pnlUpdatesEnabled;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4871backgroundbw27NRU);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(Modifier.INSTANCE, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM());
            if (z) {
                composer.startReplaceGroup(519781385);
                i2 = 0;
                strStringResource = StringResources_androidKt.stringResource(C25673R.string.f4832xe73c24d0, new Object[]{profitAndLossTradeItem.getSymbol()}, composer, 0);
                composer.endReplaceGroup();
            } else {
                i2 = 0;
                composer.startReplaceGroup(519789349);
                strStringResource = StringResources_androidKt.stringResource(C25673R.string.f4834xa527a4f2, new Object[]{profitAndLossTradeItem.getSymbol()}, composer, 0);
                composer.endReplaceGroup();
            }
            String str = strStringResource;
            String strStringResource2 = StringResources_androidKt.stringResource(C25673R.string.f4833xa5240fbf, composer, i2);
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU();
            TextStyle textM = bentoTheme.getTypography(composer, i3).getTextM();
            composer.startReplaceGroup(-1224400529);
            boolean zChanged = composer.changed(bool) | composer.changedInstance(navigator) | composer.changedInstance(context) | composer.changed(z2);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.portfolio.pnl.composable.banners.CryptoTransferredInBannerKt$CryptoTransferredInBanner$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoTransferredInBanner.C256891.invoke$lambda$2$lambda$1$lambda$0(bool, navigator, context, z2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(str, strStringResource2, (Function0) objRememberedValue, modifierM5142padding3ABfNKs, jM21425getFg0d7_KjU, 0L, textM, 0, composer, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }
}
