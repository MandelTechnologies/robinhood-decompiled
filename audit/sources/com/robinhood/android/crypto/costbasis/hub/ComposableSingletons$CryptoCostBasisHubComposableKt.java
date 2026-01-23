package com.robinhood.android.crypto.costbasis.hub;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import androidx.view.compose.BackHandler5;
import com.robinhood.android.crypto.costbasis.C12782R;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoCostBasisHubComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$CryptoCostBasisHubComposableKt {
    public static final ComposableSingletons$CryptoCostBasisHubComposableKt INSTANCE = new ComposableSingletons$CryptoCostBasisHubComposableKt();
    private static Function2<Composer, Integer, Unit> lambda$86389176 = ComposableLambda3.composableLambdaInstance(86389176, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.hub.ComposableSingletons$CryptoCostBasisHubComposableKt$lambda$86389176$1
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
                ComposerKt.traceEventStart(86389176, i, -1, "com.robinhood.android.crypto.costbasis.hub.ComposableSingletons$CryptoCostBasisHubComposableKt.lambda$86389176.<anonymous> (CryptoCostBasisHubComposable.kt:99)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-606259195, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8818lambda$606259195 = ComposableLambda3.composableLambdaInstance(-606259195, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.hub.ComposableSingletons$CryptoCostBasisHubComposableKt$lambda$-606259195$1
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
                ComposerKt.traceEventStart(-606259195, i, -1, "com.robinhood.android.crypto.costbasis.hub.ComposableSingletons$CryptoCostBasisHubComposableKt.lambda$-606259195.<anonymous> (CryptoCostBasisHubComposable.kt:97)");
            }
            OnBackPressedDispatcherOwner current = BackHandler5.INSTANCE.getCurrent(composer, BackHandler5.$stable);
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableSingletons$CryptoCostBasisHubComposableKt.INSTANCE.getLambda$86389176$feature_crypto_cost_basis_externalDebug(), null, ComposableLambda3.rememberComposableLambda(-751817500, true, new AnonymousClass1(current != null ? current.getOnBackPressedDispatcher() : null), composer, 54), null, null, false, false, null, null, 0L, null, composer, 390, 0, 2042);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* compiled from: CryptoCostBasisHubComposable.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.crypto.costbasis.hub.ComposableSingletons$CryptoCostBasisHubComposableKt$lambda$-606259195$1$1, reason: invalid class name */
        static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
            final /* synthetic */ OnBackPressedDispatcher $onBackPressedDispatcher;

            AnonymousClass1(OnBackPressedDispatcher onBackPressedDispatcher) {
                this.$onBackPressedDispatcher = onBackPressedDispatcher;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                invoke(bentoAppBarScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$1$lambda$0(OnBackPressedDispatcher onBackPressedDispatcher) {
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.onBackPressed();
                }
                return Unit.INSTANCE;
            }

            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                if ((i & 6) == 0) {
                    i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
                }
                if ((i & 19) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-751817500, i, -1, "com.robinhood.android.crypto.costbasis.hub.ComposableSingletons$CryptoCostBasisHubComposableKt.lambda$-606259195.<anonymous>.<anonymous> (CryptoCostBasisHubComposable.kt:101)");
                }
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(this.$onBackPressedDispatcher);
                final OnBackPressedDispatcher onBackPressedDispatcher = this.$onBackPressedDispatcher;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x005a: CONSTRUCTOR (r2v1 'objRememberedValue' java.lang.Object) = (r1v1 'onBackPressedDispatcher' androidx.activity.OnBackPressedDispatcher A[DONT_INLINE]) A[MD:(androidx.activity.OnBackPressedDispatcher):void (m)] (LINE:102) call: com.robinhood.android.crypto.costbasis.hub.ComposableSingletons$CryptoCostBasisHubComposableKt$lambda$-606259195$1$1$$ExternalSyntheticLambda0.<init>(androidx.activity.OnBackPressedDispatcher):void type: CONSTRUCTOR in method: com.robinhood.android.crypto.costbasis.hub.ComposableSingletons$CryptoCostBasisHubComposableKt$lambda$-606259195$1.1.invoke(com.robinhood.compose.bento.component.BentoAppBarScope, androidx.compose.runtime.Composer, int):void, file: classes2.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.crypto.costbasis.hub.ComposableSingletons$CryptoCostBasisHubComposableKt$lambda$-606259195$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                        	... 25 more
                        */
                    /*
                        this = this;
                        java.lang.String r0 = "$this$BentoAppBar"
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
                        r0 = r14 & 6
                        if (r0 != 0) goto L1c
                        r0 = r14 & 8
                        if (r0 != 0) goto L12
                        boolean r0 = r13.changed(r12)
                        goto L16
                    L12:
                        boolean r0 = r13.changedInstance(r12)
                    L16:
                        if (r0 == 0) goto L1a
                        r0 = 4
                        goto L1b
                    L1a:
                        r0 = 2
                    L1b:
                        r14 = r14 | r0
                    L1c:
                        r0 = r14 & 19
                        r1 = 18
                        if (r0 != r1) goto L2d
                        boolean r0 = r13.getSkipping()
                        if (r0 != 0) goto L29
                        goto L2d
                    L29:
                        r13.skipToGroupEnd()
                        return
                    L2d:
                        boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                        if (r0 == 0) goto L3c
                        r0 = -1
                        java.lang.String r1 = "com.robinhood.android.crypto.costbasis.hub.ComposableSingletons$CryptoCostBasisHubComposableKt.lambda$-606259195.<anonymous>.<anonymous> (CryptoCostBasisHubComposable.kt:101)"
                        r2 = -751817500(0xffffffffd3302ce4, float:-7.5666738E11)
                        androidx.compose.runtime.ComposerKt.traceEventStart(r2, r14, r0, r1)
                    L3c:
                        r0 = 5004770(0x4c5de2, float:7.013177E-39)
                        r13.startReplaceGroup(r0)
                        androidx.activity.OnBackPressedDispatcher r0 = r11.$onBackPressedDispatcher
                        boolean r0 = r13.changedInstance(r0)
                        androidx.activity.OnBackPressedDispatcher r1 = r11.$onBackPressedDispatcher
                        java.lang.Object r2 = r13.rememberedValue()
                        if (r0 != 0) goto L58
                        androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.INSTANCE
                        java.lang.Object r0 = r0.getEmpty()
                        if (r2 != r0) goto L60
                    L58:
                        com.robinhood.android.crypto.costbasis.hub.ComposableSingletons$CryptoCostBasisHubComposableKt$lambda$-606259195$1$1$$ExternalSyntheticLambda0 r2 = new com.robinhood.android.crypto.costbasis.hub.ComposableSingletons$CryptoCostBasisHubComposableKt$lambda$-606259195$1$1$$ExternalSyntheticLambda0
                        r2.<init>(r1)
                        r13.updateRememberedValue(r2)
                    L60:
                        r7 = r2
                        kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
                        r13.endReplaceGroup()
                        int r0 = com.robinhood.compose.bento.component.BentoAppBarScope.$stable
                        int r0 = r0 << 12
                        r1 = 57344(0xe000, float:8.0356E-41)
                        int r14 = r14 << 12
                        r14 = r14 & r1
                        r9 = r0 | r14
                        r10 = 7
                        r4 = 0
                        r5 = 0
                        r6 = 0
                        r3 = r12
                        r8 = r13
                        r3.m20575BentoBackButtondrOMvmE(r4, r5, r6, r7, r8, r9, r10)
                        boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                        if (r12 == 0) goto L84
                        androidx.compose.runtime.ComposerKt.traceEventEnd()
                    L84:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.crypto.costbasis.hub.C12873xbccf2236.AnonymousClass1.invoke(com.robinhood.compose.bento.component.BentoAppBarScope, androidx.compose.runtime.Composer, int):void");
                }
            }
        });

        /* renamed from: lambda$-7837645, reason: not valid java name */
        private static Function3<LazyItemScope, Composer, Integer, Unit> f8819lambda$7837645 = ComposableLambda3.composableLambdaInstance(-7837645, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.hub.ComposableSingletons$CryptoCostBasisHubComposableKt$lambda$-7837645$1
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
                    ComposerKt.traceEventStart(-7837645, i, -1, "com.robinhood.android.crypto.costbasis.hub.ComposableSingletons$CryptoCostBasisHubComposableKt.lambda$-7837645.<anonymous> (CryptoCostBasisHubComposable.kt:134)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C12782R.string.crypto_cost_basis_hub_title, composer, 0), PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8188);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
        private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1073243818 = ComposableLambda3.composableLambdaInstance(1073243818, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.hub.ComposableSingletons$CryptoCostBasisHubComposableKt$lambda$1073243818$1
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
                    ComposerKt.traceEventStart(1073243818, i, -1, "com.robinhood.android.crypto.costbasis.hub.ComposableSingletons$CryptoCostBasisHubComposableKt.lambda$1073243818.<anonymous> (CryptoCostBasisHubComposable.kt:142)");
                }
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM()), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });

        /* renamed from: lambda$-42724308, reason: not valid java name */
        private static Function3<LazyItemScope, Composer, Integer, Unit> f8816lambda$42724308 = ComposableLambda3.composableLambdaInstance(-42724308, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.hub.ComposableSingletons$CryptoCostBasisHubComposableKt$lambda$-42724308$1
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
                    ComposerKt.traceEventStart(-42724308, i, -1, "com.robinhood.android.crypto.costbasis.hub.ComposableSingletons$CryptoCostBasisHubComposableKt.lambda$-42724308.<anonymous> (CryptoCostBasisHubComposable.kt:165)");
                }
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });

        /* renamed from: lambda$-600708371, reason: not valid java name */
        private static Function3<LazyItemScope, Composer, Integer, Unit> f8817lambda$600708371 = ComposableLambda3.composableLambdaInstance(-600708371, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.hub.ComposableSingletons$CryptoCostBasisHubComposableKt$lambda$-600708371$1
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
                    ComposerKt.traceEventStart(-600708371, i, -1, "com.robinhood.android.crypto.costbasis.hub.ComposableSingletons$CryptoCostBasisHubComposableKt.lambda$-600708371.<anonymous> (CryptoCostBasisHubComposable.kt:181)");
                }
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
        private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$261873426 = ComposableLambda3.composableLambdaInstance(261873426, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.hub.ComposableSingletons$CryptoCostBasisHubComposableKt$lambda$261873426$1
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
                    ComposerKt.traceEventStart(261873426, i, -1, "com.robinhood.android.crypto.costbasis.hub.ComposableSingletons$CryptoCostBasisHubComposableKt.lambda$261873426.<anonymous> (CryptoCostBasisHubComposable.kt:221)");
                }
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
        private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$788619338 = ComposableLambda3.composableLambdaInstance(788619338, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.hub.ComposableSingletons$CryptoCostBasisHubComposableKt$lambda$788619338$1
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
                    ComposerKt.traceEventStart(788619338, i, -1, "com.robinhood.android.crypto.costbasis.hub.ComposableSingletons$CryptoCostBasisHubComposableKt.lambda$788619338.<anonymous> (CryptoCostBasisHubComposable.kt:236)");
                }
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM()), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
        private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1410917942 = ComposableLambda3.composableLambdaInstance(1410917942, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.hub.ComposableSingletons$CryptoCostBasisHubComposableKt$lambda$1410917942$1
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
                    ComposerKt.traceEventStart(1410917942, i, -1, "com.robinhood.android.crypto.costbasis.hub.ComposableSingletons$CryptoCostBasisHubComposableKt.lambda$1410917942.<anonymous> (CryptoCostBasisHubComposable.kt:259)");
                }
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM()), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });

        /* renamed from: lambda$-1387830428, reason: not valid java name */
        private static Function3<LazyItemScope, Composer, Integer, Unit> f8813lambda$1387830428 = ComposableLambda3.composableLambdaInstance(-1387830428, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.hub.ComposableSingletons$CryptoCostBasisHubComposableKt$lambda$-1387830428$1
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
                    ComposerKt.traceEventStart(-1387830428, i, -1, "com.robinhood.android.crypto.costbasis.hub.ComposableSingletons$CryptoCostBasisHubComposableKt.lambda$-1387830428.<anonymous> (CryptoCostBasisHubComposable.kt:274)");
                }
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM()), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });

        /* renamed from: lambda$-1498561151, reason: not valid java name */
        private static Function2<Composer, Integer, Unit> f8814lambda$1498561151 = ComposableLambda3.composableLambdaInstance(-1498561151, false, C12869xc18363b6.INSTANCE);
        private static Function2<Composer, Integer, Unit> lambda$307562769 = ComposableLambda3.composableLambdaInstance(307562769, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.hub.ComposableSingletons$CryptoCostBasisHubComposableKt$lambda$307562769$1
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
                    ComposerKt.traceEventStart(307562769, i, -1, "com.robinhood.android.crypto.costbasis.hub.ComposableSingletons$CryptoCostBasisHubComposableKt.lambda$307562769.<anonymous> (CryptoCostBasisHubComposable.kt:358)");
                }
                LocalShowPlaceholder.Loadable(true, null, null, ComposableSingletons$CryptoCostBasisHubComposableKt.INSTANCE.m12931getLambda$1498561151$feature_crypto_cost_basis_externalDebug(), composer, 3078, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
        private static Function2<Composer, Integer, Unit> lambda$215348689 = ComposableLambda3.composableLambdaInstance(215348689, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.hub.ComposableSingletons$CryptoCostBasisHubComposableKt$lambda$215348689$1
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
                    ComposerKt.traceEventStart(215348689, i, -1, "com.robinhood.android.crypto.costbasis.hub.ComposableSingletons$CryptoCostBasisHubComposableKt.lambda$215348689.<anonymous> (CryptoCostBasisHubComposable.kt:355)");
                }
                CompositionLocal3.CompositionLocalProvider(LocalNavigator.getLocalNavigator().provides(Navigator.INSTANCE), ComposableSingletons$CryptoCostBasisHubComposableKt.INSTANCE.getLambda$307562769$feature_crypto_cost_basis_externalDebug(), composer, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });

        /* renamed from: lambda$-2007921054, reason: not valid java name */
        private static Function2<Composer, Integer, Unit> f8815lambda$2007921054 = ComposableLambda3.composableLambdaInstance(-2007921054, false, C12870x16a68f33.INSTANCE);
        private static Function2<Composer, Integer, Unit> lambda$2006976930 = ComposableLambda3.composableLambdaInstance(2006976930, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.costbasis.hub.ComposableSingletons$CryptoCostBasisHubComposableKt$lambda$2006976930$1
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
                    ComposerKt.traceEventStart(2006976930, i, -1, "com.robinhood.android.crypto.costbasis.hub.ComposableSingletons$CryptoCostBasisHubComposableKt.lambda$2006976930.<anonymous> (CryptoCostBasisHubComposable.kt:428)");
                }
                CompositionLocal3.CompositionLocalProvider(LocalNavigator.getLocalNavigator().provides(Navigator.INSTANCE), ComposableSingletons$CryptoCostBasisHubComposableKt.INSTANCE.m12932getLambda$2007921054$feature_crypto_cost_basis_externalDebug(), composer, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });

        /* renamed from: getLambda$-1387830428$feature_crypto_cost_basis_externalDebug, reason: not valid java name */
        public final Function3<LazyItemScope, Composer, Integer, Unit> m12930getLambda$1387830428$feature_crypto_cost_basis_externalDebug() {
            return f8813lambda$1387830428;
        }

        /* renamed from: getLambda$-1498561151$feature_crypto_cost_basis_externalDebug, reason: not valid java name */
        public final Function2<Composer, Integer, Unit> m12931getLambda$1498561151$feature_crypto_cost_basis_externalDebug() {
            return f8814lambda$1498561151;
        }

        /* renamed from: getLambda$-2007921054$feature_crypto_cost_basis_externalDebug, reason: not valid java name */
        public final Function2<Composer, Integer, Unit> m12932getLambda$2007921054$feature_crypto_cost_basis_externalDebug() {
            return f8815lambda$2007921054;
        }

        /* renamed from: getLambda$-42724308$feature_crypto_cost_basis_externalDebug, reason: not valid java name */
        public final Function3<LazyItemScope, Composer, Integer, Unit> m12933getLambda$42724308$feature_crypto_cost_basis_externalDebug() {
            return f8816lambda$42724308;
        }

        /* renamed from: getLambda$-600708371$feature_crypto_cost_basis_externalDebug, reason: not valid java name */
        public final Function3<LazyItemScope, Composer, Integer, Unit> m12934getLambda$600708371$feature_crypto_cost_basis_externalDebug() {
            return f8817lambda$600708371;
        }

        /* renamed from: getLambda$-606259195$feature_crypto_cost_basis_externalDebug, reason: not valid java name */
        public final Function2<Composer, Integer, Unit> m12935getLambda$606259195$feature_crypto_cost_basis_externalDebug() {
            return f8818lambda$606259195;
        }

        /* renamed from: getLambda$-7837645$feature_crypto_cost_basis_externalDebug, reason: not valid java name */
        public final Function3<LazyItemScope, Composer, Integer, Unit> m12936getLambda$7837645$feature_crypto_cost_basis_externalDebug() {
            return f8819lambda$7837645;
        }

        public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1073243818$feature_crypto_cost_basis_externalDebug() {
            return lambda$1073243818;
        }

        public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1410917942$feature_crypto_cost_basis_externalDebug() {
            return lambda$1410917942;
        }

        public final Function2<Composer, Integer, Unit> getLambda$2006976930$feature_crypto_cost_basis_externalDebug() {
            return lambda$2006976930;
        }

        public final Function2<Composer, Integer, Unit> getLambda$215348689$feature_crypto_cost_basis_externalDebug() {
            return lambda$215348689;
        }

        public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$261873426$feature_crypto_cost_basis_externalDebug() {
            return lambda$261873426;
        }

        public final Function2<Composer, Integer, Unit> getLambda$307562769$feature_crypto_cost_basis_externalDebug() {
            return lambda$307562769;
        }

        public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$788619338$feature_crypto_cost_basis_externalDebug() {
            return lambda$788619338;
        }

        public final Function2<Composer, Integer, Unit> getLambda$86389176$feature_crypto_cost_basis_externalDebug() {
            return lambda$86389176;
        }
    }
