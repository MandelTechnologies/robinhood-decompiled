package com.robinhood.android.disclosures.lib.p107ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.disclosures.lib.C14229R;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.iso.countrycode.CountryCode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FuturesTradingDisclosure.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"FuturesTradingDisclosure", "", "locality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/iso/countrycode/CountryCode$Supported;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-disclosures_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.disclosures.lib.ui.FuturesTradingDisclosureKt, reason: use source file name */
/* loaded from: classes27.dex */
public final class FuturesTradingDisclosure {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesTradingDisclosure$lambda$0(CountryCode.Supported supported, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FuturesTradingDisclosure(supported, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesTradingDisclosure$lambda$3(CountryCode.Supported supported, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FuturesTradingDisclosure(supported, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void FuturesTradingDisclosure(final CountryCode.Supported locality, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(locality, "locality");
        Composer composerStartRestartGroup = composer.startRestartGroup(1470827274);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(locality) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i5 != 0) {
                modifier = Modifier.INSTANCE;
            }
            final Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1470827274, i3, -1, "com.robinhood.android.disclosures.lib.ui.FuturesTradingDisclosure (FuturesTradingDisclosure.kt:15)");
            }
            if (Intrinsics.areEqual(locality, CountryCode.Supported.UnitedStates.INSTANCE)) {
                i4 = C14229R.string.gated_options_futures_disclosure_us;
            } else {
                if (!Intrinsics.areEqual(locality, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.disclosures.lib.ui.FuturesTradingDisclosureKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return FuturesTradingDisclosure.FuturesTradingDisclosure$lambda$0(locality, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 = C14229R.string.gated_options_futures_disclosure_uk;
            }
            int i6 = i4;
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.disclosures.lib.ui.FuturesTradingDisclosureKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FuturesTradingDisclosure.FuturesTradingDisclosure$lambda$2$lambda$1(context, (String) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            DisclosureText2.DisclosureText(i6, modifier2, (Function1) objRememberedValue, composerStartRestartGroup, i3 & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.disclosures.lib.ui.FuturesTradingDisclosureKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FuturesTradingDisclosure.FuturesTradingDisclosure$lambda$3(locality, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FuturesTradingDisclosure$lambda$2$lambda$1(Context context, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (!WebUtils.INSTANCE.handleUrl(context, url)) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
        }
        return Unit.INSTANCE;
    }
}
