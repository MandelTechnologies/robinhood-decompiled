package com.robinhood.android.rhymigration.p245ui.intro;

import android.net.Uri;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.Divider2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.rhymigration.C27577R;
import com.robinhood.android.rhymigration.model.UiRhyMigrationCmShutdownUpsell;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoInfoBanner2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.rows.BentoAccordionRow;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.text.BentoMarkdownSpannedText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.librobinhood.CmSunsetExperiment4;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.staticcontent.model.IdentifiableTitleAndBody;
import com.robinhood.staticcontent.model.TitleAndBody;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: CmSunsetV2Composable.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\u001a\u0093\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00010\n2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0015\u001a/\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010H\u0003¢\u0006\u0002\u0010\u0019\u001a+\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00102\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0003¢\u0006\u0002\u0010 \u001aF\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u00102\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00010\nH\u0003¢\u0006\u0002\u0010&\u001aJ\u0010'\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u0006\u0010(\u001a\u00020\u00102!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u00010\nH\u0003¢\u0006\u0002\u0010)\u001a#\u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020\u00102\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u001eH\u0003¢\u0006\u0002\u0010.¨\u0006/²\u0006\f\u00100\u001a\u0004\u0018\u000101X\u008a\u0084\u0002²\u0006\n\u00102\u001a\u000203X\u008a\u0084\u0002²\u0006\n\u00104\u001a\u000205X\u008a\u008e\u0002"}, m3636d2 = {"CmSunsetV2Composable", "", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lcom/robinhood/android/rhymigration/model/UiRhyMigrationCmShutdownUpsell;", "primaryCtaOnclick", "Lkotlin/Function0;", "secondaryCtaOnclick", "onShowAllClick", "Lkotlin/Function1;", "Landroid/net/Uri;", "Lkotlin/ParameterName;", "name", "uri", "valPropRowOnClick", "", "valPropRowId", "treatmentGroup", "Lcom/robinhood/librobinhood/CmSunsetVariant;", "shutdownDate", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/rhymigration/model/UiRhyMigrationCmShutdownUpsell;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/robinhood/librobinhood/CmSunsetVariant;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "RhyMigrationHeader", "title", "subTitle", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/librobinhood/CmSunsetVariant;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "RhyMigrationComparison", "comparisonTitle", "comparisonSubtitle", "comparisonList", "", "Lcom/robinhood/staticcontent/model/IdentifiableTitleAndBody;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "RhyComparisonTable", "comparisonTableTitle", "comparisonTableList", "valPropRowClick", "valPropId", "(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "CardFeatureRow", "contentId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "RhyMigrationFaq", "faqTitle", "faqList", "Lcom/robinhood/staticcontent/model/TitleAndBody;", "(Ljava/lang/String;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "feature-rhy-migration_externalDebug", "onboardingLottie", "Lcom/airbnb/lottie/LottieComposition;", "onboardingLottieAspectRatio", "", "isExpanded", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.rhymigration.ui.intro.CmSunsetV2ComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class CmSunsetV2Composable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CardFeatureRow$lambda$32(String str, String str2, String str3, Function1 function1, int i, Composer composer, int i2) {
        CardFeatureRow(str, str2, str3, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CmSunsetV2Composable$lambda$4(Modifier modifier, UiRhyMigrationCmShutdownUpsell uiRhyMigrationCmShutdownUpsell, Function0 function0, Function0 function02, Function1 function1, Function1 function12, CmSunsetExperiment4 cmSunsetExperiment4, String str, int i, int i2, Composer composer, int i3) {
        CmSunsetV2Composable(modifier, uiRhyMigrationCmShutdownUpsell, function0, function02, function1, function12, cmSunsetExperiment4, str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhyComparisonTable$lambda$25(String str, List list, Function1 function1, int i, Composer composer, int i2) {
        RhyComparisonTable(str, list, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhyMigrationComparison$lambda$21(String str, String str2, List list, int i, Composer composer, int i2) {
        RhyMigrationComparison(str, str2, list, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhyMigrationFaq$lambda$40(String str, List list, int i, Composer composer, int i2) {
        RhyMigrationFaq(str, list, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhyMigrationHeader$lambda$10(String str, String str2, CmSunsetExperiment4 cmSunsetExperiment4, String str3, int i, Composer composer, int i2) {
        RhyMigrationHeader(str, str2, cmSunsetExperiment4, str3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CmSunsetV2Composable(Modifier modifier, final UiRhyMigrationCmShutdownUpsell content, final Function0<Unit> primaryCtaOnclick, final Function0<Unit> secondaryCtaOnclick, final Function1<? super Uri, Unit> onShowAllClick, final Function1<? super String, Unit> valPropRowOnClick, final CmSunsetExperiment4 treatmentGroup, final String str, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        String str2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        boolean zChangedInstance;
        Object objRememberedValue;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(primaryCtaOnclick, "primaryCtaOnclick");
        Intrinsics.checkNotNullParameter(secondaryCtaOnclick, "secondaryCtaOnclick");
        Intrinsics.checkNotNullParameter(onShowAllClick, "onShowAllClick");
        Intrinsics.checkNotNullParameter(valPropRowOnClick, "valPropRowOnClick");
        Intrinsics.checkNotNullParameter(treatmentGroup, "treatmentGroup");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1162185456);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(primaryCtaOnclick) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(secondaryCtaOnclick) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onShowAllClick) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(valPropRowOnClick) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changed(treatmentGroup.ordinal()) ? 1048576 : 524288;
        }
        if ((i2 & 128) == 0) {
            if ((i & 12582912) == 0) {
                str2 = str;
                i3 |= composerStartRestartGroup.changed(str2) ? 8388608 : 4194304;
            }
            if ((i3 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1162185456, i3, -1, "com.robinhood.android.rhymigration.ui.intro.CmSunsetV2Composable (CmSunsetV2Composable.kt:58)");
                }
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifier4 = modifier3;
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null), 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getCenterHorizontally(), composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor2);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                RhyMigrationHeader(content.getTitle(), content.getSubtitle(), treatmentGroup, str2, composerStartRestartGroup, (i3 >> 12) & 8064);
                RhyMigrationComparison(content.getComparisonTableTitle(), content.getComparisonTableSubtitle(), content.getAccountComparison(), composerStartRestartGroup, 0);
                Divider2.m5581DivideroMI9zvI(PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21596getXxlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU(), 0.0f, 0.0f, composerStartRestartGroup, 0, 12);
                RhyComparisonTable(content.getComparisonTableHeader(), content.getComparisonTableTitleAndBody(), valPropRowOnClick, composerStartRestartGroup, (i3 >> 9) & 896);
                Divider2.m5581DivideroMI9zvI(PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21596getXxlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU(), 0.0f, 0.0f, composerStartRestartGroup, 0, 12);
                RhyMigrationFaq(content.getFaqTitle(), content.getFaqDropdown(), composerStartRestartGroup, 0);
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(column6.align(companion3, companion.getStart()), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                String showAllTitle = content.getShowAllTitle();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = ((57344 & i3) != 16384) | composerStartRestartGroup.changedInstance(content);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.rhymigration.ui.intro.CmSunsetV2ComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CmSunsetV2Composable.CmSunsetV2Composable$lambda$3$lambda$2$lambda$1$lambda$0(onShowAllClick, content);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, showAllTitle, modifierM5146paddingqDBjuR0$default, null, null, false, null, composerStartRestartGroup, 0, 120);
                BentoMarkdownSpannedText2.m21101BentoMarkdownSpannedTextTHkziT8(content.getDisclosure().getContent().getRaw(), PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21594getXlargeD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 5, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, 0, 17, 0, 0, null, composerStartRestartGroup, 196608, 472);
                composerStartRestartGroup.endNode();
                BentoButtonBar2.BentoButtonBar(PaddingKt.m5144paddingVpY3zN4$default(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), null, null, false, null, null, primaryCtaOnclick, content.getPrimaryCta(), false, null, false, secondaryCtaOnclick, content.getSecondaryCta(), false, null, false, composerStartRestartGroup, (i3 << 12) & 3670016, (i3 >> 6) & 112, 59198);
                composer2 = composerStartRestartGroup;
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier5 = modifier2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhymigration.ui.intro.CmSunsetV2ComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CmSunsetV2Composable.CmSunsetV2Composable$lambda$4(modifier5, content, primaryCtaOnclick, secondaryCtaOnclick, onShowAllClick, valPropRowOnClick, treatmentGroup, str, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 12582912;
        str2 = str;
        if ((i3 & 4793491) == 4793490) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement2.getTop();
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(top2, companion4.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy3, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion32 = Modifier.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                Modifier modifier42 = modifier3;
                Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(Column5.weight$default(column62, PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null), 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion4.getCenterHorizontally(), composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default2);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy22, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    RhyMigrationHeader(content.getTitle(), content.getSubtitle(), treatmentGroup, str2, composerStartRestartGroup, (i3 >> 12) & 8064);
                    RhyMigrationComparison(content.getComparisonTableTitle(), content.getComparisonTableSubtitle(), content.getAccountComparison(), composerStartRestartGroup, 0);
                    Divider2.m5581DivideroMI9zvI(PaddingKt.m5146paddingqDBjuR0$default(companion32, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21596getXxlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU(), 0.0f, 0.0f, composerStartRestartGroup, 0, 12);
                    RhyComparisonTable(content.getComparisonTableHeader(), content.getComparisonTableTitleAndBody(), valPropRowOnClick, composerStartRestartGroup, (i3 >> 9) & 896);
                    Divider2.m5581DivideroMI9zvI(PaddingKt.m5146paddingqDBjuR0$default(companion32, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21596getXxlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU(), 0.0f, 0.0f, composerStartRestartGroup, 0, 12);
                    RhyMigrationFaq(content.getFaqTitle(), content.getFaqDropdown(), composerStartRestartGroup, 0);
                    Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(column62.align(companion32, companion4.getStart()), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    String showAllTitle2 = content.getShowAllTitle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChangedInstance = ((57344 & i3) != 16384) | composerStartRestartGroup.changedInstance(content);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.rhymigration.ui.intro.CmSunsetV2ComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CmSunsetV2Composable.CmSunsetV2Composable$lambda$3$lambda$2$lambda$1$lambda$0(onShowAllClick, content);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, showAllTitle2, modifierM5146paddingqDBjuR0$default2, null, null, false, null, composerStartRestartGroup, 0, 120);
                        BentoMarkdownSpannedText2.m21101BentoMarkdownSpannedTextTHkziT8(content.getDisclosure().getContent().getRaw(), PaddingKt.m5146paddingqDBjuR0$default(companion32, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21594getXlargeD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 5, null), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i52).m21426getFg20d7_KjU()), null, 0, 17, 0, 0, null, composerStartRestartGroup, 196608, 472);
                        composerStartRestartGroup.endNode();
                        BentoButtonBar2.BentoButtonBar(PaddingKt.m5144paddingVpY3zN4$default(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), null, null, false, null, null, primaryCtaOnclick, content.getPrimaryCta(), false, null, false, secondaryCtaOnclick, content.getSecondaryCta(), false, null, false, composerStartRestartGroup, (i3 << 12) & 3670016, (i3 >> 6) & 112, 59198);
                        composer2 = composerStartRestartGroup;
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = modifier42;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final boolean RhyMigrationFaq$lambda$39$lambda$38$lambda$34(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final LottieComposition RhyMigrationHeader$lambda$9$lambda$5(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    private static final float RhyMigrationHeader$lambda$9$lambda$8(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CmSunsetV2Composable$lambda$3$lambda$2$lambda$1$lambda$0(Function1 function1, UiRhyMigrationCmShutdownUpsell uiRhyMigrationCmShutdownUpsell) {
        Uri uri = Uri.parse(uiRhyMigrationCmShutdownUpsell.getShowAllLink());
        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
        function1.invoke(uri);
        return Unit.INSTANCE;
    }

    private static final void RhyMigrationHeader(final String str, final String str2, final CmSunsetExperiment4 cmSunsetExperiment4, final String str3, Composer composer, final int i) {
        int i2;
        CmSunsetExperiment4 cmSunsetExperiment42;
        Composer composer2;
        Composer composer3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1832429736);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(cmSunsetExperiment4.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(str3) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1832429736, i2, -1, "com.robinhood.android.rhymigration.ui.intro.RhyMigrationHeader (CmSunsetV2Composable.kt:126)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
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
            CmSunsetExperiment4 cmSunsetExperiment43 = CmSunsetExperiment4.f5264V1;
            if (cmSunsetExperiment4 == cmSunsetExperiment43) {
                composerStartRestartGroup.startReplaceGroup(-2008404240);
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
                cmSunsetExperiment42 = cmSunsetExperiment43;
                companion = companion;
                ImageKt.Image(PainterResources_androidKt.painterResource(C27577R.drawable.rhy_migration_card_switch, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C27577R.string.content_header, composerStartRestartGroup, 0), modifierM5146paddingqDBjuR0$default, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 0, 120);
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
            } else {
                cmSunsetExperiment42 = cmSunsetExperiment43;
                composerStartRestartGroup.startReplaceGroup(-2008076322);
                final LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(LottieUrl.RHY_CM_SUNSET_STRONG_HEADER.getUrl().getUrl())), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChanged = composerStartRestartGroup.changed(lottieCompositionResultRememberLottieComposition);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.rhymigration.ui.intro.CmSunsetV2ComposableKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(CmSunsetV2Composable.RhyMigrationHeader$lambda$9$lambda$7$lambda$6(lottieCompositionResultRememberLottieComposition));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                LottieAnimation2.LottieAnimation(RhyMigrationHeader$lambda$9$lambda$5(lottieCompositionResultRememberLottieComposition), AspectRatio3.aspectRatio$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), RhyMigrationHeader$lambda$9$lambda$8(SnapshotStateKt.derivedStateOf((Function0) objRememberedValue)), false, 2, null), false, false, null, 0.0f, 0, false, false, false, null, false, false, null, null, ContentScale.INSTANCE.getFillWidth(), false, false, null, false, null, composerStartRestartGroup, 0, 196608, 0, 2064380);
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
            }
            composer2.startReplaceGroup(-480391963);
            if (cmSunsetExperiment4 == cmSunsetExperiment42) {
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                BentoInfoBanner2.BentoUrgentInfoBanner(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer2, i3).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer2, i3).m21592getMediumD9Ej5fM(), 5, null), RhyMigrationHeader$subInShutdownDate("Your current card will stop working on {{ .DATE }}.", str3), new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_FILLED_24), null, null, composer2, (BentoIcon4.Size24.$stable << 6) | 3072, 16);
            }
            composer2.endReplaceGroup();
            String strRhyMigrationHeader$subInShutdownDate = RhyMigrationHeader$subInShutdownDate(str, str3);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            TextStyle displayCapsuleLarge = bentoTheme2.getTypography(composer2, i4).getDisplayCapsuleLarge();
            TextAlign.Companion companion3 = TextAlign.INSTANCE;
            Composer composer4 = composer2;
            BentoText2.m20747BentoText38GnDrw(strRhyMigrationHeader$subInShutdownDate, null, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleLarge, composer4, 0, 0, 8126);
            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme2.getSpacing(composer4, i4).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
            String strRhyMigrationHeader$subInShutdownDate2 = RhyMigrationHeader$subInShutdownDate(str2, str3);
            TextStyle textM = bentoTheme2.getTypography(composer4, i4).getTextM();
            composer3 = composer4;
            BentoText2.m20747BentoText38GnDrw(strRhyMigrationHeader$subInShutdownDate2, modifierM5146paddingqDBjuR0$default2, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, textM, composer3, 0, 0, 8124);
            composer3.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhymigration.ui.intro.CmSunsetV2ComposableKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CmSunsetV2Composable.RhyMigrationHeader$lambda$10(str, str2, cmSunsetExperiment4, str3, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final String RhyMigrationHeader$subInShutdownDate(String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        return StringsKt.replace$default(str, RhyIntroFragmentV2.DATE_PLACEHOLDER, str2, false, 4, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float RhyMigrationHeader$lambda$9$lambda$7$lambda$6(LottieCompositionResult lottieCompositionResult) {
        LottieComposition lottieCompositionRhyMigrationHeader$lambda$9$lambda$5 = RhyMigrationHeader$lambda$9$lambda$5(lottieCompositionResult);
        if ((lottieCompositionRhyMigrationHeader$lambda$9$lambda$5 != null ? lottieCompositionRhyMigrationHeader$lambda$9$lambda$5.getBounds() : null) == null) {
            return 1.0f;
        }
        return r1.width() / r1.height();
    }

    private static final void RhyMigrationComparison(final String str, String str2, final List<IdentifiableTitleAndBody> list, Composer composer, final int i) {
        final String str3;
        Composer composerStartRestartGroup = composer.startRestartGroup(256132562);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changed(str) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(list) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(256132562, i2, -1, "com.robinhood.android.rhymigration.ui.intro.RhyMigrationComparison (CmSunsetV2Composable.kt:186)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
            TextStyle displayCapsuleMedium = bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleMedium();
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(str, modifierM5146paddingqDBjuR0$default, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composerStartRestartGroup, i2 & 14, 0, 8124);
            str3 = str2;
            BentoText2.m20747BentoText38GnDrw(str3, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), composerStartRestartGroup, (i2 >> 3) & 14, 0, 8124);
            boolean z = false;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            Modifier modifierWeight$default = Row5.weight$default(row6, companion, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            ImageKt.Image(PainterResources_androidKt.painterResource(C27577R.drawable.rhy_migration_blue_coin, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C27577R.string.blue_coin, composerStartRestartGroup, 0), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 0, 120);
            float f = 1;
            Divider2.m5581DivideroMI9zvI(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21591getLargeD9Ej5fM(), C2002Dp.m7995constructorimpl(8), 0.0f, 9, null), bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU(), C2002Dp.m7995constructorimpl(f), 0.0f, composerStartRestartGroup, 384, 8);
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
            Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy3, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
            List<IdentifiableTitleAndBody> list2 = list;
            for (IdentifiableTitleAndBody identifiableTitleAndBody : list2) {
                if (Intrinsics.areEqual(identifiableTitleAndBody.getIdentifier(), "brokerage_account")) {
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion5, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i4).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    String title = identifiableTitleAndBody.getTitle();
                    TextStyle textM = bentoTheme2.getTypography(composerStartRestartGroup, i4).getTextM();
                    TextAlign.Companion companion6 = TextAlign.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(title, modifierM5146paddingqDBjuR0$default2, null, null, null, null, TextAlign.m7912boximpl(companion6.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, textM, composerStartRestartGroup, 0, 0, 8124);
                    Composer composer2 = composerStartRestartGroup;
                    String body = identifiableTitleAndBody.getBody();
                    composer2.startReplaceGroup(-446854964);
                    if (body != null) {
                        BentoText2.m20747BentoText38GnDrw(body, null, Color.m6701boximpl(bentoTheme2.getColors(composer2, i4).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion6.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i4).getTextS(), composer2, 0, 0, 8122);
                        composer2 = composer2;
                        Unit unit = Unit.INSTANCE;
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    composer2.endNode();
                    Modifier modifierM5146paddingqDBjuR0$default3 = PaddingKt.m5146paddingqDBjuR0$default(Row5.weight$default(row6, companion5, 1.0f, false, 2, null), bentoTheme2.getSpacing(composer2, i4).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                    Alignment.Companion companion7 = Alignment.INSTANCE;
                    Alignment.Horizontal centerHorizontally = companion7.getCenterHorizontally();
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy4 = Column2.columnMeasurePolicy(arrangement2.getTop(), centerHorizontally, composer2, 48);
                    int currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composer2, modifierM5146paddingqDBjuR0$default3);
                    ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor5 = companion8.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor5);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl5 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyColumnMeasurePolicy4, companion8.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion8.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion8.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                        composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion8.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    ImageKt.Image(PainterResources_androidKt.painterResource(C27577R.drawable.rhy_migration_green_coin, composer2, 0), StringResources_androidKt.stringResource(C27577R.string.green_coin, composer2, 0), PaddingKt.m5146paddingqDBjuR0$default(companion5, 0.0f, bentoTheme2.getSpacing(composer2, i4).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 0, 120);
                    Composer composer3 = composer2;
                    Divider2.m5581DivideroMI9zvI(PaddingKt.m5146paddingqDBjuR0$default(companion5, 0.0f, bentoTheme2.getSpacing(composer2, i4).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme2.getColors(composer2, i4).m21425getFg0d7_KjU(), C2002Dp.m7995constructorimpl(f), 0.0f, composer3, 384, 8);
                    MeasurePolicy measurePolicyColumnMeasurePolicy5 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion7.getStart(), composer3, 48);
                    int currentCompositeKeyHash6 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier6 = ComposedModifier2.materializeModifier(composer3, companion5);
                    Function0<ComposeUiNode> constructor6 = companion8.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor6);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl6 = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl6, measurePolicyColumnMeasurePolicy5, companion8.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl6, currentCompositionLocalMap6, companion8.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion8.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                        composerM6388constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                        composerM6388constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl6, modifierMaterializeModifier6, companion8.getSetModifier());
                    for (IdentifiableTitleAndBody identifiableTitleAndBody2 : list2) {
                        if (Intrinsics.areEqual(identifiableTitleAndBody2.getIdentifier(), "spending_account")) {
                            Modifier.Companion companion9 = Modifier.INSTANCE;
                            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                            int i5 = BentoTheme.$stable;
                            Modifier modifierM5146paddingqDBjuR0$default4 = PaddingKt.m5146paddingqDBjuR0$default(companion9, 0.0f, bentoTheme3.getSpacing(composer3, i5).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                            String title2 = identifiableTitleAndBody2.getTitle();
                            TextStyle textM2 = bentoTheme3.getTypography(composer3, i5).getTextM();
                            TextAlign.Companion companion10 = TextAlign.INSTANCE;
                            BentoText2.m20747BentoText38GnDrw(title2, modifierM5146paddingqDBjuR0$default4, null, null, null, null, TextAlign.m7912boximpl(companion10.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, textM2, composer3, 0, 0, 8124);
                            composerStartRestartGroup = composer3;
                            String body2 = identifiableTitleAndBody2.getBody();
                            composerStartRestartGroup.startReplaceGroup(-1984174781);
                            if (body2 != null) {
                                BentoText2.m20747BentoText38GnDrw(body2, null, Color.m6701boximpl(bentoTheme3.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion10.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 0, 0, 8122);
                                composerStartRestartGroup = composerStartRestartGroup;
                                Unit unit2 = Unit.INSTANCE;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                z = z;
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        composerStartRestartGroup.skipToGroupEnd();
        str3 = str2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhymigration.ui.intro.CmSunsetV2ComposableKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CmSunsetV2Composable.RhyMigrationComparison$lambda$21(str, str3, list, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void RhyComparisonTable(String str, List<IdentifiableTitleAndBody> list, Function1<? super String, Unit> function1, Composer composer, final int i) {
        final List<IdentifiableTitleAndBody> list2;
        final String str2;
        final Function1<? super String, Unit> function12 = function1;
        Composer composerStartRestartGroup = composer.startRestartGroup(1704174876);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changed(str) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            str2 = str;
            list2 = list;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1704174876, i2, -1, "com.robinhood.android.rhymigration.ui.intro.RhyComparisonTable (CmSunsetV2Composable.kt:278)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21596getXxlargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            int i4 = i2;
            BentoText2.m20747BentoText38GnDrw(str, Row5.weight$default(row6, companion, 2.5f, false, 2, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleMedium(), composerStartRestartGroup, i2 & 14, 0, 8124);
            composerStartRestartGroup = composerStartRestartGroup;
            ImageKt.Image(PainterResources_androidKt.painterResource(C27577R.drawable.rhy_migration_broken_card, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C27577R.string.old_card, composerStartRestartGroup, 0), Row5.weight$default(row6, companion, 1.0f, false, 2, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 0, 120);
            ImageKt.Image(PainterResources_androidKt.painterResource(C27577R.drawable.rhy_migration_green_card, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C27577R.string.new_card, composerStartRestartGroup, 0), Row5.weight$default(row6, companion, 1.0f, false, 2, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 0, 120);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.startReplaceGroup(1969660329);
            list2 = list;
            for (IdentifiableTitleAndBody identifiableTitleAndBody : list2) {
                CardFeatureRow(identifiableTitleAndBody.getTitle(), identifiableTitleAndBody.getBody(), identifiableTitleAndBody.getIdentifier(), function1, composerStartRestartGroup, (i4 << 3) & 7168);
            }
            str2 = str;
            function12 = function1;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhymigration.ui.intro.CmSunsetV2ComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CmSunsetV2Composable.RhyComparisonTable$lambda$25(str2, list2, function12, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void CardFeatureRow(final String str, final String str2, final String str3, final Function1<? super String, Unit> function1, Composer composer, final int i) {
        int i2;
        BentoTheme bentoTheme;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2135165998);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2135165998, i2, -1, "com.robinhood.android.rhymigration.ui.intro.CardFeatureRow (CmSunsetV2Composable.kt:320)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            int i5 = i2;
            Divider2.m5581DivideroMI9zvI(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), bentoTheme2.getColors(composerStartRestartGroup, i4).m21373getBg30d7_KjU(), 0.0f, 0.0f, composerStartRestartGroup, 0, 12);
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            Modifier modifierWeight$default = Row5.weight$default(row6, companion, 2.5f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            BentoText2.m20747BentoText38GnDrw(str, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i4).getTextM(), composerStartRestartGroup, i5 & 14, 0, 8190);
            composerStartRestartGroup = composerStartRestartGroup;
            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme2.getSpacing(composerStartRestartGroup, i4).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i4).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
            BentoIcon4.Size16 size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_16);
            String strStringResource = StringResources_androidKt.stringResource(C27577R.string.question_mark, composerStartRestartGroup, 0);
            long jM21425getFg0d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z = ((i5 & 7168) == 2048) | ((i5 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.rhymigration.ui.intro.CmSunsetV2ComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CmSunsetV2Composable.CardFeatureRow$lambda$31$lambda$30$lambda$28$lambda$27$lambda$26(function1, str3);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoIcon2.m20644BentoIconFU0evQE(size16, strStringResource, jM21425getFg0d7_KjU, modifierM5146paddingqDBjuR0$default2, (Function0) objRememberedValue, false, composerStartRestartGroup, BentoIcon4.Size16.$stable, 32);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.startReplaceGroup(-1975520905);
            if (str2 == null) {
                i3 = i4;
                bentoTheme = bentoTheme2;
            } else {
                bentoTheme = bentoTheme2;
                i3 = i4;
                BentoText2.m20747BentoText38GnDrw(str2, null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i4).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i4).getTextS(), composerStartRestartGroup, 0, 0, 8186);
                composerStartRestartGroup = composerStartRestartGroup;
                Unit unit = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            BentoTheme bentoTheme3 = bentoTheme;
            int i6 = i3;
            Modifier modifierM5146paddingqDBjuR0$default3 = PaddingKt.m5146paddingqDBjuR0$default(Row5.weight$default(row6, companion, 1.0f, false, 2, null), bentoTheme3.getSpacing(composerStartRestartGroup, i6).m21597getXxsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
            BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.BUBBLE_REMOVE_FILLED_24);
            String strStringResource2 = StringResources_androidKt.stringResource(C27577R.string.bubble_x, composerStartRestartGroup, 0);
            long jM21426getFg20d7_KjU = bentoTheme3.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU();
            int i7 = BentoIcon4.Size24.$stable;
            BentoIcon2.m20644BentoIconFU0evQE(size24, strStringResource2, jM21426getFg20d7_KjU, modifierM5146paddingqDBjuR0$default3, null, false, composerStartRestartGroup, i7, 48);
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.BUBBLE_CHECKED_24), StringResources_androidKt.stringResource(C27577R.string.bubble_check, composerStartRestartGroup, 0), bentoTheme3.getColors(composerStartRestartGroup, i6).m21456getPositive0d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(Row5.weight$default(row6, companion, 1.0f, false, 2, null), bentoTheme3.getSpacing(composerStartRestartGroup, i6).m21597getXxsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), null, false, composerStartRestartGroup, i7, 48);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhymigration.ui.intro.CmSunsetV2ComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CmSunsetV2Composable.CardFeatureRow$lambda$32(str, str2, str3, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CardFeatureRow$lambda$31$lambda$30$lambda$28$lambda$27$lambda$26(Function1 function1, String str) {
        function1.invoke(str);
        return Unit.INSTANCE;
    }

    private static final void RhyMigrationFaq(final String str, List<TitleAndBody> list, Composer composer, final int i) {
        final List<TitleAndBody> list2 = list;
        Composer composerStartRestartGroup = composer.startRestartGroup(849137148);
        int i2 = (i & 6) == 0 ? i | (composerStartRestartGroup.changed(str) ? 4 : 2) : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(list2) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(849137148, i2, -1, "com.robinhood.android.rhymigration.ui.intro.RhyMigrationFaq (CmSunsetV2Composable.kt:376)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
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
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(str, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21596getXxlargeD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleMedium(), composerStartRestartGroup, i2 & 14, 0, 8188);
            composerStartRestartGroup.startReplaceGroup(346251376);
            list2 = list;
            for (final TitleAndBody titleAndBody : list2) {
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                Composer.Companion companion3 = Composer.INSTANCE;
                if (objRememberedValue == companion3.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                boolean zRhyMigrationFaq$lambda$39$lambda$38$lambda$34 = RhyMigrationFaq$lambda$39$lambda$38$lambda$34(snapshotState);
                BentoBaseRowState bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) null, titleAndBody.getTitle(), (String) null, (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, (DefaultConstructorMarker) null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion3.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.rhymigration.ui.intro.CmSunsetV2ComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CmSunsetV2Composable.RhyMigrationFaq$lambda$39$lambda$38$lambda$37$lambda$36(snapshotState, ((Boolean) obj).booleanValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoAccordionRow.BentoAccordionRow(null, zRhyMigrationFaq$lambda$39$lambda$38$lambda$34, bentoBaseRowState, (Function1) objRememberedValue2, ComposableLambda3.rememberComposableLambda(-1956084663, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rhymigration.ui.intro.CmSunsetV2ComposableKt$RhyMigrationFaq$1$1$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i4) {
                        if ((i4 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1956084663, i4, -1, "com.robinhood.android.rhymigration.ui.intro.RhyMigrationFaq.<anonymous>.<anonymous>.<anonymous> (CmSunsetV2Composable.kt:394)");
                        }
                        String body = titleAndBody.getBody();
                        if (body == null) {
                            body = "";
                        }
                        BentoMarkdownSpannedText2.m21101BentoMarkdownSpannedTextTHkziT8(body, null, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU()), null, 0, null, 0, 0, null, composer2, 0, 506);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (BentoBaseRowState.$stable << 6) | 27648, 1);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhymigration.ui.intro.CmSunsetV2ComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CmSunsetV2Composable.RhyMigrationFaq$lambda$40(str, list2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void RhyMigrationFaq$lambda$39$lambda$38$lambda$35(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhyMigrationFaq$lambda$39$lambda$38$lambda$37$lambda$36(SnapshotState snapshotState, boolean z) {
        RhyMigrationFaq$lambda$39$lambda$38$lambda$35(snapshotState, z);
        return Unit.INSTANCE;
    }
}
