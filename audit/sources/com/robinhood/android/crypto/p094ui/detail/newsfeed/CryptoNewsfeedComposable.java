package com.robinhood.android.crypto.p094ui.detail.newsfeed;

import android.content.res.Resources;
import androidx.compose.animation.AnimationModifier;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.crypto.C12757R;
import com.robinhood.android.crypto.p094ui.detail.newsfeed.CryptoNewsfeedComposable;
import com.robinhood.android.crypto.p094ui.detail.newsfeed.section.NewsfeedComposable3;
import com.robinhood.android.crypto.p094ui.detail.newsfeed.section.NewsfeedRowState;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.duxo.DuxosKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoNewsfeedComposable.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002"}, m3636d2 = {"CryptoNewsfeedComposable", "", "onNavigationIconClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/crypto/ui/detail/newsfeed/CryptoNewsfeedDuxo;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/crypto/ui/detail/newsfeed/CryptoNewsfeedDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-crypto_externalDebug", "viewState", "Lcom/robinhood/android/crypto/ui/detail/newsfeed/CryptoNewsfeedViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoNewsfeedComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoNewsfeedComposable$lambda$1(Function0 function0, Modifier modifier, CryptoNewsfeedDuxo cryptoNewsfeedDuxo, int i, int i2, Composer composer, int i3) {
        CryptoNewsfeedComposable(function0, modifier, cryptoNewsfeedDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoNewsfeedComposable(final Function0<Unit> onNavigationIconClick, Modifier modifier, CryptoNewsfeedDuxo cryptoNewsfeedDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoNewsfeedDuxo cryptoNewsfeedDuxo2;
        final Modifier modifier3;
        int i4;
        CryptoNewsfeedDuxo cryptoNewsfeedDuxo3;
        final CryptoNewsfeedDuxo cryptoNewsfeedDuxo4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onNavigationIconClick, "onNavigationIconClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1994681236);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onNavigationIconClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    cryptoNewsfeedDuxo2 = cryptoNewsfeedDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(cryptoNewsfeedDuxo2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    cryptoNewsfeedDuxo2 = cryptoNewsfeedDuxo;
                }
                i3 |= i6;
            } else {
                cryptoNewsfeedDuxo2 = cryptoNewsfeedDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoNewsfeedDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposableKt$CryptoNewsfeedComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposableKt$CryptoNewsfeedComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        CryptoNewsfeedDuxo cryptoNewsfeedDuxo5 = (CryptoNewsfeedDuxo) baseDuxo;
                        i4 = i3 & (-897);
                        cryptoNewsfeedDuxo3 = cryptoNewsfeedDuxo5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1994681236, i4, -1, "com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposable (CryptoNewsfeedComposable.kt:26)");
                    }
                    final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoNewsfeedDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.FALSE, null, null, ComposableLambda3.rememberComposableLambda(549875124, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposableKt.CryptoNewsfeedComposable.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i7) {
                            if ((i7 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(549875124, i7, -1, "com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposable.<anonymous> (CryptoNewsfeedComposable.kt:32)");
                            }
                            Modifier modifier5 = modifier3;
                            final SnapshotState4<CryptoNewsfeedViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                            final Function0<Unit> function0 = onNavigationIconClick;
                            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, ComposableLambda3.rememberComposableLambda(854070384, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposableKt.CryptoNewsfeedComposable.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i8) {
                                    if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(854070384, i8, -1, "com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposable.<anonymous>.<anonymous> (CryptoNewsfeedComposable.kt:35)");
                                    }
                                    final SnapshotState4<CryptoNewsfeedViewState> snapshotState42 = snapshotState4;
                                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-469995933, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposableKt.CryptoNewsfeedComposable.1.1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) throws Resources.NotFoundException {
                                            invoke(composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer4, int i9) throws Resources.NotFoundException {
                                            if ((i9 & 3) == 2 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-469995933, i9, -1, "com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposable.<anonymous>.<anonymous>.<anonymous> (CryptoNewsfeedComposable.kt:37)");
                                            }
                                            String symbol = CryptoNewsfeedComposable.CryptoNewsfeedComposable$lambda$0(snapshotState42).getSymbol();
                                            if (symbol != null) {
                                                Modifier.Companion companion = Modifier.INSTANCE;
                                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                                int i10 = BentoTheme.$stable;
                                                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer4, i10).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
                                                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12757R.string.crypto_detail_news_v2_title, new Object[]{symbol}, composer4, 0), modifierM5144paddingVpY3zN4$default, null, null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme.getTypography(composer4, i10).getTextL(), composer4, 817889280, 0, 7548);
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54);
                                    final Function0<Unit> function02 = function0;
                                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableLambdaRememberComposableLambda, null, ComposableLambda3.rememberComposableLambda(1695183503, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposableKt.CryptoNewsfeedComposable.1.1.2
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                            invoke(bentoAppBarScope, composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i9) {
                                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                            if ((i9 & 6) == 0) {
                                                i9 |= (i9 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                            }
                                            if ((i9 & 19) == 18 && composer4.getSkipping()) {
                                                composer4.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1695183503, i9, -1, "com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposable.<anonymous>.<anonymous>.<anonymous> (CryptoNewsfeedComposable.kt:48)");
                                            }
                                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function02, composer4, (BentoAppBarScope.$stable << 12) | ((i9 << 12) & 57344), 7);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1228202821, true, new AnonymousClass2(snapshotState4CollectAsStateWithLifecycle), composer2, 54), composer2, 805306416, 508);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: CryptoNewsfeedComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposableKt$CryptoNewsfeedComposable$1$2, reason: invalid class name */
                        static final class AnonymousClass2 implements Function3<PaddingValues, Composer, Integer, Unit> {
                            final /* synthetic */ SnapshotState4<CryptoNewsfeedViewState> $viewState$delegate;

                            AnonymousClass2(SnapshotState4<CryptoNewsfeedViewState> snapshotState4) {
                                this.$viewState$delegate = snapshotState4;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                                invoke(paddingValues, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                                int i2;
                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                if ((i & 6) == 0) {
                                    i2 = i | (composer.changed(paddingValues) ? 4 : 2);
                                } else {
                                    i2 = i;
                                }
                                if ((i2 & 19) == 18 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1228202821, i2, -1, "com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposable.<anonymous>.<anonymous> (CryptoNewsfeedComposable.kt:55)");
                                }
                                Modifier modifierAnimateContentSize$default = AnimationModifier.animateContentSize$default(SizeKt.fillMaxWidth$default(PaddingKt.padding(Modifier.INSTANCE, paddingValues), 0.0f, 1, null), null, null, 3, null);
                                composer.startReplaceGroup(5004770);
                                boolean zChanged = composer.changed(this.$viewState$delegate);
                                final SnapshotState4<CryptoNewsfeedViewState> snapshotState4 = this.$viewState$delegate;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1() { // from class: com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposableKt$CryptoNewsfeedComposable$1$2$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return CryptoNewsfeedComposable.C133581.AnonymousClass2.invoke$lambda$2$lambda$1(snapshotState4, (LazyListScope) obj);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                LazyDslKt.LazyColumn(modifierAnimateContentSize$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 510);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$2$lambda$1(SnapshotState4 snapshotState4, LazyListScope LazyColumn) {
                                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                                final ImmutableList<NewsfeedRowState> newsfeeds = CryptoNewsfeedComposable.CryptoNewsfeedComposable$lambda$0(snapshotState4).getNewsfeeds();
                                final C13354x7449cc4c c13354x7449cc4c = new Function1() { // from class: com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposableKt$CryptoNewsfeedComposable$1$2$invoke$lambda$2$lambda$1$$inlined$items$default$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Void invoke(NewsfeedRowState newsfeedRowState) {
                                        return null;
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        return invoke((NewsfeedRowState) obj);
                                    }
                                };
                                LazyColumn.items(newsfeeds.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposableKt$CryptoNewsfeedComposable$1$2$invoke$lambda$2$lambda$1$$inlined$items$default$3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                        return invoke(num.intValue());
                                    }

                                    public final Object invoke(int i) {
                                        return c13354x7449cc4c.invoke(newsfeeds.get(i));
                                    }
                                }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposableKt$CryptoNewsfeedComposable$1$2$invoke$lambda$2$lambda$1$$inlined$items$default$4
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
                                            ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                                        }
                                        NewsfeedRowState newsfeedRowState = (NewsfeedRowState) newsfeeds.get(i);
                                        composer.startReplaceGroup(1571734766);
                                        NewsfeedComposable3.NewsfeedComposable(newsfeedRowState, null, composer, 0, 2);
                                        composer.endReplaceGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }));
                                return Unit.INSTANCE;
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
                    composerStartRestartGroup = composerStartRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    Modifier modifier5 = modifier3;
                    cryptoNewsfeedDuxo4 = cryptoNewsfeedDuxo3;
                    modifier4 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier3 = modifier2;
                }
                i4 = i3;
                cryptoNewsfeedDuxo3 = cryptoNewsfeedDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4<CryptoNewsfeedViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(cryptoNewsfeedDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.FALSE, null, null, ComposableLambda3.rememberComposableLambda(549875124, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposableKt.CryptoNewsfeedComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(549875124, i7, -1, "com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposable.<anonymous> (CryptoNewsfeedComposable.kt:32)");
                        }
                        Modifier modifier52 = modifier3;
                        final SnapshotState4<CryptoNewsfeedViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle2;
                        final Function0<Unit> function0 = onNavigationIconClick;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifier52, ComposableLambda3.rememberComposableLambda(854070384, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposableKt.CryptoNewsfeedComposable.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i8) {
                                if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(854070384, i8, -1, "com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposable.<anonymous>.<anonymous> (CryptoNewsfeedComposable.kt:35)");
                                }
                                final SnapshotState4<CryptoNewsfeedViewState> snapshotState42 = snapshotState4;
                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-469995933, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposableKt.CryptoNewsfeedComposable.1.1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) throws Resources.NotFoundException {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i9) throws Resources.NotFoundException {
                                        if ((i9 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-469995933, i9, -1, "com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposable.<anonymous>.<anonymous>.<anonymous> (CryptoNewsfeedComposable.kt:37)");
                                        }
                                        String symbol = CryptoNewsfeedComposable.CryptoNewsfeedComposable$lambda$0(snapshotState42).getSymbol();
                                        if (symbol != null) {
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                            int i10 = BentoTheme.$stable;
                                            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer4, i10).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
                                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12757R.string.crypto_detail_news_v2_title, new Object[]{symbol}, composer4, 0), modifierM5144paddingVpY3zN4$default, null, null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme.getTypography(composer4, i10).getTextL(), composer4, 817889280, 0, 7548);
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54);
                                final Function0<Unit> function02 = function0;
                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableLambdaRememberComposableLambda, null, ComposableLambda3.rememberComposableLambda(1695183503, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposableKt.CryptoNewsfeedComposable.1.1.2
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                        invoke(bentoAppBarScope, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i9) {
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i9 & 6) == 0) {
                                            i9 |= (i9 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                        }
                                        if ((i9 & 19) == 18 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1695183503, i9, -1, "com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposable.<anonymous>.<anonymous>.<anonymous> (CryptoNewsfeedComposable.kt:48)");
                                        }
                                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function02, composer4, (BentoAppBarScope.$stable << 12) | ((i9 << 12) & 57344), 7);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1228202821, true, new AnonymousClass2(snapshotState4CollectAsStateWithLifecycle2), composer2, 54), composer2, 805306416, 508);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: CryptoNewsfeedComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposableKt$CryptoNewsfeedComposable$1$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function3<PaddingValues, Composer, Integer, Unit> {
                        final /* synthetic */ SnapshotState4<CryptoNewsfeedViewState> $viewState$delegate;

                        AnonymousClass2(SnapshotState4<CryptoNewsfeedViewState> snapshotState4) {
                            this.$viewState$delegate = snapshotState4;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                            invoke(paddingValues, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                            int i2;
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i & 6) == 0) {
                                i2 = i | (composer.changed(paddingValues) ? 4 : 2);
                            } else {
                                i2 = i;
                            }
                            if ((i2 & 19) == 18 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1228202821, i2, -1, "com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposable.<anonymous>.<anonymous> (CryptoNewsfeedComposable.kt:55)");
                            }
                            Modifier modifierAnimateContentSize$default = AnimationModifier.animateContentSize$default(SizeKt.fillMaxWidth$default(PaddingKt.padding(Modifier.INSTANCE, paddingValues), 0.0f, 1, null), null, null, 3, null);
                            composer.startReplaceGroup(5004770);
                            boolean zChanged = composer.changed(this.$viewState$delegate);
                            final SnapshotState4 snapshotState4 = this.$viewState$delegate;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposableKt$CryptoNewsfeedComposable$1$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return CryptoNewsfeedComposable.C133581.AnonymousClass2.invoke$lambda$2$lambda$1(snapshotState4, (LazyListScope) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            LazyDslKt.LazyColumn(modifierAnimateContentSize$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 510);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$2$lambda$1(SnapshotState4 snapshotState4, LazyListScope LazyColumn) {
                            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                            final List newsfeeds = CryptoNewsfeedComposable.CryptoNewsfeedComposable$lambda$0(snapshotState4).getNewsfeeds();
                            final Function1 c13354x7449cc4c = new Function1() { // from class: com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposableKt$CryptoNewsfeedComposable$1$2$invoke$lambda$2$lambda$1$$inlined$items$default$1
                                @Override // kotlin.jvm.functions.Function1
                                public final Void invoke(NewsfeedRowState newsfeedRowState) {
                                    return null;
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return invoke((NewsfeedRowState) obj);
                                }
                            };
                            LazyColumn.items(newsfeeds.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposableKt$CryptoNewsfeedComposable$1$2$invoke$lambda$2$lambda$1$$inlined$items$default$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                    return invoke(num.intValue());
                                }

                                public final Object invoke(int i) {
                                    return c13354x7449cc4c.invoke(newsfeeds.get(i));
                                }
                            }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposableKt$CryptoNewsfeedComposable$1$2$invoke$lambda$2$lambda$1$$inlined$items$default$4
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
                                        ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                                    }
                                    NewsfeedRowState newsfeedRowState = (NewsfeedRowState) newsfeeds.get(i);
                                    composer.startReplaceGroup(1571734766);
                                    NewsfeedComposable3.NewsfeedComposable(newsfeedRowState, null, composer, 0, 2);
                                    composer.endReplaceGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }));
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier52 = modifier3;
                cryptoNewsfeedDuxo4 = cryptoNewsfeedDuxo3;
                modifier4 = modifier52;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                cryptoNewsfeedDuxo4 = cryptoNewsfeedDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoNewsfeedComposable.CryptoNewsfeedComposable$lambda$1(onNavigationIconClick, modifier4, cryptoNewsfeedDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i3 & 147) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 4) == 0) {
                    i4 = i3;
                    cryptoNewsfeedDuxo3 = cryptoNewsfeedDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4<CryptoNewsfeedViewState> snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(cryptoNewsfeedDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.FALSE, null, null, ComposableLambda3.rememberComposableLambda(549875124, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposableKt.CryptoNewsfeedComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(549875124, i7, -1, "com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposable.<anonymous> (CryptoNewsfeedComposable.kt:32)");
                        }
                        Modifier modifier522 = modifier3;
                        final SnapshotState4<CryptoNewsfeedViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle22;
                        final Function0<Unit> function0 = onNavigationIconClick;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifier522, ComposableLambda3.rememberComposableLambda(854070384, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposableKt.CryptoNewsfeedComposable.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i8) {
                                if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(854070384, i8, -1, "com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposable.<anonymous>.<anonymous> (CryptoNewsfeedComposable.kt:35)");
                                }
                                final SnapshotState4<CryptoNewsfeedViewState> snapshotState42 = snapshotState4;
                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-469995933, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposableKt.CryptoNewsfeedComposable.1.1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) throws Resources.NotFoundException {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i9) throws Resources.NotFoundException {
                                        if ((i9 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-469995933, i9, -1, "com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposable.<anonymous>.<anonymous>.<anonymous> (CryptoNewsfeedComposable.kt:37)");
                                        }
                                        String symbol = CryptoNewsfeedComposable.CryptoNewsfeedComposable$lambda$0(snapshotState42).getSymbol();
                                        if (symbol != null) {
                                            Modifier.Companion companion = Modifier.INSTANCE;
                                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                            int i10 = BentoTheme.$stable;
                                            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer4, i10).m21593getSmallD9Ej5fM(), 0.0f, 2, null);
                                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12757R.string.crypto_detail_news_v2_title, new Object[]{symbol}, composer4, 0), modifierM5144paddingVpY3zN4$default, null, null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme.getTypography(composer4, i10).getTextL(), composer4, 817889280, 0, 7548);
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54);
                                final Function0<Unit> function02 = function0;
                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableLambdaRememberComposableLambda, null, ComposableLambda3.rememberComposableLambda(1695183503, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposableKt.CryptoNewsfeedComposable.1.1.2
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                        invoke(bentoAppBarScope, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i9) {
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i9 & 6) == 0) {
                                            i9 |= (i9 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                        }
                                        if ((i9 & 19) == 18 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1695183503, i9, -1, "com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposable.<anonymous>.<anonymous>.<anonymous> (CryptoNewsfeedComposable.kt:48)");
                                        }
                                        BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function02, composer4, (BentoAppBarScope.$stable << 12) | ((i9 << 12) & 57344), 7);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1228202821, true, new AnonymousClass2(snapshotState4CollectAsStateWithLifecycle22), composer2, 54), composer2, 805306416, 508);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: CryptoNewsfeedComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposableKt$CryptoNewsfeedComposable$1$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function3<PaddingValues, Composer, Integer, Unit> {
                        final /* synthetic */ SnapshotState4<CryptoNewsfeedViewState> $viewState$delegate;

                        AnonymousClass2(SnapshotState4<CryptoNewsfeedViewState> snapshotState4) {
                            this.$viewState$delegate = snapshotState4;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                            invoke(paddingValues, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                            int i2;
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i & 6) == 0) {
                                i2 = i | (composer.changed(paddingValues) ? 4 : 2);
                            } else {
                                i2 = i;
                            }
                            if ((i2 & 19) == 18 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1228202821, i2, -1, "com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposable.<anonymous>.<anonymous> (CryptoNewsfeedComposable.kt:55)");
                            }
                            Modifier modifierAnimateContentSize$default = AnimationModifier.animateContentSize$default(SizeKt.fillMaxWidth$default(PaddingKt.padding(Modifier.INSTANCE, paddingValues), 0.0f, 1, null), null, null, 3, null);
                            composer.startReplaceGroup(5004770);
                            boolean zChanged = composer.changed(this.$viewState$delegate);
                            final SnapshotState4 snapshotState4 = this.$viewState$delegate;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposableKt$CryptoNewsfeedComposable$1$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return CryptoNewsfeedComposable.C133581.AnonymousClass2.invoke$lambda$2$lambda$1(snapshotState4, (LazyListScope) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            LazyDslKt.LazyColumn(modifierAnimateContentSize$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 510);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$2$lambda$1(SnapshotState4 snapshotState4, LazyListScope LazyColumn) {
                            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                            final List newsfeeds = CryptoNewsfeedComposable.CryptoNewsfeedComposable$lambda$0(snapshotState4).getNewsfeeds();
                            final Function1 c13354x7449cc4c = new Function1() { // from class: com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposableKt$CryptoNewsfeedComposable$1$2$invoke$lambda$2$lambda$1$$inlined$items$default$1
                                @Override // kotlin.jvm.functions.Function1
                                public final Void invoke(NewsfeedRowState newsfeedRowState) {
                                    return null;
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    return invoke((NewsfeedRowState) obj);
                                }
                            };
                            LazyColumn.items(newsfeeds.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposableKt$CryptoNewsfeedComposable$1$2$invoke$lambda$2$lambda$1$$inlined$items$default$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                    return invoke(num.intValue());
                                }

                                public final Object invoke(int i) {
                                    return c13354x7449cc4c.invoke(newsfeeds.get(i));
                                }
                            }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.newsfeed.CryptoNewsfeedComposableKt$CryptoNewsfeedComposable$1$2$invoke$lambda$2$lambda$1$$inlined$items$default$4
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
                                        ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                                    }
                                    NewsfeedRowState newsfeedRowState = (NewsfeedRowState) newsfeeds.get(i);
                                    composer.startReplaceGroup(1571734766);
                                    NewsfeedComposable3.NewsfeedComposable(newsfeedRowState, null, composer, 0, 2);
                                    composer.endReplaceGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }));
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier522 = modifier3;
                cryptoNewsfeedDuxo4 = cryptoNewsfeedDuxo3;
                modifier4 = modifier522;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoNewsfeedViewState CryptoNewsfeedComposable$lambda$0(SnapshotState4<CryptoNewsfeedViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
