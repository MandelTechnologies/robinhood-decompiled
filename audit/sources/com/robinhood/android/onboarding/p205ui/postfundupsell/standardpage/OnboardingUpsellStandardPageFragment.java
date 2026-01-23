package com.robinhood.android.onboarding.p205ui.postfundupsell.standardpage;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.core.view.WindowCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.page.StandardPageFragment;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.onboarding.contracts.OnboardingUpsellStandardPageFragmentContract;
import com.robinhood.android.onboarding.p205ui.postfundupsell.standardpage.OnboardingUpsellStandardPageFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.serverdriven.experimental.api.OnboardingFundingUpsellAction;
import com.robinhood.models.serverdriven.experimental.api.StandardPageTemplate;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import io.noties.markwon.Markwon;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: OnboardingUpsellStandardPageFragment.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0002H\u0016J\r\u0010\u001b\u001a\u00020\u0016H\u0017¢\u0006\u0002\u0010\u001cR\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\f8\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postfundupsell/standardpage/OnboardingUpsellStandardPageFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/page/StandardPageFragment;", "Lcom/robinhood/models/serverdriven/experimental/api/OnboardingFundingUpsellAction;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/onboarding/contracts/OnboardingUpsellStandardPageFragmentContract$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/onboarding/contracts/OnboardingUpsellStandardPageFragmentContract$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "content", "Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;", "getContent", "()Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;", "onStart", "", "onStop", "handle", "", "action", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class OnboardingUpsellStandardPageFragment extends StandardPageFragment<OnboardingFundingUpsellAction> {
    public static final String BACK_BUTTON_TEST_TAG = "back-button";
    public static final String CLOSE_BUTTON_TEST_TAG = "close-button";
    public static final String STANDARD_PAGE_TEST_TAG = "standard-page";

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(OnboardingUpsellStandardPageFragmentContract.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof OnboardingUpsellStandardPageFragmentContract.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    public Markwon markwon;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OnboardingUpsellStandardPageFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/onboarding/contracts/OnboardingUpsellStandardPageFragmentContract$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(OnboardingUpsellStandardPageFragment onboardingUpsellStandardPageFragment, int i, Composer composer, int i2) {
        onboardingUpsellStandardPageFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private final OnboardingUpsellStandardPageFragmentContract.Callbacks getCallbacks() {
        return (OnboardingUpsellStandardPageFragmentContract.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment
    public Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.page.StandardPageFragment
    public StandardPageTemplate<OnboardingFundingUpsellAction> getContent() {
        return ((OnboardingUpsellStandardPageFragmentContract.Key) INSTANCE.getArgs((Fragment) this)).getContent();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (((OnboardingUpsellStandardPageFragmentContract.Key) INSTANCE.getArgs((Fragment) this)).getContent().is_full_bleed()) {
            WindowCompat.setDecorFitsSystemWindows(requireActivity().getWindow(), false);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        WindowCompat.setDecorFitsSystemWindows(requireActivity().getWindow(), true);
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
    /* renamed from: handle, reason: merged with bridge method [inline-methods] */
    public boolean mo15941handle(OnboardingFundingUpsellAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (!(action instanceof OnboardingFundingUpsellAction.InfoAlert)) {
            return getCallbacks().onOnboardingUpsellAction(action);
        }
        SduiAlertKt.presentSduiAlertSheet(this, getMarkwon(), ((OnboardingFundingUpsellAction.InfoAlert) action).getValue2().getAlert(), new SduiActionHandler() { // from class: com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageFragment.handle.1
            @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
            /* renamed from: handle, reason: merged with bridge method [inline-methods] */
            public final boolean mo15941handle(OnboardingFundingUpsellAction onboardingFundingUpsellAction) {
                Intrinsics.checkNotNullParameter(onboardingFundingUpsellAction, "<unused var>");
                return true;
            }
        }, (1016 & 8) != 0 ? 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0024: INVOKE 
              (r14v0 'this' com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageFragment A[IMMUTABLE_TYPE, THIS])
              (wrap:io.noties.markwon.Markwon:0x0009: INVOKE 
              (r14v0 'this' com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageFragment A[IMMUTABLE_TYPE, THIS])
             VIRTUAL call: com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageFragment.getMarkwon():io.noties.markwon.Markwon A[MD:():io.noties.markwon.Markwon (m), WRAPPED] (LINE:44))
              (wrap:com.robinhood.models.serverdriven.experimental.api.GenericAlertContent:0x0013: INVOKE 
              (wrap:com.robinhood.models.serverdriven.experimental.api.AlertAction:0x000f: INVOKE 
              (wrap:com.robinhood.models.serverdriven.experimental.api.OnboardingFundingUpsellAction$InfoAlert:0x000d: CHECK_CAST (com.robinhood.models.serverdriven.experimental.api.OnboardingFundingUpsellAction$InfoAlert) (r15v0 'action' com.robinhood.models.serverdriven.experimental.api.OnboardingFundingUpsellAction))
             VIRTUAL call: com.robinhood.models.serverdriven.experimental.api.OnboardingFundingUpsellAction.InfoAlert.getValue():com.robinhood.models.serverdriven.experimental.api.AlertAction A[MD:():java.lang.Object (m), WRAPPED] (LINE:45))
             VIRTUAL call: com.robinhood.models.serverdriven.experimental.api.AlertAction.getAlert():com.robinhood.models.serverdriven.experimental.api.GenericAlertContent A[MD:():com.robinhood.models.serverdriven.experimental.api.GenericAlertContent<ActionT extends android.os.Parcelable> (m), WRAPPED] (LINE:45))
              (wrap:com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler:0x0017: SGET  A[WRAPPED] (LINE:43) com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageFragment.handle.1.INSTANCE com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageFragment$handle$1)
              (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0002: ARITH (1016 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:520) call: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda0.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function1))
              (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x000f: ARITH (1016 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0018: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:521) call: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda1.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function1))
              (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x001c: ARITH (1016 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0025: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:522) call: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda2.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function0))
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x0029: ARITH (1016 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : false)
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x0032: ARITH (1016 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : true)
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x003a: ARITH (1016 int) & (256 int) A[WRAPPED]) != (0 int)) ? true : false)
              (wrap:com.robinhood.android.common.ui.RhButtonType:?: TERNARY null = ((wrap:int:0x0043: ARITH (1016 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.robinhood.android.common.ui.RhButtonType) : (null com.robinhood.android.common.ui.RhButtonType))
             STATIC call: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt.presentSduiAlertSheet(com.robinhood.android.common.ui.RhBottomSheetDialogFragmentHost, io.noties.markwon.Markwon, com.robinhood.models.serverdriven.experimental.api.GenericAlertContent, com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, boolean, boolean, boolean, com.robinhood.android.common.ui.RhButtonType):void A[MD:<ActionT extends android.os.Parcelable>:(com.robinhood.android.common.ui.RhBottomSheetDialogFragmentHost, io.noties.markwon.Markwon, com.robinhood.models.serverdriven.experimental.api.GenericAlertContent<? extends ActionT extends android.os.Parcelable>, com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler<? super ActionT extends android.os.Parcelable>, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean, boolean, boolean, com.robinhood.android.common.ui.RhButtonType):void (m)] (LINE:516) in method: com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageFragment.handle(com.robinhood.models.serverdriven.experimental.api.OnboardingFundingUpsellAction):boolean, file: classes10.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
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
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda0, state: NOT_LOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.makeTernary(InsnGen.java:1187)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:536)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
            	... 19 more
            */
        /*
            this = this;
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            boolean r0 = r15 instanceof com.robinhood.models.serverdriven.experimental.api.OnboardingFundingUpsellAction.InfoAlert
            if (r0 == 0) goto L29
            io.noties.markwon.Markwon r2 = r14.getMarkwon()
            com.robinhood.models.serverdriven.experimental.api.OnboardingFundingUpsellAction$InfoAlert r15 = (com.robinhood.models.serverdriven.experimental.api.OnboardingFundingUpsellAction.InfoAlert) r15
            com.robinhood.models.serverdriven.experimental.api.AlertAction r15 = r15.getValue2()
            com.robinhood.models.serverdriven.experimental.api.GenericAlertContent r3 = r15.getAlert()
            com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageFragment$handle$1<ActionT> r4 = new com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler() { // from class: com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageFragment.handle.1
                static {
                    /*
                        com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageFragment$handle$1 r0 = new com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageFragment$handle$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT 
  (r0 I:com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageFragment$handle$1<ActionT>)
 com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageFragment.handle.1.INSTANCE com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageFragment$handle$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.onboarding.p205ui.postfundupsell.standardpage.OnboardingUpsellStandardPageFragment.C228351.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.onboarding.p205ui.postfundupsell.standardpage.OnboardingUpsellStandardPageFragment.C228351.<init>():void");
                }

                @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                public final boolean mo15941handle(com.robinhood.models.serverdriven.experimental.api.OnboardingFundingUpsellAction r2) {
                    /*
                        r1 = this;
                        java.lang.String r0 = "<unused var>"
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                        r2 = 1
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.onboarding.p205ui.postfundupsell.standardpage.OnboardingUpsellStandardPageFragment.C228351.mo15941handle(com.robinhood.models.serverdriven.experimental.api.OnboardingFundingUpsellAction):boolean");
                }

                @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                /* renamed from: handle */
                public /* bridge */ /* synthetic */ boolean mo15941handle(java.lang.Object r1) {
                    /*
                        r0 = this;
                        com.robinhood.models.serverdriven.experimental.api.OnboardingFundingUpsellAction r1 = (com.robinhood.models.serverdriven.experimental.api.OnboardingFundingUpsellAction) r1
                        boolean r1 = r0.mo15941handle(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.onboarding.p205ui.postfundupsell.standardpage.OnboardingUpsellStandardPageFragment.C228351.mo15941handle(java.lang.Object):boolean");
                }
            }
            r12 = 888(0x378, float:1.244E-42)
            r13 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 1
            r10 = 0
            r11 = 0
            r1 = r14
            com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt.presentSduiAlertSheet$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r15 = 1
            return r15
        L29:
            com.robinhood.android.onboarding.contracts.OnboardingUpsellStandardPageFragmentContract$Callbacks r0 = r14.getCallbacks()
            boolean r15 = r0.onOnboardingUpsellAction(r15)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.onboarding.p205ui.postfundupsell.standardpage.OnboardingUpsellStandardPageFragment.mo15941handle(com.robinhood.models.serverdriven.experimental.api.OnboardingFundingUpsellAction):boolean");
    }

    /* compiled from: OnboardingUpsellStandardPageFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageFragment$ComposeContent$1 */
    static final class C228341 implements Function2<Composer, Integer, Unit> {
        C228341() {
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
                ComposerKt.traceEventStart(1832693819, i, -1, "com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageFragment.ComposeContent.<anonymous> (OnboardingUpsellStandardPageFragment.kt:58)");
            }
            Companion companion = OnboardingUpsellStandardPageFragment.INSTANCE;
            StandardPageTemplate<OnboardingFundingUpsellAction> content = ((OnboardingUpsellStandardPageFragmentContract.Key) companion.getArgs((Fragment) OnboardingUpsellStandardPageFragment.this)).getContent();
            boolean shouldShowGoldNativeFundingNavBar = ((OnboardingUpsellStandardPageFragmentContract.Key) companion.getArgs((Fragment) OnboardingUpsellStandardPageFragment.this)).getShouldShowGoldNativeFundingNavBar();
            boolean useCloseNavigationIcon = ((OnboardingUpsellStandardPageFragmentContract.Key) companion.getArgs((Fragment) OnboardingUpsellStandardPageFragment.this)).getUseCloseNavigationIcon();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(OnboardingUpsellStandardPageFragment.this);
            final OnboardingUpsellStandardPageFragment onboardingUpsellStandardPageFragment = OnboardingUpsellStandardPageFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SduiActionHandler() { // from class: com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageFragment$ComposeContent$1$1$1
                    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                    /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                    public final boolean mo15941handle(OnboardingFundingUpsellAction it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return onboardingUpsellStandardPageFragment.mo15941handle(it);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            SduiActionHandler sduiActionHandler = (SduiActionHandler) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(OnboardingUpsellStandardPageFragment.this);
            final OnboardingUpsellStandardPageFragment onboardingUpsellStandardPageFragment2 = OnboardingUpsellStandardPageFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OnboardingUpsellStandardPageFragment.C228341.invoke$lambda$2$lambda$1(onboardingUpsellStandardPageFragment2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            OnboardingUpsellStandardPageComposable.OnboardingUpsellStandardPageComposable(content, shouldShowGoldNativeFundingNavBar, useCloseNavigationIcon, (Function0) objRememberedValue2, null, sduiActionHandler, null, composer, 0, 80);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(OnboardingUpsellStandardPageFragment onboardingUpsellStandardPageFragment) {
            onboardingUpsellStandardPageFragment.requireBaseActivity().onBackPressed();
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1891912474);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1891912474, i2, -1, "com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageFragment.ComposeContent (OnboardingUpsellStandardPageFragment.kt:56)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1832693819, true, new C228341(), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.onboarding.ui.postfundupsell.standardpage.OnboardingUpsellStandardPageFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OnboardingUpsellStandardPageFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: OnboardingUpsellStandardPageFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postfundupsell/standardpage/OnboardingUpsellStandardPageFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/onboarding/ui/postfundupsell/standardpage/OnboardingUpsellStandardPageFragment;", "Lcom/robinhood/android/onboarding/contracts/OnboardingUpsellStandardPageFragmentContract$Key;", "<init>", "()V", "CLOSE_BUTTON_TEST_TAG", "", "BACK_BUTTON_TEST_TAG", "STANDARD_PAGE_TEST_TAG", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<OnboardingUpsellStandardPageFragment, OnboardingUpsellStandardPageFragmentContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(OnboardingUpsellStandardPageFragmentContract.Key key) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public OnboardingUpsellStandardPageFragmentContract.Key getArgs(OnboardingUpsellStandardPageFragment onboardingUpsellStandardPageFragment) {
            return (OnboardingUpsellStandardPageFragmentContract.Key) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, onboardingUpsellStandardPageFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OnboardingUpsellStandardPageFragment newInstance(OnboardingUpsellStandardPageFragmentContract.Key key) {
            return (OnboardingUpsellStandardPageFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OnboardingUpsellStandardPageFragment onboardingUpsellStandardPageFragment, OnboardingUpsellStandardPageFragmentContract.Key key) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, onboardingUpsellStandardPageFragment, key);
        }
    }
}
