package com.robinhood.android.transfers.p271ui.p272v2;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.microgramsdui.MicrogramEmbeddedSection3;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.utils.Either;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import microgram.android.MicrogramSource;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: CreateTransferV2Composable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2ComposableKt$CreateTransferV2Composable$1$1$1$1$2, reason: use source file name */
/* loaded from: classes9.dex */
final class CreateTransferV2Composable5 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ FragmentManager $childFragmentManager;
    final /* synthetic */ Either<List<UIComponent<GenericAction>>, RemoteMicrogramApplication> $disclosureSource;

    /* JADX WARN: Multi-variable type inference failed */
    CreateTransferV2Composable5(Either<? extends List<? extends UIComponent<? extends GenericAction>>, RemoteMicrogramApplication> either, FragmentManager fragmentManager) {
        this.$disclosureSource = either;
        this.$childFragmentManager = fragmentManager;
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
            ComposerKt.traceEventStart(1951852306, i, -1, "com.robinhood.android.transfers.ui.v2.CreateTransferV2Composable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreateTransferV2Composable.kt:173)");
        }
        final Either<List<UIComponent<GenericAction>>, RemoteMicrogramApplication> either = this.$disclosureSource;
        final FragmentManager fragmentManager = this.$childFragmentManager;
        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(2069642023, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2ComposableKt$CreateTransferV2Composable$1$1$1$1$2.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                if ((i2 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2069642023, i2, -1, "com.robinhood.android.transfers.ui.v2.CreateTransferV2Composable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreateTransferV2Composable.kt:174)");
                }
                MicrogramEmbeddedSection3.MicrogramEmbeddedSection((MicrogramSource) ((Either.Right) either).getValue(), fragmentManager, TestTag3.testTag(Modifier.INSTANCE, CreateTransferV2Composable3.DisclosureFooterTag), null, CreateTransferV2Composable.INSTANCE.m19952getLambda$589898730$feature_transfers_externalRelease(), null, null, false, null, composer2, 24960, 488);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
