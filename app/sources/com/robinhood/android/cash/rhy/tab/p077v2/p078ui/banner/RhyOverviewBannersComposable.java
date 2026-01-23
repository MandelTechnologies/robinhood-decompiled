package com.robinhood.android.cash.rhy.tab.p077v2.p078ui.banner;

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
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.cash.rhy.tab.p077v2.logging.RhyEventLoggingUtils;
import com.robinhood.android.cash.rhy.tab.p077v2.p078ui.banner.RhyOverviewBannerState;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoInfoBanner2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p320db.IacInfoBanner;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.shared.iac.extensions.IacInfoBannerComposable;
import com.robinhood.shared.iac.infobanner.InfoBannerCallbacks;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RhyOverviewBannersComposable.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aI\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0002\u0010\r\u001a3\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000bH\u0003¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"RhyOverviewBannersComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "iacInfoBanner", "Lcom/robinhood/models/db/IacInfoBanner;", "iacInfoBannerCallbacks", "Lcom/robinhood/shared/iac/infobanner/InfoBannerCallbacks;", "rhyOverviewBannerState", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState;", "onRhyOverviewBannerClick", "Lkotlin/Function1;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState$Visible;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/models/db/IacInfoBanner;Lcom/robinhood/shared/iac/infobanner/InfoBannerCallbacks;Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "RhyOverviewStatusBanner", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/cash/rhy/tab/v2/ui/banner/RhyOverviewBannerState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "feature-cash-rhy-tab_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannersComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class RhyOverviewBannersComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhyOverviewBannersComposable$lambda$1(Modifier modifier, IacInfoBanner iacInfoBanner, InfoBannerCallbacks infoBannerCallbacks, RhyOverviewBannerState rhyOverviewBannerState, Function1 function1, int i, int i2, Composer composer, int i3) {
        RhyOverviewBannersComposable(modifier, iacInfoBanner, infoBannerCallbacks, rhyOverviewBannerState, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhyOverviewStatusBanner$lambda$6(Modifier modifier, RhyOverviewBannerState rhyOverviewBannerState, Function1 function1, int i, int i2, Composer composer, int i3) {
        RhyOverviewStatusBanner(modifier, rhyOverviewBannerState, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RhyOverviewBannersComposable(Modifier modifier, final IacInfoBanner iacInfoBanner, InfoBannerCallbacks infoBannerCallbacks, final RhyOverviewBannerState rhyOverviewBannerState, final Function1<? super RhyOverviewBannerState.Visible, Unit> onRhyOverviewBannerClick, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        InfoBannerCallbacks infoBannerCallbacks2;
        int i4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(rhyOverviewBannerState, "rhyOverviewBannerState");
        Intrinsics.checkNotNullParameter(onRhyOverviewBannerClick, "onRhyOverviewBannerClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-360652951);
        int i5 = i2 & 1;
        if (i5 != 0) {
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
            i3 |= composerStartRestartGroup.changedInstance(iacInfoBanner) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                infoBannerCallbacks2 = infoBannerCallbacks;
                i3 |= composerStartRestartGroup.changed(infoBannerCallbacks2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(rhyOverviewBannerState) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onRhyOverviewBannerClick) ? 16384 : 8192;
            }
            i4 = i3;
            if ((i4 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (i6 != 0) {
                    infoBannerCallbacks2 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-360652951, i4, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannersComposable (RhyOverviewBannersComposable.kt:26)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
                composerStartRestartGroup.startReplaceGroup(1616009783);
                if (iacInfoBanner != null) {
                    IacInfoBannerComposable.IacInfoBannerComposable(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), iacInfoBanner, infoBannerCallbacks2, composerStartRestartGroup, i4 & 1008, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                RhyOverviewStatusBanner(null, rhyOverviewBannerState, onRhyOverviewBannerClick, composerStartRestartGroup, (i4 >> 6) & 1008, 1);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            final InfoBannerCallbacks infoBannerCallbacks3 = infoBannerCallbacks2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannersComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RhyOverviewBannersComposable.RhyOverviewBannersComposable$lambda$1(modifier3, iacInfoBanner, infoBannerCallbacks3, rhyOverviewBannerState, onRhyOverviewBannerClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        infoBannerCallbacks2 = infoBannerCallbacks;
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        i4 = i3;
        if ((i4 & 9363) == 9362) {
            if (i5 == 0) {
            }
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
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
                composerStartRestartGroup.startReplaceGroup(1616009783);
                if (iacInfoBanner != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                RhyOverviewStatusBanner(null, rhyOverviewBannerState, onRhyOverviewBannerClick, composerStartRestartGroup, (i4 >> 6) & 1008, 1);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
            }
        }
        final InfoBannerCallbacks infoBannerCallbacks32 = infoBannerCallbacks2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void RhyOverviewStatusBanner(Modifier modifier, final RhyOverviewBannerState rhyOverviewBannerState, final Function1<? super RhyOverviewBannerState.Visible, Unit> function1, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Modifier modifier3;
        final Modifier modifier4;
        CharSequence text;
        CharSequence text2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1923028784);
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
            i3 |= composerStartRestartGroup.changed(rhyOverviewBannerState) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier5 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1923028784, i3, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewStatusBanner (RhyOverviewBannersComposable.kt:47)");
            }
            Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            if (rhyOverviewBannerState instanceof RhyOverviewBannerState.Visible) {
                RhyOverviewBannerState.Visible visible = (RhyOverviewBannerState.Visible) rhyOverviewBannerState;
                Function0<Unit> bannerDismissAction = visible.getBannerDismissAction();
                String string2 = null;
                if (bannerDismissAction == null) {
                    composerStartRestartGroup.startReplaceGroup(-1617785471);
                    Modifier modifier6 = modifier5;
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(ModifiersKt.autoLogEvents$default(modifier5, RhyEventLoggingUtils.toRhyTabEventData$default(RhyEventLoggingUtils.INSTANCE, Component.ComponentType.RHY_HOME_STATUS_BANNER, null, rhyOverviewBannerState.getLogIdentifier(), 1, null), true, false, false, true, false, null, 108, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    StringResource bannerText = visible.getBannerText();
                    Intrinsics.checkNotNull(resources);
                    String string3 = bannerText.getText(resources).toString();
                    BentoIcon4.Size24 size24 = new BentoIcon4.Size24(visible.getBannerIcon());
                    StringResource bannerCtaText = visible.getBannerCtaText();
                    if (bannerCtaText != null && (text2 = bannerCtaText.getText(resources)) != null) {
                        string2 = text2.toString();
                    }
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean z = ((i3 & 896) == 256) | ((i3 & 112) == 32);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannersComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return RhyOverviewBannersComposable.RhyOverviewStatusBanner$lambda$3$lambda$2(function1, rhyOverviewBannerState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoInfoBanner2.BentoPinnedInfoBanner(modifierM5146paddingqDBjuR0$default, string3, size24, string2, (Function0) objRememberedValue, composerStartRestartGroup, BentoIcon4.Size24.$stable << 6, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    modifier3 = modifier6;
                } else {
                    Modifier modifier7 = modifier5;
                    composerStartRestartGroup.startReplaceGroup(-1616935420);
                    modifier3 = modifier7;
                    Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(ModifiersKt.autoLogEvents$default(modifier7, RhyEventLoggingUtils.toRhyTabEventData$default(RhyEventLoggingUtils.INSTANCE, Component.ComponentType.RHY_HOME_STATUS_BANNER, null, rhyOverviewBannerState.getLogIdentifier(), 1, null), true, false, false, true, false, null, 108, null), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    StringResource bannerText2 = visible.getBannerText();
                    Intrinsics.checkNotNull(resources);
                    String string4 = bannerText2.getText(resources).toString();
                    BentoIcon4.Size24 size242 = new BentoIcon4.Size24(visible.getBannerIcon());
                    StringResource bannerCtaText2 = visible.getBannerCtaText();
                    if (bannerCtaText2 != null && (text = bannerCtaText2.getText(resources)) != null) {
                        string2 = text.toString();
                    }
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean z2 = ((i3 & 896) == 256) | ((i3 & 112) == 32);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannersComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return RhyOverviewBannersComposable.RhyOverviewStatusBanner$lambda$5$lambda$4(function1, rhyOverviewBannerState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoInfoBanner2.BentoDismissableInfoBanner(modifierM5146paddingqDBjuR0$default2, string4, size242, string2, (Function0) objRememberedValue2, bannerDismissAction, composerStartRestartGroup, BentoIcon4.Size24.$stable << 6, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                }
            } else {
                modifier3 = modifier5;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier4 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.banner.RhyOverviewBannersComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyOverviewBannersComposable.RhyOverviewStatusBanner$lambda$6(modifier4, rhyOverviewBannerState, function1, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhyOverviewStatusBanner$lambda$3$lambda$2(Function1 function1, RhyOverviewBannerState rhyOverviewBannerState) {
        function1.invoke(rhyOverviewBannerState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhyOverviewStatusBanner$lambda$5$lambda$4(Function1 function1, RhyOverviewBannerState rhyOverviewBannerState) {
        function1.invoke(rhyOverviewBannerState);
        return Unit.INSTANCE;
    }
}
