package com.robinhood.android.slip.onboarding.agreements.previouslysigned;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.ListSaver;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.Saver5;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.compose.bento.component.BentoPogKt;
import com.robinhood.compose.bento.component.BentoPogSize;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.models.api.ApiPreviouslySignedAgreements;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SlipPreviouslySignedAgreementsContent.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a\r\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0006\u001a\u0015\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a\u001f\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r\u001a$\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\u0010\u0012\u0004\u0012\u00020\u00120\u000f\"\b\b\u0000\u0010\u0011*\u00020\u0012H\u0002\u001a.\u0010\u0013\u001a\u00020\u0001*\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u0018\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00190\u0018¨\u0006\u001a"}, m3636d2 = {"Content", "", "previouslySignedAgreements", "Lcom/robinhood/models/api/ApiPreviouslySignedAgreements;", "(Lcom/robinhood/models/api/ApiPreviouslySignedAgreements;Landroidx/compose/runtime/Composer;I)V", "LoadingState", "(Landroidx/compose/runtime/Composer;I)V", "LoadedState", "SignedAgreementHeader", "title", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "snapshotStateListSaver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "T", "", "expandableAgreements", "Landroidx/compose/foundation/lazy/LazyListScope;", "expandDefault", "", "agreementsRow", "", "Lkotlin/Pair;", "feature-slip_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.slip.onboarding.agreements.previouslysigned.SlipPreviouslySignedAgreementsContentKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class SlipPreviouslySignedAgreementsContent3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$0(ApiPreviouslySignedAgreements apiPreviouslySignedAgreements, int i, Composer composer, int i2) {
        Content(apiPreviouslySignedAgreements, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedState$lambda$5(ApiPreviouslySignedAgreements apiPreviouslySignedAgreements, int i, Composer composer, int i2) {
        LoadedState(apiPreviouslySignedAgreements, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingState$lambda$1(int i, Composer composer, int i2) {
        LoadingState(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SignedAgreementHeader$lambda$7(String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SignedAgreementHeader(str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void Content(final ApiPreviouslySignedAgreements apiPreviouslySignedAgreements, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1301156940);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(apiPreviouslySignedAgreements) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1301156940, i2, -1, "com.robinhood.android.slip.onboarding.agreements.previouslysigned.Content (SlipPreviouslySignedAgreementsContent.kt:39)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-136467743, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.slip.onboarding.agreements.previouslysigned.SlipPreviouslySignedAgreementsContentKt.Content.1
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
                        ComposerKt.traceEventStart(-136467743, i3, -1, "com.robinhood.android.slip.onboarding.agreements.previouslysigned.Content.<anonymous> (SlipPreviouslySignedAgreementsContent.kt:41)");
                    }
                    if (apiPreviouslySignedAgreements == null) {
                        composer2.startReplaceGroup(1823548379);
                        SlipPreviouslySignedAgreementsContent3.LoadingState(composer2, 0);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(1823592802);
                        SlipPreviouslySignedAgreementsContent3.LoadedState(apiPreviouslySignedAgreements, composer2, 0);
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
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.slip.onboarding.agreements.previouslysigned.SlipPreviouslySignedAgreementsContentKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SlipPreviouslySignedAgreementsContent3.Content$lambda$0(apiPreviouslySignedAgreements, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void LoadingState(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1099295475);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1099295475, i, -1, "com.robinhood.android.slip.onboarding.agreements.previouslysigned.LoadingState (SlipPreviouslySignedAgreementsContent.kt:50)");
            }
            LocalShowPlaceholder.Loadable(true, WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null)), null, SlipPreviouslySignedAgreementsContent.INSTANCE.m18960getLambda$917780099$feature_slip_externalDebug(), composerStartRestartGroup, 3078, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.slip.onboarding.agreements.previouslysigned.SlipPreviouslySignedAgreementsContentKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SlipPreviouslySignedAgreementsContent3.LoadingState$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void LoadedState(final ApiPreviouslySignedAgreements previouslySignedAgreements, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(previouslySignedAgreements, "previouslySignedAgreements");
        Composer composerStartRestartGroup = composer.startRestartGroup(914033881);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(previouslySignedAgreements) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(914033881, i2, -1, "com.robinhood.android.slip.onboarding.agreements.previouslysigned.LoadedState (SlipPreviouslySignedAgreementsContent.kt:71)");
            }
            Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null));
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(previouslySignedAgreements);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.slip.onboarding.agreements.previouslysigned.SlipPreviouslySignedAgreementsContentKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SlipPreviouslySignedAgreementsContent3.LoadedState$lambda$4$lambda$3(previouslySignedAgreements, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierNavigationBarsPadding, null, null, false, null, centerHorizontally, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 196608, 478);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.slip.onboarding.agreements.previouslysigned.SlipPreviouslySignedAgreementsContentKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SlipPreviouslySignedAgreementsContent3.LoadedState$lambda$5(previouslySignedAgreements, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedState$lambda$4$lambda$3(final ApiPreviouslySignedAgreements apiPreviouslySignedAgreements, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.stickyHeader$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1974358760, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.slip.onboarding.agreements.previouslysigned.SlipPreviouslySignedAgreementsContentKt$LoadedState$1$1$1
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope stickyHeader, int i, Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(stickyHeader, "$this$stickyHeader");
                if ((i2 & EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) == 128 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1974358760, i2, -1, "com.robinhood.android.slip.onboarding.agreements.previouslysigned.LoadedState.<anonymous>.<anonymous>.<anonymous> (SlipPreviouslySignedAgreementsContent.kt:79)");
                }
                SlipPreviouslySignedAgreementsContent3.SignedAgreementHeader(apiPreviouslySignedAgreements.getTitle(), null, composer, 0, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        List<ApiPreviouslySignedAgreements.AgreementRow> rows = apiPreviouslySignedAgreements.getRows();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(rows, 10));
        for (ApiPreviouslySignedAgreements.AgreementRow agreementRow : rows) {
            arrayList.add(Tuples4.m3642to(agreementRow.getTitle(), agreementRow.getContent_markdown()));
        }
        expandableAgreements(LazyColumn, true, arrayList);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SignedAgreementHeader(final String title, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Composer composerStartRestartGroup = composer.startRestartGroup(827111419);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changed(title) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i3;
            if ((i4 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(827111419, i4, -1, "com.robinhood.android.slip.onboarding.agreements.previouslysigned.SignedAgreementHeader (SlipPreviouslySignedAgreementsContent.kt:86)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifier4 = modifier3;
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(modifier3, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 7, null), 0.0f, 1, null), bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU(), null, 2, null);
                Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
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
                BentoPogKt.m20684BentoPictogramPogRhg8lNc(C20690R.drawable.pict_mono_rds_documents, column6.align(PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), companion.getCenterHorizontally()), false, BentoPogSize.Hero, null, null, null, composerStartRestartGroup, 3072, 116);
                Modifier modifierAlign = column6.align(PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), companion.getCenterHorizontally());
                TextStyle textL = bentoTheme.getTypography(composerStartRestartGroup, i6).getTextL();
                composerStartRestartGroup = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(title, modifierAlign, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, textL, composerStartRestartGroup, (i4 & 14) | 24576, 0, 8168);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.slip.onboarding.agreements.previouslysigned.SlipPreviouslySignedAgreementsContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SlipPreviouslySignedAgreementsContent3.SignedAgreementHeader$lambda$7(title, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 19) == 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            Modifier modifier42 = modifier3;
            Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(modifier3, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), 7, null), 0.0f, 1, null), bentoTheme2.getColors(composerStartRestartGroup, i62).m21371getBg0d7_KjU(), null, 2, null);
            Arrangement.Vertical top2 = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(top2, companion4.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default2);
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
                Modifier.Companion companion32 = Modifier.INSTANCE;
                BentoPogKt.m20684BentoPictogramPogRhg8lNc(C20690R.drawable.pict_mono_rds_documents, column62.align(PaddingKt.m5146paddingqDBjuR0$default(companion32, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), companion4.getCenterHorizontally()), false, BentoPogSize.Hero, null, null, null, composerStartRestartGroup, 3072, 116);
                Modifier modifierAlign2 = column62.align(PaddingKt.m5146paddingqDBjuR0$default(companion32, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), companion4.getCenterHorizontally());
                TextStyle textL2 = bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextL();
                composerStartRestartGroup = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(title, modifierAlign2, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, textL2, composerStartRestartGroup, (i4 & 14) | 24576, 0, 8168);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Saver<SnapshotStateList<T>, Object> snapshotStateListSaver() {
        return ListSaver.listSaver(new Function2() { // from class: com.robinhood.android.slip.onboarding.agreements.previouslysigned.SlipPreviouslySignedAgreementsContentKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SlipPreviouslySignedAgreementsContent3.snapshotStateListSaver$lambda$8((Saver5) obj, (SnapshotStateList) obj2);
            }
        }, new Function1() { // from class: com.robinhood.android.slip.onboarding.agreements.previouslysigned.SlipPreviouslySignedAgreementsContentKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SlipPreviouslySignedAgreementsContent3.snapshotStateListSaver$lambda$9((List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List snapshotStateListSaver$lambda$8(Saver5 listSaver, SnapshotStateList stateList) {
        Intrinsics.checkNotNullParameter(listSaver, "$this$listSaver");
        Intrinsics.checkNotNullParameter(stateList, "stateList");
        return stateList.toList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotStateList snapshotStateListSaver$lambda$9(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return SnapshotStateKt.toMutableStateList(it);
    }

    public static /* synthetic */ void expandableAgreements$default(LazyListScope lazyListScope, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        expandableAgreements(lazyListScope, z, list);
    }

    public static final void expandableAgreements(LazyListScope lazyListScope, boolean z, List<Tuples2<String, String>> agreementsRow) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(agreementsRow, "agreementsRow");
        List<Tuples2<String, String>> list = agreementsRow;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Tuples2 tuples2 = (Tuples2) obj;
            LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-489831757, true, new SlipPreviouslySignedAgreementsContent5(agreementsRow, z, i, (String) tuples2.component1(), (String) tuples2.component2())), 3, null);
            arrayList.add(Unit.INSTANCE);
            i = i2;
        }
    }
}
