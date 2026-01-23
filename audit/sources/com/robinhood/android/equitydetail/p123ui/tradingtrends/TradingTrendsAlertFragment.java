package com.robinhood.android.equitydetail.p123ui.tradingtrends;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.p011ui.platform.ViewCompositionStrategy;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.search.contracts.SearchSelectorKey;
import com.robinhood.android.search.contracts.SearchSelectorLaunchMode;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TradingTrendsAlertFragment.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/tradingtrends/TradingTrendsAlertFragment;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "searchSelectorLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class TradingTrendsAlertFragment extends Hammer_TradingTrendsAlertFragment {
    public static final int $stable = 8;
    public Navigator navigator;
    private ActivityResultLauncher<Intent> searchSelectorLauncher;

    public TradingTrendsAlertFragment() {
        super((DefaultConstructorMarker) null);
    }

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.searchSelectorLauncher = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.equitydetail.ui.tradingtrends.TradingTrendsAlertFragment.onCreate.1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.getResultCode() == -1) {
                    TradingTrendsAlertFragment.this.requireActivity().finish();
                }
            }
        });
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(ComposableLambda3.composableLambdaInstance(-530469627, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitydetail.ui.tradingtrends.TradingTrendsAlertFragment$onCreateDialog$1$1

            /* compiled from: TradingTrendsAlertFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.equitydetail.ui.tradingtrends.TradingTrendsAlertFragment$onCreateDialog$1$1$1 */
            static final class C156421 implements Function2<Composer, Integer, Unit> {
                final /* synthetic */ TradingTrendsAlertFragment this$0;

                C156421(TradingTrendsAlertFragment tradingTrendsAlertFragment) {
                    this.this$0 = tradingTrendsAlertFragment;
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
                        ComposerKt.traceEventStart(-276405171, i, -1, "com.robinhood.android.equitydetail.ui.tradingtrends.TradingTrendsAlertFragment.onCreateDialog.<anonymous>.<anonymous>.<anonymous> (TradingTrendsAlertFragment.kt:45)");
                    }
                    String string2 = this.this$0.getString(C15314R.string.trading_trends_not_available_alert_title);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    String string3 = this.this$0.getString(C15314R.string.trading_trends_not_available_alert_body);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(string3);
                    String string4 = this.this$0.getString(C15314R.string.trading_trends_not_available_alert_button);
                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                    composer.startReplaceGroup(5004770);
                    boolean zChangedInstance = composer.changedInstance(this.this$0);
                    final TradingTrendsAlertFragment tradingTrendsAlertFragment = this.this$0;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0065: CONSTRUCTOR (r5v1 'objRememberedValue' java.lang.Object) = 
                              (r4v0 'tradingTrendsAlertFragment' com.robinhood.android.equitydetail.ui.tradingtrends.TradingTrendsAlertFragment A[DONT_INLINE])
                             A[MD:(com.robinhood.android.equitydetail.ui.tradingtrends.TradingTrendsAlertFragment):void (m)] (LINE:53) call: com.robinhood.android.equitydetail.ui.tradingtrends.TradingTrendsAlertFragment$onCreateDialog$1$1$1$$ExternalSyntheticLambda0.<init>(com.robinhood.android.equitydetail.ui.tradingtrends.TradingTrendsAlertFragment):void type: CONSTRUCTOR in method: com.robinhood.android.equitydetail.ui.tradingtrends.TradingTrendsAlertFragment$onCreateDialog$1$1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes3.dex
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.equitydetail.ui.tradingtrends.TradingTrendsAlertFragment$onCreateDialog$1$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	... 25 more
                            */
                        /*
                            this = this;
                            r0 = r15 & 3
                            r1 = 2
                            if (r0 != r1) goto L10
                            boolean r0 = r14.getSkipping()
                            if (r0 != 0) goto Lc
                            goto L10
                        Lc:
                            r14.skipToGroupEnd()
                            return
                        L10:
                            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                            if (r0 == 0) goto L1f
                            r0 = -1
                            java.lang.String r1 = "com.robinhood.android.equitydetail.ui.tradingtrends.TradingTrendsAlertFragment.onCreateDialog.<anonymous>.<anonymous>.<anonymous> (TradingTrendsAlertFragment.kt:45)"
                            r2 = -276405171(0xffffffffef86644d, float:-8.3184495E28)
                            androidx.compose.runtime.ComposerKt.traceEventStart(r2, r15, r0, r1)
                        L1f:
                            com.robinhood.android.equitydetail.ui.tradingtrends.TradingTrendsAlertFragment r15 = r13.this$0
                            int r0 = com.robinhood.android.equitydetail.C15314R.string.trading_trends_not_available_alert_title
                            java.lang.String r1 = r15.getString(r0)
                            java.lang.String r15 = "getString(...)"
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r15)
                            com.robinhood.compose.bento.component.alerts.BentoAlertDialogs$Body$Text r2 = new com.robinhood.compose.bento.component.alerts.BentoAlertDialogs$Body$Text
                            com.robinhood.android.equitydetail.ui.tradingtrends.TradingTrendsAlertFragment r0 = r13.this$0
                            int r3 = com.robinhood.android.equitydetail.C15314R.string.trading_trends_not_available_alert_body
                            java.lang.String r0 = r0.getString(r3)
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r15)
                            r2.<init>(r0)
                            com.robinhood.android.equitydetail.ui.tradingtrends.TradingTrendsAlertFragment r0 = r13.this$0
                            int r3 = com.robinhood.android.equitydetail.C15314R.string.trading_trends_not_available_alert_button
                            java.lang.String r0 = r0.getString(r3)
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r15)
                            r15 = 5004770(0x4c5de2, float:7.013177E-39)
                            r14.startReplaceGroup(r15)
                            com.robinhood.android.equitydetail.ui.tradingtrends.TradingTrendsAlertFragment r3 = r13.this$0
                            boolean r3 = r14.changedInstance(r3)
                            com.robinhood.android.equitydetail.ui.tradingtrends.TradingTrendsAlertFragment r4 = r13.this$0
                            java.lang.Object r5 = r14.rememberedValue()
                            if (r3 != 0) goto L63
                            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.INSTANCE
                            java.lang.Object r3 = r3.getEmpty()
                            if (r5 != r3) goto L6b
                        L63:
                            com.robinhood.android.equitydetail.ui.tradingtrends.TradingTrendsAlertFragment$onCreateDialog$1$1$1$$ExternalSyntheticLambda0 r5 = new com.robinhood.android.equitydetail.ui.tradingtrends.TradingTrendsAlertFragment$onCreateDialog$1$1$1$$ExternalSyntheticLambda0
                            r5.<init>(r4)
                            r14.updateRememberedValue(r5)
                        L6b:
                            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
                            r14.endReplaceGroup()
                            com.robinhood.compose.bento.component.alerts.BentoAlertButton r3 = new com.robinhood.compose.bento.component.alerts.BentoAlertButton
                            r3.<init>(r0, r5)
                            r14.startReplaceGroup(r15)
                            com.robinhood.android.equitydetail.ui.tradingtrends.TradingTrendsAlertFragment r15 = r13.this$0
                            boolean r15 = r14.changedInstance(r15)
                            com.robinhood.android.equitydetail.ui.tradingtrends.TradingTrendsAlertFragment r0 = r13.this$0
                            java.lang.Object r4 = r14.rememberedValue()
                            if (r15 != 0) goto L8e
                            androidx.compose.runtime.Composer$Companion r15 = androidx.compose.runtime.Composer.INSTANCE
                            java.lang.Object r15 = r15.getEmpty()
                            if (r4 != r15) goto L96
                        L8e:
                            com.robinhood.android.equitydetail.ui.tradingtrends.TradingTrendsAlertFragment$onCreateDialog$1$1$1$$ExternalSyntheticLambda1 r4 = new com.robinhood.android.equitydetail.ui.tradingtrends.TradingTrendsAlertFragment$onCreateDialog$1$1$1$$ExternalSyntheticLambda1
                            r4.<init>(r0)
                            r14.updateRememberedValue(r4)
                        L96:
                            r9 = r4
                            kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
                            r14.endReplaceGroup()
                            int r15 = com.robinhood.compose.bento.component.alerts.BentoAlertDialog2.Body.Text.$stable
                            int r15 = r15 << 3
                            int r0 = com.robinhood.compose.bento.component.alerts.BentoAlerts.$stable
                            int r0 = r0 << 6
                            r11 = r15 | r0
                            r12 = 248(0xf8, float:3.48E-43)
                            r4 = 0
                            r5 = 0
                            r6 = 0
                            r7 = 0
                            r8 = 0
                            r10 = r14
                            com.robinhood.compose.bento.component.alerts.BentoAlertDialog.BentoAlertDialog(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                            boolean r14 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                            if (r14 == 0) goto Lba
                            androidx.compose.runtime.ComposerKt.traceEventEnd()
                        Lba:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.equitydetail.p123ui.tradingtrends.TradingTrendsAlertFragment2.C156421.invoke(androidx.compose.runtime.Composer, int):void");
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(TradingTrendsAlertFragment tradingTrendsAlertFragment) {
                        ActivityResultLauncher activityResultLauncher = tradingTrendsAlertFragment.searchSelectorLauncher;
                        if (activityResultLauncher == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("searchSelectorLauncher");
                            activityResultLauncher = null;
                        }
                        Navigator navigator = tradingTrendsAlertFragment.getNavigator();
                        Context contextRequireContext = tradingTrendsAlertFragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        activityResultLauncher.launch(Navigator.DefaultImpls.createIntentForFragment$default(navigator, contextRequireContext, new SearchSelectorKey(SearchSelectorLaunchMode.TradingTrends.INSTANCE, null, null, 6, null), false, false, false, null, false, false, false, false, false, null, false, 8180, null));
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2(TradingTrendsAlertFragment tradingTrendsAlertFragment) {
                        tradingTrendsAlertFragment.dismiss();
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
                        ComposerKt.traceEventStart(-530469627, i, -1, "com.robinhood.android.equitydetail.ui.tradingtrends.TradingTrendsAlertFragment.onCreateDialog.<anonymous>.<anonymous> (TradingTrendsAlertFragment.kt:44)");
                    }
                    BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-276405171, true, new C156421(this.this$0), composer, 54), composer, 100663296, 255);
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
    }
