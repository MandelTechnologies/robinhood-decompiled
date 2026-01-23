package com.robinhood.android.libdesignsystem.serverui.experimental.action;

import android.os.Parcelable;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.models.serverdriven.experimental.api.AlertAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertMobilePresentationStyle;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ActionHandlingFragment.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0014\u001a\u00020\u0015Jn\u0010\u0016\u001a\u00020\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a2\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001f2\b\b\u0002\u0010 \u001a\u00020\u00152\b\b\u0002\u0010!\u001a\u00020\u00152\b\b\u0002\u0010\"\u001a\u00020\u0015R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR;\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/ActionHandlingFragment;", "ActionT", "Landroid/os/Parcelable;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "<init>", "()V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "<set-?>", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "genericAlertContent", "getGenericAlertContent", "()Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "setGenericAlertContent", "(Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;)V", "genericAlertContent$delegate", "Landroidx/compose/runtime/MutableState;", "dismissAlert", "", "handleAlert", "action", "Lcom/robinhood/models/serverdriven/experimental/api/AlertAction;", "onPrimaryButtonClick", "Lkotlin/Function1;", "", "", "onSecondaryButtonClick", "onDismiss", "Lkotlin/Function0;", "isCrypto", "isAchromatic", "isCancelable", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public abstract class ActionHandlingFragment<ActionT extends Parcelable> extends GenericComposeFragment implements SduiActionHandler<ActionT> {
    public static final int $stable = GenericComposeFragment.$stable;

    /* renamed from: genericAlertContent$delegate, reason: from kotlin metadata */
    private final SnapshotState genericAlertContent = SnapshotState3.mutableStateOf$default(null, null, 2, null);

    /* compiled from: ActionHandlingFragment.kt */
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

    public abstract Markwon getMarkwon();

    /* JADX WARN: Multi-variable type inference failed */
    public final GenericAlertContent<ActionT> getGenericAlertContent() {
        return (GenericAlertContent) this.genericAlertContent.getValue();
    }

    public final void setGenericAlertContent(GenericAlertContent<? extends ActionT> genericAlertContent) {
        this.genericAlertContent.setValue(genericAlertContent);
    }

    public final boolean dismissAlert() {
        setGenericAlertContent(null);
        return true;
    }

    public static /* synthetic */ boolean handleAlert$default(ActionHandlingFragment actionHandlingFragment, AlertAction alertAction, Function1 function1, Function1 function12, Function0 function0, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if (obj == null) {
            return actionHandlingFragment.handleAlert(alertAction, (i & 2) != 0 ? new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ActionHandlingFragment.handleAlert$lambda$0((String) obj2);
                }
            } : function1, (i & 4) != 0 ? new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ActionHandlingFragment.handleAlert$lambda$1((String) obj2);
                }
            } : function12, (i & 8) != 0 ? new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            } : function0, (i & 16) != 0 ? actionHandlingFragment.isCrypto() : z, (i & 32) != 0 ? true : z2, (i & 64) != 0 ? true : z3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleAlert");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleAlert$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleAlert$lambda$1(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final boolean handleAlert(AlertAction<? extends ActionT> action, Function1<? super String, Unit> onPrimaryButtonClick, Function1<? super String, Unit> onSecondaryButtonClick, Function0<Unit> onDismiss, boolean isCrypto, boolean isAchromatic, boolean isCancelable) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(onPrimaryButtonClick, "onPrimaryButtonClick");
        Intrinsics.checkNotNullParameter(onSecondaryButtonClick, "onSecondaryButtonClick");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        int i = WhenMappings.$EnumSwitchMapping$0[action.getMobile_presentation_style().ordinal()];
        if (i == 1) {
            setGenericAlertContent(action.getAlert());
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            SduiAlertKt.presentSduiAlertSheet(this, getMarkwon(), action.getAlert(), this, (1016 & 8) != 0 ? 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0042: INVOKE 
                  (r15v0 'this' com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment<ActionT extends android.os.Parcelable> A[IMMUTABLE_TYPE, THIS])
                  (wrap:io.noties.markwon.Markwon:0x002e: INVOKE 
                  (r15v0 'this' com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment<ActionT extends android.os.Parcelable> A[IMMUTABLE_TYPE, THIS])
                 VIRTUAL call: com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment.getMarkwon():io.noties.markwon.Markwon A[MD:():io.noties.markwon.Markwon (m), WRAPPED] (LINE:59))
                  (wrap:com.robinhood.models.serverdriven.experimental.api.GenericAlertContent<ActionT extends android.os.Parcelable>:0x0032: INVOKE 
                  (r16v0 'action' com.robinhood.models.serverdriven.experimental.api.AlertAction<? extends ActionT extends android.os.Parcelable>)
                 VIRTUAL call: com.robinhood.models.serverdriven.experimental.api.AlertAction.getAlert():com.robinhood.models.serverdriven.experimental.api.GenericAlertContent A[MD:():com.robinhood.models.serverdriven.experimental.api.GenericAlertContent<ActionT extends android.os.Parcelable> (m), WRAPPED] (LINE:60))
                  (r15v0 'this' com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment<ActionT extends android.os.Parcelable> A[IMMUTABLE_TYPE, THIS])
                  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0002: ARITH (1016 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:520) call: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda0.<init>():void type: CONSTRUCTOR) : (r17v0 'onPrimaryButtonClick' kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>))
                  (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x000f: ARITH (1016 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0018: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:521) call: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda1.<init>():void type: CONSTRUCTOR) : (r18v0 'onSecondaryButtonClick' kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>))
                  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x001c: ARITH (1016 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0025: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:522) call: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt$$ExternalSyntheticLambda2.<init>():void type: CONSTRUCTOR) : (r19v0 'onDismiss' kotlin.jvm.functions.Function0<kotlin.Unit>))
                  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0029: ARITH (1016 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r20v0 'isCrypto' boolean))
                  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0032: ARITH (1016 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r21v0 'isAchromatic' boolean))
                  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003a: ARITH (1016 int) & (256 int) A[WRAPPED]) != (0 int)) ? true : (r22v0 'isCancelable' boolean))
                  (wrap:com.robinhood.android.common.ui.RhButtonType:?: TERNARY null = ((wrap:int:0x0043: ARITH (1016 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.robinhood.android.common.ui.RhButtonType) : (null com.robinhood.android.common.ui.RhButtonType))
                 STATIC call: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt.presentSduiAlertSheet(com.robinhood.android.common.ui.RhBottomSheetDialogFragmentHost, io.noties.markwon.Markwon, com.robinhood.models.serverdriven.experimental.api.GenericAlertContent, com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, boolean, boolean, boolean, com.robinhood.android.common.ui.RhButtonType):void A[MD:<ActionT extends android.os.Parcelable>:(com.robinhood.android.common.ui.RhBottomSheetDialogFragmentHost, io.noties.markwon.Markwon, com.robinhood.models.serverdriven.experimental.api.GenericAlertContent<? extends ActionT extends android.os.Parcelable>, com.robinhood.android.libdesignsystem.serverui.experimental.compose.ActionHandler<? super ActionT extends android.os.Parcelable>, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean, boolean, boolean, com.robinhood.android.common.ui.RhButtonType):void (m)] (LINE:516) in method: com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment.handleAlert(com.robinhood.models.serverdriven.experimental.api.AlertAction<? extends ActionT extends android.os.Parcelable>, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, boolean, boolean, boolean):boolean, file: classes8.dex
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
                java.lang.String r0 = "action"
                r1 = r16
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
                java.lang.String r0 = "onPrimaryButtonClick"
                r5 = r17
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "onSecondaryButtonClick"
                r6 = r18
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                java.lang.String r0 = "onDismiss"
                r7 = r19
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
                com.robinhood.models.serverdriven.experimental.api.GenericAlertMobilePresentationStyle r0 = r1.getMobile_presentation_style()
                int[] r2 = com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment.WhenMappings.$EnumSwitchMapping$0
                int r0 = r0.ordinal()
                r0 = r2[r0]
                r14 = 1
                if (r0 == r14) goto L4c
                r2 = 2
                if (r0 != r2) goto L46
                io.noties.markwon.Markwon r2 = r15.getMarkwon()
                com.robinhood.models.serverdriven.experimental.api.GenericAlertContent r3 = r1.getAlert()
                r12 = 512(0x200, float:7.175E-43)
                r13 = 0
                r11 = 0
                r4 = r15
                r1 = r15
                r8 = r20
                r9 = r21
                r10 = r22
                com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlertKt.presentSduiAlertSheet$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                goto L53
            L46:
                kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
                r1.<init>()
                throw r1
            L4c:
                com.robinhood.models.serverdriven.experimental.api.GenericAlertContent r1 = r1.getAlert()
                r15.setGenericAlertContent(r1)
            L53:
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment.handleAlert(com.robinhood.models.serverdriven.experimental.api.AlertAction, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, boolean, boolean, boolean):boolean");
        }
    }
