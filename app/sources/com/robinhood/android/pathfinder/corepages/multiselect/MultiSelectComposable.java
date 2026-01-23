package com.robinhood.android.pathfinder.corepages.multiselect;

import android.net.Uri;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.platform.UriHandler;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoRichText;
import com.robinhood.android.pathfinder.corepages.multiselect.MultiSelectViewState;
import com.robinhood.android.transfers.p271ui.p272v2.CreateTransferV2Composable3;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.serverdriven.p347db.RichText;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MultiSelectComposable.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u001aQ\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b\u0012\u0004\u0012\u00020\u00010\nH\u0001¢\u0006\u0002\u0010\f\u001a\u0015\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u00020\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0003¢\u0006\u0002\u0010\u0010\u001a?\u0010\u0013\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010\u0018\u001a+\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u001cH\u0003¢\u0006\u0002\u0010\u001d\u001a7\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000b\u0012\u0004\u0012\u00020\u00010\nH\u0003¢\u0006\u0002\u0010\u001f\u001a\u0014\u0010 \u001a\u00020\b*\u00020\b2\u0006\u0010!\u001a\u00020\"H\u0000\"\u000e\u0010#\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010$\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010%\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010&\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010'\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000¨\u0006("}, m3636d2 = {"MultiSelectComposable", "", "viewState", "Lcom/robinhood/android/pathfinder/corepages/multiselect/MultiSelectViewState;", "sendingInput", "", "onClickOption", "Lkotlin/Function2;", "", "onClickContinue", "Lkotlin/Function1;", "", "(Lcom/robinhood/android/pathfinder/corepages/multiselect/MultiSelectViewState;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Heading", "heading", "Lcom/robinhood/models/serverdriven/db/RichText;", "(Lcom/robinhood/models/serverdriven/db/RichText;Landroidx/compose/runtime/Composer;I)V", "Subheading", "subheading", "Options", "modifier", "Landroidx/compose/ui/Modifier;", "options", "Lcom/robinhood/android/pathfinder/corepages/multiselect/MultiSelectViewState$Option;", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Option", AnalyticsStrings.BUTTON_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION_OPTION, "onClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/android/pathfinder/corepages/multiselect/MultiSelectViewState$Option;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", CreateTransferV2Composable3.ContinueButtonTag, "(Lcom/robinhood/android/pathfinder/corepages/multiselect/MultiSelectViewState;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "indexedTestTag", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "MultiSelectTestTagHeading", "MultiSelectTestTagSubheading", "MultiSelectTestTagOptionColumn", "MultiSelectTestTagOptionRow", "MultiSelectTestTagContinueButton", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.pathfinder.corepages.multiselect.MultiSelectComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class MultiSelectComposable {
    public static final String MultiSelectTestTagContinueButton = "MultiSelectContinueButton";
    public static final String MultiSelectTestTagHeading = "MultiSelectHeading";
    public static final String MultiSelectTestTagOptionColumn = "MultiSelectOption";
    public static final String MultiSelectTestTagOptionRow = "MultiSelectOptionRow";
    public static final String MultiSelectTestTagSubheading = "MultiSelectSubheading";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContinueButton$lambda$14(MultiSelectViewState multiSelectViewState, boolean z, Function1 function1, int i, Composer composer, int i2) {
        ContinueButton(multiSelectViewState, z, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Heading$lambda$2(RichText richText, int i, Composer composer, int i2) {
        Heading(richText, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultiSelectComposable$lambda$1(MultiSelectViewState multiSelectViewState, boolean z, Function2 function2, Function1 function1, int i, Composer composer, int i2) {
        MultiSelectComposable(multiSelectViewState, z, function2, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Option$lambda$11(Modifier modifier, MultiSelectViewState.Option option, Function0 function0, int i, Composer composer, int i2) {
        Option(modifier, option, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Options$lambda$10(Modifier modifier, List list, Function2 function2, int i, int i2, Composer composer, int i3) {
        Options(modifier, list, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Subheading$lambda$5(RichText richText, int i, Composer composer, int i2) {
        Subheading(richText, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void MultiSelectComposable(final MultiSelectViewState viewState, final boolean z, final Function2<? super String, ? super Boolean, Unit> onClickOption, final Function1<? super List<String>, Unit> onClickContinue, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onClickOption, "onClickOption");
        Intrinsics.checkNotNullParameter(onClickContinue, "onClickContinue");
        Composer composerStartRestartGroup = composer.startRestartGroup(-288290375);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClickOption) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClickContinue) ? 2048 : 1024;
        }
        int i3 = i2;
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-288290375, i3, -1, "com.robinhood.android.pathfinder.corepages.multiselect.MultiSelectComposable (MultiSelectComposable.kt:27)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
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
            Heading(viewState.getHeading(), composerStartRestartGroup, 0);
            Subheading(viewState.getSubheading(), composerStartRestartGroup, 0);
            Options(Column5.weight$default(column6, companion, 1.0f, false, 2, null), viewState.getOptions(), onClickOption, composerStartRestartGroup, i3 & 896, 0);
            ContinueButton(viewState, z, onClickContinue, composerStartRestartGroup, (i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i3 >> 3) & 896));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.multiselect.MultiSelectComposableKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MultiSelectComposable.MultiSelectComposable$lambda$1(viewState, z, onClickOption, onClickContinue, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Heading(final RichText richText, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1811333804);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(richText) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1811333804, i2, -1, "com.robinhood.android.pathfinder.corepages.multiselect.Heading (MultiSelectComposable.kt:45)");
            }
            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, MultiSelectTestTagHeading);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            BentoRichText.m15948BentoRichText0sCZWFg(richText, PaddingKt.m5144paddingVpY3zN4$default(modifierTestTag, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleMedium(), 0L, 0L, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (Function1<? super Uri, Unit>) null, composerStartRestartGroup, i2 & 14, 1016);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.multiselect.MultiSelectComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MultiSelectComposable.Heading$lambda$2(richText, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Subheading(final RichText richText, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1979697272);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(richText) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1979697272, i2, -1, "com.robinhood.android.pathfinder.corepages.multiselect.Subheading (MultiSelectComposable.kt:56)");
            }
            if (richText != null) {
                final UriHandler uriHandler = (UriHandler) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalUriHandler());
                Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, MultiSelectTestTagSubheading);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(modifierTestTag, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(uriHandler);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.multiselect.MultiSelectComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return MultiSelectComposable.Subheading$lambda$4$lambda$3(uriHandler, (Uri) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoRichText.m15948BentoRichText0sCZWFg(richText, modifierM5146paddingqDBjuR0$default, (TextStyle) null, 0L, 0L, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (Function1<? super Uri, Unit>) objRememberedValue, composerStartRestartGroup, i2 & 14, 508);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.multiselect.MultiSelectComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MultiSelectComposable.Subheading$lambda$5(richText, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Subheading$lambda$4$lambda$3(UriHandler uriHandler, Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String string2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        uriHandler.openUri(string2);
        return Unit.INSTANCE;
    }

    private static final void Options(Modifier modifier, final List<MultiSelectViewState.Option> list, final Function2<? super String, ? super Boolean, Unit> function2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1331440416);
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
            i3 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1331440416, i3, -1, "com.robinhood.android.pathfinder.corepages.multiselect.Options (MultiSelectComposable.kt:77)");
            }
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(TestTag3.testTag(modifier3, MultiSelectTestTagOptionColumn), 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(list) | ((i3 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.multiselect.MultiSelectComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MultiSelectComposable.Options$lambda$9$lambda$8(list, function2, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierM5146paddingqDBjuR0$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.multiselect.MultiSelectComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MultiSelectComposable.Options$lambda$10(modifier3, list, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Option(final Modifier modifier, final MultiSelectViewState.Option option, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(765735848);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(option) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(765735848, i2, -1, "com.robinhood.android.pathfinder.corepages.multiselect.Option (MultiSelectComposable.kt:100)");
            }
            int i3 = i2;
            BentoSelectionRow2.BentoSelectionRow(modifier, BentoSelectionRowState.Type.Checkbox, option.getTitle(), option.getChecked(), null, false, null, false, false, false, function0, composerStartRestartGroup, (i3 & 14) | 48, (i3 >> 6) & 14, 1008);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.multiselect.MultiSelectComposableKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MultiSelectComposable.Option$lambda$11(modifier, option, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ContinueButton(final MultiSelectViewState multiSelectViewState, final boolean z, final Function1<? super List<String>, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(167476088);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(multiSelectViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(167476088, i2, -1, "com.robinhood.android.pathfinder.corepages.multiselect.ContinueButton (MultiSelectComposable.kt:115)");
            }
            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, MultiSelectTestTagContinueButton);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5143paddingVpY3zN4(modifierTestTag, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM()), 0.0f, 1, null);
            boolean continueButtonEnabled = multiSelectViewState.getContinueButtonEnabled();
            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(multiSelectViewState) | ((i2 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.pathfinder.corepages.multiselect.MultiSelectComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MultiSelectComposable.ContinueButton$lambda$13$lambda$12(function1, multiSelectViewState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierFillMaxWidth$default, null, null, continueButtonEnabled, z, null, null, null, null, false, null, composerStartRestartGroup, (i2 << 15) & 3670016, 0, 8088);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.multiselect.MultiSelectComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MultiSelectComposable.ContinueButton$lambda$14(multiSelectViewState, z, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContinueButton$lambda$13$lambda$12(Function1 function1, MultiSelectViewState multiSelectViewState) {
        function1.invoke(multiSelectViewState.getSelectedOptions());
        return Unit.INSTANCE;
    }

    public static final String indexedTestTag(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return str + "_" + i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Options$lambda$9$lambda$8(final List list, final Function2 function2, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.pathfinder.corepages.multiselect.MultiSelectComposableKt$Options$lambda$9$lambda$8$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                list.get(i);
                return null;
            }
        }, ComposableLambda3.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.pathfinder.corepages.multiselect.MultiSelectComposableKt$Options$lambda$9$lambda$8$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                final MultiSelectViewState.Option option = (MultiSelectViewState.Option) list.get(i);
                composer.startReplaceGroup(377542239);
                Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, MultiSelectComposable.indexedTestTag(MultiSelectComposable.MultiSelectTestTagOptionRow, i));
                composer.startReplaceGroup(-1633490746);
                boolean zChanged = composer.changed(function2) | composer.changed(option);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function2 function22 = function2;
                    objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.pathfinder.corepages.multiselect.MultiSelectComposableKt$Options$1$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function22.invoke(option.getTitle(), Boolean.valueOf(!option.getChecked()));
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                MultiSelectComposable.Option(modifierTestTag, option, (Function0) objRememberedValue, composer, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }
}
