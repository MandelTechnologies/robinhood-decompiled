package com.robinhood.android.crypto.p094ui.detail.p095v2;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.animation.AnimationModifier;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.microgramsdui.MicrogramEmbeddedSection3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: CryptoDetailComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class CryptoDetailComposableKt$CryptoDetailComponents$1$1$2$5 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ Context $context;
    final /* synthetic */ UUID $currencyPairId;

    CryptoDetailComposableKt$CryptoDetailComponents$1$1$2$5(UUID uuid, Context context) {
        this.$currencyPairId = uuid;
        this.$context = context;
    }

    private static final boolean invoke$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final float invoke$lambda$5(SnapshotState4<C2002Dp> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    private static final void invoke$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C2002Dp invoke$lambda$4$lambda$3(float f, SnapshotState snapshotState) {
        if (!invoke$lambda$1(snapshotState)) {
            f = C2002Dp.m7995constructorimpl(0);
        }
        return C2002Dp.m7993boximpl(f);
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(784855699, i, -1, "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComponents.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoDetailComposable.kt:309)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
        composer.endReplaceGroup();
        final float fM21591getLargeD9Ej5fM = BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21591getLargeD9Ej5fM();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComponents$1$1$2$5$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoDetailComposableKt$CryptoDetailComponents$1$1$2$5.invoke$lambda$4$lambda$3(fM21591getLargeD9Ej5fM, snapshotState);
                }
            });
            composer.updateRememberedValue(objRememberedValue2);
        }
        SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue2;
        composer.endReplaceGroup();
        Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
        composer.startReplaceGroup(5004770);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComponents$1$1$2$5$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoDetailComposableKt$CryptoDetailComponents$1$1$2$5.invoke$lambda$7$lambda$6(snapshotState, (LayoutCoordinates) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        Modifier modifierAnimateContentSize$default = AnimationModifier.animateContentSize$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(OnGloballyPositionedModifier3.onGloballyPositioned(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, (Function1) objRememberedValue3), 0.0f, 0.0f, 0.0f, invoke$lambda$5(snapshotState4), 7, null), null, null, 3, null);
        RemoteMicrogramApplication remoteMicrogramApplication = new RemoteMicrogramApplication(CryptoDetailComposableKt.MicrogramAppName, null, 2, null);
        String str = "touchpoint=CRYPTO_DETAIL_PAGE&currency_pair_id=" + this.$currencyPairId;
        AppCompatActivity appCompatActivityFindActivityBaseContext = BaseContexts.findActivityBaseContext(this.$context);
        if (appCompatActivityFindActivityBaseContext == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        FragmentManager supportFragmentManager = appCompatActivityFindActivityBaseContext.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        MicrogramEmbeddedSection3.MicrogramEmbeddedSection(remoteMicrogramApplication, supportFragmentManager, modifierAnimateContentSize$default, str, ComposableSingletons$CryptoDetailComposableKt.INSTANCE.getLambda$1428617090$feature_crypto_externalDebug(), null, null, false, "CRYPTO_DETAIL_PAGE_v2", composer, 100687872, 224);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6(SnapshotState snapshotState, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        invoke$lambda$2(snapshotState, ((int) (it.mo7241getSizeYbymL2g() & 4294967295L)) > 0);
        return Unit.INSTANCE;
    }
}
