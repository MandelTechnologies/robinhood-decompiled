package com.robinhood.android.rollover401k.steps.verifyinfo;

import android.R;
import android.content.Context;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.models.retirement.api.ApiRetirement401kRolloverUserInfoResponse;
import com.robinhood.android.retirement.lib.rollover401k.Rollover401kHeaderImage3;
import com.robinhood.android.retirement.match.MatchAgreementsScreen5;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.component.text.Markdown3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.p409ui.color.ThemeColors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Rollover401kVerifyInfoScreen.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a)\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e\u001a/\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u0014\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u0013X\u008a\u008e\u0002"}, m3636d2 = {MatchAgreementsScreen5.ContributionAndAgreementsLoadingTestTag, "", "getLoadingTestTag$annotations", "()V", "getLoadingTestTag", "()Ljava/lang/String;", "Rollover401kVerifyInfoScreen", "", "viewState", "Lcom/robinhood/android/rollover401k/steps/verifyinfo/Rollover401kVerifyInfoViewState;", "callbacks", "Lcom/robinhood/android/rollover401k/steps/verifyinfo/Rollover401kVerifyInfoCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/rollover401k/steps/verifyinfo/Rollover401kVerifyInfoViewState;Lcom/robinhood/android/rollover401k/steps/verifyinfo/Rollover401kVerifyInfoCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "RolloverVerifyInfoContent", "viewModel", "Lcom/robinhood/android/models/retirement/api/ApiRetirement401kRolloverUserInfoResponse;", "isSubmitting", "", "(Lcom/robinhood/android/models/retirement/api/ApiRetirement401kRolloverUserInfoResponse;ZLcom/robinhood/android/rollover401k/steps/verifyinfo/Rollover401kVerifyInfoCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-rollover-401k_externalDebug", "hasScrolledToBottom"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.rollover401k.steps.verifyinfo.Rollover401kVerifyInfoScreenKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class Rollover401kVerifyInfoScreen2 {
    private static final String LoadingTestTag = "LoadingTestTag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Rollover401kVerifyInfoScreen$lambda$0(Rollover401kVerifyInfoViewState rollover401kVerifyInfoViewState, Rollover401kVerifyInfoScreen rollover401kVerifyInfoScreen, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Rollover401kVerifyInfoScreen(rollover401kVerifyInfoViewState, rollover401kVerifyInfoScreen, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RolloverVerifyInfoContent$lambda$16(ApiRetirement401kRolloverUserInfoResponse apiRetirement401kRolloverUserInfoResponse, boolean z, Rollover401kVerifyInfoScreen rollover401kVerifyInfoScreen, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RolloverVerifyInfoContent(apiRetirement401kRolloverUserInfoResponse, z, rollover401kVerifyInfoScreen, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getLoadingTestTag$annotations() {
    }

    public static final String getLoadingTestTag() {
        return LoadingTestTag;
    }

    public static final void Rollover401kVerifyInfoScreen(final Rollover401kVerifyInfoViewState rollover401kVerifyInfoViewState, final Rollover401kVerifyInfoScreen callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(2074555822);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(rollover401kVerifyInfoViewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2074555822, i3, -1, "com.robinhood.android.rollover401k.steps.verifyinfo.Rollover401kVerifyInfoScreen (Rollover401kVerifyInfoScreen.kt:61)");
            }
            ApiRetirement401kRolloverUserInfoResponse viewModel = rollover401kVerifyInfoViewState != null ? rollover401kVerifyInfoViewState.getViewModel() : null;
            if (viewModel == null) {
                composerStartRestartGroup.startReplaceGroup(-1486641540);
                LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(TestTag3.testTag(WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.INSTANCE), LoadingTestTag), null, false, true, composerStartRestartGroup, 3072, 6);
                composerStartRestartGroup.endReplaceGroup();
                modifier2 = modifier;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1486421626);
                modifier2 = modifier;
                RolloverVerifyInfoContent(viewModel, rollover401kVerifyInfoViewState.isSubmitting(), callbacks, modifier2, composerStartRestartGroup, (i3 << 3) & 8064, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rollover401k.steps.verifyinfo.Rollover401kVerifyInfoScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Rollover401kVerifyInfoScreen2.Rollover401kVerifyInfoScreen$lambda$0(rollover401kVerifyInfoViewState, callbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean RolloverVerifyInfoContent$lambda$2(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0214  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void RolloverVerifyInfoContent(final ApiRetirement401kRolloverUserInfoResponse apiRetirement401kRolloverUserInfoResponse, final boolean z, Rollover401kVerifyInfoScreen rollover401kVerifyInfoScreen, Modifier modifier, Composer composer, final int i, final int i2) {
        ApiRetirement401kRolloverUserInfoResponse apiRetirement401kRolloverUserInfoResponse2;
        int i3;
        Modifier modifier2;
        final ScrollState scrollStateRememberScrollState;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        boolean zChanged;
        Object objRememberedValue2;
        Object objRememberedValue3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int i4;
        boolean z2;
        Object objRememberedValue4;
        final Spanned spannedRememberMarkdown;
        Object objRememberedValue5;
        boolean zChangedInstance;
        Object objRememberedValue6;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        boolean z3;
        String strStringResource;
        boolean z4;
        boolean zChangedInstance2;
        Object objRememberedValue7;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final Rollover401kVerifyInfoScreen rollover401kVerifyInfoScreen2 = rollover401kVerifyInfoScreen;
        Composer composerStartRestartGroup = composer.startRestartGroup(583827889);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            apiRetirement401kRolloverUserInfoResponse2 = apiRetirement401kRolloverUserInfoResponse;
        } else if ((i & 6) == 0) {
            apiRetirement401kRolloverUserInfoResponse2 = apiRetirement401kRolloverUserInfoResponse;
            i3 = (composerStartRestartGroup.changedInstance(apiRetirement401kRolloverUserInfoResponse2) ? 4 : 2) | i;
        } else {
            apiRetirement401kRolloverUserInfoResponse2 = apiRetirement401kRolloverUserInfoResponse;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(rollover401kVerifyInfoScreen2) : composerStartRestartGroup.changedInstance(rollover401kVerifyInfoScreen2) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(583827889, i3, -1, "com.robinhood.android.rollover401k.steps.verifyinfo.RolloverVerifyInfoContent (Rollover401kVerifyInfoScreen.kt:86)");
                }
                scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Boolean boolValueOf = Boolean.valueOf(scrollStateRememberScrollState.getCanScrollForward());
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged = composerStartRestartGroup.changed(scrollStateRememberScrollState);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Rollover401kVerifyInfoScreen3(scrollStateRememberScrollState, snapshotState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue3;
                Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(modifier4);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierNavigationBarsPadding);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, companion4, 1.0f, false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                String header_image = apiRetirement401kRolloverUserInfoResponse2.getHeader_image();
                composerStartRestartGroup.startReplaceGroup(5004770);
                i4 = i3 & 896;
                z2 = i4 != 256 || ((i3 & 512) != 0 && composerStartRestartGroup.changedInstance(rollover401kVerifyInfoScreen2));
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!z2 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Rollover401kVerifyInfoScreen4(rollover401kVerifyInfoScreen2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                Rollover401kHeaderImage3.m18135RolloverHeaderImageIColEu4(header_image, (Function0) ((KFunction) objRememberedValue4), null, C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE)), composerStartRestartGroup, 3072, 4);
                String title = apiRetirement401kRolloverUserInfoResponse2.getTitle();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                BentoText2.m20747BentoText38GnDrw(title, PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion4, 0.0f, composerStartRestartGroup, 6, 1), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21595getXsmallD9Ej5fM(), 5, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8184);
                spannedRememberMarkdown = Markdown3.rememberMarkdown(apiRetirement401kRolloverUserInfoResponse.getSubtitle_markdown(), composerStartRestartGroup, 0);
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion4, 0.0f, composerStartRestartGroup, 6, 1), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 7, null);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new Function1() { // from class: com.robinhood.android.rollover401k.steps.verifyinfo.Rollover401kVerifyInfoScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Rollover401kVerifyInfoScreen2.RolloverVerifyInfoContent$lambda$15$lambda$11$lambda$7$lambda$6((Context) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                Function1 function1 = (Function1) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(spannedRememberMarkdown);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new Function1() { // from class: com.robinhood.android.rollover401k.steps.verifyinfo.Rollover401kVerifyInfoScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Rollover401kVerifyInfoScreen2.RolloverVerifyInfoContent$lambda$15$lambda$11$lambda$10$lambda$9(spannedRememberMarkdown, (RdsInlineDefinitionTextView) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceGroup();
                AndroidView_androidKt.AndroidView(function1, modifierM5146paddingqDBjuR0$default, (Function1) objRememberedValue6, composerStartRestartGroup, 6, 0);
                ImmutableList3 persistentList = extensions2.toPersistentList(apiRetirement401kRolloverUserInfoResponse.getSettings_rows());
                composerStartRestartGroup.startReplaceGroup(-1772220517);
                SduiColumns.SduiColumn(persistentList, GenericAction.class, companion4, null, null, HorizontalPadding.Default, arrangement.getTop(), companion2.getStart(), false, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion4, 0.0f, composerStartRestartGroup, 6, 1), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor3);
                }
                composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                BentoMarkdownText2.BentoMarkdownText(apiRetirement401kRolloverUserInfoResponse.getDisclaimer_markdown(), (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composerStartRestartGroup, i6).getTextS(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), bentoTheme.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU(), false, composerStartRestartGroup, BentoMarkdownText.$stable << 15, 16), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, MarkdownStyle.$stable << 6, 26);
                composerStartRestartGroup.endNode();
                if (RolloverVerifyInfoContent$lambda$2(snapshotState)) {
                    z3 = false;
                    composerStartRestartGroup.startReplaceGroup(-864459501);
                    strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_action_review, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-864549742);
                    z3 = false;
                    strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                String str = strStringResource;
                Modifier modifierAutoLogEvents = UtilKt.autoLogEvents(SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion4, 0.0f, composerStartRestartGroup, 6, 1), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 1, null), 0.0f, 1, null), Component.ComponentType.BUTTON, !RolloverVerifyInfoContent$lambda$2(snapshotState) ? "continue" : "review", false, composerStartRestartGroup, 48, 4);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                if (i4 == 256) {
                    rollover401kVerifyInfoScreen2 = rollover401kVerifyInfoScreen;
                    if ((i3 & 512) == 0 || !composerStartRestartGroup.changedInstance(rollover401kVerifyInfoScreen2)) {
                        z4 = z3;
                    }
                    zChangedInstance2 = z4 | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(scrollStateRememberScrollState);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = new Function0() { // from class: com.robinhood.android.rollover401k.steps.verifyinfo.Rollover401kVerifyInfoScreenKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Rollover401kVerifyInfoScreen2.RolloverVerifyInfoContent$lambda$15$lambda$14$lambda$13(rollover401kVerifyInfoScreen2, coroutineScope, snapshotState, scrollStateRememberScrollState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue7, str, modifierAutoLogEvents, null, null, false, z, null, null, null, null, false, null, composerStartRestartGroup, (i3 << 15) & 3670016, 0, 8120);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                } else {
                    rollover401kVerifyInfoScreen2 = rollover401kVerifyInfoScreen;
                }
                z4 = true;
                zChangedInstance2 = z4 | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(scrollStateRememberScrollState);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2) {
                    objRememberedValue7 = new Function0() { // from class: com.robinhood.android.rollover401k.steps.verifyinfo.Rollover401kVerifyInfoScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Rollover401kVerifyInfoScreen2.RolloverVerifyInfoContent$lambda$15$lambda$14$lambda$13(rollover401kVerifyInfoScreen2, coroutineScope, snapshotState, scrollStateRememberScrollState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    composerStartRestartGroup.endReplaceGroup();
                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue7, str, modifierAutoLogEvents, null, null, false, z, null, null, null, null, false, null, composerStartRestartGroup, (i3 << 15) & 3670016, 0, 8120);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier4;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rollover401k.steps.verifyinfo.Rollover401kVerifyInfoScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Rollover401kVerifyInfoScreen2.RolloverVerifyInfoContent$lambda$16(apiRetirement401kRolloverUserInfoResponse, z, rollover401kVerifyInfoScreen2, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Boolean boolValueOf2 = Boolean.valueOf(scrollStateRememberScrollState.getCanScrollForward());
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            zChanged = composerStartRestartGroup.changed(scrollStateRememberScrollState);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue2 = new Rollover401kVerifyInfoScreen3(scrollStateRememberScrollState, snapshotState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                final CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue3;
                Modifier modifierNavigationBarsPadding2 = WindowInsetsPadding_androidKt.navigationBarsPadding(modifier4);
                Arrangement arrangement2 = Arrangement.INSTANCE;
                Arrangement.Vertical top2 = arrangement2.getTop();
                Alignment.Companion companion22 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierNavigationBarsPadding2);
                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor4 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy3, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion32.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    Modifier.Companion companion42 = Modifier.INSTANCE;
                    Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(Column5.weight$default(column62, companion42, 1.0f, false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion22.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default2);
                    Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy22, companion32.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                        String header_image2 = apiRetirement401kRolloverUserInfoResponse2.getHeader_image();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        i4 = i3 & 896;
                        if (i4 != 256) {
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (!z2) {
                                objRememberedValue4 = new Rollover401kVerifyInfoScreen4(rollover401kVerifyInfoScreen2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                composerStartRestartGroup.endReplaceGroup();
                                Rollover401kHeaderImage3.m18135RolloverHeaderImageIColEu4(header_image2, (Function0) ((KFunction) objRememberedValue4), null, C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE)), composerStartRestartGroup, 3072, 4);
                                String title2 = apiRetirement401kRolloverUserInfoResponse2.getTitle();
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                int i62 = BentoTheme.$stable;
                                BentoText2.m20747BentoText38GnDrw(title2, PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion42, 0.0f, composerStartRestartGroup, 6, 1), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21595getXsmallD9Ej5fM(), 5, null), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8184);
                                spannedRememberMarkdown = Markdown3.rememberMarkdown(apiRetirement401kRolloverUserInfoResponse.getSubtitle_markdown(), composerStartRestartGroup, 0);
                                Modifier modifierM5146paddingqDBjuR0$default3 = PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion42, 0.0f, composerStartRestartGroup, 6, 1), 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), 7, null);
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue5 == companion.getEmpty()) {
                                }
                                Function1 function12 = (Function1) objRememberedValue5;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                zChangedInstance = composerStartRestartGroup.changedInstance(spannedRememberMarkdown);
                                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                if (!zChangedInstance) {
                                    objRememberedValue6 = new Function1() { // from class: com.robinhood.android.rollover401k.steps.verifyinfo.Rollover401kVerifyInfoScreenKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return Rollover401kVerifyInfoScreen2.RolloverVerifyInfoContent$lambda$15$lambda$11$lambda$10$lambda$9(spannedRememberMarkdown, (RdsInlineDefinitionTextView) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                    composerStartRestartGroup.endReplaceGroup();
                                    AndroidView_androidKt.AndroidView(function12, modifierM5146paddingqDBjuR0$default3, (Function1) objRememberedValue6, composerStartRestartGroup, 6, 0);
                                    ImmutableList3 persistentList2 = extensions2.toPersistentList(apiRetirement401kRolloverUserInfoResponse.getSettings_rows());
                                    composerStartRestartGroup.startReplaceGroup(-1772220517);
                                    SduiColumns.SduiColumn(persistentList2, GenericAction.class, companion42, null, null, HorizontalPadding.Default, arrangement2.getTop(), companion22.getStart(), false, composerStartRestartGroup, 0, 0);
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.endNode();
                                    Modifier modifierM5146paddingqDBjuR0$default22 = PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion42, 0.0f, composerStartRestartGroup, 6, 1), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getTopStart(), false);
                                    currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default22);
                                    Function0<ComposeUiNode> constructor32 = companion32.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (composerStartRestartGroup.getInserting()) {
                                    }
                                    composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion32.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash3 = companion32.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl3.getInserting()) {
                                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion32.getSetModifier());
                                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                        BentoMarkdownText2.BentoMarkdownText(apiRetirement401kRolloverUserInfoResponse.getDisclaimer_markdown(), (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextS(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), bentoTheme2.getColors(composerStartRestartGroup, i62).m21426getFg20d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, i62).m21426getFg20d7_KjU(), false, composerStartRestartGroup, BentoMarkdownText.$stable << 15, 16), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, MarkdownStyle.$stable << 6, 26);
                                        composerStartRestartGroup.endNode();
                                        if (RolloverVerifyInfoContent$lambda$2(snapshotState)) {
                                        }
                                        String str2 = strStringResource;
                                        Modifier modifierAutoLogEvents2 = UtilKt.autoLogEvents(SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion42, 0.0f, composerStartRestartGroup, 6, 1), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), 1, null), 0.0f, 1, null), Component.ComponentType.BUTTON, !RolloverVerifyInfoContent$lambda$2(snapshotState) ? "continue" : "review", false, composerStartRestartGroup, 48, 4);
                                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                                        if (i4 == 256) {
                                        }
                                        z4 = true;
                                        zChangedInstance2 = z4 | composerStartRestartGroup.changedInstance(coroutineScope2) | composerStartRestartGroup.changed(scrollStateRememberScrollState);
                                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                        if (zChangedInstance2) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RolloverVerifyInfoContent$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RdsInlineDefinitionTextView RolloverVerifyInfoContent$lambda$15$lambda$11$lambda$7$lambda$6(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new RdsInlineDefinitionTextView(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RolloverVerifyInfoContent$lambda$15$lambda$11$lambda$10$lambda$9(Spanned spanned, RdsInlineDefinitionTextView inlineDefinitionTextView) {
        Intrinsics.checkNotNullParameter(inlineDefinitionTextView, "inlineDefinitionTextView");
        ScarletManager2.overrideStyle$default(inlineDefinitionTextView, new ThemedResourceReference(ResourceType.STYLE.INSTANCE, C20690R.attr.textAppearanceRegularMedium), false, 2, null);
        inlineDefinitionTextView.setSpannableString(new SpannableString(spanned));
        inlineDefinitionTextView.setLineSpacing(8.0f, 1.0f);
        Context context = inlineDefinitionTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        inlineDefinitionTextView.setLinkTextColor(ThemeColors.getThemeColor(context, R.attr.textColorSecondary));
        Context context2 = inlineDefinitionTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        inlineDefinitionTextView.setHighlightColor(ThemeColors.getThemeColor(context2, C20690R.attr.colorBackground2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RolloverVerifyInfoContent$lambda$15$lambda$14$lambda$13(Rollover401kVerifyInfoScreen rollover401kVerifyInfoScreen, CoroutineScope coroutineScope, SnapshotState snapshotState, ScrollState scrollState) {
        if (!RolloverVerifyInfoContent$lambda$2(snapshotState)) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new Rollover401kVerifyInfoScreen5(scrollState, null), 3, null);
        } else {
            rollover401kVerifyInfoScreen.onSubmitInfo();
        }
        return Unit.INSTANCE;
    }
}
