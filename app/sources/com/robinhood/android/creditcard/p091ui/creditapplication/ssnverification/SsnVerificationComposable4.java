package com.robinhood.android.creditcard.p091ui.creditapplication.ssnverification;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationScaffoldKt;
import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.android.creditcard.p091ui.creditapplication.ssnverification.SsnVerificationComposable4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SsnVerificationComposable.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\u001a?\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\u0015\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u000b\"\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m3636d2 = {"SsnVerification", "", "onClosePress", "Lkotlin/Function0;", "onHelpPress", "onVerify", "isLoading", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "FullPageLoader", "visible", "(ZLandroidx/compose/runtime/Composer;I)V", "SSN_VERIFICATION_TITLE_TEST_TAG", "", "SSN_VERIFICATION_SUBTITLE_TEST_TAG", "SSN_VERIFICATION_NOTE_TEST_TAG", "SSN_VERIFICATION_LIST_TEST_TAG", "SSN_VERIFICATION_LARGE_CTA_TEST_TAG", "SSN_VERIFICATION_SMALL_CTA_TEST_TAG", "SSN_VERIFICATION_LOADING_CONTAINER_TEST_TAG", "SSN_VERIFICATION_LOADING_TITLE_TEST_TAG", "SSN_VERIFICATION_LOADING_SUBTITLE_TEST_TAG", "feature-credit-card_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.ssnverification.SsnVerificationComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class SsnVerificationComposable4 {
    public static final String SSN_VERIFICATION_LARGE_CTA_TEST_TAG = "ssn-verification-large-cta-test-tag";
    public static final String SSN_VERIFICATION_LIST_TEST_TAG = "ssn-verification-list-test-tag";
    public static final String SSN_VERIFICATION_LOADING_CONTAINER_TEST_TAG = "ssn-verification-loading-container-test-tag";
    public static final String SSN_VERIFICATION_LOADING_SUBTITLE_TEST_TAG = "ssn-verification-loading-subtitle-test-tag";
    public static final String SSN_VERIFICATION_LOADING_TITLE_TEST_TAG = "ssn-verification-loading-title-test-tag";
    public static final String SSN_VERIFICATION_NOTE_TEST_TAG = "ssn-verification-note-test-tag";
    public static final String SSN_VERIFICATION_SMALL_CTA_TEST_TAG = "ssn-verification-small-cta-test-tag";
    public static final String SSN_VERIFICATION_SUBTITLE_TEST_TAG = "ssn-verification-subtitle-test-tag";
    public static final String SSN_VERIFICATION_TITLE_TEST_TAG = "ssn-verification-title-test-tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final int FullPageLoader$lambda$2$lambda$1(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int FullPageLoader$lambda$4$lambda$3(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FullPageLoader$lambda$5(boolean z, int i, Composer composer, int i2) {
        FullPageLoader(z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SsnVerification$lambda$0(Function0 function0, Function0 function02, Function0 function03, boolean z, int i, Composer composer, int i2) {
        SsnVerification(function0, function02, function03, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void SsnVerification(final Function0<Unit> onClosePress, final Function0<Unit> onHelpPress, final Function0<Unit> onVerify, boolean z, Composer composer, final int i) {
        int i2;
        boolean z2 = z;
        Intrinsics.checkNotNullParameter(onClosePress, "onClosePress");
        Intrinsics.checkNotNullParameter(onHelpPress, "onHelpPress");
        Intrinsics.checkNotNullParameter(onVerify, "onVerify");
        Composer composerStartRestartGroup = composer.startRestartGroup(1169763050);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onClosePress) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onHelpPress) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onVerify) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1169763050, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.ssnverification.SsnVerification (SsnVerificationComposable.kt:59)");
            }
            CreditApplicationScaffoldKt.m12623CreditApplicationScaffoldTuSUGN0(new Screen(Screen.Name.CC_APPLICATION_SSN_VERIFICATION, null, null, null, 14, null), null, null, null, onClosePress, onHelpPress, null, null, null, null, true, false, ComposableLambda3.rememberComposableLambda(-1270628194, true, new C125831(AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable), onVerify, z2), composerStartRestartGroup, 54), composerStartRestartGroup, (i2 << 12) & 516096, 390, 3022);
            z2 = z;
            FullPageLoader(z2, composerStartRestartGroup, (i2 >> 9) & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final boolean z3 = z2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.ssnverification.SsnVerificationComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SsnVerificationComposable4.SsnVerification$lambda$0(onClosePress, onHelpPress, onVerify, z3, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: SsnVerificationComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.ssnverification.SsnVerificationComposableKt$SsnVerification$1 */
    static final class C125831 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ boolean $isLoading;
        final /* synthetic */ Function0<Unit> $onVerify;

        C125831(EventLogger eventLogger, Function0<Unit> function0, boolean z) {
            this.$eventLogger = eventLogger;
            this.$onVerify = function0;
            this.$isLoading = z;
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
                ComposerKt.traceEventStart(-1270628194, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.ssnverification.SsnVerification.<anonymous> (SsnVerificationComposable.kt:68)");
            }
            Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(androidx.compose.foundation.layout.PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), 0.0f, composer, 0, 1), SsnVerificationComposable4.SSN_VERIFICATION_LIST_TEST_TAG);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changed(this.$onVerify) | composer.changed(this.$isLoading);
            final EventLogger eventLogger = this.$eventLogger;
            final Function0<Unit> function0 = this.$onVerify;
            final boolean z = this.$isLoading;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.ssnverification.SsnVerificationComposableKt$SsnVerification$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SsnVerificationComposable4.C125831.invoke$lambda$1$lambda$0(eventLogger, function0, z, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierTestTag, null, null, false, top, centerHorizontally, null, true, null, (Function1) objRememberedValue, composer, 12804096, 334);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(final EventLogger eventLogger, final Function0 function0, final boolean z, LazyListScope LazyColumn) {
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            LazyListScope.item$default(LazyColumn, null, null, SsnVerificationComposable.INSTANCE.m12827getLambda$1925730381$feature_credit_card_externalDebug(), 3, null);
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(527590058, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.ssnverification.SsnVerificationComposableKt$SsnVerification$1$1$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                /* compiled from: SsnVerificationComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.ssnverification.SsnVerificationComposableKt$SsnVerification$1$1$1$1$1 */
                static final class C125841 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ EventLogger $eventLogger;
                    final /* synthetic */ boolean $isLoading;
                    final /* synthetic */ Function0<Unit> $onVerify;

                    C125841(EventLogger eventLogger, Function0<Unit> function0, boolean z) {
                        this.$eventLogger = eventLogger;
                        this.$onVerify = function0;
                        this.$isLoading = z;
                    }

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
                            ComposerKt.traceEventStart(-1271467624, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.ssnverification.SsnVerification.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SsnVerificationComposable.kt:127)");
                        }
                        Modifier modifierTestTag = TestTag3.testTag(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), SsnVerificationComposable4.SSN_VERIFICATION_SMALL_CTA_TEST_TAG);
                        composer.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changed(this.$onVerify);
                        final EventLogger eventLogger = this.$eventLogger;
                        final Function0<Unit> function0 = this.$onVerify;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x005b: CONSTRUCTOR (r6v1 'objRememberedValue' java.lang.Object) = 
                                  (r4v4 'eventLogger' com.robinhood.analytics.EventLogger A[DONT_INLINE])
                                  (r5v1 'function0' kotlin.jvm.functions.Function0<kotlin.Unit> A[DONT_INLINE])
                                 A[MD:(com.robinhood.analytics.EventLogger, kotlin.jvm.functions.Function0):void (m)] (LINE:132) call: com.robinhood.android.creditcard.ui.creditapplication.ssnverification.SsnVerificationComposableKt$SsnVerification$1$1$1$1$1$$ExternalSyntheticLambda0.<init>(com.robinhood.analytics.EventLogger, kotlin.jvm.functions.Function0):void type: CONSTRUCTOR in method: com.robinhood.android.creditcard.ui.creditapplication.ssnverification.SsnVerificationComposableKt$SsnVerification$1$1$1$1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes2.dex
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.creditcard.ui.creditapplication.ssnverification.SsnVerificationComposableKt$SsnVerification$1$1$1$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	... 25 more
                                */
                            /*
                                this = this;
                                r0 = r21
                                r1 = r22
                                r2 = r23
                                r3 = r2 & 3
                                r4 = 2
                                if (r3 != r4) goto L16
                                boolean r3 = r1.getSkipping()
                                if (r3 != 0) goto L12
                                goto L16
                            L12:
                                r1.skipToGroupEnd()
                                return
                            L16:
                                boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                if (r3 == 0) goto L25
                                r3 = -1
                                java.lang.String r4 = "com.robinhood.android.creditcard.ui.creditapplication.ssnverification.SsnVerification.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SsnVerificationComposable.kt:127)"
                                r5 = -1271467624(0xffffffffb436f198, float:-1.7037962E-7)
                                androidx.compose.runtime.ComposerKt.traceEventStart(r5, r2, r3, r4)
                            L25:
                                androidx.compose.ui.Modifier$Companion r2 = androidx.compose.p011ui.Modifier.INSTANCE
                                r3 = 1
                                r4 = 0
                                r5 = 0
                                androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(r2, r5, r3, r4)
                                java.lang.String r3 = "ssn-verification-small-cta-test-tag"
                                androidx.compose.ui.Modifier r2 = androidx.compose.p011ui.platform.TestTag3.testTag(r2, r3)
                                r3 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
                                r1.startReplaceGroup(r3)
                                com.robinhood.analytics.EventLogger r3 = r0.$eventLogger
                                boolean r3 = r1.changedInstance(r3)
                                kotlin.jvm.functions.Function0<kotlin.Unit> r4 = r0.$onVerify
                                boolean r4 = r1.changed(r4)
                                r3 = r3 | r4
                                com.robinhood.analytics.EventLogger r4 = r0.$eventLogger
                                kotlin.jvm.functions.Function0<kotlin.Unit> r5 = r0.$onVerify
                                java.lang.Object r6 = r1.rememberedValue()
                                if (r3 != 0) goto L59
                                androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.INSTANCE
                                java.lang.Object r3 = r3.getEmpty()
                                if (r6 != r3) goto L61
                            L59:
                                com.robinhood.android.creditcard.ui.creditapplication.ssnverification.SsnVerificationComposableKt$SsnVerification$1$1$1$1$1$$ExternalSyntheticLambda0 r6 = new com.robinhood.android.creditcard.ui.creditapplication.ssnverification.SsnVerificationComposableKt$SsnVerification$1$1$1$1$1$$ExternalSyntheticLambda0
                                r6.<init>(r4, r5)
                                r1.updateRememberedValue(r6)
                            L61:
                                r7 = r6
                                kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
                                r1.endReplaceGroup()
                                int r3 = com.robinhood.android.creditcard.C12201R.string.credit_app_ssn_verification_cta
                                r4 = 0
                                java.lang.String r8 = androidx.compose.p011ui.res.StringResources_androidKt.stringResource(r3, r1, r4)
                                boolean r9 = r0.$isLoading
                                r19 = 0
                                r20 = 65086(0xfe3e, float:9.1205E-41)
                                r1 = r2
                                r2 = 0
                                r3 = 0
                                r5 = 0
                                r6 = 0
                                r10 = 0
                                r11 = 0
                                r12 = 0
                                r13 = 0
                                r14 = 0
                                r15 = 0
                                r16 = 0
                                r18 = 6
                                r17 = r22
                                com.robinhood.compose.bento.component.BentoButtonBar2.BentoButtonBar(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                                boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                if (r1 == 0) goto L92
                                androidx.compose.runtime.ComposerKt.traceEventEnd()
                            L92:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.creditcard.p091ui.creditapplication.ssnverification.SsnVerificationComposable5.C125841.invoke(androidx.compose.runtime.Composer, int):void");
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, Function0 function0) {
                            loggingUtils.logContinue$default(eventLogger, null, 1, null);
                            function0.invoke();
                            return Unit.INSTANCE;
                        }
                    }

                    public final void invoke(LazyItemScope item, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(item, "$this$item");
                        if ((i & 17) == 16 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(527590058, i, -1, "com.robinhood.android.creditcard.ui.creditapplication.ssnverification.SsnVerification.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SsnVerificationComposable.kt:125)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i2 = BentoTheme.$stable;
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21591getLargeD9Ej5fM()), composer, 0);
                        BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ComposableLambda3.rememberComposableLambda(-1271467624, true, new C125841(eventLogger, function0, z), composer, 54), composer, 805306368, 510);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 3, null);
                return Unit.INSTANCE;
            }
        }

        private static final void FullPageLoader(boolean z, Composer composer, final int i) {
            int i2;
            final boolean z2;
            Composer composerStartRestartGroup = composer.startRestartGroup(2135183498);
            if ((i & 6) == 0) {
                i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2135183498, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.ssnverification.FullPageLoader (SsnVerificationComposable.kt:146)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.ssnverification.SsnVerificationComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Integer.valueOf(SsnVerificationComposable4.FullPageLoader$lambda$2$lambda$1(((Integer) obj).intValue()));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EnterTransition enterTransitionSlideInHorizontally$default = EnterExitTransitionKt.slideInHorizontally$default(null, (Function1) objRememberedValue, 1, null);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.ssnverification.SsnVerificationComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Integer.valueOf(SsnVerificationComposable4.FullPageLoader$lambda$4$lambda$3(((Integer) obj).intValue()));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                z2 = z;
                AnimatedVisibilityKt.AnimatedVisibility(z2, (Modifier) null, enterTransitionSlideInHorizontally$default, EnterExitTransitionKt.slideOutHorizontally$default(null, (Function1) objRememberedValue2, 1, null), (String) null, SsnVerificationComposable.INSTANCE.getLambda$1570457442$feature_credit_card_externalDebug(), composerStartRestartGroup, (i2 & 14) | 200064, 18);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                z2 = z;
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.ssnverification.SsnVerificationComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SsnVerificationComposable4.FullPageLoader$lambda$5(z2, i, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
    }
