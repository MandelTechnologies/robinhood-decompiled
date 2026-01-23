package com.robinhood.android.creditcard.p091ui.waitlist.screens;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: WaitlistJoinedComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistJoinedComposableKt$WaitlistJoined$2$1$2$3$3$5$1, reason: use source file name */
/* loaded from: classes2.dex */
final class WaitlistJoinedComposable9 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState4<Float> $contentState$delegate;
    final /* synthetic */ Function0<Unit> $onInvite;
    final /* synthetic */ boolean $referralsBlocked;

    WaitlistJoinedComposable9(SnapshotState4<Float> snapshotState4, boolean z, Function0<Unit> function0) {
        this.$contentState$delegate = snapshotState4;
        this.$referralsBlocked = z;
        this.$onInvite = function0;
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
            ComposerKt.traceEventStart(42511785, i, -1, "com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistJoined.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WaitlistJoinedComposable.kt:298)");
        }
        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer, 6, 1);
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(this.$contentState$delegate);
        final SnapshotState4<Float> snapshotState4 = this.$contentState$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.waitlist.screens.WaitlistJoinedComposableKt$WaitlistJoined$2$1$2$3$3$5$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return WaitlistJoinedComposable9.invoke$lambda$1$lambda$0(snapshotState4, (GraphicsLayerScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoButtonBar2.BentoButtonBar(ModifiersKt.autoLogEvents$default(GraphicsLayerModifier6.graphicsLayer(modifierM21623defaultHorizontalPaddingrAjV9yQ, (Function1) objRememberedValue), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CC_WAITLIST_JOINED, null, null, null, 14, null), UserInteractionEventData.Action.INVITE_CONTACTS, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 41, null), false, false, false, true, false, null, 110, null), null, null, false, null, null, this.$onInvite, StringResources_androidKt.stringResource(C12201R.string.waitlist_joined_invite, composer, 0), false, new BentoButtons.Icon.Size16(ServerToBentoAssetMapper2.SHARE_ANDROID_16, null, 2, null), !this.$referralsBlocked, null, null, false, null, false, composer, BentoButtons.Icon.Size16.$stable << 27, 0, 63806);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SnapshotState4 snapshotState4, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setAlpha(WaitlistJoinedComposable4.WaitlistJoined$lambda$13(snapshotState4));
        return Unit.INSTANCE;
    }
}
