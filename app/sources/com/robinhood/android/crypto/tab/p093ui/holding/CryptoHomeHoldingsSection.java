package com.robinhood.android.crypto.tab.p093ui.holding;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.portfolio.positionsList.PositionsSection;
import com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsList;
import com.robinhood.android.common.portfolio.positionsList.ReorderablePositionsList2;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.android.models.portfolio.api.PositionsLocation;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.compose.reorderable.ReorderableLazyListScope;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoHomeHoldingsSection.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a0\u0010\u0000\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"cryptoHomeHoldingsSection", "Lkotlin/Function1;", "Lcom/robinhood/utils/compose/reorderable/ReorderableLazyListScope;", "", "Lkotlin/ExtensionFunctionType;", "accountNumber", "", "positionInstrumentType", "Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "(Ljava/lang/String;Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function1;", "feature-crypto-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.tab.ui.holding.CryptoHomeHoldingsSectionKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoHomeHoldingsSection {
    public static final Function1<ReorderableLazyListScope, Unit> cryptoHomeHoldingsSection(String str, final PositionInstrumentType positionInstrumentType, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(positionInstrumentType, "positionInstrumentType");
        composer.startReplaceGroup(-325058621);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-325058621, i, -1, "com.robinhood.android.crypto.tab.ui.holding.cryptoHomeHoldingsSection (CryptoHomeHoldingsSection.kt:18)");
        }
        EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer, AutoLoggingCompositionLocals4.$stable);
        Screen screen = ((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen();
        int i2 = i & 112;
        final ReorderablePositionsList reorderablePositionsListStreamAndRememberPositionsListState = ReorderablePositionsList2.streamAndRememberPositionsListState(str, positionInstrumentType, PositionsLocation.CRYPTO_TAB, false, null, composer, (i & 14) | 384 | i2, 24);
        composer.startReplaceGroup(-1746271574);
        boolean zChangedInstance = composer.changedInstance(current) | composer.changedInstance(screen);
        int i3 = i2 ^ 48;
        boolean z = zChangedInstance | ((i3 > 32 && composer.changed(positionInstrumentType.ordinal())) || (i & 48) == 32);
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new CryptoHomeHoldingsSection2(current, screen, positionInstrumentType, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(str, positionInstrumentType, (Function2) objRememberedValue, composer, i & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        composer.startReplaceGroup(-1633490746);
        boolean zChanged = composer.changed(reorderablePositionsListStreamAndRememberPositionsListState) | ((i3 > 32 && composer.changed(positionInstrumentType.ordinal())) || (i & 48) == 32);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.crypto.tab.ui.holding.CryptoHomeHoldingsSectionKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoHomeHoldingsSection.cryptoHomeHoldingsSection$lambda$2$lambda$1(positionInstrumentType, reorderablePositionsListStreamAndRememberPositionsListState, (ReorderableLazyListScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function1<ReorderableLazyListScope, Unit> function1 = (Function1) objRememberedValue2;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cryptoHomeHoldingsSection$lambda$2$lambda$1(PositionInstrumentType positionInstrumentType, ReorderablePositionsList reorderablePositionsList, ReorderableLazyListScope reorderableLazyListScope) {
        Intrinsics.checkNotNullParameter(reorderableLazyListScope, "<this>");
        String lowerCase = positionInstrumentType.getServerValue().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        PositionsSection.lazyCryptoPositionsSection$default(reorderableLazyListScope, reorderablePositionsList, null, null, null, "positions_" + lowerCase, 14, null);
        return Unit.INSTANCE;
    }
}
