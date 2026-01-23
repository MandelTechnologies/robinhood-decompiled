package com.robinhood.android.crypto.tab.p093ui.interest;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoHomeInterestSection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.tab.ui.interest.ComposableSingletons$CryptoHomeInterestSectionKt$lambda$-1932137170$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoHomeInterestSection2 implements Function2<Composer, Integer, Unit> {
    public static final CryptoHomeInterestSection2 INSTANCE = new CryptoHomeInterestSection2();

    CryptoHomeInterestSection2() {
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
            ComposerKt.traceEventStart(-1932137170, i, -1, "com.robinhood.android.crypto.tab.ui.interest.ComposableSingletons$CryptoHomeInterestSectionKt.lambda$-1932137170.<anonymous> (CryptoHomeInterestSection.kt:378)");
        }
        AnnotatedString annotatedString = new AnnotatedString("Earned this month", null, 2, null);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        ImmutableList3 persistentList = extensions2.toPersistentList(CollectionsKt.listOf((Object[]) new DataRowWithIconClickHandler[]{new DataRowWithIconClickHandler(new BentoDataRowState(null, annotatedString, Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, new AnnotatedString("$1.30", null, 2, null), null, null, null, null, false, false, 4057, null), null), new DataRowWithIconClickHandler(new BentoDataRowState(null, new AnnotatedString("Lifetime interest paid", null, 2, null), Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU()), null, null, new AnnotatedString("$11.55", null, 2, null), null, null, null, null, false, false, 4057, null), null)}));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.interest.ComposableSingletons$CryptoHomeInterestSectionKt$lambda$-1932137170$1$$ExternalSyntheticLambda0
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
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.crypto.tab.ui.interest.ComposableSingletons$CryptoHomeInterestSectionKt$lambda$-1932137170$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        CryptoHomeInterestSection4.EnrolledComposable("Interest", persistentList, "Deposit funds", function0, (Function0) objRememberedValue2, null, "1.87% APY", null, composer, (BentoDataRowState.$stable << 3) | 1600902, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
