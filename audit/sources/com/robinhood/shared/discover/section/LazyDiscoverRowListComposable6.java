package com.robinhood.shared.discover.section;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.shared.discover.section.DiscoverRow;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LazyDiscoverRowListComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.discover.section.LazyDiscoverRowListComposableKt$LazyDiscoverRowListComposable$1$1$1$2, reason: use source file name */
/* loaded from: classes6.dex */
final class LazyDiscoverRowListComposable6 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ Context $context;
    final /* synthetic */ DiscoverRow $it;
    final /* synthetic */ Navigator $navigator;

    LazyDiscoverRowListComposable6(DiscoverRow discoverRow, Navigator navigator, Context context) {
        this.$it = discoverRow;
        this.$navigator = navigator;
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(60881225, i, -1, "com.robinhood.shared.discover.section.LazyDiscoverRowListComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LazyDiscoverRowListComposable.kt:53)");
        }
        DiscoverRow.Loaded loaded = (DiscoverRow.Loaded) this.$it;
        Modifier.Companion companion = Modifier.INSTANCE;
        composer.startReplaceGroup(-1746271574);
        boolean zChanged = composer.changed(this.$it) | composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context);
        final DiscoverRow discoverRow = this.$it;
        final Navigator navigator = this.$navigator;
        final Context context = this.$context;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.shared.discover.section.LazyDiscoverRowListComposableKt$LazyDiscoverRowListComposable$1$1$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LazyDiscoverRowListComposable6.invoke$lambda$1$lambda$0(discoverRow, navigator, context);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        DiscoverRow2.DiscoverRowComposable(loaded, ClickableKt.m4893clickableXHw0xAI$default(companion, false, null, null, (Function0) objRememberedValue, 7, null), composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(DiscoverRow discoverRow, Navigator navigator, Context context) {
        Uri uri = Uri.parse(((DiscoverRow.Loaded) discoverRow).getDeeplink());
        if (navigator.isDeepLinkSupported(uri)) {
            Navigator.DefaultImpls.handleDeepLink$default(navigator, context, uri, Boolean.TRUE, null, false, null, 56, null);
        }
        return Unit.INSTANCE;
    }
}
