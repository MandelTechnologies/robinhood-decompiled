package com.robinhood.android.acatsin.availabledestinations;

import android.net.Uri;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material.CardKt;
import androidx.compose.material.RadioButtonColors;
import androidx.compose.material.RadioButtonDefaults;
import androidx.compose.material.RadioButtonKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.unit.C2002Dp;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.acatsin.availabledestinations.AcatsDestination;
import com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsComposable;
import com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsViewState;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoRichText;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoPogKt;
import com.robinhood.compose.bento.component.BentoPogSize;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.common.HeaderButtonBarScreenLayout6;
import com.robinhood.models.acats.p299db.bonfire.AvailableAccount;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.singular.sdk.internal.Constants;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AcatsInAvailableDestinationsComposable.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0001¢\u0006\u0002\u0010\t\u001a/\u0010\n\u001a\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\u000e\u001a)\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00062\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013¨\u0006\u0014²\u0006\f\u0010\u0015\u001a\u0004\u0018\u00010\u0006X\u008a\u008e\u0002"}, m3636d2 = {"AvailableDestinationsReadyScreen", "", "viewState", "Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsViewState$Ready;", "onOptionSelected", "Lkotlin/Function1;", "Lcom/robinhood/android/acatsin/availabledestinations/AcatsDestination;", "onContinue", "Lkotlin/Function0;", "(Lcom/robinhood/android/acatsin/availabledestinations/AcatsInAvailableDestinationsViewState$Ready;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "AcatsDestinationList", "destinations", "Lkotlinx/collections/immutable/ImmutableList;", "onDestinationSelected", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "DestinationCard", "destination", "(Lcom/robinhood/android/acatsin/availabledestinations/AcatsDestination;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "AvailableDestinationsReadyScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-acats-ui_externalDebug", "selectedDestination"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsComposableKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AcatsInAvailableDestinationsComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AcatsDestinationList$lambda$3(ImmutableList immutableList, Function1 function1, int i, Composer composer, int i2) {
        AcatsDestinationList(immutableList, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AvailableDestinationsReadyScreen$lambda$0(AcatsInAvailableDestinationsViewState.Ready ready, Function1 function1, Function0 function0, int i, Composer composer, int i2) {
        AvailableDestinationsReadyScreen(ready, function1, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AvailableDestinationsReadyScreenPreview$lambda$10(int i, Composer composer, int i2) {
        AvailableDestinationsReadyScreenPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DestinationCard$lambda$6(AcatsDestination acatsDestination, Function1 function1, int i, Composer composer, int i2) {
        DestinationCard(acatsDestination, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void AvailableDestinationsReadyScreen(final AcatsInAvailableDestinationsViewState.Ready viewState, final Function1<? super AcatsDestination, Unit> onOptionSelected, final Function0<Unit> onContinue, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onOptionSelected, "onOptionSelected");
        Intrinsics.checkNotNullParameter(onContinue, "onContinue");
        Composer composerStartRestartGroup = composer.startRestartGroup(457590452);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onOptionSelected) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onContinue) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(457590452, i2, -1, "com.robinhood.android.acatsin.availabledestinations.AvailableDestinationsReadyScreen (AcatsInAvailableDestinationsComposable.kt:50)");
            }
            HeaderButtonBarScreenLayout6.HeaderButtonBarScreenLayout(Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), ComposableLambda3.rememberComposableLambda(630527158, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsComposableKt.AvailableDestinationsReadyScreen.1
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
                        ComposerKt.traceEventStart(630527158, i3, -1, "com.robinhood.android.acatsin.availabledestinations.AvailableDestinationsReadyScreen.<anonymous> (AcatsInAvailableDestinationsComposable.kt:53)");
                    }
                    List<UIComponent<GenericAction>> headerContents = viewState.getHeaderContents();
                    SduiActionHandler sduiActionHandlerCurrentActionHandler = SduiActionHandler3.currentActionHandler(composer2, 0);
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    composer2.startReplaceGroup(1510558093);
                    HorizontalPadding horizontalPadding = HorizontalPadding.Default;
                    ImmutableList3 persistentList = extensions2.toPersistentList(headerContents);
                    composer2.startReplaceGroup(-1772220517);
                    SduiColumns.SduiColumn(persistentList, GenericAction.class, modifierM5146paddingqDBjuR0$default, null, sduiActionHandlerCurrentActionHandler, horizontalPadding, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer2, 100663296, 0);
                    composer2.endReplaceGroup();
                    composer2.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1949289442, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsComposableKt.AvailableDestinationsReadyScreen.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                    invoke(bentoButtonBar3, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoButtonBar3 HeaderButtonBarScreenLayout, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(HeaderButtonBarScreenLayout, "$this$HeaderButtonBarScreenLayout");
                    if ((i3 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1949289442, i3, -1, "com.robinhood.android.acatsin.availabledestinations.AvailableDestinationsReadyScreen.<anonymous> (AcatsInAvailableDestinationsComposable.kt:61)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer2, i4).m21590getDefaultD9Ej5fM()), composer2, 0);
                    List<UIComponent<GenericAction>> stickyFooterContents = viewState.getStickyFooterContents();
                    SduiActionHandler sduiActionHandlerCurrentActionHandler = SduiActionHandler3.currentActionHandler(composer2, 0);
                    composer2.startReplaceGroup(1510558093);
                    HorizontalPadding horizontalPadding = HorizontalPadding.Default;
                    ImmutableList3 persistentList = extensions2.toPersistentList(stickyFooterContents);
                    composer2.startReplaceGroup(-1772220517);
                    SduiColumns.SduiColumn(persistentList, GenericAction.class, companion, null, sduiActionHandlerCurrentActionHandler, horizontalPadding, Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), false, composer2, 100663296, 0);
                    composer2.endReplaceGroup();
                    composer2.endReplaceGroup();
                    BentoButtonBar2.BentoButtonBar(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer2, i4).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, false, null, null, onContinue, StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer2, 0), false, null, viewState.isContinueEnabled(), null, null, false, null, false, composer2, 0, 0, 64318);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-505417288, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsComposableKt.AvailableDestinationsReadyScreen.3
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
                        ComposerKt.traceEventStart(-505417288, i3, -1, "com.robinhood.android.acatsin.availabledestinations.AvailableDestinationsReadyScreen.<anonymous> (AcatsInAvailableDestinationsComposable.kt:76)");
                    }
                    AcatsInAvailableDestinationsComposable.AcatsDestinationList(viewState.getAcatsDestinations(), onOptionSelected, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AcatsInAvailableDestinationsComposable.AvailableDestinationsReadyScreen$lambda$0(viewState, onOptionSelected, onContinue, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AcatsDestination AvailableDestinationsReadyScreenPreview$lambda$8(SnapshotState<AcatsDestination> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AcatsDestinationList(final ImmutableList<? extends AcatsDestination> immutableList, final Function1<? super AcatsDestination, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(119384946);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(immutableList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(119384946, i2, -1, "com.robinhood.android.acatsin.availabledestinations.AcatsDestinationList (AcatsInAvailableDestinationsComposable.kt:87)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM()), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
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
            composerStartRestartGroup.startReplaceGroup(-290112837);
            Iterator<? extends AcatsDestination> it = immutableList.iterator();
            while (it.hasNext()) {
                DestinationCard(it.next(), function1, composerStartRestartGroup, i2 & 112);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AcatsInAvailableDestinationsComposable.AcatsDestinationList$lambda$3(immutableList, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: AcatsInAvailableDestinationsComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsComposableKt$DestinationCard$2 */
    static final class C77992 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ AcatsDestination $destination;
        final /* synthetic */ Function1<AcatsDestination, Unit> $onDestinationSelected;

        /* JADX WARN: Multi-variable type inference failed */
        C77992(AcatsDestination acatsDestination, Function1<? super AcatsDestination, Unit> function1) {
            this.$destination = acatsDestination;
            this.$onDestinationSelected = function1;
        }

        public final void invoke(Composer composer, int i) {
            Modifier.Companion companion;
            AcatsDestination acatsDestination;
            BentoTheme bentoTheme;
            int i2;
            Function1<AcatsDestination, Unit> function1;
            Composer composer2;
            BentoTheme bentoTheme2;
            AcatsDestination acatsDestination2;
            Function1<AcatsDestination, Unit> function12;
            Modifier.Companion companion2;
            int i3;
            Composer composer3;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1526146144, i, -1, "com.robinhood.android.acatsin.availabledestinations.DestinationCard.<anonymous> (AcatsInAvailableDestinationsComposable.kt:117)");
            }
            Modifier.Companion companion3 = Modifier.INSTANCE;
            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(companion3, bentoTheme3.getSpacing(composer, i4).m21590getDefaultD9Ej5fM());
            AcatsDestination acatsDestination3 = this.$destination;
            Function1<AcatsDestination, Unit> function13 = this.$onDestinationSelected;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion4.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5142padding3ABfNKs);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion5.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion4.getCenterVertically(), composer, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, companion3);
            Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            ServerToBentoAssetMapper3 serverToBentoAssetMapper3FromServerValue = ServerToBentoAssetMapper3.INSTANCE.fromServerValue(acatsDestination3.getPictogram());
            composer.startReplaceGroup(-1858102194);
            if (serverToBentoAssetMapper3FromServerValue == null) {
                bentoTheme = bentoTheme3;
                i2 = i4;
                acatsDestination = acatsDestination3;
                function1 = function13;
                companion = companion3;
                composer2 = composer;
            } else {
                companion = companion3;
                acatsDestination = acatsDestination3;
                bentoTheme = bentoTheme3;
                i2 = i4;
                function1 = function13;
                BentoPogKt.m20684BentoPictogramPogRhg8lNc(serverToBentoAssetMapper3FromServerValue.getResourceId(), TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, 0.0f, bentoTheme3.getSpacing(composer, i4).m21593getSmallD9Ej5fM(), 0.0f, 11, null), acatsDestination3.getPictogram()), false, BentoPogSize.Number, null, null, null, composer, 3072, 116);
                composer2 = composer;
                Unit unit = Unit.INSTANCE;
            }
            composer2.endReplaceGroup();
            if (acatsDestination instanceof AcatsDestination.Deeplink) {
                composer2.startReplaceGroup(-1766176493);
                Modifier.Companion companion6 = companion;
                function12 = function1;
                acatsDestination2 = acatsDestination;
                bentoTheme2 = bentoTheme;
                BentoRichText.m15949BentoRichText0sCZWFg(((AcatsDestination.Deeplink) acatsDestination).getRichTextTitle(), Row5.weight$default(row6, companion6, 1.0f, false, 2, null), bentoTheme.getTypography(composer2, i2).getDisplayCapsuleSmall(), 0L, 0L, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (Function1<? super Uri, Unit>) null, composer, 0, 1016);
                composer.endReplaceGroup();
                composer3 = composer;
                companion2 = companion6;
                i3 = i2;
            } else {
                bentoTheme2 = bentoTheme;
                int i5 = i2;
                acatsDestination2 = acatsDestination;
                function12 = function1;
                Composer composer4 = composer2;
                Modifier.Companion companion7 = companion;
                composer4.startReplaceGroup(-1765908033);
                companion2 = companion7;
                i3 = i5;
                BentoText2.m20747BentoText38GnDrw(acatsDestination2.getTitle(), Row5.weight$default(row6, companion7, 1.0f, false, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer4, i5).getDisplayCapsuleSmall(), composer, 0, 0, 8188);
                composer3 = composer;
                composer3.endReplaceGroup();
            }
            boolean isSelected = acatsDestination2.getIsSelected();
            int i6 = i3;
            RadioButtonColors radioButtonColorsM5619colorsRGew2ao = RadioButtonDefaults.INSTANCE.m5619colorsRGew2ao(bentoTheme2.getColors(composer3, i6).m21425getFg0d7_KjU(), bentoTheme2.getColors(composer3, i6).m21427getFg30d7_KjU(), bentoTheme2.getColors(composer3, i6).m21373getBg30d7_KjU(), composer3, RadioButtonDefaults.$stable << 9, 0);
            composer3.startReplaceGroup(-1633490746);
            final Function1<AcatsDestination, Unit> function14 = function12;
            final AcatsDestination acatsDestination4 = acatsDestination2;
            boolean zChanged = composer3.changed(function14) | composer3.changedInstance(acatsDestination4);
            Object objRememberedValue = composer3.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsComposableKt$DestinationCard$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AcatsInAvailableDestinationsComposable.C77992.invoke$lambda$4$lambda$3$lambda$2$lambda$1(function14, acatsDestination4);
                    }
                };
                composer3.updateRememberedValue(objRememberedValue);
            }
            composer3.endReplaceGroup();
            RadioButtonKt.RadioButton(isSelected, (Function0) objRememberedValue, null, false, null, radioButtonColorsM5619colorsRGew2ao, composer, 0, 28);
            composer.endNode();
            List<UIComponent<GenericAction>> bodyComponents = acatsDestination4.getBodyComponents();
            SduiActionHandler sduiActionHandlerCurrentActionHandler = SduiActionHandler3.currentActionHandler(composer, 0);
            HorizontalPadding horizontalPadding = HorizontalPadding.None;
            composer.startReplaceGroup(1510558093);
            ImmutableList3 persistentList = extensions2.toPersistentList(bodyComponents);
            composer.startReplaceGroup(-1772220517);
            SduiColumns.SduiColumn(persistentList, GenericAction.class, companion2, null, sduiActionHandlerCurrentActionHandler, horizontalPadding, arrangement.getTop(), companion4.getStart(), false, composer, 100859904, 0);
            composer.endReplaceGroup();
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$2$lambda$1(Function1 function1, AcatsDestination acatsDestination) {
            function1.invoke(acatsDestination);
            return Unit.INSTANCE;
        }
    }

    private static final void DestinationCard(final AcatsDestination acatsDestination, final Function1<? super AcatsDestination, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1553195398);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(acatsDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1553195398, i2, -1, "com.robinhood.android.acatsin.availabledestinations.DestinationCard (AcatsInAvailableDestinationsComposable.kt:108)");
            }
            RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8));
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21371getBg0d7_KjU();
            BorderStroke borderStrokeM4886BorderStrokecXLIe8U = BorderStroke2.m4886BorderStrokecXLIe8U(C2002Dp.m7995constructorimpl(1), bentoTheme.getColors(composerStartRestartGroup, i3).m21373getBg30d7_KjU());
            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, acatsDestination.getTestTag());
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(acatsDestination) | ((i2 & 112) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AcatsInAvailableDestinationsComposable.DestinationCard$lambda$5$lambda$4(function1, acatsDestination);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            CardKt.m5549CardLPr_se0((Function0) objRememberedValue, modifierTestTag, false, roundedCornerShapeM5327RoundedCornerShape0680j_4, jM21371getBg0d7_KjU, 0L, borderStrokeM4886BorderStrokecXLIe8U, fM7995constructorimpl, null, ComposableLambda3.rememberComposableLambda(1526146144, true, new C77992(acatsDestination, function1), composerStartRestartGroup, 54), composer2, 817889280, EnumC7081g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AcatsInAvailableDestinationsComposable.DestinationCard$lambda$6(acatsDestination, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DestinationCard$lambda$5$lambda$4(Function1 function1, AcatsDestination acatsDestination) {
        function1.invoke(acatsDestination);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AvailableDestinationsReadyScreenPreview$lambda$9(SnapshotState<AcatsDestination> snapshotState, AcatsDestination acatsDestination) {
        snapshotState.setValue(acatsDestination);
    }

    private static final void AvailableDestinationsReadyScreenPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-354426816);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-354426816, i, -1, "com.robinhood.android.acatsin.availabledestinations.AvailableDestinationsReadyScreenPreview (AcatsInAvailableDestinationsComposable.kt:168)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1413127560, true, new C77981((SnapshotState) objRememberedValue), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AcatsInAvailableDestinationsComposable.AvailableDestinationsReadyScreenPreview$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: AcatsInAvailableDestinationsComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsComposableKt$AvailableDestinationsReadyScreenPreview$1 */
    static final class C77981 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<AcatsDestination> $selectedDestination$delegate;

        C77981(SnapshotState<AcatsDestination> snapshotState) {
            this.$selectedDestination$delegate = snapshotState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1413127560, i, -1, "com.robinhood.android.acatsin.availabledestinations.AvailableDestinationsReadyScreenPreview.<anonymous> (AcatsInAvailableDestinationsComposable.kt:172)");
            }
            AcatsInAvailableDestinationsViewState.Ready ready = new AcatsInAvailableDestinationsViewState.Ready(extensions2.persistentListOf(AcatsDestination2.toUiModel(new AvailableAccount(Constants.SdidMigrationStatusCodes.ALREADY_SDID, Constants.SdidMigrationStatusCodes.ALREADY_SDID, "Individual", ServerToBentoAssetMapper3.BANK.getServerValue(), "individual", BrokerageAccountType.INDIVIDUAL, CollectionsKt.emptyList()), AcatsInAvailableDestinationsComposable.AvailableDestinationsReadyScreenPreview$lambda$8(this.$selectedDestination$delegate)), AcatsDestination2.toUiModel(new AvailableAccount(Constants.SdidMigrationStatusCodes.SUCCESSFULLY_MIGRATED, Constants.SdidMigrationStatusCodes.SUCCESSFULLY_MIGRATED, "Traditional IRA", ServerToBentoAssetMapper3.RETIREMENT.getServerValue(), "traditional_ira", BrokerageAccountType.IRA_TRADITIONAL, CollectionsKt.emptyList()), AcatsInAvailableDestinationsComposable.AvailableDestinationsReadyScreenPreview$lambda$8(this.$selectedDestination$delegate))), AcatsInAvailableDestinationsComposable.AvailableDestinationsReadyScreenPreview$lambda$8(this.$selectedDestination$delegate), null, null, 12, null);
            composer.startReplaceGroup(5004770);
            final SnapshotState<AcatsDestination> snapshotState = this.$selectedDestination$delegate;
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsComposableKt$AvailableDestinationsReadyScreenPreview$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AcatsInAvailableDestinationsComposable.C77981.invoke$lambda$1$lambda$0(snapshotState, (AcatsDestination) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.acatsin.availabledestinations.AcatsInAvailableDestinationsComposableKt$AvailableDestinationsReadyScreenPreview$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            AcatsInAvailableDestinationsComposable.AvailableDestinationsReadyScreen(ready, function1, (Function0) objRememberedValue2, composer, 432);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState, AcatsDestination it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AcatsInAvailableDestinationsComposable.AvailableDestinationsReadyScreenPreview$lambda$9(snapshotState, it);
            return Unit.INSTANCE;
        }
    }
}
