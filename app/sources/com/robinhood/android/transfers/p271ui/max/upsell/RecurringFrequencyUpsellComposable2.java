package com.robinhood.android.transfers.p271ui.max.upsell;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
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
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.p271ui.max.upsell.RecurringFrequencyUpsellFragment;
import com.robinhood.android.transfers.p271ui.max.upsell.RecurringFrequencyUpsellViewState;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.common.Haptics;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: RecurringFrequencyUpsellComposable.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001a5\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\r2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000e\u001aC\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00162\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u0017\"\u000e\u0010\u0018\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"RecurringFrequencyUpsellComposable", "", "callbacks", "Lcom/robinhood/android/transfers/ui/max/upsell/DepositFlowFrequencyCallbacks;", "rows", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/transfers/ui/max/upsell/RecurringFrequencyUpsellFragment$TransferFrequencyRow;", "viewState", "Lcom/robinhood/android/transfers/ui/max/upsell/RecurringFrequencyUpsellViewState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/transfers/ui/max/upsell/DepositFlowFrequencyCallbacks;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/transfers/ui/max/upsell/RecurringFrequencyUpsellViewState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "RecurringFrequencyUpsellContent", "Lcom/robinhood/android/transfers/ui/max/upsell/RecurringFrequencyUpsellViewState$Loaded;", "(Lcom/robinhood/android/transfers/ui/max/upsell/DepositFlowFrequencyCallbacks;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/transfers/ui/max/upsell/RecurringFrequencyUpsellViewState$Loaded;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "FrequencySelectionRow", "frequency", "selected", "", "secondaryText", "", "onFrequencyClicked", "Lkotlin/Function1;", "(Lcom/robinhood/android/transfers/ui/max/upsell/RecurringFrequencyUpsellFragment$TransferFrequencyRow;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "RECURRING_FREQUENCY_UPSELL_LOADING_SPINNER", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.ui.max.upsell.RecurringFrequencyUpsellComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class RecurringFrequencyUpsellComposable2 {
    public static final String RECURRING_FREQUENCY_UPSELL_LOADING_SPINNER = "loading";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FrequencySelectionRow$lambda$15(RecurringFrequencyUpsellFragment.TransferFrequencyRow transferFrequencyRow, boolean z, String str, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FrequencySelectionRow(transferFrequencyRow, z, str, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecurringFrequencyUpsellComposable$lambda$0(RecurringFrequencyUpsellComposable recurringFrequencyUpsellComposable, ImmutableList immutableList, RecurringFrequencyUpsellViewState recurringFrequencyUpsellViewState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RecurringFrequencyUpsellComposable(recurringFrequencyUpsellComposable, immutableList, recurringFrequencyUpsellViewState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecurringFrequencyUpsellContent$lambda$12(RecurringFrequencyUpsellComposable recurringFrequencyUpsellComposable, ImmutableList immutableList, RecurringFrequencyUpsellViewState.Loaded loaded, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RecurringFrequencyUpsellContent(recurringFrequencyUpsellComposable, immutableList, loaded, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void RecurringFrequencyUpsellComposable(final RecurringFrequencyUpsellComposable callbacks, final ImmutableList<? extends RecurringFrequencyUpsellFragment.TransferFrequencyRow> rows, final RecurringFrequencyUpsellViewState viewState, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Composer composerStartRestartGroup = composer.startRestartGroup(372937958);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(rows) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 256 : 128;
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
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(372937958, i3, -1, "com.robinhood.android.transfers.ui.max.upsell.RecurringFrequencyUpsellComposable (RecurringFrequencyUpsellComposable.kt:49)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-66472335, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.upsell.RecurringFrequencyUpsellComposableKt.RecurringFrequencyUpsellComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-66472335, i5, -1, "com.robinhood.android.transfers.ui.max.upsell.RecurringFrequencyUpsellComposable.<anonymous> (RecurringFrequencyUpsellComposable.kt:51)");
                    }
                    if (viewState instanceof RecurringFrequencyUpsellViewState.Loaded) {
                        composer2.startReplaceGroup(-297333445);
                        RecurringFrequencyUpsellComposable2.RecurringFrequencyUpsellContent(callbacks, rows, (RecurringFrequencyUpsellViewState.Loaded) viewState, modifier, composer2, 0, 0);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-297101751);
                        Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, "loading");
                        final ImmutableList<RecurringFrequencyUpsellFragment.TransferFrequencyRow> immutableList = rows;
                        final Modifier modifier2 = modifier;
                        LocalShowPlaceholder.Loadable(true, modifierTestTag, null, ComposableLambda3.rememberComposableLambda(-37440603, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.ui.max.upsell.RecurringFrequencyUpsellComposableKt.RecurringFrequencyUpsellComposable.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i6) {
                                if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-37440603, i6, -1, "com.robinhood.android.transfers.ui.max.upsell.RecurringFrequencyUpsellComposable.<anonymous>.<anonymous> (RecurringFrequencyUpsellComposable.kt:63)");
                                }
                                RecurringFrequencyUpsellComposable2.RecurringFrequencyUpsellContent(new RecurringFrequencyUpsellComposable() { // from class: com.robinhood.android.transfers.ui.max.upsell.RecurringFrequencyUpsellComposableKt.RecurringFrequencyUpsellComposable.1.1.1
                                    @Override // com.robinhood.android.transfers.p271ui.max.upsell.RecurringFrequencyUpsellComposable
                                    public void onBackClicked() {
                                    }

                                    @Override // com.robinhood.android.transfers.p271ui.max.upsell.RecurringFrequencyUpsellComposable
                                    public void onContinueClicked(ApiCreateTransferRequest2 frequency) {
                                        Intrinsics.checkNotNullParameter(frequency, "frequency");
                                    }
                                }, immutableList, RecurringFrequencyUpsellViewState.INSTANCE.getMock(), modifier2, composer3, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 3126, 4);
                        composer2.endReplaceGroup();
                    }
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
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.max.upsell.RecurringFrequencyUpsellComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecurringFrequencyUpsellComposable2.RecurringFrequencyUpsellComposable$lambda$0(callbacks, rows, viewState, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0335  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RecurringFrequencyUpsellContent(RecurringFrequencyUpsellComposable recurringFrequencyUpsellComposable, final ImmutableList<? extends RecurringFrequencyUpsellFragment.TransferFrequencyRow> rows, final RecurringFrequencyUpsellViewState.Loaded viewState, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        SnapshotState snapshotState;
        int i4;
        BoxScopeInstance boxScopeInstance;
        Modifier modifier3;
        float f;
        int i5;
        Object obj;
        Modifier.Companion companion2;
        Composer composer2;
        boolean z;
        Object objRememberedValue2;
        final SnapshotState snapshotState2;
        Composer composer3;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        int i6;
        final RecurringFrequencyUpsellComposable recurringFrequencyUpsellComposable2;
        boolean z2;
        Object objRememberedValue3;
        boolean z3;
        Object objRememberedValue4;
        Composer composer4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final RecurringFrequencyUpsellComposable callbacks = recurringFrequencyUpsellComposable;
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(rows, "rows");
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Composer composerStartRestartGroup = composer.startRestartGroup(202719907);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(rows) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(viewState) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(202719907, i3, -1, "com.robinhood.android.transfers.ui.max.upsell.RecurringFrequencyUpsellContent (RecurringFrequencyUpsellComposable.kt:84)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(RecurringFrequencyUpsellFragment.TransferFrequencyRow.ONCE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                SnapshotState snapshotState3 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                boolean z4 = snapshotState3.getValue() == RecurringFrequencyUpsellFragment.TransferFrequencyRow.ONCE;
                Alignment.Companion companion3 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                Modifier.Companion companion5 = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                if (viewState.getDisplayDepositBoostMessage()) {
                    snapshotState = snapshotState3;
                    i4 = i3;
                    boxScopeInstance = boxScopeInstance2;
                    modifier3 = modifier5;
                    f = 0.0f;
                    i5 = 2;
                    obj = null;
                    companion2 = companion5;
                    composerStartRestartGroup.startReplaceGroup(-1002879173);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i8 = BentoTheme.$stable;
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i8).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                    String strStringResource = StringResources_androidKt.stringResource(C30065R.string.recurring_order_frequency_upsell_title, composerStartRestartGroup, 0);
                    TextStyle displayCapsuleSmall = bentoTheme.getTypography(composerStartRestartGroup, i8).getDisplayCapsuleSmall();
                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i8).m21425getFg0d7_KjU();
                    TextAlign.Companion companion6 = TextAlign.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM5144paddingVpY3zN4$default, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, TextAlign.m7912boximpl(companion6.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleSmall, composerStartRestartGroup, 0, 0, 8120);
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C30065R.string.recurring_order_frequency_upsell_subtitle, composerStartRestartGroup, 0), PaddingKt.m5143paddingVpY3zN4(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i8).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i8).m21593getSmallD9Ej5fM()), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i8).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion6.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i8).getTextM(), composerStartRestartGroup, 0, 0, 8120);
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1004754425);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i9 = BentoTheme.$stable;
                    Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(companion5, bentoTheme2.getSpacing(composerStartRestartGroup, i9).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                    String strStringResource2 = StringResources_androidKt.stringResource(C30065R.string.f4988x238ad3b4, composerStartRestartGroup, 0);
                    TextStyle displayCapsuleSmall2 = bentoTheme2.getTypography(composerStartRestartGroup, i9).getDisplayCapsuleSmall();
                    long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i9).m21425getFg0d7_KjU();
                    TextAlign.Companion companion7 = TextAlign.INSTANCE;
                    modifier3 = modifier5;
                    i4 = i3;
                    snapshotState = snapshotState3;
                    boxScopeInstance = boxScopeInstance2;
                    obj = null;
                    i5 = 2;
                    f = 0.0f;
                    companion2 = companion5;
                    BentoText2.m20747BentoText38GnDrw(strStringResource2, modifierM5144paddingVpY3zN4$default2, Color.m6701boximpl(jM21425getFg0d7_KjU2), null, null, null, TextAlign.m7912boximpl(companion7.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleSmall2, composerStartRestartGroup, 0, 0, 8120);
                    if (viewState.getSweepInterestRate() != null) {
                        composerStartRestartGroup.startReplaceGroup(-1004262455);
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C30065R.string.f4990x9494cdb5, new Object[]{Formats.getInterestRateFormatShort().format(viewState.getSweepInterestRate())}, composerStartRestartGroup, 0), PaddingKt.m5143paddingVpY3zN4(companion2, bentoTheme2.getSpacing(composerStartRestartGroup, i9).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i9).m21593getSmallD9Ej5fM()), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i9).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion7.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i9).getTextM(), composerStartRestartGroup, 0, 0, 8120);
                        composer2 = composerStartRestartGroup;
                        composer2.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1003535350);
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C30065R.string.f4989x2ec11f6a, composerStartRestartGroup, 0), PaddingKt.m5143paddingVpY3zN4(companion2, bentoTheme2.getSpacing(composerStartRestartGroup, i9).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i9).m21593getSmallD9Ej5fM()), Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i9).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion7.m7924getStarte0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i9).getTextM(), composerStartRestartGroup, 0, 0, 8120);
                        composer2 = composerStartRestartGroup;
                        composer2.endReplaceGroup();
                    }
                    composer2.endReplaceGroup();
                }
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Column5.weight$default(column6, companion2, 1.0f, false, 2, null), f, 1, obj);
                composer2.startReplaceGroup(-1633490746);
                z = (i4 & 112) != 32;
                objRememberedValue2 = composer2.rememberedValue();
                if (!z || objRememberedValue2 == companion.getEmpty()) {
                    snapshotState2 = snapshotState;
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.transfers.ui.max.upsell.RecurringFrequencyUpsellComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return RecurringFrequencyUpsellComposable2.m2547xf3348fb5(rows, snapshotState2, (LazyListScope) obj2);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                } else {
                    snapshotState2 = snapshotState;
                }
                composer2.endReplaceGroup();
                final SnapshotState snapshotState4 = snapshotState2;
                composer3 = composer2;
                LazyDslKt.LazyColumn(modifierFillMaxWidth$default2, null, null, false, null, null, null, false, null, (Function1) objRememberedValue2, composer3, 0, 510);
                composer3.endNode();
                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion2, f, 1, obj);
                BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                int i10 = BentoTheme.$stable;
                Modifier modifierAlign = boxScopeInstance.align(PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default3, 0.0f, 0.0f, 0.0f, bentoTheme3.getSpacing(composer3, i10).m21590getDefaultD9Ej5fM(), 7, null), companion3.getBottomCenter());
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer3, 0);
                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, modifierAlign);
                Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                if (composer3.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.useNode();
                } else {
                    composer3.createNode(constructor3);
                }
                composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer3);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme3.getSpacing(composer3, i10).m21592getMediumD9Ej5fM(), f, i5, obj), f, 1, obj);
                composer3.startReplaceGroup(728807257);
                String strStringResource3 = !z4 ? StringResources_androidKt.stringResource(((RecurringFrequencyUpsellFragment.TransferFrequencyRow) snapshotState4.getValue()).getExplaination(), composer3, 0) : "";
                composer3.endReplaceGroup();
                BentoText2.m20747BentoText38GnDrw(strStringResource3, modifierFillMaxWidth$default4, Color.m6701boximpl(bentoTheme3.getColors(composer3, i10).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composer3, i10).getTextS(), composer3, 0, 0, 8120);
                Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion2, f, 1, obj), bentoTheme3.getSpacing(composer3, i10).m21592getMediumD9Ej5fM(), bentoTheme3.getSpacing(composer3, i10).m21593getSmallD9Ej5fM());
                Screen.Name name = Screen.Name.RECURRING_DEPOSIT_UPSELL;
                Screen screen = new Screen(name, null, null, null, 14, null);
                UserInteractionEventData.Action action = UserInteractionEventData.Action.CONTINUE;
                Component.ComponentType componentType = Component.ComponentType.BUTTON;
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierM5143paddingVpY3zN4, new UserInteractionEventDescriptor(null, screen, action, null, new Component(componentType, "continue", null, 4, null), null, 41, null), true, false, false, true, false, null, 108, null);
                String strStringResource4 = StringResources_androidKt.stringResource(C11048R.string.general_action_review, composer3, 0);
                BentoButtons.Type type2 = BentoButtons.Type.Primary;
                composer3.startReplaceGroup(-1633490746);
                i6 = i4 & 14;
                if (i6 == 4) {
                    if ((i4 & 8) != 0) {
                        recurringFrequencyUpsellComposable2 = recurringFrequencyUpsellComposable;
                        if (composer3.changedInstance(recurringFrequencyUpsellComposable2)) {
                        }
                        objRememberedValue3 = composer3.rememberedValue();
                        if (!z2 || objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.transfers.ui.max.upsell.RecurringFrequencyUpsellComposableKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return RecurringFrequencyUpsellComposable2.m2545xfc472ddd(recurringFrequencyUpsellComposable2, snapshotState4);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue3);
                        }
                        composer3.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8(Haptics.hapticClick((Function0) objRememberedValue3, composer3, 0), strStringResource4, modifierAutoLogEvents$default, null, type2, z4, false, null, null, null, null, false, null, composer3, 24576, 0, 8136);
                        Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, f, 1, obj), bentoTheme3.getSpacing(composer3, i10).m21592getMediumD9Ej5fM(), f, 2, obj), new UserInteractionEventDescriptor(null, new Screen(name, null, null, null, 14, null), UserInteractionEventData.Action.DISMISS, null, new Component(componentType, "Maybe later", null, 4, null), null, 41, null), true, false, false, true, false, null, 108, null);
                        String strStringResource5 = StringResources_androidKt.stringResource(C11048R.string.general_label_maybe_later, composer3, 0);
                        BentoButtons.Type type3 = BentoButtons.Type.Secondary;
                        composer3.startReplaceGroup(5004770);
                        if (i6 == 4) {
                            callbacks = recurringFrequencyUpsellComposable;
                            if ((i4 & 8) == 0 || !composer3.changedInstance(callbacks)) {
                                z3 = false;
                            }
                            objRememberedValue4 = composer3.rememberedValue();
                            if (z3 || objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.transfers.ui.max.upsell.RecurringFrequencyUpsellComposableKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return RecurringFrequencyUpsellComposable2.m2546xe4da101d(callbacks);
                                    }
                                };
                                composer3.updateRememberedValue(objRememberedValue4);
                            }
                            composer3.endReplaceGroup();
                            BentoButtonKt.m20586BentoButtonEikTQX8(Haptics.hapticClick((Function0) objRememberedValue4, composer3, 0), strStringResource5, modifierAutoLogEvents$default2, null, type3, true, false, null, null, null, null, false, null, composer3, 221184, 0, 8136);
                            composer4 = composer3;
                            composer4.endNode();
                            composer4.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                        } else {
                            callbacks = recurringFrequencyUpsellComposable;
                        }
                        z3 = true;
                        objRememberedValue4 = composer3.rememberedValue();
                        if (z3) {
                            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.transfers.ui.max.upsell.RecurringFrequencyUpsellComposableKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return RecurringFrequencyUpsellComposable2.m2546xe4da101d(callbacks);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue4);
                            composer3.endReplaceGroup();
                            BentoButtonKt.m20586BentoButtonEikTQX8(Haptics.hapticClick((Function0) objRememberedValue4, composer3, 0), strStringResource5, modifierAutoLogEvents$default2, null, type3, true, false, null, null, null, null, false, null, composer3, 221184, 0, 8136);
                            composer4 = composer3;
                            composer4.endNode();
                            composer4.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier3;
                        }
                    } else {
                        recurringFrequencyUpsellComposable2 = recurringFrequencyUpsellComposable;
                    }
                    z2 = false;
                    objRememberedValue3 = composer3.rememberedValue();
                    if (!z2) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.transfers.ui.max.upsell.RecurringFrequencyUpsellComposableKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return RecurringFrequencyUpsellComposable2.m2545xfc472ddd(recurringFrequencyUpsellComposable2, snapshotState4);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue3);
                        composer3.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8(Haptics.hapticClick((Function0) objRememberedValue3, composer3, 0), strStringResource4, modifierAutoLogEvents$default, null, type2, z4, false, null, null, null, null, false, null, composer3, 24576, 0, 8136);
                        Modifier modifierAutoLogEvents$default22 = ModifiersKt.autoLogEvents$default(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, f, 1, obj), bentoTheme3.getSpacing(composer3, i10).m21592getMediumD9Ej5fM(), f, 2, obj), new UserInteractionEventDescriptor(null, new Screen(name, null, null, null, 14, null), UserInteractionEventData.Action.DISMISS, null, new Component(componentType, "Maybe later", null, 4, null), null, 41, null), true, false, false, true, false, null, 108, null);
                        String strStringResource52 = StringResources_androidKt.stringResource(C11048R.string.general_label_maybe_later, composer3, 0);
                        BentoButtons.Type type32 = BentoButtons.Type.Secondary;
                        composer3.startReplaceGroup(5004770);
                        if (i6 == 4) {
                        }
                        z3 = true;
                        objRememberedValue4 = composer3.rememberedValue();
                        if (z3) {
                        }
                    }
                } else {
                    recurringFrequencyUpsellComposable2 = recurringFrequencyUpsellComposable;
                }
                z2 = true;
                objRememberedValue3 = composer3.rememberedValue();
                if (!z2) {
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer4 = composerStartRestartGroup;
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.max.upsell.RecurringFrequencyUpsellComposableKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return RecurringFrequencyUpsellComposable2.RecurringFrequencyUpsellContent$lambda$12(callbacks, rows, viewState, modifier4, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i7 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            SnapshotState snapshotState32 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            if (snapshotState32.getValue() == RecurringFrequencyUpsellFragment.TransferFrequencyRow.ONCE) {
            }
            Alignment.Companion companion32 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion32.getTopStart(), false);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
            ComposeUiNode.Companion companion42 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor4 = companion42.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion42.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion42.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion42.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion42.getSetModifier());
                BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                Modifier.Companion companion52 = Modifier.INSTANCE;
                Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(companion52, 0.0f, 1, null);
                Arrangement arrangement2 = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion32.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default5);
                Function0<ComposeUiNode> constructor22 = companion42.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy3, companion42.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion42.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion42.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion42.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    if (viewState.getDisplayDepositBoostMessage()) {
                    }
                    Modifier modifierFillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Column5.weight$default(column62, companion2, 1.0f, false, 2, null), f, 1, obj);
                    composer2.startReplaceGroup(-1633490746);
                    if ((i4 & 112) != 32) {
                    }
                    objRememberedValue2 = composer2.rememberedValue();
                    if (z) {
                        snapshotState2 = snapshotState;
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.transfers.ui.max.upsell.RecurringFrequencyUpsellComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return RecurringFrequencyUpsellComposable2.m2547xf3348fb5(rows, snapshotState2, (LazyListScope) obj2);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                        composer2.endReplaceGroup();
                        final SnapshotState snapshotState42 = snapshotState2;
                        composer3 = composer2;
                        LazyDslKt.LazyColumn(modifierFillMaxWidth$default22, null, null, false, null, null, null, false, null, (Function1) objRememberedValue2, composer3, 0, 510);
                        composer3.endNode();
                        Modifier modifierFillMaxWidth$default32 = SizeKt.fillMaxWidth$default(companion2, f, 1, obj);
                        BentoTheme bentoTheme32 = BentoTheme.INSTANCE;
                        int i102 = BentoTheme.$stable;
                        Modifier modifierAlign2 = boxScopeInstance.align(PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default32, 0.0f, 0.0f, 0.0f, bentoTheme32.getSpacing(composer3, i102).m21590getDefaultD9Ej5fM(), 7, null), companion32.getBottomCenter());
                        MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion32.getStart(), composer3, 0);
                        currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap32 = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composer3, modifierAlign2);
                        Function0<ComposeUiNode> constructor32 = companion42.getConstructor();
                        if (composer3.getApplier() == null) {
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                        }
                        composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy22, companion42.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion42.getSetResolvedCompositionLocals());
                        setCompositeKeyHash3 = companion42.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl3.getInserting()) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion42.getSetModifier());
                            Modifier modifierFillMaxWidth$default42 = SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme32.getSpacing(composer3, i102).m21592getMediumD9Ej5fM(), f, i5, obj), f, 1, obj);
                            composer3.startReplaceGroup(728807257);
                            if (!z4) {
                            }
                            composer3.endReplaceGroup();
                            BentoText2.m20747BentoText38GnDrw(strStringResource3, modifierFillMaxWidth$default42, Color.m6701boximpl(bentoTheme32.getColors(composer3, i102).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme32.getTypography(composer3, i102).getTextS(), composer3, 0, 0, 8120);
                            Modifier modifierM5143paddingVpY3zN42 = PaddingKt.m5143paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion2, f, 1, obj), bentoTheme32.getSpacing(composer3, i102).m21592getMediumD9Ej5fM(), bentoTheme32.getSpacing(composer3, i102).m21593getSmallD9Ej5fM());
                            Screen.Name name2 = Screen.Name.RECURRING_DEPOSIT_UPSELL;
                            Screen screen2 = new Screen(name2, null, null, null, 14, null);
                            UserInteractionEventData.Action action2 = UserInteractionEventData.Action.CONTINUE;
                            Component.ComponentType componentType2 = Component.ComponentType.BUTTON;
                            Modifier modifierAutoLogEvents$default3 = ModifiersKt.autoLogEvents$default(modifierM5143paddingVpY3zN42, new UserInteractionEventDescriptor(null, screen2, action2, null, new Component(componentType2, "continue", null, 4, null), null, 41, null), true, false, false, true, false, null, 108, null);
                            String strStringResource42 = StringResources_androidKt.stringResource(C11048R.string.general_action_review, composer3, 0);
                            BentoButtons.Type type22 = BentoButtons.Type.Primary;
                            composer3.startReplaceGroup(-1633490746);
                            i6 = i4 & 14;
                            if (i6 == 4) {
                            }
                            z2 = true;
                            objRememberedValue3 = composer3.rememberedValue();
                            if (!z2) {
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RecurringFrequencyUpsellContent$lambda$11$lambda$10$lambda$7$lambda$6 */
    public static final Unit m2545xfc472ddd(RecurringFrequencyUpsellComposable recurringFrequencyUpsellComposable, SnapshotState snapshotState) {
        recurringFrequencyUpsellComposable.onContinueClicked(((RecurringFrequencyUpsellFragment.TransferFrequencyRow) snapshotState.getValue()).getFrequency());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RecurringFrequencyUpsellContent$lambda$11$lambda$10$lambda$9$lambda$8 */
    public static final Unit m2546xe4da101d(RecurringFrequencyUpsellComposable recurringFrequencyUpsellComposable) {
        recurringFrequencyUpsellComposable.onBackClicked();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FrequencySelectionRow(final RecurringFrequencyUpsellFragment.TransferFrequencyRow frequency, final boolean z, final String secondaryText, final Function1<? super RecurringFrequencyUpsellFragment.TransferFrequencyRow, Unit> onFrequencyClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        boolean z2;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
        Intrinsics.checkNotNullParameter(onFrequencyClicked, "onFrequencyClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(398375314);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(frequency.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(secondaryText) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onFrequencyClicked) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(398375314, i3, -1, "com.robinhood.android.transfers.ui.max.upsell.FrequencySelectionRow (RecurringFrequencyUpsellComposable.kt:251)");
                    }
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier4, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.RECURRING_DEPOSIT_UPSELL, null, null, null, 14, null), UserInteractionEventData.Action.SELECT_FREQUENCY, null, new Component(Component.ComponentType.RADIO_BUTTON, "frequency-" + StringResources_androidKt.stringResource(frequency.getTitle(), composerStartRestartGroup, 0), null, 4, null), null, 41, null), false, false, false, true, false, null, 108, null);
                    Modifier modifier5 = modifier4;
                    BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
                    String strStringResource = StringResources_androidKt.stringResource(frequency.getTitle(), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    z2 = ((i3 & 7168) != 2048) | ((i3 & 14) == 4);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.ui.max.upsell.RecurringFrequencyUpsellComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return RecurringFrequencyUpsellComposable2.FrequencySelectionRow$lambda$14$lambda$13(onFrequencyClicked, frequency);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    int i5 = i3 << 6;
                    BentoSelectionRow2.BentoSelectionRow(modifierAutoLogEvents$default, type2, strStringResource, z, secondaryText, false, null, false, false, false, Haptics.hapticClick((Function0) objRememberedValue, composerStartRestartGroup, 0), composerStartRestartGroup, (i5 & 7168) | 48 | (i5 & 57344), 0, 992);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.ui.max.upsell.RecurringFrequencyUpsellComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return RecurringFrequencyUpsellComposable2.FrequencySelectionRow$lambda$15(frequency, z, secondaryText, onFrequencyClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            modifier2 = modifier;
            if ((i3 & 9363) != 9362) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(modifier4, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.RECURRING_DEPOSIT_UPSELL, null, null, null, 14, null), UserInteractionEventData.Action.SELECT_FREQUENCY, null, new Component(Component.ComponentType.RADIO_BUTTON, "frequency-" + StringResources_androidKt.stringResource(frequency.getTitle(), composerStartRestartGroup, 0), null, 4, null), null, 41, null), false, false, false, true, false, null, 108, null);
                Modifier modifier52 = modifier4;
                BentoSelectionRowState.Type type22 = BentoSelectionRowState.Type.RadioButton;
                String strStringResource2 = StringResources_androidKt.stringResource(frequency.getTitle(), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                z2 = ((i3 & 7168) != 2048) | ((i3 & 14) == 4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z2) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.ui.max.upsell.RecurringFrequencyUpsellComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return RecurringFrequencyUpsellComposable2.FrequencySelectionRow$lambda$14$lambda$13(onFrequencyClicked, frequency);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    int i52 = i3 << 6;
                    BentoSelectionRow2.BentoSelectionRow(modifierAutoLogEvents$default2, type22, strStringResource2, z, secondaryText, false, null, false, false, false, Haptics.hapticClick((Function0) objRememberedValue, composerStartRestartGroup, 0), composerStartRestartGroup, (i52 & 7168) | 48 | (i52 & 57344), 0, 992);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FrequencySelectionRow$lambda$14$lambda$13(Function1 function1, RecurringFrequencyUpsellFragment.TransferFrequencyRow transferFrequencyRow) {
        function1.invoke(transferFrequencyRow);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RecurringFrequencyUpsellContent$lambda$11$lambda$5$lambda$4$lambda$3 */
    public static final Unit m2547xf3348fb5(ImmutableList immutableList, SnapshotState snapshotState, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        Iterator<E> it = immutableList.iterator();
        while (it.hasNext()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-282926342, true, new RecurringFrequencyUpsellComposable3((RecurringFrequencyUpsellFragment.TransferFrequencyRow) it.next(), snapshotState)), 3, null);
        }
        return Unit.INSTANCE;
    }
}
