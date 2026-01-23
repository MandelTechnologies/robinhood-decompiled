package com.robinhood.android.options.comboorders.detail;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.options.comboorders.detail.components.actionrows.ComboOrderDetailActionRowsComposable;
import com.robinhood.android.options.comboorders.detail.components.actionrows.ComboOrderDetailActionRowsDuxo;
import com.robinhood.android.options.comboorders.detail.components.infogrid.ComboOrderDetailInfoGridComposable;
import com.robinhood.android.options.comboorders.detail.components.infogrid.ComboOrderDetailInfoGridDuxo;
import com.robinhood.android.options.comboorders.detail.components.legs.ComboOrderDetailLegsSectionComposable;
import com.robinhood.android.options.comboorders.detail.components.legs.ComboOrderDetailLegsSectionDuxo;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* compiled from: ComboOrderDetailComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ComposableSingletons$ComboOrderDetailComposableKt {
    public static final ComposableSingletons$ComboOrderDetailComposableKt INSTANCE = new ComposableSingletons$ComboOrderDetailComposableKt();
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$601616354 = ComposableLambda3.composableLambdaInstance(601616354, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.comboorders.detail.ComposableSingletons$ComboOrderDetailComposableKt$lambda$601616354$1
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
                ComposerKt.traceEventStart(601616354, i, -1, "com.robinhood.android.options.comboorders.detail.ComposableSingletons$ComboOrderDetailComposableKt.lambda$601616354.<anonymous> (ComboOrderDetailComposable.kt:73)");
            }
            BentoText2.m20747BentoText38GnDrw("---- -- - -----", PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, C2002Dp.m7995constructorimpl(16), 0.0f, 0.0f, 13, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 54, 0, 16380);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1887701749, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f9132lambda$1887701749 = ComposableLambda3.composableLambdaInstance(-1887701749, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.comboorders.detail.ComposableSingletons$ComboOrderDetailComposableKt$lambda$-1887701749$1
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
                ComposerKt.traceEventStart(-1887701749, i, -1, "com.robinhood.android.options.comboorders.detail.ComposableSingletons$ComboOrderDetailComposableKt.lambda$-1887701749.<anonymous> (ComboOrderDetailComposable.kt:80)");
            }
            BentoText2.m20747BentoText38GnDrw("---- -- - -----", PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(16), 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 54, 0, 16380);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1922320298 = ComposableLambda3.composableLambdaInstance(1922320298, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.comboorders.detail.ComposableSingletons$ComboOrderDetailComposableKt$lambda$1922320298$1
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
                ComposerKt.traceEventStart(1922320298, i, -1, "com.robinhood.android.options.comboorders.detail.ComposableSingletons$ComboOrderDetailComposableKt.lambda$1922320298.<anonymous> (ComboOrderDetailComposable.kt:87)");
            }
            BentoText2.m20747BentoText38GnDrw("- ------- ---", PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(16), 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, ((Styles) composer.consume(Styles2.getLocalStyles())).getLoadingPlaceholderStyle(composer, 0).getHeaderTextStyle(), composer, 54, 0, 8188);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1437375049 = ComposableLambda3.composableLambdaInstance(1437375049, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.comboorders.detail.ComposableSingletons$ComboOrderDetailComposableKt$lambda$1437375049$1
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
                ComposerKt.traceEventStart(1437375049, i, -1, "com.robinhood.android.options.comboorders.detail.ComposableSingletons$ComboOrderDetailComposableKt.lambda$1437375049.<anonymous> (ComboOrderDetailComposable.kt:95)");
            }
            BoxKt.Box(ModifiersKt.bentoPlaceholder$default(SizeKt.m5156height3ABfNKs(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, C2002Dp.m7995constructorimpl(16), 1, null), C2002Dp.m7995constructorimpl(200)), true, null, 2, null), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$952429800 = ComposableLambda3.composableLambdaInstance(952429800, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.comboorders.detail.ComposableSingletons$ComboOrderDetailComposableKt$lambda$952429800$1
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
                ComposerKt.traceEventStart(952429800, i, -1, "com.robinhood.android.options.comboorders.detail.ComposableSingletons$ComboOrderDetailComposableKt.lambda$952429800.<anonymous> (ComboOrderDetailComposable.kt:105)");
            }
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C2002Dp.m7995constructorimpl(50)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$467484551 = ComposableLambda3.composableLambdaInstance(467484551, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.comboorders.detail.ComposableSingletons$ComboOrderDetailComposableKt$lambda$467484551$1
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
                ComposerKt.traceEventStart(467484551, i, -1, "com.robinhood.android.options.comboorders.detail.ComposableSingletons$ComboOrderDetailComposableKt.lambda$467484551.<anonymous> (ComboOrderDetailComposable.kt:109)");
            }
            BentoText2.m20747BentoText38GnDrw("- -------", PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, C2002Dp.m7995constructorimpl(16), 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 54, 0, 16380);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-17460698, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f9131lambda$17460698 = ComposableLambda3.composableLambdaInstance(-17460698, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.comboorders.detail.ComposableSingletons$ComboOrderDetailComposableKt$lambda$-17460698$1
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
                ComposerKt.traceEventStart(-17460698, i, -1, "com.robinhood.android.options.comboorders.detail.ComposableSingletons$ComboOrderDetailComposableKt.lambda$-17460698.<anonymous> (ComboOrderDetailComposable.kt:116)");
            }
            BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, new BentoBaseRowState((BentoBaseRowState.Start) null, "---- -- - ------ ---- ----- ----", (String) null, (String) null, (BentoBaseRowState.Meta) new BentoBaseRowState.Meta.SingleLine("-------"), (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, (DefaultConstructorMarker) null), false, false, true, 0L, null, composer, (BentoBaseRowState.$stable << 3) | 24576, 109);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-502405947, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f9134lambda$502405947 = ComposableLambda3.composableLambdaInstance(-502405947, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.comboorders.detail.ComposableSingletons$ComboOrderDetailComposableKt$lambda$-502405947$1
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
                ComposerKt.traceEventStart(-502405947, i, -1, "com.robinhood.android.options.comboorders.detail.ComposableSingletons$ComboOrderDetailComposableKt.lambda$-502405947.<anonymous> (ComboOrderDetailComposable.kt:126)");
            }
            BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, new BentoBaseRowState((BentoBaseRowState.Start) null, "---- -- - ------ ---- ----- ----", (String) null, (String) null, (BentoBaseRowState.Meta) new BentoBaseRowState.Meta.SingleLine("-------"), (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, (DefaultConstructorMarker) null), false, false, true, 0L, null, composer, (BentoBaseRowState.$stable << 3) | 24576, 109);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-987351196, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f9137lambda$987351196 = ComposableLambda3.composableLambdaInstance(-987351196, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.comboorders.detail.ComposableSingletons$ComboOrderDetailComposableKt$lambda$-987351196$1
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
                ComposerKt.traceEventStart(-987351196, i, -1, "com.robinhood.android.options.comboorders.detail.ComposableSingletons$ComboOrderDetailComposableKt.lambda$-987351196.<anonymous> (ComboOrderDetailComposable.kt:136)");
            }
            BentoBaseRowKt.m20915BentoBaseRowcd68TDI(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, C2002Dp.m7995constructorimpl(48), 0.0f, 0.0f, 13, null), new BentoBaseRowState((BentoBaseRowState.Start) null, "- ------- -------- -------- ---", (String) null, (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, (DefaultConstructorMarker) null), false, false, true, 0L, null, composer, (BentoBaseRowState.$stable << 3) | 24582, 108);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1472296445, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f9129lambda$1472296445 = ComposableLambda3.composableLambdaInstance(-1472296445, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.comboorders.detail.ComposableSingletons$ComboOrderDetailComposableKt$lambda$-1472296445$1
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
                ComposerKt.traceEventStart(-1472296445, i, -1, "com.robinhood.android.options.comboorders.detail.ComposableSingletons$ComboOrderDetailComposableKt.lambda$-1472296445.<anonymous> (ComboOrderDetailComposable.kt:146)");
            }
            BentoBaseRowKt.m20915BentoBaseRowcd68TDI(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, C2002Dp.m7995constructorimpl(24), 0.0f, 0.0f, 13, null), new BentoBaseRowState((BentoBaseRowState.Start) null, "- ------- -------- -------- ---", (String) null, (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, (DefaultConstructorMarker) null), false, false, true, 0L, null, composer, (BentoBaseRowState.$stable << 3) | 24582, 108);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1753558281 = ComposableLambda3.composableLambdaInstance(1753558281, false, C23024xf2affd93.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$2056932503 = ComposableLambda3.composableLambdaInstance(2056932503, false, C23026xd08fe0fb.INSTANCE);

    /* renamed from: lambda$-1708953575, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f9130lambda$1708953575 = ComposableLambda3.composableLambdaInstance(-1708953575, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.comboorders.detail.ComposableSingletons$ComboOrderDetailComposableKt$lambda$-1708953575$1
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
                ComposerKt.traceEventStart(-1708953575, i, -1, "com.robinhood.android.options.comboorders.detail.ComposableSingletons$ComboOrderDetailComposableKt.lambda$-1708953575.<anonymous> (ComboOrderDetailComposable.kt:200)");
            }
            composer.startReplaceGroup(-747520797);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composer, 0);
            composer.startReplaceableGroup(1729797275);
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(ComboOrderDetailInfoGridDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer, 0, 0);
            composer.endReplaceableGroup();
            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
            final Lifecycle lifecycle = ((LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(baseDuxo) | composer.changedInstance(lifecycle);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.options.comboorders.detail.ComposableSingletons$ComboOrderDetailComposableKt$lambda$-1708953575$1$invoke$$inlined$duxo$1
                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                        lifecycle.addObserver(duxoLifecycleObserver);
                        final Lifecycle lifecycle2 = lifecycle;
                        return new DisposableEffectResult() { // from class: com.robinhood.android.options.comboorders.detail.ComposableSingletons$ComboOrderDetailComposableKt$lambda$-1708953575$1$invoke$$inlined$duxo$1.1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                lifecycle2.removeObserver(duxoLifecycleObserver);
                            }
                        };
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer, 0);
            composer.endReplaceGroup();
            ComboOrderDetailInfoGridComposable.ComboOrderDetailInfoGridComposable((ComboOrderDetailInfoGridDuxo) baseDuxo, null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-755710078, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f9135lambda$755710078 = ComposableLambda3.composableLambdaInstance(-755710078, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.comboorders.detail.ComposableSingletons$ComboOrderDetailComposableKt$lambda$-755710078$1
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
                ComposerKt.traceEventStart(-755710078, i, -1, "com.robinhood.android.options.comboorders.detail.ComposableSingletons$ComboOrderDetailComposableKt.lambda$-755710078.<anonymous> (ComboOrderDetailComposable.kt:205)");
            }
            composer.startReplaceGroup(-747520797);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composer, 0);
            composer.startReplaceableGroup(1729797275);
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(ComboOrderDetailLegsSectionDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer, 0, 0);
            composer.endReplaceableGroup();
            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
            final Lifecycle lifecycle = ((LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(baseDuxo) | composer.changedInstance(lifecycle);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.options.comboorders.detail.ComposableSingletons$ComboOrderDetailComposableKt$lambda$-755710078$1$invoke$$inlined$duxo$1
                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                        lifecycle.addObserver(duxoLifecycleObserver);
                        final Lifecycle lifecycle2 = lifecycle;
                        return new DisposableEffectResult() { // from class: com.robinhood.android.options.comboorders.detail.ComposableSingletons$ComboOrderDetailComposableKt$lambda$-755710078$1$invoke$$inlined$duxo$1.1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                lifecycle2.removeObserver(duxoLifecycleObserver);
                            }
                        };
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer, 0);
            composer.endReplaceGroup();
            ComboOrderDetailLegsSectionComposable.ComboOrderDetailLegsSectionComposable((ComboOrderDetailLegsSectionDuxo) baseDuxo, null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-926549535, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f9136lambda$926549535 = ComposableLambda3.composableLambdaInstance(-926549535, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.options.comboorders.detail.ComposableSingletons$ComboOrderDetailComposableKt$lambda$-926549535$1
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
                ComposerKt.traceEventStart(-926549535, i, -1, "com.robinhood.android.options.comboorders.detail.ComposableSingletons$ComboOrderDetailComposableKt.lambda$-926549535.<anonymous> (ComboOrderDetailComposable.kt:210)");
            }
            composer.startReplaceGroup(-747520797);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composer, 0);
            composer.startReplaceableGroup(1729797275);
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(ComboOrderDetailActionRowsDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer, 0, 0);
            composer.endReplaceableGroup();
            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
            final Lifecycle lifecycle = ((LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(baseDuxo) | composer.changedInstance(lifecycle);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.options.comboorders.detail.ComposableSingletons$ComboOrderDetailComposableKt$lambda$-926549535$1$invoke$$inlined$duxo$1
                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                        lifecycle.addObserver(duxoLifecycleObserver);
                        final Lifecycle lifecycle2 = lifecycle;
                        return new DisposableEffectResult() { // from class: com.robinhood.android.options.comboorders.detail.ComposableSingletons$ComboOrderDetailComposableKt$lambda$-926549535$1$invoke$$inlined$duxo$1.1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                lifecycle2.removeObserver(duxoLifecycleObserver);
                            }
                        };
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer, 0);
            composer.endReplaceGroup();
            ComboOrderDetailActionRowsComposable.ComboOrderDetailActionRowsComposable((ComboOrderDetailActionRowsDuxo) baseDuxo, null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-2131860978, reason: not valid java name */
    private static Function3<PaddingValues, Composer, Integer, Unit> f9133lambda$2131860978 = ComposableLambda3.composableLambdaInstance(-2131860978, false, C23018xa8a55330.INSTANCE);

    /* renamed from: getLambda$-1472296445$feature_combo_order_detail_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m16893getLambda$1472296445$feature_combo_order_detail_externalDebug() {
        return f9129lambda$1472296445;
    }

    /* renamed from: getLambda$-1708953575$feature_combo_order_detail_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m16894getLambda$1708953575$feature_combo_order_detail_externalDebug() {
        return f9130lambda$1708953575;
    }

    /* renamed from: getLambda$-17460698$feature_combo_order_detail_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m16895getLambda$17460698$feature_combo_order_detail_externalDebug() {
        return f9131lambda$17460698;
    }

    /* renamed from: getLambda$-1887701749$feature_combo_order_detail_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m16896getLambda$1887701749$feature_combo_order_detail_externalDebug() {
        return f9132lambda$1887701749;
    }

    /* renamed from: getLambda$-2131860978$feature_combo_order_detail_externalDebug, reason: not valid java name */
    public final Function3<PaddingValues, Composer, Integer, Unit> m16897getLambda$2131860978$feature_combo_order_detail_externalDebug() {
        return f9133lambda$2131860978;
    }

    /* renamed from: getLambda$-502405947$feature_combo_order_detail_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m16898getLambda$502405947$feature_combo_order_detail_externalDebug() {
        return f9134lambda$502405947;
    }

    /* renamed from: getLambda$-755710078$feature_combo_order_detail_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m16899getLambda$755710078$feature_combo_order_detail_externalDebug() {
        return f9135lambda$755710078;
    }

    /* renamed from: getLambda$-926549535$feature_combo_order_detail_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m16900getLambda$926549535$feature_combo_order_detail_externalDebug() {
        return f9136lambda$926549535;
    }

    /* renamed from: getLambda$-987351196$feature_combo_order_detail_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m16901getLambda$987351196$feature_combo_order_detail_externalDebug() {
        return f9137lambda$987351196;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1437375049$feature_combo_order_detail_externalDebug() {
        return lambda$1437375049;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1753558281$feature_combo_order_detail_externalDebug() {
        return lambda$1753558281;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1922320298$feature_combo_order_detail_externalDebug() {
        return lambda$1922320298;
    }

    public final Function2<Composer, Integer, Unit> getLambda$2056932503$feature_combo_order_detail_externalDebug() {
        return lambda$2056932503;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$467484551$feature_combo_order_detail_externalDebug() {
        return lambda$467484551;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$601616354$feature_combo_order_detail_externalDebug() {
        return lambda$601616354;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$952429800$feature_combo_order_detail_externalDebug() {
        return lambda$952429800;
    }
}
