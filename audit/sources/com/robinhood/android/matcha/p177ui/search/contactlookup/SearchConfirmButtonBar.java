package com.robinhood.android.matcha.p177ui.search.contactlookup;

import android.content.Context;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SearchConfirmButtonBar.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aA\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0001¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"SearchConfirmButtonBar", "", "modifier", "Landroidx/compose/ui/Modifier;", "primaryButtonText", "", "secondaryButtonText", "primaryButtonOnClick", "Lkotlin/Function0;", "secondaryButtonOnClick", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-p2p_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.matcha.ui.search.contactlookup.SearchConfirmButtonBarKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SearchConfirmButtonBar {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchConfirmButtonBar$lambda$2(Modifier modifier, String str, String str2, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        SearchConfirmButtonBar(modifier, str, str2, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void SearchConfirmButtonBar(final Modifier modifier, final String primaryButtonText, final String secondaryButtonText, final Function0<Unit> primaryButtonOnClick, final Function0<Unit> secondaryButtonOnClick, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
        Intrinsics.checkNotNullParameter(primaryButtonOnClick, "primaryButtonOnClick");
        Intrinsics.checkNotNullParameter(secondaryButtonOnClick, "secondaryButtonOnClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1731477529);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(primaryButtonText) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(secondaryButtonText) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(primaryButtonOnClick) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(secondaryButtonOnClick) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1731477529, i2, -1, "com.robinhood.android.matcha.ui.search.contactlookup.SearchConfirmButtonBar (SearchConfirmButtonBar.kt:17)");
            }
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            String strStringResource = StringResources_androidKt.stringResource(C21284R.string.matcha_confirm_transactor_disclosure, composerStartRestartGroup, 0);
            String strStringResource2 = StringResources_androidKt.stringResource(C21284R.string.matcha_protect_against_scams, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.matcha.ui.search.contactlookup.SearchConfirmButtonBarKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SearchConfirmButtonBar.SearchConfirmButtonBar$lambda$1$lambda$0(context);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            BentoButtonBar2.BentoButtonBar(modifier, strStringResource, strStringResource2, false, (Function0) objRememberedValue, null, primaryButtonOnClick, primaryButtonText, false, null, false, secondaryButtonOnClick, secondaryButtonText, false, null, false, composer2, (i2 & 14) | ((i2 << 9) & 3670016) | ((i2 << 18) & 29360128), ((i2 >> 9) & 112) | (i2 & 896), 59176);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.search.contactlookup.SearchConfirmButtonBarKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SearchConfirmButtonBar.SearchConfirmButtonBar$lambda$2(modifier, primaryButtonText, secondaryButtonText, primaryButtonOnClick, secondaryButtonOnClick, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchConfirmButtonBar$lambda$1$lambda$0(Context context) {
        WebUtils.viewUrl$default(context, C21284R.string.matcha_protect_against_scams_url, 0, 4, (Object) null);
        return Unit.INSTANCE;
    }
}
