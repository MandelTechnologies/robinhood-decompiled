package com.robinhood.android.crypto.tab.p093ui.lists;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.shared.portfolio.lists.p391ui.CuratedListSource;
import com.robinhood.shared.portfolio.lists.p391ui.CuratedListState;
import com.robinhood.shared.portfolio.lists.p391ui.UtilsKt;
import kotlin.Metadata;

/* compiled from: CryptoHomeListsSection.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"createCuratedListSection", "Lcom/robinhood/shared/portfolio/lists/ui/CuratedListState;", "accountNumber", "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/shared/portfolio/lists/ui/CuratedListState;", "feature-crypto-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.tab.ui.lists.CryptoHomeListsSectionKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoHomeListsSection {
    public static final CuratedListState createCuratedListSection(String str, Composer composer, int i) {
        composer.startReplaceGroup(-152079912);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-152079912, i, -1, "com.robinhood.android.crypto.tab.ui.lists.createCuratedListSection (CryptoHomeListsSection.kt:10)");
        }
        CuratedListState curatedListStateStreamAndRememberCuratedListState = UtilsKt.streamAndRememberCuratedListState(str, null, false, CuratedListSource.CRYPTO_TAB, composer, (i & 14) | 3456, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return curatedListStateStreamAndRememberCuratedListState;
    }
}
