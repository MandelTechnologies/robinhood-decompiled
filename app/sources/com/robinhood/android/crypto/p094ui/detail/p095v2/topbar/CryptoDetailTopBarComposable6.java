package com.robinhood.android.crypto.p094ui.detail.p095v2.topbar;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.crypto.p094ui.detail.p095v2.topbar.CryptoDetailTopBarAction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoDetailTopBarComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.ui.detail.v2.topbar.ComposableSingletons$CryptoDetailTopBarComposableKt$lambda$1979927180$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoDetailTopBarComposable6 implements Function2<Composer, Integer, Unit> {
    public static final CryptoDetailTopBarComposable6 INSTANCE = new CryptoDetailTopBarComposable6();

    CryptoDetailTopBarComposable6() {
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
            ComposerKt.traceEventStart(1979927180, i, -1, "com.robinhood.android.crypto.ui.detail.v2.topbar.ComposableSingletons$CryptoDetailTopBarComposableKt.lambda$1979927180.<anonymous> (CryptoDetailTopBarComposable.kt:246)");
        }
        CryptoDetailTopBarViewState cryptoDetailTopBarViewState = new CryptoDetailTopBarViewState(null, "", "", true, extensions2.persistentListOf(CryptoDetailTopBarAction.Pip.INSTANCE, CryptoDetailTopBarAction.AdvancedAlerts.INSTANCE, new CryptoDetailTopBarAction.AddToList("Add BTC to List")));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.v2.topbar.ComposableSingletons$CryptoDetailTopBarComposableKt$lambda$1979927180$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.crypto.ui.detail.v2.topbar.ComposableSingletons$CryptoDetailTopBarComposableKt$lambda$1979927180$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoDetailTopBarComposable6.invoke$lambda$3$lambda$2((CryptoDetailTopBarAction) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        CryptoDetailTopBarComposable7.TopBarInternal(cryptoDetailTopBarViewState, true, function0, (Function1) objRememberedValue2, null, composer, 3504, 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(CryptoDetailTopBarAction it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
