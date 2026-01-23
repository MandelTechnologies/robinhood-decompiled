package com.robinhood.android.equitydetail.p123ui.milestones;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
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
import com.robinhood.android.equitydetail.p123ui.MilestonesViewData;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.rows.BentoTimelineRowKt;
import com.robinhood.compose.bento.component.rows.BentoTimelineRowState;
import com.robinhood.compose.bento.component.rows.Timeline;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.extensions.ThemedImageUrlExtensions;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.ThemedImageSource;
import com.robinhood.models.serverdriven.p347db.TimelineRow;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;

/* compiled from: MilestonesComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"MilestonesComposable", "", "state", "Lcom/robinhood/android/equitydetail/ui/MilestonesViewData;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/equitydetail/ui/MilestonesViewData;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-equity-detail_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equitydetail.ui.milestones.MilestonesComposableKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class MilestonesComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MilestonesComposable$lambda$10(MilestonesViewData milestonesViewData, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MilestonesComposable(milestonesViewData, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MilestonesComposable(final MilestonesViewData state, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        List<TimelineRow> timelineRows;
        Iterator<T> it;
        boolean z;
        Modifier modifier4;
        Timeline.CtaButton ctaButton;
        Timeline.CtaButton ctaButton2;
        boolean z2;
        HttpUrl resolvedUrl;
        Function0 function0;
        Function0 function02;
        Timeline.DetailContent detailContent;
        Color color;
        Color colorM6701boximpl;
        Timeline.StatusIconPosition statusIconPosition;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1818938462);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1818938462, i3, -1, "com.robinhood.android.equitydetail.ui.milestones.MilestonesComposable (MilestonesComposable.kt:20)");
                }
                final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
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
                timelineRows = state.getTimelineRows();
                if ((timelineRows instanceof Collection) || !timelineRows.isEmpty()) {
                    it = timelineRows.iterator();
                    while (it.hasNext()) {
                        if (((TimelineRow) it.next()).getTertiaryInfo() != null) {
                            z = true;
                            break;
                        }
                    }
                    z = false;
                    composerStartRestartGroup.startReplaceGroup(529516651);
                    int i5 = 0;
                    for (Object obj : state.getTimelineRows()) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        TimelineRow timelineRow = (TimelineRow) obj;
                        Timeline.Position bentoTimelineRowPosition = TimelineRowMapping.toBentoTimelineRowPosition(timelineRow.getPosition());
                        Timeline.Status bentoTimelineRowStatus = TimelineRowMapping.toBentoTimelineRowStatus(timelineRow.getState());
                        TimelineRow.State prevRowState = timelineRow.getPrevRowState();
                        Timeline.Status bentoTimelineRowStatus2 = prevRowState != null ? TimelineRowMapping.toBentoTimelineRowStatus(prevRowState) : null;
                        String primaryText = timelineRow.getPrimaryText();
                        String metadataText = timelineRow.getMetadataText();
                        final GenericAction ctaAction = timelineRow.getCtaAction();
                        composerStartRestartGroup.startReplaceGroup(529531112);
                        if (ctaAction == null) {
                            modifier4 = modifier3;
                            ctaButton2 = null;
                        } else {
                            String ctaButtonText = timelineRow.getCtaButtonText();
                            composerStartRestartGroup.startReplaceGroup(682593344);
                            if (!(ctaAction instanceof GenericAction.DeeplinkAction) || ctaButtonText == null) {
                                modifier4 = modifier3;
                                ctaButton = null;
                            } else {
                                composerStartRestartGroup.startReplaceGroup(-1746271574);
                                boolean zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(ctaAction);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance) {
                                    modifier4 = modifier3;
                                } else {
                                    modifier4 = modifier3;
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    ctaButton = new Timeline.CtaButton(ctaButtonText, (Function0) objRememberedValue);
                                }
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.equitydetail.ui.milestones.MilestonesComposableKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return MilestonesComposable.m1981x230cf86a(navigator, context, ctaAction);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                composerStartRestartGroup.endReplaceGroup();
                                ctaButton = new Timeline.CtaButton(ctaButtonText, (Function0) objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            ctaButton2 = ctaButton;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        ServerToBentoAssetMapper2 iconOverride = timelineRow.getIconOverride();
                        String tertiaryInfo = timelineRow.getTertiaryInfo();
                        composerStartRestartGroup.startReplaceGroup(529552635);
                        if (tertiaryInfo == null) {
                            z2 = false;
                            detailContent = null;
                        } else {
                            ThemedImageSource detailThumbnailImage = timelineRow.getDetailThumbnailImage();
                            composerStartRestartGroup.startReplaceGroup(682617782);
                            if (detailThumbnailImage == null) {
                                resolvedUrl = null;
                                z2 = false;
                            } else {
                                z2 = false;
                                resolvedUrl = ThemedImageUrlExtensions.getResolvedUrl(detailThumbnailImage, composerStartRestartGroup, 0);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            String url = resolvedUrl != null ? resolvedUrl.getUrl() : null;
                            final GenericAction ctaAction2 = timelineRow.getCtaAction();
                            composerStartRestartGroup.startReplaceGroup(682621195);
                            if (ctaAction2 == null) {
                                function02 = null;
                            } else {
                                composerStartRestartGroup.startReplaceGroup(-270041660);
                                if (ctaAction2 instanceof GenericAction.DeeplinkAction) {
                                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(ctaAction2);
                                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equitydetail.ui.milestones.MilestonesComposableKt$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return MilestonesComposable.m1982x18f5668d(navigator, context, ctaAction2);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    }
                                    function0 = (Function0) objRememberedValue2;
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    function0 = null;
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                function02 = function0;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            detailContent = new Timeline.DetailContent(tertiaryInfo, url, function02, false, 8, null);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(529575436);
                        Timeline.PrimaryTextStyleOverride primaryTextStyleOverride = z ? new Timeline.PrimaryTextStyleOverride(true, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21368getAccent0d7_KjU()), null, 4, null) : null;
                        composerStartRestartGroup.endReplaceGroup();
                        Timeline.IconStyle iconStyle = z ? Timeline.IconStyle.DOT : null;
                        if (z && timelineRow.getState() != TimelineRow.State.INCOMPLETE) {
                            composerStartRestartGroup.startReplaceGroup(682653740);
                            long jM21368getAccent0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21368getAccent0d7_KjU();
                            composerStartRestartGroup.endReplaceGroup();
                            colorM6701boximpl = Color.m6701boximpl(jM21368getAccent0d7_KjU);
                        } else if (z && timelineRow.getState() == TimelineRow.State.INCOMPLETE) {
                            composerStartRestartGroup.startReplaceGroup(682658569);
                            long jM21373getBg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU();
                            composerStartRestartGroup.endReplaceGroup();
                            colorM6701boximpl = Color.m6701boximpl(jM21373getBg30d7_KjU);
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-312384105);
                            composerStartRestartGroup.endReplaceGroup();
                            color = null;
                            if (!z) {
                                statusIconPosition = Timeline.StatusIconPosition.TOP;
                            } else {
                                statusIconPosition = Timeline.StatusIconPosition.CENTER;
                            }
                            BentoTimelineRowKt.BentoTimelineRow(new BentoTimelineRowState(bentoTimelineRowStatus, bentoTimelineRowPosition, primaryText, null, null, metadataText, ctaButton2, null, bentoTimelineRowStatus2, true, iconOverride, color, iconStyle, statusIconPosition, false, false, 0, false, i5, false, false, false, detailContent, primaryTextStyleOverride, 3915928, null), null, composerStartRestartGroup, BentoTimelineRowState.$stable, 2);
                            i5 = i6;
                            modifier3 = modifier4;
                        }
                        color = colorM6701boximpl;
                        if (!z) {
                        }
                        BentoTimelineRowKt.BentoTimelineRow(new BentoTimelineRowState(bentoTimelineRowStatus, bentoTimelineRowPosition, primaryText, null, null, metadataText, ctaButton2, null, bentoTimelineRowStatus2, true, iconOverride, color, iconStyle, statusIconPosition, false, false, 0, false, i5, false, false, false, detailContent, primaryTextStyleOverride, 3915928, null), null, composerStartRestartGroup, BentoTimelineRowState.$stable, 2);
                        i5 = i6;
                        modifier3 = modifier4;
                    }
                    Modifier modifier5 = modifier3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier5;
                } else {
                    z = false;
                    composerStartRestartGroup.startReplaceGroup(529516651);
                    int i52 = 0;
                    while (r9.hasNext()) {
                    }
                    Modifier modifier52 = modifier3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier52;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.milestones.MilestonesComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return MilestonesComposable.MilestonesComposable$lambda$10(state, modifier2, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
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
                timelineRows = state.getTimelineRows();
                if (timelineRows instanceof Collection) {
                    it = timelineRows.iterator();
                    while (it.hasNext()) {
                    }
                    z = false;
                    composerStartRestartGroup.startReplaceGroup(529516651);
                    int i522 = 0;
                    while (r9.hasNext()) {
                    }
                    Modifier modifier522 = modifier3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier2 = modifier522;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MilestonesComposable$lambda$9$lambda$8$lambda$3$lambda$2$lambda$1 */
    public static final Unit m1981x230cf86a(Navigator navigator, Context context, GenericAction genericAction) {
        Navigator.DefaultImpls.handleDeepLink$default(navigator, context, ((GenericAction.DeeplinkAction) genericAction).getUri(), null, null, false, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MilestonesComposable$lambda$9$lambda$8$lambda$7$lambda$6$lambda$5$lambda$4 */
    public static final Unit m1982x18f5668d(Navigator navigator, Context context, GenericAction genericAction) {
        Navigator.DefaultImpls.handleDeepLink$default(navigator, context, ((GenericAction.DeeplinkAction) genericAction).getUri(), null, null, false, null, 60, null);
        return Unit.INSTANCE;
    }
}
