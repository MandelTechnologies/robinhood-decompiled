package com.robinhood.android.gold.upgrade.legacy;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.compose.AsyncImagePainter;
import coil.compose.SingletonAsyncImagePainter;
import com.robinhood.android.common.gold.LegacyGoldUpgradeWelcomeIncompleteComposable;
import com.robinhood.android.common.gold.LegacyGoldWelcomeLottieComposable;
import com.robinhood.android.gold.contracts.GoldUpgradeOutcome;
import com.robinhood.android.gold.lib.upgrade.api.ApiGoldUpgradeFlow;
import com.robinhood.android.gold.sparkle.bento.BentoSparkleButton2;
import com.robinhood.android.gold.upgrade.C18003R;
import com.robinhood.android.mediaservice.ImageDensityUrl;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.serverdriven.experimental.api.DeeplinkAction;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: LegacyGoldUpgradeWelcomeComposable.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001ae\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n28\u0010\u000b\u001a4\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00060\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014H\u0007¢\u0006\u0002\u0010\u0015\u001a\u0081\u0001\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\b\u0010\u0019\u001a\u0004\u0018\u00010\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u001128\u0010\u000b\u001a4\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00060\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014H\u0003¢\u0006\u0002\u0010\u001c\u001a!\u0010\u001d\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0003¢\u0006\u0002\u0010\u001f\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006 "}, m3636d2 = {"GoldUpgradeWelcomeHeaderLottieTestTag", "", "getGoldUpgradeWelcomeHeaderLottieTestTag$annotations", "()V", "GoldUpgradeWelcomeHeaderImageTestTag", "GoldUpgradeWelcomeComposable", "", "outcome", "Lcom/robinhood/android/gold/contracts/GoldUpgradeOutcome;", "goldWelcome", "Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldWelcome;", "onBtnClicked", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "isSuccess", "Lcom/robinhood/models/serverdriven/experimental/api/DeeplinkAction;", "action", "onFailedBtnClicked", "Lkotlin/Function0;", "(Lcom/robinhood/android/gold/contracts/GoldUpgradeOutcome;Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldWelcome;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "GoldUpgradeWelcomeBottomBar", "primaryBtnText", "secondaryBtnText", "primaryBtnAction", "secondaryBtnAction", "deepLinkAction", "(Lcom/robinhood/android/gold/contracts/GoldUpgradeOutcome;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/DeeplinkAction;Lcom/robinhood/models/serverdriven/experimental/api/DeeplinkAction;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "GoldUpgradeWelcome", "alertMessage", "(Lcom/robinhood/android/gold/lib/upgrade/api/ApiGoldUpgradeFlow$ApiGoldWelcome;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "feature-gold-upgrade_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeWelcomeComposableKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class LegacyGoldUpgradeWelcomeComposable {
    public static final String GoldUpgradeWelcomeHeaderImageTestTag = "gold_upgrade_welcome_header_image";
    public static final String GoldUpgradeWelcomeHeaderLottieTestTag = "gold_upgrade_welcome_header_lottie";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldUpgradeWelcome$lambda$11(ApiGoldUpgradeFlow.ApiGoldWelcome apiGoldWelcome, String str, int i, int i2, Composer composer, int i3) {
        GoldUpgradeWelcome(apiGoldWelcome, str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldUpgradeWelcomeBottomBar$lambda$8(GoldUpgradeOutcome goldUpgradeOutcome, String str, String str2, DeeplinkAction deeplinkAction, DeeplinkAction deeplinkAction2, Function2 function2, Function0 function0, int i, Composer composer, int i2) {
        GoldUpgradeWelcomeBottomBar(goldUpgradeOutcome, str, str2, deeplinkAction, deeplinkAction2, function2, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldUpgradeWelcomeComposable$lambda$0(GoldUpgradeOutcome goldUpgradeOutcome, ApiGoldUpgradeFlow.ApiGoldWelcome apiGoldWelcome, Function2 function2, Function0 function0, int i, Composer composer, int i2) {
        GoldUpgradeWelcomeComposable(goldUpgradeOutcome, apiGoldWelcome, function2, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getGoldUpgradeWelcomeHeaderLottieTestTag$annotations() {
    }

    public static final void GoldUpgradeWelcomeComposable(final GoldUpgradeOutcome outcome, final ApiGoldUpgradeFlow.ApiGoldWelcome goldWelcome, final Function2<? super Boolean, ? super DeeplinkAction, Unit> onBtnClicked, final Function0<Unit> onFailedBtnClicked, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        Intrinsics.checkNotNullParameter(goldWelcome, "goldWelcome");
        Intrinsics.checkNotNullParameter(onBtnClicked, "onBtnClicked");
        Intrinsics.checkNotNullParameter(onFailedBtnClicked, "onFailedBtnClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1201520568);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(outcome) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(goldWelcome) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onBtnClicked) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onFailedBtnClicked) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1201520568, i2, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeWelcomeComposable (LegacyGoldUpgradeWelcomeComposable.kt:42)");
            }
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, ComposableLambda3.rememberComposableLambda(-1763508563, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeWelcomeComposableKt.GoldUpgradeWelcomeComposable.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                    invoke(bentoButtonBar3, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i3 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1763508563, i3, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeWelcomeComposable.<anonymous> (LegacyGoldUpgradeWelcomeComposable.kt:45)");
                    }
                    LegacyGoldUpgradeWelcomeComposable.GoldUpgradeWelcomeBottomBar(outcome, goldWelcome.getPrimaryButtonText(), goldWelcome.getSecondaryButtonText(), goldWelcome.getPrimaryButtonAction(), goldWelcome.getSecondaryButtonAction(), onBtnClicked, onFailedBtnClicked, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-710945632, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeWelcomeComposableKt.GoldUpgradeWelcomeComposable.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                    invoke(boxScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i3 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-710945632, i3, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeWelcomeComposable.<anonymous> (LegacyGoldUpgradeWelcomeComposable.kt:56)");
                    }
                    Resources resources = ((Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                    GoldUpgradeOutcome goldUpgradeOutcome = outcome;
                    if (goldUpgradeOutcome instanceof GoldUpgradeOutcome.Complete) {
                        composer2.startReplaceGroup(-318948047);
                        LegacyGoldUpgradeWelcomeComposable.GoldUpgradeWelcome(goldWelcome, ((GoldUpgradeOutcome.Complete) outcome).getAlertMessage(), composer2, 0, 0);
                        composer2.endReplaceGroup();
                    } else {
                        if (!(goldUpgradeOutcome instanceof GoldUpgradeOutcome.Incomplete)) {
                            composer2.startReplaceGroup(-318949805);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(-318942809);
                        StringResource message = ((GoldUpgradeOutcome.Incomplete) outcome).getMessage();
                        Intrinsics.checkNotNull(resources);
                        LegacyGoldUpgradeWelcomeIncompleteComposable.GoldUpgradeWelcomeIncompleteComposable(message.getText(resources).toString(), null, composer2, 0, 2);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeWelcomeComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LegacyGoldUpgradeWelcomeComposable.GoldUpgradeWelcomeComposable$lambda$0(outcome, goldWelcome, onBtnClicked, onFailedBtnClicked, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [int] */
    /* JADX WARN: Type inference failed for: r7v5 */
    public static final void GoldUpgradeWelcomeBottomBar(final GoldUpgradeOutcome goldUpgradeOutcome, final String str, final String str2, final DeeplinkAction deeplinkAction, final DeeplinkAction deeplinkAction2, final Function2<? super Boolean, ? super DeeplinkAction, Unit> function2, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        BentoTheme bentoTheme;
        int i3;
        int i4;
        boolean z;
        ?? r7;
        Composer composer3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1111492203);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(goldUpgradeOutcome) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(deeplinkAction) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(deeplinkAction2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 1048576 : 524288;
        }
        if ((599187 & i2) != 599186 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1111492203, i2, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeWelcomeBottomBar (LegacyGoldUpgradeWelcomeComposable.kt:79)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, bentoTheme2.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, 6, 0);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            int i6 = i2;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1433138881);
            if (goldUpgradeOutcome.isIncomplete()) {
                String strStringResource = StringResources_androidKt.stringResource(C18003R.string.gold_upgrade_confirmation_failed_cta, composerStartRestartGroup, 0);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean z2 = (i6 & 3670016) == 1048576;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeWelcomeComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LegacyGoldUpgradeWelcomeComposable.GoldUpgradeWelcomeBottomBar$lambda$7$lambda$2$lambda$1(function0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                z = false;
                bentoTheme = bentoTheme2;
                i3 = i5;
                i4 = 131072;
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierFillMaxWidth$default, null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, 384, 0, 8184);
                composer2 = composerStartRestartGroup;
            } else {
                composer2 = composerStartRestartGroup;
                bentoTheme = bentoTheme2;
                i3 = i5;
                i4 = 131072;
                z = false;
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(-1433130061);
            if (goldUpgradeOutcome.isComplete()) {
                composer2.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composer2.changedInstance(goldUpgradeOutcome) | ((i6 & 458752) == i4 ? true : z) | composer2.changedInstance(deeplinkAction);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeWelcomeComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LegacyGoldUpgradeWelcomeComposable.GoldUpgradeWelcomeBottomBar$lambda$7$lambda$4$lambda$3(function2, goldUpgradeOutcome, deeplinkAction);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceGroup();
                Composer composer4 = composer2;
                r7 = 1;
                BentoSparkleButton2.BentoSparkleButton((Function0) objRememberedValue2, str, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, false, false, composer4, (i6 & 112) | 384, 120);
                composer2 = composer4;
            } else {
                r7 = 1;
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(-1433121448);
            if (!goldUpgradeOutcome.isComplete() || StringsKt.isBlank(str2)) {
                composer3 = composer2;
            } else {
                BentoButtons.Type type2 = BentoButtons.Type.Secondary;
                Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, r7, null), 0.0f, bentoTheme.getSpacing(composer2, i3).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                composer2.startReplaceGroup(-1746271574);
                boolean zChangedInstance2 = composer2.changedInstance(goldUpgradeOutcome) | ((i6 & 458752) == 131072 ? r7 : z) | composer2.changedInstance(deeplinkAction2);
                Object objRememberedValue3 = composer2.rememberedValue();
                if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeWelcomeComposableKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LegacyGoldUpgradeWelcomeComposable.GoldUpgradeWelcomeBottomBar$lambda$7$lambda$6$lambda$5(function2, goldUpgradeOutcome, deeplinkAction2);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceGroup();
                composer3 = composer2;
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue3, str2, modifierM5146paddingqDBjuR0$default, null, type2, false, false, null, null, null, null, false, null, composer3, ((i6 >> 3) & 112) | 24576, 0, 8168);
            }
            composer3.endReplaceGroup();
            composer3.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeWelcomeComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LegacyGoldUpgradeWelcomeComposable.GoldUpgradeWelcomeBottomBar$lambda$8(goldUpgradeOutcome, str, str2, deeplinkAction, deeplinkAction2, function2, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldUpgradeWelcomeBottomBar$lambda$7$lambda$2$lambda$1(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldUpgradeWelcomeBottomBar$lambda$7$lambda$4$lambda$3(Function2 function2, GoldUpgradeOutcome goldUpgradeOutcome, DeeplinkAction deeplinkAction) {
        function2.invoke(Boolean.valueOf(goldUpgradeOutcome.isComplete()), deeplinkAction);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldUpgradeWelcomeBottomBar$lambda$7$lambda$6$lambda$5(Function2 function2, GoldUpgradeOutcome goldUpgradeOutcome, DeeplinkAction deeplinkAction) {
        function2.invoke(Boolean.valueOf(goldUpgradeOutcome.isComplete()), deeplinkAction);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldUpgradeWelcome(final ApiGoldUpgradeFlow.ApiGoldWelcome apiGoldWelcome, String str, Composer composer, final int i, final int i2) {
        int i3;
        final String str2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        String imagePath;
        String str3;
        BentoTheme bentoTheme;
        int i4;
        float f;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(887694792);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changedInstance(apiGoldWelcome) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                str2 = str;
                i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
            }
            if ((i3 & 19) != 18 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else {
                if (i5 != 0) {
                    str2 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(887694792, i3, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeWelcome (LegacyGoldUpgradeWelcomeComposable.kt:114)");
                }
                int i6 = (i3 >> 3) & 14;
                String str4 = str2;
                LegacyGoldUpgradeWelcomeAlertMessageComposable.GoldUpgradeWelcomeAlertMessageComposable(str4, null, null, null, composerStartRestartGroup, i6, 14);
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                Modifier modifierM5142padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m5142padding3ABfNKs(modifierFillMaxSize$default, bentoTheme2.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM());
                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Modifier modifierWeight$default = Column5.weight$default(Column6.INSTANCE, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                imagePath = apiGoldWelcome.getImagePath();
                if (imagePath == null) {
                    composerStartRestartGroup.startReplaceGroup(1614897931);
                    str3 = str4;
                    bentoTheme = bentoTheme2;
                    AsyncImagePainter asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg = SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(new ImageDensityUrl(imagePath, null, 2, null).getImageDensityUrl(ContextsUiExtensions.getDensitySpec((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()))), null, null, null, 0, null, composerStartRestartGroup, 0, 62);
                    composerStartRestartGroup = composerStartRestartGroup;
                    i4 = i7;
                    f = 0.0f;
                    ImageKt.Image(asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg, (String) null, TestTag3.testTag(androidx.compose.foundation.layout.PaddingKt.m5142padding3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21594getXlargeD9Ej5fM()), GoldUpgradeWelcomeHeaderImageTestTag), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    str3 = str4;
                    bentoTheme = bentoTheme2;
                    i4 = i7;
                    f = 0.0f;
                    composerStartRestartGroup.startReplaceGroup(1615444895);
                    LegacyGoldWelcomeLottieComposable.GoldWelcomeLottie(apiGoldWelcome.getLottieAnimationPath(), TestTag3.testTag(companion, GoldUpgradeWelcomeHeaderLottieTestTag), 0, composerStartRestartGroup, 48, 4);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                String title = apiGoldWelcome.getTitle();
                TextStyle displayCapsuleMedium = bentoTheme.getTypography(composerStartRestartGroup, i4).getDisplayCapsuleMedium();
                TextAlign.Companion companion4 = TextAlign.INSTANCE;
                Composer composer2 = composerStartRestartGroup;
                BentoTheme bentoTheme3 = bentoTheme;
                BentoText2.m20747BentoText38GnDrw(title, SizeKt.fillMaxWidth$default(companion, f, 1, null), null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer2, 48, 0, 8124);
                BentoText2.m20747BentoText38GnDrw(apiGoldWelcome.getDescription(), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, bentoTheme3.getSpacing(composer2, i4).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme3.getSpacing(composer2, i4).m21590getDefaultD9Ej5fM(), 5, null), null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composer2, i4).getTextM(), composer2, 0, 0, 8124);
                composerStartRestartGroup = composer2;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str2 = str3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeWelcomeComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LegacyGoldUpgradeWelcomeComposable.GoldUpgradeWelcome$lambda$11(apiGoldWelcome, str2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        str2 = str;
        if ((i3 & 19) != 18) {
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i62 = (i3 >> 3) & 14;
            String str42 = str2;
            LegacyGoldUpgradeWelcomeAlertMessageComposable.GoldUpgradeWelcomeAlertMessageComposable(str42, null, null, null, composerStartRestartGroup, i62, 14);
            Modifier.Companion companion5 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion5, 0.0f, 1, null);
            BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
            int i72 = BentoTheme.$stable;
            Modifier modifierM5142padding3ABfNKs2 = androidx.compose.foundation.layout.PaddingKt.m5142padding3ABfNKs(modifierFillMaxSize$default2, bentoTheme22.getSpacing(composerStartRestartGroup, i72).m21592getMediumD9Ej5fM());
            Arrangement.Vertical top2 = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion22 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs2);
            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                Modifier modifierWeight$default2 = Column5.weight$default(Column6.INSTANCE, SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), 1.0f, false, 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getCenter(), false);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
                Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    imagePath = apiGoldWelcome.getImagePath();
                    if (imagePath == null) {
                    }
                    composerStartRestartGroup.endNode();
                    String title2 = apiGoldWelcome.getTitle();
                    TextStyle displayCapsuleMedium2 = bentoTheme.getTypography(composerStartRestartGroup, i4).getDisplayCapsuleMedium();
                    TextAlign.Companion companion42 = TextAlign.INSTANCE;
                    Composer composer22 = composerStartRestartGroup;
                    BentoTheme bentoTheme32 = bentoTheme;
                    BentoText2.m20747BentoText38GnDrw(title2, SizeKt.fillMaxWidth$default(companion5, f, 1, null), null, null, null, null, TextAlign.m7912boximpl(companion42.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium2, composer22, 48, 0, 8124);
                    BentoText2.m20747BentoText38GnDrw(apiGoldWelcome.getDescription(), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), 0.0f, bentoTheme32.getSpacing(composer22, i4).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme32.getSpacing(composer22, i4).m21590getDefaultD9Ej5fM(), 5, null), null, null, null, null, TextAlign.m7912boximpl(companion42.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme32.getTypography(composer22, i4).getTextM(), composer22, 0, 0, 8124);
                    composerStartRestartGroup = composer22;
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    str2 = str3;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
