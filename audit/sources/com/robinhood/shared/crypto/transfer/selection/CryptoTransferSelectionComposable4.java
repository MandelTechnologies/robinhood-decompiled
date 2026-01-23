package com.robinhood.shared.crypto.transfer.selection;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.BentoTextInput8;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.crypto.transfer.C37934R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: CryptoTransferSelectionComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionComposableKt$CryptoTransferSelectionComposable$4$1$1$1, reason: use source file name */
/* loaded from: classes6.dex */
final class CryptoTransferSelectionComposable4 implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ CryptoTransferSelectionDuxo $duxo;
    final /* synthetic */ SnapshotState4<CryptoTransferSelectionViewState> $state$delegate;

    CryptoTransferSelectionComposable4(CryptoTransferSelectionDuxo cryptoTransferSelectionDuxo, SnapshotState4<CryptoTransferSelectionViewState> snapshotState4) {
        this.$duxo = cryptoTransferSelectionDuxo;
        this.$state$delegate = snapshotState4;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope stickyHeader, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(stickyHeader, "$this$stickyHeader");
        if ((i2 & EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) == 128 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1417657677, i2, -1, "com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoTransferSelectionComposable.kt:107)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i3 = BentoTheme.$stable;
        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composer, i3).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 7, null);
        String query = CryptoTransferSelectionComposable3.CryptoTransferSelectionComposable$lambda$0(this.$state$delegate).getQuery();
        String strStringResource = StringResources_androidKt.stringResource(C37934R.string.crypto_selection_search_hint, composer, 0);
        BentoTextInput8.Icon.Size24 size24 = new BentoTextInput8.Icon.Size24(ServerToBentoAssetMapper2.SEARCH_24, null, null, 6, null);
        BentoTextInput8.Icon.Size24 trailingIcon = CryptoTransferSelectionComposable3.CryptoTransferSelectionComposable$lambda$0(this.$state$delegate).getTrailingIcon();
        CryptoTransferSelectionDuxo cryptoTransferSelectionDuxo = this.$duxo;
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(cryptoTransferSelectionDuxo);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new CryptoTransferSelectionComposable5(cryptoTransferSelectionDuxo);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Function1 function1 = (Function1) ((KFunction) objRememberedValue);
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance2 = composer.changedInstance(this.$duxo);
        final CryptoTransferSelectionDuxo cryptoTransferSelectionDuxo2 = this.$duxo;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.selection.CryptoTransferSelectionComposableKt$CryptoTransferSelectionComposable$4$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoTransferSelectionComposable4.invoke$lambda$2$lambda$1(cryptoTransferSelectionDuxo2);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        int i4 = BentoTextInput8.Icon.Size24.$stable;
        BentoTextInput4.BentoTextInput(query, function1, modifierM5146paddingqDBjuR0$default, null, strStringResource, null, null, size24, trailingIcon, (Function0) objRememberedValue2, null, null, null, false, false, composer, (i4 << 21) | (i4 << 24), 0, 31848);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(CryptoTransferSelectionDuxo cryptoTransferSelectionDuxo) {
        cryptoTransferSelectionDuxo.updateQuery("");
        return Unit.INSTANCE;
    }
}
