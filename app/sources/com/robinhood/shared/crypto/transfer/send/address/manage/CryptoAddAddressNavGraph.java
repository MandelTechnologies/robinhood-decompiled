package com.robinhood.shared.crypto.transfer.send.address.manage;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.navigation.NavBackStackEntry;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.navigation.compose.LifecycleAwareNavigator;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.crypto.transfer.unified.QrScannerState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoAddAddressNavGraph.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.send.address.manage.ComposableSingletons$CryptoAddAddressNavGraphKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoAddAddressNavGraph {
    public static final CryptoAddAddressNavGraph INSTANCE = new CryptoAddAddressNavGraph();
    private static Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> lambda$789675490 = ComposableLambda3.composableLambdaInstance(789675490, false, new Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.address.manage.ComposableSingletons$CryptoAddAddressNavGraphKt$lambda$789675490$1
        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, LifecycleAwareNavigator lifecycleAwareNavigator, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, navBackStackEntry, lifecycleAwareNavigator, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope composable, NavBackStackEntry unused$var$, LifecycleAwareNavigator navigator, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composable, "$this$composable");
            Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(789675490, i, -1, "com.robinhood.shared.crypto.transfer.send.address.manage.ComposableSingletons$CryptoAddAddressNavGraphKt.lambda$789675490.<anonymous> (CryptoAddAddressNavGraph.kt:35)");
            }
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CRYPTO_TRANSFER_ADD_SAVED_ADDRESS_QR_SCANNER, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(1713154317, true, new AnonymousClass1(navigator), composer, 54), composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* compiled from: CryptoAddAddressNavGraph.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.shared.crypto.transfer.send.address.manage.ComposableSingletons$CryptoAddAddressNavGraphKt$lambda$789675490$1$1, reason: invalid class name */
        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ LifecycleAwareNavigator $navigator;

            AnonymousClass1(LifecycleAwareNavigator lifecycleAwareNavigator) {
                this.$navigator = lifecycleAwareNavigator;
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
                    ComposerKt.traceEventStart(1713154317, i, -1, "com.robinhood.shared.crypto.transfer.send.address.manage.ComposableSingletons$CryptoAddAddressNavGraphKt.lambda$789675490.<anonymous>.<anonymous> (CryptoAddAddressNavGraph.kt:40)");
                }
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                QrScannerState qrScannerState = new QrScannerState(null, true);
                composer.startReplaceGroup(5004770);
                boolean zChanged = composer.changed(this.$navigator);
                final LifecycleAwareNavigator lifecycleAwareNavigator = this.$navigator;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004b: CONSTRUCTOR (r1v3 'objRememberedValue' java.lang.Object) = (r0v3 'lifecycleAwareNavigator' com.robinhood.android.navigation.compose.LifecycleAwareNavigator A[DONT_INLINE]) A[MD:(com.robinhood.android.navigation.compose.LifecycleAwareNavigator):void (m)] (LINE:47) call: com.robinhood.shared.crypto.transfer.send.address.manage.ComposableSingletons$CryptoAddAddressNavGraphKt$lambda$789675490$1$1$$ExternalSyntheticLambda0.<init>(com.robinhood.android.navigation.compose.LifecycleAwareNavigator):void type: CONSTRUCTOR in method: com.robinhood.shared.crypto.transfer.send.address.manage.ComposableSingletons$CryptoAddAddressNavGraphKt$lambda$789675490$1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes6.dex
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.shared.crypto.transfer.send.address.manage.ComposableSingletons$CryptoAddAddressNavGraphKt$lambda$789675490$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                        	... 25 more
                        */
                    /*
                        this = this;
                        r0 = r11 & 3
                        r1 = 2
                        if (r0 != r1) goto L10
                        boolean r0 = r10.getSkipping()
                        if (r0 != 0) goto Lc
                        goto L10
                    Lc:
                        r10.skipToGroupEnd()
                        return
                    L10:
                        boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                        if (r0 == 0) goto L1f
                        r0 = -1
                        java.lang.String r1 = "com.robinhood.shared.crypto.transfer.send.address.manage.ComposableSingletons$CryptoAddAddressNavGraphKt.lambda$789675490.<anonymous>.<anonymous> (CryptoAddAddressNavGraph.kt:40)"
                        r2 = 1713154317(0x661ca90d, float:1.849519E23)
                        androidx.compose.runtime.ComposerKt.traceEventStart(r2, r11, r0, r1)
                    L1f:
                        androidx.compose.ui.Modifier$Companion r11 = androidx.compose.p011ui.Modifier.INSTANCE
                        r0 = 0
                        r1 = 1
                        r2 = 0
                        androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(r11, r0, r1, r2)
                        com.robinhood.shared.crypto.transfer.unified.QrScannerState r3 = new com.robinhood.shared.crypto.transfer.unified.QrScannerState
                        r3.<init>(r2, r1)
                        r11 = 5004770(0x4c5de2, float:7.013177E-39)
                        r10.startReplaceGroup(r11)
                        com.robinhood.android.navigation.compose.LifecycleAwareNavigator r11 = r9.$navigator
                        boolean r11 = r10.changed(r11)
                        com.robinhood.android.navigation.compose.LifecycleAwareNavigator r0 = r9.$navigator
                        java.lang.Object r1 = r10.rememberedValue()
                        if (r11 != 0) goto L49
                        androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.INSTANCE
                        java.lang.Object r11 = r11.getEmpty()
                        if (r1 != r11) goto L51
                    L49:
                        com.robinhood.shared.crypto.transfer.send.address.manage.ComposableSingletons$CryptoAddAddressNavGraphKt$lambda$789675490$1$1$$ExternalSyntheticLambda0 r1 = new com.robinhood.shared.crypto.transfer.send.address.manage.ComposableSingletons$CryptoAddAddressNavGraphKt$lambda$789675490$1$1$$ExternalSyntheticLambda0
                        r1.<init>(r0)
                        r10.updateRememberedValue(r1)
                    L51:
                        r4 = r1
                        kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
                        r10.endReplaceGroup()
                        int r11 = com.robinhood.utils.resource.StringResource.$stable
                        r7 = r11 | 384(0x180, float:5.38E-43)
                        r8 = 0
                        r6 = r10
                        com.robinhood.shared.crypto.transfer.unified.CryptoTransferQrScannerComposable3.CryptoTransferQrScannerScaffold(r3, r4, r5, r6, r7, r8)
                        boolean r10 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                        if (r10 == 0) goto L69
                        androidx.compose.runtime.ComposerKt.traceEventEnd()
                    L69:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddAddressNavGraph2.AnonymousClass1.invoke(androidx.compose.runtime.Composer, int):void");
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit invoke$lambda$1$lambda$0(LifecycleAwareNavigator lifecycleAwareNavigator, String address) {
                    Intrinsics.checkNotNullParameter(address, "address");
                    LifecycleAwareNavigator.setResultAndPop$default(lifecycleAwareNavigator, address, CryptoAddAddressNavDestinations2.KEY_SCANNED_ADDRESS, false, 4, null);
                    return Unit.INSTANCE;
                }
            }
        });

        public final Function5<AnimatedVisibilityScope, NavBackStackEntry, LifecycleAwareNavigator, Composer, Integer, Unit> getLambda$789675490$feature_crypto_transfer_externalDebug() {
            return lambda$789675490;
        }
    }
