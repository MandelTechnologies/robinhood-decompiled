package com.squareup.workflow1.p415ui;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import com.robinhood.models.p320db.KaizenExperiment;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Job;

/* compiled from: TextControllerControlEditText.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a+\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00010\tH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m3636d2 = {KaizenExperiment.VARIATION_CONTROL, "", "Lcom/squareup/workflow1/ui/TextController;", "view", "Landroid/widget/EditText;", "listenForTextChangesUntilCancelled", "", "Landroid/widget/TextView;", "handler", "Lkotlin/Function1;", "", "(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "wf1-core-android"}, m3637k = 2, m3638mv = {1, 6, 0}, m3640xi = 48)
/* renamed from: com.squareup.workflow1.ui.TextControllerControlEditTextKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class TextControllerControlEditText {

    /* compiled from: TextControllerControlEditText.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 6, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.squareup.workflow1.ui.TextControllerControlEditTextKt", m3645f = "TextControllerControlEditText.kt", m3646l = {91}, m3647m = "listenForTextChangesUntilCancelled")
    /* renamed from: com.squareup.workflow1.ui.TextControllerControlEditTextKt$listenForTextChangesUntilCancelled$1 */
    static final class C424891 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C424891(Continuation<? super C424891> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TextControllerControlEditText.listenForTextChangesUntilCancelled(null, null, this);
        }
    }

    public static final void control(TextController textController, EditText view) {
        Job subscription;
        Intrinsics.checkNotNullParameter(textController, "<this>");
        Intrinsics.checkNotNullParameter(view, "view");
        Object tag = view.getTag(R$id.text_controller_rendering);
        TextControllerControlEditText5 textControllerControlEditText5 = tag instanceof TextControllerControlEditText5 ? (TextControllerControlEditText5) tag : null;
        if ((textControllerControlEditText5 == null ? null : textControllerControlEditText5.getController()) == textController && textControllerControlEditText5.getSubscription().isActive()) {
            return;
        }
        if (textControllerControlEditText5 != null && (subscription = textControllerControlEditText5.getSubscription()) != null) {
            Job.DefaultImpls.cancel$default(subscription, null, 1, null);
        }
        view.setText(textController.getTextValue());
        view.setTag(R$id.text_controller_rendering, new TextControllerControlEditText5(textController, ViewLaunchWhenAttached3.launchWhenAttached$default(view, null, new TextControllerControlEditText2(textController, view, null), 1, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.text.TextWatcher, com.squareup.workflow1.ui.TextControllerControlEditTextKt$listenForTextChangesUntilCancelled$2$textWatcher$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object listenForTextChangesUntilCancelled(final TextView textView, final Function1<? super CharSequence, Unit> function1, Continuation<?> continuation) {
        C424891 c424891;
        if (continuation instanceof C424891) {
            c424891 = (C424891) continuation;
            int i = c424891.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c424891.label = i - Integer.MIN_VALUE;
            } else {
                c424891 = new C424891(continuation);
            }
        }
        Object obj = c424891.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c424891.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            c424891.L$0 = textView;
            c424891.L$1 = function1;
            c424891.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(c424891), 1);
            cancellableContinuationImpl.initCancellability();
            final ?? r2 = new TextWatcher() { // from class: com.squareup.workflow1.ui.TextControllerControlEditTextKt$listenForTextChangesUntilCancelled$2$textWatcher$1
                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable s) {
                    Intrinsics.checkNotNullParameter(s, "s");
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    function1.invoke(s);
                }
            };
            textView.addTextChangedListener(r2);
            cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: com.squareup.workflow1.ui.TextControllerControlEditTextKt$listenForTextChangesUntilCancelled$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    textView.removeTextChangedListener(r2);
                }
            });
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbes.probeCoroutineSuspended(c424891);
            }
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i2 == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        throw new ExceptionsH();
    }
}
