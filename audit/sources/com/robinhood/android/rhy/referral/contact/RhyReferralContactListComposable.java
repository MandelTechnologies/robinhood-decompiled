package com.robinhood.android.rhy.referral.contact;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyReferralContactListComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhy.referral.contact.ComposableSingletons$RhyReferralContactListComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RhyReferralContactListComposable {
    public static final RhyReferralContactListComposable INSTANCE = new RhyReferralContactListComposable();

    /* renamed from: lambda$-318583956, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f9228lambda$318583956 = ComposableLambda3.composableLambdaInstance(-318583956, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.rhy.referral.contact.ComposableSingletons$RhyReferralContactListComposableKt$lambda$-318583956$1
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
                ComposerKt.traceEventStart(-318583956, i, -1, "com.robinhood.android.rhy.referral.contact.ComposableSingletons$RhyReferralContactListComposableKt.lambda$-318583956.<anonymous> (RhyReferralContactListComposable.kt:185)");
            }
            RhyReferralContactListComposable3.Empty(PaddingKt.m21622defaultHorizontalPaddingWMci_g0(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, composer, 6, 2), composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-318583956$feature_rhy_referral_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m18258getLambda$318583956$feature_rhy_referral_externalDebug() {
        return f9228lambda$318583956;
    }
}
