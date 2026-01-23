package com.robinhood.android.redesigninvesting.interactions.scrolling;

import androidx.compose.foundation.gestures.ForEachGesture;
import androidx.compose.foundation.gestures.TapGestureDetector4;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerEvent;
import androidx.compose.p011ui.input.pointer.PointerEventKt;
import androidx.compose.p011ui.input.pointer.PointerEventPass;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl5;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountTabScrollInteractions.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¨\u0006\u0006"}, m3636d2 = {"findScrollInteraction", "Lcom/robinhood/android/redesigninvesting/interactions/scrolling/AccountTabScrollInteraction;", "Lcom/robinhood/android/common/ui/BaseFragment;", "accountTabScrollInteraction", "Landroidx/compose/ui/Modifier;", "scrollInteraction", "lib-interactions_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabScrollInteractionsKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class AccountTabScrollInteractions2 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final AccountTabScrollInteractions findScrollInteraction(BaseFragment baseFragment) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        for (Fragment parentFragment = baseFragment.getParentFragment(); parentFragment != 0; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof AccountTabScrollInteractions) {
                return (AccountTabScrollInteractions) parentFragment;
            }
        }
        return null;
    }

    public static final Modifier accountTabScrollInteraction(Modifier modifier, final AccountTabScrollInteractions accountTabScrollInteractions) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return accountTabScrollInteractions == null ? modifier : SuspendingPointerInputFilterKt.pointerInput(modifier, accountTabScrollInteractions, new PointerInputEventHandler() { // from class: com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabScrollInteractionsKt.accountTabScrollInteraction.1
            @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                Object objAwaitEachGesture = ForEachGesture.awaitEachGesture(pointerInputScope, new AnonymousClass1(new Ref.BooleanRef(), accountTabScrollInteractions, null), continuation);
                return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
            }

            /* compiled from: AccountTabScrollInteractions.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabScrollInteractionsKt$accountTabScrollInteraction$1$1", m3645f = "AccountTabScrollInteractions.kt", m3646l = {67, 76}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.redesigninvesting.interactions.scrolling.AccountTabScrollInteractionsKt$accountTabScrollInteraction$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Ref.BooleanRef $isCurrentlyScrolling;
                final /* synthetic */ AccountTabScrollInteractions $scrollInteraction;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Ref.BooleanRef booleanRef, AccountTabScrollInteractions accountTabScrollInteractions, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$isCurrentlyScrolling = booleanRef;
                    this.$scrollInteraction = accountTabScrollInteractions;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isCurrentlyScrolling, this.$scrollInteraction, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
                
                    if (r11 != r0) goto L20;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:30:0x0088, code lost:
                
                    r11 = r7.$isCurrentlyScrolling;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:31:0x008c, code lost:
                
                    if (r11.element == false) goto L44;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:32:0x008e, code lost:
                
                    r11.element = false;
                    r7.$scrollInteraction.onInnerElementScrollStateChanged(false);
                 */
                /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x00b5  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0059 -> B:20:0x005c). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    AnonymousClass1 anonymousClass1;
                    AwaitPointerEventScope awaitPointerEventScope;
                    List<PointerInputChange> changes;
                    Iterator<T> it;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                        PointerEventPass pointerEventPass = PointerEventPass.Initial;
                        this.L$0 = awaitPointerEventScope2;
                        this.label = 1;
                        anonymousClass1 = this;
                        if (TapGestureDetector4.awaitFirstDown$default(awaitPointerEventScope2, false, pointerEventPass, anonymousClass1, 1, null) != coroutine_suspended) {
                            awaitPointerEventScope = awaitPointerEventScope2;
                        }
                        return coroutine_suspended;
                    }
                    if (i == 1) {
                        awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        anonymousClass1 = this;
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        anonymousClass1 = this;
                        PointerEvent pointerEvent = (PointerEvent) obj;
                        List<PointerInputChange> changes2 = pointerEvent.getChanges();
                        if ((changes2 instanceof Collection) && changes2.isEmpty()) {
                            changes = pointerEvent.getChanges();
                            if (changes instanceof Collection) {
                                it = changes.iterator();
                                while (it.hasNext()) {
                                }
                                return Unit.INSTANCE;
                            }
                        } else {
                            Iterator<T> it2 = changes2.iterator();
                            while (it2.hasNext()) {
                                if (PointerEventKt.changedToUpIgnoreConsumed((PointerInputChange) it2.next())) {
                                    break;
                                }
                            }
                            changes = pointerEvent.getChanges();
                            if ((changes instanceof Collection) || !changes.isEmpty()) {
                                it = changes.iterator();
                                while (it.hasNext()) {
                                    if (((PointerInputChange) it.next()).getPressed()) {
                                    }
                                }
                            }
                            return Unit.INSTANCE;
                        }
                        PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
                        anonymousClass1.L$0 = awaitPointerEventScope;
                        anonymousClass1.label = 2;
                        obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass2, this);
                    }
                    Ref.BooleanRef booleanRef = anonymousClass1.$isCurrentlyScrolling;
                    if (!booleanRef.element) {
                        booleanRef.element = true;
                        anonymousClass1.$scrollInteraction.onInnerElementScrollStateChanged(true);
                    }
                    PointerEventPass pointerEventPass22 = PointerEventPass.Initial;
                    anonymousClass1.L$0 = awaitPointerEventScope;
                    anonymousClass1.label = 2;
                    obj = awaitPointerEventScope.awaitPointerEvent(pointerEventPass22, this);
                }
            }
        });
    }
}
