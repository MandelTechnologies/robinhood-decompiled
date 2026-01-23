package com.robinhood.android.pictureinpicture.pip;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.pictureinpicture.pip.contracts.PictureInPictureKey;
import com.robinhood.android.pictureinpicture.pip.crypto.PipCryptoChartComposable;
import com.robinhood.android.pictureinpicture.pip.event.PipEventChartComposable;
import com.robinhood.android.pictureinpicture.pip.futures.PipFuturesChartComposable;
import com.robinhood.android.pictureinpicture.pip.index.PipIndexChartComposable;
import com.robinhood.android.pictureinpicture.pip.options.PipOptionsChartComposable;
import com.robinhood.android.pictureinpicture.pip.stocks.PipStockChartComposable;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PictureInPictureFragment.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0017¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/pictureinpicture/pip/PictureInPictureFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "Companion", "feature-pip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class PictureInPictureFragment extends GenericComposeFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = GenericComposeFragment.$stable;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(PictureInPictureFragment pictureInPictureFragment, int i, Composer composer, int i2) {
        pictureInPictureFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1772100649);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(this) : composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1772100649, i2, -1, "com.robinhood.android.pictureinpicture.pip.PictureInPictureFragment.ComposeContent (PictureInPictureFragment.kt:18)");
            }
            PictureInPictureKey pictureInPictureKey = (PictureInPictureKey) INSTANCE.getArgs((Fragment) this);
            if (pictureInPictureKey instanceof PictureInPictureKey.Instrument) {
                composerStartRestartGroup.startReplaceGroup(1087697655);
                composer2 = composerStartRestartGroup;
                PipStockChartComposable.StockChartPipComposable(((PictureInPictureKey.Instrument) pictureInPictureKey).getInstrumentId(), getScarletManager(), null, null, composer2, ScarletManager.$stable << 3, 12);
                composer2.endReplaceGroup();
            } else {
                composer2 = composerStartRestartGroup;
                if (pictureInPictureKey instanceof PictureInPictureKey.Crypto) {
                    composer2.startReplaceGroup(1087921351);
                    PipCryptoChartComposable.CryptoChartPipComposable(((PictureInPictureKey.Crypto) pictureInPictureKey).getCurrencyPairId(), null, null, composer2, 0, 6);
                    composer2 = composer2;
                    composer2.endReplaceGroup();
                } else if (pictureInPictureKey instanceof PictureInPictureKey.FuturesOutright) {
                    composer2.startReplaceGroup(1088109273);
                    PipFuturesChartComposable.PipFuturesChartComposable(((PictureInPictureKey.FuturesOutright) pictureInPictureKey).getContractId(), getScarletManager(), null, null, composer2, ScarletManager.$stable << 3, 12);
                    composer2.endReplaceGroup();
                } else if (pictureInPictureKey instanceof PictureInPictureKey.Event) {
                    composer2.startReplaceGroup(1088331233);
                    PipEventChartComposable.PipEventChartComposable(((PictureInPictureKey.Event) pictureInPictureKey).getEventId(), getScarletManager(), null, null, composer2, ScarletManager.$stable << 3, 12);
                    composer2.endReplaceGroup();
                } else if (pictureInPictureKey instanceof PictureInPictureKey.Option) {
                    composer2.startReplaceGroup(1088545226);
                    PipOptionsChartComposable.PipOptionsChartComposable(((PictureInPictureKey.Option) pictureInPictureKey).getStrategyCode(), null, null, composer2, 0, 6);
                    composer2 = composer2;
                    composer2.endReplaceGroup();
                } else {
                    if (!(pictureInPictureKey instanceof PictureInPictureKey.Index)) {
                        composer2.startReplaceGroup(2113295733);
                        composer2.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer2.startReplaceGroup(1088718919);
                    PipIndexChartComposable.PipIndexChartComposable(((PictureInPictureKey.Index) pictureInPictureKey).getInstrumentIndexId(), null, null, composer2, 0, 6);
                    composer2 = composer2;
                    composer2.endReplaceGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pictureinpicture.pip.PictureInPictureFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PictureInPictureFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    /* compiled from: PictureInPictureFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/pictureinpicture/pip/PictureInPictureFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/pictureinpicture/pip/PictureInPictureFragment;", "Lcom/robinhood/android/pictureinpicture/pip/contracts/PictureInPictureKey;", "<init>", "()V", "feature-pip_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<PictureInPictureFragment, PictureInPictureKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public PictureInPictureKey getArgs(PictureInPictureFragment pictureInPictureFragment) {
            return (PictureInPictureKey) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, pictureInPictureFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public PictureInPictureFragment newInstance(PictureInPictureKey pictureInPictureKey) {
            return (PictureInPictureFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, pictureInPictureKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(PictureInPictureFragment pictureInPictureFragment, PictureInPictureKey pictureInPictureKey) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, pictureInPictureFragment, pictureInPictureKey);
        }
    }
}
