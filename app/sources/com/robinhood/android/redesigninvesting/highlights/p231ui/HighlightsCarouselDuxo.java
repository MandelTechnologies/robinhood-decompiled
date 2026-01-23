package com.robinhood.android.redesigninvesting.highlights.p231ui;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import com.robinhood.android.redesigninvesting.highlights.HighlightsManager;
import com.robinhood.android.redesigninvesting.highlights.models.HighlightCard;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: HighlightsCarouselDuxo.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0002\u0014\u0015B)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/highlights/ui/HighlightsCarouselDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/redesigninvesting/highlights/ui/HighlightsCarouselDataState;", "Lcom/robinhood/android/redesigninvesting/highlights/ui/HighlightsCarouselViewState;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/android/redesigninvesting/highlights/ui/HighlightsCarouselDuxo$InitArgs;", "highlightsManager", "Lcom/robinhood/android/redesigninvesting/highlights/HighlightsManager;", "stateProvider", "Lcom/robinhood/android/redesigninvesting/highlights/ui/HighlightsCarouselStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/redesigninvesting/highlights/HighlightsManager;Lcom/robinhood/android/redesigninvesting/highlights/ui/HighlightsCarouselStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "bind", "Lkotlinx/coroutines/Job;", "InitArgs", "Companion", "lib-highlights-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class HighlightsCarouselDuxo extends BaseDuxo<HighlightsCarouselDataState, HighlightsCarouselViewState> implements HasArgs<InitArgs> {
    private final HighlightsManager highlightsManager;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasArgs
    public InitArgs getArgs(SavedStateHandle savedStateHandle) {
        return (InitArgs) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HighlightsCarouselDuxo(HighlightsManager highlightsManager, HighlightsCarouselDuxo3 stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new HighlightsCarouselDataState(null, 1, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(highlightsManager, "highlightsManager");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.highlightsManager = highlightsManager;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: HighlightsCarouselDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCarouselDuxo$bind$1", m3645f = "HighlightsCarouselDuxo.kt", m3646l = {40}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCarouselDuxo$bind$1 */
    static final class C264941 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C264941(Continuation<? super C264941> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C264941 c264941 = HighlightsCarouselDuxo.this.new C264941(continuation);
            c264941.L$0 = obj;
            return c264941;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C264941) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<List<HighlightCard>> flowStreamHighlights = HighlightsCarouselDuxo.this.highlightsManager.streamHighlights((CoroutineScope) this.L$0, ((InitArgs) HighlightsCarouselDuxo.INSTANCE.getArgs((HasArgs) HighlightsCarouselDuxo.this)).getAccountNumber());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(HighlightsCarouselDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamHighlights, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: HighlightsCarouselDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "highlights", "", "Lcom/robinhood/android/redesigninvesting/highlights/models/HighlightCard;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCarouselDuxo$bind$1$1", m3645f = "HighlightsCarouselDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCarouselDuxo$bind$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<List<? extends HighlightCard>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ HighlightsCarouselDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(HighlightsCarouselDuxo highlightsCarouselDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = highlightsCarouselDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(List<? extends HighlightCard> list, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: HighlightsCarouselDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/redesigninvesting/highlights/ui/HighlightsCarouselDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCarouselDuxo$bind$1$1$1", m3645f = "HighlightsCarouselDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.redesigninvesting.highlights.ui.HighlightsCarouselDuxo$bind$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C504941 extends ContinuationImpl7 implements Function2<HighlightsCarouselDataState, Continuation<? super HighlightsCarouselDataState>, Object> {
                final /* synthetic */ List<HighlightCard> $highlights;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C504941(List<? extends HighlightCard> list, Continuation<? super C504941> continuation) {
                    super(2, continuation);
                    this.$highlights = list;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C504941 c504941 = new C504941(this.$highlights, continuation);
                    c504941.L$0 = obj;
                    return c504941;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(HighlightsCarouselDataState highlightsCarouselDataState, Continuation<? super HighlightsCarouselDataState> continuation) {
                    return ((C504941) create(highlightsCarouselDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((HighlightsCarouselDataState) this.L$0).copy(this.$highlights);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C504941((List) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final Job bind() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C264941(null), 3, null);
    }

    /* compiled from: HighlightsCarouselDuxo.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/highlights/ui/HighlightsCarouselDuxo$InitArgs;", "Landroid/os/Parcelable;", "accountNumber", "", "<init>", "(Ljava/lang/String;)V", "getAccountNumber", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-highlights-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InitArgs implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<InitArgs> CREATOR = new Creator();
        private final String accountNumber;

        /* compiled from: HighlightsCarouselDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<InitArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InitArgs(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs[] newArray(int i) {
                return new InitArgs[i];
            }
        }

        public static /* synthetic */ InitArgs copy$default(InitArgs initArgs, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = initArgs.accountNumber;
            }
            return initArgs.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final InitArgs copy(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            return new InitArgs(accountNumber);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InitArgs) && Intrinsics.areEqual(this.accountNumber, ((InitArgs) other).accountNumber);
        }

        public int hashCode() {
            return this.accountNumber.hashCode();
        }

        public String toString() {
            return "InitArgs(accountNumber=" + this.accountNumber + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
        }

        public InitArgs(String accountNumber) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: HighlightsCarouselDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/highlights/ui/HighlightsCarouselDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/android/redesigninvesting/highlights/ui/HighlightsCarouselDuxo;", "Lcom/robinhood/android/redesigninvesting/highlights/ui/HighlightsCarouselDuxo$InitArgs;", "<init>", "()V", "lib-highlights-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<HighlightsCarouselDuxo, InitArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public InitArgs getArgs(SavedStateHandle savedStateHandle) {
            return (InitArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public InitArgs getArgs(HighlightsCarouselDuxo highlightsCarouselDuxo) {
            return (InitArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, highlightsCarouselDuxo);
        }
    }
}
