package com.robinhood.android.cortex.digest.asset;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.cortex.digest.asset.AssetDigestBreakingNewsComposable;
import com.robinhood.android.cortex.models.asset.AssetDigestDetailItem;
import com.robinhood.android.cortex.models.asset.AssetType3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlerts2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AssetDigestBreakingNewsComposable.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a?\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0001¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m3636d2 = {"AssetDigestBreakingNewsComposable", "", "Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;", "instrumentType", "Lcom/robinhood/android/cortex/models/asset/CopilotInstrumentType;", "instrumentId", "Ljava/util/UUID;", "digestId", "", "detailItem", "Lcom/robinhood/android/cortex/models/asset/AssetDigestDetailItem;", "onRefreshClick", "Lkotlin/Function0;", "(Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;Lcom/robinhood/android/cortex/models/asset/CopilotInstrumentType;Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/android/cortex/models/asset/AssetDigestDetailItem;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-cortex-digest-asset_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestBreakingNewsComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class AssetDigestBreakingNewsComposable {

    /* compiled from: AssetDigestBreakingNewsComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestBreakingNewsComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AssetType3.values().length];
            try {
                iArr[AssetType3.STOCKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AssetType3.CRYPTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AssetDigestBreakingNewsComposable$lambda$0(RhModalBottomSheet5 rhModalBottomSheet5, AssetType3 assetType3, UUID uuid, String str, AssetDigestDetailItem assetDigestDetailItem, Function0 function0, int i, Composer composer, int i2) {
        AssetDigestBreakingNewsComposable(rhModalBottomSheet5, assetType3, uuid, str, assetDigestDetailItem, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void AssetDigestBreakingNewsComposable(final RhModalBottomSheet5 rhModalBottomSheet5, final AssetType3 instrumentType, final UUID instrumentId, final String digestId, final AssetDigestDetailItem detailItem, final Function0<Unit> onRefreshClick, Composer composer, final int i) {
        int i2;
        Screen.Name name;
        Intrinsics.checkNotNullParameter(rhModalBottomSheet5, "<this>");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(digestId, "digestId");
        Intrinsics.checkNotNullParameter(detailItem, "detailItem");
        Intrinsics.checkNotNullParameter(onRefreshClick, "onRefreshClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-858437607);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(rhModalBottomSheet5) : composerStartRestartGroup.changedInstance(rhModalBottomSheet5) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(instrumentType.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(instrumentId) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(digestId) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(detailItem) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onRefreshClick) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-858437607, i2, -1, "com.robinhood.android.cortex.digest.asset.AssetDigestBreakingNewsComposable (AssetDigestBreakingNewsComposable.kt:39)");
            }
            int i3 = WhenMappings.$EnumSwitchMapping$0[instrumentType.ordinal()];
            if (i3 == 1) {
                name = Screen.Name.SDP_DIGEST_BREAKING;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                name = Screen.Name.CORTEX_CDP_DIGEST_BREAKING;
            }
            String string2 = instrumentId.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(name, digestId, string2, null, 8, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-2053741170, true, new C119761(onRefreshClick, rhModalBottomSheet5, detailItem), composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestBreakingNewsComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AssetDigestBreakingNewsComposable.AssetDigestBreakingNewsComposable$lambda$0(rhModalBottomSheet5, instrumentType, instrumentId, digestId, detailItem, onRefreshClick, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: AssetDigestBreakingNewsComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.cortex.digest.asset.AssetDigestBreakingNewsComposableKt$AssetDigestBreakingNewsComposable$1 */
    static final class C119761 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ AssetDigestDetailItem $detailItem;
        final /* synthetic */ Function0<Unit> $onRefreshClick;
        final /* synthetic */ RhModalBottomSheet5 $this_AssetDigestBreakingNewsComposable;

        C119761(Function0<Unit> function0, RhModalBottomSheet5 rhModalBottomSheet5, AssetDigestDetailItem assetDigestDetailItem) {
            this.$onRefreshClick = function0;
            this.$this_AssetDigestBreakingNewsComposable = rhModalBottomSheet5;
            this.$detailItem = assetDigestDetailItem;
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
                ComposerKt.traceEventStart(-2053741170, i, -1, "com.robinhood.android.cortex.digest.asset.AssetDigestBreakingNewsComposable.<anonymous> (AssetDigestBreakingNewsComposable.kt:52)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(companion, null, 1, null);
            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Component.ComponentType componentType = Component.ComponentType.BUTTON;
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(componentType, "update_breaking_news", null, 4, null), null, 47, null), false, false, false, false, false, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
            String strStringResource = StringResources_androidKt.stringResource(C12023R.string.copilot_digest_breaking_news_update, composer, 0);
            BentoButtons.Icon.Size16 size16 = new BentoButtons.Icon.Size16(ServerToBentoAssetMapper2.RESEND_16, BentoButtons.Icon.Position.Trailing);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$onRefreshClick) | composer.changedInstance(this.$this_AssetDigestBreakingNewsComposable);
            final Function0<Unit> function0 = this.$onRefreshClick;
            final RhModalBottomSheet5 rhModalBottomSheet5 = this.$this_AssetDigestBreakingNewsComposable;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestBreakingNewsComposableKt$AssetDigestBreakingNewsComposable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AssetDigestBreakingNewsComposable.C119761.invoke$lambda$1$lambda$0(function0, rhModalBottomSheet5);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoAlertButton bentoAlertButton = new BentoAlertButton(strStringResource, (Function0) objRememberedValue, modifierAutoLogEvents$default, null, size16, false, 40, null);
            Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(componentType, "dismiss", null, 4, null), null, 47, null), false, false, false, false, false, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
            String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composer, 0);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this.$this_AssetDigestBreakingNewsComposable);
            final RhModalBottomSheet5 rhModalBottomSheet52 = this.$this_AssetDigestBreakingNewsComposable;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestBreakingNewsComposableKt$AssetDigestBreakingNewsComposable$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AssetDigestBreakingNewsComposable.C119761.invoke$lambda$3$lambda$2(rhModalBottomSheet52);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            List listListOf = CollectionsKt.listOf((Object[]) new BentoAlertButton[]{bentoAlertButton, new BentoAlertButton(strStringResource2, (Function0) objRememberedValue2, modifierAutoLogEvents$default2, null, null, false, 56, null)});
            final AssetDigestDetailItem assetDigestDetailItem = this.$detailItem;
            BentoAlerts2.AlertContent(modifierLogScreenTransitions$default, null, "", null, listListOf, true, ComposableLambda3.rememberComposableLambda(967698718, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.asset.AssetDigestBreakingNewsComposableKt.AssetDigestBreakingNewsComposable.1.3
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
                        ComposerKt.traceEventStart(967698718, i2, -1, "com.robinhood.android.cortex.digest.asset.AssetDigestBreakingNewsComposable.<anonymous>.<anonymous> (AssetDigestBreakingNewsComposable.kt:92)");
                    }
                    AssetDigestDetailItem assetDigestDetailItem2 = assetDigestDetailItem;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion2);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i3 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i3).m21595getXsmallD9Ej5fM(), 7, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getCenterVertically(), composer2, 48);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM5146paddingqDBjuR0$default);
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i3).m21593getSmallD9Ej5fM(), 0.0f, 11, null);
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(ServerToBentoAssetMapper2.LIGHTNING_12), StringResources_androidKt.stringResource(C12023R.string.copilot_digest_breaking_news, composer2, 0), bentoTheme.getColors(composer2, i3).m21368getAccent0d7_KjU(), modifierM5146paddingqDBjuR0$default2, null, false, composer2, BentoIcon4.Size12.$stable, 48);
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12023R.string.copilot_digest_breaking_news_breaking, composer2, 0), null, Color.m6701boximpl(bentoTheme.getColors(composer2, i3).m21368getAccent0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, null, composer2, 24576, 0, 16362);
                    composer2.endNode();
                    BentoText2.m20747BentoText38GnDrw(assetDigestDetailItem2.getDescription(), null, null, null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 3, 0, null, 0, bentoTheme.getTypography(composer2, i3).getTextL(), composer2, 817889280, 0, 7550);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, (BentoAlertButton.$stable << 12) | 1769856, 10);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function0 function0, RhModalBottomSheet5 rhModalBottomSheet5) {
            function0.invoke();
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(RhModalBottomSheet5 rhModalBottomSheet5) {
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
            return Unit.INSTANCE;
        }
    }
}
