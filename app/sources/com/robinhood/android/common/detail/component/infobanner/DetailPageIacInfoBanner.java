package com.robinhood.android.common.detail.component.infobanner;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.shared.iac.infobanner.InfoBannerComponent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DetailPageIacInfoBanner.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00060\u0005H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b²\u0006\n\u0010\t\u001a\u00020\u0006X\u008a\u0084\u0002"}, m3636d2 = {"DetailPageIacInfoBanner", "", "T", "", "duxo", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/common/detail/component/infobanner/DetailPageIacInfoBannerViewState;", "(Lcom/robinhood/android/udf/BaseDuxo;Landroidx/compose/runtime/Composer;I)V", "feature-lib-detail-component_externalDebug", "viewState"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.detail.component.infobanner.DetailPageIacInfoBannerKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class DetailPageIacInfoBanner {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DetailPageIacInfoBanner$lambda$1(BaseDuxo baseDuxo, int i, Composer composer, int i2) {
        DetailPageIacInfoBanner(baseDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final <T> void DetailPageIacInfoBanner(final BaseDuxo<T, DetailPageIacInfoBannerViewState> duxo, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Composer composerStartRestartGroup = composer.startRestartGroup(2008600154);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(duxo) : composerStartRestartGroup.changedInstance(duxo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2008600154, i2, -1, "com.robinhood.android.common.detail.component.infobanner.DetailPageIacInfoBanner (DetailPageIacInfoBanner.kt:9)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            composer2 = composerStartRestartGroup;
            InfoBannerComponent.InfoBannerComponent(DetailPageIacInfoBanner$lambda$0(snapshotState4CollectAsStateWithLifecycle).getCurrentAccountNumber(), DetailPageIacInfoBanner$lambda$0(snapshotState4CollectAsStateWithLifecycle).getLocation(), null, null, null, null, null, null, null, null, null, null, null, composer2, 0, 0, 8188);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.detail.component.infobanner.DetailPageIacInfoBannerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DetailPageIacInfoBanner.DetailPageIacInfoBanner$lambda$1(duxo, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final DetailPageIacInfoBannerViewState DetailPageIacInfoBanner$lambda$0(SnapshotState4<DetailPageIacInfoBannerViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
