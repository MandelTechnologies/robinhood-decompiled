package com.robinhood.android.matcha.p177ui.sourceoffunds;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.matcha.p177ui.sourceoffunds.SourceOfFundsComposable3;
import com.robinhood.android.matcha.p177ui.sourceoffunds.SourceOfFundsDataState2;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoInfoBanner2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.models.p320db.IacInfoBanner;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: SourceOfFundsComposable.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0099\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2#\u0010\n\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0001¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"SourceOfFundsComposable", "", "accountRows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/matcha/ui/sourceoffunds/Row;", "selectedAccountId", "", "isAddDebitCardButtonVisible", "", "isContinueButtonEnabled", "handleBannerAction", "Lkotlin/Function1;", "Lcom/robinhood/models/serverdriven/db/GenericAction;", "Lkotlin/ParameterName;", "name", "genericAction", "launchDebitCardLinking", "Lkotlin/Function0;", "selectAccount", "accountId", "onContinueClick", "(Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-p2p_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.sourceoffunds.SourceOfFundsComposableKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SourceOfFundsComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SourceOfFundsComposable$lambda$0(ImmutableList immutableList, String str, boolean z, boolean z2, Function1 function1, Function0 function0, Function1 function12, Function0 function02, int i, Composer composer, int i2) {
        SourceOfFundsComposable(immutableList, str, z, z2, function1, function0, function12, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* compiled from: SourceOfFundsComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.matcha.ui.sourceoffunds.SourceOfFundsComposableKt$SourceOfFundsComposable$1 */
    static final class C215801 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ ImmutableList<SourceOfFundsDataState2> $accountRows;
        final /* synthetic */ Function1<GenericAction, Unit> $handleBannerAction;
        final /* synthetic */ boolean $isAddDebitCardButtonVisible;
        final /* synthetic */ boolean $isContinueButtonEnabled;
        final /* synthetic */ Function0<Unit> $launchDebitCardLinking;
        final /* synthetic */ Function0<Unit> $onContinueClick;
        final /* synthetic */ Function1<String, Unit> $selectAccount;
        final /* synthetic */ String $selectedAccountId;

        /* JADX WARN: Multi-variable type inference failed */
        C215801(ImmutableList<? extends SourceOfFundsDataState2> immutableList, boolean z, Function0<Unit> function0, Function0<Unit> function02, boolean z2, String str, Function1<? super String, Unit> function1, Function1<? super GenericAction, Unit> function12) {
            this.$accountRows = immutableList;
            this.$isAddDebitCardButtonVisible = z;
            this.$launchDebitCardLinking = function0;
            this.$onContinueClick = function02;
            this.$isContinueButtonEnabled = z2;
            this.$selectedAccountId = str;
            this.$selectAccount = function1;
            this.$handleBannerAction = function12;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4$lambda$1$lambda$0(Function1 function1, SourceOfFundsDataState2 sourceOfFundsDataState2) {
            function1.invoke(((SourceOfFundsDataState2.Account) sourceOfFundsDataState2).getAccount().getAccountId());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4$lambda$3$lambda$2(Function1 function1, IacInfoBanner iacInfoBanner) {
            function1.invoke(iacInfoBanner.getCtaAction());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            int i2;
            final Function1<String, Unit> function1;
            final Function1<GenericAction, Unit> function12;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-337511548, i, -1, "com.robinhood.android.matcha.ui.sourceoffunds.SourceOfFundsComposable.<anonymous> (SourceOfFundsComposable.kt:38)");
            }
            ImmutableList<SourceOfFundsDataState2> immutableList = this.$accountRows;
            boolean z = this.$isAddDebitCardButtonVisible;
            Function0<Unit> function0 = this.$launchDebitCardLinking;
            Function0<Unit> function02 = this.$onContinueClick;
            boolean z2 = this.$isContinueButtonEnabled;
            String str = this.$selectedAccountId;
            Function1<String, Unit> function13 = this.$selectAccount;
            Function1<GenericAction, Unit> function14 = this.$handleBannerAction;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            String strStringResource = StringResources_androidKt.stringResource(C21284R.string.matcha_transfer_source_of_funds_title, composer, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Function1<String, Unit> function15 = function13;
            Function1<GenericAction, Unit> function16 = function14;
            BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 5, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getDisplayCapsuleSmall(), composer, 0, 0, 8124);
            composer.startReplaceGroup(691946155);
            for (final SourceOfFundsDataState2 sourceOfFundsDataState2 : immutableList) {
                if (sourceOfFundsDataState2 instanceof SourceOfFundsDataState2.Placeholder) {
                    composer.startReplaceGroup(117181090);
                    LocalShowPlaceholder.Loadable(true, null, null, SourceOfFundsComposable.INSTANCE.getLambda$747694853$feature_p2p_externalDebug(), composer, 3078, 6);
                    composer.endReplaceGroup();
                    function1 = function15;
                } else if (sourceOfFundsDataState2 instanceof SourceOfFundsDataState2.Account) {
                    composer.startReplaceGroup(117881225);
                    TransferAccount account = ((SourceOfFundsDataState2.Account) sourceOfFundsDataState2).getAccount();
                    Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    BentoSelectionRowState bentoSelectionRowState = TransferAccounts3.toBentoSelectionRowState(account, str, resources);
                    composer.startReplaceGroup(-1633490746);
                    function1 = function15;
                    boolean zChanged = composer.changed(function1) | composer.changedInstance(sourceOfFundsDataState2);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.matcha.ui.sourceoffunds.SourceOfFundsComposableKt$SourceOfFundsComposable$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SourceOfFundsComposable3.C215801.invoke$lambda$5$lambda$4$lambda$1$lambda$0(function1, sourceOfFundsDataState2);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    BentoSelectionRow2.BentoSelectionRow(null, bentoSelectionRowState, (Function0) objRememberedValue, composer, BentoSelectionRowState.$stable << 3, 1);
                    composer.endReplaceGroup();
                } else {
                    function1 = function15;
                    if (!(sourceOfFundsDataState2 instanceof SourceOfFundsDataState2.Banner)) {
                        composer.startReplaceGroup(973610847);
                        composer.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer.startReplaceGroup(118336088);
                    final IacInfoBanner banner = ((SourceOfFundsDataState2.Banner) sourceOfFundsDataState2).getBanner();
                    String text = banner.getText().getText();
                    ServerToBentoAssetMapper2 icon = banner.getIcon();
                    BentoIcon4.Size24 size24 = icon != null ? new BentoIcon4.Size24(icon) : null;
                    String ctaText = banner.getCtaText();
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(companion3, bentoTheme2.getSpacing(composer, i4).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer, i4).m21590getDefaultD9Ej5fM());
                    composer.startReplaceGroup(-1633490746);
                    function12 = function16;
                    boolean zChanged2 = composer.changed(function12) | composer.changedInstance(banner);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.matcha.ui.sourceoffunds.SourceOfFundsComposableKt$SourceOfFundsComposable$1$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SourceOfFundsComposable3.C215801.invoke$lambda$5$lambda$4$lambda$3$lambda$2(function12, banner);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    composer.endReplaceGroup();
                    BentoInfoBanner2.BentoPinnedInfoBanner(modifierM5143paddingVpY3zN4, text, size24, ctaText, (Function0) objRememberedValue2, composer, BentoIcon4.Size24.$stable << 6, 0);
                    composer.endReplaceGroup();
                    function15 = function1;
                    function16 = function12;
                }
                function12 = function16;
                function15 = function1;
                function16 = function12;
            }
            composer.endReplaceGroup();
            composer.startReplaceGroup(692007973);
            if (z) {
                i2 = 0;
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.BUBBLE_PLUS_24, null, null, 6, null), StringResources_androidKt.stringResource(C21284R.string.matcha_add_debit_card, composer, 0), null, null, null, null, false, false, false, 0L, function0, composer, (BentoBaseRowState.Start.Icon.$stable << 3) | 12582912, 0, 1913);
            } else {
                i2 = 0;
            }
            composer.endReplaceGroup();
            String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, i2);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            BentoButtonKt.m20586BentoButtonEikTQX8(function02, strStringResource2, PaddingKt.m5143paddingVpY3zN4(modifierFillMaxWidth$default, bentoTheme3.getSpacing(composer, i5).m21592getMediumD9Ej5fM(), bentoTheme3.getSpacing(composer, i5).m21590getDefaultD9Ej5fM()), null, null, z2, false, null, null, null, null, false, null, composer, 0, 0, 8152);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public static final void SourceOfFundsComposable(final ImmutableList<? extends SourceOfFundsDataState2> accountRows, final String str, final boolean z, final boolean z2, final Function1<? super GenericAction, Unit> handleBannerAction, final Function0<Unit> launchDebitCardLinking, final Function1<? super String, Unit> selectAccount, final Function0<Unit> onContinueClick, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(accountRows, "accountRows");
        Intrinsics.checkNotNullParameter(handleBannerAction, "handleBannerAction");
        Intrinsics.checkNotNullParameter(launchDebitCardLinking, "launchDebitCardLinking");
        Intrinsics.checkNotNullParameter(selectAccount, "selectAccount");
        Intrinsics.checkNotNullParameter(onContinueClick, "onContinueClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-826151431);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(accountRows) : composerStartRestartGroup.changedInstance(accountRows) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(handleBannerAction) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(launchDebitCardLinking) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(selectAccount) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onContinueClick) ? 8388608 : 4194304;
        }
        if ((4793491 & i2) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-826151431, i2, -1, "com.robinhood.android.matcha.ui.sourceoffunds.SourceOfFundsComposable (SourceOfFundsComposable.kt:36)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-337511548, true, new C215801(accountRows, z, launchDebitCardLinking, onContinueClick, z2, str, selectAccount, handleBannerAction), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.sourceoffunds.SourceOfFundsComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SourceOfFundsComposable3.SourceOfFundsComposable$lambda$0(accountRows, str, z, z2, handleBannerAction, launchDebitCardLinking, selectAccount, onContinueClick, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
