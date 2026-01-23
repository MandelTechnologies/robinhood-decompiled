package com.robinhood.android.cortex.digest.common.sources;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.cortex.digest.common.sources.CortexArticleSourceOverlfowComposable3;
import com.robinhood.android.cortex.models.ArticleSource;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import okhttp3.HttpUrl;

/* compiled from: CortexArticleSourceOverlfowComposable.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aG\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"CortexArticleSourceOverflowComposable", "", "articleSources", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/cortex/models/ArticleSource;", "onArticleSourceWithoutUrlClick", "Lkotlin/Function1;", "onBackClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-cortex-digest-common_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cortex.digest.common.sources.CortexArticleSourceOverlfowComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CortexArticleSourceOverlfowComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CortexArticleSourceOverflowComposable$lambda$0(ImmutableList immutableList, Function1 function1, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CortexArticleSourceOverflowComposable(immutableList, function1, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void CortexArticleSourceOverflowComposable(final ImmutableList<ArticleSource> articleSources, final Function1<? super ArticleSource, Unit> onArticleSourceWithoutUrlClick, final Function0<Unit> onBackClick, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(articleSources, "articleSources");
        Intrinsics.checkNotNullParameter(onArticleSourceWithoutUrlClick, "onArticleSourceWithoutUrlClick");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1207038640);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(articleSources) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onArticleSourceWithoutUrlClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackClick) ? 256 : 128;
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
                ComposerKt.traceEventStart(-1207038640, i3, -1, "com.robinhood.android.cortex.digest.common.sources.CortexArticleSourceOverflowComposable (CortexArticleSourceOverlfowComposable.kt:26)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1052728731, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.common.sources.CortexArticleSourceOverlfowComposableKt.CortexArticleSourceOverflowComposable.1
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
                        ComposerKt.traceEventStart(-1052728731, i5, -1, "com.robinhood.android.cortex.digest.common.sources.CortexArticleSourceOverflowComposable.<anonymous> (CortexArticleSourceOverlfowComposable.kt:28)");
                    }
                    Modifier modifier2 = modifier;
                    final Function0<Unit> function0 = onBackClick;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1138499551, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.common.sources.CortexArticleSourceOverlfowComposableKt.CortexArticleSourceOverflowComposable.1.1
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
                                ComposerKt.traceEventStart(-1138499551, i6, -1, "com.robinhood.android.cortex.digest.common.sources.CortexArticleSourceOverflowComposable.<anonymous>.<anonymous> (CortexArticleSourceOverlfowComposable.kt:31)");
                            }
                            Function2<Composer, Integer, Unit> function2M12578getLambda$1535719212$lib_cortex_digest_common_externalDebug = CortexArticleSourceOverlfowComposable.INSTANCE.m12578getLambda$1535719212$lib_cortex_digest_common_externalDebug();
                            final Function0<Unit> function02 = function0;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M12578getLambda$1535719212$lib_cortex_digest_common_externalDebug, null, ComposableLambda3.rememberComposableLambda(-1768136704, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.cortex.digest.common.sources.CortexArticleSourceOverlfowComposableKt.CortexArticleSourceOverflowComposable.1.1.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                    invoke(bentoAppBarScope, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i7) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i7 & 6) == 0) {
                                        i7 |= (i7 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                    }
                                    if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1768136704, i7, -1, "com.robinhood.android.cortex.digest.common.sources.CortexArticleSourceOverflowComposable.<anonymous>.<anonymous>.<anonymous> (CortexArticleSourceOverlfowComposable.kt:41)");
                                    }
                                    BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function02, composer4, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), null, null, true, false, null, null, 0L, null, composer3, 196998, 0, 2010);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifier2, composableLambdaRememberComposableLambda, null, null, null, 0, bentoTheme.getColors(composer2, i6).m21371getBg0d7_KjU(), bentoTheme.getColors(composer2, i6).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(-1227226570, true, new AnonymousClass2(articleSources, onArticleSourceWithoutUrlClick), composer2, 54), composer2, 805306416, 316);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: CortexArticleSourceOverlfowComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.cortex.digest.common.sources.CortexArticleSourceOverlfowComposableKt$CortexArticleSourceOverflowComposable$1$2, reason: invalid class name */
                static final class AnonymousClass2 implements Function3<PaddingValues, Composer, Integer, Unit> {
                    final /* synthetic */ ImmutableList<ArticleSource> $articleSources;
                    final /* synthetic */ Function1<ArticleSource, Unit> $onArticleSourceWithoutUrlClick;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass2(ImmutableList<ArticleSource> immutableList, Function1<? super ArticleSource, Unit> function1) {
                        this.$articleSources = immutableList;
                        this.$onArticleSourceWithoutUrlClick = function1;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                        invoke(paddingValues, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues it, Composer composer, int i) {
                        int i2;
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((i & 6) == 0) {
                            i2 = i | (composer.changed(it) ? 4 : 2);
                        } else {
                            i2 = i;
                        }
                        if ((i2 & 19) == 18 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1227226570, i2, -1, "com.robinhood.android.cortex.digest.common.sources.CortexArticleSourceOverflowComposable.<anonymous>.<anonymous> (CortexArticleSourceOverlfowComposable.kt:50)");
                        }
                        final Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, it);
                        composer.startReplaceGroup(-1746271574);
                        boolean zChangedInstance = composer.changedInstance(this.$articleSources) | composer.changed(this.$onArticleSourceWithoutUrlClick) | composer.changedInstance(context);
                        final ImmutableList<ArticleSource> immutableList = this.$articleSources;
                        final Function1<ArticleSource, Unit> function1 = this.$onArticleSourceWithoutUrlClick;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.cortex.digest.common.sources.CortexArticleSourceOverlfowComposableKt$CortexArticleSourceOverflowComposable$1$2$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CortexArticleSourceOverlfowComposable3.C120801.AnonymousClass2.invoke$lambda$2$lambda$1(immutableList, function1, context, (LazyListScope) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        LazyDslKt.LazyColumn(modifierPadding, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 510);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$2$lambda$1(ImmutableList immutableList, final Function1 function1, final Context context, LazyListScope LazyColumn) {
                        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                        CortexArticleSources3.articleSourceItems(LazyColumn, immutableList, new Function1() { // from class: com.robinhood.android.cortex.digest.common.sources.CortexArticleSourceOverlfowComposableKt$CortexArticleSourceOverflowComposable$1$2$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CortexArticleSourceOverlfowComposable3.C120801.AnonymousClass2.invoke$lambda$2$lambda$1$lambda$0(function1, context, (ArticleSource) obj);
                            }
                        });
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$2$lambda$1$lambda$0(Function1 function1, Context context, ArticleSource articleSource) {
                        Intrinsics.checkNotNullParameter(articleSource, "articleSource");
                        HttpUrl url = articleSource.getUrl();
                        if (url == null) {
                            function1.invoke(articleSource);
                        } else {
                            WebUtils.viewUrl$default(WebUtils.INSTANCE, context, url, 0, 4, null);
                        }
                        return Unit.INSTANCE;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cortex.digest.common.sources.CortexArticleSourceOverlfowComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CortexArticleSourceOverlfowComposable3.CortexArticleSourceOverflowComposable$lambda$0(articleSources, onArticleSourceWithoutUrlClick, onBackClick, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
