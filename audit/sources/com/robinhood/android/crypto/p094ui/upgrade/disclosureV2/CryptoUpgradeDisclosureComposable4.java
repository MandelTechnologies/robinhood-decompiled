package com.robinhood.android.crypto.p094ui.upgrade.disclosureV2;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.crypto.p094ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureBottomBar;
import com.robinhood.android.crypto.p094ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureBottomBarState;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoUpgradeDisclosureComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureComposableKt$CryptoUpgradeDisclosureComposable$9$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoUpgradeDisclosureComposable4 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ CryptoUpgradeDisclosureBottomBarState $bottomBarState;
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ CryptoUpgradeDisclosureDuxo $duxo;
    final /* synthetic */ ScrollState $scrollState;

    CryptoUpgradeDisclosureComposable4(CryptoUpgradeDisclosureBottomBarState cryptoUpgradeDisclosureBottomBarState, CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo, CoroutineScope coroutineScope, ScrollState scrollState) {
        this.$bottomBarState = cryptoUpgradeDisclosureBottomBarState;
        this.$duxo = cryptoUpgradeDisclosureDuxo;
        this.$coroutineScope = coroutineScope;
        this.$scrollState = scrollState;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1289792120, i, -1, "com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureComposable.<anonymous>.<anonymous>.<anonymous> (CryptoUpgradeDisclosureComposable.kt:220)");
        }
        Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null));
        CryptoUpgradeDisclosureBottomBarState cryptoUpgradeDisclosureBottomBarState = this.$bottomBarState;
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(this.$duxo);
        final CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo = this.$duxo;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureComposableKt$CryptoUpgradeDisclosureComposable$9$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoUpgradeDisclosureComposable4.invoke$lambda$1$lambda$0(cryptoUpgradeDisclosureDuxo);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance2 = composer.changedInstance(this.$coroutineScope) | composer.changed(this.$scrollState);
        final CoroutineScope coroutineScope = this.$coroutineScope;
        final ScrollState scrollState = this.$scrollState;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.CryptoUpgradeDisclosureComposableKt$CryptoUpgradeDisclosureComposable$9$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoUpgradeDisclosureComposable4.invoke$lambda$3$lambda$2(coroutineScope, scrollState);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        CryptoUpgradeDisclosureBottomBar.CryptoUpgradeDisclosureBottomBar(cryptoUpgradeDisclosureBottomBarState, function0, (Function0) objRememberedValue2, modifierNavigationBarsPadding, composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(CryptoUpgradeDisclosureDuxo cryptoUpgradeDisclosureDuxo) {
        cryptoUpgradeDisclosureDuxo.onScrolledButtonClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(CoroutineScope coroutineScope, ScrollState scrollState) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new CryptoUpgradeDisclosureComposable5(scrollState, null), 3, null);
        return Unit.INSTANCE;
    }
}
