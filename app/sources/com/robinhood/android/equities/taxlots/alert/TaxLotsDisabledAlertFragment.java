package com.robinhood.android.equities.taxlots.alert;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.p011ui.platform.ViewCompositionStrategy;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.navigation.DialogFragmentResolver;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.p409ui.fragment.DialogFragmentWithArgsCompanion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TaxLotsDisabledAlertFragment.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/alert/TaxLotsDisabledAlertFragment;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class TaxLotsDisabledAlertFragment extends Hammer_TaxLotsDisabledAlertFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public TaxLotsDisabledAlertFragment() {
        super((DefaultConstructorMarker) null);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(ComposableLambda3.composableLambdaInstance(-1160294346, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.taxlots.alert.TaxLotsDisabledAlertFragment$onCreateDialog$1$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void invoke(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1160294346, i, -1, "com.robinhood.android.equities.taxlots.alert.TaxLotsDisabledAlertFragment.onCreateDialog.<anonymous>.<anonymous> (TaxLotsDisabledAlertFragment.kt:26)");
                }
                Object[] objArr = 0 == true ? 1 : 0;
                UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, new Screen(Screen.Name.TAX_LOTS_SELECTION, null, null, null, 14, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, objArr, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ((TaxLotsDisabledKey) TaxLotsDisabledAlertFragment.INSTANCE.getArgs((Fragment) this.this$0)).getEquityOrderContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -536870913, -1, -1, -1, 16383, null), null, null, 53, null);
                final TaxLotsDisabledAlertFragment taxLotsDisabledAlertFragment = this.this$0;
                AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(1776848417, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.taxlots.alert.TaxLotsDisabledAlertFragment$onCreateDialog$1$1.1

                    /* compiled from: TaxLotsDisabledAlertFragment.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.equities.taxlots.alert.TaxLotsDisabledAlertFragment$onCreateDialog$1$1$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ TaxLotsDisabledAlertFragment this$0;

                        AnonymousClass1(TaxLotsDisabledAlertFragment taxLotsDisabledAlertFragment) {
                            this.this$0 = taxLotsDisabledAlertFragment;
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
                                ComposerKt.traceEventStart(-1152550551, i, -1, "com.robinhood.android.equities.taxlots.alert.TaxLotsDisabledAlertFragment.onCreateDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TaxLotsDisabledAlertFragment.kt:35)");
                            }
                            String symbol = ((TaxLotsDisabledKey) TaxLotsDisabledAlertFragment.INSTANCE.getArgs((Fragment) this.this$0)).getEquityOrderContext().getSymbol();
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(this.this$0);
                            final TaxLotsDisabledAlertFragment taxLotsDisabledAlertFragment = this.this$0;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = 
                                /*  JADX ERROR: Method code generation error
                                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004f: CONSTRUCTOR (r2v1 'objRememberedValue' java.lang.Object) = 
                                      (r1v1 'taxLotsDisabledAlertFragment' com.robinhood.android.equities.taxlots.alert.TaxLotsDisabledAlertFragment A[DONT_INLINE])
                                     A[MD:(com.robinhood.android.equities.taxlots.alert.TaxLotsDisabledAlertFragment):void (m)] (LINE:36) call: com.robinhood.android.equities.taxlots.alert.TaxLotsDisabledAlertFragment$onCreateDialog$1$1$1$1$$ExternalSyntheticLambda0.<init>(com.robinhood.android.equities.taxlots.alert.TaxLotsDisabledAlertFragment):void type: CONSTRUCTOR in method: com.robinhood.android.equities.taxlots.alert.TaxLotsDisabledAlertFragment.onCreateDialog.1.1.1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes3.dex
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
                                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.equities.taxlots.alert.TaxLotsDisabledAlertFragment$onCreateDialog$1$1$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                    	... 25 more
                                    */
                                /*
                                    this = this;
                                    r0 = r5 & 3
                                    r1 = 2
                                    if (r0 != r1) goto L10
                                    boolean r0 = r4.getSkipping()
                                    if (r0 != 0) goto Lc
                                    goto L10
                                Lc:
                                    r4.skipToGroupEnd()
                                    return
                                L10:
                                    boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                    if (r0 == 0) goto L1f
                                    r0 = -1
                                    java.lang.String r1 = "com.robinhood.android.equities.taxlots.alert.TaxLotsDisabledAlertFragment.onCreateDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TaxLotsDisabledAlertFragment.kt:35)"
                                    r2 = -1152550551(0xffffffffbb4d7969, float:-0.0031352884)
                                    androidx.compose.runtime.ComposerKt.traceEventStart(r2, r5, r0, r1)
                                L1f:
                                    com.robinhood.android.equities.taxlots.alert.TaxLotsDisabledAlertFragment$Companion r5 = com.robinhood.android.equities.taxlots.alert.TaxLotsDisabledAlertFragment.INSTANCE
                                    com.robinhood.android.equities.taxlots.alert.TaxLotsDisabledAlertFragment r0 = r3.this$0
                                    android.os.Parcelable r5 = r5.getArgs(r0)
                                    com.robinhood.android.equities.taxlots.alert.TaxLotsDisabledKey r5 = (com.robinhood.android.equities.taxlots.alert.TaxLotsDisabledKey) r5
                                    com.robinhood.rosetta.eventlogging.EquityOrderContext r5 = r5.getEquityOrderContext()
                                    java.lang.String r5 = r5.getSymbol()
                                    r0 = 5004770(0x4c5de2, float:7.013177E-39)
                                    r4.startReplaceGroup(r0)
                                    com.robinhood.android.equities.taxlots.alert.TaxLotsDisabledAlertFragment r0 = r3.this$0
                                    boolean r0 = r4.changedInstance(r0)
                                    com.robinhood.android.equities.taxlots.alert.TaxLotsDisabledAlertFragment r1 = r3.this$0
                                    java.lang.Object r2 = r4.rememberedValue()
                                    if (r0 != 0) goto L4d
                                    androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.INSTANCE
                                    java.lang.Object r0 = r0.getEmpty()
                                    if (r2 != r0) goto L55
                                L4d:
                                    com.robinhood.android.equities.taxlots.alert.TaxLotsDisabledAlertFragment$onCreateDialog$1$1$1$1$$ExternalSyntheticLambda0 r2 = new com.robinhood.android.equities.taxlots.alert.TaxLotsDisabledAlertFragment$onCreateDialog$1$1$1$1$$ExternalSyntheticLambda0
                                    r2.<init>(r1)
                                    r4.updateRememberedValue(r2)
                                L55:
                                    kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
                                    r4.endReplaceGroup()
                                    r0 = 0
                                    com.robinhood.android.equities.taxlots.alert.TaxLotsDisabledAlert.TaxLotsDisabledAlert(r5, r2, r4, r0)
                                    boolean r4 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                    if (r4 == 0) goto L67
                                    androidx.compose.runtime.ComposerKt.traceEventEnd()
                                L67:
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.equities.taxlots.alert.TaxLotsDisabledAlertFragment2.C148511.AnonymousClass1.invoke(androidx.compose.runtime.Composer, int):void");
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(TaxLotsDisabledAlertFragment taxLotsDisabledAlertFragment) {
                                taxLotsDisabledAlertFragment.dismiss();
                                return Unit.INSTANCE;
                            }
                        }

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
                                ComposerKt.traceEventStart(1776848417, i2, -1, "com.robinhood.android.equities.taxlots.alert.TaxLotsDisabledAlertFragment.onCreateDialog.<anonymous>.<anonymous>.<anonymous> (TaxLotsDisabledAlertFragment.kt:34)");
                            }
                            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1152550551, true, new AnonymousClass1(taxLotsDisabledAlertFragment), composer2, 54), composer2, 100663296, 255);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer, 54), composer, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            builder.setView(composeView);
            AlertDialog alertDialogCreate = builder.create();
            Intrinsics.checkNotNullExpressionValue(alertDialogCreate, "create(...)");
            return alertDialogCreate;
        }

        /* compiled from: TaxLotsDisabledAlertFragment.kt */
        @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00030\u0004B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/alert/TaxLotsDisabledAlertFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/DialogFragmentWithArgsCompanion;", "Lcom/robinhood/android/equities/taxlots/alert/TaxLotsDisabledAlertFragment;", "Lcom/robinhood/android/equities/taxlots/alert/TaxLotsDisabledKey;", "Lcom/robinhood/android/navigation/DialogFragmentResolver;", "<init>", "()V", "createDialogFragment", "Landroidx/fragment/app/DialogFragment;", "key", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements DialogFragmentWithArgsCompanion<TaxLotsDisabledAlertFragment, TaxLotsDisabledKey>, DialogFragmentResolver<TaxLotsDisabledKey> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
            public TaxLotsDisabledKey getArgs(TaxLotsDisabledAlertFragment taxLotsDisabledAlertFragment) {
                return (TaxLotsDisabledKey) DialogFragmentWithArgsCompanion.DefaultImpls.getArgs(this, taxLotsDisabledAlertFragment);
            }

            @Override // com.robinhood.utils.p409ui.fragment.DialogFragmentWithArgsCompanion
            public TaxLotsDisabledAlertFragment newInstance(TaxLotsDisabledKey taxLotsDisabledKey, int i) {
                return (TaxLotsDisabledAlertFragment) DialogFragmentWithArgsCompanion.DefaultImpls.newInstance(this, taxLotsDisabledKey, i);
            }

            @Override // com.robinhood.android.navigation.DialogFragmentResolver
            public DialogFragment createDialogFragment(TaxLotsDisabledKey key) {
                Intrinsics.checkNotNullParameter(key, "key");
                return DialogFragmentWithArgsCompanion.DefaultImpls.newInstance$default(this, key, 0, 2, null);
            }
        }
    }
