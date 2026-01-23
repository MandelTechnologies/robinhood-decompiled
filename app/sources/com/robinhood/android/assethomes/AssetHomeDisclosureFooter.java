package com.robinhood.android.assethomes;

import android.content.Context;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.assethomes.AssetHomeDisclosureFooter;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.shared.common.contracts.RemoteDisclosureKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AssetHomeDisclosureFooter.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"AssetHomeDisclosureFooter", "", "disclosureContentfulId", "", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Lcom/robinhood/android/navigation/Navigator;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-asset-homes_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.assethomes.AssetHomeDisclosureFooterKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AssetHomeDisclosureFooter {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssetHomeDisclosureFooter$lambda$0(String str, Navigator navigator, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AssetHomeDisclosureFooter(str, navigator, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void AssetHomeDisclosureFooter(final String disclosureContentfulId, final Navigator navigator, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(disclosureContentfulId, "disclosureContentfulId");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Composer composerStartRestartGroup = composer.startRestartGroup(653904517);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(disclosureContentfulId) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(navigator) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(653904517, i3, -1, "com.robinhood.android.assethomes.AssetHomeDisclosureFooter (AssetHomeDisclosureFooter.kt:22)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(553120400, true, new C95791(navigator, (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), disclosureContentfulId, modifier), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.assethomes.AssetHomeDisclosureFooterKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AssetHomeDisclosureFooter.AssetHomeDisclosureFooter$lambda$0(disclosureContentfulId, navigator, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: AssetHomeDisclosureFooter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.assethomes.AssetHomeDisclosureFooterKt$AssetHomeDisclosureFooter$1 */
    static final class C95791 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $disclosureContentfulId;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Navigator $navigator;

        C95791(Navigator navigator, Context context, String str, Modifier modifier) {
            this.$navigator = navigator;
            this.$context = context;
            this.$disclosureContentfulId = str;
            this.$modifier = modifier;
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
                ComposerKt.traceEventStart(553120400, i, -1, "com.robinhood.android.assethomes.AssetHomeDisclosureFooter.<anonymous> (AssetHomeDisclosureFooter.kt:25)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C9612R.string.disclosures, composer, 0);
            String strStringResource2 = StringResources_androidKt.stringResource(C9612R.string.disclosures_substring, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            long jM21426getFg20d7_KjU = bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU();
            TextStyle textM = bentoTheme.getTypography(composer, i2).getTextM();
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context) | composer.changed(this.$disclosureContentfulId);
            final Navigator navigator = this.$navigator;
            final Context context = this.$context;
            final String str = this.$disclosureContentfulId;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.assethomes.AssetHomeDisclosureFooterKt$AssetHomeDisclosureFooter$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AssetHomeDisclosureFooter.C95791.invoke$lambda$1$lambda$0(navigator, context, str);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoTextWithLink.m20753BentoTextWithSubstringLinkXkG1Q0A(strStringResource, strStringResource2, (Function0) objRememberedValue, this.$modifier, jM21426getFg20d7_KjU, 0L, textM, 0, composer, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Navigator navigator, Context context, String str) {
            Navigator.DefaultImpls.startActivity$default(navigator, context, new RemoteDisclosureKey(str, null, false, false, null, null, null, false, 250, null), null, false, null, null, 60, null);
            return Unit.INSTANCE;
        }
    }
}
