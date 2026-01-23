package com.robinhood.android.portfolio.positionsSortOptions;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.Divider5;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor2;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.models.portfolio.PositionsSortOptions;
import com.robinhood.android.models.portfolio.PositionsSortOptions2;
import com.robinhood.android.models.portfolio.PositionsSortPreference;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.android.models.portfolio.api.PositionsSortDirection;
import com.robinhood.android.portfolio.C25550R;
import com.robinhood.android.portfolio.contracts.PositionsSortResult;
import com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsComposable;
import com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsViewState;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.PositionsInstrumentType;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PositionsSortOptionsComposable.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a^\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010\u0010\u001a;\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00122\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0013\u001a\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0003¢\u0006\u0002\u0010\u0018\"\u0010\u0010\u0019\u001a\u00020\b8\u0000X\u0081T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"PositionsSortOptionsComposable", "", "positionInstrumentType", "Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "state", "Lcom/robinhood/android/portfolio/positionsSortOptions/PositionsSortOptionsViewState;", "onSortOptionSelected", "Lkotlin/Function1;", "", "onDone", "Lcom/robinhood/android/portfolio/contracts/PositionsSortResult;", "Lkotlin/ParameterName;", "name", "result", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;Lcom/robinhood/android/portfolio/positionsSortOptions/PositionsSortOptionsViewState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PositionsSortOptionsReadyComposable", "Lcom/robinhood/android/portfolio/positionsSortOptions/PositionsSortOptionsViewState$Ready;", "(Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;Lcom/robinhood/android/portfolio/positionsSortOptions/PositionsSortOptionsViewState$Ready;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "valueDisplayRowMeta", "Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta;", "selectedDirection", "Lcom/robinhood/android/models/portfolio/api/PositionsSortDirection;", "(Lcom/robinhood/android/models/portfolio/api/PositionsSortDirection;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/bento/component/rows/BentoBaseRowState$Meta;", "LoadingSpinnerTestTag", "feature-portfolio_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class PositionsSortOptionsComposable {
    public static final String LoadingSpinnerTestTag = "loading-spinner";

    /* compiled from: PositionsSortOptionsComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PositionsSortDirection.values().length];
            try {
                iArr[PositionsSortDirection.ASC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PositionsSortDirection.DSC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PositionsSortOptionsComposable$lambda$0(PositionInstrumentType positionInstrumentType, PositionsSortOptionsViewState positionsSortOptionsViewState, Function1 function1, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PositionsSortOptionsComposable(positionInstrumentType, positionsSortOptionsViewState, function1, function12, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PositionsSortOptionsReadyComposable$lambda$8(PositionInstrumentType positionInstrumentType, PositionsSortOptionsViewState.Ready ready, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PositionsSortOptionsReadyComposable(positionInstrumentType, ready, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* compiled from: PositionsSortOptionsComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsComposableKt$PositionsSortOptionsComposable$1 */
    static final class C258441 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function1<PositionsSortResult, Unit> $onDone;
        final /* synthetic */ Function1<String, Unit> $onSortOptionSelected;
        final /* synthetic */ PositionInstrumentType $positionInstrumentType;
        final /* synthetic */ PositionsSortOptionsViewState $state;

        /* JADX WARN: Multi-variable type inference failed */
        C258441(Modifier modifier, PositionsSortOptionsViewState positionsSortOptionsViewState, PositionInstrumentType positionInstrumentType, Function1<? super String, Unit> function1, Function1<? super PositionsSortResult, Unit> function12) {
            this.$modifier = modifier;
            this.$state = positionsSortOptionsViewState;
            this.$positionInstrumentType = positionInstrumentType;
            this.$onSortOptionSelected = function1;
            this.$onDone = function12;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(Composer composer, int i) {
            Modifier.Companion companion;
            int i2;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1342720556, i, -1, "com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsComposable.<anonymous> (PositionsSortOptionsComposable.kt:47)");
            }
            Modifier modifier = this.$modifier;
            final PositionsSortOptionsViewState positionsSortOptionsViewState = this.$state;
            PositionInstrumentType positionInstrumentType = this.$positionInstrumentType;
            Function1<String, Unit> function1 = this.$onSortOptionSelected;
            final Function1<PositionsSortResult, Unit> function12 = this.$onDone;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifier);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Divider5.m5851HorizontalDivider9IZ8Weo(PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 7, null), 0.0f, bentoTheme.getColors(composer, i3).m21372getBg20d7_KjU(), composer, 0, 2);
            PositionInstrumentType positionInstrumentType2 = positionInstrumentType;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C25550R.string.sort_positions_title, composer, 0), PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion3, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 7, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getDisplayCapsuleSmall(), composer, 0, 0, 8124);
            if (positionsSortOptionsViewState instanceof PositionsSortOptionsViewState.Loading) {
                composer.startReplaceGroup(-401206246);
                companion = companion3;
                i2 = 1;
                LocalShowPlaceholder.Loadable(true, TestTag3.testTag(companion, "loading-spinner"), null, ComposableLambda3.rememberComposableLambda(1453889194, true, new PositionsSortOptionsComposable2(positionInstrumentType2), composer, 54), composer, 3126, 4);
                composer.endReplaceGroup();
            } else {
                companion = companion3;
                i2 = 1;
                if (!(positionsSortOptionsViewState instanceof PositionsSortOptionsViewState.Ready)) {
                    composer.startReplaceGroup(-401208858);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-401188815);
                PositionsSortOptionsComposable.PositionsSortOptionsReadyComposable(positionInstrumentType2, (PositionsSortOptionsViewState.Ready) positionsSortOptionsViewState, function1, null, composer, 0, 8);
                positionInstrumentType2 = positionInstrumentType2;
                composer.endReplaceGroup();
            }
            boolean z = ((positionsSortOptionsViewState instanceof PositionsSortOptionsViewState.Ready) && ((PositionsSortOptionsViewState.Ready) positionsSortOptionsViewState).getSortPersistPending()) ? i2 : 0;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, i2, null), bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Component component = new Component(Component.ComponentType.DONE_BUTTON, null, null, 6, null);
            UserInteractionEventData.Action action = UserInteractionEventData.Action.UPDATE_USERS_POSITION_SORT;
            Context contextOrNew = UserInteractionEventDescriptor2.orNew(userInteractionEventDescriptor.getContext());
            PositionsInstrumentType rosettaType = positionInstrumentType2.toRosettaType();
            PositionsSortPreference sortPreference = positionsSortOptionsViewState.getResult().getSortPreference();
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierM5144paddingVpY3zN4$default, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, action, Context.copy$default(contextOrNew, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, rosettaType, sortPreference != null ? PositionsSortOptions2.toRosettaContext(sortPreference) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -24577, -1, 16383, null), component, null, 35, null), false, false, false, !z, false, null, 110, null);
            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer, 0);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(function12) | composer.changedInstance(positionsSortOptionsViewState);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsComposableKt$PositionsSortOptionsComposable$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PositionsSortOptionsComposable.C258441.invoke$lambda$3$lambda$2$lambda$1(function12, positionsSortOptionsViewState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoButtonBar2.BentoButtonBar(modifierAutoLogEvents$default, null, null, false, null, null, (Function0) objRememberedValue, strStringResource, z, null, false, null, null, false, null, false, composer, 0, 0, 65086);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2$lambda$1(Function1 function1, PositionsSortOptionsViewState positionsSortOptionsViewState) {
            function1.invoke(positionsSortOptionsViewState.getResult());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PositionsSortOptionsComposable(final PositionInstrumentType positionInstrumentType, final PositionsSortOptionsViewState state, final Function1<? super String, Unit> onSortOptionSelected, final Function1<? super PositionsSortResult, Unit> onDone, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(positionInstrumentType, "positionInstrumentType");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onSortOptionSelected, "onSortOptionSelected");
        Intrinsics.checkNotNullParameter(onDone, "onDone");
        Composer composerStartRestartGroup = composer.startRestartGroup(503997537);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(positionInstrumentType.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSortOptionSelected) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDone) ? 2048 : 1024;
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
                    ComposerKt.traceEventStart(503997537, i3, -1, "com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsComposable (PositionsSortOptionsComposable.kt:45)");
                }
                Modifier modifier5 = modifier4;
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1342720556, true, new C258441(modifier5, state, positionInstrumentType, onSortOptionSelected, onDone), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PositionsSortOptionsComposable.PositionsSortOptionsComposable$lambda$0(positionInstrumentType, state, onSortOptionSelected, onDone, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            Modifier modifier52 = modifier4;
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1342720556, true, new C258441(modifier52, state, positionInstrumentType, onSortOptionSelected, onDone), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PositionsSortOptionsReadyComposable(final PositionInstrumentType positionInstrumentType, PositionsSortOptionsViewState.Ready ready, final Function1<? super String, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        PositionsSortOptionsViewState.Ready ready2;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        Modifier modifier3;
        PositionsSortDirection sortDirection;
        PositionsSortPreference next;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1640907174);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(positionInstrumentType.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                ready2 = ready;
                i3 |= composerStartRestartGroup.changedInstance(ready2) ? 32 : 16;
            }
            int i5 = 256;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                } else {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1640907174, i3, -1, "com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsReadyComposable (PositionsSortOptionsComposable.kt:119)");
                    }
                    PositionsSortDirection positionsSortDirection = null;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                    int i6 = 0;
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
                    composerStartRestartGroup.startReplaceGroup(1165324480);
                    Composer composer3 = composerStartRestartGroup;
                    for (final PositionsSortOptions.SortOption sortOption : ready2.getOptions()) {
                        String title = sortOption.getTitle();
                        PositionsSortPreference sortPreference = ready2.getSortPreference();
                        if (sortPreference != null) {
                            sortDirection = sortPreference.getSortDirection();
                            if (!Intrinsics.areEqual(sortPreference.getSortQuery(), sortOption.getQuery())) {
                                sortDirection = positionsSortDirection;
                            }
                        }
                        BentoBaseRowState.Meta metaValueDisplayRowMeta = valueDisplayRowMeta(sortDirection, composer3, i6);
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer3.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                        Component component = new Component(Component.ComponentType.ROW, null, null, 6, null);
                        UserInteractionEventData.Action action = UserInteractionEventData.Action.UPDATE_USERS_POSITION_SORT;
                        Context contextOrNew = UserInteractionEventDescriptor2.orNew(userInteractionEventDescriptor.getContext());
                        PositionsInstrumentType rosettaType = positionInstrumentType.toRosettaType();
                        PositionsSortPreference sortPreference2 = ready2.getSortPreference();
                        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(companion2, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, action, Context.copy$default(contextOrNew, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, rosettaType, (sortPreference2 == null || (next = PositionsSortOptionsDuxo6.next(sortPreference2, sortOption.getQuery())) == null) ? null : PositionsSortOptions2.toRosettaContext(next), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -24577, -1, 16383, null), component, null, 35, null), false, false, false, !ready2.getSortPersistPending(), false, null, 110, null);
                        boolean z = !ready2.getSortPersistPending();
                        composer3.startReplaceGroup(-1633490746);
                        int i7 = ((i3 & 896) == i5 ? 1 : i6) | (composer3.changedInstance(sortOption) ? 1 : 0);
                        Object objRememberedValue = composer3.rememberedValue();
                        if (i7 != 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsComposableKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return PositionsSortOptionsComposable.m2386x50879a38(function1, sortOption);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue);
                        }
                        composer3.endReplaceGroup();
                        Composer composer4 = composer3;
                        BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierAutoLogEvents$default, null, title, null, null, metaValueDisplayRowMeta, null, false, z, false, 0L, (Function0) objRememberedValue, composer4, BentoBaseRowState.Meta.$stable << 15, 0, 1754);
                        i5 = i5;
                        composer3 = composer4;
                        modifier4 = modifier4;
                        i6 = i6;
                        positionsSortDirection = null;
                    }
                    composer2 = composer3;
                    modifier3 = modifier4;
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final PositionsSortOptionsViewState.Ready ready3 = ready2;
                    final Modifier modifier5 = modifier3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return PositionsSortOptionsComposable.PositionsSortOptionsReadyComposable$lambda$8(positionInstrumentType, ready3, function1, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                PositionsSortDirection positionsSortDirection2 = null;
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                int i62 = 0;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
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
                    composerStartRestartGroup.startReplaceGroup(1165324480);
                    Composer composer32 = composerStartRestartGroup;
                    while (r0.hasNext()) {
                    }
                    composer2 = composer32;
                    modifier3 = modifier4;
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        ready2 = ready;
        int i52 = 256;
        if ((i2 & 4) == 0) {
        }
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PositionsSortOptionsReadyComposable$lambda$7$lambda$6$lambda$5$lambda$4 */
    public static final Unit m2386x50879a38(Function1 function1, PositionsSortOptions.SortOption sortOption) {
        function1.invoke(sortOption.getQuery());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final BentoBaseRowState.Meta valueDisplayRowMeta(PositionsSortDirection positionsSortDirection, Composer composer, int i) {
        BentoBaseRowState.Meta.Icon icon;
        BentoBaseRowState.Meta.Icon icon2;
        composer.startReplaceGroup(1423628513);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1423628513, i, -1, "com.robinhood.android.portfolio.positionsSortOptions.valueDisplayRowMeta (PositionsSortOptionsComposable.kt:154)");
        }
        int i2 = positionsSortDirection != null ? WhenMappings.$EnumSwitchMapping$0[positionsSortDirection.ordinal()] : -1;
        if (i2 == 1) {
            composer.startReplaceGroup(-1987559661);
            icon = new BentoBaseRowState.Meta.Icon(ServerToBentoAssetMapper2.ARROW_UP_24, StringResources_androidKt.stringResource(C25550R.string.sort_positions_ascending, composer, 0), (Color) null, (Function0) null, 12, (DefaultConstructorMarker) null);
            composer.endReplaceGroup();
        } else if (i2 == 2) {
            composer.startReplaceGroup(-1987552970);
            icon = new BentoBaseRowState.Meta.Icon(ServerToBentoAssetMapper2.ARROW_DOWN_24, StringResources_androidKt.stringResource(C25550R.string.sort_positions_descending, composer, 0), (Color) null, (Function0) null, 12, (DefaultConstructorMarker) null);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1484438756);
            composer.endReplaceGroup();
            icon2 = null;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return icon2;
        }
        icon2 = icon;
        if (ComposerKt.isTraceInProgress()) {
        }
        composer.endReplaceGroup();
        return icon2;
    }
}
