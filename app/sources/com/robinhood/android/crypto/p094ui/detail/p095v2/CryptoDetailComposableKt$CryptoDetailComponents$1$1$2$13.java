package com.robinhood.android.crypto.p094ui.detail.p095v2;

import android.content.Context;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.common.earnings.C37450R;
import com.robinhood.shared.common.earnings.EarningsComposable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoDetailComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class CryptoDetailComposableKt$CryptoDetailComponents$1$1$2$13 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ Context $context;
    final /* synthetic */ UUID $currencyPairId;
    final /* synthetic */ float $visibleComponentPadding;

    CryptoDetailComposableKt$CryptoDetailComponents$1$1$2$13(UUID uuid, Context context, float f) {
        this.$currencyPairId = uuid;
        this.$context = context;
        this.$visibleComponentPadding = f;
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
            ComposerKt.traceEventStart(-880601069, i, -1, "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComponents.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoDetailComposable.kt:427)");
        }
        String strStringResource = StringResources_androidKt.stringResource(C37450R.string.earnings_title_default, composer, 0);
        Modifier modifierCryptoDetailComponents$visibleComponentPadding = CryptoDetailComposableKt.CryptoDetailComponents$visibleComponentPadding(Modifier.INSTANCE, this.$visibleComponentPadding);
        Screen screen = ((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen();
        UUID uuid = this.$currencyPairId;
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(this.$context);
        final Context context = this.$context;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailComposableKt$CryptoDetailComponents$1$1$2$13$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoDetailComposableKt$CryptoDetailComponents$1$1$2$13.invoke$lambda$1$lambda$0(context, (String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        EarningsComposable.EarningsComposable(uuid, true, modifierCryptoDetailComponents$visibleComponentPadding, strStringResource, screen, (Function1) objRememberedValue, null, composer, 48, 64);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Context context, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        WebUtils.viewUrl$default(context, it, 0, 4, (Object) null);
        return Unit.INSTANCE;
    }
}
