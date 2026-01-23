package com.robinhood.android.equities.taxlots.alert;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.p011ui.platform.ViewCompositionStrategy;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertFragment;
import com.robinhood.android.equities.taxlots.utils.TaxLotsStringsHelper;
import com.robinhood.android.navigation.DialogFragmentResolver;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.rosetta.common.Money;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.DialogFragmentWithArgsCompanion;
import com.robinhood.utils.resource.StringResource;
import equity_trading_tax_lots.proto.p460v1.SelectionStrategy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* compiled from: TaxLotsMaximumSelectedLotsAlertFragment.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/alert/TaxLotsMaximumSelectedLotsAlertFragment;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/equities/taxlots/alert/TaxLotsMaximumSelectedLotsAlertFragmentCallbacks;", "getCallbacks", "()Lcom/robinhood/android/equities/taxlots/alert/TaxLotsMaximumSelectedLotsAlertFragmentCallbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class TaxLotsMaximumSelectedLotsAlertFragment extends Hammer_TaxLotsMaximumSelectedLotsAlertFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(TaxLotsMaximumSelectedLotsAlertFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/equities/taxlots/alert/TaxLotsMaximumSelectedLotsAlertFragmentCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public TaxLotsMaximumSelectedLotsAlertFragment() {
        super((DefaultConstructorMarker) null);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(TaxLotsMaximumSelectedLotsAlertFragmentCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TaxLotsMaximumSelectedLotsAlertFragmentCallbacks getCallbacks() {
        return (TaxLotsMaximumSelectedLotsAlertFragmentCallbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(ComposableLambda3.composableLambdaInstance(-84743606, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertFragment$onCreateDialog$1$1

            /* compiled from: TaxLotsMaximumSelectedLotsAlertFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertFragment$onCreateDialog$1$1$1 */
            static final class C148591 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ TaxLotsMaximumSelectedLotsAlertFragment this$0;

                C148591(TaxLotsMaximumSelectedLotsAlertFragment taxLotsMaximumSelectedLotsAlertFragment) {
                    this.this$0 = taxLotsMaximumSelectedLotsAlertFragment;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer, int i) {
                    String amount;
                    if ((i & 3) == 2 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2028921342, i, -1, "com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertFragment.onCreateDialog.<anonymous>.<anonymous>.<anonymous> (TaxLotsMaximumSelectedLotsAlertFragment.kt:29)");
                    }
                    TaxLotsMaximumSelectedLotsAlertFragment.Companion companion = TaxLotsMaximumSelectedLotsAlertFragment.INSTANCE;
                    String maximum_quantity = ((TaxLotsSelectionStrategyMaximumSelectedLotsKey) companion.getArgs((Fragment) this.this$0)).getSelectionStrategySummary().getMaximum_quantity();
                    SelectionStrategy selectionStrategy = ((TaxLotsSelectionStrategyMaximumSelectedLotsKey) companion.getArgs((Fragment) this.this$0)).getSelectionStrategy();
                    com.robinhood.rosetta.eventlogging.Context eventContext = ((TaxLotsSelectionStrategyMaximumSelectedLotsKey) companion.getArgs((Fragment) this.this$0)).getEventContext();
                    int maxNumberOfTaxLots = ((TaxLotsSelectionStrategyMaximumSelectedLotsKey) companion.getArgs((Fragment) this.this$0)).getMaxNumberOfTaxLots();
                    TaxLotsStringsHelper taxLotsStringsHelper = TaxLotsStringsHelper.INSTANCE;
                    Money estimated_gain_loss = ((TaxLotsSelectionStrategyMaximumSelectedLotsKey) companion.getArgs((Fragment) this.this$0)).getSelectionStrategySummary().getEstimated_gain_loss();
                    StringResource gainLossAlert = taxLotsStringsHelper.getGainLossAlert(BigDecimals7.orZero((estimated_gain_loss == null || (amount = estimated_gain_loss.getAmount()) == null) ? null : StringsKt.toBigDecimalOrNull(amount)));
                    Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    String string2 = gainLossAlert.getText(resources).toString();
                    composer.startReplaceGroup(5004770);
                    boolean zChangedInstance = composer.changedInstance(this.this$0);
                    final TaxLotsMaximumSelectedLotsAlertFragment taxLotsMaximumSelectedLotsAlertFragment = this.this$0;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00b6: CONSTRUCTOR (r6v1 'objRememberedValue' java.lang.Object) = 
                              (r5v0 'taxLotsMaximumSelectedLotsAlertFragment' com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertFragment A[DONT_INLINE])
                             A[MD:(com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertFragment):void (m)] (LINE:39) call: com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertFragment$onCreateDialog$1$1$1$$ExternalSyntheticLambda0.<init>(com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertFragment):void type: CONSTRUCTOR in method: com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertFragment$onCreateDialog$1$1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes3.dex
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertFragment$onCreateDialog$1$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	... 25 more
                            */
                        /*
                            this = this;
                            r0 = r13 & 3
                            r1 = 2
                            if (r0 != r1) goto L10
                            boolean r0 = r12.getSkipping()
                            if (r0 != 0) goto Lc
                            goto L10
                        Lc:
                            r12.skipToGroupEnd()
                            return
                        L10:
                            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                            if (r0 == 0) goto L1f
                            r0 = -1
                            java.lang.String r1 = "com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertFragment.onCreateDialog.<anonymous>.<anonymous>.<anonymous> (TaxLotsMaximumSelectedLotsAlertFragment.kt:29)"
                            r2 = -2028921342(0xffffffff87111e02, float:-1.0917406E-34)
                            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r13, r0, r1)
                        L1f:
                            com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertFragment$Companion r13 = com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertFragment.INSTANCE
                            com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertFragment r0 = r11.this$0
                            android.os.Parcelable r0 = r13.getArgs(r0)
                            com.robinhood.android.equities.taxlots.alert.TaxLotsSelectionStrategyMaximumSelectedLotsKey r0 = (com.robinhood.android.equities.taxlots.alert.TaxLotsSelectionStrategyMaximumSelectedLotsKey) r0
                            equity_trading_tax_lots.proto.v1.SelectionStrategySummary r0 = r0.getSelectionStrategySummary()
                            java.lang.String r1 = r0.getMaximum_quantity()
                            com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertFragment r0 = r11.this$0
                            android.os.Parcelable r0 = r13.getArgs(r0)
                            com.robinhood.android.equities.taxlots.alert.TaxLotsSelectionStrategyMaximumSelectedLotsKey r0 = (com.robinhood.android.equities.taxlots.alert.TaxLotsSelectionStrategyMaximumSelectedLotsKey) r0
                            equity_trading_tax_lots.proto.v1.SelectionStrategy r3 = r0.getSelectionStrategy()
                            com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertFragment r0 = r11.this$0
                            android.os.Parcelable r0 = r13.getArgs(r0)
                            com.robinhood.android.equities.taxlots.alert.TaxLotsSelectionStrategyMaximumSelectedLotsKey r0 = (com.robinhood.android.equities.taxlots.alert.TaxLotsSelectionStrategyMaximumSelectedLotsKey) r0
                            com.robinhood.rosetta.eventlogging.Context r7 = r0.getEventContext()
                            com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertFragment r0 = r11.this$0
                            android.os.Parcelable r0 = r13.getArgs(r0)
                            com.robinhood.android.equities.taxlots.alert.TaxLotsSelectionStrategyMaximumSelectedLotsKey r0 = (com.robinhood.android.equities.taxlots.alert.TaxLotsSelectionStrategyMaximumSelectedLotsKey) r0
                            int r4 = r0.getMaxNumberOfTaxLots()
                            com.robinhood.android.equities.taxlots.utils.TaxLotsStringsHelper r0 = com.robinhood.android.equities.taxlots.utils.TaxLotsStringsHelper.INSTANCE
                            com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertFragment r2 = r11.this$0
                            android.os.Parcelable r13 = r13.getArgs(r2)
                            com.robinhood.android.equities.taxlots.alert.TaxLotsSelectionStrategyMaximumSelectedLotsKey r13 = (com.robinhood.android.equities.taxlots.alert.TaxLotsSelectionStrategyMaximumSelectedLotsKey) r13
                            equity_trading_tax_lots.proto.v1.SelectionStrategySummary r13 = r13.getSelectionStrategySummary()
                            com.robinhood.rosetta.common.Money r13 = r13.getEstimated_gain_loss()
                            if (r13 == 0) goto L74
                            java.lang.String r13 = r13.getAmount()
                            if (r13 == 0) goto L74
                            java.math.BigDecimal r13 = kotlin.text.StringsKt.toBigDecimalOrNull(r13)
                            goto L75
                        L74:
                            r13 = 0
                        L75:
                            java.math.BigDecimal r13 = com.robinhood.utils.math.BigDecimals7.orZero(r13)
                            com.robinhood.utils.resource.StringResource r13 = r0.getGainLossAlert(r13)
                            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()
                            java.lang.Object r0 = r12.consume(r0)
                            android.content.Context r0 = (android.content.Context) r0
                            android.content.res.Resources r0 = r0.getResources()
                            java.lang.String r2 = "getResources(...)"
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
                            java.lang.CharSequence r13 = r13.getText(r0)
                            java.lang.String r2 = r13.toString()
                            r13 = 5004770(0x4c5de2, float:7.013177E-39)
                            r12.startReplaceGroup(r13)
                            com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertFragment r0 = r11.this$0
                            boolean r0 = r12.changedInstance(r0)
                            com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertFragment r5 = r11.this$0
                            java.lang.Object r6 = r12.rememberedValue()
                            if (r0 != 0) goto Lb4
                            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.INSTANCE
                            java.lang.Object r0 = r0.getEmpty()
                            if (r6 != r0) goto Lbc
                        Lb4:
                            com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertFragment$onCreateDialog$1$1$1$$ExternalSyntheticLambda0 r6 = new com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertFragment$onCreateDialog$1$1$1$$ExternalSyntheticLambda0
                            r6.<init>(r5)
                            r12.updateRememberedValue(r6)
                        Lbc:
                            r5 = r6
                            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
                            r12.endReplaceGroup()
                            r12.startReplaceGroup(r13)
                            com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertFragment r13 = r11.this$0
                            boolean r13 = r12.changedInstance(r13)
                            com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertFragment r0 = r11.this$0
                            java.lang.Object r6 = r12.rememberedValue()
                            if (r13 != 0) goto Ldb
                            androidx.compose.runtime.Composer$Companion r13 = androidx.compose.runtime.Composer.INSTANCE
                            java.lang.Object r13 = r13.getEmpty()
                            if (r6 != r13) goto Le3
                        Ldb:
                            com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertFragment$onCreateDialog$1$1$1$$ExternalSyntheticLambda1 r6 = new com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertFragment$onCreateDialog$1$1$1$$ExternalSyntheticLambda1
                            r6.<init>(r0)
                            r12.updateRememberedValue(r6)
                        Le3:
                            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
                            r12.endReplaceGroup()
                            r9 = 0
                            r10 = 0
                            r8 = r12
                            com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlert.TaxLotsSelectionStrategyMaximumSelectedLotsAlert(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                            boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                            if (r12 == 0) goto Lf7
                            androidx.compose.runtime.ComposerKt.traceEventEnd()
                        Lf7:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertFragment2.C148591.invoke(androidx.compose.runtime.Composer, int):void");
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(TaxLotsMaximumSelectedLotsAlertFragment taxLotsMaximumSelectedLotsAlertFragment) {
                        taxLotsMaximumSelectedLotsAlertFragment.getCallbacks().onSelectionStrategyProceed(((TaxLotsSelectionStrategyMaximumSelectedLotsKey) TaxLotsMaximumSelectedLotsAlertFragment.INSTANCE.getArgs((Fragment) taxLotsMaximumSelectedLotsAlertFragment)).getSelectionStrategySummary());
                        taxLotsMaximumSelectedLotsAlertFragment.dismiss();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2(TaxLotsMaximumSelectedLotsAlertFragment taxLotsMaximumSelectedLotsAlertFragment) {
                        taxLotsMaximumSelectedLotsAlertFragment.getCallbacks().onSelectionStrategyDismiss();
                        taxLotsMaximumSelectedLotsAlertFragment.dismiss();
                        return Unit.INSTANCE;
                    }
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
                        ComposerKt.traceEventStart(-84743606, i, -1, "com.robinhood.android.equities.taxlots.alert.TaxLotsMaximumSelectedLotsAlertFragment.onCreateDialog.<anonymous>.<anonymous> (TaxLotsMaximumSelectedLotsAlertFragment.kt:28)");
                    }
                    BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-2028921342, true, new C148591(this.this$0), composer, 54), composer, 100663296, 255);
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

        /* compiled from: TaxLotsMaximumSelectedLotsAlertFragment.kt */
        @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00030\u0004B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/alert/TaxLotsMaximumSelectedLotsAlertFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/DialogFragmentWithArgsCompanion;", "Lcom/robinhood/android/equities/taxlots/alert/TaxLotsMaximumSelectedLotsAlertFragment;", "Lcom/robinhood/android/equities/taxlots/alert/TaxLotsSelectionStrategyMaximumSelectedLotsKey;", "Lcom/robinhood/android/navigation/DialogFragmentResolver;", "<init>", "()V", "createDialogFragment", "Landroidx/fragment/app/DialogFragment;", "key", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements DialogFragmentWithArgsCompanion<TaxLotsMaximumSelectedLotsAlertFragment, TaxLotsSelectionStrategyMaximumSelectedLotsKey>, DialogFragmentResolver<TaxLotsSelectionStrategyMaximumSelectedLotsKey> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
            public TaxLotsSelectionStrategyMaximumSelectedLotsKey getArgs(TaxLotsMaximumSelectedLotsAlertFragment taxLotsMaximumSelectedLotsAlertFragment) {
                return (TaxLotsSelectionStrategyMaximumSelectedLotsKey) DialogFragmentWithArgsCompanion.DefaultImpls.getArgs(this, taxLotsMaximumSelectedLotsAlertFragment);
            }

            @Override // com.robinhood.utils.p409ui.fragment.DialogFragmentWithArgsCompanion
            public TaxLotsMaximumSelectedLotsAlertFragment newInstance(TaxLotsSelectionStrategyMaximumSelectedLotsKey taxLotsSelectionStrategyMaximumSelectedLotsKey, int i) {
                return (TaxLotsMaximumSelectedLotsAlertFragment) DialogFragmentWithArgsCompanion.DefaultImpls.newInstance(this, taxLotsSelectionStrategyMaximumSelectedLotsKey, i);
            }

            @Override // com.robinhood.android.navigation.DialogFragmentResolver
            public DialogFragment createDialogFragment(TaxLotsSelectionStrategyMaximumSelectedLotsKey key) {
                Intrinsics.checkNotNullParameter(key, "key");
                return DialogFragmentWithArgsCompanion.DefaultImpls.newInstance$default(this, key, 0, 2, null);
            }
        }
    }
