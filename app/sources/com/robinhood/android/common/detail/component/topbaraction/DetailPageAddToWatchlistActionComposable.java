package com.robinhood.android.common.detail.component.topbaraction;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.detail.component.C11117R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.compose.bento.component.BentoIconButton2;
import com.robinhood.compose.bento.component.BentoIconButton4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p320db.Security;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DetailPageAddToWatchlistActionComposable.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aO\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0006X\u008a\u0084\u0002"}, m3636d2 = {"DetailPageAddToWatchlistActionComposable", "", "T", "", "duxo", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/common/detail/component/topbaraction/DetailPageAddToWatchlistActionViewState;", "modifier", "Landroidx/compose/ui/Modifier;", "onAddToWatchlistClicked", "Lkotlin/Function2;", "", "Lcom/robinhood/models/db/Security;", "(Lcom/robinhood/android/udf/BaseDuxo;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "feature-lib-detail-component_externalDebug", "viewState"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.detail.component.topbaraction.DetailPageAddToWatchlistActionComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class DetailPageAddToWatchlistActionComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DetailPageAddToWatchlistActionComposable$lambda$4(BaseDuxo baseDuxo, Modifier modifier, Function2 function2, int i, int i2, Composer composer, int i3) {
        DetailPageAddToWatchlistActionComposable(baseDuxo, modifier, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void DetailPageAddToWatchlistActionComposable(final BaseDuxo<T, DetailPageAddToWatchlistActionViewState> duxo, Modifier modifier, final Function2<? super Boolean, ? super Security, Unit> onAddToWatchlistClicked, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Security watchlistSecurity;
        Modifier modifier3;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2;
        Composer composer2;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Intrinsics.checkNotNullParameter(onAddToWatchlistClicked, "onAddToWatchlistClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-458273319);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(duxo) : composerStartRestartGroup.changedInstance(duxo) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onAddToWatchlistClicked) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-458273319, i3, -1, "com.robinhood.android.common.detail.component.topbaraction.DetailPageAddToWatchlistActionComposable (DetailPageAddToWatchlistActionComposable.kt:25)");
                }
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                watchlistSecurity = DetailPageAddToWatchlistActionComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getWatchlistSecurity();
                if (watchlistSecurity != null) {
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier5;
                } else {
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier5, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.UPDATE_LIST_ITEMS, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null), true, false, false, true, false, null, 108, null);
                    modifier3 = modifier5;
                    if (DetailPageAddToWatchlistActionComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getAddedToWatchlist()) {
                        serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.BUBBLE_CHECKED_24;
                    } else {
                        serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.BUBBLE_PLUS_24;
                    }
                    BentoIconButton4.Icon.HeroSize24 heroSize24 = new BentoIconButton4.Icon.HeroSize24(serverToBentoAssetMapper2);
                    long jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                    Color.Companion companion = Color.INSTANCE;
                    long jM6725getTransparent0d7_KjU = companion.m6725getTransparent0d7_KjU();
                    long jM6725getTransparent0d7_KjU2 = companion.m6725getTransparent0d7_KjU();
                    String strStringResource = StringResources_androidKt.stringResource(C11117R.string.add_to_list, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    boolean zChanged = composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | ((i3 & 896) == 256) | composerStartRestartGroup.changedInstance(watchlistSecurity);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.common.detail.component.topbaraction.DetailPageAddToWatchlistActionComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return DetailPageAddToWatchlistActionComposable.m1838x8b7b8cc5(onAddToWatchlistClicked, watchlistSecurity, snapshotState4CollectAsStateWithLifecycle);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    BentoIconButton2.m20641BentoIconButtoncqYvz4g((Function0) objRememberedValue, heroSize24, strStringResource, modifierAutoLogEvents$default, null, false, Color.m6701boximpl(jM21425getFg0d7_KjU), Color.m6701boximpl(jM6725getTransparent0d7_KjU), Color.m6701boximpl(jM6725getTransparent0d7_KjU2), null, false, composer2, (BentoIconButton4.Icon.HeroSize24.$stable << 3) | 113246208, 0, 1584);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.detail.component.topbaraction.DetailPageAddToWatchlistActionComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DetailPageAddToWatchlistActionComposable.DetailPageAddToWatchlistActionComposable$lambda$4(duxo, modifier4, onAddToWatchlistClicked, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            watchlistSecurity = DetailPageAddToWatchlistActionComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getWatchlistSecurity();
            if (watchlistSecurity != null) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DetailPageAddToWatchlistActionComposable$lambda$3$lambda$2$lambda$1 */
    public static final Unit m1838x8b7b8cc5(Function2 function2, Security security, SnapshotState4 snapshotState4) {
        function2.invoke(Boolean.valueOf(DetailPageAddToWatchlistActionComposable$lambda$0(snapshotState4).getAddedToWatchlist()), security);
        return Unit.INSTANCE;
    }

    private static final DetailPageAddToWatchlistActionViewState DetailPageAddToWatchlistActionComposable$lambda$0(SnapshotState4<DetailPageAddToWatchlistActionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
