package com.truelayer.payments.p419ui.screens.confirmation.components;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.truelayer.payments.p419ui.C42830R;
import com.truelayer.payments.p419ui.utils.TestTags;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProviderToMerchantIcons.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.truelayer.payments.ui.screens.confirmation.components.ComposableSingletons$ProviderToMerchantIconsKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class ProviderToMerchantIcons {
    public static final ProviderToMerchantIcons INSTANCE = new ProviderToMerchantIcons();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<BoxScope, Composer, Integer, Unit> f9586lambda1 = ComposableLambda3.composableLambdaInstance(1324944284, false, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.screens.confirmation.components.ComposableSingletons$ProviderToMerchantIconsKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            invoke(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxScope EncircledProviderImage, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(EncircledProviderImage, "$this$EncircledProviderImage");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1324944284, i, -1, "com.truelayer.payments.ui.screens.confirmation.components.ComposableSingletons$ProviderToMerchantIconsKt.lambda-1.<anonymous> (ProviderToMerchantIcons.kt:52)");
                }
                ImageKt.Image(PainterResources_androidKt.painterResource(C42830R.drawable.default_merchant_icon, composer, 0), (String) null, TestTag3.testTag(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), TestTags.MERCHANT_FAILED_ICON), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 440, 120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: getLambda-1$payments_ui_release, reason: not valid java name */
    public final Function3<BoxScope, Composer, Integer, Unit> m27093getLambda1$payments_ui_release() {
        return f9586lambda1;
    }
}
