package com.robinhood.android.rhy.referral.track.detail;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.rhy.referral.C27406R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RhyReferralsTrackingDetailComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"RhyReferralsTrackingDetailComposable", "", "state", "Lcom/robinhood/android/rhy/referral/track/detail/RhyReferralsTrackingDetailViewState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/rhy/referral/track/detail/RhyReferralsTrackingDetailViewState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-rhy-referral_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.rhy.referral.track.detail.RhyReferralsTrackingDetailComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RhyReferralsTrackingDetailComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhyReferralsTrackingDetailComposable$lambda$4(RhyReferralsTrackingDetailViewState rhyReferralsTrackingDetailViewState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RhyReferralsTrackingDetailComposable(rhyReferralsTrackingDetailViewState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RhyReferralsTrackingDetailComposable(final RhyReferralsTrackingDetailViewState state, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        StringResource subtitle;
        StringResource date;
        StringResource offerDetails;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-199913586);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2);
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
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-199913586, i3, -1, "com.robinhood.android.rhy.referral.track.detail.RhyReferralsTrackingDetailComposable (RhyReferralsTrackingDetailComposable.kt:24)");
                }
                Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(modifier3, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                Modifier modifier4 = modifier3;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
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
                Modifier.Companion companion2 = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                BentoText2.m20747BentoText38GnDrw(state.getTitle(), PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, composerStartRestartGroup, 6, 2), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
                composerStartRestartGroup = composerStartRestartGroup;
                subtitle = state.getSubtitle();
                composerStartRestartGroup.startReplaceGroup(-2013668361);
                if (subtitle != null) {
                    Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21595getXsmallD9Ej5fM(), 0.0f, composerStartRestartGroup, 6, 2);
                    Intrinsics.checkNotNull(resources);
                    BentoText2.m20747BentoText38GnDrw(subtitle.getText(resources).toString(), modifierM21622defaultHorizontalPaddingWMci_g0, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM(), composerStartRestartGroup, 0, 0, 8188);
                    composerStartRestartGroup = composerStartRestartGroup;
                }
                composerStartRestartGroup.endReplaceGroup();
                Spacer2.Spacer(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 7, null), composerStartRestartGroup, 0);
                AnnotatedString annotatedString = new AnnotatedString(StringResources_androidKt.stringResource(C27406R.string.rhy_referral_track_detail_status_label, composerStartRestartGroup, 0), null, 2, null);
                StringResource status = state.getStatus();
                Intrinsics.checkNotNull(resources);
                BentoDataRowState bentoDataRowState = new BentoDataRowState(null, annotatedString, null, null, null, new AnnotatedString(status.getText(resources).toString(), null, 2, null), null, null, null, null, false, false, 4061, null);
                int i6 = BentoDataRowState.$stable;
                BentoDataRowKt.BentoDataRow(bentoDataRowState, null, null, composerStartRestartGroup, i6, 6);
                date = state.getDate();
                composerStartRestartGroup.startReplaceGroup(-2013647444);
                if (date != null) {
                    BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C27406R.string.rhy_referral_track_detail_date_label, composerStartRestartGroup, 0), null, 2, null), null, null, null, new AnnotatedString(StringResource2.getString(date, composerStartRestartGroup, StringResource.$stable), null, 2, null), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, i6, 6);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C27406R.string.rhy_referral_track_detail_referral_details_label, composerStartRestartGroup, 0), null, 2, null), null, null, null, new AnnotatedString(state.getReferralDetails().getText(resources).toString(), null, 2, null), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, i6, 6);
                offerDetails = state.getOfferDetails();
                composerStartRestartGroup.startReplaceGroup(-2013627537);
                if (offerDetails != null) {
                    BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C27406R.string.rhy_referral_track_detail_offer_label, composerStartRestartGroup, 0), null, 2, null), null, null, null, new AnnotatedString(offerDetails.getText(resources).toString(), null, 2, null), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, i6, 6);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhy.referral.track.detail.RhyReferralsTrackingDetailComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RhyReferralsTrackingDetailComposable.RhyReferralsTrackingDetailComposable$lambda$4(state, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            Resources resources2 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(modifier3, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            Modifier modifier42 = modifier3;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion22 = Modifier.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                BentoText2.m20747BentoText38GnDrw(state.getTitle(), PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, composerStartRestartGroup, 6, 2), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
                composerStartRestartGroup = composerStartRestartGroup;
                subtitle = state.getSubtitle();
                composerStartRestartGroup.startReplaceGroup(-2013668361);
                if (subtitle != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Spacer2.Spacer(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion22, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 7, null), composerStartRestartGroup, 0);
                AnnotatedString annotatedString2 = new AnnotatedString(StringResources_androidKt.stringResource(C27406R.string.rhy_referral_track_detail_status_label, composerStartRestartGroup, 0), null, 2, null);
                StringResource status2 = state.getStatus();
                Intrinsics.checkNotNull(resources2);
                BentoDataRowState bentoDataRowState2 = new BentoDataRowState(null, annotatedString2, null, null, null, new AnnotatedString(status2.getText(resources2).toString(), null, 2, null), null, null, null, null, false, false, 4061, null);
                int i62 = BentoDataRowState.$stable;
                BentoDataRowKt.BentoDataRow(bentoDataRowState2, null, null, composerStartRestartGroup, i62, 6);
                date = state.getDate();
                composerStartRestartGroup.startReplaceGroup(-2013647444);
                if (date != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C27406R.string.rhy_referral_track_detail_referral_details_label, composerStartRestartGroup, 0), null, 2, null), null, null, null, new AnnotatedString(state.getReferralDetails().getText(resources2).toString(), null, 2, null), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, i62, 6);
                offerDetails = state.getOfferDetails();
                composerStartRestartGroup.startReplaceGroup(-2013627537);
                if (offerDetails != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
