package com.robinhood.android.matcha.p177ui.search.contactlookup;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.matcha.p177ui.search.contactlookup.ContactLookupViewState;
import com.robinhood.android.matcha.p177ui.search.contactlookup.SelectFromMultipleUsersComposable4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.p2p.common.ProfileAvatarState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SelectFromMultipleUsersComposable.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001az\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010H\u0001¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"SelectFromMultipleUsers", "", "title", "", "subtitle", "selectionRows", "", "Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupViewState$SelectFromMultipleUsers$SelectionRow;", "onSelectionChange", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "userId", "primaryButtonText", "secondaryButtonText", "primaryButtonOnClick", "Lkotlin/Function0;", "secondaryButtonOnClick", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "SelectFromMultipleUsersPreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-p2p_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.search.contactlookup.SelectFromMultipleUsersComposableKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SelectFromMultipleUsersComposable4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectFromMultipleUsers$lambda$0(String str, String str2, List list, Function1 function1, String str3, String str4, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        SelectFromMultipleUsers(str, str2, list, function1, str3, str4, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectFromMultipleUsersPreview$lambda$1(int i, Composer composer, int i2) {
        SelectFromMultipleUsersPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* compiled from: SelectFromMultipleUsersComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.matcha.ui.search.contactlookup.SelectFromMultipleUsersComposableKt$SelectFromMultipleUsers$1 */
    static final class C215661 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function1<String, Unit> $onSelectionChange;
        final /* synthetic */ Function0<Unit> $primaryButtonOnClick;
        final /* synthetic */ String $primaryButtonText;
        final /* synthetic */ Function0<Unit> $secondaryButtonOnClick;
        final /* synthetic */ String $secondaryButtonText;
        final /* synthetic */ List<ContactLookupViewState.SelectFromMultipleUsers.SelectionRow> $selectionRows;
        final /* synthetic */ String $subtitle;
        final /* synthetic */ String $title;

        /* JADX WARN: Multi-variable type inference failed */
        C215661(String str, String str2, String str3, String str4, Function0<Unit> function0, Function0<Unit> function02, List<ContactLookupViewState.SelectFromMultipleUsers.SelectionRow> list, Function1<? super String, Unit> function1) {
            this.$title = str;
            this.$subtitle = str2;
            this.$primaryButtonText = str3;
            this.$secondaryButtonText = str4;
            this.$primaryButtonOnClick = function0;
            this.$secondaryButtonOnClick = function02;
            this.$selectionRows = list;
            this.$onSelectionChange = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$2$lambda$1$lambda$0(Function1 function1, ContactLookupViewState.SelectFromMultipleUsers.SelectionRow selectionRow) {
            function1.invoke(selectionRow.getId());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-549777495, i, -1, "com.robinhood.android.matcha.ui.search.contactlookup.SelectFromMultipleUsers.<anonymous> (SelectFromMultipleUsersComposable.kt:35)");
            }
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
            String str = this.$title;
            String str2 = this.$subtitle;
            String str3 = this.$primaryButtonText;
            String str4 = this.$secondaryButtonText;
            Function0<Unit> function0 = this.$primaryButtonOnClick;
            Function0<Unit> function02 = this.$secondaryButtonOnClick;
            List<ContactLookupViewState.SelectFromMultipleUsers.SelectionRow> list = this.$selectionRows;
            Function1<String, Unit> function1 = this.$onSelectionChange;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            TextStyle displayCapsuleSmall = bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall();
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            Function1<String, Unit> function12 = function1;
            BentoText2.m20747BentoText38GnDrw(str, PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 5, null), null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleSmall, composer, 0, 0, 8124);
            BentoText2.m20747BentoText38GnDrw(str2, PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null), Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 0, 0, 8120);
            Composer composer2 = composer;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.m5157heightInVpY3zN4(PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composer2, i2).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), C2002Dp.m7995constructorimpl(0), C2002Dp.m7995constructorimpl(300)), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer2, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierVerticalScroll$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer2.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            composer2.startReplaceGroup(-674806913);
            for (final ContactLookupViewState.SelectFromMultipleUsers.SelectionRow selectionRow : list) {
                ProfileAvatarState avatarState = selectionRow.getAvatarState();
                String primaryText = selectionRow.getPrimaryText();
                String secondaryText = selectionRow.getSecondaryText();
                boolean selected = selectionRow.getSelected();
                composer2.startReplaceGroup(-1633490746);
                final Function1<String, Unit> function13 = function12;
                boolean zChanged = composer2.changed(function13) | composer2.changedInstance(selectionRow);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.matcha.ui.search.contactlookup.SelectFromMultipleUsersComposableKt$SelectFromMultipleUsers$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SelectFromMultipleUsersComposable4.C215661.invoke$lambda$4$lambda$3$lambda$2$lambda$1$lambda$0(function13, selectionRow);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                UserSelectionRow.UserSelectionRow(null, avatarState, primaryText, secondaryText, selected, (Function0) objRememberedValue, composer, 0, 1);
                composer2 = composer;
                function12 = function13;
            }
            Composer composer3 = composer2;
            composer3.endReplaceGroup();
            composer3.endNode();
            Modifier.Companion companion5 = Modifier.INSTANCE;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            SearchConfirmButtonBar.SearchConfirmButtonBar(PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(companion5, bentoTheme2.getSpacing(composer3, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme2.getSpacing(composer3, i3).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), str3, str4, function0, function02, composer3, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public static final void SelectFromMultipleUsers(final String title, final String subtitle, final List<ContactLookupViewState.SelectFromMultipleUsers.SelectionRow> selectionRows, final Function1<? super String, Unit> onSelectionChange, final String primaryButtonText, final String secondaryButtonText, final Function0<Unit> primaryButtonOnClick, final Function0<Unit> secondaryButtonOnClick, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(selectionRows, "selectionRows");
        Intrinsics.checkNotNullParameter(onSelectionChange, "onSelectionChange");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
        Intrinsics.checkNotNullParameter(primaryButtonOnClick, "primaryButtonOnClick");
        Intrinsics.checkNotNullParameter(secondaryButtonOnClick, "secondaryButtonOnClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1976365804);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(subtitle) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(selectionRows) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSelectionChange) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(primaryButtonText) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(secondaryButtonText) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(primaryButtonOnClick) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(secondaryButtonOnClick) ? 8388608 : 4194304;
        }
        if ((4793491 & i2) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1976365804, i2, -1, "com.robinhood.android.matcha.ui.search.contactlookup.SelectFromMultipleUsers (SelectFromMultipleUsersComposable.kt:33)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-549777495, true, new C215661(title, subtitle, primaryButtonText, secondaryButtonText, primaryButtonOnClick, secondaryButtonOnClick, selectionRows, onSelectionChange), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.search.contactlookup.SelectFromMultipleUsersComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SelectFromMultipleUsersComposable4.SelectFromMultipleUsers$lambda$0(title, subtitle, selectionRows, onSelectionChange, primaryButtonText, secondaryButtonText, primaryButtonOnClick, secondaryButtonOnClick, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void SelectFromMultipleUsersPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(766735441);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(766735441, i, -1, "com.robinhood.android.matcha.ui.search.contactlookup.SelectFromMultipleUsersPreview (SelectFromMultipleUsersComposable.kt:88)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, SelectFromMultipleUsersComposable.INSTANCE.m16436getLambda$666451447$feature_p2p_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.search.contactlookup.SelectFromMultipleUsersComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SelectFromMultipleUsersComposable4.SelectFromMultipleUsersPreview$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
