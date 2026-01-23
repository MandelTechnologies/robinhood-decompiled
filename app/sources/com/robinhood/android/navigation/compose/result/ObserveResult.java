package com.robinhood.android.navigation.compose.result;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.livedata.LiveDataAdapter;
import androidx.lifecycle.SavedStateHandle;
import defpackage.C0007xc1408999;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ObserveResult.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\u0016\u0010\f\u001a\u0004\u0018\u0001H\u0002\"\b\b\u0000\u0010\u0002*\u00020\u0003X\u008a\u0084\u0002"}, m3636d2 = {"ObserveResult", "", "T", "", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "key", "", "onResultReceived", "Lkotlin/Function1;", "(Landroidx/lifecycle/SavedStateHandle;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "lib-navigation-compose_externalDebug", "result"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.navigation.compose.result.ObserveResultKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class ObserveResult {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ObserveResult$lambda$1(SavedStateHandle savedStateHandle, String str, Function1 function1, int i, Composer composer, int i2) {
        ObserveResult(savedStateHandle, str, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final <T> void ObserveResult(final SavedStateHandle savedStateHandle, final String key, final Function1<? super T, Unit> onResultReceived, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(onResultReceived, "onResultReceived");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1682830207);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(savedStateHandle) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(key) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onResultReceived) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1682830207, i2, -1, "com.robinhood.android.navigation.compose.result.ObserveResult (ObserveResult.kt:12)");
            }
            SnapshotState4 snapshotState4ObserveAsState = LiveDataAdapter.observeAsState(savedStateHandle.getLiveData(key), composerStartRestartGroup, 0);
            if (snapshotState4ObserveAsState.getValue() != null) {
                C0007xc1408999 c0007xc1408999 = (Object) snapshotState4ObserveAsState.getValue();
                Intrinsics.checkNotNull(c0007xc1408999, "null cannot be cast to non-null type T of com.robinhood.android.navigation.compose.result.ObserveResultKt.ObserveResult");
                onResultReceived.invoke(c0007xc1408999);
                savedStateHandle.getLiveData(key).setValue(null);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.navigation.compose.result.ObserveResultKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ObserveResult.ObserveResult$lambda$1(savedStateHandle, key, onResultReceived, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
