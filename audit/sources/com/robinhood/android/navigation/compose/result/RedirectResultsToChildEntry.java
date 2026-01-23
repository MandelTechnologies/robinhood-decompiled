package com.robinhood.android.navigation.compose.result;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.livedata.LiveDataAdapter;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RedirectResultsToChildEntry.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\f\u0010\n\u001a\u0004\u0018\u00010\u000bX\u008a\u0084\u0002"}, m3636d2 = {"RedirectResultsToChildEntry", "", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "navController", "Landroidx/navigation/NavController;", "key", "", "(Landroidx/lifecycle/SavedStateHandle;Landroidx/navigation/NavController;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "lib-navigation-compose_externalDebug", "result", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.navigation.compose.result.RedirectResultsToChildEntryKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class RedirectResultsToChildEntry {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RedirectResultsToChildEntry$lambda$2(SavedStateHandle savedStateHandle, NavController navController, String str, int i, Composer composer, int i2) {
        RedirectResultsToChildEntry(savedStateHandle, navController, str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void RedirectResultsToChildEntry(SavedStateHandle savedStateHandle, NavController navController, String key, Composer composer, final int i) {
        int i2;
        final SavedStateHandle savedStateHandle2;
        final NavController navController2;
        final String str;
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(key, "key");
        Composer composerStartRestartGroup = composer.startRestartGroup(-577388771);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(savedStateHandle) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(navController) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(key) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            savedStateHandle2 = savedStateHandle;
            navController2 = navController;
            str = key;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-577388771, i2, -1, "com.robinhood.android.navigation.compose.result.RedirectResultsToChildEntry (RedirectResultsToChildEntry.kt:23)");
            }
            SnapshotState4 snapshotState4ObserveAsState = LiveDataAdapter.observeAsState(savedStateHandle.getLiveData(key), composerStartRestartGroup, 0);
            Object value = snapshotState4ObserveAsState.getValue();
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChanged = ((i2 & 896) == 256) | composerStartRestartGroup.changed(snapshotState4ObserveAsState) | composerStartRestartGroup.changedInstance(navController) | composerStartRestartGroup.changedInstance(savedStateHandle);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                savedStateHandle2 = savedStateHandle;
                navController2 = navController;
                str = key;
                RedirectResultsToChildEntry2 redirectResultsToChildEntry2 = new RedirectResultsToChildEntry2(navController2, str, savedStateHandle2, snapshotState4ObserveAsState, null);
                composerStartRestartGroup.updateRememberedValue(redirectResultsToChildEntry2);
                objRememberedValue = redirectResultsToChildEntry2;
            } else {
                savedStateHandle2 = savedStateHandle;
                navController2 = navController;
                str = key;
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(value, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.navigation.compose.result.RedirectResultsToChildEntryKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RedirectResultsToChildEntry.RedirectResultsToChildEntry$lambda$2(savedStateHandle2, navController2, str, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
