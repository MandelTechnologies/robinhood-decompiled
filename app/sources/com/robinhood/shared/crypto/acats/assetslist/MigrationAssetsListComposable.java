package com.robinhood.shared.crypto.acats.assetslist;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.shared.crypto.acats.AssetListType;
import com.robinhood.shared.crypto.acats.AssetRowText;
import com.robinhood.shared.crypto.acats.C37511R;
import com.robinhood.shared.crypto.acats.assetslist.MigrationAssetsListComposable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: MigrationAssetsListComposable.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"MigrationAssetsListComposable", "", "assetListType", "Lcom/robinhood/shared/crypto/acats/AssetListType;", "rows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/crypto/acats/AssetRowText;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/crypto/acats/AssetListType;Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-acats_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.acats.assetslist.MigrationAssetsListComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class MigrationAssetsListComposable {

    /* compiled from: MigrationAssetsListComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.acats.assetslist.MigrationAssetsListComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AssetListType.values().length];
            try {
                iArr[AssetListType.TRANSFERABLE_CRYPTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AssetListType.NON_TRANSFERABLE_CASH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AssetListType.NON_TRANSFERABLE_CRYPTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MigrationAssetsListComposable$lambda$0(AssetListType assetListType, ImmutableList immutableList, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MigrationAssetsListComposable(assetListType, immutableList, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void MigrationAssetsListComposable(final AssetListType assetListType, final ImmutableList<AssetRowText> rows, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(assetListType, "assetListType");
        Intrinsics.checkNotNullParameter(rows, "rows");
        Composer composerStartRestartGroup = composer.startRestartGroup(1441600747);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(assetListType.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(rows) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i5 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1441600747, i3, -1, "com.robinhood.shared.crypto.acats.assetslist.MigrationAssetsListComposable (MigrationAssetsListComposable.kt:36)");
            }
            int i6 = WhenMappings.$EnumSwitchMapping$0[assetListType.ordinal()];
            if (i6 == 1) {
                i4 = C37511R.string.crypto_acats_assets_list_transferable_crypto_subtitle;
            } else if (i6 == 2) {
                i4 = C37511R.string.crypto_acats_assets_list_non_transferable_cash_subtitle;
            } else {
                if (i6 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i4 = C37511R.string.crypto_acats_assets_list_non_transferable_crypto_subtitle;
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(3976064, true, new C375171(modifier, i4, rows), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.acats.assetslist.MigrationAssetsListComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MigrationAssetsListComposable.MigrationAssetsListComposable$lambda$0(assetListType, rows, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: MigrationAssetsListComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.acats.assetslist.MigrationAssetsListComposableKt$MigrationAssetsListComposable$1 */
    static final class C375171 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ ImmutableList<AssetRowText> $rows;
        final /* synthetic */ int $subtitleRes;

        C375171(Modifier modifier, int i, ImmutableList<AssetRowText> immutableList) {
            this.$modifier = modifier;
            this.$subtitleRes = i;
            this.$rows = immutableList;
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
                ComposerKt.traceEventStart(3976064, i, -1, "com.robinhood.shared.crypto.acats.assetslist.MigrationAssetsListComposable.<anonymous> (MigrationAssetsListComposable.kt:44)");
            }
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxSize$default(this.$modifier, 0.0f, 1, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$subtitleRes) | composer.changed(this.$rows);
            final ImmutableList<AssetRowText> immutableList = this.$rows;
            final int i2 = this.$subtitleRes;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.acats.assetslist.MigrationAssetsListComposableKt$MigrationAssetsListComposable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MigrationAssetsListComposable.C375171.invoke$lambda$2$lambda$1(immutableList, i2, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierM5144paddingVpY3zN4$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(final ImmutableList immutableList, final int i, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-771852597, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.assetslist.MigrationAssetsListComposableKt$MigrationAssetsListComposable$1$1$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i2) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i2 & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-771852597, i2, -1, "com.robinhood.shared.crypto.acats.assetslist.MigrationAssetsListComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MigrationAssetsListComposable.kt:50)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(i, composer, 0), com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer, 6, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16380);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i3 = BentoTheme.$stable;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM()), composer, 0);
                    BentoText2.m20747BentoText38GnDrw(immutableList.size() + " assets", com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer, 6, 1), Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getTextS(), composer, 0, 0, 8184);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM()), composer, 0);
                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), bentoTheme.getColors(composer, i3).m21427getFg30d7_KjU(), 0.0f, composer, 6, 4);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM()), composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
            final C37513xc5077600 c37513xc5077600 = new Function1() { // from class: com.robinhood.shared.crypto.acats.assetslist.MigrationAssetsListComposableKt$MigrationAssetsListComposable$1$invoke$lambda$2$lambda$1$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(AssetRowText assetRowText) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((AssetRowText) obj);
                }
            };
            LazyColumn.items(immutableList.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.shared.crypto.acats.assetslist.MigrationAssetsListComposableKt$MigrationAssetsListComposable$1$invoke$lambda$2$lambda$1$$inlined$items$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i2) {
                    return c37513xc5077600.invoke(immutableList.get(i2));
                }
            }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.acats.assetslist.MigrationAssetsListComposableKt$MigrationAssetsListComposable$1$invoke$lambda$2$lambda$1$$inlined$items$default$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
                    int i4;
                    if ((i3 & 6) == 0) {
                        i4 = i3 | (composer.changed(lazyItemScope) ? 4 : 2);
                    } else {
                        i4 = i3;
                    }
                    if ((i3 & 48) == 0) {
                        i4 |= composer.changed(i2) ? 32 : 16;
                    }
                    if (!composer.shouldExecute((i4 & 147) != 146, i4 & 1)) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632812321, i4, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    AssetRowText assetRowText = (AssetRowText) immutableList.get(i2);
                    composer.startReplaceGroup(1977758286);
                    BentoBaseRowKt.m20915BentoBaseRowcd68TDI(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), new BentoBaseRowState((BentoBaseRowState.Start) null, assetRowText.getPrimaryText(), (String) null, (String) null, (BentoBaseRowState.Meta) new BentoBaseRowState.Meta.SingleLine(assetRowText.getMetaText()), (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, (DefaultConstructorMarker) null), false, false, false, 0L, null, composer, (BentoBaseRowState.$stable << 3) | 6, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            return Unit.INSTANCE;
        }
    }
}
