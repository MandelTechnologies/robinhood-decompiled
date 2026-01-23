package com.robinhood.android.matcha.p177ui.memo;

import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextRange2;
import androidx.compose.p011ui.text.input.TextFieldValue;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.store.matcha.MemoBanListStore;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MemoInputDuxo.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001bB)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0018J\u0006\u0010\u001a\u001a\u00020\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/memo/MemoInputDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/matcha/ui/memo/MemoInputDataState;", "Lcom/robinhood/android/matcha/ui/memo/MemoInputViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "banListStore", "Lcom/robinhood/android/store/matcha/MemoBanListStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/matcha/ui/memo/MemoInputStateProvider;", "<init>", "(Lcom/robinhood/android/store/matcha/MemoBanListStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/matcha/ui/memo/MemoInputStateProvider;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "updateMemo", MemoInputActivity.EXTRA_MEMO, "Landroidx/compose/ui/text/input/TextFieldValue;", "addEmoji", AnalyticsStrings.BUTTON_DESCRIPTION_LIST_EMOJI, "", "validateMemo", "dismissValidationError", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MemoInputDuxo extends BaseDuxo<MemoInputDataState, MemoInputViewState> implements HasSavedState {
    private final MemoBanListStore banListStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MemoInputDuxo(MemoBanListStore banListStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, MemoInputStateProvider stateProvider) {
        Intrinsics.checkNotNullParameter(banListStore, "banListStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Companion companion = INSTANCE;
        String memo = ((Args) companion.getArgs(savedStateHandle)).getMemo();
        String str = memo == null ? "" : memo;
        super(new MemoInputDataState(new TextFieldValue(str, TextRange2.TextRange(str.length()), (TextRange) null, 4, (DefaultConstructorMarker) null), ((Args) companion.getArgs(savedStateHandle)).getUsername(), false, false, null, 28, null), stateProvider, duxoBundle);
        this.banListStore = banListStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        this.banListStore.refresh();
    }

    /* compiled from: MemoInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/memo/MemoInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.memo.MemoInputDuxo$updateMemo$1", m3645f = "MemoInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.memo.MemoInputDuxo$updateMemo$1 */
    static final class C214031 extends ContinuationImpl7 implements Function2<MemoInputDataState, Continuation<? super MemoInputDataState>, Object> {
        final /* synthetic */ TextFieldValue $memo;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C214031(TextFieldValue textFieldValue, Continuation<? super C214031> continuation) {
            super(2, continuation);
            this.$memo = textFieldValue;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C214031 c214031 = new C214031(this.$memo, continuation);
            c214031.L$0 = obj;
            return c214031;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MemoInputDataState memoInputDataState, Continuation<? super MemoInputDataState> continuation) {
            return ((C214031) create(memoInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return MemoInputDataState.copy$default((MemoInputDataState) this.L$0, this.$memo, null, false, false, null, 30, null);
        }
    }

    public final void updateMemo(TextFieldValue memo) {
        Intrinsics.checkNotNullParameter(memo, "memo");
        applyMutation(new C214031(memo, null));
    }

    /* compiled from: MemoInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/memo/MemoInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.memo.MemoInputDuxo$addEmoji$1", m3645f = "MemoInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.memo.MemoInputDuxo$addEmoji$1 */
    static final class C214011 extends ContinuationImpl7 implements Function2<MemoInputDataState, Continuation<? super MemoInputDataState>, Object> {
        final /* synthetic */ String $emoji;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C214011(String str, Continuation<? super C214011> continuation) {
            super(2, continuation);
            this.$emoji = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C214011 c214011 = new C214011(this.$emoji, continuation);
            c214011.L$0 = obj;
            return c214011;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MemoInputDataState memoInputDataState, Continuation<? super MemoInputDataState> continuation) {
            return ((C214011) create(memoInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MemoInputDataState memoInputDataState = (MemoInputDataState) this.L$0;
            return MemoInputDataState.copy$default(memoInputDataState, memoInputDataState.addEmoji(this.$emoji), null, false, false, null, 30, null);
        }
    }

    public final void addEmoji(String emoji) {
        Intrinsics.checkNotNullParameter(emoji, "emoji");
        applyMutation(new C214011(emoji, null));
    }

    /* compiled from: MemoInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/memo/MemoInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.memo.MemoInputDuxo$validateMemo$1", m3645f = "MemoInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.memo.MemoInputDuxo$validateMemo$1 */
    static final class C214041 extends ContinuationImpl7 implements Function2<MemoInputDataState, Continuation<? super MemoInputDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C214041(Continuation<? super C214041> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C214041 c214041 = new C214041(continuation);
            c214041.L$0 = obj;
            return c214041;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MemoInputDataState memoInputDataState, Continuation<? super MemoInputDataState> continuation) {
            return ((C214041) create(memoInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return MemoInputDataState.copy$default((MemoInputDataState) this.L$0, null, null, true, false, null, 27, null);
        }
    }

    public final void validateMemo(String memo) {
        Intrinsics.checkNotNullParameter(memo, "memo");
        applyMutation(new C214041(null));
        LifecycleHost.DefaultImpls.bind$default(this, this.banListStore.containsBannedWord(memo), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.matcha.ui.memo.MemoInputDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MemoInputDuxo.validateMemo$lambda$1(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit validateMemo$lambda$1(MemoInputDuxo memoInputDuxo, boolean z) {
        memoInputDuxo.applyMutation(new MemoInputDuxo2(z, null));
        return Unit.INSTANCE;
    }

    /* compiled from: MemoInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/memo/MemoInputDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.memo.MemoInputDuxo$dismissValidationError$1", m3645f = "MemoInputDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.memo.MemoInputDuxo$dismissValidationError$1 */
    static final class C214021 extends ContinuationImpl7 implements Function2<MemoInputDataState, Continuation<? super MemoInputDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C214021(Continuation<? super C214021> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C214021 c214021 = new C214021(continuation);
            c214021.L$0 = obj;
            return c214021;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MemoInputDataState memoInputDataState, Continuation<? super MemoInputDataState> continuation) {
            return ((C214021) create(memoInputDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return MemoInputDataState.copy$default((MemoInputDataState) this.L$0, null, null, false, false, null, 23, null);
        }
    }

    public final void dismissValidationError() {
        applyMutation(new C214021(null));
    }

    /* compiled from: MemoInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/memo/MemoInputDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/matcha/ui/memo/MemoInputDuxo;", "Lcom/robinhood/android/matcha/ui/memo/Args;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<MemoInputDuxo, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public Args getArgs(SavedStateHandle savedStateHandle) {
            return (Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public Args getArgs(MemoInputDuxo memoInputDuxo) {
            return (Args) DuxoCompanion.DefaultImpls.getArgs(this, memoInputDuxo);
        }
    }
}
