package com.robinhood.android.crypto.tab.p093ui.lists;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.crypto.tab.p093ui.CryptoHomeDuxo;
import com.robinhood.android.crypto.tab.p093ui.lists.cryptoHomeWatchlistSection4;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.shared.portfolio.lists.p391ui.CuratedListComposable5;
import com.robinhood.shared.portfolio.lists.p391ui.CuratedListState;
import com.robinhood.utils.compose.reorderable.ReorderableLazyListScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: cryptoHomeWatchlistSection.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0000¨\u0006\u000b"}, m3636d2 = {"cryptoHomeWatchlistSection", "", "Lcom/robinhood/utils/compose/reorderable/ReorderableLazyListScope;", "watchlistState", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListState;", "duxo", "Lcom/robinhood/android/crypto/tab/ui/CryptoHomeDuxo;", "context", "Landroid/content/Context;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "feature-crypto-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.tab.ui.lists.CryptoHomeWatchlistSectionKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class cryptoHomeWatchlistSection4 {
    public static final void cryptoHomeWatchlistSection(ReorderableLazyListScope reorderableLazyListScope, CuratedListState curatedListState, CryptoHomeDuxo duxo, Context context, Navigator navigator) {
        Intrinsics.checkNotNullParameter(reorderableLazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        if (curatedListState != null) {
            cryptoHomeWatchlistSection cryptohomewatchlistsection = cryptoHomeWatchlistSection.INSTANCE;
            CuratedListComposable5.curatedList$default(reorderableLazyListScope, curatedListState, cryptohomewatchlistsection.getLambda$462236283$feature_crypto_tab_externalDebug(), ComposableLambda3.composableLambdaInstance(1287444917, true, new C131661(duxo, context, navigator)), false, cryptohomewatchlistsection.getLambda$369857483$feature_crypto_tab_externalDebug(), null, 40, null);
        }
    }

    /* compiled from: cryptoHomeWatchlistSection.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.tab.ui.lists.CryptoHomeWatchlistSectionKt$cryptoHomeWatchlistSection$1 */
    static final class C131661 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Context $context;
        final /* synthetic */ CryptoHomeDuxo $duxo;
        final /* synthetic */ Navigator $navigator;

        C131661(CryptoHomeDuxo cryptoHomeDuxo, Context context, Navigator navigator) {
            this.$duxo = cryptoHomeDuxo;
            this.$context = context;
            this.$navigator = navigator;
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
                ComposerKt.traceEventStart(1287444917, i, -1, "com.robinhood.android.crypto.tab.ui.lists.cryptoHomeWatchlistSection.<anonymous> (cryptoHomeWatchlistSection.kt:40)");
            }
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(this.$duxo) | composer.changedInstance(this.$context) | composer.changedInstance(this.$navigator);
            final CryptoHomeDuxo cryptoHomeDuxo = this.$duxo;
            final Context context = this.$context;
            final Navigator navigator = this.$navigator;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.lists.CryptoHomeWatchlistSectionKt$cryptoHomeWatchlistSection$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return cryptoHomeWatchlistSection4.C131661.invoke$lambda$1$lambda$0(cryptoHomeDuxo, context, navigator);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            CryptoHomeWatchlistAdditionRow3.CryptoHomeWatchlistAdditionRow(null, (Function0) objRememberedValue, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(CryptoHomeDuxo cryptoHomeDuxo, Context context, Navigator navigator) {
            cryptoHomeDuxo.getListsAdditionClickHandler().onClick(context, navigator);
            return Unit.INSTANCE;
        }
    }
}
