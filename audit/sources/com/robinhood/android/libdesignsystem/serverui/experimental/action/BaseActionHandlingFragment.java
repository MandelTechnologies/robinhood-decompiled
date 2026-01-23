package com.robinhood.android.libdesignsystem.serverui.experimental.action;

import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.p088ui.BaseRhBottomSheetDialogHostFragment;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericAlertDialogFragment;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt;
import com.robinhood.models.serverdriven.experimental.api.AlertAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertMobilePresentationStyle;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseActionHandlingFragment.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0002JD\u0010\u0018\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00192\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u00152\b\b\u0002\u0010\u001e\u001a\u00020\u00152\b\b\u0002\u0010\u001f\u001a\u00020\u0015H\u0002R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/BaseActionHandlingFragment;", "Lcom/robinhood/android/common/ui/BaseRhBottomSheetDialogHostFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/GenericAlertDialogFragment$Callbacks;", "layoutRes", "", "<init>", "(I)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "genericAlertContent", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/GenericAlertDialogFragment;", "actionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "getActionHandler", "()Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "handleAction", "", "action", "dismissAlert", "handleAlert", "Lcom/robinhood/models/serverdriven/experimental/api/AlertAction;", "onDismiss", "Lkotlin/Function0;", "", "isCrypto", "isAchromatic", "isCancelable", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public class BaseActionHandlingFragment extends BaseRhBottomSheetDialogHostFragment implements GenericAlertDialogFragment.Callbacks {
    public static final int $stable = 8;
    private final SduiActionHandler<GenericAction> actionHandler;
    private GenericAlertDialogFragment genericAlertContent;
    public Markwon markwon;

    /* compiled from: BaseActionHandlingFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GenericAlertMobilePresentationStyle.values().length];
            try {
                iArr[GenericAlertMobilePresentationStyle.MODAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GenericAlertMobilePresentationStyle.BOTTOM_SHEET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BaseActionHandlingFragment(int i) {
        super(i);
        this.actionHandler = new SduiActionHandler() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.action.BaseActionHandlingFragment$actionHandler$1
            @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
            /* renamed from: handle, reason: merged with bridge method [inline-methods] */
            public final boolean mo15941handle(GenericAction action) {
                Intrinsics.checkNotNullParameter(action, "action");
                return this.this$0.handleAction(action);
            }
        };
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    public final SduiActionHandler<GenericAction> getActionHandler() {
        return this.actionHandler;
    }

    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericAlertDialogFragment.Callbacks
    public boolean handleAction(GenericAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof GenericAction.Deeplink) {
            return ActionHandlingFragment2.handleDeeplink(this, ((GenericAction.Deeplink) action).getValue2(), Boolean.FALSE);
        }
        if (action instanceof GenericAction.Dismiss) {
            return dismissAlert();
        }
        if (action instanceof GenericAction.InfoAlert) {
            return handleAlert$default(this, ((GenericAction.InfoAlert) action).getValue2(), null, false, false, false, 30, null);
        }
        return false;
    }

    private final boolean dismissAlert() {
        GenericAlertDialogFragment genericAlertDialogFragment = this.genericAlertContent;
        if (genericAlertDialogFragment != null) {
            genericAlertDialogFragment.dismiss();
        }
        this.genericAlertContent = null;
        return true;
    }

    static /* synthetic */ boolean handleAlert$default(BaseActionHandlingFragment baseActionHandlingFragment, AlertAction alertAction, Function0 function0, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleAlert");
        }
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.action.BaseActionHandlingFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        Function0 function02 = function0;
        if ((i & 4) != 0) {
            z = baseActionHandlingFragment.getIsCrypto();
        }
        return baseActionHandlingFragment.handleAlert(alertAction, function02, z, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? true : z3);
    }

    private final boolean handleAlert(AlertAction<? extends GenericAction> action, Function0<Unit> onDismiss, boolean isCrypto, boolean isAchromatic, boolean isCancelable) {
        int i = WhenMappings.$EnumSwitchMapping$0[action.getMobile_presentation_style().ordinal()];
        if (i == 1) {
            GenericAlertDialogFragment genericAlertDialogFragment = (GenericAlertDialogFragment) GenericAlertDialogFragment.INSTANCE.newInstance((Parcelable) new GenericAlertDialogFragment.Args(action.getAlert(), isCrypto, isAchromatic, isCancelable));
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            genericAlertDialogFragment.show(childFragmentManager, "generic-alert");
            this.genericAlertContent = genericAlertDialogFragment;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            SduiAlertKt.presentSduiAlertSheet(this, getMarkwon(), action.getAlert(), this.actionHandler, (1016 & 8) != 0 ? 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002b: INVOKE 
                  (r14v0 'this' com.robinhood.android.libdesignsystem.serverui.experimental.action.BaseActionHandlingFragment A[IMMUTABLE_TYPE, THIS])
                  (wrap:io.noties.markwon.Markwon:0x0012: INVOKE 
                  (r14v0 'this' com.robinhood.android.libdesignsystem.serverui.experimental.action.BaseActionHandlingFragment A[IMMUTABLE_TYPE, THIS])
                 VIRTUAL call: com.robinhood.android.libdesignsystem.serverui.experimental.action.BaseActionHandlingFragment.getMarkwon():io.noties.markwon.Markwon A[MD:():io.noties.markwon.Markwon (m), WRAPPED] (LINE:72))
                  (wrap:com.robinhood.models.serverdriven.experimental.api.GenericAlertContent<ActionT extends android.os.Parcelable>:0x0016: INVOKE 
                  (r15v0 'action' com.robinhood.models.serverdriven.experimental.api.AlertAction<? extends com.robinhood.models.serverdriven.experimental.api.GenericAction>)
                 VIRTUAL call: com.robinhood.models.serverdriven.experimental.api.AlertAction.getAlert():com.robinhood.models.serverdriven.experimental.api.GenericAlertContent A[MD:():com.robinhood.models.serverdriven.experimental.api.GenericAlertContent<ActionT extends android.os.Parcelable> (m), WRAPPED] (LINE:73))
                  (wrap:com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler<com.robinhood.models.serverdriven.experimental.api.GenericAction>:0x001a: IGET 
                  (r14v0 'this' com.robinhood.android.libdesignsystem.serverui.experimental.action.BaseActionHandlingFragment A[IMMUTABLE_TYPE, THIS])
                 A[WRAPPED] (LINE:74) com.robinhood.android.libdesignsystem.serverui.experimental.action.BaseActionHandlingFragment.actionHandler com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler)
                  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0002: ARITH (1016 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:520) call: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda0.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function1))
                  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x000f: ARITH (1016 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0018: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:521) call: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda1.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function1))
                  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x001c: ARITH (1016 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0025: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:522) call: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda2.<init>():void type: CONSTRUCTOR) : (r16v0 'onDismiss' kotlin.jvm.functions.Function0<kotlin.Unit>))
                  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0029: ARITH (1016 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r17v0 'isCrypto' boolean))
                  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0032: ARITH (1016 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r18v0 'isAchromatic' boolean))
                  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003a: ARITH (1016 int) & (256 int) A[WRAPPED]) != (0 int)) ? true : (r19v0 'isCancelable' boolean))
                  (wrap:com.robinhood.android.common.ui.RhButtonType:?: TERNARY null = ((wrap:int:0x0043: ARITH (1016 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.robinhood.android.common.ui.RhButtonType) : (null com.robinhood.android.common.ui.RhButtonType))
                 STATIC call: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt.presentSduiAlertSheet(com.robinhood.android.common.ui.RhBottomSheetDialogFragmentHost, io.noties.markwon.Markwon, com.robinhood.models.serverdriven.experimental.api.GenericAlertContent, com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, boolean, boolean, boolean, com.robinhood.android.common.ui.RhButtonType):void A[MD:<ActionT extends android.os.Parcelable>:(com.robinhood.android.common.ui.RhBottomSheetDialogFragmentHost, io.noties.markwon.Markwon, com.robinhood.models.serverdriven.experimental.api.GenericAlertContent<? extends ActionT extends android.os.Parcelable>, com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler<? super ActionT extends android.os.Parcelable>, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean, boolean, boolean, com.robinhood.android.common.ui.RhButtonType):void (m)] (LINE:516) in method: com.robinhood.android.libdesignsystem.serverui.experimental.action.BaseActionHandlingFragment.handleAlert(com.robinhood.models.serverdriven.experimental.api.AlertAction<? extends com.robinhood.models.serverdriven.experimental.api.GenericAction>, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean, boolean, boolean):boolean, file: classes8.dex
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
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
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
                	... 25 more
                */
            /*
                this = this;
                com.robinhood.models.serverdriven.experimental.api.GenericAlertMobilePresentationStyle r1 = r15.getMobile_presentation_style()
                int[] r2 = com.robinhood.android.libdesignsystem.serverui.experimental.action.BaseActionHandlingFragment.WhenMappings.$EnumSwitchMapping$0
                int r1 = r1.ordinal()
                r1 = r2[r1]
                r13 = 1
                if (r1 == r13) goto L35
                r2 = 2
                if (r1 != r2) goto L2f
                io.noties.markwon.Markwon r1 = r14.getMarkwon()
                com.robinhood.models.serverdriven.experimental.api.GenericAlertContent r2 = r15.getAlert()
                com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler<com.robinhood.models.serverdriven.experimental.api.GenericAction> r3 = r14.actionHandler
                r11 = 536(0x218, float:7.51E-43)
                r12 = 0
                r4 = 0
                r5 = 0
                r10 = 0
                r0 = r14
                r6 = r16
                r7 = r17
                r8 = r18
                r9 = r19
                com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt.presentSduiAlertSheet$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                goto L5c
            L2f:
                kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
                r1.<init>()
                throw r1
            L35:
                com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericAlertDialogFragment$Companion r1 = com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericAlertDialogFragment.INSTANCE
                com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericAlertDialogFragment$Args r2 = new com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericAlertDialogFragment$Args
                com.robinhood.models.serverdriven.experimental.api.GenericAlertContent r3 = r15.getAlert()
                r7 = r17
                r8 = r18
                r9 = r19
                r2.<init>(r3, r7, r8, r9)
                androidx.fragment.app.Fragment r1 = r1.newInstance(r2)
                com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericAlertDialogFragment r1 = (com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericAlertDialogFragment) r1
                androidx.fragment.app.FragmentManager r2 = r14.getChildFragmentManager()
                java.lang.String r3 = "getChildFragmentManager(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                java.lang.String r3 = "generic-alert"
                r1.show(r2, r3)
                r14.genericAlertContent = r1
            L5c:
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.libdesignsystem.serverui.experimental.action.BaseActionHandlingFragment.handleAlert(com.robinhood.models.serverdriven.experimental.api.AlertAction, kotlin.jvm.functions.Function0, boolean, boolean, boolean):boolean");
        }
    }
