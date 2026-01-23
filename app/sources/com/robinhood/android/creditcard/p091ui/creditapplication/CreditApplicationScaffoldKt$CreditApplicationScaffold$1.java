package com.robinhood.android.creditcard.p091ui.creditapplication;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.drawscope.DrawContext;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.view.ComponentActivity;
import androidx.view.compose.LocalActivity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CreditApplicationScaffold.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class CreditApplicationScaffoldKt$CreditApplicationScaffold$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Function2<Composer, Integer, Unit> $bottomBar;
    final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> $content;
    final /* synthetic */ boolean $hideTopBar;
    final /* synthetic */ boolean $largeGradientBackground;
    final /* synthetic */ String $loggingIdentifier;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0<Unit> $onBackPress;
    final /* synthetic */ Function0<Unit> $onClosePress;
    final /* synthetic */ Function0<Unit> $onHelpPress;
    final /* synthetic */ Color $overrideHeaderBackground;
    final /* synthetic */ Screen $screen;
    final /* synthetic */ Function2<Composer, Integer, Unit> $snackbarHost;
    final /* synthetic */ Function3<Row5, Composer, Integer, Unit> $topBarActions;

    /* JADX WARN: Multi-variable type inference failed */
    CreditApplicationScaffoldKt$CreditApplicationScaffold$1(Color color, boolean z, Screen screen, String str, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function3, boolean z2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function3<? super Row5, ? super Composer, ? super Integer, Unit> function32) {
        this.$overrideHeaderBackground = color;
        this.$largeGradientBackground = z;
        this.$screen = screen;
        this.$loggingIdentifier = str;
        this.$modifier = modifier;
        this.$bottomBar = function2;
        this.$snackbarHost = function22;
        this.$content = function3;
        this.$hideTopBar = z2;
        this.$onBackPress = function0;
        this.$onClosePress = function02;
        this.$onHelpPress = function03;
        this.$topBarActions = function32;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        Context context;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-265267025, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationScaffold.<anonymous> (CreditApplicationScaffold.kt:59)");
        }
        Object objConsume = composer.consume(LocalActivity.getLocalActivity());
        ComponentActivity componentActivity = objConsume instanceof ComponentActivity ? (ComponentActivity) objConsume : null;
        Color color = this.$overrideHeaderBackground;
        composer.startReplaceGroup(-1633490746);
        boolean zChanged = composer.changed(this.$overrideHeaderBackground) | composer.changedInstance(componentActivity);
        Color color2 = this.$overrideHeaderBackground;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new CreditApplicationScaffoldKt$CreditApplicationScaffold$1$1$1(color2, componentActivity, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(color, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer, 0);
        boolean z = this.$largeGradientBackground;
        final float f = z ? 1.25f : 0.35f;
        final float f2 = z ? 6.0f : 1.75f;
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierFillMaxSize$default, bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), null, 2, null);
        final Screen screen = this.$screen;
        final String str = this.$loggingIdentifier;
        Modifier modifier = this.$modifier;
        Function2<Composer, Integer, Unit> function2 = this.$bottomBar;
        Function2<Composer, Integer, Unit> function22 = this.$snackbarHost;
        Function3<PaddingValues, Composer, Integer, Unit> function3 = this.$content;
        final boolean z2 = this.$hideTopBar;
        final Color color3 = this.$overrideHeaderBackground;
        final Function0<Unit> function0 = this.$onBackPress;
        final Function0<Unit> function02 = this.$onClosePress;
        final Function0<Unit> function03 = this.$onHelpPress;
        final Function3<Row5, Composer, Integer, Unit> function32 = this.$topBarActions;
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4872backgroundbw27NRU$default);
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Painter painterPainterResource = PainterResources_androidKt.painterResource(C12201R.drawable.grain, composer, 0);
        ContentScale crop = ContentScale.INSTANCE.getCrop();
        Modifier modifierMatchParentSize = boxScopeInstance.matchParentSize(companion);
        composer.startReplaceGroup(-1633490746);
        boolean zChanged2 = composer.changed(f) | composer.changed(f2);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationScaffoldKt$CreditApplicationScaffold$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreditApplicationScaffoldKt$CreditApplicationScaffold$1.invoke$lambda$8$lambda$4$lambda$3(f, f2, (DrawScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        ImageKt.Image(painterPainterResource, "null", DrawModifierKt.drawBehind(modifierMatchParentSize, (Function1) objRememberedValue2), (Alignment) null, crop, 0.0f, (ColorFilter) null, composer, 24624, 104);
        final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer, AutoLoggingCompositionLocals4.$stable);
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(screen);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new CreditApplicationScaffoldKt$CreditApplicationScaffold$1$2$2$1(screen, null);
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(screen, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer, 0);
        composer.startReplaceGroup(5004770);
        boolean zChanged3 = composer.changed(str);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
            context = null;
            objRememberedValue4 = new CreditApplicationScaffoldKt$CreditApplicationScaffold$1$2$3$1(str, null);
            composer.updateRememberedValue(objRememberedValue4);
        } else {
            context = null;
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(str, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer, 0);
        ScaffoldKt.m5939ScaffoldTvnljyQ(ModifiersKt.logScreenTransitions(WindowInsetsPadding_androidKt.statusBarsPadding(WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxSize$default(modifier, 0.0f, 1, context))), new UserInteractionEventDescriptor(null, screen, null, str != null ? new Context(0, 0, 0, null, null, null, null, null, 0, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null) : context, null, null, 53, null)), ComposableLambda3.rememberComposableLambda(1238503545, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationScaffoldKt$CreditApplicationScaffold$1$2$5
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i3) {
                if ((i3 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1238503545, i3, -1, "com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationScaffold.<anonymous>.<anonymous>.<anonymous> (CreditApplicationScaffold.kt:146)");
                }
                if (!z2) {
                    Color color4 = color3;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(ComposableSingletons$CreditApplicationScaffoldKt.INSTANCE.getLambda$1243300289$feature_credit_card_externalDebug(), null, ComposableLambda3.rememberComposableLambda(-1741143787, true, new C122391(function0, str, current, screen, function02), composer2, 54), ComposableLambda3.rememberComposableLambda(999090294, true, new C122402(function03, current, screen, function32), composer2, 54), null, color3 == null, false, null, Color.m6701boximpl(color4 != null ? color4.getValue() : Color.INSTANCE.m6725getTransparent0d7_KjU()), 0L, null, composer2, 3462, 0, 1746);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* compiled from: CreditApplicationScaffold.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationScaffoldKt$CreditApplicationScaffold$1$2$5$1 */
            static final class C122391 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                final /* synthetic */ EventLogger $eventLogger;
                final /* synthetic */ String $loggingIdentifier;
                final /* synthetic */ Function0<Unit> $onBackPress;
                final /* synthetic */ Function0<Unit> $onClosePress;
                final /* synthetic */ Screen $screen;

                C122391(Function0<Unit> function0, String str, EventLogger eventLogger, Screen screen, Function0<Unit> function02) {
                    this.$onBackPress = function0;
                    this.$loggingIdentifier = str;
                    this.$eventLogger = eventLogger;
                    this.$screen = screen;
                    this.$onClosePress = function02;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                    invoke(bentoAppBarScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$2$lambda$1(String str, EventLogger eventLogger, Screen screen, Function0 function0) {
                    EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.BACK, screen, new Component(Component.ComponentType.BACK_BUTTON, null, null, 6, null), null, str != null ? new Context(0, 0, 0, null, null, null, null, null, 0, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null) : null, false, 40, null);
                    function0.invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                    int i2;
                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                    if ((i & 6) == 0) {
                        i2 = ((i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2) | i;
                    } else {
                        i2 = i;
                    }
                    if ((i2 & 19) == 18 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1741143787, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationScaffold.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditApplicationScaffold.kt:152)");
                    }
                    composer.startReplaceGroup(1798067947);
                    if (this.$onBackPress != null) {
                        composer.startReplaceGroup(-1224400529);
                        boolean zChanged = composer.changed(this.$loggingIdentifier) | composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$screen) | composer.changed(this.$onBackPress);
                        final String str = this.$loggingIdentifier;
                        final EventLogger eventLogger = this.$eventLogger;
                        final Screen screen = this.$screen;
                        final Function0<Unit> function0 = this.$onBackPress;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0085: CONSTRUCTOR (r7v2 'objRememberedValue' java.lang.Object) = 
                                  (r2v9 'str' java.lang.String A[DONT_INLINE])
                                  (r3v5 'eventLogger' com.robinhood.analytics.EventLogger A[DONT_INLINE])
                                  (r4v0 'screen' com.robinhood.rosetta.eventlogging.Screen A[DONT_INLINE])
                                  (r6v1 'function0' kotlin.jvm.functions.Function0<kotlin.Unit> A[DONT_INLINE])
                                 A[MD:(java.lang.String, com.robinhood.analytics.EventLogger, com.robinhood.rosetta.eventlogging.Screen, kotlin.jvm.functions.Function0):void (m)] (LINE:155) call: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationScaffoldKt$CreditApplicationScaffold$1$2$5$1$$ExternalSyntheticLambda0.<init>(java.lang.String, com.robinhood.analytics.EventLogger, com.robinhood.rosetta.eventlogging.Screen, kotlin.jvm.functions.Function0):void type: CONSTRUCTOR in method: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationScaffoldKt$CreditApplicationScaffold$1$2$5.1.invoke(com.robinhood.compose.bento.component.BentoAppBarScope, androidx.compose.runtime.Composer, int):void, file: classes2.dex
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationScaffoldKt$CreditApplicationScaffold$1$2$5$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	... 31 more
                                */
                            /*
                                Method dump skipped, instructions count: 250
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationScaffoldKt$CreditApplicationScaffold$1$2$5.C122391.invoke(com.robinhood.compose.bento.component.BentoAppBarScope, androidx.compose.runtime.Composer, int):void");
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$4$lambda$3(EventLogger eventLogger, Function0 function0) {
                            loggingUtils.logDismiss$default(eventLogger, null, 1, null);
                            function0.invoke();
                            return Unit.INSTANCE;
                        }
                    }

                    /* compiled from: CreditApplicationScaffold.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationScaffoldKt$CreditApplicationScaffold$1$2$5$2 */
                    static final class C122402 implements Function3<Row5, Composer, Integer, Unit> {
                        final /* synthetic */ EventLogger $eventLogger;
                        final /* synthetic */ Function0<Unit> $onHelpPress;
                        final /* synthetic */ Screen $screen;
                        final /* synthetic */ Function3<Row5, Composer, Integer, Unit> $topBarActions;

                        /* JADX WARN: Multi-variable type inference failed */
                        C122402(Function0<Unit> function0, EventLogger eventLogger, Screen screen, Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3) {
                            this.$onHelpPress = function0;
                            this.$eventLogger = eventLogger;
                            this.$screen = screen;
                            this.$topBarActions = function3;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
                            invoke(row5, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, Screen screen, Function0 function0) {
                            EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, new Component(Component.ComponentType.HELP_BUTTON, null, null, 6, null), null, null, false, 57, null);
                            function0.invoke();
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
                            int i2;
                            int i3;
                            Composer composer2 = composer;
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i & 6) == 0) {
                                i2 = i | (composer2.changed(BentoAppBar) ? 4 : 2);
                            } else {
                                i2 = i;
                            }
                            if ((i2 & 19) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(999090294, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationScaffold.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreditApplicationScaffold.kt:177)");
                            }
                            composer2.startReplaceGroup(-1946899961);
                            if (this.$onHelpPress != null) {
                                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer2, 6, 1);
                                composer2.startReplaceGroup(-1746271574);
                                boolean zChangedInstance = composer2.changedInstance(this.$eventLogger) | composer2.changedInstance(this.$screen) | composer2.changed(this.$onHelpPress);
                                final EventLogger eventLogger = this.$eventLogger;
                                final Screen screen = this.$screen;
                                final Function0<Unit> function0 = this.$onHelpPress;
                                Object objRememberedValue = composer2.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = 
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0080: CONSTRUCTOR (r9v1 'objRememberedValue' java.lang.Object) = 
                                          (r5v6 'eventLogger' com.robinhood.analytics.EventLogger A[DONT_INLINE])
                                          (r6v1 'screen' com.robinhood.rosetta.eventlogging.Screen A[DONT_INLINE])
                                          (r7v1 'function0' kotlin.jvm.functions.Function0<kotlin.Unit> A[DONT_INLINE])
                                         A[MD:(com.robinhood.analytics.EventLogger, com.robinhood.rosetta.eventlogging.Screen, kotlin.jvm.functions.Function0):void (m)] (LINE:182) call: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationScaffoldKt$CreditApplicationScaffold$1$2$5$2$$ExternalSyntheticLambda0.<init>(com.robinhood.analytics.EventLogger, com.robinhood.rosetta.eventlogging.Screen, kotlin.jvm.functions.Function0):void type: CONSTRUCTOR in method: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationScaffoldKt$CreditApplicationScaffold$1$2$5.2.invoke(androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, int):void, file: classes2.dex
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
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationScaffoldKt$CreditApplicationScaffold$1$2$5$2$$ExternalSyntheticLambda0, state: NOT_LOADED
                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                        	... 31 more
                                        */
                                    /*
                                        Method dump skipped, instructions count: 228
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationScaffoldKt$CreditApplicationScaffold$1$2$5.C122402.invoke(androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, int):void");
                                }
                            }
                        }, composer, 54), function2, function22, null, 0, Color.INSTANCE.m6725getTransparent0d7_KjU(), bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), null, function3, composer, 1572912, EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE);
                        composer.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$8$lambda$4$lambda$3(float f, float f2, DrawScope drawBehind) throws Throwable {
                        float f3;
                        DrawContext drawContext;
                        long j;
                        Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
                        float f4 = -((Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() & 4294967295L)) / 2) + (Float.intBitsToFloat((int) (drawBehind.mo6963getSizeNHjbRc() >> 32)) * f));
                        drawBehind.getDrawContext().getTransform().translate(0.0f, f4);
                        try {
                            long jMo6962getCenterF1C5BW0 = drawBehind.mo6962getCenterF1C5BW0();
                            drawContext = drawBehind.getDrawContext();
                            long jMo6936getSizeNHjbRc = drawContext.mo6936getSizeNHjbRc();
                            drawContext.getCanvas().save();
                            try {
                                drawContext.getTransform().mo6942scale0AR0LA0(f2, f2, jMo6962getCenterF1C5BW0);
                                j = jMo6936getSizeNHjbRc;
                                try {
                                    DrawScope.m6946drawCircleV9BoPsw$default(drawBehind, Brush.Companion.m6681radialGradientP_VxKs$default(Brush.INSTANCE, new Tuples2[]{new Tuples2(Float.valueOf(0.0f), Color.m6701boximpl(Color2.Color(4284435235L))), new Tuples2(Float.valueOf(0.0057f), Color.m6701boximpl(Color2.Color(3948694058L))), new Tuples2(Float.valueOf(0.0204f), Color.m6701boximpl(Color2.Color(3730458927L))), new Tuples2(Float.valueOf(0.0439f), Color.m6701boximpl(Color2.Color(3562555443L))), new Tuples2(Float.valueOf(0.0763f), Color.m6701boximpl(Color2.Color(3428272182L))), new Tuples2(Float.valueOf(0.1175f), Color.m6701boximpl(Color2.Color(3293988920L))), new Tuples2(Float.valueOf(0.1674f), Color.m6701boximpl(Color2.Color(3210037050L))), new Tuples2(Float.valueOf(0.226f), Color.m6701boximpl(Color2.Color(3126150973L))), new Tuples2(Float.valueOf(0.2932f), Color.m6701boximpl(Color2.Color(3008579135L))), new Tuples2(Float.valueOf(0.369f), Color.m6701boximpl(Color2.Color(2823964227L))), new Tuples2(Float.valueOf(0.4532f), Color.m6701boximpl(Color2.Color(2622506312L))), new Tuples2(Float.valueOf(0.5459f), Color.m6701boximpl(Color2.Color(2320319566L))), new Tuples2(Float.valueOf(0.647f), Color.m6701boximpl(Color2.Color(1883915095))), new Tuples2(Float.valueOf(0.7564f), Color.m6701boximpl(Color2.Color(1413824866))), new Tuples2(Float.valueOf(0.8741f), Color.m6701boximpl(Color2.Color(775962479))), new Tuples2(Float.valueOf(1.0f), Color.m6701boximpl(Color2.Color(3816576)))}, 0L, 0.0f, 0, 14, (Object) null), 0.0f, 0L, 0.0f, null, null, 0, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
                                } catch (Throwable th) {
                                    th = th;
                                    f3 = f4;
                                    try {
                                        drawContext.getCanvas().restore();
                                        drawContext.mo6937setSizeuvyYCjk(j);
                                        throw th;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        drawBehind.getDrawContext().getTransform().translate(-0.0f, -f3);
                                        throw th;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                f3 = f4;
                                j = jMo6936getSizeNHjbRc;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            f3 = f4;
                        }
                        try {
                            drawContext.getCanvas().restore();
                            drawContext.mo6937setSizeuvyYCjk(j);
                            drawBehind.getDrawContext().getTransform().translate(-0.0f, -f4);
                            return Unit.INSTANCE;
                        } catch (Throwable th5) {
                            th = th5;
                            f3 = f4;
                            drawBehind.getDrawContext().getTransform().translate(-0.0f, -f3);
                            throw th;
                        }
                    }
                }
