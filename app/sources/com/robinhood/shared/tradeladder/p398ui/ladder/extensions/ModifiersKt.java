package com.robinhood.shared.tradeladder.p398ui.ladder.extensions;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import com.robinhood.tooltips.popup.PopupTooltipKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: Modifiers.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u001aG\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "", "showTooltip", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlin/Function0;", "", "onDismiss", "", "autodismissDuration", "content", "popupAutodismissTooltip", "(Landroidx/compose/ui/Modifier;ZLkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;JLkotlin/jvm/functions/Function2;)Landroidx/compose/ui/Modifier;", "lib-trade-ladder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class ModifiersKt {
    public static /* synthetic */ Modifier popupAutodismissTooltip$default(Modifier modifier, boolean z, CoroutineScope coroutineScope, Function0 function0, long j, Function2 function2, int i, Object obj) {
        if ((i & 8) != 0) {
            j = 3000;
        }
        return popupAutodismissTooltip(modifier, z, coroutineScope, function0, j, function2);
    }

    public static final Modifier popupAutodismissTooltip(Modifier modifier, boolean z, final CoroutineScope coroutineScope, final Function0<Unit> onDismiss, final long j, final Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(content, "content");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        return PopupTooltipKt.m26519popupTooltipBgaGok8(modifier, (16232 & 1) != 0 ? Boolean.TRUE : Boolean.valueOf(z), (16232 & 2) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        } : new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.extensions.ModifiersKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ModifiersKt.popupAutodismissTooltip$lambda$0(objectRef, onDismiss);
            }
        }, (16232 & 4) != 0 ? new Function0() { // from class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        } : new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.extensions.ModifiersKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ModifiersKt.popupAutodismissTooltip$lambda$1(objectRef, coroutineScope, j, onDismiss);
            }
        }, (16232 & 8) != 0 ? 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0056: RETURN 
              (wrap:androidx.compose.ui.Modifier:0x0052: INVOKE 
              (r19v0 'modifier' androidx.compose.ui.Modifier)
              (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (16232 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: SGET  A[WRAPPED] (LINE:63) java.lang.Boolean.TRUE java.lang.Boolean) : (wrap:java.lang.Boolean:0x0021: INVOKE (r20v0 'z' boolean) STATIC call: java.lang.Boolean.valueOf(boolean):java.lang.Boolean A[MD:(boolean):java.lang.Boolean (c), WRAPPED] (LINE:20)))
              (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x000c: ARITH (16232 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0015: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:67) call: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda5.<init>():void type: CONSTRUCTOR) : (wrap:kotlin.jvm.functions.Function0:0x0027: CONSTRUCTOR 
              (r1v0 'objectRef' kotlin.jvm.internal.Ref$ObjectRef A[DONT_INLINE])
              (r22v0 'onDismiss' kotlin.jvm.functions.Function0<kotlin.Unit> A[DONT_INLINE])
             A[MD:(kotlin.jvm.internal.Ref$ObjectRef, kotlin.jvm.functions.Function0):void (m), WRAPPED] (LINE:19) call: com.robinhood.shared.tradeladder.ui.ladder.extensions.ModifiersKt$$ExternalSyntheticLambda0.<init>(kotlin.jvm.internal.Ref$ObjectRef, kotlin.jvm.functions.Function0):void type: CONSTRUCTOR))
              (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0019: ARITH (16232 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0022: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:71) call: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda6.<init>():void type: CONSTRUCTOR) : (wrap:kotlin.jvm.functions.Function0:0x002e: CONSTRUCTOR 
              (r1v0 'objectRef' kotlin.jvm.internal.Ref$ObjectRef A[DONT_INLINE])
              (r21v0 'coroutineScope' kotlinx.coroutines.CoroutineScope A[DONT_INLINE])
              (r23v0 'j' long A[DONT_INLINE])
              (r22v0 'onDismiss' kotlin.jvm.functions.Function0<kotlin.Unit> A[DONT_INLINE])
             A[MD:(kotlin.jvm.internal.Ref$ObjectRef, kotlinx.coroutines.CoroutineScope, long, kotlin.jvm.functions.Function0):void (m), WRAPPED] call: com.robinhood.shared.tradeladder.ui.ladder.extensions.ModifiersKt$$ExternalSyntheticLambda1.<init>(kotlin.jvm.internal.Ref$ObjectRef, kotlinx.coroutines.CoroutineScope, long, kotlin.jvm.functions.Function0):void type: CONSTRUCTOR))
              (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0026: ARITH (16232 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002f: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:75) call: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda7.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function0))
              (wrap:com.robinhood.tooltips.popup.PopupPositioning:?: TERNARY null = ((wrap:int:0x0033: ARITH (16232 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0039: SGET  A[WRAPPED] (LINE:83) com.robinhood.tooltips.popup.PopupPositioning.FREE com.robinhood.tooltips.popup.PopupPositioning) : (null com.robinhood.tooltips.popup.PopupPositioning))
              (wrap:kotlin.time.Duration:?: TERNARY null = ((wrap:int:0x003d: ARITH (16232 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null kotlin.time.Duration) : (null kotlin.time.Duration))
              (wrap:kotlin.time.Duration:?: TERNARY null = ((wrap:int:0x0046: ARITH (16232 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null kotlin.time.Duration) : (null kotlin.time.Duration))
              (wrap:float:?: TERNARY null = ((wrap:int:0x004e: ARITH (16232 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0054: INVOKE (0 int) STATIC call: androidx.compose.ui.unit.Dp.constructor-impl(float):float A[MD:(float):float (m), WRAPPED] (LINE:113)) : (0.0f float))
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x005b: ARITH (16232 int) & (256 int) A[WRAPPED]) != (0 int)) ? true : false)
              (wrap:float:?: TERNARY null = ((wrap:int:0x0063: ARITH (16232 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0068: INVOKE (0 int) STATIC call: androidx.compose.ui.unit.Dp.constructor-impl(float):float A[MD:(float):float (m), WRAPPED] (LINE:113)) : (0.0f float))
              (wrap:float:?: TERNARY null = ((wrap:int:0x006f: ARITH (16232 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0078: INVOKE (0 int) STATIC call: androidx.compose.ui.unit.Dp.constructor-impl(float):float A[MD:(float):float (m), WRAPPED] (LINE:113)) : (0.0f float))
              (wrap:androidx.compose.ui.unit.Dp:?: TERNARY null = ((wrap:int:0x007c: ARITH (16232 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null androidx.compose.ui.unit.Dp) : (null androidx.compose.ui.unit.Dp))
              (wrap:androidx.compose.animation.EnterTransition:?: TERNARY null = ((wrap:int:0x0084: ARITH (16232 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x008e: INVOKE 
              (wrap:androidx.compose.animation.EnterTransition$Companion:0x0088: SGET  A[WRAPPED] (LINE:110) androidx.compose.animation.EnterTransition.Companion androidx.compose.animation.EnterTransition$Companion)
             VIRTUAL call: androidx.compose.animation.EnterTransition.Companion.getNone():androidx.compose.animation.EnterTransition A[MD:():androidx.compose.animation.EnterTransition (m), WRAPPED] (LINE:110)) : (null androidx.compose.animation.EnterTransition))
              (wrap:androidx.compose.animation.ExitTransition:?: TERNARY null = ((wrap:int:0x0092: ARITH (16232 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x009c: INVOKE 
              (wrap:androidx.compose.animation.ExitTransition$Companion:0x0096: SGET  A[WRAPPED] (LINE:114) androidx.compose.animation.ExitTransition.Companion androidx.compose.animation.ExitTransition$Companion)
             VIRTUAL call: androidx.compose.animation.ExitTransition.Companion.getNone():androidx.compose.animation.ExitTransition A[MD:():androidx.compose.animation.ExitTransition (m), WRAPPED] (LINE:114)) : (null androidx.compose.animation.ExitTransition))
              (wrap:androidx.compose.runtime.internal.ComposableLambda:0x003a: INVOKE 
              (1136235664 int)
              true
              (wrap:kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>:0x0033: CONSTRUCTOR 
              (r25v0 'content' kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> A[DONT_INLINE])
             A[MD:(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>):void (m), WRAPPED] (LINE:31) call: com.robinhood.shared.tradeladder.ui.ladder.extensions.ModifiersKt.popupAutodismissTooltip.3.<init>(kotlin.jvm.functions.Function2):void type: CONSTRUCTOR)
             STATIC call: androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(int, boolean, java.lang.Object):androidx.compose.runtime.internal.ComposableLambda A[MD:(int, boolean, java.lang.Object):androidx.compose.runtime.internal.ComposableLambda (m), WRAPPED] (LINE:31))
             STATIC call: com.robinhood.tooltips.popup.PopupTooltipKt.popupTooltip-BgaGok8(androidx.compose.ui.Modifier, java.lang.Boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, com.robinhood.tooltips.popup.PopupPositioning, kotlin.time.Duration, kotlin.time.Duration, float, boolean, float, float, androidx.compose.ui.unit.Dp, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, kotlin.jvm.functions.Function2):androidx.compose.ui.Modifier A[MD:(androidx.compose.ui.Modifier, java.lang.Boolean, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, com.robinhood.tooltips.popup.PopupPositioning, kotlin.time.Duration, kotlin.time.Duration, float, boolean, float, float, androidx.compose.ui.unit.Dp, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>):androidx.compose.ui.Modifier (m), WRAPPED] (LINE:59))
             (LINE:59) in method: com.robinhood.shared.tradeladder.ui.ladder.extensions.ModifiersKt.popupAutodismissTooltip(androidx.compose.ui.Modifier, boolean, kotlinx.coroutines.CoroutineScope, kotlin.jvm.functions.Function0<kotlin.Unit>, long, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>):androidx.compose.ui.Modifier, file: classes12.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
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
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.tooltips.popup.PopupTooltipKt$$ExternalSyntheticLambda7, state: PROCESS_STARTED
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
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
            	... 15 more
            */
        /*
            r5 = r22
            r6 = r25
            java.lang.String r0 = "<this>"
            r7 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "coroutineScope"
            r2 = r21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "onDismiss"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r20)
            com.robinhood.shared.tradeladder.ui.ladder.extensions.ModifiersKt$$ExternalSyntheticLambda0 r9 = new com.robinhood.shared.tradeladder.ui.ladder.extensions.ModifiersKt$$ExternalSyntheticLambda0
            r9.<init>()
            com.robinhood.shared.tradeladder.ui.ladder.extensions.ModifiersKt$$ExternalSyntheticLambda1 r0 = new com.robinhood.shared.tradeladder.ui.ladder.extensions.ModifiersKt$$ExternalSyntheticLambda1
            r3 = r23
            r0.<init>()
            com.robinhood.shared.tradeladder.ui.ladder.extensions.ModifiersKt$popupAutodismissTooltip$3 r1 = new com.robinhood.shared.tradeladder.ui.ladder.extensions.ModifiersKt$popupAutodismissTooltip$3
            r1.<init>()
            r2 = 1136235664(0x43b99490, float:371.16064)
            r3 = 1
            androidx.compose.runtime.internal.ComposableLambda r16 = androidx.compose.runtime.internal.ComposableLambda3.composableLambdaInstance(r2, r3, r1)
            r17 = 16376(0x3ff8, float:2.2948E-41)
            r18 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r8
            r8 = 0
            r3 = r9
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r1 = r19
            r4 = r0
            androidx.compose.ui.Modifier r0 = com.robinhood.tooltips.popup.PopupTooltipKt.m26520popupTooltipBgaGok8$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.shared.tradeladder.p398ui.ladder.extensions.ModifiersKt.popupAutodismissTooltip(androidx.compose.ui.Modifier, boolean, kotlinx.coroutines.CoroutineScope, kotlin.jvm.functions.Function0, long, kotlin.jvm.functions.Function2):androidx.compose.ui.Modifier");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r7v1, types: [T, kotlinx.coroutines.Job] */
    public static final Unit popupAutodismissTooltip$lambda$1(Ref.ObjectRef objectRef, CoroutineScope coroutineScope, long j, Function0 function0) {
        objectRef.element = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ModifiersKt$popupAutodismissTooltip$2$1(j, function0, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit popupAutodismissTooltip$lambda$0(Ref.ObjectRef objectRef, Function0 function0) {
        Job job = (Job) objectRef.element;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        function0.invoke();
        return Unit.INSTANCE;
    }
}
