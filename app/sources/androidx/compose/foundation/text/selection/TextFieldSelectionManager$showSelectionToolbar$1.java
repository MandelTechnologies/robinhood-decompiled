package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.internal.ClipboardUtils_androidKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.p011ui.platform.ClipEntry;
import androidx.compose.p011ui.platform.Clipboard;
import androidx.compose.p011ui.platform.TextToolbar;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.input.VisualTransformation2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* compiled from: TextFieldSelectionManager.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1", m3645f = "TextFieldSelectionManager.kt", m3646l = {781}, m3647m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TextFieldSelectionManager$showSelectionToolbar$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextFieldSelectionManager$showSelectionToolbar$1(TextFieldSelectionManager textFieldSelectionManager, Continuation<? super TextFieldSelectionManager$showSelectionToolbar$1> continuation) {
        super(2, continuation);
        this.this$0 = textFieldSelectionManager;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TextFieldSelectionManager$showSelectionToolbar$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TextFieldSelectionManager$showSelectionToolbar$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010f  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        LegacyTextFieldState state;
        Function0<Unit> function0;
        Function0<Unit> function02;
        Function0<Unit> function03;
        Function0<Unit> function04;
        Function0<Unit> function05;
        TextToolbar textToolbar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        boolean z = false;
        Function0<Unit> function06 = null;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.this$0.getEnabled() || ((state = this.this$0.getState()) != null && !state.isInTouchMode())) {
                return Unit.INSTANCE;
            }
            boolean z2 = this.this$0.getVisualTransformation() instanceof VisualTransformation2;
            if (TextRange.m7640getCollapsedimpl(this.this$0.getValue$foundation_release().getSelection()) || z2) {
                function0 = null;
            } else {
                final TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                function0 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$copy$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* compiled from: TextFieldSelectionManager.kt */
                    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$copy$1$1", m3645f = "TextFieldSelectionManager.kt", m3646l = {}, m3647m = "invokeSuspend")
                    /* renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$copy$1$1 */
                    static final class C14411 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        int label;
                        final /* synthetic */ TextFieldSelectionManager this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C14411(TextFieldSelectionManager textFieldSelectionManager, Continuation<? super C14411> continuation) {
                            super(2, continuation);
                            this.this$0 = textFieldSelectionManager;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C14411(this.this$0, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((C14411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            TextFieldSelectionManager.copy$foundation_release$default(this.this$0, false, 1, null);
                            return Unit.INSTANCE;
                        }
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        CoroutineScope coroutineScope = textFieldSelectionManager.getCoroutineScope();
                        if (coroutineScope != null) {
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new C14411(textFieldSelectionManager, null), 1, null);
                        }
                        textFieldSelectionManager.hideSelectionToolbar$foundation_release();
                    }
                };
            }
            if (TextRange.m7640getCollapsedimpl(this.this$0.getValue$foundation_release().getSelection()) || !this.this$0.getEditable() || z2) {
                function02 = null;
            } else {
                final TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
                function02 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$cut$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* compiled from: TextFieldSelectionManager.kt */
                    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$cut$1$1", m3645f = "TextFieldSelectionManager.kt", m3646l = {}, m3647m = "invokeSuspend")
                    /* renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$cut$1$1 */
                    static final class C14421 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        int label;
                        final /* synthetic */ TextFieldSelectionManager this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C14421(TextFieldSelectionManager textFieldSelectionManager, Continuation<? super C14421> continuation) {
                            super(2, continuation);
                            this.this$0 = textFieldSelectionManager;
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C14421(this.this$0, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((C14421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            this.this$0.cut$foundation_release();
                            return Unit.INSTANCE;
                        }
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        CoroutineScope coroutineScope = textFieldSelectionManager2.getCoroutineScope();
                        if (coroutineScope != null) {
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new C14421(textFieldSelectionManager2, null), 1, null);
                        }
                        textFieldSelectionManager2.hideSelectionToolbar$foundation_release();
                    }
                };
            }
            if (this.this$0.getEditable()) {
                Clipboard clipboard = this.this$0.getClipboard();
                if (clipboard != null) {
                    this.L$0 = function0;
                    this.L$1 = function02;
                    this.label = 1;
                    Object clipEntry = clipboard.getClipEntry(this);
                    if (clipEntry == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    function03 = function02;
                    obj = clipEntry;
                }
                if (!z) {
                    final TextFieldSelectionManager textFieldSelectionManager3 = this.this$0;
                    function04 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$paste$1
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* compiled from: TextFieldSelectionManager.kt */
                        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$paste$1$1", m3645f = "TextFieldSelectionManager.kt", m3646l = {}, m3647m = "invokeSuspend")
                        /* renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$paste$1$1 */
                        static final class C14431 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            int label;
                            final /* synthetic */ TextFieldSelectionManager this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C14431(TextFieldSelectionManager textFieldSelectionManager, Continuation<? super C14431> continuation) {
                                super(2, continuation);
                                this.this$0 = textFieldSelectionManager;
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                return new C14431(this.this$0, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                return ((C14431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                if (this.label != 0) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                                this.this$0.paste$foundation_release();
                                return Unit.INSTANCE;
                            }
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            CoroutineScope coroutineScope = textFieldSelectionManager3.getCoroutineScope();
                            if (coroutineScope != null) {
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new C14431(textFieldSelectionManager3, null), 1, null);
                            }
                            textFieldSelectionManager3.hideSelectionToolbar$foundation_release();
                        }
                    };
                }
                Function0<Unit> function07 = function02;
                Function0<Unit> function08 = function0;
                if (TextRange.m7642getLengthimpl(this.this$0.getValue$foundation_release().getSelection()) != this.this$0.getValue$foundation_release().getText().length()) {
                    final TextFieldSelectionManager textFieldSelectionManager4 = this.this$0;
                    function05 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$selectAll$1
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            textFieldSelectionManager4.selectAll$foundation_release();
                        }
                    };
                } else {
                    function05 = null;
                }
                if (this.this$0.getEditable() && TextRange.m7640getCollapsedimpl(this.this$0.getValue$foundation_release().getSelection())) {
                    final TextFieldSelectionManager textFieldSelectionManager5 = this.this$0;
                    function06 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$autofill$1
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            textFieldSelectionManager5.autofill$foundation_release();
                        }
                    };
                }
                Function0<Unit> function09 = function06;
                textToolbar = this.this$0.getTextToolbar();
                if (textToolbar != null) {
                    textToolbar.showMenu(this.this$0.getContentRect(), function08, function04, function07, function05, function09);
                }
                return Unit.INSTANCE;
            }
            function04 = null;
            Function0<Unit> function072 = function02;
            Function0<Unit> function082 = function0;
            if (TextRange.m7642getLengthimpl(this.this$0.getValue$foundation_release().getSelection()) != this.this$0.getValue$foundation_release().getText().length()) {
            }
            if (this.this$0.getEditable()) {
                final TextFieldSelectionManager textFieldSelectionManager52 = this.this$0;
                function06 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$1$autofill$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        textFieldSelectionManager52.autofill$foundation_release();
                    }
                };
            }
            Function0<Unit> function092 = function06;
            textToolbar = this.this$0.getTextToolbar();
            if (textToolbar != null) {
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        function03 = (Function0) this.L$1;
        function0 = (Function0) this.L$0;
        ResultKt.throwOnFailure(obj);
        ClipEntry clipEntry2 = (ClipEntry) obj;
        if (clipEntry2 == null || !ClipboardUtils_androidKt.hasText(clipEntry2)) {
            function02 = function03;
        } else {
            function02 = function03;
            z = true;
        }
        if (!z) {
            function04 = null;
        }
        Function0<Unit> function0722 = function02;
        Function0<Unit> function0822 = function0;
        if (TextRange.m7642getLengthimpl(this.this$0.getValue$foundation_release().getSelection()) != this.this$0.getValue$foundation_release().getText().length()) {
        }
        if (this.this$0.getEditable()) {
        }
        Function0<Unit> function0922 = function06;
        textToolbar = this.this$0.getTextToolbar();
        if (textToolbar != null) {
        }
        return Unit.INSTANCE;
    }
}
