package com.robinhood.microgram.sdui;

import android.graphics.Bitmap;
import android.view.View;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.libdesignsystem.serverui.experimental.position.LocalDimensionTracker;
import com.robinhood.android.libdesignsystem.serverui.experimental.position.LocalDimensionTracker2;
import com.robinhood.microgram.sdui.MicrogramScreenDuxo2;
import com.robinhood.shared.common.screenshot.sharing.p372ui.ShareScreenshotBottomSheet6;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import microgram.p507ui.p508v1.screen_events.ShareScreenshotRequestDto;

/* compiled from: ScreenshotUtils.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0001¢\u0006\u0002\u0010\u0004¨\u0006\u0005²\u0006\u0018\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007X\u008a\u008e\u0002"}, m3636d2 = {"RegisterScreenshotRequests", "", "shareScreenshotRequest", "Lcom/robinhood/microgram/sdui/ScreenEvent$ShareScreenshotRequest;", "(Lcom/robinhood/microgram/sdui/ScreenEvent$ShareScreenshotRequest;Landroidx/compose/runtime/Composer;I)V", "feature-microgram-sdui_externalDebug", "showShareScreenshotBottomSheet", "Lkotlin/Pair;", "Lmicrogram/ui/v1/screen_events/ShareScreenshotRequestDto;", "Landroid/graphics/Bitmap;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.microgram.sdui.ScreenshotUtilsKt, reason: use source file name */
/* loaded from: classes13.dex */
public final class ScreenshotUtils2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RegisterScreenshotRequests$lambda$7(MicrogramScreenDuxo2.ShareScreenshotRequest shareScreenshotRequest, int i, Composer composer, int i2) {
        RegisterScreenshotRequests(shareScreenshotRequest, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void RegisterScreenshotRequests(final MicrogramScreenDuxo2.ShareScreenshotRequest shareScreenshotRequest, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1845292779);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(shareScreenshotRequest) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1845292779, i2, -1, "com.robinhood.microgram.sdui.RegisterScreenshotRequests (ScreenshotUtils.kt:24)");
            }
            LocalDimensionTracker localDimensionTracker = (LocalDimensionTracker) composerStartRestartGroup.consume(LocalDimensionTracker2.getLocalDimensionTracker());
            View view = (View) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(shareScreenshotRequest) | composerStartRestartGroup.changedInstance(localDimensionTracker) | composerStartRestartGroup.changedInstance(view);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new ScreenshotUtils3(shareScreenshotRequest, localDimensionTracker, view, snapshotState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(shareScreenshotRequest, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i2 & 14);
            Tuples2<ShareScreenshotRequestDto, Bitmap> tuples2RegisterScreenshotRequests$lambda$1 = RegisterScreenshotRequests$lambda$1(snapshotState);
            if (tuples2RegisterScreenshotRequests$lambda$1 != null) {
                final ShareScreenshotRequestDto shareScreenshotRequestDtoComponent1 = tuples2RegisterScreenshotRequests$lambda$1.component1();
                final Bitmap bitmapComponent2 = tuples2RegisterScreenshotRequests$lambda$1.component2();
                composerStartRestartGroup.startReplaceGroup(5004770);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.microgram.sdui.ScreenshotUtilsKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ScreenshotUtils2.RegisterScreenshotRequests$lambda$6$lambda$5$lambda$4(snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue3, null, false, ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2), null, 0L, ComposableLambda3.rememberComposableLambda(539201511, true, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.microgram.sdui.ScreenshotUtilsKt$RegisterScreenshotRequests$2$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer2, Integer num) {
                        invoke(rhModalBottomSheet5, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer2, int i3) {
                        Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                        if ((i3 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(539201511, i3, -1, "com.robinhood.microgram.sdui.RegisterScreenshotRequests.<anonymous>.<anonymous> (ScreenshotUtils.kt:68)");
                        }
                        ShareScreenshotBottomSheet6.ShareScreenshotBottomSheet(bitmapComponent2, null, shareScreenshotRequestDtoComponent1.getShare_sheet_title(), shareScreenshotRequestDtoComponent1.getShare_sheet_subtitle(), shareScreenshotRequestDtoComponent1.getCustom_share_content(), null, null, composer2, 0, 98);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 1572870, 54);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.microgram.sdui.ScreenshotUtilsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ScreenshotUtils2.RegisterScreenshotRequests$lambda$7(shareScreenshotRequest, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RegisterScreenshotRequests$lambda$6$lambda$5$lambda$4(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }

    private static final Tuples2<ShareScreenshotRequestDto, Bitmap> RegisterScreenshotRequests$lambda$1(SnapshotState<Tuples2<ShareScreenshotRequestDto, Bitmap>> snapshotState) {
        return snapshotState.getValue();
    }
}
