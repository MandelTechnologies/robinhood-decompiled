package com.robinhood.android.disclosures.lib.homescreen;

import android.content.Context;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsProperties_androidKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.disclosures.lib.C14229R;
import com.robinhood.android.disclosures.lib.p107ui.DisclosureText2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.shared.common.contracts.PdfRendererIntentKey;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionsDisclosure.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"OptionsDisclosure", "", "type", "Lcom/robinhood/android/disclosures/lib/homescreen/OptionsDisclosureType;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/disclosures/lib/homescreen/OptionsDisclosureType;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-disclosures_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.disclosures.lib.homescreen.OptionsDisclosureKt, reason: use source file name */
/* loaded from: classes27.dex */
public final class OptionsDisclosure {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsDisclosure$lambda$4(OptionsDisclosure2 optionsDisclosure2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OptionsDisclosure(optionsDisclosure2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void OptionsDisclosure(final OptionsDisclosure2 type2, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(type2, "type");
        Composer composerStartRestartGroup = composer.startRestartGroup(-900912630);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(type2.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-900912630, i3, -1, "com.robinhood.android.disclosures.lib.homescreen.OptionsDisclosure (OptionsDisclosure.kt:26)");
            }
            final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            if (type2 == OptionsDisclosure2.TAXABLE || type2 == OptionsDisclosure2.RETIREMENT) {
                final String strStringResource = StringResources_androidKt.stringResource(C14229R.string.gated_options_watchlist_disclosure_title, composerStartRestartGroup, 0);
                int i5 = C14229R.string.gated_options_watchlist_disclosure;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.disclosures.lib.homescreen.OptionsDisclosureKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OptionsDisclosure.OptionsDisclosure$lambda$1$lambda$0((SemanticsPropertyReceiver) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifier, false, (Function1) objRememberedValue, 1, null);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changed(strStringResource);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.disclosures.lib.homescreen.OptionsDisclosureKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OptionsDisclosure.OptionsDisclosure$lambda$3$lambda$2(navigator, context, strStringResource, (String) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                DisclosureText2.DisclosureText(i5, modifierSemantics$default, (Function1) objRememberedValue2, composerStartRestartGroup, 0, 0);
            } else if (type2 != OptionsDisclosure2.NONE) {
                throw new NoWhenBranchMatchedException();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.disclosures.lib.homescreen.OptionsDisclosureKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionsDisclosure.OptionsDisclosure$lambda$4(type2, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsDisclosure$lambda$1$lambda$0(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsProperties_androidKt.setTestTagsAsResourceId(semantics, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsDisclosure$lambda$3$lambda$2(Navigator navigator, Context context, String str, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Navigator.DefaultImpls.startActivity$default(navigator, context, new PdfRendererIntentKey(url, str), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }
}
