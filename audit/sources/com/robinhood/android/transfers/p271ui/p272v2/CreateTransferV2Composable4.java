package com.robinhood.android.transfers.p271ui.p272v2;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.utils.Either;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: CreateTransferV2Composable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2ComposableKt$CreateTransferV2Composable$1$1$1$1$1, reason: use source file name */
/* loaded from: classes9.dex */
final class CreateTransferV2Composable4 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Either<List<UIComponent<GenericAction>>, RemoteMicrogramApplication> $disclosureSource;

    /* JADX WARN: Multi-variable type inference failed */
    CreateTransferV2Composable4(Either<? extends List<? extends UIComponent<? extends GenericAction>>, RemoteMicrogramApplication> either) {
        this.$disclosureSource = either;
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
            ComposerKt.traceEventStart(1988873133, i, -1, "com.robinhood.android.transfers.ui.v2.CreateTransferV2Composable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreateTransferV2Composable.kt:156)");
        }
        ImmutableList immutableList = extensions2.toImmutableList((Iterable) ((Either.Left) this.$disclosureSource).getValue());
        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.wrapContentHeight$default(SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null), null, false, 3, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null);
        composer.startReplaceGroup(-1772220517);
        SduiColumns.SduiColumn(immutableList, GenericAction.class, modifierM5144paddingVpY3zN4$default, null, null, HorizontalPadding.Default, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer, 100663296, 0);
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
