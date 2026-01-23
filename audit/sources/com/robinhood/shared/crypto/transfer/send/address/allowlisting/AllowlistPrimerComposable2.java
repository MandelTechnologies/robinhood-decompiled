package com.robinhood.shared.crypto.transfer.send.address.allowlisting;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import androidx.view.compose.BackHandler5;
import coil.compose.AsyncImagePainter;
import coil.compose.AsyncImagePainter4;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.CoilUtils2;
import com.robinhood.shared.crypto.p375ui.primer.PrimerHeaderAssetContainer4;
import com.robinhood.shared.crypto.transfer.C37934R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AllowlistPrimerComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.send.address.allowlisting.ComposableSingletons$AllowlistPrimerComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class AllowlistPrimerComposable2 {
    public static final AllowlistPrimerComposable2 INSTANCE = new AllowlistPrimerComposable2();

    /* renamed from: lambda$-1131775866, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9426lambda$1131775866 = ComposableLambda3.composableLambdaInstance(-1131775866, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.ComposableSingletons$AllowlistPrimerComposableKt$lambda$-1131775866$1
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
                ComposerKt.traceEventStart(-1131775866, i, -1, "com.robinhood.shared.crypto.transfer.send.address.allowlisting.ComposableSingletons$AllowlistPrimerComposableKt.lambda$-1131775866.<anonymous> (AllowlistPrimerComposable.kt:55)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1259574297 = ComposableLambda3.composableLambdaInstance(1259574297, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.ComposableSingletons$AllowlistPrimerComposableKt$lambda$1259574297$1
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
                ComposerKt.traceEventStart(1259574297, i, -1, "com.robinhood.shared.crypto.transfer.send.address.allowlisting.ComposableSingletons$AllowlistPrimerComposableKt.lambda$1259574297.<anonymous> (AllowlistPrimerComposable.kt:53)");
            }
            OnBackPressedDispatcherOwner current = BackHandler5.INSTANCE.getCurrent(composer, BackHandler5.$stable);
            BentoAppBarKt.m20573BentoAppBarSGdaT3c(AllowlistPrimerComposable2.INSTANCE.m25044getLambda$1131775866$feature_crypto_transfer_externalDebug(), null, ComposableLambda3.rememberComposableLambda(1564277210, true, new AnonymousClass1(current != null ? current.getOnBackPressedDispatcher() : null), composer, 54), null, null, false, false, null, null, 0L, null, composer, 390, 0, 2042);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* compiled from: AllowlistPrimerComposable.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.shared.crypto.transfer.send.address.allowlisting.ComposableSingletons$AllowlistPrimerComposableKt$lambda$1259574297$1$1, reason: invalid class name */
        static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
            final /* synthetic */ OnBackPressedDispatcher $onBack;

            AnonymousClass1(OnBackPressedDispatcher onBackPressedDispatcher) {
                this.$onBack = onBackPressedDispatcher;
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
                    ComposerKt.traceEventStart(1564277210, i, -1, "com.robinhood.shared.crypto.transfer.send.address.allowlisting.ComposableSingletons$AllowlistPrimerComposableKt.lambda$1259574297.<anonymous>.<anonymous> (AllowlistPrimerComposable.kt:57)");
                }
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(this.$onBack);
                final OnBackPressedDispatcher onBackPressedDispatcher = this.$onBack;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x005a: CONSTRUCTOR (r2v1 'objRememberedValue' java.lang.Object) = (r1v1 'onBackPressedDispatcher' androidx.activity.OnBackPressedDispatcher A[DONT_INLINE]) A[MD:(androidx.activity.OnBackPressedDispatcher):void (m)] (LINE:58) call: com.robinhood.shared.crypto.transfer.send.address.allowlisting.ComposableSingletons$AllowlistPrimerComposableKt$lambda$1259574297$1$1$$ExternalSyntheticLambda0.<init>(androidx.activity.OnBackPressedDispatcher):void type: CONSTRUCTOR in method: com.robinhood.shared.crypto.transfer.send.address.allowlisting.ComposableSingletons$AllowlistPrimerComposableKt$lambda$1259574297$1.1.invoke(com.robinhood.compose.bento.component.BentoAppBarScope, androidx.compose.runtime.Composer, int):void, file: classes6.dex
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.ComposableSingletons$AllowlistPrimerComposableKt$lambda$1259574297$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
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
                        java.lang.String r1 = "com.robinhood.shared.crypto.transfer.send.address.allowlisting.ComposableSingletons$AllowlistPrimerComposableKt.lambda$1259574297.<anonymous>.<anonymous> (AllowlistPrimerComposable.kt:57)"
                        r2 = 1564277210(0x5d3cf9da, float:8.5107217E17)
                        androidx.compose.runtime.ComposerKt.traceEventStart(r2, r14, r0, r1)
                    L3c:
                        r0 = 5004770(0x4c5de2, float:7.013177E-39)
                        r13.startReplaceGroup(r0)
                        androidx.activity.OnBackPressedDispatcher r0 = r11.$onBack
                        boolean r0 = r13.changedInstance(r0)
                        androidx.activity.OnBackPressedDispatcher r1 = r11.$onBack
                        java.lang.Object r2 = r13.rememberedValue()
                        if (r0 != 0) goto L58
                        androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.INSTANCE
                        java.lang.Object r0 = r0.getEmpty()
                        if (r2 != r0) goto L60
                    L58:
                        com.robinhood.shared.crypto.transfer.send.address.allowlisting.ComposableSingletons$AllowlistPrimerComposableKt$lambda$1259574297$1$1$$ExternalSyntheticLambda0 r2 = new com.robinhood.shared.crypto.transfer.send.address.allowlisting.ComposableSingletons$AllowlistPrimerComposableKt$lambda$1259574297$1$1$$ExternalSyntheticLambda0
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
                    throw new UnsupportedOperationException("Method not decompiled: com.robinhood.shared.crypto.transfer.send.address.allowlisting.AllowlistPrimerComposable7.AnonymousClass1.invoke(com.robinhood.compose.bento.component.BentoAppBarScope, androidx.compose.runtime.Composer, int):void");
                }
            }
        });

        /* renamed from: lambda$-27222044, reason: not valid java name */
        private static Function3<PaddingValues, Composer, Integer, Unit> f9427lambda$27222044 = ComposableLambda3.composableLambdaInstance(-27222044, false, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.ComposableSingletons$AllowlistPrimerComposableKt$lambda$-27222044$1
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
                    ComposerKt.traceEventStart(-27222044, i2, -1, "com.robinhood.shared.crypto.transfer.send.address.allowlisting.ComposableSingletons$AllowlistPrimerComposableKt.lambda$-27222044.<anonymous> (AllowlistPrimerComposable.kt:62)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.padding(PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxSize$default, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), paddingValues), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composer, 48);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierVerticalScroll$default);
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
                final String str = bentoTheme.getColors(composer, i3).getIsDay() ? "https://cdn.robinhood.com/app_assets/crypto/crypto_transfers/allowlist/primer/light/1x.svg" : "https://cdn.robinhood.com/app_assets/crypto/crypto_transfers/allowlist/primer/dark/1x.svg";
                PrimerHeaderAssetContainer4.PrimerHeaderAssetContainer(PaddingKt.m5144paddingVpY3zN4$default(AspectRatio3.aspectRatio$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null), 0.0f, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 1, null), null, ComposableLambda3.rememberComposableLambda(-963747241, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.allowlisting.ComposableSingletons$AllowlistPrimerComposableKt$lambda$-27222044$1$1$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                        invoke(boxScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BoxScope PrimerHeaderAssetContainer, Composer composer2, int i4) {
                        int i5;
                        Intrinsics.checkNotNullParameter(PrimerHeaderAssetContainer, "$this$PrimerHeaderAssetContainer");
                        if ((i4 & 6) == 0) {
                            i5 = (composer2.changed(PrimerHeaderAssetContainer) ? 4 : 2) | i4;
                        } else {
                            i5 = i4;
                        }
                        if ((i5 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-963747241, i5, -1, "com.robinhood.shared.crypto.transfer.send.address.allowlisting.ComposableSingletons$AllowlistPrimerComposableKt.lambda$-27222044.<anonymous>.<anonymous>.<anonymous> (AllowlistPrimerComposable.kt:81)");
                        }
                        AsyncImagePainter asyncImagePainterM9105rememberAsyncImagePainter0YpotYA = AsyncImagePainter4.m9105rememberAsyncImagePainter0YpotYA(str, CoilUtils2.rememberImageLoader(0.0d, null, composer2, 0, 3), null, null, null, 0, null, composer2, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        float f = EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE;
                        ImageKt.Image(asyncImagePainterM9105rememberAsyncImagePainter0YpotYA, StringResources_androidKt.stringResource(C37934R.string.crypto_allowlist_primer_title, composer2, 0), PrimerHeaderAssetContainer.align(SizeKt.m5171sizeVpY3zN4(companion3, C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f)), Alignment.INSTANCE.getCenter()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 0, 120);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 384, 2);
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), 7, null);
                String strStringResource = StringResources_androidKt.stringResource(C37934R.string.crypto_allowlist_primer_title, composer, 0);
                TextStyle displayCapsuleMedium = bentoTheme.getTypography(composer, i3).getDisplayCapsuleMedium();
                TextAlign.Companion companion3 = TextAlign.INSTANCE;
                BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM5146paddingqDBjuR0$default, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer, 0, 0, 8124);
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C37934R.string.crypto_allowlist_primer_subtitle, composer, 0), null, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composer, 0, 0, 16318);
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
        private static Function2<Composer, Integer, Unit> lambda$1061469788 = ComposableLambda3.composableLambdaInstance(1061469788, false, AllowlistPrimerComposable6.INSTANCE);

        /* renamed from: getLambda$-1131775866$feature_crypto_transfer_externalDebug, reason: not valid java name */
        public final Function2<Composer, Integer, Unit> m25044getLambda$1131775866$feature_crypto_transfer_externalDebug() {
            return f9426lambda$1131775866;
        }

        /* renamed from: getLambda$-27222044$feature_crypto_transfer_externalDebug, reason: not valid java name */
        public final Function3<PaddingValues, Composer, Integer, Unit> m25045getLambda$27222044$feature_crypto_transfer_externalDebug() {
            return f9427lambda$27222044;
        }

        public final Function2<Composer, Integer, Unit> getLambda$1061469788$feature_crypto_transfer_externalDebug() {
            return lambda$1061469788;
        }

        public final Function2<Composer, Integer, Unit> getLambda$1259574297$feature_crypto_transfer_externalDebug() {
            return lambda$1259574297;
        }
    }
