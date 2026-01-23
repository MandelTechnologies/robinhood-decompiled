package com.robinhood.android.retirement.p239ui.unfunded;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.RippleKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.dashboard.lib.C13691R;
import com.robinhood.android.dashboard.lib.appbar.DashboardAppBar3;
import com.robinhood.android.home.contracts.HomeDashboardType;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.models.retirement.p194db.RetirementUnfundedViewModel;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.retirement.dashboard.header.RetirementDashboardHeader2;
import com.robinhood.android.retirement.dashboard.header.RetirementDashboardHeader3;
import com.robinhood.android.retirement.lib.ContributionRings2;
import com.robinhood.android.retirement.p239ui.PostChartSection4;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.TopBarScrollState;
import com.robinhood.compose.bento.component.TopBarScrollState3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.shared.settings.contracts.SettingsPage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: UnfundedDashboard.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010\u0011\u001a/\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010\u0015\u001a/\u0010\u0016\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0017\u001a9\u0010\u0018\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0007¢\u0006\u0002\u0010\u001b\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"AnimationHeight", "Landroidx/compose/ui/unit/Dp;", "F", "UnfundedDashboardTestTag", "", "LoadedUnfundedDashboard", "", "content", "Lcom/robinhood/android/models/retirement/db/RetirementUnfundedViewModel$MobileContent;", "viewState", "Lcom/robinhood/android/retirement/ui/unfunded/RetirementDashboardUnfundedViewState;", "callbacks", "Lcom/robinhood/android/retirement/ui/unfunded/UnfundedDashboardCallbacks;", "isEmbedded", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/models/retirement/db/RetirementUnfundedViewModel$MobileContent;Lcom/robinhood/android/retirement/ui/unfunded/RetirementDashboardUnfundedViewState;Lcom/robinhood/android/retirement/ui/unfunded/UnfundedDashboardCallbacks;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PlaceholderUnfundedDashboard", "headerState", "Lcom/robinhood/android/retirement/dashboard/header/RetirementDashboardHeaderViewState;", "(Lcom/robinhood/android/retirement/dashboard/header/RetirementDashboardHeaderViewState;Lcom/robinhood/android/retirement/ui/unfunded/UnfundedDashboardCallbacks;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "UnfundedDashboard", "(Lcom/robinhood/android/retirement/ui/unfunded/RetirementDashboardUnfundedViewState;Lcom/robinhood/android/retirement/ui/unfunded/UnfundedDashboardCallbacks;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "UnfundedScreen", "scrollState", "Landroidx/compose/foundation/ScrollState;", "(Lcom/robinhood/android/retirement/ui/unfunded/RetirementDashboardUnfundedViewState;Lcom/robinhood/android/retirement/ui/unfunded/UnfundedDashboardCallbacks;ZLandroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;II)V", "feature-retirement-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.retirement.ui.unfunded.UnfundedDashboardKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class UnfundedDashboard2 {
    private static final float AnimationHeight = C2002Dp.m7995constructorimpl(EnumC7081g.f2777x89a9e432);
    public static final String UnfundedDashboardTestTag = "unfunded_dashboard";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedUnfundedDashboard$lambda$8(RetirementUnfundedViewModel.MobileContent mobileContent, RetirementDashboardUnfundedViewState retirementDashboardUnfundedViewState, UnfundedDashboard unfundedDashboard, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LoadedUnfundedDashboard(mobileContent, retirementDashboardUnfundedViewState, unfundedDashboard, z, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlaceholderUnfundedDashboard$lambda$10(RetirementDashboardHeader3 retirementDashboardHeader3, UnfundedDashboard unfundedDashboard, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PlaceholderUnfundedDashboard(retirementDashboardHeader3, unfundedDashboard, z, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnfundedDashboard$lambda$11(RetirementDashboardUnfundedViewState retirementDashboardUnfundedViewState, UnfundedDashboard unfundedDashboard, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        UnfundedDashboard(retirementDashboardUnfundedViewState, unfundedDashboard, z, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnfundedScreen$lambda$12(RetirementDashboardUnfundedViewState retirementDashboardUnfundedViewState, UnfundedDashboard unfundedDashboard, boolean z, Modifier modifier, ScrollState scrollState, int i, int i2, Composer composer, int i3) {
        UnfundedScreen(retirementDashboardUnfundedViewState, unfundedDashboard, z, modifier, scrollState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0267  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void LoadedUnfundedDashboard(final RetirementUnfundedViewModel.MobileContent mobileContent, RetirementDashboardUnfundedViewState retirementDashboardUnfundedViewState, final UnfundedDashboard unfundedDashboard, final boolean z, Modifier modifier, Composer composer, final int i, final int i2) {
        RetirementUnfundedViewModel.MobileContent mobileContent2;
        int i3;
        RetirementDashboardUnfundedViewState retirementDashboardUnfundedViewState2;
        UnfundedDashboard unfundedDashboard2;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Composer composer2;
        final SettingsPage settingsRowKey;
        float f;
        String activeAccountNumber;
        BrokerageAccountType activeAccountType;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(307054348);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            mobileContent2 = mobileContent;
        } else if ((i & 6) == 0) {
            mobileContent2 = mobileContent;
            i3 = (composerStartRestartGroup.changedInstance(mobileContent2) ? 4 : 2) | i;
        } else {
            mobileContent2 = mobileContent;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                retirementDashboardUnfundedViewState2 = retirementDashboardUnfundedViewState;
                i3 |= composerStartRestartGroup.changedInstance(retirementDashboardUnfundedViewState2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
                unfundedDashboard2 = unfundedDashboard;
            } else {
                unfundedDashboard2 = unfundedDashboard;
                if ((i & 384) == 0) {
                    i3 |= composerStartRestartGroup.changed(unfundedDashboard2) ? 256 : 128;
                }
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                }
                if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                } else {
                    Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(307054348, i3, -1, "com.robinhood.android.retirement.ui.unfunded.LoadedUnfundedDashboard (UnfundedDashboard.kt:69)");
                    }
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(spaceBetween, companion.getStart(), composerStartRestartGroup, 6);
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
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
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
                    composerStartRestartGroup.startReplaceGroup(-1901845733);
                    if (!z) {
                        RetirementDashboardHeader2.RetirementDashboardHeader(retirementDashboardUnfundedViewState2.getHeaderState(), unfundedDashboard2, null, composerStartRestartGroup, RetirementDashboardHeader3.$stable | ((i3 >> 3) & 112), 4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ImmutableList3 persistentList = extensions2.toPersistentList(mobileContent2.getHeaderContent());
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 7, null);
                    composerStartRestartGroup.startReplaceGroup(-1772220517);
                    HorizontalPadding horizontalPadding = HorizontalPadding.Default;
                    Modifier modifier4 = modifier3;
                    int i6 = (((((i3 << 3) & 7168) | 12582912) << 3) & 57344) | 100663296;
                    SduiColumns.SduiColumn(persistentList, GenericAction.class, modifierM5146paddingqDBjuR0$default, null, unfundedDashboard, horizontalPadding, arrangement.getTop(), companion.getStart(), false, composerStartRestartGroup, i6, 0);
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    ContributionRings2.SpinningRingsAnimation(false, PaddingKt.m5144paddingVpY3zN4$default(column6.align(SizeKt.m5156height3ABfNKs(companion3, AnimationHeight), companion.getCenterHorizontally()), bentoTheme.getSpacing(composer2, i5).m21594getXlargeD9Ej5fM(), 0.0f, 2, null), false, composer2, 6, 4);
                    settingsRowKey = retirementDashboardUnfundedViewState2.getSettingsRowKey();
                    composer2.startReplaceGroup(-962339473);
                    if (settingsRowKey == null) {
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM()), composer2, 0);
                        composer2.startReplaceGroup(-962337071);
                        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                        builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
                        builder.append(StringResources_androidKt.stringResource(C13691R.string.ira_settings, composer2, 0));
                        builder.pop();
                        AnnotatedString annotatedString = builder.toAnnotatedString();
                        composer2.endReplaceGroup();
                        final Navigator navigator = (Navigator) composer2.consume(LocalNavigator.getLocalNavigator());
                        final Context context = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer2, 0);
                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, companion3);
                        Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor3);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composer2, i5).m21372getBg20d7_KjU(), bentoTheme.getSpacing(composer2, i5).m21593getSmallD9Ej5fM(), composer2, 0, 1);
                        Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(companion3, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM());
                        composer2.startReplaceGroup(1849434622);
                        Object objRememberedValue = composer2.rememberedValue();
                        Composer.Companion companion4 = Composer.INSTANCE;
                        if (objRememberedValue == companion4.getEmpty()) {
                            objRememberedValue = InteractionSource2.MutableInteractionSource();
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
                        composer2.endReplaceGroup();
                        IndicationNodeFactory indicationNodeFactoryM5937rippleH2RKhps$default = RippleKt.m5937rippleH2RKhps$default(false, 0.0f, 0L, 7, null);
                        composer2.startReplaceGroup(-1746271574);
                        boolean zChangedInstance = composer2.changedInstance(navigator) | composer2.changedInstance(context) | composer2.changedInstance(settingsRowKey);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue2 == companion4.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.retirement.ui.unfunded.UnfundedDashboardKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return UnfundedDashboard2.LoadedUnfundedDashboard$lambda$7$lambda$6$lambda$4$lambda$3(navigator, context, settingsRowKey);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceGroup();
                        Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifierM5143paddingVpY3zN4, interactionSource3, indicationNodeFactoryM5937rippleH2RKhps$default, false, null, null, (Function0) objRememberedValue2, 28, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composer2, 48);
                        int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer2, modifierM4891clickableO2vRcR0$default);
                        Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor4);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion2.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        f = 0.0f;
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.SETTINGS_24), null, bentoTheme.getColors(composer2, i5).m21425getFg0d7_KjU(), null, null, false, composer2, BentoIcon4.Size24.$stable | 48, 56);
                        Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion3, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM()), composer2, 0);
                        BentoText2.m20748BentoTextQnj7Zds(annotatedString, companion3, Color.m6701boximpl(bentoTheme.getColors(composer2, i5).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, null, null, composer2, 48, 0, 16376);
                        composer2.endNode();
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, bentoTheme.getColors(composer2, i5).m21372getBg20d7_KjU(), bentoTheme.getSpacing(composer2, i5).m21593getSmallD9Ej5fM(), composer2, 0, 1);
                        composer2 = composer2;
                        composer2.endNode();
                    } else {
                        f = 0.0f;
                    }
                    composer2.endReplaceGroup();
                    activeAccountNumber = retirementDashboardUnfundedViewState2.getActiveAccountNumber();
                    activeAccountType = retirementDashboardUnfundedViewState2.getActiveAccountType();
                    composer2.startReplaceGroup(-962271769);
                    if (activeAccountNumber != null && activeAccountType != null) {
                        PostChartSection4.RetirementDashboardPostChartSection(activeAccountNumber, activeAccountType, null, composer2, 0, 4);
                    }
                    composer2.endReplaceGroup();
                    ImmutableList3 persistentList2 = extensions2.toPersistentList(mobileContent.getBodyContent());
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion3, f, bentoTheme.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM(), 1, null);
                    composer2.startReplaceGroup(-1772220517);
                    Composer composer3 = composer2;
                    SduiColumns.SduiColumn(persistentList2, GenericAction.class, modifierM5144paddingVpY3zN4$default, null, unfundedDashboard, horizontalPadding, arrangement.getTop(), companion.getStart(), false, composer3, i6, 0);
                    composerStartRestartGroup = composer3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final RetirementDashboardUnfundedViewState retirementDashboardUnfundedViewState3 = retirementDashboardUnfundedViewState2;
                    final Modifier modifier5 = modifier2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.ui.unfunded.UnfundedDashboardKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return UnfundedDashboard2.LoadedUnfundedDashboard$lambda$8(mobileContent, retirementDashboardUnfundedViewState3, unfundedDashboard, z, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            modifier2 = modifier;
            if ((i3 & 9363) == 9362) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Arrangement arrangement2 = Arrangement.INSTANCE;
                Arrangement.HorizontalOrVertical spaceBetween2 = arrangement2.getSpaceBetween();
                Alignment.Companion companion5 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy4 = Column2.columnMeasurePolicy(spaceBetween2, companion5.getStart(), composerStartRestartGroup, 6);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor5 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy4, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap5, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier5, companion22.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    Modifier.Companion companion32 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion5.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion32);
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
                        composerStartRestartGroup.startReplaceGroup(-1901845733);
                        if (!z) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        ImmutableList3 persistentList3 = extensions2.toPersistentList(mobileContent2.getHeaderContent());
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i52 = BentoTheme.$stable;
                        Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion32, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 7, null);
                        composerStartRestartGroup.startReplaceGroup(-1772220517);
                        HorizontalPadding horizontalPadding2 = HorizontalPadding.Default;
                        Modifier modifier42 = modifier3;
                        int i62 = (((((i3 << 3) & 7168) | 12582912) << 3) & 57344) | 100663296;
                        SduiColumns.SduiColumn(persistentList3, GenericAction.class, modifierM5146paddingqDBjuR0$default2, null, unfundedDashboard, horizontalPadding2, arrangement2.getTop(), companion5.getStart(), false, composerStartRestartGroup, i62, 0);
                        composer2 = composerStartRestartGroup;
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        ContributionRings2.SpinningRingsAnimation(false, PaddingKt.m5144paddingVpY3zN4$default(column62.align(SizeKt.m5156height3ABfNKs(companion32, AnimationHeight), companion5.getCenterHorizontally()), bentoTheme2.getSpacing(composer2, i52).m21594getXlargeD9Ej5fM(), 0.0f, 2, null), false, composer2, 6, 4);
                        settingsRowKey = retirementDashboardUnfundedViewState2.getSettingsRowKey();
                        composer2.startReplaceGroup(-962339473);
                        if (settingsRowKey == null) {
                        }
                        composer2.endReplaceGroup();
                        activeAccountNumber = retirementDashboardUnfundedViewState2.getActiveAccountNumber();
                        activeAccountType = retirementDashboardUnfundedViewState2.getActiveAccountType();
                        composer2.startReplaceGroup(-962271769);
                        if (activeAccountNumber != null) {
                            PostChartSection4.RetirementDashboardPostChartSection(activeAccountNumber, activeAccountType, null, composer2, 0, 4);
                        }
                        composer2.endReplaceGroup();
                        ImmutableList3 persistentList22 = extensions2.toPersistentList(mobileContent.getBodyContent());
                        Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(companion32, f, bentoTheme2.getSpacing(composer2, i52).m21590getDefaultD9Ej5fM(), 1, null);
                        composer2.startReplaceGroup(-1772220517);
                        Composer composer32 = composer2;
                        SduiColumns.SduiColumn(persistentList22, GenericAction.class, modifierM5144paddingVpY3zN4$default2, null, unfundedDashboard, horizontalPadding2, arrangement2.getTop(), companion5.getStart(), false, composer32, i62, 0);
                        composerStartRestartGroup = composer32;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = modifier42;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        retirementDashboardUnfundedViewState2 = retirementDashboardUnfundedViewState;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedUnfundedDashboard$lambda$7$lambda$6$lambda$4$lambda$3(Navigator navigator, Context context, SettingsPage settingsPage) {
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, settingsPage, false, false, false, false, null, false, null, null, 1020, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void PlaceholderUnfundedDashboard(final RetirementDashboardHeader3 retirementDashboardHeader3, final UnfundedDashboard unfundedDashboard, final boolean z, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        UnfundedDashboard unfundedDashboard2;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-850721319);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(retirementDashboardHeader3) : composerStartRestartGroup.changedInstance(retirementDashboardHeader3) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                unfundedDashboard2 = unfundedDashboard;
                i3 |= composerStartRestartGroup.changed(unfundedDashboard2) ? 32 : 16;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                if ((i3 & 1043) != 1042 || !composerStartRestartGroup.getSkipping()) {
                    if (i4 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-850721319, i3, -1, "com.robinhood.android.retirement.ui.unfunded.PlaceholderUnfundedDashboard (UnfundedDashboard.kt:180)");
                    }
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier2);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    RetirementDashboardHeader2.RetirementDashboardHeader(retirementDashboardHeader3, unfundedDashboard2, null, composerStartRestartGroup, RetirementDashboardHeader3.$stable | (i3 & 14) | (i3 & 112), 4);
                    Modifier modifierWeight$default = Column5.weight$default(column6, Modifier.INSTANCE, 1.0f, false, 2, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    PlaceholderKt.UnfundedDashboardPlaceholder(PaddingKt.m5146paddingqDBjuR0$default(modifierWeight$default, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 5, null), composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                }
                final Modifier modifier3 = modifier2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.ui.unfunded.UnfundedDashboardKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return UnfundedDashboard2.PlaceholderUnfundedDashboard$lambda$10(retirementDashboardHeader3, unfundedDashboard, z, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            modifier2 = modifier;
            if ((i3 & 1043) != 1042) {
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier2);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    RetirementDashboardHeader2.RetirementDashboardHeader(retirementDashboardHeader3, unfundedDashboard2, null, composerStartRestartGroup, RetirementDashboardHeader3.$stable | (i3 & 14) | (i3 & 112), 4);
                    Modifier modifierWeight$default2 = Column5.weight$default(column62, Modifier.INSTANCE, 1.0f, false, 2, null);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i52 = BentoTheme.$stable;
                    PlaceholderKt.UnfundedDashboardPlaceholder(PaddingKt.m5146paddingqDBjuR0$default(modifierWeight$default2, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21595getXsmallD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 5, null), composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
            final Modifier modifier32 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        unfundedDashboard2 = unfundedDashboard;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 1043) != 1042) {
        }
        final Modifier modifier322 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final void UnfundedDashboard(RetirementDashboardUnfundedViewState viewState, UnfundedDashboard callbacks, boolean z, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final boolean z2;
        final UnfundedDashboard unfundedDashboard;
        final RetirementDashboardUnfundedViewState retirementDashboardUnfundedViewState;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(713929202);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(callbacks) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(713929202, i3, -1, "com.robinhood.android.retirement.ui.unfunded.UnfundedDashboard (UnfundedDashboard.kt:205)");
            }
            RetirementUnfundedViewModel.MobileContent activeContent = viewState.getActiveContent();
            if (activeContent != null) {
                composerStartRestartGroup.startReplaceGroup(-12914163);
                LoadedUnfundedDashboard(activeContent, viewState, callbacks, z, modifier3, composerStartRestartGroup, (i3 << 3) & 65520, 0);
                retirementDashboardUnfundedViewState = viewState;
                unfundedDashboard = callbacks;
                z2 = z;
                modifier3 = modifier3;
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else {
                z2 = z;
                unfundedDashboard = callbacks;
                retirementDashboardUnfundedViewState = viewState;
                composerStartRestartGroup.startReplaceGroup(-12683585);
                PlaceholderUnfundedDashboard(retirementDashboardUnfundedViewState.getHeaderState(), unfundedDashboard, z2, modifier3, composerStartRestartGroup, RetirementDashboardHeader3.$stable | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            z2 = z;
            unfundedDashboard = callbacks;
            retirementDashboardUnfundedViewState = viewState;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.ui.unfunded.UnfundedDashboardKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UnfundedDashboard2.UnfundedDashboard$lambda$11(retirementDashboardUnfundedViewState, unfundedDashboard, z2, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UnfundedScreen(final RetirementDashboardUnfundedViewState viewState, final UnfundedDashboard callbacks, final boolean z, Modifier modifier, ScrollState scrollState, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        ScrollState scrollState2;
        int i4;
        final ScrollState scrollStateRememberScrollState;
        Composer composer2;
        final ScrollState scrollState3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-296350372);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(callbacks) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    scrollState2 = scrollState;
                    int i6 = composerStartRestartGroup.changed(scrollState2) ? 16384 : 8192;
                    i3 |= i6;
                } else {
                    scrollState2 = scrollState;
                }
                i3 |= i6;
            } else {
                scrollState2 = scrollState;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                } else {
                    if (i5 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 16) == 0) {
                        i4 = i3 & (-57345);
                        scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-296350372, i4, -1, "com.robinhood.android.retirement.ui.unfunded.UnfundedScreen (UnfundedDashboard.kt:232)");
                    }
                    final TopBarScrollState topBarScrollStateRememberTopBarScrollState = TopBarScrollState3.rememberTopBarScrollState(0.0f, composerStartRestartGroup, 0, 1);
                    final HomeDashboardType.Account account = (viewState.getActiveAccountType() == null || viewState.getActiveAccountNumber() == null) ? null : new HomeDashboardType.Account(viewState.getActiveAccountNumber());
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i7).m21371getBg0d7_KjU();
                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i7).m21425getFg0d7_KjU();
                    composer2 = composerStartRestartGroup;
                    Modifier modifier4 = modifier2;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifier4, ComposableLambda3.rememberComposableLambda(-247028960, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.unfunded.UnfundedDashboardKt.UnfundedScreen.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i8) {
                            if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-247028960, i8, -1, "com.robinhood.android.retirement.ui.unfunded.UnfundedScreen.<anonymous> (UnfundedDashboard.kt:246)");
                            }
                            HomeDashboardType.Account account2 = account;
                            if (account2 != null && !z) {
                                DashboardAppBar3.DashboardAppBar(account2, topBarScrollStateRememberTopBarScrollState, null, null, null, false, composer3, TopBarScrollState.$stable << 3, 60);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(-674307925, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.unfunded.UnfundedDashboardKt.UnfundedScreen.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer3, int i8) {
                            int i9;
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i8 & 6) == 0) {
                                i9 = i8 | (composer3.changed(paddingValues) ? 4 : 2);
                            } else {
                                i9 = i8;
                            }
                            if ((i9 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-674307925, i9, -1, "com.robinhood.android.retirement.ui.unfunded.UnfundedScreen.<anonymous> (UnfundedDashboard.kt:254)");
                            }
                            UnfundedDashboard2.UnfundedDashboard(viewState, callbacks, z, ScrollKt.verticalScroll$default(TopBarScrollState3.scrollableTopBarState(SizeKt.fillMaxHeight$default(PaddingKt.padding(TestTag3.testTag(Modifier.INSTANCE, UnfundedDashboard2.UnfundedDashboardTestTag), paddingValues), 0.0f, 1, null), scrollStateRememberScrollState, topBarScrollStateRememberTopBarScrollState), scrollStateRememberScrollState, false, null, false, 14, null), composer3, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composer2, ((i4 >> 9) & 14) | 805306416, 316);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scrollState3 = scrollStateRememberScrollState;
                    modifier3 = modifier4;
                }
                scrollStateRememberScrollState = scrollState2;
                i4 = i3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final TopBarScrollState topBarScrollStateRememberTopBarScrollState2 = TopBarScrollState3.rememberTopBarScrollState(0.0f, composerStartRestartGroup, 0, 1);
                if (viewState.getActiveAccountType() == null) {
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i72 = BentoTheme.$stable;
                    long jM21371getBg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i72).m21371getBg0d7_KjU();
                    long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i72).m21425getFg0d7_KjU();
                    composer2 = composerStartRestartGroup;
                    Modifier modifier42 = modifier2;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifier42, ComposableLambda3.rememberComposableLambda(-247028960, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.unfunded.UnfundedDashboardKt.UnfundedScreen.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i8) {
                            if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-247028960, i8, -1, "com.robinhood.android.retirement.ui.unfunded.UnfundedScreen.<anonymous> (UnfundedDashboard.kt:246)");
                            }
                            HomeDashboardType.Account account2 = account;
                            if (account2 != null && !z) {
                                DashboardAppBar3.DashboardAppBar(account2, topBarScrollStateRememberTopBarScrollState2, null, null, null, false, composer3, TopBarScrollState.$stable << 3, 60);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), null, null, null, 0, jM21371getBg0d7_KjU2, jM21425getFg0d7_KjU2, null, ComposableLambda3.rememberComposableLambda(-674307925, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.ui.unfunded.UnfundedDashboardKt.UnfundedScreen.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer3, int i8) {
                            int i9;
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i8 & 6) == 0) {
                                i9 = i8 | (composer3.changed(paddingValues) ? 4 : 2);
                            } else {
                                i9 = i8;
                            }
                            if ((i9 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-674307925, i9, -1, "com.robinhood.android.retirement.ui.unfunded.UnfundedScreen.<anonymous> (UnfundedDashboard.kt:254)");
                            }
                            UnfundedDashboard2.UnfundedDashboard(viewState, callbacks, z, ScrollKt.verticalScroll$default(TopBarScrollState3.scrollableTopBarState(SizeKt.fillMaxHeight$default(PaddingKt.padding(TestTag3.testTag(Modifier.INSTANCE, UnfundedDashboard2.UnfundedDashboardTestTag), paddingValues), 0.0f, 1, null), scrollStateRememberScrollState, topBarScrollStateRememberTopBarScrollState2), scrollStateRememberScrollState, false, null, false, 14, null), composer3, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composer2, ((i4 >> 9) & 14) | 805306416, 316);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    scrollState3 = scrollStateRememberScrollState;
                    modifier3 = modifier42;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
                scrollState3 = scrollState2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.ui.unfunded.UnfundedDashboardKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return UnfundedDashboard2.UnfundedScreen$lambda$12(viewState, callbacks, z, modifier3, scrollState3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if ((i3 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if (i5 != 0) {
                }
                if ((i2 & 16) == 0) {
                    scrollStateRememberScrollState = scrollState2;
                    i4 = i3;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final TopBarScrollState topBarScrollStateRememberTopBarScrollState22 = TopBarScrollState3.rememberTopBarScrollState(0.0f, composerStartRestartGroup, 0, 1);
                if (viewState.getActiveAccountType() == null) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
