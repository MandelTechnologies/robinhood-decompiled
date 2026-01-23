package com.robinhood.android.rhy.referral.track;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.rhy.referral.C27406R;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.rhy.referral.p345db.RhyReferralAttribution;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;

/* compiled from: RhyReferralsStatusTrackingComposable.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0085\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001a[\u0010\u0012\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010\u0014\u001aG\u0010\u0015\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010\u0016\u001a\u001b\u0010\u0017\u001a\u00020\u00012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0001¢\u0006\u0002\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"RhyReferralsStatusTrackingComposable", "", "pendingInvites", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/models/rhy/referral/db/RhyReferralAttribution;", "completedInvites", "showRemindRequestDialog", "", "onRemind", "Lkotlin/Function1;", "onViewDetails", "showSheet", "Lcom/robinhood/android/rhy/referral/track/RhyReferralsStatusInfoSheetData;", "onDismissReminderSentDialog", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlinx/collections/immutable/PersistentList;Lkotlinx/collections/immutable/PersistentList;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PendingInvitesSection", "onClickInfo", "(Lkotlinx/collections/immutable/PersistentList;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CompletedInvitesSection", "(Lkotlinx/collections/immutable/PersistentList;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ReminderSentDialog", "onDismiss", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-rhy-referral_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class RhyReferralsStatusTrackingComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompletedInvitesSection$lambda$17(ImmutableList3 immutableList3, Function1 function1, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CompletedInvitesSection(immutableList3, function1, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PendingInvitesSection$lambda$11(ImmutableList3 immutableList3, Function1 function1, Function1 function12, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PendingInvitesSection(immutableList3, function1, function12, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReminderSentDialog$lambda$18(Function0 function0, int i, Composer composer, int i2) {
        ReminderSentDialog(function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhyReferralsStatusTrackingComposable$lambda$5(ImmutableList3 immutableList3, ImmutableList3 immutableList32, boolean z, Function1 function1, Function1 function12, Function1 function13, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RhyReferralsStatusTrackingComposable(immutableList3, immutableList32, z, function1, function12, function13, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RhyReferralsStatusTrackingComposable(final ImmutableList3<RhyReferralAttribution> pendingInvites, final ImmutableList3<RhyReferralAttribution> completedInvites, final boolean z, final Function1<? super RhyReferralAttribution, Unit> onRemind, final Function1<? super RhyReferralAttribution, Unit> onViewDetails, final Function1<? super RhyReferralsStatusInfoSheetData, Unit> showSheet, final Function0<Unit> onDismissReminderSentDialog, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        int i4;
        Modifier.Companion companion;
        int i5;
        Modifier modifier3;
        int i6;
        int i7;
        float f;
        BentoTheme bentoTheme;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(pendingInvites, "pendingInvites");
        Intrinsics.checkNotNullParameter(completedInvites, "completedInvites");
        Intrinsics.checkNotNullParameter(onRemind, "onRemind");
        Intrinsics.checkNotNullParameter(onViewDetails, "onViewDetails");
        Intrinsics.checkNotNullParameter(showSheet, "showSheet");
        Intrinsics.checkNotNullParameter(onDismissReminderSentDialog, "onDismissReminderSentDialog");
        Composer composerStartRestartGroup = composer.startRestartGroup(1250743767);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(pendingInvites) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(completedInvites) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onRemind) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onViewDetails) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(showSheet) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismissReminderSentDialog) ? 1048576 : 524288;
        }
        int i8 = i2 & 128;
        if (i8 == 0) {
            if ((12582912 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
            }
            if ((4793491 & i3) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1250743767, i3, -1, "com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingComposable (RhyReferralsStatusTrackingComposable.kt:38)");
                }
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(558441361);
                if (z) {
                    ReminderSentDialog(onDismissReminderSentDialog, composerStartRestartGroup, (i3 >> 18) & 14);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier.Companion companion3 = Modifier.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i9 = BentoTheme.$stable;
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C27406R.string.rhy_referral_track_invites_title, composer2, 0), PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion3, bentoTheme2.getSpacing(composerStartRestartGroup, i9).m21590getDefaultD9Ej5fM(), 0.0f, composerStartRestartGroup, 6, 2), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i9).getDisplayCapsuleLarge(), composer2, 0, 0, 8188);
                boolean z2 = false;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C27406R.string.rhy_referral_track_invites_subtitle, composer2, 0), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion3, bentoTheme2.getSpacing(composer2, i9).m21593getSmallD9Ej5fM(), composer2, 6, 0), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i9).getTextM(), composer2, 0, 0, 8188);
                composer2.startReplaceGroup(558462315);
                if (pendingInvites.isEmpty()) {
                    composer2.startReplaceGroup(5004770);
                    i6 = 458752;
                    boolean z3 = (i3 & 458752) == 131072;
                    Object objRememberedValue = composer2.rememberedValue();
                    if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return RhyReferralsStatusTrackingComposable.RhyReferralsStatusTrackingComposable$lambda$4$lambda$1$lambda$0(showSheet);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion3, 0.0f, bentoTheme2.getSpacing(composer2, i9).m21590getDefaultD9Ej5fM(), 1, null);
                    int i10 = i3 >> 6;
                    companion = companion3;
                    i5 = i3;
                    i4 = i9;
                    i7 = 131072;
                    f = 0.0f;
                    bentoTheme = bentoTheme2;
                    modifier3 = modifier5;
                    PendingInvitesSection(pendingInvites, onRemind, onViewDetails, (Function0) objRememberedValue, modifierM5144paddingVpY3zN4$default, composer2, (i3 & 14) | (i10 & 112) | (i10 & 896), 0);
                    composer2 = composer2;
                } else {
                    i4 = i9;
                    companion = companion3;
                    i5 = i3;
                    modifier3 = modifier5;
                    i6 = 458752;
                    i7 = 131072;
                    f = 0.0f;
                    bentoTheme = bentoTheme2;
                }
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(558484402);
                if (!completedInvites.isEmpty()) {
                    composer2.startReplaceGroup(5004770);
                    if ((i5 & i6) == i7) {
                        z2 = true;
                    }
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return RhyReferralsStatusTrackingComposable.RhyReferralsStatusTrackingComposable$lambda$4$lambda$3$lambda$2(showSheet);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    CompletedInvitesSection(completedInvites, onViewDetails, (Function0) objRememberedValue2, androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion, f, bentoTheme.getSpacing(composer2, i4).m21590getDefaultD9Ej5fM(), 1, null), composer2, ((i5 >> 3) & 14) | ((i5 >> 9) & 112), 0);
                }
                composer2.endReplaceGroup();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RhyReferralsStatusTrackingComposable.RhyReferralsStatusTrackingComposable$lambda$5(pendingInvites, completedInvites, z, onRemind, onViewDetails, showSheet, onDismissReminderSentDialog, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 12582912;
        modifier2 = modifier;
        if ((4793491 & i3) == 4793490) {
            if (i8 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(558441361);
                if (z) {
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier.Companion companion32 = Modifier.INSTANCE;
                BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                int i92 = BentoTheme.$stable;
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C27406R.string.rhy_referral_track_invites_title, composer2, 0), PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion32, bentoTheme22.getSpacing(composerStartRestartGroup, i92).m21590getDefaultD9Ej5fM(), 0.0f, composerStartRestartGroup, 6, 2), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme22.getTypography(composer2, i92).getDisplayCapsuleLarge(), composer2, 0, 0, 8188);
                boolean z22 = false;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C27406R.string.rhy_referral_track_invites_subtitle, composer2, 0), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion32, bentoTheme22.getSpacing(composer2, i92).m21593getSmallD9Ej5fM(), composer2, 6, 0), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme22.getTypography(composer2, i92).getTextM(), composer2, 0, 0, 8188);
                composer2.startReplaceGroup(558462315);
                if (pendingInvites.isEmpty()) {
                }
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(558484402);
                if (!completedInvites.isEmpty()) {
                }
                composer2.endReplaceGroup();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhyReferralsStatusTrackingComposable$lambda$4$lambda$1$lambda$0(Function1 function1) {
        function1.invoke(new RhyReferralsStatusInfoSheetData(C27406R.string.rhy_referral_track_invites_pending_sheet_title, C27406R.string.rhy_referral_track_invites_pending_sheet_body));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhyReferralsStatusTrackingComposable$lambda$4$lambda$3$lambda$2(Function1 function1) {
        function1.invoke(new RhyReferralsStatusInfoSheetData(C27406R.string.rhy_referral_track_invites_completed_sheet_title, C27406R.string.rhy_referral_track_invites_completed_sheet_body));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0261  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void PendingInvitesSection(final ImmutableList3<RhyReferralAttribution> immutableList3, final Function1<? super RhyReferralAttribution, Unit> function1, final Function1<? super RhyReferralAttribution, Unit> function12, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        final Modifier modifier3;
        char c;
        boolean z;
        BentoBaseRowState.Meta.CallToAction callToAction;
        BentoBaseRowState.Meta.CallToAction callToAction2;
        boolean zChanged;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1416467116);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(immutableList3) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1416467116, i3, -1, "com.robinhood.android.rhy.referral.track.PendingInvitesSection (RhyReferralsStatusTrackingComposable.kt:94)");
                }
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Modifier modifier5 = modifier4;
                Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), composerStartRestartGroup, 6, 1);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21622defaultHorizontalPaddingWMci_g0);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C27406R.string.rhy_referral_track_invites_pending_title, composerStartRestartGroup, 0), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 24576, 0, 8174);
                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(ServerToBentoAssetMapper2.INFO_12), StringResources_androidKt.stringResource(C27406R.string.rhy_referral_track_invites_tooltip_icon_description, composerStartRestartGroup, 0), bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21597getXxsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), function0, false, composerStartRestartGroup, BentoIcon4.Size12.$stable | ((i3 << 3) & 57344), 32);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.startReplaceGroup(721478584);
                for (final RhyReferralAttribution rhyReferralAttribution : immutableList3) {
                    final boolean z2 = rhyReferralAttribution.getTimestampReminded() == null && !rhyReferralAttribution.isReferralOfCurrentUser();
                    String inviteName = RhyReferralsStatusTrackingViewState2.getInviteName(rhyReferralAttribution.getReferee());
                    if (rhyReferralAttribution.isReferralOfCurrentUser()) {
                        composerStartRestartGroup.startReplaceGroup(-439159680);
                        z = false;
                        c = 2;
                        callToAction2 = new BentoBaseRowState.Meta.CallToAction(StringResources_androidKt.stringResource(C27406R.string.rhy_referral_track_invites_view_offer, composerStartRestartGroup, 0), null, 2, null);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        c = 2;
                        z = false;
                        if (z2) {
                            composerStartRestartGroup.startReplaceGroup(-438938464);
                            callToAction2 = new BentoBaseRowState.Meta.CallToAction(StringResources_androidKt.stringResource(C27406R.string.rhy_referral_track_invites_remind_cta, composerStartRestartGroup, 0), null, 2, null);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-438736778);
                            composerStartRestartGroup.endReplaceGroup();
                            callToAction = null;
                            boolean z3 = z;
                            BentoBaseRowState bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) null, inviteName, (String) null, (String) null, (BentoBaseRowState.Meta) callToAction, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, (DefaultConstructorMarker) null);
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            zChanged = composerStartRestartGroup.changed(z2) | ((i3 & 112) != 32 ? true : z3) | composerStartRestartGroup.changedInstance(rhyReferralAttribution) | ((i3 & 896) != 256 ? true : z3);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingComposableKt$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return RhyReferralsStatusTrackingComposable.PendingInvitesSection$lambda$10$lambda$9$lambda$8$lambda$7(z2, function1, rhyReferralAttribution, function12);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Composer composer2 = composerStartRestartGroup;
                            BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, bentoBaseRowState, false, false, false, 0L, (Function0) objRememberedValue, composer2, BentoBaseRowState.$stable << 3, 61);
                            composerStartRestartGroup = composer2;
                        }
                    }
                    callToAction = callToAction2;
                    boolean z32 = z;
                    BentoBaseRowState bentoBaseRowState2 = new BentoBaseRowState((BentoBaseRowState.Start) null, inviteName, (String) null, (String) null, (BentoBaseRowState.Meta) callToAction, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, (DefaultConstructorMarker) null);
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChanged = composerStartRestartGroup.changed(z2) | ((i3 & 112) != 32 ? true : z32) | composerStartRestartGroup.changedInstance(rhyReferralAttribution) | ((i3 & 896) != 256 ? true : z32);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingComposableKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return RhyReferralsStatusTrackingComposable.PendingInvitesSection$lambda$10$lambda$9$lambda$8$lambda$7(z2, function1, rhyReferralAttribution, function12);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Composer composer22 = composerStartRestartGroup;
                    BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, bentoBaseRowState2, false, false, false, 0L, (Function0) objRememberedValue, composer22, BentoBaseRowState.$stable << 3, 61);
                    composerStartRestartGroup = composer22;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingComposableKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return RhyReferralsStatusTrackingComposable.PendingInvitesSection$lambda$11(immutableList3, function1, function12, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            Arrangement.Vertical top2 = arrangement2.getTop();
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion4.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
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
                Modifier modifier52 = modifier4;
                Modifier modifierM21622defaultHorizontalPaddingWMci_g02 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion32, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), composerStartRestartGroup, 6, 1);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion4.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21622defaultHorizontalPaddingWMci_g02);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C27406R.string.rhy_referral_track_invites_pending_title, composerStartRestartGroup, 0), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composerStartRestartGroup, 24576, 0, 8174);
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(ServerToBentoAssetMapper2.INFO_12), StringResources_androidKt.stringResource(C27406R.string.rhy_referral_track_invites_tooltip_icon_description, composerStartRestartGroup, 0), bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU(), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21597getXxsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), function0, false, composerStartRestartGroup, BentoIcon4.Size12.$stable | ((i3 << 3) & 57344), 32);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.startReplaceGroup(721478584);
                    while (r0.hasNext()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PendingInvitesSection$lambda$10$lambda$9$lambda$8$lambda$7(boolean z, Function1 function1, RhyReferralAttribution rhyReferralAttribution, Function1 function12) {
        if (z) {
            function1.invoke(rhyReferralAttribution);
        } else {
            function12.invoke(rhyReferralAttribution);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void CompletedInvitesSection(final ImmutableList3<RhyReferralAttribution> immutableList3, final Function1<? super RhyReferralAttribution, Unit> function1, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function02;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-498550485);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(immutableList3) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                function02 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-498550485, i3, -1, "com.robinhood.android.rhy.referral.track.CompletedInvitesSection (RhyReferralsStatusTrackingComposable.kt:149)");
                    }
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                    Modifier modifier5 = modifier4;
                    Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), composerStartRestartGroup, 6, 1);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21622defaultHorizontalPaddingWMci_g0);
                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    int i6 = i3;
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C27406R.string.rhy_referral_track_invites_completed_title, composerStartRestartGroup, 0), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextS(), composerStartRestartGroup, 24576, 0, 8174);
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(ServerToBentoAssetMapper2.INFO_12), StringResources_androidKt.stringResource(C27406R.string.rhy_referral_track_invites_tooltip_icon_description, composerStartRestartGroup, 0), bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21597getXxsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), function02, false, composerStartRestartGroup, BentoIcon4.Size12.$stable | (57344 & (i6 << 6)), 32);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.startReplaceGroup(1277677064);
                    for (final RhyReferralAttribution rhyReferralAttribution : immutableList3) {
                        BentoBaseRowState bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) null, RhyReferralsStatusTrackingViewState2.getInviteName(rhyReferralAttribution.getReferee()), RhyReferralsStatusTrackingViewState2.getInvitedDateString(rhyReferralAttribution), (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, false, false, EnumC7081g.f2779x59907a3d, (DefaultConstructorMarker) null);
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(rhyReferralAttribution) | ((i6 & 112) == 32);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingComposableKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return RhyReferralsStatusTrackingComposable.CompletedInvitesSection$lambda$16$lambda$15$lambda$14$lambda$13(function1, rhyReferralAttribution);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Composer composer2 = composerStartRestartGroup;
                        BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, bentoBaseRowState, false, false, false, 0L, (Function0) objRememberedValue, composer2, BentoBaseRowState.$stable << 3, 61);
                        composerStartRestartGroup = composer2;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return RhyReferralsStatusTrackingComposable.CompletedInvitesSection$lambda$17(immutableList3, function1, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            modifier2 = modifier;
            if ((i3 & 1171) == 1170) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Arrangement arrangement2 = Arrangement.INSTANCE;
                Arrangement.Vertical top2 = arrangement2.getTop();
                Alignment.Companion companion4 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion4.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
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
                    Modifier modifier52 = modifier4;
                    Modifier modifierM21622defaultHorizontalPaddingWMci_g02 = PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion32, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), composerStartRestartGroup, 6, 1);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion4.getCenterVertically(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21622defaultHorizontalPaddingWMci_g02);
                    Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        int i62 = i3;
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C27406R.string.rhy_referral_track_invites_completed_title, composerStartRestartGroup, 0), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextS(), composerStartRestartGroup, 24576, 0, 8174);
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size12(ServerToBentoAssetMapper2.INFO_12), StringResources_androidKt.stringResource(C27406R.string.rhy_referral_track_invites_tooltip_icon_description, composerStartRestartGroup, 0), bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU(), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21597getXxsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), function02, false, composerStartRestartGroup, BentoIcon4.Size12.$stable | (57344 & (i62 << 6)), 32);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.startReplaceGroup(1277677064);
                        while (r0.hasNext()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function02 = function0;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CompletedInvitesSection$lambda$16$lambda$15$lambda$14$lambda$13(Function1 function1, RhyReferralAttribution rhyReferralAttribution) {
        function1.invoke(rhyReferralAttribution);
        return Unit.INSTANCE;
    }

    public static final void ReminderSentDialog(final Function0<Unit> onDismiss, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1611701600);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onDismiss) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1611701600, i2, -1, "com.robinhood.android.rhy.referral.track.ReminderSentDialog (RhyReferralsStatusTrackingComposable.kt:184)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1203849259, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingComposableKt.ReminderSentDialog.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1203849259, i3, -1, "com.robinhood.android.rhy.referral.track.ReminderSentDialog.<anonymous> (RhyReferralsStatusTrackingComposable.kt:186)");
                    }
                    BentoAlertDialog.BentoAlertDialog(StringResources_androidKt.stringResource(C27406R.string.rhy_referral_track_invites_reminder_dialog_title, composer2, 0), new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C27406R.string.rhy_referral_track_invites_reminder_dialog_message, composer2, 0)), new BentoAlertButton(StringResources_androidKt.stringResource(C27406R.string.rhy_referral_track_invites_reminder_dialog_cta, composer2, 0), onDismiss), null, null, null, false, null, onDismiss, composer2, (BentoAlertDialog2.Body.Text.$stable << 3) | (BentoAlertButton.$stable << 6), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhy.referral.track.RhyReferralsStatusTrackingComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyReferralsStatusTrackingComposable.ReminderSentDialog$lambda$18(onDismiss, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
