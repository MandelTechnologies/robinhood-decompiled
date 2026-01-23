package com.robinhood.android.transfers.transferhub;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import android.widget.FrameLayout;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.FragmentManager;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.analytics.LogOnceAnalytics;
import com.robinhood.android.acats.contracts.AcatsIn;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.ThemableColorSpans3;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.transfers.TransfersHubFragment;
import com.robinhood.android.transfers.TransfersHubViewState;
import com.robinhood.android.transfers.contracts.DirectDepositShimKey;
import com.robinhood.android.transfers.transferhub.databinding.FragmentTransfersHubBinding;
import com.robinhood.android.util.style.ThemeAttributes;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.Either;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: BindingHelpers.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a<\u0010\u0006\u001a\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¨\u0006\u0013²\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u008e\u0002"}, m3636d2 = {"handleShowingTransferHubRowExperienceOrNot", "", "Lcom/robinhood/android/transfers/TransfersHubFragment;", "state", "Lcom/robinhood/android/transfers/TransfersHubViewState;", "bindRowViews", "onRecurringDepositsRowClick", "automaticDepositRowAction", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "context", "Landroid/content/Context;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "feature-transfer-hub_externalDebug", "isExpanded", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.transferhub.BindingHelpersKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class BindingHelpers {
    public static final void handleShowingTransferHubRowExperienceOrNot(final TransfersHubFragment transfersHubFragment, final TransfersHubViewState state) {
        Intrinsics.checkNotNullParameter(transfersHubFragment, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        final FragmentTransfersHubBinding binding$feature_transfer_hub_externalDebug = transfersHubFragment.getBinding$feature_transfer_hub_externalDebug();
        if (state.getTransferHubMicrogramSource() != null) {
            binding$feature_transfer_hub_externalDebug.transferHubRedesignContent.setContent(ComposableLambda3.composableLambdaInstance(-955953144, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.transferhub.BindingHelpersKt$handleShowingTransferHubRowExperienceOrNot$1$1
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
                        ComposerKt.traceEventStart(-955953144, i, -1, "com.robinhood.android.transfers.transferhub.handleShowingTransferHubRowExperienceOrNot.<anonymous>.<anonymous> (BindingHelpers.kt:50)");
                    }
                    Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(transfersHubFragment.getScarletManager());
                    final TransfersHubFragment transfersHubFragment2 = transfersHubFragment;
                    final TransfersHubViewState transfersHubViewState = state;
                    final FragmentTransfersHubBinding fragmentTransfersHubBinding = binding$feature_transfer_hub_externalDebug;
                    BentoTheme2.BentoTheme(observableThemeChangesForCompose, null, ComposableLambda3.rememberComposableLambda(904002106, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.transferhub.BindingHelpersKt$handleShowingTransferHubRowExperienceOrNot$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i2) {
                            if ((i2 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(904002106, i2, -1, "com.robinhood.android.transfers.transferhub.handleShowingTransferHubRowExperienceOrNot.<anonymous>.<anonymous>.<anonymous> (BindingHelpers.kt:51)");
                            }
                            ProvidedValue[] providedValueArr = {LocalNavigator.getLocalNavigator().provides(transfersHubFragment2.getNavigator()), AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor().provides(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.TRANSFERS, null, null, null, 14, null), null, null, null, null, 61, null))};
                            final TransfersHubViewState transfersHubViewState2 = transfersHubViewState;
                            final TransfersHubFragment transfersHubFragment3 = transfersHubFragment2;
                            final FragmentTransfersHubBinding fragmentTransfersHubBinding2 = fragmentTransfersHubBinding;
                            CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambda3.rememberComposableLambda(939486970, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.transferhub.BindingHelpersKt.handleShowingTransferHubRowExperienceOrNot.1.1.1.1

                                /* compiled from: BindingHelpers.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.transfers.transferhub.BindingHelpersKt$handleShowingTransferHubRowExperienceOrNot$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
                                static final class C506081 implements Function2<Composer, Integer, Unit> {
                                    final /* synthetic */ TransfersHubViewState $state;
                                    final /* synthetic */ TransfersHubFragment $this_handleShowingTransferHubRowExperienceOrNot;
                                    final /* synthetic */ FragmentTransfersHubBinding $this_with;

                                    C506081(TransfersHubViewState transfersHubViewState, TransfersHubFragment transfersHubFragment, FragmentTransfersHubBinding fragmentTransfersHubBinding) {
                                        this.$state = transfersHubViewState;
                                        this.$this_handleShowingTransferHubRowExperienceOrNot = transfersHubFragment;
                                        this.$this_with = fragmentTransfersHubBinding;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                        invoke(composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    private static final void invoke$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
                                        snapshotState.setValue(Boolean.valueOf(z));
                                    }

                                    public final void invoke(Composer composer, int i) {
                                        if ((i & 3) == 2 && composer.getSkipping()) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(442906373, i, -1, "com.robinhood.android.transfers.transferhub.handleShowingTransferHubRowExperienceOrNot.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BindingHelpers.kt:60)");
                                        }
                                        composer.startReplaceGroup(1849434622);
                                        Object objRememberedValue = composer.rememberedValue();
                                        Composer.Companion companion = Composer.INSTANCE;
                                        if (objRememberedValue == companion.getEmpty()) {
                                            objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                                            composer.updateRememberedValue(objRememberedValue);
                                        }
                                        final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                                        composer.endReplaceGroup();
                                        RemoteMicrogramApplication transferHubMicrogramSource = this.$state.getTransferHubMicrogramSource();
                                        FragmentManager childFragmentManager = this.$this_handleShowingTransferHubRowExperienceOrNot.getChildFragmentManager();
                                        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                                        composer.startReplaceGroup(431273802);
                                        Object objConsume = composer.consume(CompositionLocalsKt.getLocalDensity());
                                        final FragmentTransfersHubBinding fragmentTransfersHubBinding = this.$this_with;
                                        final TransfersHubFragment transfersHubFragment = this.$this_handleShowingTransferHubRowExperienceOrNot;
                                        final Density density = (Density) objConsume;
                                        Modifier modifierAlpha = Alpha.alpha(Modifier.INSTANCE, invoke$lambda$1(snapshotState) ? 1.0f : 0.0f);
                                        composer.startReplaceGroup(-1224400529);
                                        boolean zChangedInstance = composer.changedInstance(fragmentTransfersHubBinding) | composer.changedInstance(transfersHubFragment) | composer.changed(density);
                                        Object objRememberedValue2 = composer.rememberedValue();
                                        if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                                            objRememberedValue2 = 
                                            /*  JADX ERROR: Method code generation error
                                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0098: CONSTRUCTOR (r10v3 'objRememberedValue2' java.lang.Object) = 
                                                  (r5v0 'fragmentTransfersHubBinding' com.robinhood.android.transfers.transferhub.databinding.FragmentTransfersHubBinding A[DONT_INLINE])
                                                  (r6v0 'transfersHubFragment' com.robinhood.android.transfers.TransfersHubFragment A[DONT_INLINE])
                                                  (r4v4 'density' androidx.compose.ui.unit.Density A[DONT_INLINE])
                                                  (r0v4 'snapshotState' androidx.compose.runtime.MutableState A[DONT_INLINE])
                                                 A[MD:(com.robinhood.android.transfers.transferhub.databinding.FragmentTransfersHubBinding, com.robinhood.android.transfers.TransfersHubFragment, androidx.compose.ui.unit.Density, androidx.compose.runtime.MutableState):void (m)] (LINE:69) call: com.robinhood.android.transfers.transferhub.BindingHelpersKt$handleShowingTransferHubRowExperienceOrNot$1$1$1$1$1$$ExternalSyntheticLambda0.<init>(com.robinhood.android.transfers.transferhub.databinding.FragmentTransfersHubBinding, com.robinhood.android.transfers.TransfersHubFragment, androidx.compose.ui.unit.Density, androidx.compose.runtime.MutableState):void type: CONSTRUCTOR in method: com.robinhood.android.transfers.transferhub.BindingHelpersKt.handleShowingTransferHubRowExperienceOrNot.1.1.1.1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes9.dex
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
                                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.transfers.transferhub.BindingHelpersKt$handleShowingTransferHubRowExperienceOrNot$1$1$1$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                                	... 25 more
                                                */
                                            /*
                                                this = this;
                                                r0 = r14
                                                r1 = r0 & 3
                                                r2 = 2
                                                if (r1 != r2) goto L11
                                                boolean r1 = r13.getSkipping()
                                                if (r1 != 0) goto Ld
                                                goto L11
                                            Ld:
                                                r13.skipToGroupEnd()
                                                return
                                            L11:
                                                boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                                if (r1 == 0) goto L20
                                                r1 = -1
                                                java.lang.String r3 = "com.robinhood.android.transfers.transferhub.handleShowingTransferHubRowExperienceOrNot.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BindingHelpers.kt:60)"
                                                r4 = 442906373(0x1a663705, float:4.760733E-23)
                                                androidx.compose.runtime.ComposerKt.traceEventStart(r4, r14, r1, r3)
                                            L20:
                                                r0 = 1849434622(0x6e3c21fe, float:1.4556069E28)
                                                r13.startReplaceGroup(r0)
                                                java.lang.Object r0 = r13.rememberedValue()
                                                androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.INSTANCE
                                                java.lang.Object r3 = r1.getEmpty()
                                                if (r0 != r3) goto L3c
                                                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                                                r3 = 0
                                                androidx.compose.runtime.MutableState r0 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default(r0, r3, r2, r3)
                                                r13.updateRememberedValue(r0)
                                            L3c:
                                                androidx.compose.runtime.MutableState r0 = (androidx.compose.runtime.SnapshotState) r0
                                                r13.endReplaceGroup()
                                                com.robinhood.android.transfers.TransfersHubViewState r2 = r12.$state
                                                microgram.android.RemoteMicrogramApplication r2 = r2.getTransferHubMicrogramSource()
                                                com.robinhood.android.transfers.TransfersHubFragment r3 = r12.$this_handleShowingTransferHubRowExperienceOrNot
                                                androidx.fragment.app.FragmentManager r3 = r3.getChildFragmentManager()
                                                java.lang.String r4 = "getChildFragmentManager(...)"
                                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
                                                r4 = 431273802(0x19b4b74a, float:1.8685594E-23)
                                                r13.startReplaceGroup(r4)
                                                androidx.compose.runtime.ProvidableCompositionLocal r4 = androidx.compose.p011ui.platform.CompositionLocalsKt.getLocalDensity()
                                                java.lang.Object r4 = r13.consume(r4)
                                                com.robinhood.android.transfers.transferhub.databinding.FragmentTransfersHubBinding r5 = r12.$this_with
                                                com.robinhood.android.transfers.TransfersHubFragment r6 = r12.$this_handleShowingTransferHubRowExperienceOrNot
                                                androidx.compose.ui.unit.Density r4 = (androidx.compose.p011ui.unit.Density) r4
                                                androidx.compose.ui.Modifier$Companion r7 = androidx.compose.p011ui.Modifier.INSTANCE
                                                boolean r8 = invoke$lambda$1(r0)
                                                if (r8 == 0) goto L71
                                                r8 = 1065353216(0x3f800000, float:1.0)
                                                goto L72
                                            L71:
                                                r8 = 0
                                            L72:
                                                androidx.compose.ui.Modifier r7 = androidx.compose.p011ui.draw.Alpha.alpha(r7, r8)
                                                r8 = -1224400529(0xffffffffb705216f, float:-7.935202E-6)
                                                r13.startReplaceGroup(r8)
                                                boolean r8 = r13.changedInstance(r5)
                                                boolean r10 = r13.changedInstance(r6)
                                                r8 = r8 | r10
                                                boolean r10 = r13.changed(r4)
                                                r8 = r8 | r10
                                                java.lang.Object r10 = r13.rememberedValue()
                                                if (r8 != 0) goto L96
                                                java.lang.Object r1 = r1.getEmpty()
                                                if (r10 != r1) goto L9e
                                            L96:
                                                com.robinhood.android.transfers.transferhub.BindingHelpersKt$handleShowingTransferHubRowExperienceOrNot$1$1$1$1$1$$ExternalSyntheticLambda0 r10 = new com.robinhood.android.transfers.transferhub.BindingHelpersKt$handleShowingTransferHubRowExperienceOrNot$1$1$1$1$1$$ExternalSyntheticLambda0
                                                r10.<init>(r5, r6, r4, r0)
                                                r13.updateRememberedValue(r10)
                                            L9e:
                                                kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
                                                r13.endReplaceGroup()
                                                androidx.compose.ui.Modifier r0 = androidx.compose.p011ui.layout.OnRemeasuredModifier2.onSizeChanged(r7, r10)
                                                r13.endReplaceGroup()
                                                com.robinhood.android.transfers.transferhub.ComposableSingletons$BindingHelpersKt r1 = com.robinhood.android.transfers.transferhub.BindingHelpers3.INSTANCE
                                                kotlin.jvm.functions.Function2 r4 = r1.m19732getLambda$2140149642$feature_transfer_hub_externalDebug()
                                                r10 = 24576(0x6000, float:3.4438E-41)
                                                r11 = 488(0x1e8, float:6.84E-43)
                                                r1 = r3
                                                r3 = 0
                                                r5 = 0
                                                r6 = 0
                                                r7 = 0
                                                r8 = 0
                                                r9 = r2
                                                r2 = r0
                                                r0 = r9
                                                r9 = r13
                                                com.robinhood.android.microgramsdui.MicrogramEmbeddedSection3.MicrogramEmbeddedSection(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                                                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                                if (r0 == 0) goto Lca
                                                androidx.compose.runtime.ComposerKt.traceEventEnd()
                                            Lca:
                                                return
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.transfers.transferhub.BindingHelpers2.C305551.AnonymousClass1.C506081.invoke(androidx.compose.runtime.Composer, int):void");
                                        }

                                        /* JADX INFO: Access modifiers changed from: private */
                                        public static final Unit invoke$lambda$5$lambda$4$lambda$3(FragmentTransfersHubBinding fragmentTransfersHubBinding, TransfersHubFragment transfersHubFragment, Density density, SnapshotState snapshotState, IntSize intSize) {
                                            if (((int) (intSize.getPackedValue() & 4294967295L)) > 0) {
                                                invoke$lambda$2(snapshotState, true);
                                                FrameLayout ctaPlaceholder = fragmentTransfersHubBinding.ctaPlaceholder;
                                                Intrinsics.checkNotNullExpressionValue(ctaPlaceholder, "ctaPlaceholder");
                                                ctaPlaceholder.setVisibility(8);
                                            }
                                            transfersHubFragment.getTransfersHubMicrogramHeightPref().set(density.mo5013toDpu2uoSUM((int) (intSize.getPackedValue() & 4294967295L)));
                                            return Unit.INSTANCE;
                                        }

                                        private static final boolean invoke$lambda$1(SnapshotState<Boolean> snapshotState) {
                                            return snapshotState.getValue().booleanValue();
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i3) {
                                        if ((i3 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(939486970, i3, -1, "com.robinhood.android.transfers.transferhub.handleShowingTransferHubRowExperienceOrNot.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BindingHelpers.kt:59)");
                                        }
                                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(442906373, true, new C506081(transfersHubViewState2, transfersHubFragment3, fragmentTransfersHubBinding2), composer3, 54), composer3, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), composer2, ProvidedValue.$stable | 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer, 54), composer, 384, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
                binding$feature_transfer_hub_externalDebug.transferHubRedesignContent.setVisibility(0);
                binding$feature_transfer_hub_externalDebug.oldCellSelectionRoot.setVisibility(8);
            } else {
                FrameLayout ctaPlaceholder = binding$feature_transfer_hub_externalDebug.ctaPlaceholder;
                Intrinsics.checkNotNullExpressionValue(ctaPlaceholder, "ctaPlaceholder");
                ctaPlaceholder.setVisibility(8);
                binding$feature_transfer_hub_externalDebug.transferHubRedesignContent.setVisibility(8);
                binding$feature_transfer_hub_externalDebug.oldCellSelectionRoot.setVisibility(0);
                bindRowViews(transfersHubFragment, state);
            }
        }

        public static final void bindRowViews(final TransfersHubFragment transfersHubFragment, final TransfersHubViewState state) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(transfersHubFragment, "<this>");
            Intrinsics.checkNotNullParameter(state, "state");
            FragmentTransfersHubBinding binding$feature_transfer_hub_externalDebug = transfersHubFragment.getBinding$feature_transfer_hub_externalDebug();
            LogOnceAnalytics.logButtonGroupAppear$default(transfersHubFragment.getLogOnceAnalytics$feature_transfer_hub_externalDebug(), AnalyticsStrings.BUTTON_GROUP_MOVE_MONEY, AnalyticsStrings.BUTTON_MOVE_MONEY_SET_UP_DIRECT_DEPOSIT, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
            RdsRowView moveMoneyRowRecurringDeposit = binding$feature_transfer_hub_externalDebug.moveMoneyRowRecurringDeposit;
            Intrinsics.checkNotNullExpressionValue(moveMoneyRowRecurringDeposit, "moveMoneyRowRecurringDeposit");
            OnClickListeners.onClick(moveMoneyRowRecurringDeposit, new Function0() { // from class: com.robinhood.android.transfers.transferhub.BindingHelpersKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BindingHelpers.bindRowViews$lambda$8$lambda$1(state, transfersHubFragment);
                }
            });
            RdsRowView moveMoneyRowDirectDeposit = binding$feature_transfer_hub_externalDebug.moveMoneyRowDirectDeposit;
            Intrinsics.checkNotNullExpressionValue(moveMoneyRowDirectDeposit, "moveMoneyRowDirectDeposit");
            OnClickListeners.onClick(moveMoneyRowDirectDeposit, new Function0() { // from class: com.robinhood.android.transfers.transferhub.BindingHelpersKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BindingHelpers.bindRowViews$lambda$8$lambda$2(transfersHubFragment);
                }
            });
            final RdsRowView rdsRowView = binding$feature_transfer_hub_externalDebug.moveMoneyRowAcatsIn;
            Intrinsics.checkNotNull(rdsRowView);
            rdsRowView.setVisibility(state.getIsAcatsInRowVisible() ? 0 : 8);
            StringResource acatsRowPrimaryText = state.getAcatsRowPrimaryText();
            Resources resources = rdsRowView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            rdsRowView.setPrimaryText(acatsRowPrimaryText.getText(resources));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            StringResource acatsRowSecondaryTextBonus = state.getAcatsRowSecondaryTextBonus();
            if (acatsRowSecondaryTextBonus != null) {
                Resources resources2 = rdsRowView.getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                CharSequence text = acatsRowSecondaryTextBonus.getText(resources2);
                if (text != null) {
                    Object[] objArr = {new ThemableColorSpans3(ThemeAttributes.INSTANCE.getCOLOR_PRIMARY()), new StyleSpan(1)};
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append(text);
                    spannableStringBuilder.append((CharSequence) PlaceholderUtils.XXShortPlaceholderText);
                    for (int i = 0; i < 2; i++) {
                        spannableStringBuilder.setSpan(objArr[i], length, spannableStringBuilder.length(), 17);
                    }
                }
            }
            spannableStringBuilder.append(rdsRowView.getResources().getText(C30556R.string.move_money_acats_in_description));
            rdsRowView.setSecondaryText(new SpannedString(spannableStringBuilder));
            OnClickListeners.onClick(rdsRowView, new Function0() { // from class: com.robinhood.android.transfers.transferhub.BindingHelpersKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BindingHelpers.bindRowViews$lambda$8$lambda$7$lambda$6(transfersHubFragment, rdsRowView);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bindRowViews$lambda$8$lambda$1(TransfersHubViewState transfersHubViewState, TransfersHubFragment transfersHubFragment) {
            Either<FragmentKey, IntentKey> automaticDepositRowAction = transfersHubViewState.getAutomaticDepositRowAction();
            Navigator navigator = transfersHubFragment.getNavigator();
            Context contextRequireContext = transfersHubFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            onRecurringDepositsRowClick(automaticDepositRowAction, navigator, contextRequireContext, transfersHubFragment.getAnalytics(), transfersHubFragment.getEventLogger());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bindRowViews$lambda$8$lambda$2(TransfersHubFragment transfersHubFragment) {
            AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(transfersHubFragment.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_MOVE_MONEY, AnalyticsStrings.BUTTON_MOVE_MONEY_SET_UP_DIRECT_DEPOSIT, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
            EventLogger.DefaultImpls.logTap$default(transfersHubFragment.getEventLogger(), UserInteractionEventData.Action.VIEW_DD_SETUP, new Screen(Screen.Name.TRANSFERS, null, null, null, 14, null), new Component(Component.ComponentType.SETUP_DIRECT_DEPOSIT_ROW, null, null, 6, null), null, null, false, 56, null);
            Navigator navigator = transfersHubFragment.getNavigator();
            Context contextRequireContext = transfersHubFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new DirectDepositShimKey(false, false, false, false, false, false, false, true, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null), null, false, null, null, 60, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bindRowViews$lambda$8$lambda$7$lambda$6(TransfersHubFragment transfersHubFragment, RdsRowView rdsRowView) {
            Navigator navigator = transfersHubFragment.getNavigator();
            Context context = rdsRowView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, context, new AcatsIn("transfers", false, false, null, false, 30, null), null, false, null, null, 60, null);
            return Unit.INSTANCE;
        }

        private static final void onRecurringDepositsRowClick(Either<? extends FragmentKey, ? extends IntentKey> either, Navigator navigator, Context context, AnalyticsLogger analyticsLogger, EventLogger eventLogger) {
            AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(analyticsLogger, AnalyticsStrings.BUTTON_GROUP_MOVE_MONEY, AnalyticsStrings.BUTTON_MOVE_MONEY_SCHEDULE_AUTO_DEPOSIT, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
            EventLogger.DefaultImpls.logTap$default(eventLogger, null, new Screen(Screen.Name.TRANSFERS, null, null, null, 14, null), new Component(Component.ComponentType.RECURRING_DEPOSITS_ROW, null, null, 6, null), null, null, false, 57, null);
            if (either instanceof Either.Left) {
                Navigator.DefaultImpls.showFragment$default(navigator, context, (FragmentKey) ((Either.Left) either).getValue(), false, false, false, null, false, null, false, false, null, null, 4092, null);
            } else {
                if (!(either instanceof Either.Right)) {
                    throw new NoWhenBranchMatchedException();
                }
                Navigator.DefaultImpls.startActivity$default(navigator, context, (IntentKey) ((Either.Right) either).getValue(), null, false, null, null, 60, null);
            }
        }
    }
