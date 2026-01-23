package com.robinhood.android.feature.gifting.invitation;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.common.ShimmerLoaderType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: GiftingInvitationBottomSheetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.feature.gifting.invitation.ComposableSingletons$GiftingInvitationBottomSheetFragmentKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class GiftingInvitationBottomSheetFragment2 {
    public static final GiftingInvitationBottomSheetFragment2 INSTANCE = new GiftingInvitationBottomSheetFragment2();
    private static Function2<Composer, Integer, Unit> lambda$1314290175 = ComposableLambda3.composableLambdaInstance(1314290175, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.feature.gifting.invitation.ComposableSingletons$GiftingInvitationBottomSheetFragmentKt$lambda$1314290175$1
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
                ComposerKt.traceEventStart(1314290175, i, -1, "com.robinhood.android.feature.gifting.invitation.ComposableSingletons$GiftingInvitationBottomSheetFragmentKt.lambda$1314290175.<anonymous> (GiftingInvitationBottomSheetFragment.kt:29)");
            }
            LoadingScreenComposablesKt.ShimmerLoadingComposable(ShimmerLoaderType.Boxes.INSTANCE, SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(400)), composer, ShimmerLoaderType.Boxes.$stable | 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1314290175$feature_gifting_externalDebug() {
        return lambda$1314290175;
    }
}
