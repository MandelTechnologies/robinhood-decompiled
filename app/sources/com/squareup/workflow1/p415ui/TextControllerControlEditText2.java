package com.squareup.workflow1.p415ui;

import android.widget.EditText;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: TextControllerControlEditText.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 6, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.squareup.workflow1.ui.TextControllerControlEditTextKt$control$subscription$1", m3645f = "TextControllerControlEditText.kt", m3646l = {47}, m3647m = "invokeSuspend")
/* renamed from: com.squareup.workflow1.ui.TextControllerControlEditTextKt$control$subscription$1, reason: use source file name */
/* loaded from: classes12.dex */
final class TextControllerControlEditText2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TextController $this_control;
    final /* synthetic */ EditText $view;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextControllerControlEditText2(TextController textController, EditText editText, Continuation<? super TextControllerControlEditText2> continuation) {
        super(2, continuation);
        this.$this_control = textController;
        this.$view = editText;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TextControllerControlEditText2 textControllerControlEditText2 = new TextControllerControlEditText2(this.$this_control, this.$view, continuation);
        textControllerControlEditText2.L$0 = obj;
        return textControllerControlEditText2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TextControllerControlEditText2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowKt.launchIn(FlowKt.onEach(this.$this_control.getOnTextChanged(), new C424871(this.$view, null)), (CoroutineScope) this.L$0);
            EditText editText = this.$view;
            final TextController textController = this.$this_control;
            Function1<CharSequence, Unit> function1 = new Function1<CharSequence, Unit>() { // from class: com.squareup.workflow1.ui.TextControllerControlEditTextKt$control$subscription$1.2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
                    invoke2(charSequence);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(CharSequence charSequence) {
                    TextController textController2 = textController;
                    String string2 = charSequence == null ? null : charSequence.toString();
                    if (string2 == null) {
                        string2 = "";
                    }
                    textController2.setTextValue(string2);
                }
            };
            this.label = 1;
            if (TextControllerControlEditText.listenForTextChangesUntilCancelled(editText, function1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        throw new ExceptionsH();
    }

    /* compiled from: TextControllerControlEditText.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, m3636d2 = {"<anonymous>", "", "textValue", ""}, m3637k = 3, m3638mv = {1, 6, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.squareup.workflow1.ui.TextControllerControlEditTextKt$control$subscription$1$1", m3645f = "TextControllerControlEditText.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.squareup.workflow1.ui.TextControllerControlEditTextKt$control$subscription$1$1 */
    static final class C424871 extends ContinuationImpl7 implements Function2<String, Continuation<? super Unit>, Object> {
        final /* synthetic */ EditText $view;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C424871(EditText editText, Continuation<? super C424871> continuation) {
            super(2, continuation);
            this.$view = editText;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C424871 c424871 = new C424871(this.$view, continuation);
            c424871.L$0 = obj;
            return c424871;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((C424871) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String str = (String) this.L$0;
            if (!Intrinsics.areEqual(str, this.$view.getText().toString())) {
                this.$view.setText(str);
            }
            return Unit.INSTANCE;
        }
    }
}
