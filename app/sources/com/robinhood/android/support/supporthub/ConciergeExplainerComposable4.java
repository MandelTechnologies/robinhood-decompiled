package com.robinhood.android.support.supporthub;

import android.content.Context;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.TopAppBarColors;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.support.contracts.ConciergeFaqFragmentKey;
import com.robinhood.utils.p409ui.edge2edge.OverrideSystemBarsStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ConciergeExplainerComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"ConciergeExplainerComposable", "", "onBackPressed", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-support_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.support.supporthub.ConciergeExplainerComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class ConciergeExplainerComposable4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConciergeExplainerComposable$lambda$1(Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ConciergeExplainerComposable(function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ConciergeExplainerComposable(final Function0<Unit> onBackPressed, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1634442924);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onBackPressed) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1634442924, i3, -1, "com.robinhood.android.support.supporthub.ConciergeExplainerComposable (ConciergeExplainerComposable.kt:48)");
                }
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                OverrideSystemBarsStyle.OverrideSystemBarsStyle(false, composerStartRestartGroup, 6);
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getJet(), null, 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                WindowInsets WindowInsets = WindowInsetsKt.WindowInsets(0, 0, 0, 0);
                composer2 = composerStartRestartGroup;
                modifier3 = modifier4;
                ScaffoldKt.m5939ScaffoldTvnljyQ(null, ComposableLambda3.rememberComposableLambda(107743178, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.support.supporthub.ConciergeExplainerComposableKt$ConciergeExplainerComposable$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(107743178, i5, -1, "com.robinhood.android.support.supporthub.ConciergeExplainerComposable.<anonymous>.<anonymous> (ConciergeExplainerComposable.kt:62)");
                        }
                        Function2<Composer, Integer, Unit> function2M19092getLambda$1801152882$feature_support_externalRelease = ConciergeExplainerComposable.INSTANCE.m19092getLambda$1801152882$feature_support_externalRelease();
                        final Function0<Unit> function0 = onBackPressed;
                        ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(820224528, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.support.supporthub.ConciergeExplainerComposableKt$ConciergeExplainerComposable$1$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i6) {
                                if ((i6 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(820224528, i6, -1, "com.robinhood.android.support.supporthub.ConciergeExplainerComposable.<anonymous>.<anonymous>.<anonymous> (ConciergeExplainerComposable.kt:65)");
                                }
                                BentoAppBarScope.INSTANCE.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer4, BentoAppBarScope.$stable << 12, 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54);
                        ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-878286471, true, new C290002(navigator, context), composer3, 54);
                        TopAppBarColors topAppBarColors = TopAppBarDefaults.INSTANCE.topAppBarColors(composer3, TopAppBarDefaults.$stable);
                        Color.Companion companion2 = Color.INSTANCE;
                        AppBarKt.m5704TopAppBarGHTll3U(function2M19092getLambda$1801152882$feature_support_externalRelease, null, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, 0.0f, null, TopAppBarColors.m6077copyt635Npw$default(topAppBarColors, companion2.m6725getTransparent0d7_KjU(), 0L, companion2.m6725getTransparent0d7_KjU(), 0L, 0L, 26, null), null, composer3, 3462, EnumC7081g.f2773x8d9721ad);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: ConciergeExplainerComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.support.supporthub.ConciergeExplainerComposableKt$ConciergeExplainerComposable$1$1$2 */
                    static final class C290002 implements Function3<Row5, Composer, Integer, Unit> {
                        final /* synthetic */ Context $context;
                        final /* synthetic */ Navigator $navigator;

                        C290002(Navigator navigator, Context context) {
                            this.$navigator = navigator;
                            this.$context = context;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
                            invoke(row5, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Row5 TopAppBar, Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
                            if ((i & 17) == 16 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-878286471, i, -1, "com.robinhood.android.support.supporthub.ConciergeExplainerComposable.<anonymous>.<anonymous>.<anonymous> (ConciergeExplainerComposable.kt:70)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i2 = BentoTheme.$stable;
                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 11, null);
                            BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.QUESTION_24);
                            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                            composer.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context);
                            final Navigator navigator = this.$navigator;
                            final Context context = this.$context;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x007b: CONSTRUCTOR (r9v2 'objRememberedValue' java.lang.Object) = 
                                      (r6v2 'navigator' com.robinhood.android.navigation.Navigator A[DONT_INLINE])
                                      (r7v0 'context' android.content.Context A[DONT_INLINE])
                                     A[MD:(com.robinhood.android.navigation.Navigator, android.content.Context):void (m)] (LINE:77) call: com.robinhood.android.support.supporthub.ConciergeExplainerComposableKt$ConciergeExplainerComposable$1$1$2$$ExternalSyntheticLambda0.<init>(com.robinhood.android.navigation.Navigator, android.content.Context):void type: CONSTRUCTOR in method: com.robinhood.android.support.supporthub.ConciergeExplainerComposableKt$ConciergeExplainerComposable$1$1.2.invoke(androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, int):void, file: classes9.dex
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
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.support.supporthub.ConciergeExplainerComposableKt$ConciergeExplainerComposable$1$1$2$$ExternalSyntheticLambda0, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                    	... 25 more
                                    */
                                /*
                                    this = this;
                                    r0 = r18
                                    r8 = r20
                                    r1 = r21
                                    java.lang.String r2 = "$this$TopAppBar"
                                    r3 = r19
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
                                    r2 = r1 & 17
                                    r3 = 16
                                    if (r2 != r3) goto L1e
                                    boolean r2 = r8.getSkipping()
                                    if (r2 != 0) goto L1a
                                    goto L1e
                                L1a:
                                    r8.skipToGroupEnd()
                                    return
                                L1e:
                                    boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                    if (r2 == 0) goto L2d
                                    r2 = -1
                                    java.lang.String r3 = "com.robinhood.android.support.supporthub.ConciergeExplainerComposable.<anonymous>.<anonymous>.<anonymous> (ConciergeExplainerComposable.kt:70)"
                                    r4 = -878286471(0xffffffffcba66979, float:-2.1811954E7)
                                    androidx.compose.runtime.ComposerKt.traceEventStart(r4, r1, r2, r3)
                                L2d:
                                    androidx.compose.ui.Modifier$Companion r9 = androidx.compose.p011ui.Modifier.INSTANCE
                                    com.robinhood.compose.bento.theme.BentoTheme r1 = com.robinhood.compose.bento.theme.BentoTheme.INSTANCE
                                    int r2 = com.robinhood.compose.bento.theme.BentoTheme.$stable
                                    com.robinhood.compose.bento.theme.BentoSpacing r3 = r1.getSpacing(r8, r2)
                                    float r12 = r3.m21592getMediumD9Ej5fM()
                                    r14 = 11
                                    r15 = 0
                                    r10 = 0
                                    r11 = 0
                                    r13 = 0
                                    androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(r9, r10, r11, r12, r13, r14, r15)
                                    com.robinhood.compose.bento.component.BentoIcons$Size24 r3 = new com.robinhood.compose.bento.component.BentoIcons$Size24
                                    com.robinhood.android.libdesignsystem.serverui.IconAsset r4 = com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2.QUESTION_24
                                    r3.<init>(r4)
                                    com.robinhood.compose.bento.theme.BentoColors r1 = r1.getColors(r8, r2)
                                    long r1 = r1.m21425getFg0d7_KjU()
                                    r4 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
                                    r8.startReplaceGroup(r4)
                                    com.robinhood.android.navigation.Navigator r4 = r0.$navigator
                                    boolean r4 = r8.changedInstance(r4)
                                    android.content.Context r6 = r0.$context
                                    boolean r6 = r8.changedInstance(r6)
                                    r4 = r4 | r6
                                    com.robinhood.android.navigation.Navigator r6 = r0.$navigator
                                    android.content.Context r7 = r0.$context
                                    java.lang.Object r9 = r8.rememberedValue()
                                    if (r4 != 0) goto L79
                                    androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.INSTANCE
                                    java.lang.Object r4 = r4.getEmpty()
                                    if (r9 != r4) goto L81
                                L79:
                                    com.robinhood.android.support.supporthub.ConciergeExplainerComposableKt$ConciergeExplainerComposable$1$1$2$$ExternalSyntheticLambda0 r9 = new com.robinhood.android.support.supporthub.ConciergeExplainerComposableKt$ConciergeExplainerComposable$1$1$2$$ExternalSyntheticLambda0
                                    r9.<init>(r6, r7)
                                    r8.updateRememberedValue(r9)
                                L81:
                                    r6 = r9
                                    kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
                                    r8.endReplaceGroup()
                                    int r4 = com.robinhood.compose.bento.component.BentoIcon4.Size24.$stable
                                    r9 = r4 | 48
                                    r10 = 32
                                    r16 = r1
                                    r1 = r3
                                    r3 = r16
                                    r2 = 0
                                    r7 = 0
                                    com.robinhood.compose.bento.component.BentoIcon2.m20644BentoIconFU0evQE(r1, r2, r3, r5, r6, r7, r8, r9, r10)
                                    boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                    if (r1 == 0) goto La0
                                    androidx.compose.runtime.ComposerKt.traceEventEnd()
                                La0:
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.support.supporthub.ConciergeExplainerComposable5.C290002.invoke(androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, int):void");
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(Navigator navigator, Context context) {
                                Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, ConciergeFaqFragmentKey.INSTANCE, false, false, false, false, null, false, null, null, 1020, null);
                                return Unit.INSTANCE;
                            }
                        }
                    }, composerStartRestartGroup, 54), null, null, null, 0, Color.INSTANCE.m6725getTransparent0d7_KjU(), 0L, WindowInsets, ConciergeExplainerComposable.INSTANCE.getLambda$1083383967$feature_support_externalRelease(), composer2, 806879280, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.supporthub.ConciergeExplainerComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ConciergeExplainerComposable4.ConciergeExplainerComposable$lambda$1(onBackPressed, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 48;
            modifier2 = modifier;
            if ((i3 & 19) == 18) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                OverrideSystemBarsStyle.OverrideSystemBarsStyle(false, composerStartRestartGroup, 6);
                Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getJet(), null, 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default2);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    WindowInsets WindowInsets2 = WindowInsetsKt.WindowInsets(0, 0, 0, 0);
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier4;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(null, ComposableLambda3.rememberComposableLambda(107743178, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.support.supporthub.ConciergeExplainerComposableKt$ConciergeExplainerComposable$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i5) {
                            if ((i5 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(107743178, i5, -1, "com.robinhood.android.support.supporthub.ConciergeExplainerComposable.<anonymous>.<anonymous> (ConciergeExplainerComposable.kt:62)");
                            }
                            Function2<Composer, Integer, Unit> function2M19092getLambda$1801152882$feature_support_externalRelease = ConciergeExplainerComposable.INSTANCE.m19092getLambda$1801152882$feature_support_externalRelease();
                            final Function0<Unit> function0 = onBackPressed;
                            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(820224528, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.support.supporthub.ConciergeExplainerComposableKt$ConciergeExplainerComposable$1$1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i6) {
                                    if ((i6 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(820224528, i6, -1, "com.robinhood.android.support.supporthub.ConciergeExplainerComposable.<anonymous>.<anonymous>.<anonymous> (ConciergeExplainerComposable.kt:65)");
                                    }
                                    BentoAppBarScope.INSTANCE.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer4, BentoAppBarScope.$stable << 12, 7);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54);
                            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-878286471, true, new C290002(navigator2, context2), composer3, 54);
                            TopAppBarColors topAppBarColors = TopAppBarDefaults.INSTANCE.topAppBarColors(composer3, TopAppBarDefaults.$stable);
                            Color.Companion companion22 = Color.INSTANCE;
                            AppBarKt.m5704TopAppBarGHTll3U(function2M19092getLambda$1801152882$feature_support_externalRelease, null, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, 0.0f, null, TopAppBarColors.m6077copyt635Npw$default(topAppBarColors, companion22.m6725getTransparent0d7_KjU(), 0L, companion22.m6725getTransparent0d7_KjU(), 0L, 0L, 26, null), null, composer3, 3462, EnumC7081g.f2773x8d9721ad);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: ConciergeExplainerComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.support.supporthub.ConciergeExplainerComposableKt$ConciergeExplainerComposable$1$1$2 */
                        static final class C290002 implements Function3<Row5, Composer, Integer, Unit> {
                            final /* synthetic */ Context $context;
                            final /* synthetic */ Navigator $navigator;

                            C290002(Navigator navigator, Context context) {
                                this.$navigator = navigator;
                                this.$context = context;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
                                invoke(row5, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x007b: CONSTRUCTOR (r9v2 'objRememberedValue' java.lang.Object) = 
                                  (r6v2 'navigator' com.robinhood.android.navigation.Navigator A[DONT_INLINE])
                                  (r7v0 'context' android.content.Context A[DONT_INLINE])
                                 A[MD:(com.robinhood.android.navigation.Navigator, android.content.Context):void (m)] (LINE:77) call: com.robinhood.android.support.supporthub.ConciergeExplainerComposableKt$ConciergeExplainerComposable$1$1$2$$ExternalSyntheticLambda0.<init>(com.robinhood.android.navigation.Navigator, android.content.Context):void type: CONSTRUCTOR in method: com.robinhood.android.support.supporthub.ConciergeExplainerComposableKt$ConciergeExplainerComposable$1$1.2.invoke(androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, int):void, file: classes9.dex
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.support.supporthub.ConciergeExplainerComposableKt$ConciergeExplainerComposable$1$1$2$$ExternalSyntheticLambda0, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	... 20 more
                                */
                            public final void invoke(androidx.compose.foundation.layout.Row5 r19, androidx.compose.runtime.Composer r20, int r21) {
                                /*
                                    r18 = this;
                                    r0 = r18
                                    r8 = r20
                                    r1 = r21
                                    java.lang.String r2 = "$this$TopAppBar"
                                    r3 = r19
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
                                    r2 = r1 & 17
                                    r3 = 16
                                    if (r2 != r3) goto L1e
                                    boolean r2 = r8.getSkipping()
                                    if (r2 != 0) goto L1a
                                    goto L1e
                                L1a:
                                    r8.skipToGroupEnd()
                                    return
                                L1e:
                                    boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                    if (r2 == 0) goto L2d
                                    r2 = -1
                                    java.lang.String r3 = "com.robinhood.android.support.supporthub.ConciergeExplainerComposable.<anonymous>.<anonymous>.<anonymous> (ConciergeExplainerComposable.kt:70)"
                                    r4 = -878286471(0xffffffffcba66979, float:-2.1811954E7)
                                    androidx.compose.runtime.ComposerKt.traceEventStart(r4, r1, r2, r3)
                                L2d:
                                    androidx.compose.ui.Modifier$Companion r9 = androidx.compose.p011ui.Modifier.INSTANCE
                                    com.robinhood.compose.bento.theme.BentoTheme r1 = com.robinhood.compose.bento.theme.BentoTheme.INSTANCE
                                    int r2 = com.robinhood.compose.bento.theme.BentoTheme.$stable
                                    com.robinhood.compose.bento.theme.BentoSpacing r3 = r1.getSpacing(r8, r2)
                                    float r12 = r3.m21592getMediumD9Ej5fM()
                                    r14 = 11
                                    r15 = 0
                                    r10 = 0
                                    r11 = 0
                                    r13 = 0
                                    androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(r9, r10, r11, r12, r13, r14, r15)
                                    com.robinhood.compose.bento.component.BentoIcons$Size24 r3 = new com.robinhood.compose.bento.component.BentoIcons$Size24
                                    com.robinhood.android.libdesignsystem.serverui.IconAsset r4 = com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2.QUESTION_24
                                    r3.<init>(r4)
                                    com.robinhood.compose.bento.theme.BentoColors r1 = r1.getColors(r8, r2)
                                    long r1 = r1.m21425getFg0d7_KjU()
                                    r4 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
                                    r8.startReplaceGroup(r4)
                                    com.robinhood.android.navigation.Navigator r4 = r0.$navigator
                                    boolean r4 = r8.changedInstance(r4)
                                    android.content.Context r6 = r0.$context
                                    boolean r6 = r8.changedInstance(r6)
                                    r4 = r4 | r6
                                    com.robinhood.android.navigation.Navigator r6 = r0.$navigator
                                    android.content.Context r7 = r0.$context
                                    java.lang.Object r9 = r8.rememberedValue()
                                    if (r4 != 0) goto L79
                                    androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.INSTANCE
                                    java.lang.Object r4 = r4.getEmpty()
                                    if (r9 != r4) goto L81
                                L79:
                                    com.robinhood.android.support.supporthub.ConciergeExplainerComposableKt$ConciergeExplainerComposable$1$1$2$$ExternalSyntheticLambda0 r9 = new com.robinhood.android.support.supporthub.ConciergeExplainerComposableKt$ConciergeExplainerComposable$1$1$2$$ExternalSyntheticLambda0
                                    r9.<init>(r6, r7)
                                    r8.updateRememberedValue(r9)
                                L81:
                                    r6 = r9
                                    kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
                                    r8.endReplaceGroup()
                                    int r4 = com.robinhood.compose.bento.component.BentoIcon4.Size24.$stable
                                    r9 = r4 | 48
                                    r10 = 32
                                    r16 = r1
                                    r1 = r3
                                    r3 = r16
                                    r2 = 0
                                    r7 = 0
                                    com.robinhood.compose.bento.component.BentoIcon2.m20644BentoIconFU0evQE(r1, r2, r3, r5, r6, r7, r8, r9, r10)
                                    boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                    if (r1 == 0) goto La0
                                    androidx.compose.runtime.ComposerKt.traceEventEnd()
                                La0:
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.support.supporthub.ConciergeExplainerComposable5.C290002.invoke(androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, int):void");
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(Navigator navigator, Context context) {
                                Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, ConciergeFaqFragmentKey.INSTANCE, false, false, false, false, null, false, null, null, 1020, null);
                                return Unit.INSTANCE;
                            }
                        }
                    }, composerStartRestartGroup, 54), null, null, null, 0, Color.INSTANCE.m6725getTransparent0d7_KjU(), 0L, WindowInsets2, ConciergeExplainerComposable.INSTANCE.getLambda$1083383967$feature_support_externalRelease(), composer2, 806879280, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
    }
