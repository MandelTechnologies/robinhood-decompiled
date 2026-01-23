package com.robinhood.shared.crypto.acats.submitassets;

import android.content.res.Resources;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs;
import com.robinhood.android.navigation.compose.destination.ComposeNav;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.shared.crypto.acats.AssetListType;
import com.robinhood.shared.crypto.acats.AssetRowText;
import com.robinhood.shared.crypto.acats.MigrationAssetsListDest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: MigrationSubmitAssetsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsComposableKt$MigrationSubmitAssetsComposable$1$1$2$1$1$3$1, reason: use source file name */
/* loaded from: classes6.dex */
final class MigrationSubmitAssetsComposable8 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ BentoBaseRowState $cashRow;
    final /* synthetic */ ImmutableList<AssetRowText> $detailRows;
    final /* synthetic */ LifecycleAwareNavigator $navigator;

    MigrationSubmitAssetsComposable8(BentoBaseRowState bentoBaseRowState, LifecycleAwareNavigator lifecycleAwareNavigator, ImmutableList<AssetRowText> immutableList) {
        this.$cashRow = bentoBaseRowState;
        this.$navigator = lifecycleAwareNavigator;
        this.$detailRows = immutableList;
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
            ComposerKt.traceEventStart(792217581, i, -1, "com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MigrationSubmitAssetsComposable.kt:198)");
        }
        Modifier modifierM4893clickableXHw0xAI$default = Modifier.INSTANCE;
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifierM4893clickableXHw0xAI$default, 0.0f, 1, null);
        composer.startReplaceGroup(1111893662);
        if (this.$cashRow.getMeta() instanceof BentoBaseRowState.Meta.SingleLineAndIcon) {
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$navigator) | composer.changed(this.$detailRows);
            final LifecycleAwareNavigator lifecycleAwareNavigator = this.$navigator;
            final ImmutableList<AssetRowText> immutableList = this.$detailRows;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.acats.submitassets.MigrationSubmitAssetsComposableKt$MigrationSubmitAssetsComposable$1$1$2$1$1$3$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MigrationSubmitAssetsComposable8.invoke$lambda$1$lambda$0(lifecycleAwareNavigator, immutableList);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifierM4893clickableXHw0xAI$default, false, null, null, (Function0) objRememberedValue, 7, null);
        }
        composer.endReplaceGroup();
        BentoBaseRowKt.m20915BentoBaseRowcd68TDI(modifierFillMaxWidth$default.then(modifierM4893clickableXHw0xAI$default), this.$cashRow, false, false, false, 0L, null, composer, BentoBaseRowState.$stable << 3, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(LifecycleAwareNavigator lifecycleAwareNavigator, ImmutableList immutableList) throws Resources.NotFoundException {
        MigrationAssetsListDest migrationAssetsListDest = MigrationAssetsListDest.INSTANCE;
        AssetListType assetListType = AssetListType.NON_TRANSFERABLE_CASH;
        if (immutableList != null) {
            LifecycleAwareNavigator.navigate$default(lifecycleAwareNavigator, (ComposeNav) ComposableDestinationWithArgs.composeNav$default(migrationAssetsListDest, new MigrationAssetsListDest.Args(assetListType, immutableList), null, null, 6, null), false, (Function1) null, 6, (Object) null);
            return Unit.INSTANCE;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
