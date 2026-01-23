package com.robinhood.android.portfolio.pnlhub.p216ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.portfolio.pnl.PnlHubAssetClass;
import com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBar4;
import com.robinhood.android.portfolio.pnlhub.appbar.PnlHubTopAppBarState;
import com.robinhood.iso.countrycode.CountryCode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: PnlHubComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.portfolio.pnlhub.ui.ComposableSingletons$PnlHubComposableKt$lambda$2106606761$1, reason: use source file name */
/* loaded from: classes11.dex */
final class PnlHubComposable4 implements Function2<Composer, Integer, Unit> {
    public static final PnlHubComposable4 INSTANCE = new PnlHubComposable4();

    PnlHubComposable4() {
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
            ComposerKt.traceEventStart(2106606761, i, -1, "com.robinhood.android.portfolio.pnlhub.ui.ComposableSingletons$PnlHubComposableKt.lambda$2106606761.<anonymous> (PnlHubComposable.kt:366)");
        }
        PnlHubTopAppBarState pnlHubTopAppBarState = new PnlHubTopAppBarState(extensions2.persistentListOf(), PnlHubAssetClass.ALL, false, false, CountryCode.Supported.UnitedStates.INSTANCE, false, false);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.portfolio.pnlhub.ui.ComposableSingletons$PnlHubComposableKt$lambda$2106606761$1$$ExternalSyntheticLambda0
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
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.portfolio.pnlhub.ui.ComposableSingletons$PnlHubComposableKt$lambda$2106606761$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PnlHubComposable4.invoke$lambda$3$lambda$2((PnlHubAssetClass) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function1 function1 = (Function1) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.portfolio.pnlhub.ui.ComposableSingletons$PnlHubComposableKt$lambda$2106606761$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        Function0 function02 = (Function0) objRememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.portfolio.pnlhub.ui.ComposableSingletons$PnlHubComposableKt$lambda$2106606761$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        PnlHubTopAppBar4.PnlHubTopAppBar(pnlHubTopAppBarState, function0, function1, function02, (Function0) objRememberedValue4, null, null, composer, 28080, 96);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(PnlHubAssetClass it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
