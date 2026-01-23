package com.robinhood.android.gold.upgrade.agreements;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import androidx.view.compose.BackHandler5;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GoldAgreementsLoadingFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.upgrade.agreements.ComposableSingletons$GoldAgreementsLoadingFragmentKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldAgreementsLoadingFragment2 {
    public static final GoldAgreementsLoadingFragment2 INSTANCE = new GoldAgreementsLoadingFragment2();

    /* renamed from: lambda$-694849117, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9025lambda$694849117 = ComposableLambda3.composableLambdaInstance(-694849117, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.agreements.ComposableSingletons$GoldAgreementsLoadingFragmentKt$lambda$-694849117$1
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
                ComposerKt.traceEventStart(-694849117, i, -1, "com.robinhood.android.gold.upgrade.agreements.ComposableSingletons$GoldAgreementsLoadingFragmentKt.lambda$-694849117.<anonymous> (GoldAgreementsLoadingFragment.kt:67)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1970951216 = ComposableLambda3.composableLambdaInstance(1970951216, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.agreements.ComposableSingletons$GoldAgreementsLoadingFragmentKt$lambda$1970951216$1
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
                ComposerKt.traceEventStart(1970951216, i, -1, "com.robinhood.android.gold.upgrade.agreements.ComposableSingletons$GoldAgreementsLoadingFragmentKt.lambda$1970951216.<anonymous> (GoldAgreementsLoadingFragment.kt:65)");
            }
            OnBackPressedDispatcherOwner current = BackHandler5.INSTANCE.getCurrent(composer, BackHandler5.$stable);
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(GoldAgreementsLoadingFragment2.INSTANCE.m2051xf8b330c(), null, ComposableLambda3.rememberComposableLambda(1164571599, true, new AnonymousClass1(current != null ? current.getOnBackPressedDispatcher() : null), composer, 54), null, null, false, false, null, null, 0L, null, composer, 390, 0, 2042);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* compiled from: GoldAgreementsLoadingFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.gold.upgrade.agreements.ComposableSingletons$GoldAgreementsLoadingFragmentKt$lambda$1970951216$1$1, reason: invalid class name */
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
                    ComposerKt.traceEventStart(1164571599, i, -1, "com.robinhood.android.gold.upgrade.agreements.ComposableSingletons$GoldAgreementsLoadingFragmentKt.lambda$1970951216.<anonymous>.<anonymous> (GoldAgreementsLoadingFragment.kt:69)");
                }
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(this.$onBackPressedDispatcher);
                final OnBackPressedDispatcher onBackPressedDispatcher = this.$onBackPressedDispatcher;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x005a: CONSTRUCTOR (r2v1 'objRememberedValue' java.lang.Object) = (r1v1 'onBackPressedDispatcher' androidx.activity.OnBackPressedDispatcher A[DONT_INLINE]) A[MD:(androidx.activity.OnBackPressedDispatcher):void (m)] (LINE:71) call: com.robinhood.android.gold.upgrade.agreements.ComposableSingletons$GoldAgreementsLoadingFragmentKt$lambda$1970951216$1$1$$ExternalSyntheticLambda0.<init>(androidx.activity.OnBackPressedDispatcher):void type: CONSTRUCTOR in method: com.robinhood.android.gold.upgrade.agreements.ComposableSingletons$GoldAgreementsLoadingFragmentKt$lambda$1970951216$1.1.invoke(com.robinhood.compose.bento.component.BentoAppBarScope, androidx.compose.runtime.Composer, int):void, file: classes10.dex
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.gold.upgrade.agreements.ComposableSingletons$GoldAgreementsLoadingFragmentKt$lambda$1970951216$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
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
                        java.lang.String r1 = "com.robinhood.android.gold.upgrade.agreements.ComposableSingletons$GoldAgreementsLoadingFragmentKt.lambda$1970951216.<anonymous>.<anonymous> (GoldAgreementsLoadingFragment.kt:69)"
                        r2 = 1164571599(0x4569f3cf, float:3743.238)
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
                        com.robinhood.android.gold.upgrade.agreements.ComposableSingletons$GoldAgreementsLoadingFragmentKt$lambda$1970951216$1$1$$ExternalSyntheticLambda0 r2 = new com.robinhood.android.gold.upgrade.agreements.ComposableSingletons$GoldAgreementsLoadingFragmentKt$lambda$1970951216$1$1$$ExternalSyntheticLambda0
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
                    throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.gold.upgrade.agreements.GoldAgreementsLoadingFragment5.AnonymousClass1.invoke(com.robinhood.compose.bento.component.BentoAppBarScope, androidx.compose.runtime.Composer, int):void");
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$1$lambda$0(OnBackPressedDispatcher onBackPressedDispatcher) {
                    if (onBackPressedDispatcher != null) {
                        onBackPressedDispatcher.onBackPressed();
                    }
                    return Unit.INSTANCE;
                }
            }
        });

        /* renamed from: lambda$-2048150651, reason: not valid java name */
        private static Function3<PaddingValues, Composer, Integer, Unit> f9024lambda$2048150651 = ComposableLambda3.composableLambdaInstance(-2048150651, false, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.upgrade.agreements.ComposableSingletons$GoldAgreementsLoadingFragmentKt$lambda$-2048150651$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                invoke(paddingValues, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                if ((i & 6) == 0) {
                    i |= composer.changed(paddingValues) ? 4 : 2;
                }
                if ((i & 19) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2048150651, i, -1, "com.robinhood.android.gold.upgrade.agreements.ComposableSingletons$GoldAgreementsLoadingFragmentKt.lambda$-2048150651.<anonymous> (GoldAgreementsLoadingFragment.kt:78)");
                }
                LoadingScreenComposablesKt.ListLoadingScreenComposable(PaddingKt.padding(Modifier.INSTANCE, paddingValues), true, true, 0, composer, 432, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });

        /* renamed from: getLambda$-2048150651$feature_gold_upgrade_agreements_externalDebug */
        public final Function3<PaddingValues, Composer, Integer, Unit> m2050x5f7226d5() {
            return f9024lambda$2048150651;
        }

        /* renamed from: getLambda$-694849117$feature_gold_upgrade_agreements_externalDebug */
        public final Function2<Composer, Integer, Unit> m2051xf8b330c() {
            return f9025lambda$694849117;
        }

        /* renamed from: getLambda$1970951216$feature_gold_upgrade_agreements_externalDebug */
        public final Function2<Composer, Integer, Unit> m2052x9565b5f1() {
            return lambda$1970951216;
        }
    }
