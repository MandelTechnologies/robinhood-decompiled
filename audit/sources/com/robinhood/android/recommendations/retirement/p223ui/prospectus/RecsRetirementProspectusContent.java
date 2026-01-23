package com.robinhood.android.recommendations.retirement.p223ui.prospectus;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
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
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.recommendations.retirement.C26015R;
import com.robinhood.android.recommendations.retirement.p223ui.prospectus.RecsRetirementProspectusContent;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.recommendations.retirement.models.api.ApiRecsRetirementPortfolio;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: RecsRetirementProspectusContent.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aI\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0001¢\u0006\u0002\u0010\u000e\u001a%\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"ProspectusList", "", "context", "Landroid/content/Context;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "title", "", "links", "", "Lcom/robinhood/recommendations/retirement/models/api/ApiRecsRetirementPortfolio$ProspectusLink;", "closeButtonCta", "onClickCloseButtonCta", "Lkotlin/Function0;", "(Landroid/content/Context;Lcom/robinhood/android/navigation/Navigator;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Row", "link", "(Landroid/content/Context;Lcom/robinhood/android/navigation/Navigator;Lcom/robinhood/recommendations/retirement/models/api/ApiRecsRetirementPortfolio$ProspectusLink;Landroidx/compose/runtime/Composer;I)V", "feature-recommendations-for-retirement_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.recommendations.retirement.ui.prospectus.RecsRetirementProspectusContentKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class RecsRetirementProspectusContent {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProspectusList$lambda$0(Context context, Navigator navigator, String str, List list, String str2, Function0 function0, int i, Composer composer, int i2) {
        ProspectusList(context, navigator, str, list, str2, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Row$lambda$3(Context context, Navigator navigator, ApiRecsRetirementPortfolio.ProspectusLink prospectusLink, int i, Composer composer, int i2) throws Resources.NotFoundException {
        Row(context, navigator, prospectusLink, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* compiled from: RecsRetirementProspectusContent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.recommendations.retirement.ui.prospectus.RecsRetirementProspectusContentKt$ProspectusList$1 */
    static final class C260451 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ String $closeButtonCta;
        final /* synthetic */ Context $context;
        final /* synthetic */ List<ApiRecsRetirementPortfolio.ProspectusLink> $links;
        final /* synthetic */ Navigator $navigator;
        final /* synthetic */ Function0<Unit> $onClickCloseButtonCta;
        final /* synthetic */ String $title;

        C260451(String str, List<ApiRecsRetirementPortfolio.ProspectusLink> list, Context context, Navigator navigator, Function0<Unit> function0, String str2) {
            this.$title = str;
            this.$links = list;
            this.$context = context;
            this.$navigator = navigator;
            this.$onClickCloseButtonCta = function0;
            this.$closeButtonCta = str2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2$lambda$1(final List list, final String str, final Context context, final Navigator navigator, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-356814422, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.retirement.ui.prospectus.RecsRetirementProspectusContentKt$ProspectusList$1$1$1$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-356814422, i, -1, "com.robinhood.android.recommendations.retirement.ui.prospectus.ProspectusList.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RecsRetirementProspectusContent.kt:39)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i2 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(str, SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8188);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
            final C26041x2d60e37 c26041x2d60e37 = new Function1() { // from class: com.robinhood.android.recommendations.retirement.ui.prospectus.RecsRetirementProspectusContentKt$ProspectusList$1$invoke$lambda$3$lambda$2$lambda$1$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(ApiRecsRetirementPortfolio.ProspectusLink prospectusLink) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((ApiRecsRetirementPortfolio.ProspectusLink) obj);
                }
            };
            LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.recommendations.retirement.ui.prospectus.RecsRetirementProspectusContentKt$ProspectusList$1$invoke$lambda$3$lambda$2$lambda$1$$inlined$items$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return c26041x2d60e37.invoke(list.get(i));
                }
            }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.recommendations.retirement.ui.prospectus.RecsRetirementProspectusContentKt$ProspectusList$1$invoke$lambda$3$lambda$2$lambda$1$$inlined$items$default$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) throws Resources.NotFoundException {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) throws Resources.NotFoundException {
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
                        ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    ApiRecsRetirementPortfolio.ProspectusLink prospectusLink = (ApiRecsRetirementPortfolio.ProspectusLink) list.get(i);
                    composer.startReplaceGroup(-1764034486);
                    RecsRetirementProspectusContent.Row(context, navigator, prospectusLink, composer, 0);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-896946337, i, -1, "com.robinhood.android.recommendations.retirement.ui.prospectus.ProspectusList.<anonymous> (RecsRetirementProspectusContent.kt:36)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            final String str = this.$title;
            final List<ApiRecsRetirementPortfolio.ProspectusLink> list = this.$links;
            final Context context = this.$context;
            final Navigator navigator = this.$navigator;
            Function0<Unit> function0 = this.$onClickCloseButtonCta;
            String str2 = this.$closeButtonCta;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
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
            Modifier modifierWeight$default = Column5.weight$default(Column6.INSTANCE, companion, 1.0f, false, 2, null);
            composer.startReplaceGroup(-1224400529);
            boolean zChanged = composer.changed(str) | composer.changedInstance(list) | composer.changedInstance(context) | composer.changedInstance(navigator);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.recommendations.retirement.ui.prospectus.RecsRetirementProspectusContentKt$ProspectusList$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RecsRetirementProspectusContent.C260451.invoke$lambda$3$lambda$2$lambda$1(list, str, context, navigator, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierWeight$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 510);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoButtonKt.m20586BentoButtonEikTQX8(function0, str2, SizeKt.fillMaxWidth$default(PaddingKt.m5143paddingVpY3zN4(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), 0.0f, 1, null), null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public static final void ProspectusList(final Context context, final Navigator navigator, final String title, final List<ApiRecsRetirementPortfolio.ProspectusLink> links, final String closeButtonCta, final Function0<Unit> onClickCloseButtonCta, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(links, "links");
        Intrinsics.checkNotNullParameter(closeButtonCta, "closeButtonCta");
        Intrinsics.checkNotNullParameter(onClickCloseButtonCta, "onClickCloseButtonCta");
        Composer composerStartRestartGroup = composer.startRestartGroup(2060575380);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(context) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(navigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(title) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(links) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(closeButtonCta) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClickCloseButtonCta) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2060575380, i2, -1, "com.robinhood.android.recommendations.retirement.ui.prospectus.ProspectusList (RecsRetirementProspectusContent.kt:34)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-896946337, true, new C260451(title, links, context, navigator, onClickCloseButtonCta, closeButtonCta), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.recommendations.retirement.ui.prospectus.RecsRetirementProspectusContentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecsRetirementProspectusContent.ProspectusList$lambda$0(context, navigator, title, links, closeButtonCta, onClickCloseButtonCta, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Row(final Context context, final Navigator navigator, final ApiRecsRetirementPortfolio.ProspectusLink prospectusLink, Composer composer, final int i) throws Resources.NotFoundException {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1762136078);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(context) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(navigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(prospectusLink) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1762136078, i2, -1, "com.robinhood.android.recommendations.retirement.ui.prospectus.Row (RecsRetirementProspectusContent.kt:74)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C26015R.string.recs_retirement_portfolio_prospectus_row, new Object[]{prospectusLink.getSymbol(), prospectusLink.getTitle()}, composerStartRestartGroup, 0);
            int iIndexOf$default = StringsKt.indexOf$default((CharSequence) strStringResource, prospectusLink.getSymbol(), 0, false, 6, (Object) null);
            BentoBaseRowState bentoBaseRowState = new BentoBaseRowState(null, new BentoBaseRowState.Text.Annotated(new AnnotatedString(strStringResource, CollectionsKt.listOf(new AnnotatedString.Range(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null), iIndexOf$default, prospectusLink.getSymbol().length() + iIndexOf$default)), null, 4, null), null, 2, null), null, null, null, false, false, 125, null);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(prospectusLink);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.recommendations.retirement.ui.prospectus.RecsRetirementProspectusContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RecsRetirementProspectusContent.Row$lambda$2$lambda$1(navigator, context, prospectusLink);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, bentoBaseRowState, true, false, false, 0L, (Function0) objRememberedValue, composerStartRestartGroup, (BentoBaseRowState.$stable << 3) | 384, 57);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.recommendations.retirement.ui.prospectus.RecsRetirementProspectusContentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecsRetirementProspectusContent.Row$lambda$3(context, navigator, prospectusLink, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Row$lambda$2$lambda$1(Navigator navigator, Context context, ApiRecsRetirementPortfolio.ProspectusLink prospectusLink) {
        Navigator.DefaultImpls.handleDeepLink$default(navigator, context, Uri.parse(prospectusLink.getDeeplink()), null, null, false, null, 60, null);
        return Unit.INSTANCE;
    }
}
