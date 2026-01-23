package com.robinhood.android.cortex.digest.common.sources;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.compose.AsyncImagePainter;
import coil.compose.SingletonAsyncImagePainter;
import com.robinhood.android.cortex.digest.common.C12073R;
import com.robinhood.android.cortex.digest.common.LocalClock3;
import com.robinhood.android.cortex.digest.common.sources.CortexArticleSources3;
import com.robinhood.android.cortex.models.ArticleSource;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoImage;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.BentoTextButton3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.time.android.format.DurationFormatter;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Clock;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: CortexArticleSources.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a3\u0010\t\u001a\u00020\u0001*\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0004\b\t\u0010\n\u001aU\u0010\t\u001a\u00020\u0001*\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0004\b\t\u0010\u000e\u001a5\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0019²\u0006\u0016\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0018\u001a\u00020\u00178\nX\u008a\u0084\u0002"}, m3636d2 = {"Landroidx/compose/foundation/lazy/LazyListScope;", "", "articleSourceItemHeader", "(Landroidx/compose/foundation/lazy/LazyListScope;)V", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/cortex/models/ArticleSource;", "articleSources", "Lkotlin/Function1;", "onArticleSourceClick", "articleSourceItems", "(Landroidx/compose/foundation/lazy/LazyListScope;Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;)V", "", "maxItems", "onOverflowClick", "(Landroidx/compose/foundation/lazy/LazyListScope;Lkotlinx/collections/immutable/ImmutableList;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "articleSource", "Landroidx/compose/ui/Modifier;", "modifier", "CortexArticleSourceItem", "(Lcom/robinhood/android/cortex/models/ArticleSource;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "j$/time/Instant", "kotlin.jvm.PlatformType", "now", "", "formattedPublishedAt", "lib-cortex-digest-common_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cortex.digest.common.sources.CortexArticleSourcesKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CortexArticleSources3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CortexArticleSourceItem$lambda$15(ArticleSource articleSource, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CortexArticleSourceItem(articleSource, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void articleSourceItemHeader(LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        LazyListScope.item$default(lazyListScope, null, null, CortexArticleSources.INSTANCE.m12579getLambda$659456551$lib_cortex_digest_common_externalDebug(), 3, null);
    }

    public static final void articleSourceItems(LazyListScope lazyListScope, ImmutableList<ArticleSource> articleSources, Function1<? super ArticleSource, Unit> onArticleSourceClick) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(articleSources, "articleSources");
        Intrinsics.checkNotNullParameter(onArticleSourceClick, "onArticleSourceClick");
        articleSourceItems(lazyListScope, articleSources, Integer.MAX_VALUE, onArticleSourceClick, new Function1() { // from class: com.robinhood.android.cortex.digest.common.sources.CortexArticleSourcesKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CortexArticleSources3.articleSourceItems$lambda$0((ImmutableList) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit articleSourceItems$lambda$0(ImmutableList it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Instant CortexArticleSourceItem$lambda$3(SnapshotState<Instant> snapshotState) {
        return snapshotState.getValue();
    }

    private static final String CortexArticleSourceItem$lambda$7(SnapshotState4<String> snapshotState4) {
        return snapshotState4.getValue();
    }

    public static final void articleSourceItems(LazyListScope lazyListScope, ImmutableList<ArticleSource> articleSources, int i, final Function1<? super ArticleSource, Unit> onArticleSourceClick, Function1<? super ImmutableList<ArticleSource>, Unit> onOverflowClick) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(articleSources, "articleSources");
        Intrinsics.checkNotNullParameter(onArticleSourceClick, "onArticleSourceClick");
        Intrinsics.checkNotNullParameter(onOverflowClick, "onOverflowClick");
        final List listTake = CollectionsKt.take(articleSources, i);
        final C12082x86ab0f2a c12082x86ab0f2a = new Function1() { // from class: com.robinhood.android.cortex.digest.common.sources.CortexArticleSourcesKt$articleSourceItems$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(ArticleSource articleSource) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((ArticleSource) obj);
            }
        };
        lazyListScope.items(listTake.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.cortex.digest.common.sources.CortexArticleSourcesKt$articleSourceItems$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i2) {
                return c12082x86ab0f2a.invoke(listTake.get(i2));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.common.sources.CortexArticleSourcesKt$articleSourceItems$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i2, Composer composer, int i3) {
                int i4;
                if ((i3 & 6) == 0) {
                    i4 = (composer.changed(lazyItemScope) ? 4 : 2) | i3;
                } else {
                    i4 = i3;
                }
                if ((i3 & 48) == 0) {
                    i4 |= composer.changed(i2) ? 32 : 16;
                }
                if (!composer.shouldExecute((i4 & 147) != 146, i4 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i4, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                ArticleSource articleSource = (ArticleSource) listTake.get(i2);
                composer.startReplaceGroup(-367355794);
                CortexArticleSources3.CortexArticleSourceItem(articleSource, onArticleSourceClick, null, composer, 0, 4);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        if (articleSources.size() > i) {
            LazyListScope.item$default(lazyListScope, null, null, ComposableLambda3.composableLambdaInstance(-919605305, true, new C120873(articleSources, onOverflowClick)), 3, null);
        }
    }

    /* compiled from: CortexArticleSources.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.cortex.digest.common.sources.CortexArticleSourcesKt$articleSourceItems$3 */
    static final class C120873 implements Function3<LazyItemScope, Composer, Integer, Unit> {
        final /* synthetic */ ImmutableList<ArticleSource> $articleSources;
        final /* synthetic */ Function1<ImmutableList<ArticleSource>, Unit> $onOverflowClick;

        /* JADX WARN: Multi-variable type inference failed */
        C120873(ImmutableList<ArticleSource> immutableList, Function1<? super ImmutableList<ArticleSource>, Unit> function1) {
            this.$articleSources = immutableList;
            this.$onOverflowClick = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) throws Resources.NotFoundException {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-919605305, i, -1, "com.robinhood.android.cortex.digest.common.sources.articleSourceItems.<anonymous> (CortexArticleSources.kt:98)");
            }
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer, 6, 1), 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
            String strStringResource = StringResources_androidKt.stringResource(C12073R.string.cortex_digest_article_source_overflow_cta, new Object[]{Integer.valueOf(this.$articleSources.size())}, composer, 0);
            BentoTextButton3.Size size = BentoTextButton3.Size.f5148S;
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$onOverflowClick) | composer.changedInstance(this.$articleSources);
            final Function1<ImmutableList<ArticleSource>, Unit> function1 = this.$onOverflowClick;
            final ImmutableList<ArticleSource> immutableList = this.$articleSources;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.cortex.digest.common.sources.CortexArticleSourcesKt$articleSourceItems$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CortexArticleSources3.C120873.invoke$lambda$1$lambda$0(function1, immutableList);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, strStringResource, modifierM5146paddingqDBjuR0$default, null, size, false, null, composer, 24576, 104);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function1 function1, ImmutableList immutableList) {
            function1.invoke(immutableList);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x032a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CortexArticleSourceItem(final ArticleSource articleSource, final Function1<? super ArticleSource, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Clock current;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        Object objRememberedValue2;
        Instant publishedAt;
        boolean zChangedInstance;
        Object objRememberedValue3;
        boolean zChangedInstance2;
        Object objRememberedValue4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        String iconUrl;
        BentoTheme bentoTheme;
        int i4;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Composer composer2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        Composer composer3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(2095325297);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(articleSource) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2095325297, i3, -1, "com.robinhood.android.cortex.digest.common.sources.CortexArticleSourceItem (CortexArticleSources.kt:118)");
                }
                current = LocalClock3.getLocalClock().getCurrent(composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Instant.now(current), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                final Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.cortex.digest.common.sources.CortexArticleSourcesKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CortexArticleSources3.CortexArticleSourceItem$lambda$6$lambda$5(resources, articleSource, snapshotState);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                publishedAt = articleSource.getPublishedAt();
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(publishedAt);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new CortexArticleSources4(current, publishedAt, snapshotState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(publishedAt, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance2 = ((i3 & 112) != 32) | composerStartRestartGroup.changedInstance(articleSource);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.cortex.digest.common.sources.CortexArticleSourcesKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CortexArticleSources3.CortexArticleSourceItem$lambda$10$lambda$9(function1, articleSource);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ClickableKt.m4893clickableXHw0xAI$default(modifier4, false, null, null, (Function0) objRememberedValue4, 7, null), 0.0f, 1, null);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifierFillMaxWidth$default, bentoTheme2.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM(), composerStartRestartGroup, 0, 0);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                Alignment.Vertical centerVertically = companion2.getCenterVertically();
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                iconUrl = articleSource.getIconUrl();
                composerStartRestartGroup.startReplaceGroup(845774595);
                if (iconUrl != null) {
                    bentoTheme = bentoTheme2;
                    i4 = i6;
                } else {
                    Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 0.0f, 11, null), C2002Dp.m7995constructorimpl(40));
                    bentoTheme = bentoTheme2;
                    i4 = i6;
                    AsyncImagePainter asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg = SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(iconUrl, null, null, null, 0, null, composerStartRestartGroup, 0, 62);
                    composerStartRestartGroup = composerStartRestartGroup;
                    BentoImage.BentoImage(asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg, null, modifierM5169size3ABfNKs, null, null, 0.0f, null, composerStartRestartGroup, 48, 120);
                    Unit unit = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier.Companion companion4 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion4);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(articleSource.getTitle(), null, null, null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, null, composer2, 817889280, 0, 15742);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer2, 48);
                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, companion4);
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.useNode();
                } else {
                    composer2.createNode(constructor3);
                }
                composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                String publisher = articleSource.getPublisher();
                int i7 = i4;
                TextStyle textS = bentoTheme.getTypography(composer2, i7).getTextS();
                long jM21426getFg20d7_KjU = bentoTheme.getColors(composer2, i7).m21426getFg20d7_KjU();
                FontWeight.Companion companion5 = FontWeight.INSTANCE;
                BentoText2.m20747BentoText38GnDrw(publisher, null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, companion5.getBold(), null, null, 0, false, 0, 0, null, 0, textS, composer2, 24576, 0, 8170);
                composer2.startReplaceGroup(-312617520);
                if (articleSource.getUrl() != null) {
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.ARROW_DIAGONAL_UP_16), null, bentoTheme.getColors(composer2, i7).m21426getFg20d7_KjU(), null, null, false, composer2, BentoIcon4.Size16.$stable | 48, 56);
                }
                composer2.endReplaceGroup();
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion4, bentoTheme.getSpacing(composer2, i7).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
                String strStringResource = StringResources_androidKt.stringResource(C12073R.string.cortex_digest_article_source_dot, composer2, 0);
                TextStyle textS2 = bentoTheme.getTypography(composer2, i7).getTextS();
                long jM21426getFg20d7_KjU2 = bentoTheme.getColors(composer2, i7).m21426getFg20d7_KjU();
                composer3 = composer2;
                BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM5144paddingVpY3zN4$default, Color.m6701boximpl(jM21426getFg20d7_KjU2), null, companion5.getBold(), null, null, 0, false, 0, 0, null, 0, textS2, composer3, 24576, 0, 8168);
                BentoText2.m20747BentoText38GnDrw(CortexArticleSourceItem$lambda$7(snapshotState4), null, Color.m6701boximpl(bentoTheme.getColors(composer3, i7).m21426getFg20d7_KjU()), null, companion5.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i7).getTextS(), composer3, 24576, 0, 8170);
                composer3.endNode();
                composer3.endNode();
                composer3.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer3 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cortex.digest.common.sources.CortexArticleSourcesKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CortexArticleSources3.CortexArticleSourceItem$lambda$15(articleSource, function1, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            current = LocalClock3.getLocalClock().getCurrent(composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            final Resources resources2 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            SnapshotState4 snapshotState42 = (SnapshotState4) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            publishedAt = articleSource.getPublishedAt();
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            zChangedInstance = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(publishedAt);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue3 = new CortexArticleSources4(current, publishedAt, snapshotState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(publishedAt, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance2 = ((i3 & 112) != 32) | composerStartRestartGroup.changedInstance(articleSource);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.cortex.digest.common.sources.CortexArticleSourcesKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CortexArticleSources3.CortexArticleSourceItem$lambda$10$lambda$9(function1, articleSource);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier52 = modifier4;
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(ClickableKt.m4893clickableXHw0xAI$default(modifier4, false, null, null, (Function0) objRememberedValue4, 7, null), 0.0f, 1, null);
                    BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                    int i62 = BentoTheme.$stable;
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifierFillMaxWidth$default2, bentoTheme22.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM(), composerStartRestartGroup, 0, 0);
                    Alignment.Companion companion22 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically2 = companion22.getCenterVertically();
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21623defaultHorizontalPaddingrAjV9yQ2);
                    ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor4 = companion32.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy3, companion32.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion32.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion32.getSetModifier());
                        Row6 row62 = Row6.INSTANCE;
                        iconUrl = articleSource.getIconUrl();
                        composerStartRestartGroup.startReplaceGroup(845774595);
                        if (iconUrl != null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier.Companion companion42 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion22.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion42);
                        Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                        setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl2.getInserting()) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                            Column6 column62 = Column6.INSTANCE;
                            composer2 = composerStartRestartGroup;
                            BentoText2.m20747BentoText38GnDrw(articleSource.getTitle(), null, null, null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, null, composer2, 817889280, 0, 15742);
                            MeasurePolicy measurePolicyRowMeasurePolicy22 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion22.getCenterVertically(), composer2, 48);
                            currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap32 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composer2, companion42);
                            Function0<ComposeUiNode> constructor32 = companion32.getConstructor();
                            if (composer2.getApplier() == null) {
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                            }
                            composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy22, companion32.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion32.getSetResolvedCompositionLocals());
                            setCompositeKeyHash3 = companion32.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl3.getInserting()) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion32.getSetModifier());
                                String publisher2 = articleSource.getPublisher();
                                int i72 = i4;
                                TextStyle textS3 = bentoTheme.getTypography(composer2, i72).getTextS();
                                long jM21426getFg20d7_KjU3 = bentoTheme.getColors(composer2, i72).m21426getFg20d7_KjU();
                                FontWeight.Companion companion52 = FontWeight.INSTANCE;
                                BentoText2.m20747BentoText38GnDrw(publisher2, null, Color.m6701boximpl(jM21426getFg20d7_KjU3), null, companion52.getBold(), null, null, 0, false, 0, 0, null, 0, textS3, composer2, 24576, 0, 8170);
                                composer2.startReplaceGroup(-312617520);
                                if (articleSource.getUrl() != null) {
                                }
                                composer2.endReplaceGroup();
                                Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(companion42, bentoTheme.getSpacing(composer2, i72).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
                                String strStringResource2 = StringResources_androidKt.stringResource(C12073R.string.cortex_digest_article_source_dot, composer2, 0);
                                TextStyle textS22 = bentoTheme.getTypography(composer2, i72).getTextS();
                                long jM21426getFg20d7_KjU22 = bentoTheme.getColors(composer2, i72).m21426getFg20d7_KjU();
                                composer3 = composer2;
                                BentoText2.m20747BentoText38GnDrw(strStringResource2, modifierM5144paddingVpY3zN4$default2, Color.m6701boximpl(jM21426getFg20d7_KjU22), null, companion52.getBold(), null, null, 0, false, 0, 0, null, 0, textS22, composer3, 24576, 0, 8168);
                                BentoText2.m20747BentoText38GnDrw(CortexArticleSourceItem$lambda$7(snapshotState42), null, Color.m6701boximpl(bentoTheme.getColors(composer3, i72).m21426getFg20d7_KjU()), null, companion52.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i72).getTextS(), composer3, 24576, 0, 8170);
                                composer3.endNode();
                                composer3.endNode();
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier52;
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String CortexArticleSourceItem$lambda$6$lambda$5(Resources resources, ArticleSource articleSource, SnapshotState snapshotState) {
        Intrinsics.checkNotNull(resources);
        Duration durationBetween = Duration.between(articleSource.getPublishedAt(), CortexArticleSourceItem$lambda$3(snapshotState));
        Intrinsics.checkNotNullExpressionValue(durationBetween, "between(...)");
        return DurationFormatter.formatNarrow(resources, durationBetween, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CortexArticleSourceItem$lambda$10$lambda$9(Function1 function1, ArticleSource articleSource) {
        function1.invoke(articleSource);
        return Unit.INSTANCE;
    }
}
